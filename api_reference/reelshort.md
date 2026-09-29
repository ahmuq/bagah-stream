# ReelShort API (bagahproject)

Base: `https://api.bagahproject.com/api/reelshort/...`
Auth: header `x-api-key: <key>` (query `apikey=<key>` juga diterima).
Prefix **wajib** `api/` (bukan `api/v1/`).
Spec: `https://api.bagahproject.com/api/v1/openapi.json`.

> Diperbarui 2026-09-30: API memakai endpoint terpadu `browse`. Endpoint lama
> `homepage`, `trending`, `latest`, `foryou`, `rankings`, dan `episodes` dihapus.
> Field pada `detail`/`episode` kini **snake_case**.

## Endpoints

| Endpoint               | Query                                                          | Fungsi               |
| ---------------------- | -------------------------------------------------------------- | -------------------- |
| `reelshort/browse`     | `type`, `page`, `limit`, `period`, `tag`, `genre`, `region`, `dub`, `lastBookId`, `lang` | Katalog |
| `reelshort/detail`     | `bookId`, `lang`                                               | Detail + chapter     |
| `reelshort/episode`    | `bookId`, `episode`, `lang`                                    | URL stream           |
| `reelshort/search`     | `keyword`, `page`, `limit`, `lang`                             | Cari series          |

`type` = `foryou` \| `trending` \| `latest` \| `ranking` \| `categories` \| `waterfall` \| `bookshelf` \| `classify`.
`period` (untuk `type=ranking`): `1` Top Harian, `4` Top Tahunan, `14` Rilisan Baru, `15` Paling Dicari, `16` Anime Terpopuler.
`lang` = `id` \| `en` \| `es` \| `pt` \| `de` \| `fr` \| `ja` \| `ko` \| `th` \| `ru` \| `zh` \| `ar` \| `fil` \| `tr` \| `hi` \| `vi`.

## Bentuk Response

Book (dipakai `foryou`, `trending`, `latest`, `ranking`, `classify`, `waterfall`, `bookshelf`, `search`):

```json
{
  "id": "6aa69e2ff969ab813e03c177",
  "title": "Menolak Lima Pasangan Wanitaku",
  "cover": "https://v-img.crazymaplestudios.com/.../b3d67828-....jpg",
  "description": "Selama sepuluh tahun Caine ...",
  "totalEpisodes": 50,
  "tags": ["Laki-laki", "Penyesalan"]
}
```

`type=foryou`:

```json
{ "success": true, "page": 1, "totalPages": 1, "items": [ { "id": "...", "title": "..." } ] }
```

`type=trending` / `latest`:

```json
{ "success": true, "title": "Populer", "items": [ { "id": "...", "title": "..." } ] }
```

`type=ranking`:

```json
{
  "success": true,
  "title": "RANKING",
  "copywriting": "Peringkat diperbarui setiap hari ...",
  "period": 1,
  "periodName": "Top Harian",
  "page": 1,
  "total": 1500,
  "items": [ { "id": "...", "title": "..." } ]
}
```

`type=categories`:

```json
{
  "success": true,
  "tab_id": 0,
  "groups": [
    {
      "category_type": 4,
      "category_name": "Genre",
      "sort_num": 1,
      "is_show_all": true,
      "options": [ { "id": "676d21074582b53a14081664", "text": "Pria" } ]
    }
  ]
}
```

`type=classify` / `waterfall` / `bookshelf`:

```json
{
  "success": true,
  "page": 1,
  "last_book_id": "6a83c5bd6b2f46f4c80ab397",
  "show_session_id": "ce2ba74e-...",
  "is_finished": 0,
  "items": [ { "id": "...", "title": "..." } ]
}
```

### `reelshort/detail` — chapter **snake_case**

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
      "episode_num": 1,
      "chapter_id": "zj2iojyw77",
      "title": "Episode 1",
      "locked": false,
      "serial_number": "1"
    }
  ]
}
```

### `reelshort/episode` (stream) — **snake_case**

```json
{
  "success": true,
  "book_id": "6aa69e2ff969ab813e03c177",
  "episode_num": 1,
  "episode_id": "zj2iojyw77",
  "title": "Episode 1",
  "locked": false,
  "best_url": "https://v-mps.crazymaplestudios.com/.../....m3u8",
  "video_list": [
    { "url": "https://.../...-video-sd.m3u8", "quality": "720", "encode": "H265", "bitrate": 659 },
    { "url": "https://.../...-ld.m3u8", "quality": "540", "encode": "H264", "bitrate": 999 }
  ]
}
```

### `reelshort/search`

```json
{ "success": true, "query": "cinta", "page": 1, "total": 120, "items": [ { "id": "...", "title": "..." } ] }
```

## Pagination

| Endpoint                          | `page` didukung?                                        |
| --------------------------------- | ------------------------------------------------------ |
| `search`                          | ✅                                                     |
| `browse` `type=foryou`            | ⚠️ diterima, tetapi `totalPages` biasanya 1 (mengulang) |
| `trending`/`latest`/`ranking`     | ❌ statis                                              |
| `waterfall`/`bookshelf`/`classify`| memakai `lastBookId` untuk halaman berikutnya          |

## Catatan Pemutaran

- Format **HLS (.m3u8)** di `best_url` / `video_list` — Media3 ExoPlayer memutar langsung, **tanpa dekripsi**.
- Pilih varian `encode == "H264"` lebih dulu demi kompatibilitas decoder hardware,
  fallback ke varian pertama ber-URL, lalu `best_url`.
- Terverifikasi di device: `OMX.qcom.video.decoder.avc` + `c2.android.aac.decoder` aktif.
- Endpoint `episodes` dihapus; daftar episode diambil dari `detail.chapters`.
