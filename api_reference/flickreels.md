# FlickReels API (bagahproject)

Base: `https://api.bagahproject.com/api/flickreels/...`
Auth: header `x-api-key: <key>` + query `apikey=<key>`
Prefix wajib `api/` (bukan `api/v1/`).

## Endpoints

| Endpoint              | Query                         | Fungsi                                  |
| --------------------- | ----------------------------- | --------------------------------------- |
| `flickreels/foryou`   | `page`, `lang`                | Feed personal                           |
| `flickreels/trending` | `lang`                        | Populer                                 |
| `flickreels/latest`   | `lang`                        | Rilisan baru — **rusak, selalu kosong** |
| `flickreels/rankings` | `lang`                        | Peringkat — **identik dengan trending** |
| `flickreels/search`   | `keyword`, `lang`             | Cari series                             |
| `flickreels/detail`   | `seriesId`, `lang`            | Detail + daftar chapter                 |
| `flickreels/episodes` | `seriesId`, `lang`            | Daftar episode                          |
| `flickreels/episode`  | `seriesId`, `episode`, `lang` | URL stream                              |

`lang` = `id` (Indonesia) / `en`.

## Bentuk Response

### `trending` / `foryou` / `rankings`

```json
{
  "success": true,
  "page": 1,
  "items": [
    {
      "id": "11694",
      "title": "Ujian Cinta Sejati (Dubbing)",
      "cover": "https://zshipubcf.farsunpteltd.com/playlet/....jpg",
      "description": "...",
      "totalEpisodes": 41,
      "views": "664.2K",
      "tags": ["Cinderella", "CEO/ Miliarder"]
    }
  ]
}
```

### `detail` — sudah termasuk chapter + URL stream

```json
{
  "success": true,
  "id": "11694",
  "title": "...",
  "cover": "...",
  "description": "...",
  "totalEpisodes": 41,
  "views": "2.0M",
  "tags": [],
  "chapters": [
    {
      "episodeNum": 1,
      "episodeId": "731652",
      "title": "Ujian Cinta Sejati (Dubbing)-EP.1",
      "locked": false,
      "bestUrl": "https://zshipricf.farsunpteltd.net/playlet-hls/....m3u8?verify=...",
      "duration": 170
    }
  ]
}
```

### `episodes` / `episode`

Struktur item sama dengan satu entri `chapters` di atas.

## Pagination

**Tidak ada.** Semua endpoint mengabaikan param `page`:

| Endpoint               | Hasil                                                  |
| ---------------------- | ------------------------------------------------------ |
| `foryou`               | `page` 1/2/3 mengembalikan id-set yang **sama persis** |
| `trending`, `rankings` | statis (42 item), `page` diabaikan                     |
| `search`               | `page` diabaikan                                       |
| `latest`               | selalu kosong (0 item)                                 |

Client sengaja **tidak** memasang infinite scroll untuk platform ini, dan tidak memakai
`latest`/`rankings` (rusak & duplikat). Hanya `trending` yang dipakai, dengan `foryou`
sebagai sumber cadangan.

## Pemutaran

- Format **HLS (.m3u8)** di `bestUrl` — Media3 ExoPlayer memutar langsung, **tanpa dekripsi**.
- `bestUrl` punya tanda tangan `?verify=...` yang berlaku sementara, jadi URL harus
  diambil saat akan diputar (tidak boleh di-cache lama).
- `detail.chapters` sudah memuat URL, jadi membuka detail tidak perlu request `episodes` terpisah.
- Terverifikasi: `c2.android.avc.decoder` aktif saat memutar.

## Catatan cacat data

- Item dengan `id` kosong dibuang sebelum dirender.
- Item tanpa `title` dirender "Tanpa Judul".
