# PineDrama API (bagahproject)

Base: `https://api.bagahproject.com/api/pinedrama/...`
Auth: header `x-api-key: <key>` (query `apikey=<key>` juga diterima).
Prefix **wajib** `api/` (bukan `api/v1/`).
Spec: `https://api.bagahproject.com/api/v1/openapi.json`.

> Diperbarui 2026-09-30: API dirombak memakai `browse` + `detail` + `episode` + `search`.
> Endpoint lama `foryou`/`trending`/`detail(collectionId)` dihapus. Kini **pemutaran
> video didukung** (MP4 langsung dari TikTok CDN), memperbaiki bug lama "Episode video not found".

## Endpoints

| Endpoint              | Query                                        | Fungsi                 |
| --------------------- | -------------------------------------------- | ---------------------- |
| `pinedrama/browse`    | `type`, `page`, `count`, `lang`              | Feed / kategori        |
| `pinedrama/detail`    | `seriesId` (wajib), `lang`                   | Detail + daftar episode |
| `pinedrama/episode`   | `seriesId` (wajib), `episode`, `lang`        | URL video episode      |
| `pinedrama/search`    | `keyword` (wajib), `page`, `size`, `lang`    | Cari series            |

`type` = `foryou` \| `trending` \| `categories` \| `<categoryId>` (`101`, `7628991192533095425`, …).
`lang` = `id` \| `en` \| `es` \| `pt` \| `zh`.

## Bentuk Response

### Item

```json
{
  "id": "7674246567940969493",
  "series_id": "7674246567940969493",
  "seriesId": "7674246567940969493",
  "video_id": "7280389703546995717",
  "play_url": "https://v45-eu.tiktokcdn.com/...?mime_type=video_mp4&...",
  "title": "Gadis bodoh masuk kota dengan ratusan hewan buas",
  "description": "",
  "cover": "https://p16-common-sign.tiktokcdn.com/...",
  "total_episodes": 60,
  "totalEpisodes": 60,
  "views": 0,
  "tags": []
}
```

`play_url` di listing adalah MP4 (cuplikan/episode pertama) langsung dari TikTok CDN.

### `type=foryou`

```json
{ "success": true, "type": "foryou", "title": "Untukmu", "page": 1, "total": 500, "items": [ { "id": "..." } ] }
```

Halaman berikutnya memakai `page` (`page=2` → item berbeda).

### `type=trending`

```json
{ "success": true, "type": "trending", "title": "...", "total": 0, "items": [] }
```

### `type=categories`

```json
{
  "success": true,
  "categories": [
    { "name": "Semua", "category_id": "0", "scene": 1 },
    { "name": "Sedang tren", "category_id": "101", "scene": 2 },
    { "name": "Masyarakat kelas atas", "category_id": "7628991192533095425", "scene": 3 },
    { "name": "Kehidupan perkotaan", "category_id": "7628991192536978448", "scene": 3 }
  ]
}
```

### `type=<categoryId>` (cursor)

```json
{
  "success": true,
  "category_id": "101",
  "category_name": "Sedang tren",
  "scene": 2,
  "cursor": "0",
  "has_more": true,
  "total": 500,
  "items": [ { "id": "7688045712806761492" } ]
}
```

### `pinedrama/detail`

```json
{
  "success": true,
  "id": "7674246567940969493",
  "series_id": "7674246567940969493",
  "title": "Gadis bodoh masuk kota dengan ratusan hewan buas",
  "description": "",
  "cover": "https://...",
  "total_episodes": 60,
  "totalEpisodes": 60,
  "views": 0,
  "tags": [],
  "chapters": [
    {
      "episode_num": 1,
      "episodeNum": 1,
      "episode_id": "7674247362214186261",
      "episodeId": "7674247362214186261",
      "title": "Episode 1",
      "locked": false,
      "is_paid": false,
      "duration": null,
      "best_url": ""
    }
  ]
}
```

`best_url` di `chapters` kosong; URL video harus diambil dari `pinedrama/episode`.

### `pinedrama/episode` (URL MP4)

```json
{
  "success": true,
  "series_id": "7674246567940969493",
  "episode_num": 1,
  "episode_id": "7674247362214186261",
  "title": "Gadis bodoh masuk kota dengan ratusan hewan buas",
  "locked": false,
  "video_url": "https://v45-eu.tiktokcdn.com/...?mime_type=video_mp4&...",
  "play_url": "https://v45-eu.tiktokcdn.com/..."
}
```

### `pinedrama/search`

```json
{ "success": true, "query": "cinta", "keyword": "cinta", "exact": true, "page": 1, "total": 54, "items": [ { "id": "..." } ] }
```

## Pagination

| Endpoint                     | Mekanisme                                   |
| ---------------------------- | ------------------------------------------- |
| `search`                     | ✅ `page`                                   |
| `browse type=foryou`         | ✅ `page`                                   |
| `browse type=<categoryId>`   | ✅ `cursor` (kirim `cursor` dari response)   |
| `browse type=categories`     | ❌ statis                                   |
| `browse type=trending`       | ❌ selalu kosong                            |

## Pemutaran

- `episode.video_url`/`play_url` adalah **MP4 langsung** (TikTok CDN), tanpa enkripsi.
  ExoPlayer memutar langsung (umumnya HEVC/H.265).
- Terverifikasi di device: `OMX.qcom.video.decoder.hevc` + `c2.android.aac.decoder` aktif.

## Catatan cacat data

- `type=trending` masih mengembalikan `items: []` (`total: 0`).
- `chapters[].best_url` selalu kosong; gunakan `pinedrama/episode`.
- Item tanpa `series_id`/`id` dibuang sebelum dirender.
