# ReelShort API (bagahproject)

Base: `https://api.bagahproject.com/api/reelshort/...`
Auth: header `x-api-key: <key>` + query `apikey=<key>`
Prefix **wajib** `api/` (bukan `api/v1/`).

## Endpoints

| Endpoint             | Query                       | Fungsi                    |
| -------------------- | --------------------------- | ------------------------- |
| `reelshort/homepage` | `page`, `lang`              | Beranda (keyword + items) |
| `reelshort/trending` | `lang`                      | Sedang populer            |
| `reelshort/latest`   | `lang`                      | Rilisan terbaru           |
| `reelshort/foryou`   | `page`, `lang`              | Feed personal             |
| `reelshort/rankings` | `page`, `lang`              | Peringkat                 |
| `reelshort/search`   | `keyword`, `page`, `lang`   | Cari series               |
| `reelshort/detail`   | `bookId`, `lang`            | Detail + daftar chapter   |
| `reelshort/episodes` | `bookId`, `lang`            | Daftar episode            |
| `reelshort/episode`  | `bookId`, `episode`, `lang` | URL stream                |

`lang` = `id` (Indonesia) / `en`.

## Pagination

| Endpoint                                               | `page` didukung?                                                        |
| ------------------------------------------------------ | ----------------------------------------------------------------------- |
| `reelshort/search`                                     | ✅                                                                      |
| `reelshort/foryou`                                     | ⚠️ param diterima tapi mengulang isi halaman — client berhenti otomatis |
| `reelshort/homepage`, `trending`, `latest`, `rankings` | ❌ (tanpa param page)                                                   |

Client memakai infinite scroll dan berhenti otomatis bila halaman kosong / isinya tidak ada yang baru.

## Contoh Response

### `reelshort/trending` / `latest` / `foryou`

```json
{
  "success": true,
  "title": "Populer",
  "items": [
    {
      "id": "6aa69e2ff969ab813e03c177",
      "title": "Menolak Lima Pasangan Wanitaku",
      "cover": "https://v-img.crazymaplestudios.com/.../b3d67828-....jpg",
      "description": "Selama sepuluh tahun Caine ...",
      "totalEpisodes": 50,
      "tags": ["Laki-laki", "Penyesalan"]
    }
  ]
}
```

### `reelshort/detail`

```json
{
  "success": true,
  "id": "6aa69e2ff969ab813e03c177",
  "title": "Menolak Lima Pasangan Wanitaku",
  "cover": "https://...",
  "description": "...",
  "totalEpisodes": 50,
  "tags": ["Laki-laki", "Penyesalan"],
  "chapters": [
    {
      "episodeNum": 1,
      "chapterId": "zj2iojyw77",
      "title": "Episode 1",
      "locked": false,
      "serialNumber": "1"
    }
  ]
}
```

### `reelshort/episode` (stream)

```json
{
  "success": true,
  "bookId": "6aa69e2ff969ab813e03c177",
  "episodeNum": 1,
  "episodeId": "zj2iojyw77",
  "title": "Episode 1",
  "locked": false,
  "bestUrl": "https://v-mps.crazymaplestudios.com/.../....m3u8",
  "videoList": [
    {
      "url": "https://.../...-video-sd.m3u8",
      "quality": "720",
      "encode": "H265",
      "bitrate": 659
    },
    {
      "url": "https://.../...-ld.m3u8",
      "quality": "540",
      "encode": "H264",
      "bitrate": 999
    }
  ]
}
```

## Catatan Pemutaran

- Format **HLS (.m3u8)** — Media3 ExoPlayer memutar langsung, **tanpa dekripsi**.
- App memilih varian `encode == "H264"` lebih dulu demi kompatibilitas decoder hardware,
  fallback ke varian pertama yang punya URL, lalu ke `bestUrl`.
- Terverifikasi: `c2.android.avc.decoder` aktif saat memutar episode.
