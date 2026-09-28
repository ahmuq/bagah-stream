GoodShort For You

const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/goodshort/foryou?apikey=ahmuqkey&lang=id",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);
{
  "success": true,
  "items": [
    {
      "seriesId": "31001765931",
      "title": "Putri Kecil Penjinak Makhluk Ajaib",
      "description": "Lyra, gadis kecil berusia empat tahun yang memiliki darah peri, ditelantarkan di hutan dan diadopsi oleh Earl yang baik hati. Berkat anugerah pembawa keberuntungannya, dia berhasil menyelamatkan nyawa saudaranya, memenangkan perlombaan kuda, serta mengubah nasib Keluarga Montfort. Sejak saat itu, dia menjadi sosok pembawa keberuntungan berharga bagi keluarga tersebut.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-B9ukmPDIfk.jpg",
      "totalEpisodes": 68,
      "views": 57971,
      "author": "YQ",
      "actors": [],
      "category": [],
      "isComplete": true,
      "language": "Bahasa Indonesia"
    }
  ]
}


GoodShort Home
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/goodshort/home?apikey=ahmuqkey&lang=id",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

respone
{
  "success": true,
  "modules": [
    {
      "title": "Tren🔥",
      "channelId": -1,
      "total": 300,
      "items": [
        {
          "seriesId": "31001765931",
          "title": "Putri Kecil Penjinak Makhluk Ajaib",
          "description": "Lyra, gadis kecil berusia empat tahun yang memiliki darah peri, ditelantarkan di hutan dan diadopsi oleh Earl yang baik hati. Berkat anugerah pembawa keberuntungannya, dia berhasil menyelamatkan nyawa saudaranya, memenangkan perlombaan kuda, serta mengubah nasib Keluarga Montfort. Sejak saat itu, dia menjadi sosok pembawa keberuntungan berharga bagi keluarga tersebut.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-9S46s6ioL8.jpg",
          "totalEpisodes": 68,
          "views": 0,
          "author": "YQ",
          "actors": [],
          "category": [
            "Disayangi Semua",
            "Anak Lucu",
            "Keluarga",
            "Anak Ajaib"
          ],
          "isComplete": false
        },
        {
          "seriesId": "31001740822",
          "title": "Kabur dari Nikah, Malah Dapat Pembalap Sultan",
          "description": "Setelah melarikan diri dari pernikahan paksa, Mallory Sutton secara impulsif menikahi seorang montir yang dicampakkan oleh mantannya. Ternyata, montir itu adalah legenda balap yang menyembunyikan identitasnya dan pewaris keluarga kaya! Ketika mantannya yang toksik memohon agar dia kembali, montir itu menggenggam tangan Mallory lebih erat dan tidak pernah menoleh ke belakang.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-RFJIEZAjcs.jpg",
          "totalEpisodes": 55,
          "views": 0,
          "author": "YQ",
          "actors": [],
          "category": [
            "Nikah Kilat",
            "Kebangkitan",
            "Identitas Tersembunyi",
            "Pewaris",
            "Pembalasan",
            "Pengkhianatan",
            "Pernikahan"
          ],
          "isComplete": false
        },
        {
          "seriesId": "31001740824",
          "title": "Cerai? Gas Naik Level!",
          "description": "Setelah dicampakkan dan dipermalukan oleh mantan istrinya, Edo, pewaris rahasia Grup Sanjaya, menemukan cinta baru bersama Yuni. Saat menghadapi berbagai ujian dari keluarga konglomeratnya dan menghancurkan musuh-musuh mereka, Edo merebut kembali kekuasaan, kekayaan, dan cinta yang memang ditakdirkan untuknya.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-5Ct6Dx93g0.jpg",
          "totalEpisodes": 60,
          "views": 0,
          "author": "YQ",
          "actors": [],
          "category": [
            "Identitas Tersembunyi",
            "Pewaris",
            "Kebangkitan",
            "Pembalasan",
            "Menghukum Mantan Jahat"
          ],
          "isComplete": false
        },
        {
          "seriesId": "31001700648",
          "title": "Kiamat Datang, Aku Beli Istri",
          "description": "Bertahun-tahun setelah dunia hancur akibat kiamat, Sam hanyalah orang biasa yang berjuang untuk bertahan hidup. Namun, kemunculan sebuah sistem mengubah seluruh hidupnya. Demi menyelamatkan nyawanya sendiri, Sam harus memahami arti keberanian yang sebenarnya ketika dia ditugaskan untuk melindungi tiga wanita cantik. Pada akhirnya, ketiga wanita itu memilih untuk menjadi istrinya.",
          "cover": "https://acfs1.goodreels.com/videobook/202608/cover-PpCAiS6oGC.jpg",
          "totalEpisodes": 61,
          "views": 0,
          "author": "YQ",
          "actors": [],
          "category": [
            "Harem",
            "Sistem",
            "Kebangkitan",
            "Orang Biasa",
            "Pembalasan"
          ],
          "isComplete": false
        },
        {
          "seriesId": "31001700647",
          "title": "Disewa Jadi Pengasuh, Dipilih Jadi Ibu",
          "description": "Suaminya selingkuh, sahabatnya merebut keluarganya, putrinya memilih wanita lain sebagai ibu. Serena yang pergi tanpa membawa apa-apa, terseret ke dalam dunia Roman, seorang miliarder yang posesif. Sementara itu, putri Roman justru memanggilnya \"Ibu\". Saat Roman menawarkan untuk memberikan kembali segalanya yang pernah hilang, mana mungkin Serena menolak?",
          "cover": "https://acfs1.goodreels.com/videobook/202608/cover-lxee2MSpA1.jpg",
          "totalEpisodes": 62,
          "views": 0,
          "author": "YQ",
          "actors": [],
          "category": [
            "Anak Lucu",
            "Nikah Kilat",
            "Menghukum Mantan Jahat",
            "Mengejar Istri",
            "Manis",
            "Ibu Rumah Tangga",
            "Pernikahan"
          ],
          "isComplete": false
        },
        {
          "seriesId": "31001740826",
          "title": "Aku Tinggal Landas, Dia Tinggal Menyesal",
          "description": "\"Nadia rela meninggalkan dunia penerbangan demi suaminya, Gavin. Dia menyerahkan kursinya di kokpit dan memilih menjadi ibu rumah tangga. Namun, sesaat sebelum kesalahan Gavin menyebabkan seluruh penumpang pesawat tewas, Nadia memergokinya berselingkuh dengan seorang pramugari. \n\nTerlahir kembali satu tahun sebelumnya, Nadia memutuskan kembali ke sekolah penerbangan. Kali ini, dia akan mengalahkan pria yang telah mengkhianatinya, membuktikan kemampuannya, dan merebut kembali tempatnya di dunia penerbangan.\"",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-FbeQHWwXD6.jpg",
          "totalEpisodes": 61,
          "views": 0,
          "author": "YQ",
          "actors": [],
          "category": [
            "Reinkarnasi",
            "Pernikahan",
            "Wanita Kuat",
            "Ibu Rumah Tangga",
            "Pahlawan Kembali",
            "Pengkhianatan",
            "Pembalasan",
            "Identitas Tersembunyi"
          ],
          "isComplete": false
        },
        {
          "seriesId": "31001740818",
          "title": "Bapaknya Bukan Kaleng-Kaleng",
          "description": "Lima tahun setelah malam penuh gairah, sang Ratu Serigala akhirnya menemukan ayah dari anaknya saat klannya di ambang kehancuran. Tanpa disadarinya, pria itu ternyata adalah Penyihir Agung yang menjadi kunci untuk menyelamatkan dirinya dan klannya.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-p9ZvW7PzZz.jpg",
          "totalEpisodes": 60,
          "views": 0,
          "author": "YQ",
          "actors": [],
          "category": [
            "Manis",
            "Anak Lucu",
            "Manusia Serigala",
            "Identitas Tersembunyi",
            "Menghukum Mantan Jahat",
            "Dibantu Bayi Lucu"
          ],
          "isComplete": false
        },
        {
          "seriesId": "31001740386",
          "title": "Bos Geng Cantik dan Prianya",
          "description": "Setelah dicampakkan dan dipermalukan oleh mantan kekasihnya, Yuri, Noah—pewaris rahasia Keluarga Sinclair—menemukan cinta baru bersama Sarah. Saat mereka berdua menghadapi berbagai ujian dari keluarganya dan menghancurkan musuh-musuh mereka, Noah berhasil merebut kembali kekuasaan, kekayaan, serta cinta yang memang seharusnya menjadi miliknya.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-bLvE2vc50S.jpg",
          "totalEpisodes": 60,
          "views": 0,
          "author": "YQ",
          "actors": [],
          "category": [
            "Manis",
            "Wanita Kuat",
            "Takdir",
            "Pernikahan",
            "Pembalasan",
            "Pengkhianatan"
          ],
          "isComplete": false
        },
        {
          "seriesId": "31001765933",
          "title": "Berbalik, Menutup Hati",
          "description": "Selama tujuh tahun, dia bertahan dalam pernikahannya dengan seorang CEO mafia. Namun, semua pengorbanannya terbayar dengan pengkhianatan terbesar. Suaminya ternyata memiliki keluarga kedua bersama adik angkatnya. Untuk melarikan diri dari pernikahan yang menghancurkan dirinya, dia memalsukan kematian dalam sebuah kecelakaan pesawat dan meninggalkan masa lalunya yang penuh luka. \nKini, dia telah menyerah pada cinta dan memilih membangun kehidupan baru yang hanya berpusat pada dirinya sendiri.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-Jm9rDy9YNx.jpg",
          "totalEpisodes": 55,
          "views": 0,
          "author": "YQ",
          "actors": [],
          "category": [
            "Penyesalan",
            "Pernikahan",
            "Mafia",
            "Pengkhianatan",
            "Pembalasan"
          ],
          "isComplete": false
        },
        {
          "seriesId": "31001100586",
          "title": "Romansa 19+: Mantan dan Pilihan Gila",
          "description": "Emily, yang belum pernah pacaran seumur hidupnya, berpura-pura menjadi \"FWB\" dengan sahabatnya, Alex, demi hadiah 3 miliar di sebuah reality show kencan. Ia terkejut dengan aturan acara yang mengharuskannya berciuman dan tidur seranjang dengan kontestan pria lain. Kini, Emily harus berjuang menyembunyikan jati dirinya yang sebenarnya dalam eksperimen yang liar dan provokatif ini, di mana rahasianya bisa saja terbongkar kapan pun.",
          "cover": "https://acfs1.goodreels.com/videobook/202508/cover-WMAwm1gWG9.jpg",
          "totalEpisodes": 72,
          "views": 0,
          "author": "Henry",
          "actors": [],
          "category": [
            "Manis",
            "Cinta Segitiga",
            "Benci Jadi Cinta",
            "Cinta Satu Malam"
          ],
          "isComplete": false
        },
        {
          "seriesId": "31001700648",
          "title": "Kiamat Datang, Aku Beli Istri",
          "description": "Bertahun-tahun setelah dunia hancur akibat kiamat, Sam hanyalah orang biasa yang berjuang untuk bertahan hidup. Namun, kemunculan sebuah sistem mengubah seluruh hidupnya. Demi menyelamatkan nyawanya sendiri, Sam harus memahami arti keberanian yang sebenarnya ketika dia ditugaskan untuk melindungi tiga wanita cantik. Pada akhirnya, ketiga wanita itu memilih untuk menjadi istrinya.",
          "cover": "https://acfs1.goodreels.com/videobook/202608/cover-TQIburE3m4.jpg",
          "totalEpisodes": 61,
          "views": 581450,
          "author": "YQ",
          "actors": [],
          "category": [
            "Harem",
            "Sistem",
            "Kebangkitan",
            "Orang Biasa",
            "Pembalasan"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001781681",
          "title": "Sentuh Adikku, Hadapi Bos Mafia",
          "description": "Kane menghadiri pesta pertunangan adiknya, Evelyn, dengan menyamar sebagai janitor. Namun, dia justru mendapat hinaan pedas dari tunangan Evelyn, Dorian, dan keluarganya yang sombong. Saat para taipan paling berkuasa di kota berlutut ketakutan di hadapannya, Keluarga Winston yang syok akhirnya sadar bahwa pria yang mereka remehkan adalah Raja Bayangan.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-HAbuYgkSJW.jpg",
          "totalEpisodes": 69,
          "views": 38043,
          "author": "YQ",
          "actors": [],
          "category": [
            "Identitas Tersembunyi",
            "Pembalasan",
            "CEO",
            "Salah Paham",
            "Menghukum Mantan Jahat"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001740822",
          "title": "Kabur dari Nikah, Malah Dapat Pembalap Sultan",
          "description": "Setelah melarikan diri dari pernikahan paksa, Mallory Sutton secara impulsif menikahi seorang montir yang dicampakkan oleh mantannya. Ternyata, montir itu adalah legenda balap yang menyembunyikan identitasnya dan pewaris keluarga kaya! Ketika mantannya yang toksik memohon agar dia kembali, montir itu menggenggam tangan Mallory lebih erat dan tidak pernah menoleh ke belakang.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-Hyx8ePGs86.jpg",
          "totalEpisodes": 55,
          "views": 147205,
          "author": "YQ",
          "actors": [],
          "category": [
            "Nikah Kilat",
            "Kebangkitan",
            "Identitas Tersembunyi",
            "Pewaris",
            "Pembalasan",
            "Pengkhianatan",
            "Pernikahan"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001765933",
          "title": "Berbalik, Menutup Hati",
          "description": "Selama tujuh tahun, dia bertahan dalam pernikahannya dengan seorang CEO mafia. Namun, semua pengorbanannya terbayar dengan pengkhianatan terbesar. Suaminya ternyata memiliki keluarga kedua bersama adik angkatnya. Untuk melarikan diri dari pernikahan yang menghancurkan dirinya, dia memalsukan kematian dalam sebuah kecelakaan pesawat dan meninggalkan masa lalunya yang penuh luka. \nKini, dia telah menyerah pada cinta dan memilih membangun kehidupan baru yang hanya berpusat pada dirinya sendiri.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-v9IKi8pK7q.jpg",
          "totalEpisodes": 55,
          "views": 26320,
          "author": "YQ",
          "actors": [],
          "category": [
            "Penyesalan",
            "Pernikahan",
            "Mafia",
            "Pengkhianatan",
            "Pembalasan"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001267802",
          "title": "Perasaan Terlarang Pada Sepupuku",
          "description": "Karena kondisi tubuhnya yang memalukan, Billie meminta sepupunya, Vincent untuk melakukan pemeriksaan tubuh padanya secara mendetail. Vincent sendiri adalah dokter UKS di universitasnya. Tapi hasrat terlarang antara mereka berdua justru tumbuh. Setelah mendapati bahwa mereka berdua tidak memiliki hubungan darah sama sekali, Billie mulai mendekati Vincent. Walau Vincent berusaha menjauh darinya, keinginan hatinya membuatnya susah mengontrol diri, hingga akhirnya perlahan pertahanannya runtuh...",
          "cover": "https://acfs1.goodreels.com/videobook/202601/cover-JbFCzuGTgU.jpg",
          "totalEpisodes": 72,
          "views": 555137,
          "author": "Andy",
          "actors": [],
          "category": [
            "Manis",
            "Cinta Terlarang",
            "Cinta Diam-diam Jadi Kenyataan",
            "Pura-pura Bodoh",
            "Pewaris Wanita"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001345253",
          "title": "Dia Selingkuh, Aku Naik ke Puncak!",
          "description": "Emily Carter adalah seorang istri yang setia mendukung karier suaminya, Ethan Carter, sebagai pilot. Pada hari jadi pernikahan mereka yang ketujuh, Emily memberikan kejutan dengan menyelinap ke penerbangan HK195 yang dipiloti Ethan. Namun, badai petir hebat menyebabkan pesawat tersebut menukik tajam dan berada di ambang kecelakaan.",
          "cover": "https://acfs1.goodreels.com/videobook/202604/cover-5eVDMjJKP6.jpg",
          "totalEpisodes": 62,
          "views": 932543,
          "author": "Morely",
          "actors": [],
          "category": [
            "Sakit Hati",
            "Reinkarnasi",
            "Wanita Kuat",
            "Menghukum Mantan Jahat"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001765931",
          "title": "Putri Kecil Penjinak Makhluk Ajaib",
          "description": "Lyra, gadis kecil berusia empat tahun yang memiliki darah peri, ditelantarkan di hutan dan diadopsi oleh Earl yang baik hati. Berkat anugerah pembawa keberuntungannya, dia berhasil menyelamatkan nyawa saudaranya, memenangkan perlombaan kuda, serta mengubah nasib Keluarga Montfort. Sejak saat itu, dia menjadi sosok pembawa keberuntungan berharga bagi keluarga tersebut.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-B9ukmPDIfk.jpg",
          "totalEpisodes": 68,
          "views": 57979,
          "author": "YQ",
          "actors": [],
          "category": [
            "Disayangi Semua",
            "Anak Lucu",
            "Keluarga",
            "Anak Ajaib"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001717099",
          "title": "Suami Cabut, Uang Ikut Raib",
          "description": "Terikat janji enam tahun, jin sakti Evren menyembunyikan identitas aslinya demi melindungi sang istri, Layla, dan menyelamatkan perusahaannya dari berbagai krisis. Namun, Layla justru memperlakukannya layaknya pelayan tak berguna. Begitu kontrak berakhir, Evren pun melangkah pergi—membiarkan Layla menyadari kenyataan pahit bahwa segala yang ia miliki selama ini dibangun oleh suami yang selalu ia hina.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-vrOXIRD4uJ.jpg",
          "totalEpisodes": 51,
          "views": 21805,
          "author": "YQ",
          "actors": [],
          "category": [
            "Penyesalan",
            "Pernikahan",
            "Identitas Tersembunyi",
            "Pembalasan",
            "CEO Wanita"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001677355",
          "title": "Ayah, kita bukan keluarga lagi.",
          "description": "Selama sepuluh tahun hidup serba kekurangan demi membesarkan putrinya, Lily, seorang janitor bernama Maya akhirnya mengetahui bahwa suaminya, Adrian, adalah seorang miliarder yang selama ini menelantarkan mereka demi memanjakan cinta pertamanya. Maya yang hancur kemudian memilih pergi membawa putrinya, hingga sebuah rahasia masa lalu terungkap bahwa ia sebenarnya adalah putri dari seorang pahlawan perang dan diangkat menjadi pewaris sah dari keluarga Harrington yang sangat berkuasa. Ketika Adrian pada akhirnya kehilangan segalanya dan jatuh berlutut memohon ampunan, Lily menolaknya dengan satu jawaban telak: \"Ayah, kita cukup sampai di sini.\"",
          "cover": "https://acfs1.goodreels.com/videobook/202608/cover-X1H4t3xA59.jpg",
          "totalEpisodes": 60,
          "views": 35989,
          "author": "YQ",
          "actors": [],
          "category": [
            "Sakit Hati",
            "Pernikahan",
            "Pewaris Wanita",
            "Perceraian",
            "Mengejar Istri",
            "Menghukum Mantan Jahat"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001700649",
          "title": "Sang Villainess Bayar Dosa di Atas Ranjang",
          "description": "Setelah terbangun, sang Putri bersumpah untuk menjinakkan kembali empat monster yang dulu ia hancurkan. Serigala liar di bawah cahaya bulan, tanda gigitan vampir tinggi di pahanya, sentuhan berat sang singa, dan air mata duyung di tulang selangkanya... Saat mangsa berubah jadi pemangsa, di antara takhta dan ranjangnya—siapa yang akan dilahap lebih dulu?",
          "cover": "https://acfs1.goodreels.com/videobook/202608/cover-Yu6HVsmH2q.jpg",
          "totalEpisodes": 69,
          "views": 63256,
          "author": "YQ",
          "actors": [],
          "category": [
            "Manis",
            "Perjalanan Waktu",
            "Harem",
            "Bangsawan",
            "Pewaris Wanita"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001700647",
          "title": "Disewa Jadi Pengasuh, Dipilih Jadi Ibu",
          "description": "Suaminya selingkuh, sahabatnya merebut keluarganya, putrinya memilih wanita lain sebagai ibu. Serena yang pergi tanpa membawa apa-apa, terseret ke dalam dunia Roman, seorang miliarder yang posesif. Sementara itu, putri Roman justru memanggilnya \"Ibu\". Saat Roman menawarkan untuk memberikan kembali segalanya yang pernah hilang, mana mungkin Serena menolak?",
          "cover": "https://acfs1.goodreels.com/videobook/202608/cover-Zq9VfrXLzO.jpg",
          "totalEpisodes": 62,
          "views": 105894,
          "author": "YQ",
          "actors": [],
          "category": [
            "Anak Lucu",
            "Nikah Kilat",
            "Menghukum Mantan Jahat",
            "Mengejar Istri",
            "Manis",
            "Ibu Rumah Tangga",
            "Pernikahan"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001791871",
          "title": "Si Jelek Malah Bikin 4 Beastman Klepek-Klepek",
          "description": "Seorang gadis modern terbangun di dalam novel fiksi ilmiah bertema beastman sebagai Putri Aria yang buruk rupa dan memiliki reputasi buruk. Demi bertahan hidup, dia memilih empat pria beastman paling seksi untuk menjadi suaminya. Dengan hidangan lezat dan ketulusan, dia berhasil memenangkan hati mereka, memancarkan kecantikan aslinya, serta membongkar rencana jahat Ratu Grace. Aria pun menjadi permaisuri abadi, mematahkan kutukan genetik, dan membebaskan seluruh galaksi.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-V3tke2Py13.jpg",
          "totalEpisodes": 67,
          "views": 2051,
          "author": "YQ",
          "actors": [],
          "category": [
            "Manis",
            "CLBK",
            "Takdir",
            "Kaisar Wanita",
            "Harem",
            "Intrik Istana"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001781685",
          "title": "[Sulih Suara]Siapa Berani Sentuh Penolongku?!",
          "description": "Ethan Dalton dulunya adalah anak yang bekerja sebagai tukang pembersih jalanan. Dia membersihkan mobil di jalanan, lalu pertemuannya dengan Richard Harrington mengubah hidupnya. Richard membantunya dengan memberikan sejumlah uang demi menggapai mimpinya. Lima belas tahun kemudian, Ethan kembali sebagai bintang baru dalam dunia pembuatan roket, tapi malah menemukan bahwa Richard dikhianati anak adopsinya sendiri, perusahaannya direbut dan didorong ke puncak keputusasaan. Sekarang Ethan sudah kembali, apakah anak tak tahu terima kasih Richard bisa bertahan melawan balas dendam anak yang pernah ditolong Richard sendiri?",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-rP92et7dnT.jpg",
          "totalEpisodes": 59,
          "views": 3479,
          "author": "YQ",
          "actors": [],
          "category": [
            "Balas Dendam",
            "Kebangkitan",
            "CEO",
            "Pengkhianatan",
            "Pembalasan",
            "Perang Bisnis"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001777711",
          "title": "Selingkuh? Habis Hartamu!",
          "description": "Pada hari ulang tahunnya, Serena, Ketua Grup Sterling di Wall Street, mendapati suaminya, Hunter, menggunakan uangnya untuk membeli mobil-mobil mewah bagi selingkuhannya, Chloe. Saat terjadi tabrakan, Chloe dengan angkuhnya mempermalukan Serena, tanpa menyadari bahwa dia telah menyinggung orang yang salah.\nDi sebuah acara amal mewah, Serena muncul dengan memukau, lalu membongkar kebusukan Hunter dan Chloe di depan umum. Dia segera memulai proses perceraian sekaligus menarik kembali aset-asetnya, membuat kedua pengkhianat itu membayar mahal atas perbuatan mereka.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-xStIKkba8X.jpg",
          "totalEpisodes": 70,
          "views": 971,
          "author": "YQ",
          "actors": [],
          "category": [
            "Sakit Hati",
            "Balas Dendam",
            "CEO Wanita",
            "Pengkhianatan",
            "Perceraian",
            "Menghukum Mantan Jahat"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001100586",
          "title": "Romansa 19+: Mantan dan Pilihan Gila",
          "description": "Emily, yang belum pernah pacaran seumur hidupnya, berpura-pura menjadi \"FWB\" dengan sahabatnya, Alex, demi hadiah 3 miliar di sebuah reality show kencan. Ia terkejut dengan aturan acara yang mengharuskannya berciuman dan tidur seranjang dengan kontestan pria lain. Kini, Emily harus berjuang menyembunyikan jati dirinya yang sebenarnya dalam eksperimen yang liar dan provokatif ini, di mana rahasianya bisa saja terbongkar kapan pun.",
          "cover": "https://acfs1.goodreels.com/videobook/202508/cover-GVnb4nBPeX.jpg",
          "totalEpisodes": 72,
          "views": 2232650,
          "author": "Henry",
          "actors": [],
          "category": [
            "Manis",
            "Cinta Segitiga",
            "Benci Jadi Cinta",
            "Cinta Satu Malam"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001765929",
          "title": "Nikah Kilat dengan Bos Mafia yang Lumpuh",
          "description": "Ava, seorang gadis ladang peternakan, melarikan diri ke New York setelah dijual oleh ibu tirinya dan secara tak terduga menikahi Gabriel, seorang Bos Mafia yang berpura-pura menggunakan kursi roda. Seiring cinta tumbuh di tengah mimpi balet, pengkhianatan, dan identitas tersembunyi, sebuah kalung angsa zamrud mengungkapkan bahwa Ava adalah putri yang hilang dari Ratu Balet Yetta. Janji masa kecil Gabriel untuk menikahinya pun menjadi kenyataan.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-CmRJlvyKkr.jpg",
          "totalEpisodes": 64,
          "views": 8388,
          "author": "YQ",
          "actors": [],
          "category": [
            "Manis",
            "Nikah Kilat",
            "Pewaris Asli dan Palsu",
            "Mafia",
            "Cinderella",
            "Cinta Setelah Menikah"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001777717",
          "title": "Dikhianati Mate, Kupilih Sang Dewa Perang",
          "description": "Selama lima tahun, Karin hidup dalam penderitaan setelah suaminya, Damon, “tewas” dalam perang. Namun, Damon ternyata memalsukan kematiannya demi bisa tidur dengan kakak iparnya sendiri.\nKarin mencabut tanda pasangannya dan mengikat jiwanya dengan Watson, Dewa Perang Serigala Hitam. Dipermalukan dan ditinggalkan, Damon harus menghabiskan sisa hidupnya di kursi roda setelah dikutuk oleh Dewi Bulan. Sementara itu, Karin justru bangkit dan menjalani hidup yang lebih baik.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-947JFq5nRk.jpg",
          "totalEpisodes": 60,
          "views": 3563,
          "author": "YQ",
          "actors": [],
          "category": [
            "Takdir",
            "Manusia Serigala",
            "Pernikahan",
            "Pembalasan",
            "Pengkhianatan"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001777712",
          "title": "Siang Musuh, Malam Master",
          "description": "Klare adalah seorang perawat yang sering diabaikan di Klinik Gigi Venus. Dia berjuang menghadapi kecemasan berat setelah mengalami tragedi keluarga. Satu-satunya hal yang memberinya ketenangan adalah tunduk pada seorang master misterius yang perintah-perintahnya membuatnya merasa aman di dunia maya. \nNamun di kehidupan nyata, bos barunya, Dance Gordon, adalah pria sombong, bermulut tajam, dan selalu mencari-cari masalah dengannya. Di siang hari, mereka terus berselisih di klinik gigi. Hanya saja di malam hari, pria itu ternyata sosok master sempurna di balik layar, yang memberikan seluruh kesabaran dan kelembutannya hanya pada Cake. Musuh di dunia nyata, terikat dan tak bisa lepas di dunia maya.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-kxv9VT2gEn.jpg",
          "totalEpisodes": 54,
          "views": 2600,
          "author": "YQ",
          "actors": [],
          "category": [
            "Romansa Gelap",
            "Sakit Hati",
            "Orang Biasa",
            "Benci Jadi Cinta",
            "Identitas Tersembunyi",
            "SM"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001026710",
          "title": "Gairah Yang Berbahaya",
          "description": "Tommy, pemimpin kedua dari keluarga mafia secara tidak sengaja bertemu dengan Mathilda, seorang mahasiswi. Seiring dengan terbongkarnya rahasia dan setelah mengalami berbagai kejadian berbahaya, mereka terpaksa menghadapi masa lalu mereka. Pilihan mereka pun akan menentukan masa depan mereka.",
          "cover": "https://acfs1.goodreels.com/videobook/202505/cover-I3DxCcUBPf.jpg",
          "totalEpisodes": 71,
          "views": 455694,
          "author": "Henry",
          "actors": [],
          "category": [
            "Takdir",
            "Mafia",
            "Cinderella",
            "Kehamilan"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001675004",
          "title": "Langkah Demi Langkah Tidur Dengannya",
          "description": "Lena tidur dengan bosnya, Elliot sebelum mengetahui tentang orang tuanya. Sekarang mereka akan menjadi saudara tiri, terjebak dalam satu atap dan berjuang melawan nafsu yang nggak bisa ditahan siapa pun, di saat mantan pacar yang cemburu dan teman masa kecil yang berbahaya mengancam untuk mengungkapkan semuanya.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-jf2AKOdWtz.jpg",
          "totalEpisodes": 56,
          "views": 19829,
          "author": "Hzf",
          "actors": [],
          "category": [
            "Keluarga",
            "Takdir",
            "Romansa Kantor",
            "CEO",
            "Cinderella",
            "Cinta Terlarang"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001781684",
          "title": "Nyesel Setelah Tahu Dia Pangeran",
          "description": "Demi cinta, Serion rela melepaskan sayap dan gelar bangsawannya. Namun, dia justru dikhianati istri dan putranya hingga disiksa kaum siluman selama tiga tahun. Saat Serion akhirnya pergi, mereka baru mengetahui pria yang mereka sia-siakan adalah Pangeran Peri. Namun, penyesalan mereka sudah terlambat.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-5F9kEznBqF.jpg",
          "totalEpisodes": 60,
          "views": 4185,
          "author": "YQ",
          "actors": [],
          "category": [
            "Penyesalan",
            "Sakit Hati",
            "Pernikahan",
            "Dominan",
            "Bangsawan",
            "Menghukum Mantan Jahat"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001647328",
          "title": "Sistem Kencan Zombie",
          "description": "Saat kiamat zombie merebak, Mike dibunuh oleh istrinya, Sarah, dan sahabatnya, Ethan. Tapi, dia bangkit lagi jadi zombie dengan Sistem Cinta aneh: makin berhasil bikin wanita jatuh hati, makin besar kekuatannya. Targetnya, Jessie, terus berusaha bunuh dia. Di tengah hasrat, dendam, dan pasukan zombie, hubungan yang penuh benci itu berubah jadi cinta.",
          "cover": "https://acfs1.goodreels.com/videobook/202607/cover-qskA1bskmC.jpg",
          "totalEpisodes": 57,
          "views": 64946,
          "author": "viana",
          "actors": [],
          "category": [
            "Reinkarnasi",
            "Sistem",
            "Kebangkitan",
            "Dominan",
            "Orang Biasa",
            "Pembalasan"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001765939",
          "title": "Pandora Membalikkan Nasib Sang Pecundang",
          "description": "Terlempar ke Era Samudra yang dipenuhi monster, Kotak Pandora tingkat SSS milik Aimar malah diejek sebagai sampah tak berguna. Dicampakkan dan diusir, ia justru berhasil membuka segel artefak tersebut—membangkitkan Poseidon dan sepuluh dewa purba. Kini, sang pecundang yang terbuang telah bangkit menguasai lautan, memaksa setiap musuhnya berlutut di bawah kakinya.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-cSX1XNlsNm.jpg",
          "totalEpisodes": 60,
          "views": 8045,
          "author": "YQ",
          "actors": [],
          "category": [
            "Kebangkitan",
            "Pembalasan",
            "Orang Biasa",
            "Identitas Tersembunyi"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001717098",
          "title": "Mommy, Masa Lupa Aku dan Daddy?",
          "description": "Regina terbangun 10 tahun kemudian dan mendapati dirinya telah menikah dengan Linus, musuh bebuyutannya, serta memiliki seorang putri. Selama ini, dia melakukan berbagai kesalahan karena dimanipulasi oleh Hunter. Setelah mengetahui kebenarannya, Regina bekerja sama dengan Linus untuk melawan balik, mengungkap masa lalu yang terlupakan, menyembuhkan luka lama, dan kembali jatuh cinta.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-RrSAPVWZpk.jpg",
          "totalEpisodes": 50,
          "views": 65387,
          "author": "YQ",
          "actors": [],
          "category": [
            "Manis",
            "CLBK",
            "Pernikahan",
            "Menghukum Mantan Jahat",
            "Anak Lucu",
            "Pembalasan",
            "Pengkhianatan"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001677357",
          "title": "Ayahku Ternyata Penguasa Dunia Naga",
          "description": "Empat tahun lalu, Elena diselamatkan oleh Kael Draven, sang Raja Naga. Mereka terikat dalam cinta satu malam hingga melahirkan seorang putri. Beberapa tahun kemudian, Kael menyamar dan memaksa Elena menikah kontrak agar putri mereka memiliki seorang ayah. Saat bahaya mengancam, identitas Kael perlahan terungkap dan tak bisa lagi menghindari takdir.",
          "cover": "https://acfs1.goodreels.com/videobook/202608/cover-pQq9LWrJs9.jpg",
          "totalEpisodes": 62,
          "views": 38020,
          "author": "YQ",
          "actors": [],
          "category": [
            "Anak Lucu",
            "Identitas Tersembunyi",
            "Pahlawan Kembali",
            "Nikah Kontrak",
            "Pembalasan",
            "Naga"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001765702",
          "title": "Terlambat Menyesal, Alpha",
          "description": "Pada hari ulang tahun Alpha Kurtis, dia meninggalkan Luna-nya, Melanie, dan putri mereka dalam serangan naga mematikan demi menyelamatkan selingkuhannya.\nSaat jiwa serigala putrinya perlahan tenggelam dalam kegelapan, Melanie memutuskan Ikatan Pasangan dan bersumpah untuk membalasnya dengan darah.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-xKJ43eTIR6.jpg",
          "totalEpisodes": 69,
          "views": 4814,
          "author": "YQ",
          "actors": [],
          "category": [
            "Manusia Serigala",
            "Naga",
            "Pengkhianatan",
            "Perselingkuhan",
            "Balas Dendam",
            "Pernikahan"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001781692",
          "title": "Baru Sayang Pas Aku Pergi",
          "description": "Selama tiga tahun, Hannah tidur dengan orang asing. Kembaran saudaranya, Ansel. Pernikahan yang dibangun dengan rencana balas dendam Aiden untuk Ivy. Setelah kematian ibunya dan kegugurannya, Hannah pun balas dendam, memutuskan kedua saudara itu dari hidupnya dan mulai hidup yang baru di luar negeri.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-t7eFx95kjT.jpg",
          "totalEpisodes": 54,
          "views": 2897,
          "author": "YQ",
          "actors": [],
          "category": [
            "Penyesalan",
            "Mafia",
            "Pernikahan",
            "Penuh Intrik",
            "Pembalasan",
            "Pengkhianatan"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001766481",
          "title": "Tak Salah Lagi, Ini Takdir",
          "description": "Dikhianati kekasihnya. Diburu oleh ayahnya. Dipaksa untuk menjadi pasangan seorang Raja Alpha yang kejam. Cora mengira hidupnya sudah berakhir, sampai ia berhasil melarikan diri dan secara tak sengaja menjalin ikatan dengan seorang pria asing yang berbahaya namun memikat. Tanpa pilihan lain, ia menerima tawaran ikatan pasangan palsu dari pria itu, sama sekali tidak menyadari bahwa \"pasangan palsu\"-nya tersebut adalah sosok Raja Alpha yang selama ini mati-matian ia hindari...",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-OgBmvH0Y8W.jpg",
          "totalEpisodes": 50,
          "views": 4515,
          "author": "YQ",
          "actors": [],
          "category": [
            "Pernikahan",
            "Romansa Gelap",
            "Alpha",
            "Nikah Kontrak",
            "Cinta Terlarang"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001622234",
          "title": "Sang Mantan yang Kuanggap Sudah Tiada",
          "description": "Erika mematahkan hati Adrian demi menyelamatkannya. Lima tahun kemudian, dia memohon pada pria yang kini sudah berkuasa itu untuk membiayai operasi putrinya — anak yang bahkan tak pernah diketahui keberadaannya oleh Adrian — hingga akhirnya dia sendiri meninggal karena kanker. Namun arwahnya tetap tinggal, menjaga anak mereka, menyelamatkan Adrian dari upaya bunuh diri, dan akhirnya menjadi pengantinnya.",
          "cover": "https://acfs1.goodreels.com/videobook/202607/cover-1ve20u0pzg.jpg",
          "totalEpisodes": 50,
          "views": 52507,
          "author": "viana",
          "actors": [],
          "category": [
            "Sakit Hati",
            "CLBK",
            "Takdir",
            "Anak Lucu",
            "Salah Paham",
            "Saling Kejar"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001675010",
          "title": "Dari Napi Menjadi Bos Dunia Mafia",
          "description": "\"Tyler rela mengorbankan dirinya demi adik tirinya dan menghabiskan lima tahun di balik jeruji besi. Saat akhirnya dia kembali, tunangannya telah direbut orang lain, keluarganya berbalik memusuhinya, dan semua yang dulu menjadi miliknya telah lenyap. Namun, pria yang dulu mereka singkirkan itu, kini menjadi bos seluruh dunia mafia dan pembalasan dendamnya baru saja dimulai.\n\n\n\"",
          "cover": "https://acfs1.goodreels.com/videobook/202608/cover-nwOPJJrklQ.jpg",
          "totalEpisodes": 50,
          "views": 26034,
          "author": "Hzf",
          "actors": [],
          "category": [
            "Balas Dendam",
            "Dewa Perang",
            "Kebangkitan",
            "Pembalasan",
            "Benci",
            "Menghukum Mantan Jahat",
            "Penuh Intrik"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001777713",
          "title": "Wangi Penjinak Sang Buas",
          "description": "Seorang pembuat parfum dari kota kecil yang sedang kesulitan keuangan setuju menjalani pernikahan demi uang senilai 800 juta—namun kemudian mendapati bahwa suaminya yang tampak \"biasa saja\" itu ternyata adalah raja manusia serigala yang menikahinya demi aroma tubuhnya yang mampu menenangkan sisi buas sang raja.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-vFJPndFLjL.jpg",
          "totalEpisodes": 50,
          "views": 1192,
          "author": "YQ",
          "actors": [],
          "category": [
            "Manis",
            "Takdir",
            "Manusia Serigala",
            "Nikah Kontrak",
            "Cinta Setelah Menikah",
            "Saling Kejar"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001765927",
          "title": "Bosku Ternyata Anjing Kecilku",
          "description": "Maisie mengira dirinya telah menyelamatkan seekor anak anjing telantar. Namun, saat melihat ada wujud manusia dengan telinga serigala, dan makhluk itu memanggilnya dengan sebutan \"\"Nona\"\", Maisie tercengang. Astaga, CEO Alpha yang kejam itu ternyata anak anjingnya.",
          "cover": "https://acfs1.goodreels.com/videobook/202609/cover-aUXsXPo39h.jpg",
          "totalEpisodes": 59,
          "views": 7339,
          "author": "YQ",
          "actors": [],
          "category": [
            "Manis",
            "Manusia Serigala",
            "Romansa Kantor",
            "CEO",
            "Mengejar Istri"
          ],
          "isComplete": true
        },
        {
          "seriesId": "31001370493",
          "title": "Kakak Tiriku Sungguh Menggoda",
          "description": "Lexi menyamar sebagai adik tiri raja mafia yang lama hilang untuk menyelamatkan ibunya. Tugasnya adalah menghancurkan raja mafia itu. Tapi rencananya tidak berjalan mulus. Pria itu percaya padanya, jatuh cinta padanya, ingin memilikinya. Semakin dia lanjut, semakin susah dia kabur. Saat kebohongan terbongkar, pria itu takkan mau melepaskannya.",
          "cover": "https://acfs1.goodreels.com/videobook/202604/cover-rJjXmsaDzg.jpg",
          "totalEpisodes": 57,
          "views": 52953,
          "author": "Morely",
          "actors": [],
          "category": [
            "Keluarga",
            "Takdir",
            "Mafia",
            "Cinta dan Benci",
            "Penebusan"
          ],
          "isComplete": true
        }
      ]
    }
  ]
}

GoodShort Search

{
  "success": true,
  "keyword": "love",
  "items": [
    {
      "seriesId": "31001099700",
      "title": "Trapped and Redeemed By His Love",
      "description": "",
      "cover": "https://acfs1.goodreels.com/videobook/202508/cover-3ODbMBGUTR.jpg",
      "totalEpisodes": 0,
      "views": "12.4M",
      "author": "GINA",
      "actors": [
        "Franky Cammarata",
        "Sophia Delucchi"
      ],
      "category": [
        "Toxic Love",
        "Second Chance",
        "Cute Kids",
        "Misunderstanding",
        "Chasing Love"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31000810138",
      "title": "Will You Be My Love Again?",
      "description": "",
      "cover": "https://acfs1.goodreels.com/videobook/202408/cover-QpojSQmqTu.jpg",
      "totalEpisodes": 0,
      "views": "10.7M",
      "author": "GINA",
      "actors": [
        "Jake Hobbs",
        "Emily Gateley"
      ],
      "category": [
        "Marriage",
        "Redemption",
        "Cinderella",
        "CEO",
        "Misidentification"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31000688865",
      "title": "Love by Contract",
      "description": "",
      "cover": "https://acfs1.goodreels.com/videobook/202404/cover-OHTFMBMIvg.jpg",
      "totalEpisodes": 0,
      "views": "8.9M",
      "author": "Sue",
      "actors": [
        "Noah Fearnley",
        "Rachel Coopes"
      ],
      "category": [
        "Marriage",
        "CEO",
        "Billionaire",
        "Contract Marriage"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31000662271",
      "title": "Perfect Love",
      "description": "",
      "cover": "https://acfs1.goodreels.com/videobook/202404/cover-kwkvKgdllc.jpg",
      "totalEpisodes": 0,
      "views": "8.6M",
      "author": "Sue",
      "actors": [
        "James Liddell",
        "Clara Carlo"
      ],
      "category": [
        "Sweet",
        "Marriage",
        "CEO",
        "Crush-to-love"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31000889702",
      "title": "The Lady Boss from Betrayed to Beloved",
      "description": "",
      "cover": "https://acfs1.goodreels.com/videobook/202412/cover-YZGFmRQBZ3.jpg",
      "totalEpisodes": 0,
      "views": "8.4M",
      "author": "GINA",
      "actors": [
        "Sam Myerson",
        "Emily Gateley"
      ],
      "category": [
        "Marriage",
        "Secret Identity",
        "CEO",
        "Strong Female Lead",
        "Counterattack"
      ],
      "isComplete": false
    }
  ]
}

GoodShort Trending
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/goodshort/trending?apikey=ahmuqkey&page=1&lang=id",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

respone
{
  "success": true,
  "page": 1,
  "total": 300,
  "channel": "Tren🔥",
  "items": [
    {
      "seriesId": "31001765931",
      "title": "Putri Kecil Penjinak Makhluk Ajaib",
      "description": "Lyra, gadis kecil berusia empat tahun yang memiliki darah peri, ditelantarkan di hutan dan diadopsi oleh Earl yang baik hati. Berkat anugerah pembawa keberuntungannya, dia berhasil menyelamatkan nyawa saudaranya, memenangkan perlombaan kuda, serta mengubah nasib Keluarga Montfort. Sejak saat itu, dia menjadi sosok pembawa keberuntungan berharga bagi keluarga tersebut.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-9S46s6ioL8.jpg",
      "totalEpisodes": 68,
      "views": 0,
      "author": "YQ",
      "actors": [],
      "category": [
        "Disayangi Semua",
        "Anak Lucu",
        "Keluarga",
        "Anak Ajaib"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31001740822",
      "title": "Kabur dari Nikah, Malah Dapat Pembalap Sultan",
      "description": "Setelah melarikan diri dari pernikahan paksa, Mallory Sutton secara impulsif menikahi seorang montir yang dicampakkan oleh mantannya. Ternyata, montir itu adalah legenda balap yang menyembunyikan identitasnya dan pewaris keluarga kaya! Ketika mantannya yang toksik memohon agar dia kembali, montir itu menggenggam tangan Mallory lebih erat dan tidak pernah menoleh ke belakang.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-RFJIEZAjcs.jpg",
      "totalEpisodes": 55,
      "views": 0,
      "author": "YQ",
      "actors": [],
      "category": [
        "Nikah Kilat",
        "Kebangkitan",
        "Identitas Tersembunyi",
        "Pewaris",
        "Pembalasan",
        "Pengkhianatan",
        "Pernikahan"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31001740824",
      "title": "Cerai? Gas Naik Level!",
      "description": "Setelah dicampakkan dan dipermalukan oleh mantan istrinya, Edo, pewaris rahasia Grup Sanjaya, menemukan cinta baru bersama Yuni. Saat menghadapi berbagai ujian dari keluarga konglomeratnya dan menghancurkan musuh-musuh mereka, Edo merebut kembali kekuasaan, kekayaan, dan cinta yang memang ditakdirkan untuknya.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-5Ct6Dx93g0.jpg",
      "totalEpisodes": 60,
      "views": 0,
      "author": "YQ",
      "actors": [],
      "category": [
        "Identitas Tersembunyi",
        "Pewaris",
        "Kebangkitan",
        "Pembalasan",
        "Menghukum Mantan Jahat"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31001700648",
      "title": "Kiamat Datang, Aku Beli Istri",
      "description": "Bertahun-tahun setelah dunia hancur akibat kiamat, Sam hanyalah orang biasa yang berjuang untuk bertahan hidup. Namun, kemunculan sebuah sistem mengubah seluruh hidupnya. Demi menyelamatkan nyawanya sendiri, Sam harus memahami arti keberanian yang sebenarnya ketika dia ditugaskan untuk melindungi tiga wanita cantik. Pada akhirnya, ketiga wanita itu memilih untuk menjadi istrinya.",
      "cover": "https://acfs1.goodreels.com/videobook/202608/cover-PpCAiS6oGC.jpg",
      "totalEpisodes": 61,
      "views": 0,
      "author": "YQ",
      "actors": [],
      "category": [
        "Harem",
        "Sistem",
        "Kebangkitan",
        "Orang Biasa",
        "Pembalasan"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31001700647",
      "title": "Disewa Jadi Pengasuh, Dipilih Jadi Ibu",
      "description": "Suaminya selingkuh, sahabatnya merebut keluarganya, putrinya memilih wanita lain sebagai ibu. Serena yang pergi tanpa membawa apa-apa, terseret ke dalam dunia Roman, seorang miliarder yang posesif. Sementara itu, putri Roman justru memanggilnya \"Ibu\". Saat Roman menawarkan untuk memberikan kembali segalanya yang pernah hilang, mana mungkin Serena menolak?",
      "cover": "https://acfs1.goodreels.com/videobook/202608/cover-lxee2MSpA1.jpg",
      "totalEpisodes": 62,
      "views": 0,
      "author": "YQ",
      "actors": [],
      "category": [
        "Anak Lucu",
        "Nikah Kilat",
        "Menghukum Mantan Jahat",
        "Mengejar Istri",
        "Manis",
        "Ibu Rumah Tangga",
        "Pernikahan"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31001740826",
      "title": "Aku Tinggal Landas, Dia Tinggal Menyesal",
      "description": "\"Nadia rela meninggalkan dunia penerbangan demi suaminya, Gavin. Dia menyerahkan kursinya di kokpit dan memilih menjadi ibu rumah tangga. Namun, sesaat sebelum kesalahan Gavin menyebabkan seluruh penumpang pesawat tewas, Nadia memergokinya berselingkuh dengan seorang pramugari. \n\nTerlahir kembali satu tahun sebelumnya, Nadia memutuskan kembali ke sekolah penerbangan. Kali ini, dia akan mengalahkan pria yang telah mengkhianatinya, membuktikan kemampuannya, dan merebut kembali tempatnya di dunia penerbangan.\"",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-FbeQHWwXD6.jpg",
      "totalEpisodes": 61,
      "views": 0,
      "author": "YQ",
      "actors": [],
      "category": [
        "Reinkarnasi",
        "Pernikahan",
        "Wanita Kuat",
        "Ibu Rumah Tangga",
        "Pahlawan Kembali",
        "Pengkhianatan",
        "Pembalasan",
        "Identitas Tersembunyi"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31001740818",
      "title": "Bapaknya Bukan Kaleng-Kaleng",
      "description": "Lima tahun setelah malam penuh gairah, sang Ratu Serigala akhirnya menemukan ayah dari anaknya saat klannya di ambang kehancuran. Tanpa disadarinya, pria itu ternyata adalah Penyihir Agung yang menjadi kunci untuk menyelamatkan dirinya dan klannya.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-p9ZvW7PzZz.jpg",
      "totalEpisodes": 60,
      "views": 0,
      "author": "YQ",
      "actors": [],
      "category": [
        "Manis",
        "Anak Lucu",
        "Manusia Serigala",
        "Identitas Tersembunyi",
        "Menghukum Mantan Jahat",
        "Dibantu Bayi Lucu"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31001740386",
      "title": "Bos Geng Cantik dan Prianya",
      "description": "Setelah dicampakkan dan dipermalukan oleh mantan kekasihnya, Yuri, Noah—pewaris rahasia Keluarga Sinclair—menemukan cinta baru bersama Sarah. Saat mereka berdua menghadapi berbagai ujian dari keluarganya dan menghancurkan musuh-musuh mereka, Noah berhasil merebut kembali kekuasaan, kekayaan, serta cinta yang memang seharusnya menjadi miliknya.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-bLvE2vc50S.jpg",
      "totalEpisodes": 60,
      "views": 0,
      "author": "YQ",
      "actors": [],
      "category": [
        "Manis",
        "Wanita Kuat",
        "Takdir",
        "Pernikahan",
        "Pembalasan",
        "Pengkhianatan"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31001765933",
      "title": "Berbalik, Menutup Hati",
      "description": "Selama tujuh tahun, dia bertahan dalam pernikahannya dengan seorang CEO mafia. Namun, semua pengorbanannya terbayar dengan pengkhianatan terbesar. Suaminya ternyata memiliki keluarga kedua bersama adik angkatnya. Untuk melarikan diri dari pernikahan yang menghancurkan dirinya, dia memalsukan kematian dalam sebuah kecelakaan pesawat dan meninggalkan masa lalunya yang penuh luka. \nKini, dia telah menyerah pada cinta dan memilih membangun kehidupan baru yang hanya berpusat pada dirinya sendiri.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-Jm9rDy9YNx.jpg",
      "totalEpisodes": 55,
      "views": 0,
      "author": "YQ",
      "actors": [],
      "category": [
        "Penyesalan",
        "Pernikahan",
        "Mafia",
        "Pengkhianatan",
        "Pembalasan"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31001100586",
      "title": "Romansa 19+: Mantan dan Pilihan Gila",
      "description": "Emily, yang belum pernah pacaran seumur hidupnya, berpura-pura menjadi \"FWB\" dengan sahabatnya, Alex, demi hadiah 3 miliar di sebuah reality show kencan. Ia terkejut dengan aturan acara yang mengharuskannya berciuman dan tidur seranjang dengan kontestan pria lain. Kini, Emily harus berjuang menyembunyikan jati dirinya yang sebenarnya dalam eksperimen yang liar dan provokatif ini, di mana rahasianya bisa saja terbongkar kapan pun.",
      "cover": "https://acfs1.goodreels.com/videobook/202508/cover-WMAwm1gWG9.jpg",
      "totalEpisodes": 72,
      "views": 0,
      "author": "Henry",
      "actors": [],
      "category": [
        "Manis",
        "Cinta Segitiga",
        "Benci Jadi Cinta",
        "Cinta Satu Malam"
      ],
      "isComplete": false
    },
    {
      "seriesId": "31001700648",
      "title": "Kiamat Datang, Aku Beli Istri",
      "description": "Bertahun-tahun setelah dunia hancur akibat kiamat, Sam hanyalah orang biasa yang berjuang untuk bertahan hidup. Namun, kemunculan sebuah sistem mengubah seluruh hidupnya. Demi menyelamatkan nyawanya sendiri, Sam harus memahami arti keberanian yang sebenarnya ketika dia ditugaskan untuk melindungi tiga wanita cantik. Pada akhirnya, ketiga wanita itu memilih untuk menjadi istrinya.",
      "cover": "https://acfs1.goodreels.com/videobook/202608/cover-TQIburE3m4.jpg",
      "totalEpisodes": 61,
      "views": 581450,
      "author": "YQ",
      "actors": [],
      "category": [
        "Harem",
        "Sistem",
        "Kebangkitan",
        "Orang Biasa",
        "Pembalasan"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001781681",
      "title": "Sentuh Adikku, Hadapi Bos Mafia",
      "description": "Kane menghadiri pesta pertunangan adiknya, Evelyn, dengan menyamar sebagai janitor. Namun, dia justru mendapat hinaan pedas dari tunangan Evelyn, Dorian, dan keluarganya yang sombong. Saat para taipan paling berkuasa di kota berlutut ketakutan di hadapannya, Keluarga Winston yang syok akhirnya sadar bahwa pria yang mereka remehkan adalah Raja Bayangan.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-HAbuYgkSJW.jpg",
      "totalEpisodes": 69,
      "views": 38057,
      "author": "YQ",
      "actors": [],
      "category": [
        "Identitas Tersembunyi",
        "Pembalasan",
        "CEO",
        "Salah Paham",
        "Menghukum Mantan Jahat"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001740822",
      "title": "Kabur dari Nikah, Malah Dapat Pembalap Sultan",
      "description": "Setelah melarikan diri dari pernikahan paksa, Mallory Sutton secara impulsif menikahi seorang montir yang dicampakkan oleh mantannya. Ternyata, montir itu adalah legenda balap yang menyembunyikan identitasnya dan pewaris keluarga kaya! Ketika mantannya yang toksik memohon agar dia kembali, montir itu menggenggam tangan Mallory lebih erat dan tidak pernah menoleh ke belakang.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-Hyx8ePGs86.jpg",
      "totalEpisodes": 55,
      "views": 147211,
      "author": "YQ",
      "actors": [],
      "category": [
        "Nikah Kilat",
        "Kebangkitan",
        "Identitas Tersembunyi",
        "Pewaris",
        "Pembalasan",
        "Pengkhianatan",
        "Pernikahan"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001765933",
      "title": "Berbalik, Menutup Hati",
      "description": "Selama tujuh tahun, dia bertahan dalam pernikahannya dengan seorang CEO mafia. Namun, semua pengorbanannya terbayar dengan pengkhianatan terbesar. Suaminya ternyata memiliki keluarga kedua bersama adik angkatnya. Untuk melarikan diri dari pernikahan yang menghancurkan dirinya, dia memalsukan kematian dalam sebuah kecelakaan pesawat dan meninggalkan masa lalunya yang penuh luka. \nKini, dia telah menyerah pada cinta dan memilih membangun kehidupan baru yang hanya berpusat pada dirinya sendiri.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-v9IKi8pK7q.jpg",
      "totalEpisodes": 55,
      "views": 26320,
      "author": "YQ",
      "actors": [],
      "category": [
        "Penyesalan",
        "Pernikahan",
        "Mafia",
        "Pengkhianatan",
        "Pembalasan"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001267802",
      "title": "Perasaan Terlarang Pada Sepupuku",
      "description": "Karena kondisi tubuhnya yang memalukan, Billie meminta sepupunya, Vincent untuk melakukan pemeriksaan tubuh padanya secara mendetail. Vincent sendiri adalah dokter UKS di universitasnya. Tapi hasrat terlarang antara mereka berdua justru tumbuh. Setelah mendapati bahwa mereka berdua tidak memiliki hubungan darah sama sekali, Billie mulai mendekati Vincent. Walau Vincent berusaha menjauh darinya, keinginan hatinya membuatnya susah mengontrol diri, hingga akhirnya perlahan pertahanannya runtuh...",
      "cover": "https://acfs1.goodreels.com/videobook/202601/cover-JbFCzuGTgU.jpg",
      "totalEpisodes": 72,
      "views": 555137,
      "author": "Andy",
      "actors": [],
      "category": [
        "Manis",
        "Cinta Terlarang",
        "Cinta Diam-diam Jadi Kenyataan",
        "Pura-pura Bodoh",
        "Pewaris Wanita"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001345253",
      "title": "Dia Selingkuh, Aku Naik ke Puncak!",
      "description": "Emily Carter adalah seorang istri yang setia mendukung karier suaminya, Ethan Carter, sebagai pilot. Pada hari jadi pernikahan mereka yang ketujuh, Emily memberikan kejutan dengan menyelinap ke penerbangan HK195 yang dipiloti Ethan. Namun, badai petir hebat menyebabkan pesawat tersebut menukik tajam dan berada di ambang kecelakaan.",
      "cover": "https://acfs1.goodreels.com/videobook/202604/cover-5eVDMjJKP6.jpg",
      "totalEpisodes": 62,
      "views": 932541,
      "author": "Morely",
      "actors": [],
      "category": [
        "Sakit Hati",
        "Reinkarnasi",
        "Wanita Kuat",
        "Menghukum Mantan Jahat"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001765931",
      "title": "Putri Kecil Penjinak Makhluk Ajaib",
      "description": "Lyra, gadis kecil berusia empat tahun yang memiliki darah peri, ditelantarkan di hutan dan diadopsi oleh Earl yang baik hati. Berkat anugerah pembawa keberuntungannya, dia berhasil menyelamatkan nyawa saudaranya, memenangkan perlombaan kuda, serta mengubah nasib Keluarga Montfort. Sejak saat itu, dia menjadi sosok pembawa keberuntungan berharga bagi keluarga tersebut.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-B9ukmPDIfk.jpg",
      "totalEpisodes": 68,
      "views": 57979,
      "author": "YQ",
      "actors": [],
      "category": [
        "Disayangi Semua",
        "Anak Lucu",
        "Keluarga",
        "Anak Ajaib"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001717099",
      "title": "Suami Cabut, Uang Ikut Raib",
      "description": "Terikat janji enam tahun, jin sakti Evren menyembunyikan identitas aslinya demi melindungi sang istri, Layla, dan menyelamatkan perusahaannya dari berbagai krisis. Namun, Layla justru memperlakukannya layaknya pelayan tak berguna. Begitu kontrak berakhir, Evren pun melangkah pergi—membiarkan Layla menyadari kenyataan pahit bahwa segala yang ia miliki selama ini dibangun oleh suami yang selalu ia hina.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-vrOXIRD4uJ.jpg",
      "totalEpisodes": 51,
      "views": 21805,
      "author": "YQ",
      "actors": [],
      "category": [
        "Penyesalan",
        "Pernikahan",
        "Identitas Tersembunyi",
        "Pembalasan",
        "CEO Wanita"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001677355",
      "title": "Ayah, kita bukan keluarga lagi.",
      "description": "Selama sepuluh tahun hidup serba kekurangan demi membesarkan putrinya, Lily, seorang janitor bernama Maya akhirnya mengetahui bahwa suaminya, Adrian, adalah seorang miliarder yang selama ini menelantarkan mereka demi memanjakan cinta pertamanya. Maya yang hancur kemudian memilih pergi membawa putrinya, hingga sebuah rahasia masa lalu terungkap bahwa ia sebenarnya adalah putri dari seorang pahlawan perang dan diangkat menjadi pewaris sah dari keluarga Harrington yang sangat berkuasa. Ketika Adrian pada akhirnya kehilangan segalanya dan jatuh berlutut memohon ampunan, Lily menolaknya dengan satu jawaban telak: \"Ayah, kita cukup sampai di sini.\"",
      "cover": "https://acfs1.goodreels.com/videobook/202608/cover-X1H4t3xA59.jpg",
      "totalEpisodes": 60,
      "views": 35989,
      "author": "YQ",
      "actors": [],
      "category": [
        "Sakit Hati",
        "Pernikahan",
        "Pewaris Wanita",
        "Perceraian",
        "Mengejar Istri",
        "Menghukum Mantan Jahat"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001700649",
      "title": "Sang Villainess Bayar Dosa di Atas Ranjang",
      "description": "Setelah terbangun, sang Putri bersumpah untuk menjinakkan kembali empat monster yang dulu ia hancurkan. Serigala liar di bawah cahaya bulan, tanda gigitan vampir tinggi di pahanya, sentuhan berat sang singa, dan air mata duyung di tulang selangkanya... Saat mangsa berubah jadi pemangsa, di antara takhta dan ranjangnya—siapa yang akan dilahap lebih dulu?",
      "cover": "https://acfs1.goodreels.com/videobook/202608/cover-Yu6HVsmH2q.jpg",
      "totalEpisodes": 69,
      "views": 63256,
      "author": "YQ",
      "actors": [],
      "category": [
        "Manis",
        "Perjalanan Waktu",
        "Harem",
        "Bangsawan",
        "Pewaris Wanita"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001700647",
      "title": "Disewa Jadi Pengasuh, Dipilih Jadi Ibu",
      "description": "Suaminya selingkuh, sahabatnya merebut keluarganya, putrinya memilih wanita lain sebagai ibu. Serena yang pergi tanpa membawa apa-apa, terseret ke dalam dunia Roman, seorang miliarder yang posesif. Sementara itu, putri Roman justru memanggilnya \"Ibu\". Saat Roman menawarkan untuk memberikan kembali segalanya yang pernah hilang, mana mungkin Serena menolak?",
      "cover": "https://acfs1.goodreels.com/videobook/202608/cover-Zq9VfrXLzO.jpg",
      "totalEpisodes": 62,
      "views": 105894,
      "author": "YQ",
      "actors": [],
      "category": [
        "Anak Lucu",
        "Nikah Kilat",
        "Menghukum Mantan Jahat",
        "Mengejar Istri",
        "Manis",
        "Ibu Rumah Tangga",
        "Pernikahan"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001791871",
      "title": "Si Jelek Malah Bikin 4 Beastman Klepek-Klepek",
      "description": "Seorang gadis modern terbangun di dalam novel fiksi ilmiah bertema beastman sebagai Putri Aria yang buruk rupa dan memiliki reputasi buruk. Demi bertahan hidup, dia memilih empat pria beastman paling seksi untuk menjadi suaminya. Dengan hidangan lezat dan ketulusan, dia berhasil memenangkan hati mereka, memancarkan kecantikan aslinya, serta membongkar rencana jahat Ratu Grace. Aria pun menjadi permaisuri abadi, mematahkan kutukan genetik, dan membebaskan seluruh galaksi.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-V3tke2Py13.jpg",
      "totalEpisodes": 67,
      "views": 2051,
      "author": "YQ",
      "actors": [],
      "category": [
        "Manis",
        "CLBK",
        "Takdir",
        "Kaisar Wanita",
        "Harem",
        "Intrik Istana"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001781685",
      "title": "[Sulih Suara]Siapa Berani Sentuh Penolongku?!",
      "description": "Ethan Dalton dulunya adalah anak yang bekerja sebagai tukang pembersih jalanan. Dia membersihkan mobil di jalanan, lalu pertemuannya dengan Richard Harrington mengubah hidupnya. Richard membantunya dengan memberikan sejumlah uang demi menggapai mimpinya. Lima belas tahun kemudian, Ethan kembali sebagai bintang baru dalam dunia pembuatan roket, tapi malah menemukan bahwa Richard dikhianati anak adopsinya sendiri, perusahaannya direbut dan didorong ke puncak keputusasaan. Sekarang Ethan sudah kembali, apakah anak tak tahu terima kasih Richard bisa bertahan melawan balas dendam anak yang pernah ditolong Richard sendiri?",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-rP92et7dnT.jpg",
      "totalEpisodes": 59,
      "views": 3481,
      "author": "YQ",
      "actors": [],
      "category": [
        "Balas Dendam",
        "Kebangkitan",
        "CEO",
        "Pengkhianatan",
        "Pembalasan",
        "Perang Bisnis"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001777711",
      "title": "Selingkuh? Habis Hartamu!",
      "description": "Pada hari ulang tahunnya, Serena, Ketua Grup Sterling di Wall Street, mendapati suaminya, Hunter, menggunakan uangnya untuk membeli mobil-mobil mewah bagi selingkuhannya, Chloe. Saat terjadi tabrakan, Chloe dengan angkuhnya mempermalukan Serena, tanpa menyadari bahwa dia telah menyinggung orang yang salah.\nDi sebuah acara amal mewah, Serena muncul dengan memukau, lalu membongkar kebusukan Hunter dan Chloe di depan umum. Dia segera memulai proses perceraian sekaligus menarik kembali aset-asetnya, membuat kedua pengkhianat itu membayar mahal atas perbuatan mereka.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-xStIKkba8X.jpg",
      "totalEpisodes": 70,
      "views": 971,
      "author": "YQ",
      "actors": [],
      "category": [
        "Sakit Hati",
        "Balas Dendam",
        "CEO Wanita",
        "Pengkhianatan",
        "Perceraian",
        "Menghukum Mantan Jahat"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001100586",
      "title": "Romansa 19+: Mantan dan Pilihan Gila",
      "description": "Emily, yang belum pernah pacaran seumur hidupnya, berpura-pura menjadi \"FWB\" dengan sahabatnya, Alex, demi hadiah 3 miliar di sebuah reality show kencan. Ia terkejut dengan aturan acara yang mengharuskannya berciuman dan tidur seranjang dengan kontestan pria lain. Kini, Emily harus berjuang menyembunyikan jati dirinya yang sebenarnya dalam eksperimen yang liar dan provokatif ini, di mana rahasianya bisa saja terbongkar kapan pun.",
      "cover": "https://acfs1.goodreels.com/videobook/202508/cover-GVnb4nBPeX.jpg",
      "totalEpisodes": 72,
      "views": 2232653,
      "author": "Henry",
      "actors": [],
      "category": [
        "Manis",
        "Cinta Segitiga",
        "Benci Jadi Cinta",
        "Cinta Satu Malam"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001765929",
      "title": "Nikah Kilat dengan Bos Mafia yang Lumpuh",
      "description": "Ava, seorang gadis ladang peternakan, melarikan diri ke New York setelah dijual oleh ibu tirinya dan secara tak terduga menikahi Gabriel, seorang Bos Mafia yang berpura-pura menggunakan kursi roda. Seiring cinta tumbuh di tengah mimpi balet, pengkhianatan, dan identitas tersembunyi, sebuah kalung angsa zamrud mengungkapkan bahwa Ava adalah putri yang hilang dari Ratu Balet Yetta. Janji masa kecil Gabriel untuk menikahinya pun menjadi kenyataan.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-CmRJlvyKkr.jpg",
      "totalEpisodes": 64,
      "views": 8388,
      "author": "YQ",
      "actors": [],
      "category": [
        "Manis",
        "Nikah Kilat",
        "Pewaris Asli dan Palsu",
        "Mafia",
        "Cinderella",
        "Cinta Setelah Menikah"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001777717",
      "title": "Dikhianati Mate, Kupilih Sang Dewa Perang",
      "description": "Selama lima tahun, Karin hidup dalam penderitaan setelah suaminya, Damon, “tewas” dalam perang. Namun, Damon ternyata memalsukan kematiannya demi bisa tidur dengan kakak iparnya sendiri.\nKarin mencabut tanda pasangannya dan mengikat jiwanya dengan Watson, Dewa Perang Serigala Hitam. Dipermalukan dan ditinggalkan, Damon harus menghabiskan sisa hidupnya di kursi roda setelah dikutuk oleh Dewi Bulan. Sementara itu, Karin justru bangkit dan menjalani hidup yang lebih baik.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-947JFq5nRk.jpg",
      "totalEpisodes": 60,
      "views": 3563,
      "author": "YQ",
      "actors": [],
      "category": [
        "Takdir",
        "Manusia Serigala",
        "Pernikahan",
        "Pembalasan",
        "Pengkhianatan"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001777712",
      "title": "Siang Musuh, Malam Master",
      "description": "Klare adalah seorang perawat yang sering diabaikan di Klinik Gigi Venus. Dia berjuang menghadapi kecemasan berat setelah mengalami tragedi keluarga. Satu-satunya hal yang memberinya ketenangan adalah tunduk pada seorang master misterius yang perintah-perintahnya membuatnya merasa aman di dunia maya. \nNamun di kehidupan nyata, bos barunya, Dance Gordon, adalah pria sombong, bermulut tajam, dan selalu mencari-cari masalah dengannya. Di siang hari, mereka terus berselisih di klinik gigi. Hanya saja di malam hari, pria itu ternyata sosok master sempurna di balik layar, yang memberikan seluruh kesabaran dan kelembutannya hanya pada Cake. Musuh di dunia nyata, terikat dan tak bisa lepas di dunia maya.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-kxv9VT2gEn.jpg",
      "totalEpisodes": 54,
      "views": 2600,
      "author": "YQ",
      "actors": [],
      "category": [
        "Romansa Gelap",
        "Sakit Hati",
        "Orang Biasa",
        "Benci Jadi Cinta",
        "Identitas Tersembunyi",
        "SM"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001026710",
      "title": "Gairah Yang Berbahaya",
      "description": "Tommy, pemimpin kedua dari keluarga mafia secara tidak sengaja bertemu dengan Mathilda, seorang mahasiswi. Seiring dengan terbongkarnya rahasia dan setelah mengalami berbagai kejadian berbahaya, mereka terpaksa menghadapi masa lalu mereka. Pilihan mereka pun akan menentukan masa depan mereka.",
      "cover": "https://acfs1.goodreels.com/videobook/202505/cover-I3DxCcUBPf.jpg",
      "totalEpisodes": 71,
      "views": 455694,
      "author": "Henry",
      "actors": [],
      "category": [
        "Takdir",
        "Mafia",
        "Cinderella",
        "Kehamilan"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001675004",
      "title": "Langkah Demi Langkah Tidur Dengannya",
      "description": "Lena tidur dengan bosnya, Elliot sebelum mengetahui tentang orang tuanya. Sekarang mereka akan menjadi saudara tiri, terjebak dalam satu atap dan berjuang melawan nafsu yang nggak bisa ditahan siapa pun, di saat mantan pacar yang cemburu dan teman masa kecil yang berbahaya mengancam untuk mengungkapkan semuanya.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-jf2AKOdWtz.jpg",
      "totalEpisodes": 56,
      "views": 19829,
      "author": "Hzf",
      "actors": [],
      "category": [
        "Keluarga",
        "Takdir",
        "Romansa Kantor",
        "CEO",
        "Cinderella",
        "Cinta Terlarang"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001781684",
      "title": "Nyesel Setelah Tahu Dia Pangeran",
      "description": "Demi cinta, Serion rela melepaskan sayap dan gelar bangsawannya. Namun, dia justru dikhianati istri dan putranya hingga disiksa kaum siluman selama tiga tahun. Saat Serion akhirnya pergi, mereka baru mengetahui pria yang mereka sia-siakan adalah Pangeran Peri. Namun, penyesalan mereka sudah terlambat.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-5F9kEznBqF.jpg",
      "totalEpisodes": 60,
      "views": 4185,
      "author": "YQ",
      "actors": [],
      "category": [
        "Penyesalan",
        "Sakit Hati",
        "Pernikahan",
        "Dominan",
        "Bangsawan",
        "Menghukum Mantan Jahat"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001647328",
      "title": "Sistem Kencan Zombie",
      "description": "Saat kiamat zombie merebak, Mike dibunuh oleh istrinya, Sarah, dan sahabatnya, Ethan. Tapi, dia bangkit lagi jadi zombie dengan Sistem Cinta aneh: makin berhasil bikin wanita jatuh hati, makin besar kekuatannya. Targetnya, Jessie, terus berusaha bunuh dia. Di tengah hasrat, dendam, dan pasukan zombie, hubungan yang penuh benci itu berubah jadi cinta.",
      "cover": "https://acfs1.goodreels.com/videobook/202607/cover-qskA1bskmC.jpg",
      "totalEpisodes": 57,
      "views": 64946,
      "author": "viana",
      "actors": [],
      "category": [
        "Reinkarnasi",
        "Sistem",
        "Kebangkitan",
        "Dominan",
        "Orang Biasa",
        "Pembalasan"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001765939",
      "title": "Pandora Membalikkan Nasib Sang Pecundang",
      "description": "Terlempar ke Era Samudra yang dipenuhi monster, Kotak Pandora tingkat SSS milik Aimar malah diejek sebagai sampah tak berguna. Dicampakkan dan diusir, ia justru berhasil membuka segel artefak tersebut—membangkitkan Poseidon dan sepuluh dewa purba. Kini, sang pecundang yang terbuang telah bangkit menguasai lautan, memaksa setiap musuhnya berlutut di bawah kakinya.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-cSX1XNlsNm.jpg",
      "totalEpisodes": 60,
      "views": 8045,
      "author": "YQ",
      "actors": [],
      "category": [
        "Kebangkitan",
        "Pembalasan",
        "Orang Biasa",
        "Identitas Tersembunyi"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001717098",
      "title": "Mommy, Masa Lupa Aku dan Daddy?",
      "description": "Regina terbangun 10 tahun kemudian dan mendapati dirinya telah menikah dengan Linus, musuh bebuyutannya, serta memiliki seorang putri. Selama ini, dia melakukan berbagai kesalahan karena dimanipulasi oleh Hunter. Setelah mengetahui kebenarannya, Regina bekerja sama dengan Linus untuk melawan balik, mengungkap masa lalu yang terlupakan, menyembuhkan luka lama, dan kembali jatuh cinta.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-RrSAPVWZpk.jpg",
      "totalEpisodes": 50,
      "views": 65387,
      "author": "YQ",
      "actors": [],
      "category": [
        "Manis",
        "CLBK",
        "Pernikahan",
        "Menghukum Mantan Jahat",
        "Anak Lucu",
        "Pembalasan",
        "Pengkhianatan"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001677357",
      "title": "Ayahku Ternyata Penguasa Dunia Naga",
      "description": "Empat tahun lalu, Elena diselamatkan oleh Kael Draven, sang Raja Naga. Mereka terikat dalam cinta satu malam hingga melahirkan seorang putri. Beberapa tahun kemudian, Kael menyamar dan memaksa Elena menikah kontrak agar putri mereka memiliki seorang ayah. Saat bahaya mengancam, identitas Kael perlahan terungkap dan tak bisa lagi menghindari takdir.",
      "cover": "https://acfs1.goodreels.com/videobook/202608/cover-pQq9LWrJs9.jpg",
      "totalEpisodes": 62,
      "views": 38020,
      "author": "YQ",
      "actors": [],
      "category": [
        "Anak Lucu",
        "Identitas Tersembunyi",
        "Pahlawan Kembali",
        "Nikah Kontrak",
        "Pembalasan",
        "Naga"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001765702",
      "title": "Terlambat Menyesal, Alpha",
      "description": "Pada hari ulang tahun Alpha Kurtis, dia meninggalkan Luna-nya, Melanie, dan putri mereka dalam serangan naga mematikan demi menyelamatkan selingkuhannya.\nSaat jiwa serigala putrinya perlahan tenggelam dalam kegelapan, Melanie memutuskan Ikatan Pasangan dan bersumpah untuk membalasnya dengan darah.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-xKJ43eTIR6.jpg",
      "totalEpisodes": 69,
      "views": 4814,
      "author": "YQ",
      "actors": [],
      "category": [
        "Manusia Serigala",
        "Naga",
        "Pengkhianatan",
        "Perselingkuhan",
        "Balas Dendam",
        "Pernikahan"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001781692",
      "title": "Baru Sayang Pas Aku Pergi",
      "description": "Selama tiga tahun, Hannah tidur dengan orang asing. Kembaran saudaranya, Ansel. Pernikahan yang dibangun dengan rencana balas dendam Aiden untuk Ivy. Setelah kematian ibunya dan kegugurannya, Hannah pun balas dendam, memutuskan kedua saudara itu dari hidupnya dan mulai hidup yang baru di luar negeri.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-t7eFx95kjT.jpg",
      "totalEpisodes": 54,
      "views": 2897,
      "author": "YQ",
      "actors": [],
      "category": [
        "Penyesalan",
        "Mafia",
        "Pernikahan",
        "Penuh Intrik",
        "Pembalasan",
        "Pengkhianatan"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001766481",
      "title": "Tak Salah Lagi, Ini Takdir",
      "description": "Dikhianati kekasihnya. Diburu oleh ayahnya. Dipaksa untuk menjadi pasangan seorang Raja Alpha yang kejam. Cora mengira hidupnya sudah berakhir, sampai ia berhasil melarikan diri dan secara tak sengaja menjalin ikatan dengan seorang pria asing yang berbahaya namun memikat. Tanpa pilihan lain, ia menerima tawaran ikatan pasangan palsu dari pria itu, sama sekali tidak menyadari bahwa \"pasangan palsu\"-nya tersebut adalah sosok Raja Alpha yang selama ini mati-matian ia hindari...",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-OgBmvH0Y8W.jpg",
      "totalEpisodes": 50,
      "views": 4515,
      "author": "YQ",
      "actors": [],
      "category": [
        "Pernikahan",
        "Romansa Gelap",
        "Alpha",
        "Nikah Kontrak",
        "Cinta Terlarang"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001622234",
      "title": "Sang Mantan yang Kuanggap Sudah Tiada",
      "description": "Erika mematahkan hati Adrian demi menyelamatkannya. Lima tahun kemudian, dia memohon pada pria yang kini sudah berkuasa itu untuk membiayai operasi putrinya — anak yang bahkan tak pernah diketahui keberadaannya oleh Adrian — hingga akhirnya dia sendiri meninggal karena kanker. Namun arwahnya tetap tinggal, menjaga anak mereka, menyelamatkan Adrian dari upaya bunuh diri, dan akhirnya menjadi pengantinnya.",
      "cover": "https://acfs1.goodreels.com/videobook/202607/cover-1ve20u0pzg.jpg",
      "totalEpisodes": 50,
      "views": 52507,
      "author": "viana",
      "actors": [],
      "category": [
        "Sakit Hati",
        "CLBK",
        "Takdir",
        "Anak Lucu",
        "Salah Paham",
        "Saling Kejar"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001675010",
      "title": "Dari Napi Menjadi Bos Dunia Mafia",
      "description": "\"Tyler rela mengorbankan dirinya demi adik tirinya dan menghabiskan lima tahun di balik jeruji besi. Saat akhirnya dia kembali, tunangannya telah direbut orang lain, keluarganya berbalik memusuhinya, dan semua yang dulu menjadi miliknya telah lenyap. Namun, pria yang dulu mereka singkirkan itu, kini menjadi bos seluruh dunia mafia dan pembalasan dendamnya baru saja dimulai.\n\n\n\"",
      "cover": "https://acfs1.goodreels.com/videobook/202608/cover-nwOPJJrklQ.jpg",
      "totalEpisodes": 50,
      "views": 26034,
      "author": "Hzf",
      "actors": [],
      "category": [
        "Balas Dendam",
        "Dewa Perang",
        "Kebangkitan",
        "Pembalasan",
        "Benci",
        "Menghukum Mantan Jahat",
        "Penuh Intrik"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001777713",
      "title": "Wangi Penjinak Sang Buas",
      "description": "Seorang pembuat parfum dari kota kecil yang sedang kesulitan keuangan setuju menjalani pernikahan demi uang senilai 800 juta—namun kemudian mendapati bahwa suaminya yang tampak \"biasa saja\" itu ternyata adalah raja manusia serigala yang menikahinya demi aroma tubuhnya yang mampu menenangkan sisi buas sang raja.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-vFJPndFLjL.jpg",
      "totalEpisodes": 50,
      "views": 1192,
      "author": "YQ",
      "actors": [],
      "category": [
        "Manis",
        "Takdir",
        "Manusia Serigala",
        "Nikah Kontrak",
        "Cinta Setelah Menikah",
        "Saling Kejar"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001765927",
      "title": "Bosku Ternyata Anjing Kecilku",
      "description": "Maisie mengira dirinya telah menyelamatkan seekor anak anjing telantar. Namun, saat melihat ada wujud manusia dengan telinga serigala, dan makhluk itu memanggilnya dengan sebutan \"\"Nona\"\", Maisie tercengang. Astaga, CEO Alpha yang kejam itu ternyata anak anjingnya.",
      "cover": "https://acfs1.goodreels.com/videobook/202609/cover-aUXsXPo39h.jpg",
      "totalEpisodes": 59,
      "views": 7339,
      "author": "YQ",
      "actors": [],
      "category": [
        "Manis",
        "Manusia Serigala",
        "Romansa Kantor",
        "CEO",
        "Mengejar Istri"
      ],
      "isComplete": true
    },
    {
      "seriesId": "31001370493",
      "title": "Kakak Tiriku Sungguh Menggoda",
      "description": "Lexi menyamar sebagai adik tiri raja mafia yang lama hilang untuk menyelamatkan ibunya. Tugasnya adalah menghancurkan raja mafia itu. Tapi rencananya tidak berjalan mulus. Pria itu percaya padanya, jatuh cinta padanya, ingin memilikinya. Semakin dia lanjut, semakin susah dia kabur. Saat kebohongan terbongkar, pria itu takkan mau melepaskannya.",
      "cover": "https://acfs1.goodreels.com/videobook/202604/cover-rJjXmsaDzg.jpg",
      "totalEpisodes": 57,
      "views": 52953,
      "author": "Morely",
      "actors": [],
      "category": [
        "Keluarga",
        "Takdir",
        "Mafia",
        "Cinta dan Benci",
        "Penebusan"
      ],
      "isComplete": true
    }
  ]
}

GoodShort Episodes
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/goodshort/episodes?apikey=ahmuqkey&seriesId=31001765931&lang=id",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);
{
  "success": true,
  "seriesId": "31001765931",
  "items": [
    {
      "episodeNum": 1,
      "episodeId": 65918363,
      "title": "001",
      "locked": false,
      "duration": 138,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-aKLpmPnIr4.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/isaxyblnmk/720p/e6fta3mpwj_720p.m3u8?__token__=exp=1791854165~hmac=ee1954014e268157684aee9c0e8a9c18a0d488068d66eb57d9e9f8ee6cf52cab"
    },
    {
      "episodeNum": 2,
      "episodeId": 65918364,
      "title": "002",
      "locked": false,
      "duration": 149,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-Z2ws89CMGh.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/dgunzbgwkr/720p/otvxnm0ndm_720p.m3u8?__token__=exp=1791852602~hmac=ff297111a4852199b5ad0f9eb67ee3b8083eb71c763148f42f313ceb78c1b96a"
    },
    {
      "episodeNum": 3,
      "episodeId": 65918365,
      "title": "003",
      "locked": false,
      "duration": 143,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-tczPr77jzI.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/4p69qhyqav/720p/ea1vuxdthp_720p.m3u8?__token__=exp=1791853043~hmac=a9821c1182623a4fabb03447bf0415e633910b026c456966d7f4d01bf7f371e4"
    },
    {
      "episodeNum": 4,
      "episodeId": 65918366,
      "title": "004",
      "locked": false,
      "duration": 134,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-GDNHw6w3pl.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/st4nd0riyq/720p/wpomhio25l_720p.m3u8?__token__=exp=1791853458~hmac=dcbee64471b79ffa3cfc41710f305ea8165fa38d00d6a3f083e4e586000491db"
    },
    {
      "episodeNum": 5,
      "episodeId": 65918367,
      "title": "005",
      "locked": false,
      "duration": 87,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-FO0EZkQN6i.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/nshtkbbu5s/720p/8xe4rooodk_720p.m3u8?__token__=exp=1791853043~hmac=639ed0e7972b241a9c91445a9e15d1d4590e03ab395fcc7220d2e7179ce4c0d8"
    },
    {
      "episodeNum": 6,
      "episodeId": 65918368,
      "title": "006",
      "locked": false,
      "duration": 84,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-iUIUs7p90l.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/epvnagzo5o/720p/gk5hflm5m5_720p.m3u8?__token__=exp=1791853043~hmac=e8fd0b14103460ed321d785eb7f30ca0ad72c3cbbcac80aee8a84eac4811779a"
    },
    {
      "episodeNum": 7,
      "episodeId": 65918369,
      "title": "007",
      "locked": false,
      "duration": 107,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-82MVDIaAG4.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/zwjjvksisn/720p/yhuynvqko5_720p.m3u8?__token__=exp=1791853043~hmac=3df8351763c85525031c29d057b64abcf7fbef7caaf0f2a581446a447f62c729"
    },
    {
      "episodeNum": 8,
      "episodeId": 65918370,
      "title": "008",
      "locked": false,
      "duration": 86,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-jqCx6Orh2Y.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/cswunowhi6/720p/71vayj5d4l_720p.m3u8?__token__=exp=1791853043~hmac=3fdc910d1edb967cb4c9d65cae26c2352a95efd2e2d2f2e91ef793c258733dae"
    },
    {
      "episodeNum": 9,
      "episodeId": 65918371,
      "title": "009",
      "locked": false,
      "duration": 158,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-Psn50b9UsH.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/qzh7frduqq/720p/q09gsyroak_720p.m3u8?__token__=exp=1791853458~hmac=4038b87a93e478a5a302bea93d0a11e08c5adf2ba43ece59e8f9484c1caca6b1"
    },
    {
      "episodeNum": 10,
      "episodeId": 65918372,
      "title": "010",
      "locked": false,
      "duration": 129,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-gd3XibhI3e.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/ok6rx7lnxu/720p/f2iny3it7j_720p.m3u8?__token__=exp=1791853043~hmac=60ea1aa7b93ab7a6ef741897464e83c6058a16c37793a4e929e1956a134955f3"
    },
    {
      "episodeNum": 11,
      "episodeId": 65918373,
      "title": "011",
      "locked": false,
      "duration": 94,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-L1FU5XnSrQ.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/lxphjerpug/720p/yvixzejk8r_720p.m3u8?__token__=exp=1791853043~hmac=0f28c016678288a5c83833a35e7fbb2ace9514e16ffc20f640f526de8266dfd9"
    },
    {
      "episodeNum": 12,
      "episodeId": 65918374,
      "title": "012",
      "locked": false,
      "duration": 140,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-esFep8e6mn.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/jk5zim87gd/720p/eyf5ugkb3w_720p.m3u8?__token__=exp=1791853043~hmac=ea7af0909907d5b7ecd6d02b52e220ef774467047c552f6a8449c6b8d8a0d9da"
    },
    {
      "episodeNum": 13,
      "episodeId": 65918375,
      "title": "013",
      "locked": false,
      "duration": 78,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-XAJ0jcaNrm.jpg?a=webp",
      "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/xfxt7soyfg/720p/yzgepcmgtw_720p.m3u8?__token__=exp=1791852602~hmac=39619746641f1be53a1f2599459f969aeb1c568d5898e9a5bd3db66118f09aeb"
    },
    {
      "episodeNum": 14,
      "episodeId": 65918376,
      "title": "014",
      "locked": true,
      "duration": 108,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-eEcDkOheDi.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 15,
      "episodeId": 65918377,
      "title": "015",
      "locked": true,
      "duration": 79,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-4pBvkgQW6f.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 16,
      "episodeId": 65918378,
      "title": "016",
      "locked": true,
      "duration": 112,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-mPepGA0cos.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 17,
      "episodeId": 65918379,
      "title": "017",
      "locked": true,
      "duration": 108,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-umHnKkdDoX.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 18,
      "episodeId": 65918380,
      "title": "018",
      "locked": true,
      "duration": 66,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-S7jKQuga8E.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 19,
      "episodeId": 65918381,
      "title": "019",
      "locked": true,
      "duration": 104,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-lQ1IHsPqb4.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 20,
      "episodeId": 65918382,
      "title": "020",
      "locked": true,
      "duration": 58,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-kfuFS8hXsN.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 21,
      "episodeId": 65918383,
      "title": "021",
      "locked": true,
      "duration": 106,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-ppWAoKAVe9.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 22,
      "episodeId": 65918384,
      "title": "022",
      "locked": true,
      "duration": 90,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-rAhtFDAGR4.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 23,
      "episodeId": 65918385,
      "title": "023",
      "locked": true,
      "duration": 110,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-aFhC7ENquL.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 24,
      "episodeId": 65918386,
      "title": "024",
      "locked": true,
      "duration": 87,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-9cP1b3OHpC.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 25,
      "episodeId": 65918387,
      "title": "025",
      "locked": true,
      "duration": 86,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-Cg7bVzf6Oh.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 26,
      "episodeId": 65918388,
      "title": "026",
      "locked": true,
      "duration": 82,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-44sv0QnPGT.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 27,
      "episodeId": 65918389,
      "title": "027",
      "locked": true,
      "duration": 100,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-aoW23FVs1C.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 28,
      "episodeId": 65918390,
      "title": "028",
      "locked": true,
      "duration": 105,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-NTYksGzei3.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 29,
      "episodeId": 65918391,
      "title": "029",
      "locked": true,
      "duration": 118,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-3VmefSWY7A.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 30,
      "episodeId": 65918392,
      "title": "030",
      "locked": true,
      "duration": 48,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-N6YG40YbAj.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 31,
      "episodeId": 65918393,
      "title": "031",
      "locked": true,
      "duration": 125,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-CE7i0DVWlz.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 32,
      "episodeId": 65918394,
      "title": "032",
      "locked": true,
      "duration": 132,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-mLurGWhNih.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 33,
      "episodeId": 65918395,
      "title": "033",
      "locked": true,
      "duration": 123,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-p1kndzixki.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 34,
      "episodeId": 65918396,
      "title": "034",
      "locked": true,
      "duration": 118,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-DfeGiakH5z.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 35,
      "episodeId": 65918397,
      "title": "035",
      "locked": true,
      "duration": 142,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-d3IVxbCl5C.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 36,
      "episodeId": 65918398,
      "title": "036",
      "locked": true,
      "duration": 123,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-kvROBhzR14.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 37,
      "episodeId": 65918399,
      "title": "037",
      "locked": true,
      "duration": 105,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-8KT2qc35Mb.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 38,
      "episodeId": 65918400,
      "title": "038",
      "locked": true,
      "duration": 89,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-ESBjftYbYg.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 39,
      "episodeId": 65918401,
      "title": "039",
      "locked": true,
      "duration": 127,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-xChI7GKGce.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 40,
      "episodeId": 65918402,
      "title": "040",
      "locked": true,
      "duration": 74,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-WswbRbB4g7.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 41,
      "episodeId": 65918403,
      "title": "041",
      "locked": true,
      "duration": 96,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-DTTDtko9TI.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 42,
      "episodeId": 65918404,
      "title": "042",
      "locked": true,
      "duration": 90,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-wpbg42Vk7Y.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 43,
      "episodeId": 65918405,
      "title": "043",
      "locked": true,
      "duration": 105,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-6SwHWeq444.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 44,
      "episodeId": 65918406,
      "title": "044",
      "locked": true,
      "duration": 105,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-we18SPorNf.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 45,
      "episodeId": 65918407,
      "title": "045",
      "locked": true,
      "duration": 125,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-1lmTDvvtpH.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 46,
      "episodeId": 65918408,
      "title": "046",
      "locked": true,
      "duration": 100,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-Hwv07A0ilo.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 47,
      "episodeId": 65918409,
      "title": "047",
      "locked": true,
      "duration": 104,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-0wTcfgkzB9.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 48,
      "episodeId": 65918410,
      "title": "048",
      "locked": true,
      "duration": 136,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-QXpcv1djja.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 49,
      "episodeId": 65918411,
      "title": "049",
      "locked": true,
      "duration": 113,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-HlK7VIatsh.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 50,
      "episodeId": 65918412,
      "title": "050",
      "locked": true,
      "duration": 108,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-cxvUXz9UwW.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 51,
      "episodeId": 65918413,
      "title": "051",
      "locked": true,
      "duration": 125,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-aa51DZuGgW.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 52,
      "episodeId": 65918414,
      "title": "052",
      "locked": true,
      "duration": 98,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-QHDStmJLrA.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 53,
      "episodeId": 65918415,
      "title": "053",
      "locked": true,
      "duration": 67,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-rF8X4B5bvQ.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 54,
      "episodeId": 65918416,
      "title": "054",
      "locked": true,
      "duration": 125,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-pBDf1p3T2f.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 55,
      "episodeId": 65918417,
      "title": "055",
      "locked": true,
      "duration": 108,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-J98c9wfHtp.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 56,
      "episodeId": 65918418,
      "title": "056",
      "locked": true,
      "duration": 71,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-0jdOS3uvb6.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 57,
      "episodeId": 65918419,
      "title": "057",
      "locked": true,
      "duration": 91,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-KfMO2fBSTo.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 58,
      "episodeId": 65918420,
      "title": "058",
      "locked": true,
      "duration": 74,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-fY1JH9hWBz.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 59,
      "episodeId": 65918421,
      "title": "059",
      "locked": true,
      "duration": 72,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-nUIA1u2moK.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 60,
      "episodeId": 65918422,
      "title": "060",
      "locked": true,
      "duration": 87,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-nWMkWlY9FY.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 61,
      "episodeId": 65918423,
      "title": "061",
      "locked": true,
      "duration": 100,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-ul3iisPvw4.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 62,
      "episodeId": 65918424,
      "title": "062",
      "locked": true,
      "duration": 113,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-BtO1MR6z03.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 63,
      "episodeId": 65918425,
      "title": "063",
      "locked": true,
      "duration": 102,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-j6isqEFQvi.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 64,
      "episodeId": 65918426,
      "title": "064",
      "locked": true,
      "duration": 77,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-uBK44rzJos.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 65,
      "episodeId": 65918427,
      "title": "065",
      "locked": true,
      "duration": 59,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-OLAY4WjJMN.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 66,
      "episodeId": 65918428,
      "title": "066",
      "locked": true,
      "duration": 85,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-CoEmp8UC6A.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 67,
      "episodeId": 65918429,
      "title": "067",
      "locked": true,
      "duration": 117,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-GVPgE4t82E.jpg?a=webp",
      "bestUrl": ""
    },
    {
      "episodeNum": 68,
      "episodeId": 65918430,
      "title": "068",
      "locked": true,
      "duration": 107,
      "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-9rIoHxH3wS.jpg?a=webp",
      "bestUrl": ""
    }
  ]
}

GoodShort Episode

const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/goodshort/episode?apikey=ahmuqkey&seriesId=31001765931&episode=1&lang=id",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "episodeNum": 1,
  "episodeId": 65918363,
  "title": "001",
  "locked": false,
  "duration": 138,
  "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-aKLpmPnIr4.jpg?a=webp",
  "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/isaxyblnmk/720p/e6fta3mpwj_720p.m3u8?__token__=exp=1791853971~hmac=44dddbff31aaf9852da742a51cc57a614680a3426947e9147006108c197fa1be"
}

GoodShort Detail
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/goodshort/detail?apikey=ahmuqkey&seriesId=31001765931&lang=id",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "seriesId": "31001765931",
  "title": "Putri Kecil Penjinak Makhluk Ajaib",
  "description": "Lyra, gadis kecil berusia empat tahun yang memiliki darah peri, ditelantarkan di hutan dan diadopsi oleh Earl yang baik hati. Berkat anugerah pembawa keberuntungannya, dia berhasil menyelamatkan nyawa saudaranya, memenangkan perlombaan kuda, serta mengubah nasib Keluarga Montfort. Sejak saat itu, dia menjadi sosok pembawa keberuntungan berharga bagi keluarga tersebut.",
  "cover": "https://acfs1.goodreels.com/videobook/202609/cover-9S46s6ioL8.jpg",
  "totalEpisodes": 68,
  "views": 57981,
  "author": "YQ",
  "actors": [],
  "category": [
    "Disayangi Semua",
    "Anak Lucu",
    "Keluarga",
    "Anak Ajaib"
  ],
  "isComplete": true,
  "language": "Bahasa Indonesia",
  "episodesTotal": 68,
  "firstEpisode": {
    "episodeNum": 1,
    "episodeId": 65918363,
    "title": "001",
    "locked": false,
    "duration": 138,
    "cover": "https://acfs1.goodreels.com/videobook/31001765931/202609/cover-aKLpmPnIr4.jpg?a=webp",
    "bestUrl": "https://v2-akm.goodreels.com/mts/books/931/31001765931/1057865/isaxyblnmk/720p/e6fta3mpwj_720p.m3u8?__token__=exp=1791853971~hmac=44dddbff31aaf9852da742a51cc57a614680a3426947e9147006108c197fa1be"
  }
}