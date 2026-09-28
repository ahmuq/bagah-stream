# ShortMax API (bagahproject)

Base: `https://api.bagahproject.com/api/shortmax/...`
Auth: header `x-api-key: <key>` + query `apikey=<key>`
Prefix wajib `api/` (bukan `api/v1/`).

## Endpoints

| Endpoint            | Query                             | Fungsi         |
| ------------------- | --------------------------------- | -------------- |
| `shortmax/foryou`   | `page`, `size`, `lang`            | Feed personal  |
| `shortmax/trending` | `page`, `lang`                    | Populer        |
| `shortmax/latest`   | `page`, `lang`                    | Rilisan baru   |
| `shortmax/rankings` | `page`, `lang`                    | Peringkat      |
| `shortmax/search`   | `keyword`, `page`, `size`, `lang` | Cari series    |
| `shortmax/detail`   | `seriesId`, `lang`                | Detail series  |
| `shortmax/episodes` | `seriesId`, `lang`                | Daftar episode |
| `shortmax/episode`  | `seriesId`, `episode`, `lang`     | URL stream     |

`lang` = `id` (Indonesia) / `en`.

## Bentuk Response

### `trending` / `latest` / `rankings` / `foryou`

```json
{
  "success": true,
  "title": "Populer",
  "page": 1,
  "items": [
    {
      "id": "21972",
      "seriesId": "21972",
      "series_id": "21972",
      "code": 851210,
      "title": "Kebangkitan Setelah Reinkarnasi",
      "description": "...",
      "cover": "https://volcengine-forward.shorttv.live/images/cover/....jpg?auth_key=...",
      "totalEpisodes": 30,
      "total_episodes": 30,
      "views": 485491,
      "tags": []
    }
  ]
}
```

### `episode` (stream)

```json
{
  "success": true,
  "episodeNum": 1,
  "episodeId": "581428",
  "seriesId": "8151",
  "title": "Tidur dengan Sahabat Suamiku",
  "locked": false,
  "video480": "https://volcengine-forward.shorttv.live/hls-encrypted/...._480/main.m3u8?auth_key=...",
  "video720": "https://volcengine-forward.shorttv.live/hls-encrypted/...._720/main.m3u8?auth_key=...",
  "video1080": "https://volcengine-forward.shorttv.live/hls-encrypted/...._1080/main.m3u8?auth_key=...",
  "bestUrl": "https://.../main.m3u8?auth_key=..."
}
```

## Pagination

| Endpoint                       | Hasil                                       |
| ------------------------------ | ------------------------------------------- |
| `shortmax/search`              | ✅ `page` berfungsi (page 2 → item berbeda) |
| `shortmax/foryou`              | ❌ `page` diabaikan (page 1/2/3 identik)    |
| `trending`/`latest`/`rankings` | ❌ statis (page diabaikan)                  |

Client memakai infinite scroll hanya untuk hasil `search`.

## Dekripsi Video (WAJIB untuk play)

ShortMax mengirim **HLS** dengan segmen `.ts` yang terenkripsi custom — bukan
`#EXT-X-KEY` standar. Setiap segmen:

1. Berukuran ≥ 1024 byte dan diawali magic `shortmax` (contoh header: `shortmax00000001`).
2. 1024 byte pertama adalah header teks:
   - byte **[16:20]** = offset kunci di dalam header
   - byte **[20:24]** = panjang data terenkripsi
3. Kunci 16 byte diambil pada offset tersebut (dalam bentuk ASCII di header).
4. Data terenkripsi = `data[1024 : 1024+enc_len]`, didekripsi **AES-128-CBC** dengan
   IV tetap `shortmax00000000`, lalu padding PKCS#7 dibuang.
5. Sisa byte setelah blok terenkripsi (`data[1024+enc_len:]`) adalah MPEG-TS biasa
   dan digabung kembali.

Contoh m3u8:

```
#EXTM3U
#EXT-X-VERSION:3
#EXT-X-PLAYLIST-TYPE:VOD
#EXTINF:10.000000,
main/segment-0.ts
```

Implementasi Kotlin ada di `data/player/ShortMaxDecryptDataSource.kt` — sebuah custom
Media3 `DataSource` yang mendekripsi tiap segmen saat dibaca, dipasang ke ExoPlayer
lewat `DefaultMediaSourceFactory(decryptFactory).setDataSourceFactory(...)`.

Terverifikasi: 8 segmen terdekripsi, hasilnya MPEG-TS valid (byte pertama `0x47`),
dan `c2.android.avc.decoder` aktif memutar.

## Catatan cacat data

- Detail `chapters` **tidak** memuat URL stream; daftar episode harus diambil dari
  `shortmax/episodes`.
- Item tanpa id dibuang; item tanpa title dirender "Tanpa Judul".
