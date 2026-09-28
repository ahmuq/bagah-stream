"""Referensi dekripsi DramaBox (skrip Python, untuk verifikasi).

DramaBox mengirim MP4 utuh terenkripsi AES-128-ECB per sample video.
Jalankan: python3 dramabox_decrypt_reference.py
"""

import requests
from Crypto.Cipher import AES

API = "https://api.bagahproject.com/api"
HEADERS = {"x-api-key": "ahmuqkey"}


def parse_mp4_samples(data: bytes):
    """Membaca posisi dan ukuran sample MP4 dari moov box."""
    out = []

    def kids(buf, s, e):
        i = s
        while i + 8 <= e:
            sz = int.from_bytes(buf[i:i + 4], "big")
            typ = buf[i + 4:i + 8]
            hdr = 16 if sz == 1 else 8
            if sz == 1:
                sz = int.from_bytes(buf[i + 8:i + 16], "big")
            elif sz == 0:
                sz = e - i
            if sz < 8 or i + sz > e:
                break
            yield typ, i + hdr, i + sz
            i += sz

    def collect(buf, s, e, want):
        found = {}
        stack = [(s, e)]
        while stack:
            a, b = stack.pop()
            for typ, ps, pe in kids(buf, a, b):
                if typ in (b"moov", b"trak", b"mdia", b"minf", b"stbl"):
                    stack.append((ps, pe))
                elif typ in want:
                    found[typ] = (ps, pe)
        return found

    for typ, ps, pe in kids(data, 0, len(data)):
        if typ != b"moov":
            continue
        for trk, a1, b1 in kids(data, ps, pe):
            if trk != b"trak":
                continue
            f = collect(data, a1, b1, (b"stsz", b"stco", b"stsc"))
            if not all(k in f for k in (b"stsz", b"stco", b"stsc")):
                continue
            a2, a3, a4 = f[b"stsz"][0], f[b"stco"][0], f[b"stsc"][0]
            ss = int.from_bytes(data[a2 + 4:a2 + 8], "big")
            cnt = int.from_bytes(data[a2 + 8:a2 + 12], "big")
            sizes = [ss] * cnt if ss else [
                int.from_bytes(data[a2 + 12 + 4 * k:a2 + 16 + 4 * k], "big") for k in range(cnt)
            ]
            nco = int.from_bytes(data[a3 + 4:a3 + 8], "big")
            coffs = [int.from_bytes(data[a3 + 8 + 4 * k:a3 + 12 + 4 * k], "big") for k in range(nco)]
            nsc = int.from_bytes(data[a4 + 4:a4 + 8], "big")
            sc = [
                (int.from_bytes(data[a4 + 8 + 12 * k:a4 + 12 + 12 * k], "big"),
                 int.from_bytes(data[a4 + 12 + 12 * k:a4 + 16 + 12 * k], "big"))
                for k in range(nsc)
            ]
            si = 0
            for ci, off in enumerate(coffs):
                per = 1
                for first, n in sc:
                    if ci + 1 >= first:
                        per = n
                for _ in range(per):
                    if si >= len(sizes):
                        break
                    out.append((off, sizes[si]))
                    off += sizes[si]
                    si += 1
    out.sort()
    return out


def download_and_decrypt(video_url: str, key_hex: str, output_path: str = "dramabox_episode.mp4"):
    print("Mengunduh video...")
    r = requests.get(video_url, headers={"User-Agent": "okhttp/4.12.0"})
    r.raise_for_status()
    raw = bytearray(r.content)

    cipher = AES.new(bytes.fromhex(key_hex), AES.MODE_ECB)

    print("Mendekripsi sample MP4...")
    for offset, size in parse_mp4_samples(raw):
        n = size - (size % 16)
        if n > 0:
            raw[offset:offset + n] = cipher.decrypt(bytes(raw[offset:offset + n]))

    with open(output_path, "wb") as f:
        f.write(raw)
    print(f"Video tersimpan di {output_path}")


if __name__ == "__main__":
    info = requests.get(
        f"{API}/dramabox/episode",
        headers=HEADERS,
        params={"bookId": "42000028264", "episode": 1, "lang": "in"},
    ).json()
    download_and_decrypt(info["best_url"], info["key_hex"])
