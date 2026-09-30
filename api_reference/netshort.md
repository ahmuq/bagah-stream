# NetShort API (bagahproject)

Base: `https://api.bagahproject.com/api/netshort/...`
Auth: header `x-api-key: <key>` (query `apikey=<key>` juga diterima).
Prefix **wajib** `api/` (bukan `api/v1/`).
Spec: `https://api.bagahproject.com/api/v1/openapi.json`.

> Platform baru, ditambahkan 2026-09-30. Stream berupa **MP4 langsung tanpa enkripsi**
> (magic `ftypisom`), jadi diputar langsung ExoPlayer tanpa dekripsi.

## Endpoints

| Endpoint             | Query                                    | Fungsi                  |
| -------------------- | ---------------------------------------- | ----------------------- |
| `netshort/browse`    | `type`, `codec`, `lang`                  | Ranking / channel feed  |
| `netshort/detail`    | `seriesId` (wajib), `lang`               | Detail + daftar episode |
| `netshort/episode`   | `seriesId` (wajib), `episode`, `codec`, `lang` | URL MP4 episode   |
| `netshort/search`    | `keyword` (wajib), `page`, `codec`, `lang` | Cari series            |

`codec` = `h265` (default server) | `h264` (dipakai app demi kompatibilitas decoder).
`lang` = `id_ID` \| `en_US` \| `es_ES` \| `zh_CN` \| `zh_TW` \| `th_TH` \| `ja_JP` \| `ko_KR` \| `pt_BR` \| `vi_VN`.

### Parameter `browse.type`

| Nilai                                                        | Arti                        |
| ------------------------------------------------------------ | --------------------------- |
| `mostTrending` / `topSearch` / `newRelease` / `soaringHeat`   | Papan peringkat             |
| `actorRanking`                                               | Peringkat aktor (30 item)      |
| `channels`                                                   | Daftar taksonomi channel    |
| `315` `316` `317` `318` `319` `320` `321` `323` `125` `131` `127` | Feed per channel      |

`browse` **tidak** punya parameter `page` (feed statis).

## Bentuk Response

### Item (dipakai semua listing & search)

```json
{
  "id": "2099785083586842626",
  "series_id": "2099785083586842626",
  "seriesId": "2099785083586842626",
  "library_id": "2099784212559917057",
  "title": "Rebut Kembali Takdirku",
  "description": "...",
  "cover": "https://awscover.netshort.com/.../....webp",
  "total_episodes": 0,
  "totalEpisodes": 0,
  "finished": true,
  "views": 0,
  "language": "id_ID",
  "tags": ["Bangkit Kembali", "Menghukum Penjahat", "Identitas Rahasia"]
}
```

`total_episodes` **selalu 0** di listing/browse; jumlah episode sebenarnya hanya ada di `detail`.

### `type=mostTrending` / `topSearch` / `newRelease` / `soaringHeat` (ranking)

```json
{
  "success": true,
  "tab": "mostTrending",
  "ranking_name": "热播榜",
  "total": 30,
  "items": [ { "id": "...", "title": "..." } ]
}
```

### `type=channels` (taksonomi)

```json
{
  "success": true,
  "theater_id": 47,
  "channels": [
    {
      "id": 314,
      "name": "Jelajahi",
      "children": [
        { "id": 315, "name": "Populer" },
        { "id": 316, "name": "Kepuasan" },
        { "id": 317, "name": "Sang Juara Kembali" },
        { "id": 318, "name": "Bangkit Kembali" },
        { "id": 319, "name": "Menghukum Penjahat" },
        { "id": 320, "name": "Pertumbuhan Wanita" },
        { "id": 321, "name": "Romantis Perkotaan" },
        { "id": 322, "name": "Bangkit Kembali" }
      ]
    },
    { "id": 323, "name": "Baru", "children": [] },
    { "id": 124, "name": "Kategori", "children": [] },
    { "id": 866, "name": "Komunitas", "children": [] },
    { "id": 125, "name": "VIP", "children": [] },
    { "id": 131, "name": "Dubbing", "children": [] },
    { "id": 127, "name": "Anime", "children": [] },
    { "id": 126, "name": "Ranking", "children": [] }
  ]
}
```

### `type=<channelId>` (feed channel)

```json
{
  "success": true,
  "channel_id": 127,
  "channel_name": "Anime",
  "total": 206,
  "sections": [],
  "items": [ { "id": "2028030330178371585", "title": "..." } ]
}
```

`sections` ada di skema tetapi kosong; item nyata ada di `items`.

### `netshort/detail`

```json
{
  "success": true,
  "id": "2099785083586842626",
  "series_id": "2099785083586842626",
  "library_id": "2099784212559917057",
  "title": "Rebut Kembali Takdirku",
  "description": "...",
  "cover": "https://...",
  "total_episodes": 42,
  "totalEpisodes": 42,
  "finished": true,
  "views": 1671985,
  "language": "id_ID",
  "tags": ["Bangkit Kembali", "..."],
  "chapters": [
    {
      "episode_num": 1,
      "episodeNum": 1,
      "episode_id": "2100137310549671942",
      "episodeId": "2100137310549671942",
      "title": "",
      "cover": "https://...",
      "duration": "172.971",
      "locked": false,
      "vip": false,
      "ad": false,
      "unlock_type": null,
      "video_url": "https://ns-aws-cdn.netshort.com/...?mime_type=video_mp4&...",
      "play_url": "https://ns-aws-cdn.netshort.com/...",
      "sdk_vid": "v18ea3g00057dal502vog65vhf5no3og",
      "subtitles": [ { "url": "https://...", "lang": "" } ]
    }
  ],
  "episodes": [ "…sama seperti chapters…" ]
}
```

`chapters` dan `episodes` berisi data yang sama. `duration` berupa **string detik** (mis. `"172.971"`).

### `netshort/episode` (URL MP4)

```json
{
  "success": true,
  "episode_num": 1,
  "episode_id": "2100137310549671942",
  "title": "",
  "cover": "",
  "duration": "172.971",
  "locked": false,
  "vip": false,
  "ad": false,
  "video_url": "https://ns-aws-cdn.netshort.com/...?mime_type=video_mp4&...",
  "play_url": "https://ns-aws-cdn.netshort.com/..."
}
```

Episode terkunci otomatis di-unlock lewat mekanisme reward-ad di sisi server.

### `netshort/search`

```json
{
  "success": true,
  "query": "cinta",
  "keyword": "cinta",
  "exact": true,
  "no_result": false,
  "page": 1,
  "total": 23,
  "items": [ { "id": "1973235073021644802", "title": "Salah Pilih Cinta" } ]
}
```

## Pagination

| Endpoint                        | `page` didukung? |
| ------------------------------- | ---------------- |
| `netshort/search`               | ✅ (page 2 → set berbeda) |
| `netshort/browse` (semua type)  | ❌ statis        |

## Pemutaran

- `episode.video_url` / `play_url` adalah **MP4 utuh** (`Content-Type: video/mp4`, box `ftypisom`),
  mendukung HTTP Range (206). ExoPlayer memutar langsung, **tanpa dekripsi**.
- Server mendukung `codec=h264` dan `h265`; app memakai `h264`.
- Terverifikasi di device: `OMX.qcom.video.decoder.avc` + `c2.android.aac.decoder` aktif.

## Catatan cacat data

- `type=actorRanking` kini mengembalikan 30 item (fixed 2026-09-30).
- `total_episodes` selalu `0` di semua listing; pakai `detail.totalEpisodes` untuk jumlah episode.
- Item tanpa `series_id`/`id` dibuang sebelum dirender; item tanpa `title` dirender "Tanpa Judul".
