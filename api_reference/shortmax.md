# ShortMax API (bagahproject)

Base: `https://api.bagahproject.com/api/shortmax/...`
Auth: header `x-api-key: <key>` (query `apikey=<key>` juga diterima).
Prefix **wajib** `api/` (bukan `api/v1/`).
Spec: `https://api.bagahproject.com/api/v1/openapi.json`.

> Diperbarui 2026-09-30: API memakai endpoint terpadu `browse`. Endpoint lama
> `foryou`, `trending`, `latest`, `rankings`, dan `episodes` dihapus.

## Endpoints

| Endpoint             | Query                              | Fungsi         |
| -------------------- | ---------------------------------- | -------------- |
| `shortmax/browse`    | `type`, `page`, `pages`, `size`, `lang` | Katalog   |
| `shortmax/detail`    | `seriesId`, `lang`                 | Detail series  |
| `shortmax/episode`   | `seriesId`, `episode`, `lang`      | URL stream     |
| `shortmax/search`    | `keyword`, `page`, `size`, `lang`  | Cari series    |

`type` = `trending` \| `latest` \| `rankings` \| `foryou` \| `classes` \| `<classId>`.
`classId`: `200001` Modern, `200002` Kuno, `200003` Fantasi, `200004` Realistas,
`200005` Misteri, `200006` Perkotaan, `200007` Sejarah, `200008` hot,
`200009` Fiksi Ilmiah, `200010` Realistic, `200012` Fanta, `200014`.
`lang` = `id` \| `en` \| `es` \| `pt` \| `zh`.

## Bentuk Response

### List (`trending` / `latest` / `rankings` / `foryou` / `<classId>`)

```json
{
  "success": true,
  "title": "Populer",
  "page": 1,
  "classId": 200001,
  "has_more": true,
  "isEnd": false,
  "items": [
    {
      "id": "29119",
      "seriesId": "29119",
      "series_id": "29119",
      "code": 858418,
      "title": "[Dubbing] Cinta Tak Lekang Oleh Waktu",
      "description": "...",
      "cover": "https://volcengine-forward.shorttv.live/images/cover/....jpg?auth_key=...",
      "totalEpisodes": 79,
      "total_episodes": 79,
      "views": 2554943,
      "tags": [],
      "currentEpisode": 1
    }
  ]
}
```

`currentEpisode` hanya muncul pada `type=foryou`.

### `type=classes`

```json
{
  "success": true,
  "contents": [ { "id": 1, "name": "female" }, { "id": 2, "name": "male" } ],
  "classes": [ { "id": 200001, "name": "Modern", "sort": 1 } ]
}
```

### `shortmax/detail`

Item yang sama seperti list, ditambah `chapters` (URL stream di chapter bisa kosong):

```json
{
  "success": true,
  "id": "29119",
  "seriesId": "29119",
  "series_id": "29119",
  "code": 858418,
  "title": "...",
  "description": "...",
  "cover": "https://...",
  "totalEpisodes": 79,
  "total_episodes": 79,
  "views": 37421,
  "tags": [],
  "chapters": [
    {
      "episodeNum": 1,
      "episode_num": 1,
      "episodeId": "1649952",
      "episode_id": "1649952",
      "seriesId": "29119",
      "series_id": "29119",
      "title": "Episode 1",
      "locked": false,
      "video480": "",
      "video720": "",
      "video1080": "",
      "bestUrl": "",
      "best_url": "",
      "qualities": {}
    }
  ]
}
```

### `shortmax/episode` (stream + info enkripsi)

```json
{
  "success": true,
  "episodeNum": 1,
  "episode_num": 1,
  "episodeId": "1649952",
  "episode_id": "1649952",
  "seriesId": "29119",
  "series_id": "29119",
  "title": "[Dubbing] Cinta Tak Lekang Oleh Waktu",
  "locked": false,
  "video480": "https://.../main.m3u8?auth_key=...",
  "video720": "https://.../main.m3u8?auth_key=...",
  "video1080": "https://.../main.m3u8?auth_key=...",
  "bestUrl": "https://.../main.m3u8?auth_key=...",
  "best_url": "https://.../main.m3u8?auth_key=...",
  "qualities": {
    "video_480": "https://...",
    "video_720": "https://...",
    "video_1080": "https://..."
  },
  "duration": 98,
  "encrypted": true,
  "crypto_info": {
    "type": "hls-segment-aes",
    "algorithm": "aes-128-cbc",
    "iv": "shortmax00000000",
    "header_size": 1024,
    "key_offset_pos": [16, 20],
    "enc_len_pos": [20, 24]
  }
}
```

### `shortmax/search`

```json
{ "success": true, "query": "cinta", "keyword": "cinta", "page": 1, "total": 20, "items": [ { "id": "..." } ] }
```

## Pagination

| Endpoint                       | Hasil                                          |
| ------------------------------ | ---------------------------------------------- |
| `search`                       | ✅ `page` berfungsi (page 2 → item berbeda)     |
| `browse` `type=foryou`         | ❌ `page` diabaikan (page 1/2/3 identik)        |
| `trending`/`latest`/`rankings` | ❌ statis (page diabaikan)                      |
| `browse` `<classId>`           | ✅ `page`/`size` + `has_more`/`isEnd`           |

## Dekripsi Video (WAJIB untuk play)

ShortMax mengirim **HLS** dengan segmen `.ts` yang terenkripsi custom — bukan
`#EXT-X-KEY` standar. Setiap segmen:

1. Berukuran ≥ 1024 byte dan diawali magic `shortmax` (mis. `shortmax00000001`).
2. 1024 byte pertama adalah header teks:
   - byte **[16:20]** = offset kunci di dalam header
   - byte **[20:24]** = panjang data terenkripsi
3. Kunci 16 byte diambil pada offset tersebut (dalam bentuk ASCII di header).
4. Data terenkripsi = `data[1024 : 1024+enc_len]`, didekripsi **AES-128-CBC** dengan
   IV tetap `shortmax00000000`, lalu padding PKCS#7 dibuang.
5. Sisa byte setelah blok terenkripsi (`data[1024+enc_len:]`) adalah MPEG-TS biasa
   dan digabung kembali.

Info resmi tersedia di `crypto_info` pada `shortmax/episode`. Implementasi Kotlin:
`data/player/ShortMaxDecryptDataSource.kt`. Terverifikasi di device: segmen terdekripsi,
`OMX.qcom.video.decoder.avc` + `c2.android.aac.decoder` aktif.

## Filter & parameter (hasil uji 2026-09-30)

| Param              | Status | Catatan                                                              |
| ------------------ | ------ | -------------------------------------------------------------------- |
| `type=classes`     | ✅     | daftar kelas: Modern, Kuno, Fantasi, Realistas, Misteri, Perkotaan, Sejarah, hot, Fiksi Ilmiah, Realistic, Fanta, `200014` |
| `type=<classId>`   | ⚠️     | menerima `page`/`size`, tetapi **set item identik antar class** (200001 = 200002 = 200003 = 200007) → filter kelas tidak berfungsi |
| `type=trending`    | ✅     | statis 110 item                                                      |
| `type=latest`      | ✅     | 100 item                                                             |
| `type=foryou`      | ✅     | 20 item, menyertakan `currentEpisode`                                |
| `page` (class)     | ✅     | `page=2` → item berbeda                                              |
| `size`             | ⚠️     | tampak diabaikan pada list statis (trending tetap 110 walau `size=5`) |
| `pages` (batch)    | ⚠️     | berpengaruh pada class, tidak pada list statis                      |

Nama kelas dari `type=classes`: `contents` (gender) + `classes` (kategori).

## Catatan cacat data

- Detail `chapters` **tidak** memuat URL stream yang valid; URL harus diambil dari
  `shortmax/episode` (endpoint `episodes` lama sudah dihapus).
- Item tanpa id dibuang; item tanpa title dirender "Tanpa Judul".
