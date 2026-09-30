# Laporan Bug API — api.bagahproject.com

Tanggal: 2026-09-30 (diperbarui setelah perbaikan provider)
Pelapor: pengembang app Bagah Streaming (Android)
Base URL: `https://api.bagahproject.com/api/...`
Auth: header `x-api-key: ahmuqkey`
Spec: `https://api.bagahproject.com/api/v1/openapi.json`

Platform yang dipakai app: **AnimePlay, DramaBox, ReelShort, FreeReels, FlickReels,
ShortMax, NetShort, PineDrama**. Dokumen bentuk response per platform:
`dramabox.md`, `reelshort.md`, `freereels.md`, `flickreels.md`, `shortmax.md`,
`netshort.md`, `pinedrama.md`, `animeplay.md`.

---

## Ringkasan status

| Temuan                                                       | Status   |
| ------------------------------------------------------------ | -------- |
| `dramabox/episode` mengabaikan nomor episode                  | ✅ Fixed |
| `flickreels/episode` HTTP 400 pada episode terkunci           | ✅ Fixed |
| `dramabox/browse type=classify` + `genre` → kosong            | ✅ Fixed |
| `reelshort/browse type=classify` + `genre`/`region`           | ✅ Fixed |
| `flickreels/browse type=latest` selalu kosong                 | ✅ Fixed |
| `netshort/browse type=actorRanking` kosong                     | ✅ Fixed |
| Judul kosong di `shortmax/search` & `freereels/search`        | ✅ Fixed |
| `pinedrama/episode` kosong (tidak bisa diputar)               | ✅ Fixed |
| `shortmax/browse type=<classId>` set identik antar kelas       | ❌ Masih |
| `flickreels/browse type=ranking` duplikat `trending`          | ❌ Masih |
| `dramabox/browse type=foryou` `total_episodes: 0`             | ❌ Masih |
| `reelshort/browse type=classify` `tag` & `dub` diabaikan       | ❌ Masih |

---

## Temuan aktif

### #1 — `shortmax/browse type=<classId>` set identik antar kelas

Semua `classId` mengembalikan item yang sama (200001 = 200002 = 200003 = 200007).

```bash
for c in 200001 200002 200003 200007; do
  curl -s -H "x-api-key: ahmuqkey" "https://api.bagahproject.com/api/shortmax/browse?type=$c&lang=id" \
    | python3 -c "import sys,json;print([i['id'] for i in json.load(sys.stdin)['items']][:3])"
done
```

### #2 — `flickreels/browse type=ranking` duplikat `trending`

Kedua type mengembalikan 44 id dengan urutan identik.

### #3 — `dramabox/browse type=foryou` `total_episodes: 0`

Hampir semua item di `type=foryou` mengirim `total_episodes: 0`, sehingga badge episode
kosong. `type=classify` mengirim jumlah yang benar.

### #4 — `reelshort/browse type=classify` mengabaikan `tag` dan `dub`

`genre` dan `region` sudah berfungsi (hasil berbeda), tetapi `tag` dan `dub` masih
mengembalikan set 20 id yang sama seperti tanpa filter.

---

## Catatan

### A. Prefix path harus `api/`, bukan `api/v1/`

Spec OpenAPI menyebut server `"/api/v1"`, tetapi endpoint nyata memakai prefix **`api/`**
dan spec ada di `/api/v1/openapi.json`. Saran: selaraskan spec dengan endpoint nyata.

### B. Mekanisme pagination tidak konsisten (endpoint saat ini)

| Endpoint                               | Pagination                                |
| -------------------------------------- | ----------------------------------------- |
| `dramabox/browse` `foryou`/`classify`  | ✅ `page`                                 |
| `dramabox/browse` `theater`/`ranking`  | ❌ statis                                 |
| `dramabox/search`                      | ✅ `page`                                 |
| `reelshort/browse` `ranking`           | ✅ `period` + `page`                      |
| `reelshort/browse` `classify`          | ⚠️ `lastBookId` (page mengulang)          |
| `reelshort/search`                     | ✅ `page`                                 |
| `freereels/browse`                     | ✅ `cursor` (offset manual diabaikan)     |
| `freereels/search`                     | ✅ `cursor`                               |
| `flickreels/browse` `foryou`/`classify`| ✅ `cursor` (`nextCursor`)               |
| `flickreels/search`                    | ✅ `page`                                 |
| `shortmax/browse` `<classId>`          | ✅ `page` (+ `has_more`/`isEnd`)          |
| `shortmax/browse` `trending`/`latest`  | ❌ statis                                 |
| `shortmax/search`                      | ✅ `page`                                 |
| `netshort/browse` (semua type)         | ❌ statis                                 |
| `netshort/search`                      | ✅ `page`                                 |
| `pinedrama/browse` `foryou`            | ✅ `page`                                 |
| `pinedrama/browse` `<categoryId>`      | ✅ `cursor` (`has_more`)                  |
| `pinedrama/search`                     | ✅ `page`                                 |

**Saran:** dokumentasikan eksplisit mana yang pakai `page` vs `cursor`.

---

## Sudah diperbaiki (diverifikasi ulang 2026-09-30)

- ✅ **`dramabox/episode`** kini mengembalikan file video berbeda per episode
  (`episode=1/5/10` → `701554126` / `701554130` / `701554135`). DramaBox tidak lagi
  selalu memutar episode 1.
- ✅ **`flickreels/episode`** episode terkunci kini berhasil di-unlock otomatis
  (series `11684` ep 20 & 45 → HTTP 200 + URL; sebelumnya 400).
- ✅ **`dramabox/browse type=classify` + `genre`** mengembalikan item (15), sebelumnya kosong.
- ✅ **`reelshort/browse type=classify`** `genre` dan `region` kini mengubah hasil.
- ✅ **`flickreels/browse type=latest`** mengembalikan 12 item (sebelumnya kosong).
- ✅ **`netshort/browse type=actorRanking`** mengembalikan 30 item (sebelumnya kosong).
- ✅ **Judul kosong** pada `shortmax/search` dan `freereels/search` sudah tidak ada.
- ✅ **PineDrama**: `pinedrama/episode` mengembalikan MP4 langsung; `browse`/`search` tersedia.
- ✅ **DramaBox item rusak**: endpoint lama (yang menyertakan item `series_id` kosong) dihapus.
