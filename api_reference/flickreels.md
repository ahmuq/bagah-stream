# FlickReels API (bagahproject)

Base: `https://api.bagahproject.com/api/flickreels/...`
Auth: header `x-api-key: <key>` (query `apikey=<key>` juga diterima).
Prefix **wajib** `api/` (bukan `api/v1/`).
Spec: `https://api.bagahproject.com/api/v1/openapi.json`.

> Diperbarui 2026-09-30: API memakai endpoint terpadu `browse`. Endpoint lama
> `foryou`, `trending`, `latest`, `rankings`, `categories`, dan `episodes` dihapus.
> `search` kini mendukung pagination `page`; `browse type=foryou`/`classify`
> memakai cursor `nextCursor`.

## Endpoints

| Endpoint                | Query                                                                    | Fungsi               |
| ----------------------- | ------------------------------------------------------------------------ | -------------------- |
| `flickreels/browse`     | `type`, `page`, `limit`, `tag`, `channel`, `region`, `sort`, `cursor`, `lang` | Katalog          |
| `flickreels/detail`     | `seriesId`, `lang`                                                       | Detail + chapter     |
| `flickreels/episode`    | `seriesId`, `episode`, `lang`                                            | URL stream           |
| `flickreels/search`     | `keyword`, `page`, `lang`                                                | Cari series          |

`type` = `foryou` \| `trending` \| `latest` \| `ranking` \| `categories` \| `navigation` \| `classify`.
`sort` = `1` (Populer) \| `2` (Terbaru).
`lang` = `id` \| `en` \| `es` \| `ja` \| `ko` \| `zh_tw` \| `th` \| `de` \| `zh` \| `pt` \| `fr` \| `ar` \| `vi` \| `ms` \| `it` \| `tr`.

## Bentuk Response

### Item

```json
{
  "id": "11694",
  "title": "Ujian Cinta Sejati (Dubbing)",
  "cover": "https://zshipubcf.farsunpteltd.com/playlet/....jpg",
  "description": "...",
  "totalEpisodes": 41,
  "views": "2.0M",
  "tags": [],
  "lastChapterNum": null
}
```

`views` bisa berupa string (`"2.0M"`) **atau** angka (`0`).

### `type=foryou` (cursor)

```json
{ "success": true, "page": 1, "nextCursor": "UlpBMzFCR3U4a00xNi9mMFltaXBDQT09", "items": [ { "id": "8612" } ] }
```

### `type=trending` / `latest` / `ranking`

```json
{ "success": true, "title": "Populer", "items": [ { "id": "11694" } ] }
```

### `type=categories`

```json
{
  "success": true,
  "navigationId": 775,
  "rows": [
    {
      "row_id": 21,
      "row_kind": 1,
      "display_name": "合同剧制作类型",
      "select_mode": "single",
      "default_values": "-1",
      "items": [ { "value": -1, "text": "Semua" } ]
    }
  ]
}
```

### `type=navigation`

```json
{ "success": true, "navigationId": 775, "columns": [] }
```

### `type=classify` (cursor)

```json
{
  "success": true,
  "navigationId": 775,
  "nextCursor": "Q1BuYUdhazhES3I1ZUxPTVg0UlA0d2l6bitDSCtz",
  "items": [ { "id": "8105" } ]
}
```

### `flickreels/detail` — **sudah termasuk URL stream**

```json
{
  "success": true,
  "id": "11694",
  "title": "Ujian Cinta Sejati (Dubbing)",
  "cover": "https://...",
  "description": "...",
  "totalEpisodes": 41,
  "views": "2.0M",
  "tags": [],
  "lastChapterNum": null,
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

### `flickreels/episode` (stream)

```json
{
  "success": true,
  "seriesId": "11694",
  "episodeNum": 1,
  "episodeId": "731652",
  "title": "Ujian Cinta Sejati (Dubbing)-EP.1",
  "locked": false,
  "bestUrl": "https://zshipricf.farsunpteltd.net/playlet-hls/....m3u8?verify=...",
  "duration": 170
}
```

### `flickreels/search`

```json
{ "success": true, "query": "cinta", "page": 1, "total": 15, "items": [ { "id": "2846", "title": "..." } ] }
```

## Pagination

| Endpoint                          | Mekanisme                                              |
| --------------------------------- | ------------------------------------------------------ |
| `search`                          | ✅ `page`                                              |
| `browse` `type=foryou`/`classify` | ✅ cursor `nextCursor` (kirim sebagai query `cursor`)   |
| `trending`/`ranking`              | ❌ statis (42-43 item)                                 |
| `latest`                          | ⚠️ selalu kosong (bug data, belum terhubung)           |

## Pemutaran

- Format **HLS (.m3u8)** di `bestUrl` — Media3 ExoPlayer memutar langsung, **tanpa dekripsi**.
- `bestUrl` punya tanda tangan `?verify=...` yang berlaku sementara, jadi URL harus
  diambil saat akan diputar (tidak boleh di-cache lama).
- `detail.chapters` sudah memuat URL, jadi membuka detail tidak perlu request `episodes` terpisah.
- Terverifikasi di device: `OMX.qcom.video.decoder.avc` + `c2.android.aac.decoder` aktif.

## Catatan cacat data

- `type=latest` masih mengembalikan 0 item; `type=ranking` masih identik dengan `trending`.
- Item dengan `id` kosong dibuang sebelum dirender; item tanpa `title` dirender "Tanpa Judul".
