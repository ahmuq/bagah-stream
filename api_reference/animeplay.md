Anime Play Detail

const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/animeplay/detail?apikey=ahmuqkey&url=asura",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "message": "Detail fetched successfully",
  "data": {
    "data": [
      {
        "id": 150763,
        "series_id": "asura",
        "bookmark": null,
        "cover": "https://cdn.myanimelist.net/images/anime/7/44289l.jpg",
        "judul": "Asura",
        "type": "Movie",
        "countdown": null,
        "status": "Completed",
        "rating": "6.97",
        "published": "29 September 2019",
        "author": "Toei Animation",
        "genre": [
          "Award Winning",
          "Drama"
        ],
        "genreurl": [
          "Award Winning",
          "Drama"
        ],
        "sinopsis": "Asura adalah drama gelap yang tak kenal ampun yang mengisahkan perjuangan seorang anak laki-laki yang melakukan segala cara untuk bertahan hidup di tengah perang dan kelaparan di Jepang abad pertengahan.",
        "history": [
          "1"
        ],
        "historyDurasi": [
          1
        ],
        "historyDurasiFull": [
          1
        ],
        "chapter": [
          {
            "id": 107138,
            "ch": "1",
            "url": "al-150763-1",
            "date": "12 Mei, 2026",
            "history": "",
            "views": 404,
            "lastDurasi": null,
            "fullDurasi": null
          }
        ]
      }
    ]
  }
}

Anime Play Episode
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/animeplay/episode?apikey=ahmuqkey&url=al-1404-13&quality=480p",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "message": "Episode streams fetched successfully",
  "data": {
    "episode_id": 66128,
    "quality": "720p",
    "available": [
      "360p",
      "480p",
      "720p",
      "1080p"
    ],
    "links": [
      {
        "link": "https://s3.animeverse.id/jembut/AnimeLovers_NGame--OVA_720p.mp4",
        "provide": 871,
        "id": 452449,
        "reso": "720p",
        "size_kb": 91255
      },
      {
        "link": "https://sjkt.animekita.org/AnimeLovers_NGame--OVA_720p.mp4",
        "provide": 15,
        "id": 428281,
        "reso": "720p",
        "size_kb": null
      }
    ]
  }
}

Anime Play Latest
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/animeplay/latest?apikey=ahmuqkey&page=1",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);
{
  "success": true,
  "message": "Latest anime fetched successfully",
  "data": [
    {
      "id": "151748",
      "url": "ladies-versus-butlers",
      "judul": "Ladies versus Butlers!",
      "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/7/75252l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Comedy",
        "Romance",
        "Ecchi"
      ],
      "sinopsis": "Walküre dan Delta Flight menggunakan musik untuk menyelamatkan orang dari Sindrom Vár, penyakit yang sebelumnya tidak diketahui yang membuat manusia dan orang lain mengamuk. Namun, mereka mendapati diri mereka menghadapi ancaman baru…",
      "studio": "Xebec",
      "score": "6.53",
      "status": "Completed",
      "rilis": "5 Januari 2010",
      "total_episode": 12
    },
    {
      "id": "669",
      "url": "shinmai-rno-tenpo-sub-indo/",
      "judul": "Shinmai Renkinjutsushi no Tenpo Keiei",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/03/27/series-669-anilist-139369-105856-c0141c68.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Adventure",
        "Fantasy",
        "Slice Of Life"
      ],
      "sinopsis": "Sarasa, seorang yatim piatu yang baru lulus dari Akademi Alkimia Kerajaan, akhirnya merasa satu langkah lagi menuju hidup elegan dan penuh kemewahan yang selama ini ia impikan. Sebagai hadiah kelulusan, gurunya memberinya sebuah rumah untuk dijadikan toko, tempat Sarasa bisa memulai bisnisnya sendiri.\n\nNamun, harapan indah itu langsung diuji ketika “toko” barunya ternyata bangunan reyot yang letaknya terpencil, jauh dari keramaian. Terjebak di tengah tempat yang nyaris tak tersentuh, Sarasa harus mengumpulkan bahan dari alam liar yang berbahaya, menghadapi makhluk-makhluk mengerikan, dan memutar otak agar ada pelanggan yang mau datang. Di antara kerja keras dan ide-ide kreatifnya, Sarasa perlahan menapaki jalan menuju mimpinya menjadi alkemis terhebat.",
      "studio": "ENGI",
      "score": "6.5",
      "status": "Completed",
      "rilis": "Okt 03, 2022",
      "total_episode": 12
    },
    {
      "id": "148929",
      "url": "yuru-camp△-season-2",
      "judul": "Yuru Camp△ Season 2",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/05/03/series-148929-anilist-104459-222632-d840b3d3.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Slice of Life"
      ],
      "sinopsis": "Setelah menghabiskan liburan Natal dengan teman-teman barunya, Rin Shima kembali menikmati camping sendirian untuk menyambut Tahun Baru dengan melihat matahari terbit di tepi laut. Semuanya berjalan sesuai rencana, sampai cuaca tak terduga menutup akses jalan pulang dan membuatnya harus bertahan lebih lama dari yang diperkirakan. Di tengah situasi itu, Nadeshiko Kagamihara mengulurkan tangan dan mengundangnya menginap di rumah neneknya.\n\nPerjalanan yang seharusnya hanya dua hari pun berubah menjadi rangkaian jalan-jalan santai dan pengalaman baru. Rin menikmati momen-momen hangat yang tak terduga, bertemu kembali dengan wajah-wajah yang familiar, sekaligus berkenalan dengan orang-orang baru yang mewarnai petualangannya.",
      "studio": "C-Station",
      "score": "8.4",
      "status": "Completed",
      "rilis": "Jan 7, 2021",
      "total_episode": 13
    },
    {
      "id": "342",
      "url": "high-on-school-dxd-season-2-subtitle-indonesia/",
      "judul": "High School DxD Season 2",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/03/15/series-342-anilist-15451-102513-6094a0d9.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Action",
        "Comedy",
        "Demons",
        " ",
        "Harem",
        "Romance",
        "School"
      ],
      "sinopsis": "Issei Hyoudou kembali dengan petualangan yang makin heboh di musim kedua High School DxD. Aksi pertarungan supernatural yang intens berpadu dengan fan service tanpa rem, menghadirkan deretan gadis sekolah “berbahaya” yang siap membuat hari-hari Issei semakin kacau sekaligus menggiurkan. Bagi yang mencari hiburan penuh adrenalin, komedi, dan godaan khas DxD, Season 2 siap menaikkan level keseruannya.\n\nMusim ini sempat menayangkan pratinjau episode pertamanya di Tokyo sebelum akhirnya mulai tayang reguler pada Juli 2013. Versi Blu-ray dan DVD Director’s Cut juga menambahkan sekitar tiga menit ekstra di setiap episode untuk pengalaman yang lebih lengkap.",
      "studio": "TNK",
      "score": "7.1",
      "status": "Completed",
      "rilis": "Jul 7, 2013",
      "total_episode": 12
    },
    {
      "id": "148922",
      "url": "free-gantungan-kunci-dan-stiker-anime",
      "judul": "Free Gantungan Kunci dan Stiker Anime",
      "cover": "https://i0.wp.com/animekita.org/cover/iVSFgvaWK4bitCGypbCc1-9D7rh2x88eaxcLEY7x1dKkH2Oc7078u-cG0ADJsDlMXqEe=w240-h480-rw",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Pengumuman"
      ],
      "sinopsis": "Halooo AnimeLovers V2 lagi bagi bagi gantungan kunci dan stiker anime gratis nih.. kalian bisa ambil di beberapa event jejepangan (untuk tempat akan selalu di infokan di instagram resmi @animeloversidv2) dan kalian juga bisa klaim gratis dikirim secara online di update aplikasi berikutnya, silahkan buka Episode Info di bawah ini..",
      "studio": "AniVerse ID",
      "score": "10",
      "status": "Completed",
      "rilis": "30 Agustus 2023",
      "total_episode": 1
    },
    {
      "id": "81",
      "url": "world-star-sub-indo/",
      "judul": "World Dai Star",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/03/09/series-81-anilist-157765-111230-b0c747fd.png",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Performing Arts"
      ],
      "sinopsis": "Teater mengguncang dunia sepanjang abad ke-20, dan Kokona Ohtori, seorang remaja yang memimpikan panggung besar, bertekad ikut bersinar di tengah demam pertunjukan ini. Para performer yang paling memukau dijuluki Dai Star, dan bagi Kokona, langkah pertamanya menuju sorotan adalah mengikuti audisi untuk bergabung dengan rombongan teater ternama, Sirius.\n\nSaat ia mulai mengasah kepekaan uniknya terhadap panggung, Kokona perlahan menemukan arti kerja keras, gairah, dan ambisi dalam era super-teater, tempat setiap penampilan bisa mengubah segalanya.",
      "studio": "Lerche",
      "score": "7.2",
      "status": "Completed",
      "rilis": "Apr 09, 2023",
      "total_episode": 12
    },
    {
      "id": "151211",
      "url": "gakuen-utopia-manabi-straight",
      "judul": "Gakuen Utopia Manabi Straight!",
      "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/13/4907l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Comedy"
      ],
      "sinopsis": "Manabi Straight! mengikuti kehidupan sekelompok siswi SMA di tahun 2035 saat mereka bersekolah di SMA khusus perempuan Seioh. Karena angka kelahiran telah menurun drastis, sekolah-sekolah ditutup karena kekurangan siswa yang tersedia untuk diajar. Semangat di sekolah-sekolah telah menurun drastis, dan Seioh tidak terkecuali.\r\n\r\nCerita dimulai ketika tokoh utama, Manami Amamiya, pindah ke Seioh. Setelah beberapa kejadian lucu yang melibatkan skuter futuristik dan perlombaan renang, diikuti oleh penampilan lagu sekolah yang inspiratif, ia dilantik sebagai ketua OSIS. Kisah selanjutnya berkaitan dengan Manami yang bekerja sama dengan Mika Inamori, satu-satunya anggota OSIS lainnya, dan tiga teman sekelas lainnya bernama Mutsuki Uehara, Mei Etoh, dan Momoha Odori, dalam urusan OSIS. Setelah beberapa renovasi ruang OSIS, Manami dan teman-temannya mulai merencanakan festival siswa yang akan datang.",
      "studio": "ufotable",
      "score": "7.25",
      "status": "Completed",
      "rilis": "8 Januari 2007",
      "total_episode": 12
    },
    {
      "id": "900",
      "url": "tensai-no-akaji-sub-indo/",
      "judul": "Tensai Ouji no Akaji Kokka Saisei Jutsu",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/03/31/series-900-anilist-129190-102337-928ff78f.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Comedy",
        "Fantasy"
      ],
      "sinopsis": "Di sebuah negeri jauh, hiduplah seorang pangeran jenius yang selalu dipuji karena kecerdasannya. Bersama rakyatnya, ia turun ke medan perjuangan dan memimpin mereka meraih banyak kemenangan, menjadikannya sosok yang sulit tergantikan.\n\nNamun di balik semua kejayaan itu, tersimpan satu kebenaran yang tak banyak diketahui. Alih-alih mengejar kebesaran, sang pangeran sebenarnya hanya ingin melepaskan semuanya dan menjalani hidup yang tenang.",
      "studio": "Yokohama Animation Lab",
      "score": "7.2",
      "status": "Completed",
      "rilis": "Jan 11, 2022",
      "total_episode": 12
    },
    {
      "id": "152302",
      "url": "maken-ki",
      "judul": "Maken-Ki!",
      "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/1215/123362l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Action",
        "Ecchi"
      ],
      "sinopsis": "Berdasarkan serial manga karya Hiromitsu Takeda, komedi romantis ini berkisah tentang Takeru Ohyama, tipikal remaja laki-laki mesum. Sekolah barunya tidak memerlukan ujian masuk, dan hanya berubah menjadi mahasiswi! Sayangnya, mimpinya tentang kehidupan sekolah menengah yang bahagia pupus ketika dia mengetahui bahwa sekolah tersebut lebih dari yang terlihat.\r\nSemua siswa menggunakan benda khusus—Maken—untuk mengeluarkan kemampuan magis mereka dalam duel! Bisakah Takeru menemukan Maken yang cocok untuknya? Bahkan ketika mencoba menyesuaikan diri di sekolah baru dan menghadapi segala macam masalah perempuan?",
      "studio": "AIC Spirits",
      "score": "6.3",
      "status": "Completed",
      "rilis": "5 Oktober 2011",
      "total_episode": 12
    },
    {
      "id": "152149",
      "url": "paripi-koumei-road-to-summer-sonia",
      "judul": "Paripi Koumei: Road to Summer Sonia",
      "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/1465/140538l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Comedy"
      ],
      "sinopsis": "Film kompilasi Paripi Koumei.",
      "studio": "P.A. Works",
      "score": "7.15",
      "status": "Completed",
      "rilis": "01 Maret 2024",
      "total_episode": 1
    },
    {
      "id": "151958",
      "url": "honor-of-kings-glory-arc",
      "judul": "Honor of Kings: Glory Arc",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/02/bfe4033559a6996d.webp",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Action",
        "Adventure",
        "Fantasy"
      ],
      "sinopsis": "Honor of Kings: Glory Arc berlatar di sebuah benua luas tempat para pahlawan menembus berbagai rintangan demi mengejar impian mereka.\r\n\r\nApa arti menjadi seorang pahlawan? Mereka terus melampaui batas diri dan berusaha mencapai kesempurnaan. Mereka memikul tanggung jawab dengan tekun serta memahami makna cinta yang sejati. Dalam perjalanan itu, mereka mengejar kekuatan dan tetap teguh tanpa menyerah.",
      "studio": "Cloud Art, Original Force",
      "score": "8.83",
      "status": "Completed",
      "rilis": "Jan 13, 2024",
      "total_episode": 4
    },
    {
      "id": "151416",
      "url": "hoozuki-no-reitetsu-2nd-season-sono-ni",
      "judul": "Hoozuki no Reitetsu 2nd Season: Sono Ni",
      "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/1113/92465l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Comedy",
        "Fantasy"
      ],
      "sinopsis": "The second cour of Hoozuki no Reitetsu season 2.",
      "studio": "Studio Deen",
      "score": "7.85",
      "status": "Completed",
      "rilis": "8 April 2018",
      "total_episode": 13
    },
    {
      "id": "151300",
      "url": "hyakka-ryouran-samurai-after",
      "judul": "Hyakka Ryouran: Samurai After",
      "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/6/73391l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Ecchi"
      ],
      "sinopsis": "OVA yang disertakan dalam Niθ Art Works Vol. 2, menampilkan karakter baru bernama Kagekatsu Uesugi.",
      "studio": "Arms",
      "score": "6.63",
      "status": "Completed",
      "rilis": "23 Januari 2015",
      "total_episode": 2
    },
    {
      "id": "152360",
      "url": "planzet",
      "judul": "Planzet",
      "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/1592/112151l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Sci-Fi"
      ],
      "sinopsis": "Pada tahun 2047, sebuah bentuk kehidupan alien yang tidak dikenal turun ke Bumi, menghancurkan semua kota besar dalam sekejap. Para penyintas bersatu dan membangun Diffusor untuk menghentikan Februus, para penyerbu yang kemudian diberi kode nama FOS oleh militer, dan perdamaian sementara pun tercapai. Lompat ke tahun 2053, masa kini. PLANZET: Rencana terakhir, Rencana Zed, untuk merebut kembali Planet Bumi. Sebuah serangan balik terakhir yang putus asa terhadap musuh. Hiroshi Akishima, seorang prajurit di Aliansi Pasukan Pertahanan Planet, sangat ingin membalas dendam kepada alien yang bertanggung jawab atas kematian ayahnya enam tahun lalu. Namun, serangan baru ini mengharuskan Diffusor dijatuhkan, membuat seluruh planet kembali sangat rentan. Akankah umat manusia merebut kembali bintang-bintang atau kehilangan segalanya dalam pertaruhan terakhir yang paling menentukan?",
      "studio": "CoMix Wave Films",
      "score": "5.53",
      "status": "Completed",
      "rilis": "22 Mei 2010",
      "total_episode": 1
    },
    {
      "id": "151466",
      "url": "good-night-world",
      "judul": "Good Night World",
      "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/1330/137476l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Drama",
        "Fantasy"
      ],
      "sinopsis": "Dalam game online \"Planet,\" terdapat tim kuat yang terdiri dari empat pemain. Tim ini bernama \"Keluarga Akabane,\" dan anggotanya adalah keluarga semu yang hanya ada di dalam game. Meskipun mereka tidak menyadarinya, keempat pemain ini sebenarnya adalah keluarga yang berantakan di kehidupan nyata.\r\n\r\nSeorang kakak laki-laki yang tertutup. Seorang adik laki-laki yang berprestasi tinggi. Seorang ayah yang tidak dihormati oleh anak-anaknya sendiri. Seorang ibu yang mengabaikan rumah tangganya sendiri. Mereka tidak mengenal kehangatan keluarga. Mereka juga tidak tahu bahwa kehangatan keluarga online mereka hanyalah perasaan sementara. Dan yang terpenting, mereka tidak tahu bahwa mereka adalah keluarga sungguhan.\r\n\r\nBerpusat pada perbuatan Keluarga Akabane dalam game online \"Planet,\" cerita ini menampilkan pertempuran melawan monster, bentrokan dengan guild lain, dan intrik seputar \"Black Bird,\" tujuan akhir permainan. Kisah ini mengalami perubahan besar ketika melibatkan dunia nyata dan keluarga sungguhan ini.",
      "studio": "NAZ",
      "score": "7",
      "status": "Completed",
      "rilis": "12 Oktober 2023",
      "total_episode": 12
    },
    {
      "id": "1066",
      "url": "high-girl-sub-indo/",
      "judul": "High Score Girl",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/04/03/series-1066-anilist-20574-193824-4503e1b3.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Comedy",
        "Romance",
        "School",
        "Seinen"
      ],
      "sinopsis": "Tahun 1991, Yaguchi Haruo, murid kelas 6 yang hidupnya hanya berputar di video game, sama sekali bukan anak yang menonjol di sekolah. Ia tidak populer, tidak punya pesona, dan nyaris tak punya kelebihan selain satu hal, kemampuan bermain game yang membuatnya merasa punya tempat.\n\nNamun di sebuah arcade, keyakinannya runtuh saat ia bertemu Oono Akira, teman sekelas yang terkenal, pintar, cantik, dan berasal dari keluarga kaya. Akira melumatnya habis di Street Fighter II, lalu terus muncul dari satu arcade ke arcade lain sepulang sekolah, selalu membuat Haruo kalah di setiap permainan. Dari persaingan yang konyol dan melelahkan itu, perlahan tumbuh ikatan aneh yang tanpa disangka membawa keduanya pada sebuah persahabatan yang unik.",
      "studio": "J.C.Staff",
      "score": "7.5",
      "status": "Completed",
      "rilis": "Jul 14, 2018",
      "total_episode": 12
    },
    {
      "id": "1305",
      "url": "kotoura-san",
      "judul": "Kotoura-san",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/04/07/series-1305-anilist-15379-210527-10d124bf.png",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Comedy",
        "Romance"
      ],
      "sinopsis": "Kotoura Haruka, gadis 15 tahun yang mampu membaca pikiran orang lain, telah lama hidup dalam kesepian akibat kemampuan yang justru membawa masalah besar hingga keluarganya berantakan. Saat pindah ke SMA baru, ia memilih menjaga jarak dan menutup diri, takut luka lama terulang.\n\nNamun, segalanya mulai berubah ketika Manabe Yoshihisa, teman sekelasnya yang blak-blakan, justru menerima dan menghargai kemampuan Kotoura. Dengan dukungannya, Kotoura perlahan berani membuka hati dan mulai membangun hubungan dengan teman-teman di sekitarnya, dalam komedi romantis sekolah yang hangat dan penuh kejutan.",
      "studio": "AIC Classic",
      "score": "6.8",
      "status": "Completed",
      "rilis": "Jan 11, 2013",
      "total_episode": 12
    },
    {
      "id": "151898",
      "url": "candle-in-the-tomb-return-to-the-south-sea",
      "judul": "Candle in the Tomb: Return to the South Sea",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/02/5cd773362362b9df.webp",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Action",
        "Adventure"
      ],
      "sinopsis": "Hu Bayi dan kawan-kawan menerima permintaan dari Profesor Chen untuk pergi ke Pulau Kuil Karang di Laut Selatan. Mereka menyewa Ruan Hei dan muridnya, lalu menaiki kapal Trident menuju Spiral Karang guna mencari Cermin Pendeteksi Tulang Raja Qin.\r\nSetelah mengalami berbagai petualangan, mereka terjatuh ke dalam “Reruntuhan Kembali” (Guixu) dan menemukan cermin kuno di dalam bangkai kapal. Di sana, mereka juga mengetahui bahwa Ruan Hei adalah musuh dari Duo Ling.\r\nSaat sedang beristirahat setelah berhasil melarikan diri, tiba-tiba muncul seorang misterius yang mendekati Uncle Ming yang sedang berjaga malam, sambil membawa tongkat.",
      "studio": "Original Force, Wonder Cat Animation",
      "score": "8.00",
      "status": "Ongoing",
      "rilis": "Aug 23, 2025",
      "total_episode": 9
    },
    {
      "id": "151284",
      "url": "future-gpx-cyber-formula-11",
      "judul": "Future GPX Cyber Formula 11",
      "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/1686/117415l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Drama",
        "Sci-Fi"
      ],
      "sinopsis": "Kini tiba saatnya Grand Prix Dunia Cyber ​​Formula ke-11. Dengan segala harapan dan tekanan yang diletakkan padanya, Hayato Kazami berjuang untuk mendapatkan kembali performa juara yang dimilikinya setahun lalu. Terlebih lagi, Osamu Sugo, alias Knight Schumacher, telah kembali ke kompetisi dan menyatakan Hayato sebagai musuhnya. Hayato, dengan Super Asurada AKF-11 yang baru, kini harus mengalahkan seseorang yang pernah sangat ia percayai untuk mengamankan gelar juara keduanya.",
      "studio": "Sunrise",
      "score": "7.32",
      "status": "Completed",
      "rilis": "1 November 1992",
      "total_episode": 6
    },
    {
      "id": "1297",
      "url": "dafrog-sub-indo/",
      "judul": "D-Frag!",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/04/06/series-1297-anilist-20031-134526-db0de2ab.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [],
      "sinopsis": "Kazama Kenji menganggap dirinya seorang berandalan, dan anehnya banyak orang juga percaya begitu. Namun semuanya berubah saat ia dan gengnya bertemu empat gadis yang sama sekali tidak “normal” yaitu Chitose, Sakura, Minami, dan Roka, yang tingkahnya jauh lebih gila daripada reputasi Kenji sendiri.\n\nTanpa banyak pilihan, Kenji terseret untuk bergabung dengan klub mereka. Sejak saat itu, hari-harinya yang seharusnya biasa saja mulai berubah menjadi rangkaian kekacauan kocak yang sulit ia kendalikan.",
      "studio": "N/A",
      "score": "7.3",
      "status": "N/A",
      "rilis": "N/A",
      "total_episode": 13
    },
    {
      "id": "151149",
      "url": "fullmetal-alchemist",
      "judul": "Fullmetal Alchemist",
      "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/10/75815l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Action",
        "Adventure",
        "Award Winning",
        "Drama",
        "Fantasy"
      ],
      "sinopsis": "Edward Elric, seorang alkemis muda yang brilian, telah kehilangan banyak hal dalam hidupnya yang baru berusia dua belas tahun: ketika ia dan saudara laki-lakinya, Alphonse, mencoba membangkitkan kembali ibu mereka yang telah meninggal melalui tindakan transmutasi manusia yang terlarang, Edward kehilangan saudara laki-lakinya serta dua anggota tubuhnya. Dengan keterampilan alkimia yang luar biasa, Edward mengikat jiwa Alphonse ke dalam sebuah baju zirah besar.\r\n\r\nSetahun kemudian, Edward, yang kini telah dipromosikan menjadi alkemis logam penuh negara, memulai perjalanan bersama adik laki-lakinya untuk mendapatkan Batu Filsuf. Benda mitos yang legendaris itu dikabarkan mampu meningkatkan kemampuan seorang alkemis secara drastis, sehingga memungkinkan mereka untuk mengesampingkan hukum dasar alkimia: untuk mendapatkan sesuatu, seorang alkemis harus mengorbankan sesuatu yang nilainya setara. Edward berharap dapat memanfaatkan sumber daya militer untuk menemukan batu legendaris tersebut dan mengembalikan tubuhnya dan tubuh Alphonse ke keadaan normal. Namun, kakak beradik Elric segera menemukan bahwa batu legendaris itu menyimpan lebih banyak rahasia daripada yang terlihat, dan mereka pun dibawa ke pusat pertempuran yang jauh lebih gelap daripada yang pernah mereka bayangkan.",
      "studio": "Bones",
      "score": "8.11",
      "status": "Completed",
      "rilis": "04 September 2003",
      "total_episode": 51
    },
    {
      "id": "89",
      "url": "kamisama-katsudou-sub-indo/",
      "judul": "Kaminaki Sekai no Kamisama Katsudou",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/03/09/series-89-anilist-148048-111635-bf3ad246.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Action",
        "Comedy",
        " ",
        "Fantasy",
        "Isekai",
        "Reincarnation",
        "Seinen"
      ],
      "sinopsis": "Sebagai pewaris pemimpin sekte, Yukito menjalani hidupnya dalam bayang-bayang dewi misterius bernama Mitama. Namun sebuah ritual yang berakhir kacau merenggut nyawanya, dan ia pun terbangun kembali di dunia baru yang sama sekali tak mengenal konsep Tuhan.\n\nDi tempat ini, hidup dan mati ditentukan oleh Negara Kekaisaran. Saat Yukito berjuang melindungi desa barunya dari sistem yang kejam, sebuah sosok yang seharusnya tertinggal di kehidupan lamanya tiba-tiba muncul untuk memberinya bantuan, membuka jalan bagi perubahan yang tak terduga.",
      "studio": "Studio Palette",
      "score": "6.5",
      "status": "Completed",
      "rilis": "Apr 06, 2023",
      "total_episode": 12
    },
    {
      "id": "149167",
      "url": "shy-2nd-season",
      "judul": "Shy 2nd Season",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/05/19/series-149167-anilist-171748-121518-117be9dc.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Action",
        "Drama"
      ],
      "sinopsis": "Setelah pertarungan melawan organisasi Amalareik yang dipimpin bocah misterius bernama Stigma, Shy perlahan mulai bertumbuh dan lebih berani menghadapi perannya sebagai pahlawan. Namun ketenangan itu tak berlangsung lama. Sepulangnya ke Jepang, ia bertemu Ai Tennouji, seorang gadis yang kabur dari desa ninjanya demi mengejar salah satu anggota Amalareik, membuat Shy kembali terseret ke bayang-bayang ancaman yang belum usai.\n\nDi saat yang sama, Tokyo tiba-tiba diselimuti bola hitam raksasa dan menghilang begitu saja. Para pahlawan pun dikerahkan untuk menyelamatkan kota yang lenyap, sementara Shy harus melangkah maju menghadapi misteri yang kian menyesakkan dan musuh yang terus mengintai.",
      "studio": "8bit",
      "score": "6.8",
      "status": "Completed",
      "rilis": "Jul 2, 2024",
      "total_episode": 12
    },
    {
      "id": "150955",
      "url": "crusher-joe-movie",
      "judul": "Crusher Joe Movie",
      "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/7/24514l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Action",
        "Adventure",
        "Sci-Fi"
      ],
      "sinopsis": "Crushers: para ahli serba bisa antargalaksi yang akan menerima tugas apa pun dengan harga yang tepat. Crusher Joe memimpin tim kecil pemecah masalah luar angkasa ini yang meliputi cyborg Talos, Alfin yang cantik, dan Ricky, sang asisten cilik yang wajib ada. Sebuah tugas rutin mengawal seorang pewaris yang dibekukan secara kriogenik ke fasilitas medis menjadi kacau ketika gadis itu menghilang dan Joe serta timnya ditinggalkan dalam kesulitan. Tampaknya bajak laut luar angkasa mencoba mempermainkan Crushers, tetapi Joe tidak menyukai jebakan itu dan melacak para bajak laut ke planet asal mereka. Keempat pahlawan ini tidak hanya harus menyelamatkan muatan manusia mereka tetapi juga mengalahkan para bajak laut dalam prosesnya, yang melibatkan banyak pertempuran udara luar angkasa, ledakan, dan pertarungan tangan kosong ala kuno.",
      "studio": "Sunrise",
      "score": "6.9",
      "status": "Completed",
      "rilis": "12 Maret 1938",
      "total_episode": 1
    },
    {
      "id": "1049",
      "url": "kanata-astra-sub-indo/",
      "judul": "Kanata no Astra",
      "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/04/01/series-1049-anilist-107663-133457-63e0b49b.jpg",
      "lastch": "",
      "lastup": "Baru di Upload",
      "genre": [
        "Action",
        "Sci-Fi",
        "Shounen",
        "Space"
      ],
      "sinopsis": "Hari pertama Planet Camp akhirnya tiba, dan Aries Spring tak bisa menyembunyikan antusiasmenya. Bersama delapan orang asing, ia berangkat ke Planet McPa untuk mengikuti perjalanan selama sepekan yang seharusnya menjadi pengalaman seru dan tak terlupakan.\n\nNamun sesaat setelah mereka mendarat, sebuah bola misterius tiba-tiba muncul dan melemparkan mereka jauh ke kedalaman luar angkasa. Di tengah kepanikan, mereka menemukan sebuah kapal luar angkasa kosong yang mengambang, satu-satunya harapan untuk bertahan hidup dan mencari jalan pulang.",
      "studio": "Lerche",
      "score": "7.8",
      "status": "Completed",
      "rilis": "Jul 3, 2019",
      "total_episode": 12
    }
  ]
}

Anime Play Movies
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/animeplay/movies?apikey=ahmuqkey",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

respone
{
  "success": true,
  "message": "Movies fetched successfully",
  "data": [
    {
      "id": 1,
      "url": "high-speed-movie-free-starting-days",
      "judul": "High Speed! Movie: Free! Starting Days",
      "cover": "https://cdn.myanimelist.net/images/anime/8/76967l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 2,
      "url": "kizumonogatari-i",
      "judul": "Kizumonogatari I",
      "cover": "https://cdn.myanimelist.net/images/anime/1783/112810l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 3,
      "url": "koimonogatari",
      "judul": "Koimonogatari",
      "cover": "https://assets.animekita.org/cover/2026/03/15/series-336-anilist-9260-102012-67095ffd.png",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 4,
      "url": "battle-of-surabaya",
      "judul": "Battle of Surabaya",
      "cover": "https://upload.wikimedia.org/wikipedia/id/a/af/Battle_of_Surabaya.jpeg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 5,
      "url": "hotaru-no-haka",
      "judul": "Hotaru no Haka",
      "cover": "https://cdn.myanimelist.net/images/anime/1485/141208l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 6,
      "url": "kono-sekai-no-katasumi-ni",
      "judul": "Kono Sekai no Katasumi ni",
      "cover": "https://myanimelist.net/images/anime/2/87704l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 7,
      "url": "kaze-tachinu",
      "judul": "Kaze Tachinu",
      "cover": "https://myanimelist.net/images/anime/8/52353l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 8,
      "url": "vampire-hunter-d-2000",
      "judul": "Vampire Hunter D (2000)",
      "cover": "https://myanimelist.net/images/anime/1571/135153l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 9,
      "url": "vampire-hunter-d-1985",
      "judul": "Vampire Hunter D (1985)",
      "cover": "https://myanimelist.net/images/anime/1825/137673l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 10,
      "url": "berserk-ougon-jidai-hen-iii-kourin",
      "judul": "Berserk: Ougon Jidai-hen III - Kourin",
      "cover": "https://myanimelist.net/images/anime/12/41305l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 11,
      "url": "berserk-ougon-jidai-hen-ii-doldrey-kouryaku",
      "judul": "Berserk: Ougon Jidai-hen II - Doldrey Kouryaku",
      "cover": "https://myanimelist.net/images/anime/12/37193l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 12,
      "url": "berserk-ougon-jidai-hen-i-haou-no-tamago",
      "judul": "Berserk: Ougon Jidai-hen I - Haou no Tamago",
      "cover": "https://myanimelist.net/images/anime/12/62179l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 13,
      "url": "virgin-punk-clockwork-girl",
      "judul": "Virgin Punk: Clockwork Girl",
      "cover": "https://myanimelist.net/images/anime/1320/148690l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 14,
      "url": "zutto-mae-kara-suki-deshita-kokuhaku-jikkou-iinkai",
      "judul": "Zutto Mae kara Suki deshita. Kokuhaku Jikkou Iinkai",
      "cover": "https://myanimelist.net/images/anime/3/82121l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 15,
      "url": "zunda-horizon",
      "judul": "Zunda Horizon",
      "cover": "https://myanimelist.net/images/anime/8/83943l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 16,
      "url": "yuuki-yuuna-wa-yuusha-de-aru-washio-sumi-no-shou-3-yakusoku",
      "judul": "Yuuki Yuuna wa Yuusha de Aru: Washio Sumi no Shou 3 - Yakusoku",
      "cover": "https://myanimelist.net/images/anime/7/86984l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 17,
      "url": "yuuki-yuuna-wa-yuusha-de-aru-washio-sumi-no-shou-2-tamashii",
      "judul": "Yuuki Yuuna wa Yuusha de Aru: Washio Sumi no Shou 2 - Tamashii",
      "cover": "https://myanimelist.net/images/anime/9/86480l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 18,
      "url": "yuuki-yuuna-wa-yuusha-de-aru-washio-sumi-no-shou-1-tomodachi",
      "judul": "Yuuki Yuuna wa Yuusha de Aru: Washio Sumi no Shou 1 - Tomodachi",
      "cover": "https://myanimelist.net/images/anime/5/86481l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 19,
      "url": "oomuro-ke-dear-sisters",
      "judul": "Oomuro-ke: Dear Sisters",
      "cover": "https://myanimelist.net/images/anime/1401/140053l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 20,
      "url": "oomuro-ke-dear-friends",
      "judul": "Oomuro-ke: Dear Friends",
      "cover": "https://myanimelist.net/images/anime/1613/141223l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 21,
      "url": "yoru-wa-mijikashi-arukeyo-otome",
      "judul": "Yoru wa Mijikashi Arukeyo Otome",
      "cover": "https://myanimelist.net/images/anime/2/86940l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 22,
      "url": "yaneura-no-rudger",
      "judul": "Yaneura no Rudger",
      "cover": "https://myanimelist.net/images/anime/1032/139452l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 23,
      "url": "yoake-tsugeru-lu-no-uta",
      "judul": "Yoake Tsugeru Lu no Uta",
      "cover": "https://myanimelist.net/images/anime/5/84260l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 24,
      "url": "yes-precure-5-movie-kagami-no-kuni-no-miracle-daibouken",
      "judul": "Yes! Precure 5 Movie: Kagami no Kuni no Miracle Daibouken!",
      "cover": "https://myanimelist.net/images/anime/1878/142472l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 25,
      "url": "yes-precure-5-gogo-movie-okashi-no-kuni-no-happy-birthday",
      "judul": "Yes! Precure 5 GoGo! Movie: Okashi no Kuni no Happy Birthday",
      "cover": "https://myanimelist.net/images/anime/1889/142444l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 26,
      "url": "yeon-ui-pyeonji",
      "judul": "Yeon-ui Pyeonji",
      "cover": "https://myanimelist.net/images/anime/1764/152299l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 27,
      "url": "yatterman-the-movie-shin-yattermecha-dai-shuugou-omocha-no-kuni-de-dai-ketsudan-da-koron",
      "judul": "Yatterman the Movie: Shin Yattermecha Dai Shuugou! Omocha no Kuni de Dai Ketsudan da Koron",
      "cover": "https://myanimelist.net/images/anime/10/22013l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 28,
      "url": "overlord-movie-2-shikkoku-no-eiyuu",
      "judul": "Overlord Movie 2: Shikkoku no Eiyuu",
      "cover": "https://myanimelist.net/images/anime/5/87758l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 29,
      "url": "overlord-movie-1-fushisha-no-ou",
      "judul": "Overlord Movie 1: Fushisha no Ou",
      "cover": "https://myanimelist.net/images/anime/12/87759l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 30,
      "url": "oushitsu-kyoushi-heine-movie",
      "judul": "Oushitsu Kyoushi Heine Movie",
      "cover": "https://myanimelist.net/images/anime/1567/116866l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 31,
      "url": "ouritsu-uchuugun-honneamise-no-tsubasa",
      "judul": "Ouritsu Uchuugun: Honneamise no Tsubasa",
      "cover": "https://myanimelist.net/images/anime/1811/112663l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 32,
      "url": "otome-game-no-hametsu-movie",
      "judul": "Otome Game no Hametsu Movie",
      "cover": "https://myanimelist.net/images/anime/1360/138828l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 33,
      "url": "shelter",
      "judul": "Shelter",
      "cover": "https://myanimelist.net/images/anime/1503/115760l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 34,
      "url": "servamp-movie-alice-in-the-garden",
      "judul": "Servamp Movie: Alice in the Garden",
      "cover": "https://myanimelist.net/images/anime/5/89004l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 35,
      "url": "senpai-wa-otokonoko-movie-ame-nochi-hare",
      "judul": "Senpai wa Otokonoko Movie: Ame Nochi Hare",
      "cover": "https://myanimelist.net/images/anime/1469/146852l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 36,
      "url": "sennen-joyuu",
      "judul": "Sennen Joyuu",
      "cover": "https://myanimelist.net/images/anime/1648/93626l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 37,
      "url": "sengoku-basara-movie-the-last-party",
      "judul": "Sengoku Basara Movie: The Last Party",
      "cover": "https://myanimelist.net/images/anime/13/50871l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 38,
      "url": "selector-destructed-wixoss-movie",
      "judul": "Selector Destructed WIXOSS Movie",
      "cover": "https://myanimelist.net/images/anime/3/83118l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 39,
      "url": "sekaiichi-hatsukoi-valentine-hen",
      "judul": "Sekaiichi Hatsukoi: Valentine-hen",
      "cover": "https://myanimelist.net/images/anime/5/55723l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 40,
      "url": "sekaiichi-hatsukoi-movie-yokozawa-takafumi-no-baai",
      "judul": "Sekaiichi Hatsukoi Movie: Yokozawa Takafumi no Baai",
      "cover": "https://myanimelist.net/images/anime/11/65927l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 41,
      "url": "ooyukiumi-no-kaina-hoshi-no-kenja",
      "judul": "Ooyukiumi no Kaina: Hoshi no Kenja",
      "cover": "https://myanimelist.net/images/anime/1501/138171l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 42,
      "url": "omoide-no-marnie",
      "judul": "Omoide no Marnie",
      "cover": "https://myanimelist.net/images/anime/7/64293l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 43,
      "url": "odd-taxi-movie-in-the-woods",
      "judul": "Odd Taxi Movie: In the Woods",
      "cover": "https://myanimelist.net/images/anime/1390/120708l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 44,
      "url": "x1999",
      "judul": "X/1999",
      "cover": "https://myanimelist.net/images/anime/7/23579l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 45,
      "url": "windaria",
      "judul": "Windaria",
      "cover": "https://myanimelist.net/images/anime/12/25497l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 46,
      "url": "watashi-no-kaoF",
      "judul": "Watashi no Kao",
      "cover": "https://myanimelist.net/images/anime/13/69661l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 47,
      "url": "byousoku-5-centimeter",
      "judul": "Byousoku 5 Centimeter",
      "cover": "https://myanimelist.net/images/anime/1410/112994l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 48,
      "url": "wake-up-girls-shichinin-no-idol",
      "judul": "Wake Up, Girls! Shichinin no Idol",
      "cover": "https://myanimelist.net/images/anime/10/57869l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 49,
      "url": "wake-up-girls-seishun-no-kage",
      "judul": "Wake Up, Girls! Seishun no Kage",
      "cover": "https://myanimelist.net/images/anime/6/75337l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    },
    {
      "id": 50,
      "url": "wake-up-girls-beyond-the-bottom",
      "judul": "Wake Up, Girls! Beyond the Bottom",
      "cover": "https://myanimelist.net/images/anime/5/76402l.jpg",
      "lastch": "",
      "lastup": "Baru di Upload"
    }
  ]
}

Anime Play Ongoing
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/animeplay/ongoing?apikey=ahmuqkey&page=1&type=all",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "message": "Ongoing anime fetched successfully",
  "data": [
    {
      "id": 1,
      "url": "1piece-sub-indo",
      "judul": "One Piece",
      "cover": "https://myanimelist.net/images/anime/1244/138851.jpg",
      "lastch": "Ep 1180",
      "lastup": "Baru di Upload",
      "type": "all"
    },
    {
      "id": 2,
      "url": "nijusseiki-denki-mokuroku-sub-indo",
      "judul": "Nijusseiki Denki Mokuroku: Eureka Evrika",
      "cover": "https://cdn.myanimelist.net/images/anime/1068/158475l.jpg",
      "lastch": "Ep 13",
      "lastup": "Baru di Upload",
      "type": "all"
    },
    {
      "id": 3,
      "url": "tempal-chikara-sub-indo",
      "judul": "Tempal: Item no Chikara",
      "cover": "https://otakudesu.blog/wp-content/uploads/2026/09/160022.jpg",
      "lastch": "Ep 1",
      "lastup": "Baru di Upload",
      "type": "all"
    },
    {
      "id": 4,
      "url": "mushoku-ni-tensei-s3-sub-indo",
      "judul": "Mushoku Tensei Season 3",
      "cover": "https://cdn.myanimelist.net/images/anime/1527/158340l.jpg",
      "lastch": "Ep 14 (End)",
      "lastup": "Baru di Upload",
      "type": "all"
    },
    {
      "id": 5,
      "url": "tensei-skill-nariagaru-s3-sub-ind",
      "judul": "Tensei Kizoku, Kantei Skill de Nariagaru Season 3",
      "cover": "https://otakudesu.blog/wp-content/uploads/2026/09/159859.jpg",
      "lastch": "Ep 1",
      "lastup": "Baru di Upload",
      "type": "all"
    },
    {
      "id": 6,
      "url": "seihantai-kimi-boku-s2-sub-indo",
      "judul": "Seihantai na Kimi to Boku 2nd Season",
      "cover": "https://cdn.myanimelist.net/images/anime/1143/158409l.jpg",
      "lastch": "Ep 12",
      "lastup": "Baru di Upload",
      "type": "all"
    },
    {
      "id": 7,
      "url": "magic-explor-sub-indo",
      "judul": "Magical★Explorer: Eroge no Yuujin Chara ni Tensei Shitakedo, Game Chishiki Tsukatte Jiyuu ni Ikiru",
      "cover": "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx169581-UlAviVH36Hxi.png",
      "lastch": "Ep 1",
      "lastup": "Baru di Upload",
      "type": "all"
    },
    {
      "id": 8,
      "url": "digimon-bb-sub-indo",
      "judul": "Digimon Beatbreak",
      "cover": "https://assets.animekita.org/cover/2026/04/10/series-150544-anilist-188388-225558-38ed1e6f.jpg",
      "lastch": "Ep 49 (End)",
      "lastup": "Baru di Upload",
      "type": "all"
    },
    {
      "id": 9,
      "url": "hanaori-san-wa-tensei-shitemo-kenka-ga-shitai",
      "judul": "Hanaori-san wa Tensei shitemo Kenka ga Shitai",
      "cover": "https://cdn.myanimelist.net/images/anime/1944/156331l.jpg",
      "lastch": "Ep 12 (End)",
      "lastup": "Baru di Upload",
      "type": "all"
    },
    {
      "id": 10,
      "url": "mao-sub-indo",
      "judul": "Mao",
      "cover": "https://assets.animekita.org/cover/2026/04/10/series-153303-anilist-196012-224737-59a10e2d.jpg",
      "lastch": "Ep 26",
      "lastup": "Baru di Upload",
      "type": "all"
    }
  ]
}

AnimePlay Recommendations

const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/animeplay/recommendations?apikey=ahmuqkey",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "message": "Recommendations fetched successfully",
  "data": [
    {
      "id": "1222",
      "url": "isekai-zakaya-sub-indo/",
      "judul": "Isekai Izakaya",
      "cover": "https://assets.animekita.org/cover/2026/04/05/series-1222-anilist-97873-121606-00c69c74.jpg",
      "lastch": "",
      "lastup": "",
      "genre": [
        "Fantasy"
      ],
      "sinopsis": "Izakaya “Nobu” adalah kedai kecil yang dikelola hanya oleh dua orang: sang pemilik, Nobuyuki Yazawa, dan pelayan setianya, Shinobu Senke. Meski tampak sederhana, pintu masuk Nobu ternyata terhubung secara misterius dengan sebuah kota kuno di dunia lain bernama Aitheria, membuat para tamunya jauh dari kata biasa, mulai dari penjaga istana yang pemalas, rohaniawan yang menyamar, hingga ketua serikat pengairan.\n\nBegitu melangkah masuk, mereka disambut minuman terbaik yang belum pernah mereka cicipi dan hidangan yang tak pernah mereka bayangkan. Di tengah makanan melimpah dan gelas yang terus terisi, Nobu menjadi tempat pelarian yang hangat, di mana segala beban seolah tertinggal di luar saat para pelanggan berseru, “Satu bir dingin, Master!”",
      "studio": "Sunrise",
      "score": "7.1",
      "status": "Completed",
      "rilis": "Apr 13, 2018",
      "total_episode": 24
    },
    {
      "id": "150674",
      "url": "18if",
      "judul": "18if",
      "cover": "https://cdn.myanimelist.net/images/anime/7/86743.jpg",
      "lastch": "",
      "lastup": "",
      "genre": [
        "Mystery",
        "Supernatural"
      ],
      "sinopsis": "Terbangun di kamar tidur aneh di dunia mimpi, remaja Haruto Tsukishiro menemukan aplikasi aneh di ponselnya. Saat ia mengaktifkan program tersebut, seorang wanita aneh muncul dan mencoba menyeretnya ke alamnya. Untungnya, seorang gadis misterius berambut putih memutuskan hubungan mereka dan membantunya melarikan diri, mengungkapkan bahwa wanita itu adalah seorang penyihir; namun, percakapan mereka terputus. Saat Haruto memasuki alam itu lagi, ia bertemu dengan seekor kucing antropomorfik yang bisa berbicara bernama Katsumi Kanzaki. Sementara para pengikut penyihir mengejar mereka, gadis berambut putih itu membuka pintu bagi mereka untuk melarikan diri.\r\n\r\nSetelah cobaan berat mereka, Haruto menggambarkan penyelamat mereka—yang hanya bisa dilihatnya—dan Katsumi, ahli terkemuka dalam penelitian dunia mimpi, menyadari bahwa dia pasti \"Lily,\" makhluk yang muncul berulang kali di berbagai alam mimpi. Berharap untuk meninggalkan dunia mimpi melalui pintu biru, mereka memasuki alam penyihir sekali lagi. Terjebak dalam bahaya, Lily mengungkapkan kebenaran kepada Haruto: para penyihir menderita \"Sindrom Putri Tidur,\" keadaan tidur seperti koma yang disebabkan oleh siksaan dalam kehidupan dunia nyata mereka. Karena itu, mereka tidak dapat bangun sampai mereka dikalahkan di dunia mimpi.\r\n\r\nSetelah akhirnya mengalahkan penyihir dan menemukan pintu biru, Haruto dan Katsumi mengucapkan selamat tinggal, berjanji untuk bertemu di dunia nyata. Namun, ketika Haruto keluar melalui pintu, ia terbangun di kamar tidur dunia mimpi sekali lagi. Mencari jawaban, Haruto dan Katsumi mencoba mengungkap misteri para penyihir, Lily, dan ketidakmampuan Haruto sendiri untuk meninggalkan dunia mimpi.Terbangun di kamar tidur aneh di dunia mimpi, remaja Haruto Tsukishiro menemukan aplikasi aneh di ponselnya. Saat ia mengaktifkan program tersebut, seorang wanita aneh muncul dan mencoba menyeretnya ke alamnya. Untungnya, seorang gadis misterius berambut putih memutuskan hubungan mereka dan membantunya melarikan diri, mengungkapkan bahwa wanita itu adalah seorang penyihir; namun, percakapan mereka terputus. Saat Haruto memasuki alam itu lagi, ia bertemu dengan seekor kucing antropomorfik yang bisa berbicara bernama Katsumi Kanzaki. Sementara para pengikut penyihir mengejar mereka, gadis berambut putih itu membuka pintu bagi mereka untuk melarikan diri.\r\n\r\nSetelah cobaan berat mereka, Haruto menggambarkan penyelamat mereka—yang hanya bisa dilihatnya—dan Katsumi, ahli terkemuka dalam penelitian dunia mimpi, menyadari bahwa dia pasti \"Lily,\" makhluk yang muncul berulang kali di berbagai alam mimpi. Berharap untuk meninggalkan dunia mimpi melalui pintu biru, mereka memasuki alam penyihir sekali lagi. Terjebak dalam bahaya, Lily mengungkapkan kebenaran kepada Haruto: para penyihir menderita \"Sindrom Putri Tidur,\" keadaan tidur seperti koma yang disebabkan oleh siksaan dalam kehidupan dunia nyata mereka. Karena itu, mereka tidak dapat bangun sampai mereka dikalahkan di dunia mimpi.\r\n\r\nSetelah akhirnya mengalahkan penyihir dan menemukan pintu biru, Haruto dan Katsumi mengucapkan selamat tinggal, berjanji untuk bertemu di dunia nyata. Namun, ketika Haruto keluar melalui pintu, ia terbangun di kamar tidur dunia mimpi sekali lagi. Mencari jawaban, Haruto dan Katsumi mencoba mengungkap misteri para penyihir, Lily, dan ketidakmampuan Haruto sendiri untuk meninggalkan dunia mimpi.",
      "studio": "Gonzo",
      "score": "6.11",
      "status": "Completed",
      "rilis": "Jul 7, 2017",
      "total_episode": 13
    },
    {
      "id": "153751",
      "url": "yi-kong-zhan-ge",
      "judul": "Yi Kong Zhan Ge",
      "cover": "https://myanimelist.net/images/anime/1146/137724l.jpg",
      "lastch": "",
      "lastup": "",
      "genre": [
        "Action",
        "Fantasy"
      ],
      "sinopsis": "Gadis pejuang Fania bertemu dengan seorang pemuda yang menderita amnesia bernama \"Tutor\", dan keduanya memulai perjalanan bersama, secara bertahap mengungkap rahasia musuh - \"Alien\". Pada saat yang sama, ditemukan juga bahwa \"kekuatan misterius tertentu\" bersembunyi di baliknya dan ingin mengendalikan kehidupan gadis pejuang \"Slude\". Mereka memutuskan untuk bangkit dan membersihkan tanah...",
      "studio": "Shengying Animation",
      "score": "N/A",
      "status": "Completed",
      "rilis": "17 Agustus 2023",
      "total_episode": 15
    },
    {
      "id": "1442",
      "url": "shoujo-shuu-ryoukou-subtitle-indonesia/",
      "judul": "Shoujo Shuumatsu Ryokou",
      "cover": "https://assets.animekita.org/cover/2026/04/10/series-1442-anilist-99420-103810-02683f46.png",
      "lastch": "",
      "lastup": "",
      "genre": [],
      "sinopsis": "Peradaban telah runtuh, namun Chito dan Yuuri masih bertahan hidup. Mengendarai Kettenkrad kesayangan mereka, keduanya berkelana tanpa tujuan menyusuri reruntuhan dunia yang pernah mereka kenal, menjalani hari demi hari yang sunyi sambil mencari makanan dan bahan bakar untuk terus melaju.\n\nMeski hidup mereka serba kekurangan dan tampak tanpa harapan, kebersamaan membuat segalanya terasa sedikit lebih hangat. Entah saat menikmati semangkuk sup seadanya atau memburu suku cadang untuk diutak atik, pengalaman kecil yang mereka bagi di tengah kehampaan perlahan menjadi alasan untuk terus hidup.",
      "studio": "N/A",
      "score": "8.1",
      "status": "N/A",
      "rilis": "N/A",
      "total_episode": 12
    },
    {
      "id": "1444",
      "url": "kanda-jet-girl-sub-indo/",
      "judul": "Kandagawa Jet Girls",
      "cover": "https://assets.animekita.org/cover/2026/04/10/series-1444-anilist-110810-104002-dce6c7ed.jpg",
      "lastch": "",
      "lastup": "",
      "genre": [
        "Sports"
      ],
      "sinopsis": "Rin Namiki punya satu mimpi besar: mengikuti jejak mendiang ibunya dan bertanding di Kandagawa Jet Racing, balapan jet ski antartim yang diwarnai tembakan water gun berdaya tinggi untuk menghambat lawan. Karena di desa nelayan terpencilnya tak ada olahraga itu, Rin pun nekat pindah sendirian ke Tokyo dan masuk sekolah khusus putri demi mengejar ambisinya.\n\nDi sana, ia bertemu Misa Aoi, gadis yang sempat kehilangan arah dari mimpinya sendiri. Kedatangan Rin dan bakatnya yang mengejutkan seolah jadi pemantik baru. Bersama, mereka berusaha menghidupkan kembali klub Jet Riding di sekolah, menjalani latihan keras, dan menantang para rival yang tak main-main, sambil perlahan menyadari bahwa kebersamaan mereka bisa berarti lebih dari sekadar rekan satu tim.",
      "studio": "TNK",
      "score": "5.3",
      "status": "Completed",
      "rilis": "Oct 8, 2019",
      "total_episode": 12
    },
    {
      "id": "152286",
      "url": "way-of-choices",
      "judul": "Way of Choices",
      "cover": "https://assets.animekita.org/cover/2026/02/1ced19a1a7f8955b.webp",
      "lastch": "",
      "lastup": "",
      "genre": [
        "Action",
        "Adventure",
        "Fantasy",
        "Historical",
        "Martial Arts"
      ],
      "sinopsis": "Di dunia fiksi tempat manusia, iblis, dan monster hidup berdampingan, Chen Changsheng datang ke ibu kota para dewa dengan surat nikah untuk mengubah takdirnya. Bersama sekelompok pahlawan muda, ia melancarkan pertempuran sengit melawan kekuatan kegelapan. Pada saat yang sama, ia juga menuai cinta dan memulai perjalanannya untuk bangkit sebagai orang yang berkuasa di ibu kota para dewa.Di dunia fiksi tempat manusia, iblis, dan monster hidup berdampingan, Chen Changsheng datang ke ibu kota para dewa dengan surat nikah untuk mengubah takdirnya. Bersama sekelompok pahlawan muda, ia melancarkan pertempuran sengit melawan kekuatan kegelapan. Pada saat yang sama, ia juga menuai cinta dan memulai perjalanannya untuk bangkit sebagai orang yang berkuasa di ibu kota para dewa.",
      "studio": "Shenman Entertainment",
      "score": "8.00",
      "status": "Ongoing",
      "rilis": "Jan 31, 2026",
      "total_episode": 4
    },
    {
      "id": "152011",
      "url": "lord-xue-ying-season-3",
      "judul": "Lord Xue Ying Season 3",
      "cover": "https://assets.animekita.org/cover/2026/02/7c85d922a094ea2d.jpg",
      "lastch": "",
      "lastup": "",
      "genre": [
        "Action",
        "Adventure",
        "Fantasy",
        "Romance"
      ],
      "sinopsis": "Di awal film (Snow Eagle Lord) diperlihatkan 2 orang pria yang sedang dikejar-kejar oleh seekor binatang iblis. Ketika dua pria itu sudah terkejar dan akan segera dibunuh oleh iblis itu, beruntung datan Xue Ying menolong mereka. Xue Ying pun langsung menyerang iblis itu. Setelah Xue Ying berhasil membunuh Iblis itu, ia menemukan batu air mata iblis yang bisa digunakan untuk meningkatkan kekuatan iblis tersebut. Setelah itu Xue Ying dengan Transenden lainya masuk ke istana patriark Chen yang mana kedatangan mereka telah ditunggunya.\r\n\r\nDi sana mereka membicarakan tentang serangan iblis ke klan Xia yang mundur secara tiba-tiba. Menurut Master Chen, Iblis itu mundur atau mundur sejenak saja dan akan kembali saat waktunya tiba. Karena tujuanya sudah tercapai jadi mereka tak perlu bertarung lagi, stuasinya tidak bisa untuk diketahui.",
      "studio": "Mili Pictures",
      "score": "8.00",
      "status": "Completed",
      "rilis": "Dec 27, 2021",
      "total_episode": 26
    },
    {
      "id": "149055",
      "url": "dekisokonai-to-yobareta-motoeiyuu-wa-jikka-kara-tsuihou-sareta-node-sukikatte-ni-ikiru-koto-ni-shita",
      "judul": "Dekisokonai to Yobareta Motoeiyuu wa Jikka kara Tsuihou sareta node Sukikatte ni Ikiru Koto ni Shita",
      "cover": "https://assets.animekita.org/cover/2026/05/07/series-149055-anilist-166372-172313-5dc21249.jpg",
      "lastch": "",
      "lastup": "",
      "genre": [
        "Action",
        "Adventure",
        "Fantasy"
      ],
      "sinopsis": "“Akhirnya aku bisa mencari kehidupan damai yang sejak kehidupan lampau selalu kuimpikan.”\n\nAllen dicap sebagai anak gagal karena tak dianugerahi “Gift” dari dewa. Namun di balik itu, ia sebenarnya adalah mantan pahlawan yang masih menyimpan ingatan dan kekuatan dari kehidupan sebelumnya. Setelah diusir dari kadipaten keluarganya, Allen menjadikan pengasingan itu sebagai alasan sempurna untuk memulai perjalanan santai dan hidup sesukanya. Sayangnya, rencananya berubah ketika ia tanpa sengaja terseret ke dalam insiden yang mengancam nyawa mantan tunangannya.\n\nAllen hanya ingin menjalani hidup tenang kali ini, tetapi takdir seolah menertawakannya. Petualangan fantasi penuh gejolak yang tak pernah ia minta justru perlahan dimulai.",
      "studio": "Studio Deen",
      "score": "4.8",
      "status": "Completed",
      "rilis": "Apr 2, 2024",
      "total_episode": 12
    },
    {
      "id": "142743",
      "url": "(uncen)-nande-koko-ni-sensei-ga!?",
      "judul": "(Uncen) Nande Koko ni Sensei ga!?",
      "cover": "https://assets.animekita.org/cover/2026/04/11/series-142743-anilist-104325-151359-32c9bb49.jpg",
      "lastch": "",
      "lastup": "",
      "genre": [
        "Comedy",
        "Ecchi"
      ],
      "sinopsis": "Di SMA Kawanuma West, pelajaran pendidikan seks justru terjadi di luar kelas, lewat serangkaian kejadian konyol yang selalu menyeret para murid ke situasi super canggung bersama empat guru cantik. Tak ada satu pun dari mereka yang berniat “terlibat” dengan muridnya, tapi entah kenapa nasib terus mempertemukan mereka dalam momen-momen yang salah tempat, salah waktu, dan terlalu menggoda untuk diabaikan.\n\nMulai dari terpeleset ke air, pakaian yang tersangkut hingga terlepas, sampai tabrakan tak sengaja yang bikin jantung nyaris copot, hari-hari sekolah berubah jadi rangkaian insiden memalukan yang makin lama makin sulit dikendalikan. Di tengah kekacauan ini, para cowok pun dipaksa bertahan dari godaan dan salah paham yang terus meningkat, sementara batas antara kebetulan dan sesuatu yang lebih dari itu makin kabur.",
      "studio": "Tear Studio",
      "score": "6.2",
      "status": "Completed",
      "rilis": "Apr 8, 2019",
      "total_episode": 12
    },
    {
      "id": "151382",
      "url": "hanma-baki-son-of-ogre-2nd-season",
      "judul": "Hanma Baki: Son of Ogre 2nd Season",
      "cover": "https://cdn.myanimelist.net/images/anime/1800/135847l.jpg",
      "lastch": "",
      "lastup": "",
      "genre": [
        "Sports"
      ],
      "sinopsis": "Musim kedua Hanma Baki: Putra Ogre.",
      "studio": "TMS Entertainment",
      "score": "7.92",
      "status": "Completed",
      "rilis": "26 Juli 2023",
      "total_episode": 27
    }
  ]
}

AnimePlay Schedule

{
  "success": true,
  "message": "Schedule fetched successfully",
  "data": {
    "generatedAt": 1790553288,
    "data": [
      {
        "day": "Senin",
        "date": "28",
        "date_ts": 1790528400,
        "animeList": [
          {
            "anime_name": "Nijusseiki Denki Mokuroku: Eureka Evrika",
            "id": 154195,
            "link": "nijusseiki-denki-mokuroku-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1068/158475l.jpg",
            "updated": 1790532824
          },
          {
            "anime_name": "Saikyou Degarashi Ouji no Anyaku Teii Arasoi",
            "id": 154198,
            "link": "saikyou-anyaku-arasoi-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1529/158522l.jpg",
            "updated": 1790011139
          },
          {
            "anime_name": "Seihantai na Kimi to Boku 2nd Season",
            "id": 154223,
            "link": "seihantai-kimi-boku-s2-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1143/158409l.jpg",
            "updated": 1790524456
          },
          {
            "anime_name": "Tensei Kizoku, Kantei Skill de Nariagaru Season 3 Subtitle Indonesia",
            "id": 154248,
            "link": "tensei-skill-nariagaru-s3-sub-ind",
            "cover": "https://otakudesu.blog/wp-content/uploads/2026/09/159859.jpg",
            "updated": 1790524984
          },
          {
            "anime_name": "Tempal: Item no Chikara Subtitle Indonesia",
            "id": 154249,
            "link": "tempal-chikara-sub-indo",
            "cover": "https://otakudesu.blog/wp-content/uploads/2026/09/160022.jpg",
            "updated": 1790531824
          }
        ]
      },
      {
        "day": "Selasa",
        "date": "29",
        "date_ts": 1790614800,
        "animeList": [
          {
            "anime_name": "Liar Game",
            "id": 153610,
            "link": "liar-game-sub-indo",
            "cover": "https://assets.animekita.org/cover/2026/04/10/series-153610-anilist-197754-230448-0638a611.png",
            "updated": 1790025479
          },
          {
            "anime_name": "Kimi ga Shinu made Koi wo Shitai",
            "id": 154017,
            "link": "kimi-shinu-shitai-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1850/158429l.jpg",
            "updated": 1790086160
          }
        ]
      },
      {
        "day": "Rabu",
        "date": "30",
        "date_ts": 1790701200,
        "animeList": [
          {
            "anime_name": "Re:Zero kara Hajimeru Isekai Seikatsu Season 4",
            "id": 153654,
            "link": "re-zero-kara-s4-sub-indo",
            "cover": "https://assets.animekita.org/cover/2026/04/10/series-153654-anilist-189046-230940-fc0bf0fb.jpg",
            "updated": 1790177766
          },
          {
            "anime_name": "Mujikaku Seijo wa Kyou mo Muishiki ni Chikara wo Tare Nagasu",
            "id": 154114,
            "link": "mujikaku-seijo-nagasu-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1612/158373l.jpg",
            "updated": 1789496471
          },
          {
            "anime_name": "Sora wa Akai Kawa no Hotori",
            "id": 154207,
            "link": "sora-akai-kawa-hotori-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1158/158138l.jpg",
            "updated": 1790108434
          },
          {
            "anime_name": "Clevatess II: Majuu no Ou to Itsuwari no Yuusha Denshou",
            "id": 154209,
            "link": "clevatess-s2-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1741/157105l.jpg",
            "updated": 1790176335
          }
        ]
      },
      {
        "day": "Kamis",
        "date": "01",
        "date_ts": 1790787600,
        "animeList": [
          {
            "anime_name": "Lv999 no Murabito",
            "id": 154122,
            "link": "lv999-murabito-sub-indo",
            "cover": "https://i3.wp.com/kuronime.sbs/wp-content/uploads/2026/07/155522l.jpg?resize=157,223",
            "updated": 1788988904
          },
          {
            "anime_name": "Katainaka no Ossan, Kensei ni Naru II",
            "id": 154211,
            "link": "katainaka-ossan-kensei-naru-s2-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1100/157173l.jpg",
            "updated": 1790187124
          },
          {
            "anime_name": "Otome Game Sekai wa Mob ni Kibishii Sekai desu 2",
            "id": 154212,
            "link": "otome-game-mob-s2-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1285/158337l.jpg",
            "updated": 1790189643
          },
          {
            "anime_name": "Dogulwang",
            "id": 154213,
            "link": "tomb-raider-king-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1910/158471l.jpg",
            "updated": 1790209814
          }
        ]
      },
      {
        "day": "Jumat",
        "date": "02",
        "date_ts": 1790874000,
        "animeList": [
          {
            "anime_name": "Tensei shitara Slime Datta Ken Season 4",
            "id": 153297,
            "link": "slime-s4-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1695/156389.jpg",
            "updated": 1790355876
          },
          {
            "anime_name": "Yani Neko",
            "id": 154136,
            "link": "yani-neko-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1281/156496l.jpg",
            "updated": 1790334016
          },
          {
            "anime_name": "Tsuihou sareta Tensei",
            "id": 154137,
            "link": "tsuihou-game-chishiki-suru-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1322/158711l.jpg",
            "updated": 1790274244
          },
          {
            "anime_name": "Super no Ura de Yani Suu Futari",
            "id": 154216,
            "link": "super-yani-suu-futari-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1768/156339l.jpg",
            "updated": 1790272281
          }
        ]
      },
      {
        "day": "Sabtu",
        "date": "03",
        "date_ts": 1790960400,
        "animeList": [
          {
            "anime_name": "Honzuki no Gekokujou Season 4",
            "id": 153300,
            "link": "honzoku-gekokujou-season-4-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1371/155054.jpg",
            "updated": 1790425172
          },
          {
            "anime_name": "Mairimashita! Iruma-kun Season 4",
            "id": 153301,
            "link": "iruma-kun-s4-sub-indo",
            "cover": "https://assets.animekita.org/cover/2026/04/10/series-153301-anilist-184492-232544-d8154283.jpg",
            "updated": 1790440387
          },
          {
            "anime_name": "Yomi no Tsugai",
            "id": 153302,
            "link": "yomi-tsugai-sub-indo",
            "cover": "https://assets.animekita.org/cover/2026/04/10/series-153302-anilist-195600-232434-b730a866.jpg",
            "updated": 1789838694
          },
          {
            "anime_name": "Hell Mode Season 2",
            "id": 154129,
            "link": "hell-mode-s2-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1534/156314l.jpg",
            "updated": 1790364149
          },
          {
            "anime_name": "Mushoku Tensei Season 3",
            "id": 154132,
            "link": "mushoku-ni-tensei-s3-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1527/158340l.jpg",
            "updated": 1790526424
          },
          {
            "anime_name": "Black Torch",
            "id": 154133,
            "link": "black-torch-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1965/158363l.jpg",
            "updated": 1789835192
          },
          {
            "anime_name": "Gaikotsu Kishi-sama, Tadaima Isekai e Odekakechuu Season 2 Sub Indo",
            "id": 154134,
            "link": "gaikotsu-kishi-s2-sub-indo",
            "cover": "https://otakudesu.blog/wp-content/uploads/2026/07/Gaikotsu-Kishi-sama-Tadaima-Isekai-e-Odekakechuu-Season-2-Sub-Indo.jpg",
            "updated": 1790002529
          },
          {
            "anime_name": "Uchi no Otouto-domo ga Sumimasen",
            "id": 154135,
            "link": "uchi-otouto-sumimasen-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1902/156345l.jpg",
            "updated": 1789782859
          },
          {
            "anime_name": "Nige Jouzu no Wakagimi Season 2 Subtitle Indonesia",
            "id": 154219,
            "link": "nige-wakagimi-s2-sub-indo",
            "cover": "https://otakudesu.blog/wp-content/uploads/2026/07/156329.jpg",
            "updated": 1790365864
          },
          {
            "anime_name": "Bleach: Sennen Kessen-hen - Kashin-tan",
            "id": 154222,
            "link": "bleach-kashin-tan-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1275/158595l.jpg",
            "updated": 1789381278
          },
          {
            "anime_name": "Yasei no Last Boss ga Arawareta! Season 2",
            "id": 154246,
            "link": "yasei-last-bos-s2-sub-indo",
            "cover": "https://s4.anilist.co/file/anilistcdn/media/anime/cover/large/bx204389-jCoFCeTthDMy.jpg",
            "updated": 1790439413
          }
        ]
      },
      {
        "day": "Minggu",
        "date": "04",
        "date_ts": 1791046800,
        "animeList": [
          {
            "anime_name": "One Piece",
            "id": 150441,
            "link": "1piece-sub-indo",
            "cover": "https://myanimelist.net/images/anime/1244/138851.jpg",
            "updated": 1790534743
          },
          {
            "anime_name": "Digimon Beatbreak",
            "id": 150544,
            "link": "digimon-bb-sub-indo",
            "cover": "https://assets.animekita.org/cover/2026/04/10/series-150544-anilist-188388-225558-38ed1e6f.jpg",
            "updated": 1790487918
          },
          {
            "anime_name": "Mao",
            "id": 153303,
            "link": "mao-sub-indo",
            "cover": "https://assets.animekita.org/cover/2026/04/10/series-153303-anilist-196012-224737-59a10e2d.jpg",
            "updated": 1790456404
          },
          {
            "anime_name": "Needy Girl Overdose",
            "id": 153306,
            "link": "needy-girl-overdose-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1755/154935.jpg",
            "updated": 1782881360
          },
          {
            "anime_name": "Ichijouma Mankitsugurashi!",
            "id": 153873,
            "link": "ichijouma-mankitsugurashi-sub-indo",
            "cover": "https://otakudesu.blog/wp-content/uploads/2026/04/Ichijouma-Mankitsugurashi-Sub.jpg",
            "updated": 1782881409
          },
          {
            "anime_name": "Mahou Shoujo Lyrical Nanoha EXCEEDS",
            "id": 154139,
            "link": "mahou-shoujo-exceeds-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1685/158611l.jpg",
            "updated": 1789848929
          },
          {
            "anime_name": "Iwamoto-senpai no Suisen",
            "id": 154140,
            "link": "iwamoto-suisen-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1112/158450l.jpg",
            "updated": 1789845412
          },
          {
            "anime_name": "Sekai Saikyou no Kouei: Meikyuukoku no Shinjin Tansakusha",
            "id": 154190,
            "link": "sekai-saikyou-kouei-sub-indo",
            "cover": "https://cdn.myanimelist.net/images/anime/1380/157378l.jpg",
            "updated": 1789974087
          }
        ]
      }
    ]
  }
}

AnimePlay Search

const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/animeplay/search?apikey=ahmuqkey&keyword=asura",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "message": "Search completed successfully",
  "data": {
    "data": [
      {
        "jumlah": 10,
        "result": [
          {
            "id": "150763",
            "url": "asura",
            "judul": "Asura",
            "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/7/44289l.jpg",
            "lastch": "",
            "genre": [
              "Award Winning",
              "Drama"
            ],
            "sinopsis": "Asura adalah drama gelap yang tak kenal ampun yang mengisahkan perjuangan seorang anak laki-laki yang melakukan segala cara untuk bertahan hidup di tengah perang dan kelaparan di Jepang abad pertengahan.",
            "studio": "Toei Animation",
            "score": "6.97",
            "status": "Completed",
            "rilis": "29 September 2019",
            "total_episode": 1
          },
          {
            "id": "150764",
            "url": "asura-cryin",
            "judul": "Asura Cryin'",
            "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/7/17071l.jpg",
            "lastch": "",
            "genre": [
              "Fantasy",
              "Sci-Fi"
            ],
            "sinopsis": "Natsume Tomoharu adalah siswa SMA biasa dalam segala hal, kecuali satu hal: dia diikuti oleh hantu sahabatnya, Misao.\r\n\r\nSetelah pindah ke rumah lama kakaknya, Tomoharu berharap dapat melanjutkan hidupnya yang normal, namun suatu hari ia ditinggalkan dengan sebuah koper misterius yang terkunci tanpa petunjuk apa pun. Awalnya ia berencana menyimpannya di gudang; namun, rumahnya segera diserbu oleh beberapa kelompok orang yang mengejar koper tersebut. Meskipun masih tidak tahu tujuan koper itu, Tomoharu dan Misao berusaha melarikan diri bersama koper tersebut.\r\n\r\nDari situ, Tomoharu berusaha mengungkap rahasia di balik koper tersebut, hubungan antara koper dan Misao, serta mengapa koper itu memiliki kekuatan untuk mengubah dunia.",
            "studio": "Seven Arcs",
            "score": "6.88",
            "status": "Completed",
            "rilis": "2 April 2009",
            "total_episode": 13
          },
          {
            "id": "150765",
            "url": "asura-cryin-2",
            "judul": "Asura Cryin' 2",
            "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/9/50897l.jpg",
            "lastch": "",
            "genre": [
              "Fantasy",
              "Sci-Fi"
            ],
            "sinopsis": "Setelah musim pertama, Tomoharu kini dihadapkan pada dilema: jika dia tidak menandatangani kontrak dengan “akuma,” dia berisiko kehilangan sahabat karibnya, Takatsuki. Namun, melakukannya akan mengancam keberadaannya sendiri, karena hal itu akan membuatnya dan sahabat hantunya, Misao, menjadi Asura Cryin'—ancaman terbesar bagi umat manusia, menurut para presiden sekolah mereka. Untuk memperumit keputusan tersebut, Tomoharu dan Misao telah memulihkan sebagian kenangan masa lalunya—kenangan tentang dunia yang bahkan tidak mereka ketahui keberadaannya.",
            "studio": "Seven Arcs",
            "score": "7.22",
            "status": "Completed",
            "rilis": "1 Oktober 2009",
            "total_episode": 13
          },
          {
            "id": "152332",
            "url": "xi-xing-ji-asura-mad-king",
            "judul": "Xi Xing Ji Asura: Mad King",
            "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/02/fa10b68b1ea12fc6.webp",
            "lastch": "",
            "genre": [
              "Action",
              "Adventure",
              "Fantasy",
              "Martial Arts"
            ],
            "sinopsis": "Xi Xing Ji Asura: Mad King – You Yu, bocah laki-laki Asura yang lemah, mengembangkan potensi luar biasa setelah menyaksikan pembantaian sukunya, dan diculik oleh leluhurnya LiaoJi. You Yu terlahir kembali melalui penyiksaan maut Liao Ji yang seperti neraka, dan mengembangkan panca indera Dewa Pertarungan dan cara unik Jiwa Bertarung. Setelah menyelesaikan pelatihan kematian, You Yu bertemu kembali dengan temannya Shi Yu, tetapi hukum rimba Asura menganiaya Shi Yu sampai mati. Menyadari bahwa menjadi kuat adalah satu-satunya jalan keluar, You Yu memulai perjalanannya untuk menjadi seorang raja dan bertekad untuk menjadi yang terkuat dan menulis ulang aturan Asura!",
            "studio": "N/A",
            "score": "8.00",
            "status": "Completed",
            "rilis": "Feb 28, 2024",
            "total_episode": 8
          },
          {
            "id": "152022",
            "url": "martial-god-asura",
            "judul": "Martial God Asura",
            "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/02/1ce053723a9a742a.webp",
            "lastch": "",
            "genre": [
              "Action",
              "Adventure",
              "Fantasy"
            ],
            "sinopsis": "Kisahnya dimulai dengan seorang anak yang disia-siakan oleh keluarganya, Chu Family. Alasan utama adalah kurangnya Martial Bloodline di dalam keluarga Chu. Chu Feng adalah anak adopsi dari keluarga Chu Yuan, mewarisi darah ibunya. Meskipun ia diperlakukan dengan baik oleh keluarga Chu Yuan, ia sering menjadi bahan ejekan bagi anggota keluarga lainnya. Orang tua asli Chu Feng adalah Chu Xuanyuan dan Jie Ranqing. Ketika ia masuk ke Azure Dragon School, Chu Feng tidak menonjol, bahkan menjadi murid luar yang kekuatan kultivasinya tidak diketahui oleh siapa pun. Anak-anak dari keluarga Chu bahkan membencinya dan sering menciptakan masalah. Namun, kehidupan Chu Feng berubah ketika ia berhasil memecahkan segel yang mengurung Eggy, entitas spiritual dalam dirinya. Dengan bimbingan Eggy, kekuatan Chu Feng tumbuh pesat meskipun masih dianggap remeh. Suatu malam fenomena misterius dan tidak dapat dijelaskan terjadi di Jiuzhou. Lima tahun kemudian Chu Feng, murid luar biasa dari Sekte Azure Dragon, membangunkan salah satu dari sembilan binatang petir misterius. Dan menemukan telur tersegel di dalam dirinya.",
            "studio": "Original Force",
            "score": "8.83",
            "status": "Completed",
            "rilis": "Sep 26, 2023",
            "total_episode": 16
          },
          {
            "id": "151285",
            "url": "future-gpx-cyber-formula",
            "judul": "Future GPX Cyber Formula",
            "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/1653/140355l.jpg",
            "lastch": "",
            "genre": [
              "Adventure",
              "Sci-Fi"
            ],
            "sinopsis": "Kazami Hayato yang berusia 14 tahun adalah pembalap termuda di Cyber ​​Formula, sebuah Grand Prix di mana setiap kendaraan dilengkapi dengan komputer untuk membantu balapan. Dengan bantuan Asurada, sistem navigasi siber tercanggih, dan tim Sugo, Hayato berlomba untuk menjadi pemenang Grand Prix Cyber ​​Formula ke-10. Sepanjang perjalanan, Hayato harus belajar apa arti sebenarnya menjadi seorang pembalap dan bahwa kemenangan tidak dapat diraih hanya dengan mengendarai mesin terbaik. Selain itu, Kazami harus mendapatkan rasa hormat dari para pembalap veteran, menggagalkan upaya pencurian Asurada, dan berpartisipasi dalam balapan di luar Cyber ​​Formula.",
            "studio": "Sunrise",
            "score": "7.36",
            "status": "Completed",
            "rilis": "15 Maret 1991",
            "total_episode": 37
          },
          {
            "id": "151284",
            "url": "future-gpx-cyber-formula-11",
            "judul": "Future GPX Cyber Formula 11",
            "cover": "https://i0.wp.com/cdn.myanimelist.net/images/anime/1686/117415l.jpg",
            "lastch": "",
            "genre": [
              "Drama",
              "Sci-Fi"
            ],
            "sinopsis": "Kini tiba saatnya Grand Prix Dunia Cyber ​​Formula ke-11. Dengan segala harapan dan tekanan yang diletakkan padanya, Hayato Kazami berjuang untuk mendapatkan kembali performa juara yang dimilikinya setahun lalu. Terlebih lagi, Osamu Sugo, alias Knight Schumacher, telah kembali ke kompetisi dan menyatakan Hayato sebagai musuhnya. Hayato, dengan Super Asurada AKF-11 yang baru, kini harus mengalahkan seseorang yang pernah sangat ia percayai untuk mengamankan gelar juara keduanya.",
            "studio": "Sunrise",
            "score": "7.32",
            "status": "Completed",
            "rilis": "1 November 1992",
            "total_episode": 6
          },
          {
            "id": "319",
            "url": "rougo-isekai-tamemasu-sub-indo/",
            "judul": "Roukin",
            "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/03/15/series-319-anilist-152765-100650-df956924.jpg",
            "lastch": "",
            "genre": [
              "Fantasy",
              "Isekai"
            ],
            "sinopsis": "Mitsuha, gadis 18 tahun yang kerap dikira anak SMP karena wajah imut dan tubuh mungilnya, mendadak harus menelan kenyataan pahit saat kedua orang tua dan kakaknya meninggal dalam kecelakaan. Sendirian di dunia, ia gagal ujian masuk universitas karena trauma, sementara hidupnya makin rumit oleh biaya rumah, kebutuhan sehari-hari, dan orang-orang yang mengincar uang asuransi keluarganya.\r\n\r\nDi tengah kebingungan memilih antara kuliah atau bekerja demi bertahan hidup, Mitsuha tiba-tiba mendapat kemampuan “World Jumping” dari sosok misterius, yang memungkinkannya bolak-balik antara dunia ini dan sebuah dunia lain. Dengan peluang baru itu, ia menyusun rencana berani untuk mengamankan masa depan: menabung 1 miliar yen di masing-masing dunia, demi kebebasan yang selama ini terasa mustahil.\r\n\r\nSaving 80,000 Gold in Another World for My Retirement (Rougo ni Sonaete Isekai de 8-manmai no Kinka wo Tamemasu)",
            "studio": "Felix Film",
            "score": "6.8",
            "status": "Completed",
            "rilis": "Jan 08, 2023",
            "total_episode": 12
          },
          {
            "id": "152263",
            "url": "the-supreme-dantian",
            "judul": "The Supreme Dantian",
            "cover": "https://i0.wp.com/assets.animekita.org/cover/2026/02/f06959e05b611429.webp",
            "lastch": "",
            "genre": [
              "Action",
              "Adventure",
              "Fantasy",
              "Martial Arts"
            ],
            "sinopsis": "Qin Shu, putra Raja Dewa, terlahir dengan tubuh dan takdir fana. Ia ditolak oleh alam surgawi dan terancam dicabut statusnya sebagai Putra Dewa serta dibuang ke dunia manusia. Hingga suatu hari, ia bertemu dengan sang tokoh utama dan menyatu dengannya, membangkitkan sistem Sign-In Sepuluh Ribu Alam serta membuka ladang eliksir abadi di Puncak Jueyun. Dari lapisan terbawah dunia Shinto, ia bangkit, bertarung melawan Asura, arwah, hingga Kaisar Bela Diri. Dengan kekuatannya sendiri, ia menebas para dewa dan Buddha, mendaki hingga ke puncak Sembilan Sembilan Delapan Puluh Satu Langit. Bahkan para dewa tak mampu menghalanginya — dengan tubuh fana, ia mencapai puncak tertinggi Shinto. Akhirnya, ia keluar sebagai pemenang dari duel hidup dan mati antar Putra Dewa, menghadapi sendirian sembilan putra para Kaisar, menggagalkan rencana mengerikan Hunyuan Tianzun untuk merebut dunia Shinto, dan menjadi Kaisar Agung yang baru.",
            "studio": "N/A",
            "score": "7.0",
            "status": "N/A",
            "rilis": "Oct 04, 2025",
            "total_episode": 9
          },
          {
            "id": "152970",
            "url": "trigun",
            "judul": "Trigun",
            "cover": "https://i0.wp.com/myanimelist.net/images/anime/1130/120002l.jpg",
            "lastch": "",
            "genre": [
              "Action",
              "Adventure",
              "Sci-Fi"
            ],
            "sinopsis": "Vash the Stampede adalah pria dengan hadiah buronan sebesar $60.000.000.000. Alasannya: dia adalah penjahat tanpa ampun yang menghancurkan semua orang yang menentangnya dan meratakan seluruh kota untuk bersenang-senang, sehingga ia mendapat julukan \"Badai Manusia\". Dia meninggalkan jejak kematian dan kehancuran di mana pun dia pergi, dan siapa pun bisa menganggap diri mereka mati jika mereka sekadar melakukan kontak mata—begitulah rumornya. Sebenarnya, Vash adalah orang yang sangat lembut yang mengaku tidak pernah mengambil nyawa dan menghindari kekerasan dengan segala cara.\r\n\r\nDengan obsesinya yang gila terhadap donat dan sikapnya yang konyol, Vash menjelajahi gurun planet Gunsmoke, sementara diikuti oleh dua agen asuransi, Meryl Stryfe dan Milly Thompson, yang berusaha meminimalkan dampaknya terhadap publik. Tetapi segera, petualangan mereka berubah menjadi situasi hidup dan mati ketika sekelompok pembunuh legendaris dipanggil untuk mendatangkan penderitaan bagi ketiganya. Masa lalu Vash yang menyakitkan akan terungkap dan moralitas serta prinsip-prinsipnya akan diuji hingga titik puncaknya.",
            "studio": "Madhouse",
            "score": "8.22",
            "status": "Completed",
            "rilis": "01 April 1998",
            "total_episode": 26
          }
        ],
        "pagination": {
          "page": 1,
          "per_page": 20,
          "total": 10,
          "total_pages": 1,
          "has_next": false,
          "next_page": "",
          "next_offset": ""
        }
      }
    ]
  }
}