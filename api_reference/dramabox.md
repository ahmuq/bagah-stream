# DramaBox API (bagahproject)

Base: `https://api.bagahproject.com/api/dramabox/...`
Auth: header `x-api-key: <key>` (query `apikey=<key>` juga diterima).
Prefix **wajib** `api/` (bukan `api/v1/`).
Spec: `https://api.bagahproject.com/api/v1/openapi.json`.

> Diperbarui 2026-09-30: API memakai endpoint terpadu `browse`. Endpoint lama
> `home`, `foryou`, `categories`, dan `episodes` sudah dihapus.

## Endpoints

| Endpoint            | Query                                                                   | Fungsi                                    |
| ------------------- | ----------------------------------------------------------------------- | ----------------------------------------- |
| `dramabox/browse`   | `type`, `page`, `pageSize`, `channelId`, `genre`, `status`, `dub`, `rankType`, `lang` | Katalog / discovery         |
| `dramabox/detail`   | `bookId`, `full`, `withRecommend`, `lang`                               | Detail (+ episode bila `full=true`)       |
| `dramabox/episode`  | `bookId`, `episode`, `chapterId`, `lang`                                | URL stream + kunci AES                    |
| `dramabox/search`   | `keyword`, `page`, `pageSize`, `lang`                                   | Cari drama                                |

`lang` = `in` (Indonesia) / `en`.

### Parameter `browse`

| Param       | Nilai                                                                 |
| ----------- | --------------------------------------------------------------------- |
| `type`      | `foryou` \| `classify` \| `theater` \| `ranking` \| `reserve` \| `filters` |
| `channelId` | `175` (Untukmu/Beranda) \| `43` (Pria/Romansa) \| `299` (Trending Teater) \| `300` (Rilis Baru Teater) |
| `genre`     | `All` atau id genre (lihat `type=filters`)                            |
| `status`    | `All` \| `1` (Tamat) \| `2` (Berjalan)                                |
| `dub`       | `All` \| `1` (Sulih Suara) \| `2` (Subtitle Asli)                     |
| `rankType`  | `1` \| `2` \| `3`                                                     |

## Bentuk Response

`type=foryou` / `classify` / `reserve` (daftar datar):

```json
{
  "success": true,
  "page": 1,
  "is_more": true,
  "items": [
    {
      "series_id": "42000029655",
      "title": "Bangkit Jadi Raja Lycan",
      "description": "...",
      "cover": "https://hwztchapter.dramaboxdb.com/.../42000029655.jpg?...",
      "total_episodes": 45,
      "views": "23.2K",
      "category": null,
      "tags": ["Pria Dominan", "Balas Dendam"],
      "is_complete": false
    }
  ]
}
```

`views` bisa berupa string (`"23.2K"`) **atau** angka (`0`).

`type=theater` (ber-kolom):

```json
{
  "success": true,
  "banners": [],
  "columns": [
    {
      "column_id": 444,
      "title": "Anda Mungkin Suka",
      "subtitle": "",
      "style": "ALGORITHM_STYLE",
      "type": 1,
      "items": [ { "series_id": "...", "title": "...", "total_episodes": 45 } ]
    }
  ]
}
```

`type=ranking`:

```json
{
  "success": true,
  "types": [ { "rank_type": 1, "name": "Sedang Tren" } ],
  "items": [ { "series_id": "...", "title": "...", "total_episodes": 30 } ]
}
```

`type=filters`:

```json
{
  "success": true,
  "totalGenres": 64,
  "filters": [
    {
      "type": 1,
      "categoryName": "Genre & Tema",
      "options": [ { "display": "Balas Dendam", "enDisplay": "Revenge", "value": "1337" } ]
    }
  ]
}
```

### `dramabox/detail` (`full=false`)

```json
{
  "success": true,
  "series_id": "42000027287",
  "title": "Tidur dengan Ayah Sahabatku",
  "description": "...",
  "cover": "https://...",
  "total_episodes": 51,
  "views": "8.8M",
  "category": null,
  "tags": ["Cinta Terlarang", "CEO"],
  "is_complete": true
}
```

### `dramabox/detail` (`full=true`)

Mengembalikan daftar episode + metadata rating. Field metadata ringkas
(`title`, `cover`, `description`, `total_episodes`) **tidak** disertakan pada mode ini.

```json
{
  "success": true,
  "series_id": "42000027287",
  "book_status": 1,
  "is_complete": true,
  "episodes_total": 51,
  "download_qualities": [720],
  "rating": "4.8",
  "rating_count": "6.1K",
  "episodes": [
    {
      "episode_num": 1,
      "episode_id": "701602498",
      "locked": false,
      "sizes": { "144": 2451, "360": 6996, "540": 7557, "720": 12007, "1080": 20075 }
    }
  ]
}
```

`sizes` = ukuran file (byte) per resolusi, bukan URL.

### `dramabox/episode` (stream + kunci)

```json
{
  "success": true,
  "series_id": "42000027287",
  "episode_num": 1,
  "episode_id": "701602498",
  "title": "EP 1",
  "locked": false,
  "best_url": "https://hwztakavideoto.dramaboxdb.com/.../701554126.720p.wz.h264.encrypt.mp4?...",
  "best_quality": "720",
  "encrypted": true,
  "key_hex": "d98b4c923c8c193e0c02921dd7c1daa5",
  "qualities": {
    "540": "https://.../701554126.540p.wz.h264.encrypt.mp4?...",
    "720": "https://.../701554126.720p.wz.h264.encrypt.mp4?..."
  }
}
```

### `dramabox/search`

```json
{ "success": true, "query": "love", "page": 1, "items": [ { "series_id": "...", "title": "..." } ] }
```

## Pagination

| Endpoint                           | `page` didukung?                                   |
| ---------------------------------- | -------------------------------------------------- |
| `browse` `type=foryou` / `classify`| ✅                                                 |
| `browse` `type=theater`            | ❌ (ber-kolom)                                     |
| `browse` `type=ranking` / `reserve`| ❌ (statis)                                       |
| `browse` `type=filters`            | ❌                                                 |
| `search`                           | ✅                                                 |

## Dekripsi Video (WAJIB untuk play)

DramaBox mengirim MP4 utuh yang terenkripsi **AES-128-ECB per sample video**.
Container/atom metadata TIDAK terenkripsi, jadi player tidak bisa memutar file mentahnya.

1. Ambil `best_url` + `key_hex` dari `dramabox/episode`.
2. Download seluruh MP4.
3. Parse box `moov → trak → mdia → minf → stbl` untuk baca `stsz`, `stco`, `stsc`.
4. Untuk setiap sample: `n = size - (size % 16)`, dekripsi `n` byte mulai dari `offset`
   pakai AES-128-ECB, sisanya biarkan.

Implementasi Kotlin: `data/player/DramaBoxDecryptDataSource.kt`.
Referensi Python: `api_reference/dramabox_decrypt_reference.py`.
Terverifikasi di device: sample 720p ~12.3 MB terdekripsi, `OMX.qcom.video.decoder.avc` aktif.

## Filter & parameter (hasil uji 2026-09-30)

| Param                | Status | Catatan                                                              |
| -------------------- | ------ | -------------------------------------------------------------------- |
| `type=foryou`        | ✅     | 5 item/halaman, `total_episodes` sering `0`                          |
| `type=classify`      | ✅     | 15 item, `is_more`; **tanpa** filter                                 |
| `type=theater`       | ✅     | ber-kolom; `channelId` mengubah kolom (default 2 kolom, 299/300 = 1) |
| `type=ranking`       | ✅     | `rankType=1|2|3` → urutan berbeda (3 = Terbaru)                      |
| `type=reserve`       | ✅     | 5 item (rilis mendatang)                                             |
| `type=filters`       | ✅     | 68 opsi genre (`value` seperti `1323`, `1337`, …)                    |
| `status`             | ✅     | `1` (Tamat) vs `2` (Berjalan) menghasilkan item berbeda              |
| `dub`                | ⚠️     | `dub=2` jalan; `dub=1` mengembalikan daftar `filters`, bukan item    |
| `genre` (classify)   | ❌     | **Bug**: setiap nilai genre (termasuk id dari `type=filters`) → `items: []` |
| `pageSize`           | ✅     | `pageSize=30` → 30 item                                              |
| `pages` (batch)      | ✅     | `pages=3` → 45 item (15×3) dalam satu request                        |
| `channelId` (classify)| ❌    | nilai 175/43/299/300 menghasilkan set yang sama                      |

Enum `genre` di spec OpenAPI (`1362`, `1394`, …) **tidak** cocok dengan id di `type=filters`
(`1323`, `1337`, …); keduanya sama-sama menghasilkan 0 item saat dipakai di `classify`.

## Catatan cacat data

- Di endpoint lama, `home` menyertakan satu item rusak (`series_id` kosong). Pada `browse`
  baru item rusak itu tidak lagi muncul, tetapi client tetap membuang item tanpa `series_id`.
- `total_episodes` sering bernilai `0` pada `type=foryou`; pakai `classify` bila butuh jumlah episode.
- **BUG (2026-09-30)**: `dramabox/episode` mengabaikan parameter `episode`; semua nomor
  mengembalikan file video yang sama (selalu episode 1). `chapterId` selalu HTTP 400.
  Belum bisa diperbaiki dari sisi klien.
