# FreeReels API (bagahproject)

Base: `https://api.bagahproject.com/api/freereels/...`
Auth: header `x-api-key: <key>` (query `apikey=<key>` juga diterima).
Prefix **wajib** `api/` (bukan `api/v1/`).
Spec: `https://api.bagahproject.com/api/v1/openapi.json`.

> Diperbarui 2026-09-30: API memakai endpoint terpadu `browse`. Endpoint lama
> `foryou`, `trending`, `latest`, `anime`, `tab`, dan `episodes` dihapus.
> Seluruh field kini **snake_case**, dan bahasa default berubah ke `id-ID`.

## Endpoints

| Endpoint              | Query                              | Fungsi                     |
| --------------------- | ---------------------------------- | -------------------------- |
| `freereels/browse`    | `tab`, `pages`, `cursor`, `lang`   | Feed per tab (cursor)      |
| `freereels/detail`    | `seriesId`, `lang`                 | Detail + **semua episode** |
| `freereels/episode`   | `seriesId`, `episode`, `lang`      | URL stream satu episode    |
| `freereels/search`    | `keyword`, `tab`, `cursor`, `lang` | Cari series                |

`tab` = `foryou` \| `503` (Populer) \| `505` (New) \| `547` (Anime) \| `622` \| `516` \| `504` \| `506`.
`lang` = `id-ID` \| `en-US` \| `es-MX` \| `pt-BR` \| `zh-CN`.

## Bentuk Response

### Item (dipakai semua listing)

```json
{
  "id": "PXWFnymAc0",
  "series_id": "PXWFnymAc0",
  "key": "PXWFnymAc0",
  "title": "Dia Meninggalkanku? Aku Malah Menikahi CEO(Sulih Suara)",
  "cover": "https://static-v1.mydramawave.com/vt/prod/cover/....jpg",
  "description": "...",
  "total_episodes": 80,
  "views": 0,
  "followers": 217014,
  "comments": 18983,
  "free": true,
  "pay_index": 10000,
  "tags": ["Gratis"],
  "operation_tags": [
    { "text": "Dubbing", "text_color": "#FFFFFF", "bg_start": "#F47040", "bg_end": "#F52067", "tag_type": "" }
  ],
  "episode": null
}
```

### `tab=foryou` (datar + cursor)

```json
{
  "success": true,
  "tab": "foryou",
  "tab_name": "For You Feed",
  "pages_fetched": 1,
  "cursor": "offset=10",
  "has_more": true,
  "items": [ { "id": "PXWFnymAc0", "title": "..." } ]
}
```

### `tab=503` / `505` / `547` / `<tab lain>` (datar + ber-section)

```json
{
  "success": true,
  "tab_key": "503",
  "tab_name": "Populer",
  "module_key": "1036",
  "pages_fetched": 1,
  "cursor": "offset=10&position_index=10000",
  "has_more": true,
  "items": [ { "id": "TxCz3hQFxJ", "title": "..." } ],
  "sections": [
    {
      "module_key": "1036",
      "module_name": "Pilihan Populer",
      "module_type": "recommend",
      "scrollable": true,
      "cursor": "offset=10&position_index=10000",
      "has_more": true,
      "items": [ { "id": "TxCz3hQFxJ", "title": "..." } ]
    }
  ]
}
```

Pada tab angka, `items` tingkat atas berisi item dan `sections` mengelompokkannya.
Item dapat menyertakan `episode` yang sudah memuat `best_url`.

### `freereels/detail` (metadata + **semua episode** di `items`)

```json
{
  "success": true,
  "id": "PXWFnymAc0",
  "series_id": "PXWFnymAc0",
  "key": "PXWFnymAc0",
  "title": "...",
  "cover": "https://...",
  "description": "...",
  "total_episodes": 80,
  "views": 22716974,
  "followers": 217015,
  "comments": 18983,
  "free": true,
  "pay_mode": "IAA",
  "pay_index": 10000,
  "finish_status": 2,
  "update_count": 80,
  "tags": ["Gratis"],
  "operation_tags": [ { "text": "Dubbing", "text_color": "#FFFFFF" } ],
  "episode": { "episode_id": "UTPzVhIQDn", "episode_num": 1, "best_url": "https://...m3u8" },
  "items": [
    {
      "episode_id": "UTPzVhIQDn",
      "episode_num": 1,
      "title": "...",
      "cover": "https://...",
      "duration": 309,
      "video_url": "",
      "m3u8_url": "",
      "h264_m3u8": "https://video-v81.mydramawave.com/vt/....m3u8",
      "h265_m3u8": "https://video-v6.mydramawave.com/vt/....m3u8",
      "best_url": "https://video-v81.mydramawave.com/vt/....m3u8",
      "unlocked": true,
      "video_type": "free",
      "episode_price": 60,
      "locked": false,
      "subtitles": [
        { "language": "bn-BD", "name": "Bengali", "subtitle": "https://...", "vtt": "https://..." }
      ]
    }
  ]
}
```

### `freereels/episode` (stream)

Sama seperti satu entri `items` di atas (tanpa pembungkus `items`).

### `freereels/search`

```json
{
  "success": true,
  "query": "cinta",
  "tab_key": "mix",
  "cursor": "offset=20&page_size=20",
  "has_more": true,
  "items": [ { "id": "zFtxTcWqvH", "series_id": "zFtxTcWqvH", "title": "" } ]
}
```

## Pagination

| Endpoint                          | Mekanisme                                                                                                                                                        |
| --------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `freereels/browse` (`tab=foryou`) | ✅ **cursor**: ambil field `cursor` dari response, kirim sebagai query `cursor` di request berikutnya. Parameter `offset` manual **diabaikan**.                  |
| `freereels/browse` (tab angka)    | ✅ cursor (sama, plus `has_more`)                                                                                                                                |
| `freereels/search`                | ✅ cursor (`tab` = `mix` \| `dubbed` \| `origin`)                                                                                                                |
| `sections`                        | statis per request; gunakan cursor milik section bila memuat lebih banyak item                                                                                   |

## Filter & parameter (hasil uji 2026-09-30)

Nama tab dari field `tab_name`:

| `tab`    | Nama        | Item/page | Catatan                          |
| -------- | ----------- | --------- | -------------------------------- |
| `503`    | Populer     | 10        |                                  |
| `505`    | New         | 10        |                                  |
| `622`    | Segera hadir| 216       | respons besar, kembalikan semua  |
| `516`    | Dubbing     | 10        |                                  |
| `504`    | Perempuan   | 10        |                                  |
| `506`    | Laki-Laki   | 10        |                                  |
| `547`    | Anime       | 10        |                                  |
| `foryou` | For You Feed| 10        | feed datar + cursor              |

| Param            | Status | Catatan                                            |
| ---------------- | ------ | -------------------------------------------------- |
| `cursor`         | ✅     | lanjut halaman (`offset=...`)                      |
| `pages` (batch)  | ✅     | `pages=3` → 32 item pada `tab=503`                 |
| `search tab`     | ✅     | `mix` / `dubbed` / `origin` → hasil berbeda        |
| `lang`           | ✅     | `id-ID`, `en-US`, `es-MX`, `pt-BR`, `zh-CN`        |

## Pemutaran

- Format **HLS (.m3u8)**; pakai `h264_m3u8` lalu `best_url` (fallback `h265_m3u8`).
  Media3 ExoPlayer memutar langsung, **tanpa dekripsi**.
- Terverifikasi di device: `OMX.qcom.video.decoder.avc` + `c2.android.aac.decoder` aktif.
- Endpoint `episodes` dihapus; daftar episode diambil dari `detail.items`.

## Catatan cacat data

- Sebagian item di `search` mengirim `title` kosong. Client menampilkan "Tanpa Judul".
- Item dengan `series_id`/`key`/`id` kosong dibuang sebelum dirender.
