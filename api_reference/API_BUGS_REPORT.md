# Laporan Bug API — api.bagahproject.com

Tanggal awal: 2026-09-29
Pelapor: pengembang app Bagah Streaming (Android)
Base URL: `https://api.bagahproject.com/api/...`
Auth: header `x-api-key: ahmuqkey`

Cara reproduksi di bawah memakai `curl` dan satu skrip Python. Semua sudah saya uji.

---

## Pembaruan 2026-09-30

API dirombak besar: DramaBox, ReelShort, ShortMax, FreeReels, dan FlickReels kini memakai
endpoint terpadu `browse` (plus `detail`, `episode`, `search`); endpoint lama seperti
`dramabox/home`, `reelshort/homepage`, `*/episodes` sudah **dihapus**. Detail bentuk response
baru ada di dokumen per platform (`dramabox.md`, `reelshort.md`, `shortmax.md`,
`freereels.md`, `flickreels.md`).

Status temuan lama (diverifikasi ulang 2026-09-30):

| #  | Status saat ini                                                                                       |
| -- | ----------------------------------------------------------------------------------------------------- |
| #1 | Belum diuji ulang (melolo tidak berubah).                                                             |
| #2 | **Masih terjadi**: `pinedrama/episode` mengembalikan HTTP 400.                                        |
| #3 | **Masih terjadi**: `melolo/detail` tetap memotong presisi ID (`...8837` → `...9000`).                 |
| #4 | **Tidak lagi berlaku**: endpoint `dramabox/home` dihapus; `dramabox/browse` tidak lagi memuat item kosong. |
| A  | **Diperbaiki**: spec kini di `/api/v1/openapi.json` dengan server `/api`; endpoint nyata tetap berprefix `api/`. |
| B  | Sebagian: pagination tetap tidak konsisten (lihat dokumen per platform).                              |
| C  | **Masih**: `flickreels/browse type=latest` selalu 0 item.                                             |
| D  | **Masih**: `flickreels/browse type=ranking` identik dengan `trending`.                                |
| E  | **Masih**: `shortmax/search` dan `freereels/search` kadang mengirim `title` kosong.                   |

Temuan baru pada `browse`: `dramabox/browse type=foryou` sering mengirim `total_episodes: 0`
(pakai `type=classify` bila butuh jumlah episode), dan `flickreels/browse type=foryou`
memakai cursor `nextCursor` (bukan `page`).

---

## BUG #1 — Melolo: video MP4 tidak bisa diputar (file rusak)

**Severity:** Tinggi (fitur pemutaran Melolo tidak berfungsi)

**Endpoint:** `GET /api/melolo/episode?seriesId=7665176763617528837&episode=1`

**Gejala:** URL `data.urls.video_1` bisa diunduh (HTTP 206, ~10 MB), header MP4
(`ftypisom` → `moov`) normal, tapi **tidak bisa diputar** oleh ExoPlayer (Media3 1.5.0):

```
androidx.media3.common.ParserException: Invalid NAL length
  {contentIsMalformed=true, dataType=1}
    at Mp4Extractor.readSample(Mp4Extractor.java:913)
```

**Bukti tambahan:**

- File 64 byte pertama: `0000 001c 6674 7970 6973 6f6d ...` → MP4 valid secara struktur awal.
- `ffprobe` menerima file (durasi `120.697007`, video `hevc`, audio `aac`) **tetapi** melaporkan:
  ```
  [aac @ ...] Reserved bit set.
  [aac @ ...] Number of bands (32) exceeds limit (31).
  ```
  → indikasi bitstream audio rusak.
- `video_1` **sama persis** dengan `bestUrl` (tidak ada alternatif resolusi/format lain).
- Emulator uji **mendukung HEVC** (`C2SoftHevcDec` aktif), jadi bukan masalah codec device.
- Platform lain (DramaNova, MP4 biasa) **berhasil diputar** di player yang sama → bukan bug player client.

**Dugaan:** file MP4 dari sumber Melolo tidak konsisten untuk streaming progresif
(fragmen NAL corrupt). Mungkin perlu remux/re-encode di sisi API.

**Cara reproduksi:**

```bash
curl -s -H "x-api-key: ahmuqkey" \
  "https://api.bagahproject.com/api/melolo/episode?seriesId=7665176763617528837&episode=1" \
  | python3 -c "import sys,json;print(json.load(sys.stdin)['data']['urls']['video_1'])"
# lalu unduh URL tsb dan cek dengan ffprobe / coba putar
```

---

## BUG #2 — PineDrama: semua endpoint episode tidak mengembalikan video

**Severity:** Tinggi (PineDrama tidak bisa diputar sama sekali)

**Endpoint:**

- `GET /api/pinedrama/episode?collectionId=7674243081832125461&episode=1`
- `GET /api/pinedrama/episode?collectionId=7674243081832125461&episode=2`

**Gejala:** endpoint selalu gagal, padahal katalog (`trending`/`foryou`/`detail`) normal.

```json
{ "success": false, "message": "Episode video not found in response" }
```

Endpoint `GET /api/pinedrama/episodes?collectionId=7674243081832125461` juga
mengembalikan daftar kosong padahal `totalEpisodes: 62`:

```json
{
  "success": true,
  "collectionId": "7674243081832125461",
  "totalEpisodes": 62,
  "episodes": []
}
```

**Dampak:** fitur pemutaran PineDrama di app terpaksa dinonaktifkan (browse-only).

**Cara reproduksi:**

```bash
curl -s -H "x-api-key: ahmuqkey" \
  "https://api.bagahproject.com/api/pinedrama/episode?collectionId=7674243081832125461&episode=1"
curl -s -H "x-api-key: ahmuqkey" \
  "https://api.bagahproject.com/api/pinedrama/episodes?collectionId=7674243081832125461"
```

---

## BUG #3 — ID series 64-bit terpotong presisi di response Melolo

**Severity:** Sedang (memengaruhi konsumen API yang memakai ID dari response)

**Endpoint:** `GET /api/melolo/detail?seriesId=7665176763617528837`

**Gejala:** ID dikirim `7665176763617528837` tetapi di response JSON tertulis
`7665176763617529000`.

```
request seriesId : 7665176763617528837
response seriesId: 7665176763617529000   <-- berbeda!
```

**Penyebab dugaan:** nilai melebihi batas presisi aman angka 64-bit bila diproses
sebagai `double` (JavaScript / JSON number). Seharusnya dikirim sebagai **string**.

**Dampak nyata:** bila ID dari response dipakai untuk request berikutnya, API menolak:

```bash
# pakai ID asli -> BERHASIL
curl -s -H "x-api-key: ahmuqkey" \
  "https://api.bagahproject.com/api/melolo/episode?seriesId=7665176763617528837&episode=1"
# -> {"success":true,"message":"Episode stream fetched successfully"}

# pakai ID dari response detail -> GAGAL
curl -s -H "x-api-key: ahmuqkey" \
  "https://api.bagahproject.com/api/melolo/episode?seriesId=7665176763617529000&episode=1"
# -> {"success":false,"message":"Series 7665176763617529000 not found: 该剧集已下架"}
```

**Fix disarankan:** semua field ID (`id`, `series_id`, `episode_id`, `collection_id`)
dikirim sebagai **string**, bukan number. Ini juga berlaku untuk DramaNova dan ShortMax
yang punya ID panjang serupa.

---

## BUG #4 — `dramabox/home` menyertakan 1 item rusak per halaman

**Severity:** Sedang (menyebabkan HTTP 400 bila item ditap)

**Endpoint:** `GET /api/dramabox/home?page=1&lang=in` (berlaku untuk semua halaman)

**Gejala:** setiap halaman berisi **tepat satu item** dengan `series_id` kosong:

```json
{
  "series_id": "",
  "title": "",
  "description": "",
  "cover": "",
  "total_episodes": 0,
  "views": "7.1K",
  "category": null,
  "is_complete": false
}
```

**Dampak:** item ini tampil sebagai kartu kosong di UI. Jika ditap, app mengirim
`/api/dramabox/episodes?bookId=` (kosong) → **HTTP 400**.

```bash
curl -s -H "x-api-key: ahmuqkey" \
  "https://api.bagahproject.com/api/dramabox/episodes?bookId=&lang=in"
# -> HTTP 400
```

**Fix disarankan:** filter item tanpa `series_id` di sisi API.

---

## CATATAN (bukan bug, tapi bikin bingung)

### A. Prefix path harus `api/`, bukan `api/v1/`

Docs di https://api.bagahproject.com/docs menyebut `/api/v1/openapi.json` dan
server `"/api/v1"`, tetapi endpoint yang benar-benar jalan memakai prefix **`api/`**:

```bash
curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/v1/dramabox/home?lang=in"
# -> {"success":false,"message":"Endpoint not found"}   (404)

curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/dramabox/home?lang=in"
# -> 200 OK
```

**Saran:** selaraskan antara spec OpenAPI dan endpoint nyata.

### B. Parameter `page` tidak konsisten antar endpoint

| Endpoint                                 | `page` berfungsi? | Catatan                                                  |
| ---------------------------------------- | ----------------- | -------------------------------------------------------- |
| `dramabox/home`                          | ✅                | halaman tinggi (>~4) mengulang halaman 1                 |
| `dramabox/foryou`                        | ✅                |                                                          |
| `dramabox/search`                        | ✅                |                                                          |
| `dramabox/categories`                    | ❌                | tanpa param page                                         |
| `search` (melolo)                        | ❌                | `page` diabaikan                                         |
| `reelshort/search`                       | ✅                |                                                          |
| `reelshort/foryou`                       | ❌                | page 1 & 2 identik                                       |
| `reelshort/trending`/`latest`/`homepage` | ❌                | statis                                                   |
| `flickreels/foryou`                      | ❌                | page 1/2/3 identik                                       |
| `flickreels/latest`                      | ❌                | **selalu kosong (0 item)**                               |
| `flickreels/rankings`                    | ❌                | **identik 100% dengan `trending`**                       |
| `shortmax/search`                        | ✅                |                                                          |
| `shortmax/foryou`                        | ❌                | page 1/2/3 identik                                       |
| `dramanova/trending`                     | ✅                |                                                          |
| `freereels/foryou`                       | ⚠️                | **wajib cursor `next`**, param `offset` manual diabaikan |

**Saran:** dokumentasikan dengan jelas endpoint mana yang mendukung pagination,
dan samakan mekanismenya (page vs cursor).

### C. `flickreels/latest` selalu kosong

```bash
curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/flickreels/latest?lang=id"
# -> { "success": true, "title": "Terbaru", "page": 1, "items": [] }
```

Juga kosong untuk `lang=en` dan `page=2`. Kemungkinan endpoint belum terhubung ke data.

### D. `flickreels/rankings` duplikat persis `trending`

Kedua endpoint mengembalikan **42 item dengan urutan ID identik**:

```
trending n=42 rankings n=42 identik=True
```

### E. Judul kosong di sebagian hasil pencarian

`shortmax/search` dan `freereels/search` kadang mengembalikan item dengan `title: ""`
(mis. seriesId `zFtxTcWqvH`). Client menampilkannya sebagai "Tanpa Judul" agar tidak
jadi kartu kosong, tapi lebih baik API tidak mengirim judul kosong.

---

## Ringkasan prioritas

| Prioritas | Bug                         | Dampak                               |
| --------- | --------------------------- | ------------------------------------ |
| 🔴 Tinggi | #1 Melolo MP4 rusak         | Tidak bisa diputar                   |
| 🔴 Tinggi | #2 PineDrama episode kosong | Tidak bisa diputar                   |
| 🟡 Sedang | #3 ID 64-bit terpotong      | Request lanjutan gagal (400)         |
| 🟡 Sedang | #4 dramabox item rusak      | Kartu kosong + 400                   |
| 🟢 Info   | A–E                         | Inkonsistensi & data kosong/duplikat |
