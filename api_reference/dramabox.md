# DramaBox API (bagahproject)

Base: `https://api.bagahproject.com/api/dramabox/...`
Auth: header `x-api-key: <key>` + query `apikey=<key>`
Prefix **wajib** `api/` (bukan `api/v1/`).

## Endpoints

| Endpoint              | Query                       | Fungsi                     |
| --------------------- | --------------------------- | -------------------------- |
| `dramabox/home`       | `page`, `lang`              | Rekomendasi beranda        |
| `dramabox/foryou`     | `page`, `lang`              | Feed personal              |
| `dramabox/categories` | `lang`                      | Daftar per kategori        |
| `dramabox/search`     | `keyword`, `page`, `lang`   | Cari drama                 |
| `dramabox/detail`     | `bookId`, `lang`            | Detail series              |
| `dramabox/episodes`   | `bookId`, `lang`            | Daftar episode (tanpa URL) |
| `dramabox/episode`    | `bookId`, `episode`, `lang` | URL stream + kunci AES     |

`lang` = `in` (Indonesia) / `en`.

## Contoh Response

### `dramabox/home` / `foryou` / `categories`

```json
{
  "success": true,
  "page": 1,
  "items": [
    {
      "series_id": "42000027287",
      "title": "Tidur dengan Ayah Sahabatku",
      "description": "Setelah memergoki tunangannya selingkuh, ...",
      "cover": "https://hwztchapter.dramaboxdb.com/.../42000027287.jpg",
      "total_episodes": 51,
      "views": "8.4M",
      "category": null,
      "is_complete": false
    }
  ]
}
```

### `dramabox/detail`

```json
{
  "success": true,
  "series_id": "42000028264",
  "title": "Pewaris Jiwa Sang Alpha (Sulih Suara)",
  "description": "...",
  "cover": "https://...",
  "total_episodes": 30,
  "views": "458K",
  "category": null,
  "is_complete": true,
  "episodes_total": 30
}
```

### `dramabox/episodes`

```json
{
  "success": true,
  "series_id": "42000028264",
  "items": [
    {
      "episode_num": 1,
      "episode_id": "701647340",
      "title": "EP 1",
      "locked": false,
      "qualities": {
        "144": 3422,
        "360": 8556,
        "540": 12834,
        "720": 17113,
        "1080": 25669
      }
    }
  ]
}
```

`qualities` di sini = ukuran file (byte) per resolusi, bukan URL.

### `dramabox/episode` (stream + kunci)

```json
{
  "success": true,
  "series_id": "42000028264",
  "episode_num": 1,
  "episode_id": "701647340",
  "title": "EP 1",
  "locked": false,
  "best_url": "https://hwztvideo.dramaboxdb.com/.../701647340.720p.wz.h264.encrypt.mp4?...",
  "best_quality": "720",
  "encrypted": true,
  "key_hex": "e6d889142d282e1f1dad70a9942d1ed9",
  "qualities": {
    "540": "https://.../701647340.540p.wz.h264.encrypt.mp4?...",
    "720": "https://.../701647340.720p.wz.h264.encrypt.mp4?..."
  }
}
```

## Dekripsi Video (WAJIB untuk play)

DramaBox mengirim MP4 utuh yang terenkripsi **AES-128-ECB per sample video**.
Container/atom metadata TIDAK terenkripsi, jadi player tidak bisa memutar file mentahnya.

Alur:

1. Ambil `best_url` + `key_hex` dari `dramabox/episode`.
2. Download seluruh MP4.
3. Parse box `moov → trak → mdia → minf → stbl` untuk baca `stsz` (ukuran sample),
   `stco` (offset chunk), `stsc` (sample-to-chunk).
4. Untuk setiap sample: `n = size - (size % 16)`, dekripsi `n` byte mulai dari `offset`
   pakai AES-128-ECB, sisanya biarkan.

Implementasi Kotlin ada di `data/player/DramaBoxDecryptDataSource.kt`.
Skrip Python referensi ada di `api_reference/dramabox_decrypt_reference.py`.

Terverifikasi: 15.291 samples, output MP4 valid durasi ~224s.
