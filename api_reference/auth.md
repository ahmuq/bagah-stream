# Auth API (bagahproject)

Base: `https://api.bagahproject.com/api/...`

## `GET /api/check-key`

Validasi API key. Dipakai untuk login di app.

| Param    | In    | Wajib | Keterangan              |
| -------- | ----- | ----- | ----------------------- |
| `apikey` | query | ya*   | Bisa juga via header `x-api-key` |

\* Di app, key dikirim sebagai header `x-api-key` (dan query `apikey`) oleh interceptor.

Response sukses:

```json
{
  "success": true,
  "message": "API key is valid",
  "data": {
    "name": "Ahlul Mukhramin",
    "email": "ahlul963@gmail.com",
    "tier": "PREMIUM",
    "role": "ADMIN",
    "limit": "Unlimited",
    "used_today": 1229,
    "remaining": "Unlimited",
    "total_used": 4311,
    "reset_at": "2026-09-30T16:59:59.999Z",
    "is_active": true,
    "premium_expires": "2026-03-27T21:30:43.758Z",
    "created_at": "2026-02-15T19:47:42.361Z"
  }
}
```

- `limit` dan `remaining` bisa berupa string (`"Unlimited"`) atau angka.
- Key tidak valid / tidak aktif → `success: false` (HTTP 401/403) dengan `message` penjelasan.

## Catatan implementasi app

- Key disimpan di `SharedPreferences` (`bagah_session`) lewat `SessionStore`, jadi tidak
  perlu login ulang setelah app ditutup. Hilang hanya jika data app dihapus / app di-uninstall.
- `NetworkClient` memakai key dinamis (tidak lagi hardcode), dipasang via `NetworkClient.setApiKey()`.
- Halaman **Profil** menampilkan info dari `check-key` (nama, email, tier, role, limit, pemakaian),
  plus tombol **Bersihkan Cache** dan **Keluar**.
