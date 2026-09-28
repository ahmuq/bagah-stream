# FreeReels API (bagahproject)

Base: `https://api.bagahproject.com/api/freereels/...`
Auth: header `x-api-key: <key>` + query `apikey=<key>`
Prefix wajib `api/` (bukan `api/v1/`).

## Endpoints

| Endpoint             | Query                         | Fungsi                     |
| -------------------- | ----------------------------- | -------------------------- |
| `freereels/foryou`   | `next`, `lang`                | Feed personal (cursor)     |
| `freereels/trending` | `lang`                        | Populer (ber-section)      |
| `freereels/latest`   | `lang`                        | Rilisan baru (ber-section) |
| `freereels/anime`    | `lang`                        | Anime (ber-section)        |
| `freereels/tab`      | `tabKey`, `lang`              | Konten tab tertentu        |
| `freereels/search`   | `keyword`, `lang`             | Cari series                |
| `freereels/detail`   | `seriesId`, `lang`            | Detail series              |
| `freereels/episodes` | `seriesId`, `lang`            | Daftar episode             |
| `freereels/episode`  | `seriesId`, `episode`, `lang` | URL stream                 |

`tabKey`: `503` = Populer, `505` = New, `547` = Anime.
`lang` = `id` (Indonesia) / `en`.

## Bentuk Response

### `trending` / `latest` / `anime` / `tab` — ber-section

```json
{
  "success": true,
  "tabKey": "503",
  "sections": [
    {
      "title": "Pilihan Populer",
      "moduleKey": "1036",
      "items": [
        {
          "seriesId": "...",
          "key": "...",
          "title": "...",
          "cover": "...",
          "totalEpisodes": 79,
          "views": 22828,
          "free": true
        }
      ]
    }
  ]
}
```

### `foryou` — feed datar + cursor

```json
{
  "success": true,
  "offset": 0,
  "next": "offset=10",
  "items": [
    { "seriesId": "...", "title": "...", "cover": "...", "totalEpisodes": 79 }
  ]
}
```

### `detail`

```json
{
  "success": true,
  "seriesId": "gdaLIaclg0",
  "title": "...",
  "description": "...",
  "cover": "...",
  "totalEpisodes": 79,
  "views": 22828,
  "payMode": "IAA",
  "free": true
}
```

### `episodes`

```json
{
  "success": true,
  "seriesId": "gdaLIaclg0",
  "items": [
    {
      "episodeId": "s6wo2JmZ4E",
      "episodeNum": 1,
      "title": "...",
      "locked": false,
      "bestUrl": "https://video-v6.mydramawave.com/vt/....m3u8",
      "duration": 187,
      "videoType": "free"
    }
  ]
}
```

### `episode` (stream)

Sama seperti satu item di `episodes`, `bestUrl` langsung bisa diputar.

## Pagination

| Endpoint                          | Mekanisme                                                                                                                                                        |
| --------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `freereels/foryou`                | ✅ **cursor**: ambil field `next` dari response, kirim sebagai query `next` di request berikutnya. Parameter `offset` manual **diabaikan** — wajib pakai cursor. |
| `freereels/search`                | ❌ (tanpa param page yang berfungsi)                                                                                                                             |
| `trending`/`latest`/`anime`/`tab` | ❌ (statis)                                                                                                                                                      |

Client memakai infinite scroll dan berhenti bila `next` kosong atau tidak ada item baru.

## Pemutaran

- Format **HLS (.m3u8)** di `bestUrl` — Media3 ExoPlayer memutar langsung, **tanpa dekripsi**.
- Terverifikasi: `c2.android.avc.decoder` aktif saat memutar.

## Catatan cacat data

- Sebagian item di `search` mengirim `title` kosong. Client menampilkan "Tanpa Judul"
  agar tidak muncul kartu tanpa teks.
- Item dengan `seriesId` kosong dibuang sebelum dirender.
