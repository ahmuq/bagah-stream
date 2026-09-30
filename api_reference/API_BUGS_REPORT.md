# Laporan Bug API — api.bagahproject.com

Tanggal: 2026-09-30
Pelapor: pengembang app Bagah Streaming (Android)
Base URL: `https://api.bagahproject.com/api/...`
Auth: header `x-api-key: ahmuqkey`
Spec: `https://api.bagahproject.com/api/v1/openapi.json`

Platform yang dipakai app: **AnimePlay, DramaBox, ReelShort, FreeReels, FlickReels,
ShortMax, NetShort, PineDrama**. Semua sudah diverifikasi ulang pada 2026-09-30.
Dokumen bentuk response per platform: `dramabox.md`, `reelshort.md`, `freereels.md`,
`flickreels.md`, `shortmax.md`, `netshort.md`, `pinedrama.md`, `animeplay.md`.

---

## Ringkasan prioritas

| Prioritas | Temuan                                                        | Dampak                              |
| --------- | ------------------------------------------------------------- | ----------------------------------- |
| 🔴 Tinggi | `dramabox/episode` mengabaikan nomor episode                  | Selalu memutar episode 1            |
| 🔴 Tinggi | `flickreels/episode` HTTP 400 (sebagian episode terkunci)     | Episode tertentu tidak bisa diputar |
| 🟡 Sedang | `dramabox/browse type=classify` + `genre` → `items: []`       | Filter genre tak bisa dipakai       |
| 🟡 Sedang | `reelshort/browse type=classify` abaikan `tag/genre/region/dub` | Filter tak berfungsi              |
| 🟡 Sedang | `shortmax/browse type=<classId>` set identik antar kelas      | Filter kelas tak berfungsi          |
| 🟡 Sedang | `flickreels/browse type=latest` selalu kosong                 | Tidak ada konten "Terbaru"          |
| 🟢 Rendah | `flickreels/browse type=ranking` duplikat `trending`          | Tidak ada ranking asli              |
| 🟢 Rendah | Judul kosong di `shortmax/search` & `freereels/search`        | Kartu "Tanpa Judul"                 |
| 🟢 Rendah | `dramabox/browse type=foryou` `total_episodes: 0`             | Badge episode kosong                |
| 🟢 Rendah | `netshort/browse type=actorRanking` kosong                     | Fitur peringkat aktor kosong        |
| 🟢 Info   | Mekanisme pagination tidak konsisten                           | Lihat tabel pagination              |

---

## BUG #1 — `dramabox/episode` mengabaikan nomor episode (Tinggi)

**Endpoint:** `GET /api/dramabox/episode?bookId=<id>&episode=<n>&lang=in`

**Gejala:** semua nomor episode mengembalikan **file video yang sama** (selalu episode 1).
Hanya `episode_id` dan tanda tangan URL yang berbeda; nama file identik.

```bash
# Semua menghasilkan file yang sama (mis. 701554126.720p.wz.h264.encrypt.mp4):
curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/dramabox/episode?bookId=42000027287&episode=1&lang=in"  | python3 -c "import sys,json;print(json.load(sys.stdin)['best_url'].split('/')[-1][:46])"
curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/dramabox/episode?bookId=42000027287&episode=5&lang=in"  | python3 -c "import sys,json;print(json.load(sys.stdin)['best_url'].split('/')[-1][:46])"
curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/dramabox/episode?bookId=42000027287&episode=10&lang=in" | python3 -c "import sys,json;print(json.load(sys.stdin)['best_url'].split('/')[-1][:46])"
```

Hasil sama pada semua series yang diuji (`42000027287`, `42000029655`, `42000026344`),
baik lewat `best_url` maupun `qualities`. Parameter `chapterId` malah selalu HTTP 400.

**Dampak:** app selalu memutar episode 1 meski pengguna memilih episode lain.

**Fix disarankan:** agar `episode` (atau `chapterId` dengan format yang benar) memengaruhi
`best_url`/`qualities`.

---

## BUG #2 — `flickreels/episode` HTTP 400 pada sebagian episode terkunci (Tinggi)

**Endpoint:** `GET /api/flickreels/episode?seriesId=<id>&episode=<n>&lang=id`

**Gejala:** untuk sebagian series, episode yang ditandai terkunci (`locked: true` di
`detail.chapters`) gagal diambil:

```bash
# Series 11684 "Gelandangan Penyelamat NASA"
curl -s -o /dev/null -w "%{http_code}\n" -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/flickreels/episode?seriesId=11684&episode=1&lang=id"   # 200
curl -s -o /dev/null -w "%{http_code}\n" -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/flickreels/episode?seriesId=11684&episode=20&lang=id"  # 400
curl -s -o /dev/null -w "%{http_code}\n" -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/flickreels/episode?seriesId=11684&episode=45&lang=id"  # 400
```

**Inkonsisten:** series lain (`11694`, `8105`, `2846`, `11517`) episode terkuncinya
berhasil di-unlock otomatis (HTTP 200 + URL). Jadi perilaku unlock tidak seragam.

**Tambahan:** `flickreels/detail` `chapters[].bestUrl` untuk episode terkunci selalu kosong,
sehingga tidak ada URL cadangan dari sisi klien.

**Fix disarankan:** samakan perilaku auto-unlock ad-reward untuk semua series.

---

## BUG #3 — `dramabox/browse type=classify` + `genre` mengembalikan item kosong (Sedang)

`type=classify&genre=<id>` selalu `items: []`, baik memakai id enum OpenAPI
(`1362`, `1394`, …) maupun id asli dari `type=filters` (`1323`, `1337`, …). `type=classify`
tanpa `genre` normal (15 item).

```bash
curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/dramabox/browse?type=classify&genre=1323&lang=in" | python3 -c "import sys,json;print(len(json.load(sys.stdin).get('items',[])))"
# -> 0
```

Catatan terkait: `dub=1` mengembalikan daftar `filters`, bukan item. Enum `genre` di
OpenAPI tidak cocok dengan `value` pada `type=filters`.

---

## BUG #4 — `reelshort/browse type=classify` mengabaikan filter (Sedang)

Filter `tag`, `genre`, `region`, dan `dub` tidak berpengaruh: hasil tetap 20 id yang sama
seperti tanpa filter (Pria vs Perempuan 20/20 sama).

```bash
for q in "" "&genre=676d21074582b53a14081664" "&genre=676d21074582b53a14081663"; do
  curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/reelshort/browse?type=classify$q&lang=id" \
    | python3 -c "import sys,json;print([i['id'] for i in json.load(sys.stdin)['items']][:3])"
done
```

---

## BUG #5 — `shortmax/browse type=<classId>` set identik antar kelas (Sedang)

Semua `classId` mengembalikan item yang sama (200001 = 200002 = 200003 = 200007).

```bash
for c in 200001 200002 200003 200007; do
  curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/shortmax/browse?type=$c&lang=id" \
    | python3 -c "import sys,json;print([i['id'] for i in json.load(sys.stdin)['items']][:3])"
done
```

---

## BUG #6 — `flickreels/browse type=latest` selalu kosong (Sedang)

```bash
curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/flickreels/browse?type=latest&lang=id"
# -> { "success": true, "title": "Populer", "items": [] }
```

Kosong juga untuk `lang=en`. Dugaan endpoint belum terhubung ke data.

---

## BUG #7 — `flickreels/browse type=ranking` duplikat `trending` (Rendah)

Kedua type mengembalikan 42 id dengan urutan identik.

---

## BUG #8 — Judul kosong di hasil pencarian (Rendah)

`shortmax/search` dan `freereels/search` kadang mengirim `title: ""` (mis. seriesId
`zFtxTcWqvH`). Klien menampilkan "Tanpa Judul" agar tidak jadi kartu kosong, tapi lebih
baik API tidak mengirim judul kosong.

---

## BUG #9 — `dramabox/browse type=foryou` `total_episodes: 0` (Rendah)

Hampir semua item di `type=foryou` mengirim `total_episodes: 0`, sehingga badge episode
kosong. `type=classify` mengirim jumlah yang benar.

---

## BUG #10 — `netshort/browse type=actorRanking` kosong (Rendah)

```bash
curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/netshort/browse?type=actorRanking&lang=id_ID"
# -> { "success": true, "total": 0, "items": [] }
```

---

## Catatan

### A. Prefix path harus `api/`, bukan `api/v1/`

Spec OpenAPI menyebut server `"/api/v1"`, tetapi endpoint nyata memakai prefix **`api/`**
dan spec ada di `/api/v1/openapi.json`. Saran: selaraskan spec dengan endpoint nyata.

### B. Mekanisme pagination tidak konsisten (endpoint saat ini)

| Endpoint                              | Pagination                                    |
| ------------------------------------- | --------------------------------------------- |
| `dramabox/browse` `foryou`/`classify` | ✅ `page`                                     |
| `dramabox/browse` `theater`/`ranking` | ❌ statis                                     |
| `dramabox/search`                     | ✅ `page`                                     |
| `reelshort/browse` `ranking`          | ✅ `period` + `page`                          |
| `reelshort/browse` `classify`         | ⚠️ `lastBookId` (page mengulang)              |
| `reelshort/search`                    | ✅ `page`                                     |
| `freereels/browse`                    | ✅ `cursor` (offset manual diabaikan)         |
| `freereels/search`                    | ✅ `cursor`                                   |
| `flickreels/browse` `foryou`/`classify`| ✅ `cursor` (`nextCursor`)                   |
| `flickreels/search`                   | ✅ `page`                                     |
| `shortmax/browse` `<classId>`         | ✅ `page` (+ `has_more`/`isEnd`)              |
| `shortmax/browse` `trending`/`latest` | ❌ statis                                     |
| `shortmax/search`                     | ✅ `page`                                     |
| `netshort/browse` (semua type)        | ❌ statis                                     |
| `netshort/search`                     | ✅ `page`                                     |
| `pinedrama/browse` `foryou`           | ✅ `page`                                     |
| `pinedrama/browse` `<categoryId>`     | ✅ `cursor` (`has_more`)                      |
| `pinedrama/search`                    | ✅ `page`                                     |

**Saran:** dokumentasikan eksplisit mana yang pakai `page` vs `cursor`.

---

## Sudah diperbaiki

- ✅ **PineDrama** (2026-09-30): `pinedrama/episode` kini mengembalikan MP4 langsung
  (TikTok CDN) dan bisa diputar; ditambah `browse` (foryou/trending/categories/category)
  dan `search`. Lihat `pinedrama.md`.
- ✅ **DramaBox item rusak**: endpoint lama `dramabox/home` (yang menyertakan 1 item dengan
  `series_id` kosong) sudah dihapus; `dramabox/browse` tidak lagi memuat item tersebut.
