Dramabox Popular
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/dramabox/popular?apikey=ahmuqkey",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);
{
  "success": true,
  "data": [
    {
      "bookId": "42000028264",
      "bookName": "Pewaris Jiwa Sang Alpha (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000028264/42000028264.jpg?t=1789697707738",
      "chapterCount": 30,
      "introduction": "Mia Blackridge, putri bungsu Alpha Blackridge Pack, dianggap anak bodoh dan tak berguna karena tak mampu berubah menjadi serigala. Namun diam-diam, ia adalah reinkarnasi Alpha yang pernah memimpin selama 70 tahun. Saat Beta Grady memalsukan titah kerajaan untuk membunuh ayah Mia dan memusnahkan pack, Mia membongkar segel palsu itu dan menggunakan kebijaksanaannya untuk mengalahkan musuh serta menyelamatkan seluruh pack.",
      "tags": [
        "Pembalikan Identitas",
        "Serangan Balik",
        "Manusia Serigala",
        "Kekuatan Khusus",
        "Wanita Kuat"
      ],
      "tagV3s": [
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1399,
          "tagName": "Serangan Balik",
          "tagEnName": "Counterattack"
        },
        {
          "tagId": 1363,
          "tagName": "Manusia Serigala",
          "tagEnName": "Werewolf"
        },
        {
          "tagId": 1371,
          "tagName": "Kekuatan Khusus",
          "tagEnName": "The Chosen One"
        },
        {
          "tagId": 1361,
          "tagName": "Wanita Kuat",
          "tagEnName": "Strong Heroine"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "动态小说漫",
        "印尼语",
        "美国",
        "AI+人工",
        "超短剧",
        "配音剧"
      ],
      "protagonist": "Mia Blackridge,  Gabriel Blackridge",
      "dataFrom": "大数据",
      "cardType": 1,
      "rankVo": {
        "rankType": 1,
        "hotCode": "287K",
        "sort": 1
      },
      "markNamesConnectKey": ", ",
      "bookShelfTime": 1789702185000,
      "shelfTime": "2026-09-18 11:29:45",
      "inLibrary": false
    },
    {
      "bookId": "42000026080",
      "bookName": "Racun Cinta Sang Mafia",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000026080/42000026080.jpg?t=1787884510687",
      "chapterCount": 56,
      "introduction": "Di hari pernikahan saudari tirinya, Victoria, Lily Watson—perawat berusia 25 tahun—dipaksa membuat kesepakatan mematikan. Victoria seharusnya menikah dengan Dominic Castellano, raja mafia kejam yang dikabarkan membunuh istri pertamanya. Namun saat Victoria kabur, anak buah Dominic mengancam keluarga Lily. Demi melindungi mereka, Lily menggantikan Victoria di altar dan menjadi pengantin pria yang ia takutkan sebagai pembunuh.",
      "tags": [
        "Mafia",
        "Cinta Paksaan",
        "Pengantin Kabur",
        "Wanita Karier",
        "Modern",
        "Romansa"
      ],
      "tagV3s": [
        {
          "tagId": 1364,
          "tagName": "Mafia",
          "tagEnName": "Mafia"
        },
        {
          "tagId": 1378,
          "tagName": "Cinta Paksaan",
          "tagEnName": "Forced Love"
        },
        {
          "tagId": 1396,
          "tagName": "Pengantin Kabur",
          "tagEnName": "Runaway Bride"
        },
        {
          "tagId": 1375,
          "tagName": "Wanita Karier",
          "tagEnName": "Career Woman"
        },
        {
          "tagId": 1352,
          "tagName": "Modern",
          "tagEnName": "Modern"
        },
        {
          "tagId": 1357,
          "tagName": "Romansa",
          "tagEnName": "Romance"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "AI+人工"
      ],
      "protagonist": "Dominic Castellano,  Lily Watson",
      "dataFrom": "大数据",
      "cardType": 1,
      "rankVo": {
        "rankType": 1,
        "hotCode": "201K",
        "sort": 2
      },
      "markNamesConnectKey": ", ",
      "bookShelfTime": 1787886164000,
      "shelfTime": "2026-08-28 11:02:44",
      "inLibrary": false
    },
    {
      "bookId": "42000025364",
      "bookName": "Hati Yang Dihancurkan",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000025364/42000025364.jpg?t=1787812020855",
      "chapterCount": 52,
      "introduction": "Mia rela mengorbankan segalanya bahkan pergi diam-diam dalam kondisi hamil demi menyelamatkan kekasihnya, Vance. Vance adalah pewaris teragung Kota Awan, dan bertahun-tahun kemudian, takdir tragis anak mereka mempertemukan mereka kembali. Namun, fitnah keji membuat Vance membenci Mia hingga memicu kematian putra mereka. Mia hancur dalam duka, sementara Vance harus menanggung seumur hidup beban penyesalan setelah kebenaran terungkap.",
      "tags": [
        "Pembalikan Identitas",
        "Balas Dendam",
        "CEO",
        "Kembali Bangkit",
        "Keluarga",
        "Kesempatan Kedua"
      ],
      "tagV3s": [
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1394,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1362,
          "tagName": "CEO",
          "tagEnName": "Billionaire"
        },
        {
          "tagId": 10000,
          "tagName": "Kembali Bangkit",
          "tagEnName": "Comeback Story"
        },
        {
          "tagId": 1408,
          "tagName": "Keluarga",
          "tagEnName": "Family Bonds"
        },
        {
          "tagId": 1392,
          "tagName": "Kesempatan Kedua",
          "tagEnName": "Second Chance"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "AI+人工"
      ],
      "protagonist": "Vance Sterling,  Mia Deckard",
      "dataFrom": "大数据",
      "cardType": 1,
      "rankVo": {
        "rankType": 1,
        "hotCode": "146K",
        "sort": 3
      },
      "markNamesConnectKey": ", ",
      "bookShelfTime": 1787328001000,
      "shelfTime": "2026-08-22 00:00:01",
      "inLibrary": false
    },
    {
      "bookId": "42000026601",
      "bookName": "Takhta Di Balik Penyamaran",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000026601/42000026601.jpg?t=1788340567205",
      "chapterCount": 41,
      "introduction": "Setelah tujuh tahun bersembunyi, Ratu Naga Veya kembali menyamar sebagai tabib sederhana, tapi justru dikhianati dan dihina oleh pria yang dulu dicintainya. Saat dia menikah kontrak dengan Adipati Kael Frostwing yang berkuasa, musuh-musuhnya mengira dia rakyat jelata tak berdaya, hingga Veya membuka identitas aslinya dan merebut kembali takhtanya.",
      "tags": [
        "Wanita Kuat",
        "Fantasi",
        "Romansa",
        "Balas Dendam",
        "Pembalikan Identitas",
        "Serangan Balik"
      ],
      "tagV3s": [
        {
          "tagId": 1361,
          "tagName": "Wanita Kuat",
          "tagEnName": "Strong Heroine"
        },
        {
          "tagId": 1355,
          "tagName": "Fantasi",
          "tagEnName": "Fantasy"
        },
        {
          "tagId": 1357,
          "tagName": "Romansa",
          "tagEnName": "Romance"
        },
        {
          "tagId": 1394,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1399,
          "tagName": "Serangan Balik",
          "tagEnName": "Counterattack"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "AI+人工"
      ],
      "protagonist": "Veya Dragonmere,  Kael Frostwing",
      "dataFrom": "大数据",
      "cardType": 1,
      "rankVo": {
        "rankType": 1,
        "hotCode": "117K",
        "sort": 4
      },
      "markNamesConnectKey": ", ",
      "bookShelfTime": 1788537600000,
      "shelfTime": "2026-09-05 00:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000027287",
      "bookName": "Tidur dengan Ayah Sahabatku",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000027287/42000027287.jpg?t=1789007153466",
      "chapterCount": 51,
      "introduction": "Setelah memergoki tunangannya selingkuh, Mia mabuk dan tidur dengan Damien, triliuner misterius. Keesokan harinya, dia baru tahu Damien adalah ayah sang pengantin wanita. Terpaksa menyembunyikan hubungan terlarang mereka, Mia harus menghadapi mantan yang cemburu dan sabotase yang mengancam pernikahan.",
      "tags": [
        "Cinta Terlarang",
        "Gairah",
        "Romansa",
        "Pembalikan Identitas",
        "Perselingkuhan",
        "CEO"
      ],
      "tagV3s": [
        {
          "tagId": 1379,
          "tagName": "Cinta Terlarang",
          "tagEnName": "Forbidden Love"
        },
        {
          "tagId": 10047,
          "tagName": "Gairah",
          "tagEnName": "Steamy"
        },
        {
          "tagId": 1357,
          "tagName": "Romansa",
          "tagEnName": "Romance"
        },
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1400,
          "tagName": "Perselingkuhan",
          "tagEnName": "Betrayal"
        },
        {
          "tagId": 1362,
          "tagName": "CEO",
          "tagEnName": "Billionaire"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "AI+人工"
      ],
      "protagonist": "Damien,  Mia",
      "dataFrom": "大数据",
      "cardType": 1,
      "rankVo": {
        "rankType": 1,
        "hotCode": "109K",
        "sort": 5
      },
      "markNamesConnectKey": ", ",
      "bookShelfTime": 1789092001000,
      "shelfTime": "2026-09-11 10:00:01",
      "inLibrary": false
    },
    {
      "bookId": "42000022436",
      "bookName": "Tolak Aku, Raja Naga",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000022436/42000022436.jpg?t=1785209042338",
      "chapterCount": 50,
      "introduction": "Lyra, seorang manusia, tak sengaja bertemu Raja Naga, Kael dan menghabiskan malam penuh gairah bersamanya. Terjebak ramalan palsu, Kael mengusirnya—tanpa tahu Lyra tengah mengandung Amber, putri separuh naga mereka. Waktu berlalu, Lyra kembali demi mencari tabib untuk menyelamatkan putrinya yang sakit. Asmara lama kembali mekar, intrik rival yang cemburu mengintai, dan rahasia garis keturunan pun terkuak saat mereka berjuang demi keluarga dan cinta mereka yang retak.",
      "tags": [
        "Kabur Saat Hamil",
        "Romansa",
        "Mengejar Istri",
        "Ibu Tunggal",
        "Kesempatan Kedua",
        "Fantasi"
      ],
      "tagV3s": [
        {
          "tagId": 1397,
          "tagName": "Kabur Saat Hamil",
          "tagEnName": "Secret Baby"
        },
        {
          "tagId": 1357,
          "tagName": "Romansa",
          "tagEnName": "Romance"
        },
        {
          "tagId": 1401,
          "tagName": "Mengejar Istri",
          "tagEnName": "Winning Her Back"
        },
        {
          "tagId": 1377,
          "tagName": "Ibu Tunggal",
          "tagEnName": "Single Mom"
        },
        {
          "tagId": 1392,
          "tagName": "Kesempatan Kedua",
          "tagEnName": "Second Chance"
        },
        {
          "tagId": 1355,
          "tagName": "Fantasi",
          "tagEnName": "Fantasy"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "AI+人工"
      ],
      "protagonist": "Lyra Voss,  Kael Draeven",
      "dataFrom": "大数据",
      "cardType": 1,
      "rankVo": {
        "rankType": 1,
        "hotCode": "72.1K",
        "sort": 6
      },
      "markNamesConnectKey": ", ",
      "bookShelfTime": 1785217440000,
      "shelfTime": "2026-07-28 13:44:00",
      "inLibrary": false
    },
    {
      "bookId": "42000024940",
      "bookName": "Penyesalan Terakhir Sang Pangeran",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000024940/42000024940.jpg?t=1786963500748",
      "chapterCount": 51,
      "introduction": "Setelah pesta topeng, Pangeran Kit salah mengenali saudari tiri Ella sebagai dirinya, lalu menyamar jadi pengawal di keluarga Ella sambil mengabaikan dan menyakitinya. Ella yang patah hati memilih menikahi Pangeran Buas terkutuk. Usai mengorbankan sisa usianya demi kebenaran, Kit meminta Ella pergi dengannya di hari pernikahan demi menebus dosa di tujuh hari terakhir hidupnya. Pada akhirnya, Kit dimaafkan dan selamat, sementara Ella kembali ke Pangeran Buas yang dicintainya.",
      "tags": [
        "Salah Identitas",
        "Penyesalan",
        "Romansa",
        "Penebusan",
        "Bangsawan",
        "Cinta Segitiga"
      ],
      "tagV3s": [
        {
          "tagId": 1403,
          "tagName": "Salah Identitas",
          "tagEnName": "Mistaken Identity"
        },
        {
          "tagId": 1654,
          "tagName": "Penyesalan",
          "tagEnName": "All-Too-Late"
        },
        {
          "tagId": 1357,
          "tagName": "Romansa",
          "tagEnName": "Romance"
        },
        {
          "tagId": 1459,
          "tagName": "Penebusan",
          "tagEnName": "Redemption"
        },
        {
          "tagId": 1367,
          "tagName": "Bangsawan",
          "tagEnName": "Royalty"
        },
        {
          "tagId": 1380,
          "tagName": "Cinta Segitiga",
          "tagEnName": "Love Triangle"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "AI+人工"
      ],
      "protagonist": "Cinderella,  Ella Tremaine",
      "dataFrom": "大数据",
      "cardType": 1,
      "rankVo": {
        "rankType": 1,
        "hotCode": "68.5K",
        "sort": 7
      },
      "markNamesConnectKey": ", ",
      "bookShelfTime": 1787500800000,
      "shelfTime": "2026-08-24 00:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000028298",
      "bookName": "Kembali Sebagai Bosmu",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000028298/42000028298.jpg?t=1789710173835",
      "chapterCount": 51,
      "introduction": "Demi cinta, Linda rela melepaskan kekayaannya dan hidup sederhana bersama Nick. Namun satu telepon di tengah malam menghancurkannya: suami dan putrinya diculik. Demi menyelamatkan mereka, Linda harus bayar uang tebusan, dan bertukar posisi dengan Claire, cinta pertama Nick. Tiga tahun penuh siksaan ia lalui di lab narkoba. Kini ia pulang, bukan lagi sebagai istri yang lemah, tapi sebagai CEO Grup Hastings, siap membalaskan dendam ke setiap orang yang mengkhianatinya.",
      "tags": [
        "Perselingkuhan",
        "Penyesalan",
        "Pembalikan Identitas",
        "Balas Dendam",
        "Wanita Mandiri",
        "Modern"
      ],
      "tagV3s": [
        {
          "tagId": 1400,
          "tagName": "Perselingkuhan",
          "tagEnName": "Betrayal"
        },
        {
          "tagId": 1654,
          "tagName": "Penyesalan",
          "tagEnName": "All-Too-Late"
        },
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1394,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1452,
          "tagName": "Wanita Mandiri",
          "tagEnName": "Independent Woman"
        },
        {
          "tagId": 1352,
          "tagName": "Modern",
          "tagEnName": "Modern"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "AI+人工",
        "字幕剧"
      ],
      "protagonist": " Linda Hastings,  Julian Thorne",
      "dataFrom": "大数据",
      "cardType": 1,
      "rankVo": {
        "rankType": 1,
        "hotCode": "68.4K",
        "sort": 8
      },
      "markNamesConnectKey": ", ",
      "bookShelfTime": 1789712736000,
      "shelfTime": "2026-09-18 14:25:36",
      "inLibrary": false
    },
    {
      "bookId": "42000021621",
      "bookName": "Aku Raja Tersembunyi  (Sulih Suara) ",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000021621/42000021621.jpg?t=1784537880931",
      "chapterCount": 63,
      "introduction": "Di penerbangan menuju Kota Akios, Kris bertemu Hannah, pewaris Andian Tekno. Kris awalnya menolak pernikahan palsu yang ditawarkan Hannah. Setelah ditinggalkan tunangannya, Kris pun mengungkapkan identitas aslinya sebagai CEO Grup Titanio. Dia memutuskan memulai lembaran baru bersama Hannah.",
      "tags": [
        "Pembalikan Identitas",
        "Serangan Balik",
        "Mengejar Istri",
        "Penyesalan",
        "Putri Kaya",
        "Cinta setelah Putus"
      ],
      "tagV3s": [
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1399,
          "tagName": "Serangan Balik",
          "tagEnName": "Counterattack"
        },
        {
          "tagId": 1401,
          "tagName": "Mengejar Istri",
          "tagEnName": "Winning Her Back"
        },
        {
          "tagId": 1654,
          "tagName": "Penyesalan",
          "tagEnName": "All-Too-Late"
        },
        {
          "tagId": 1450,
          "tagName": "Putri Kaya",
          "tagEnName": "Heiress"
        },
        {
          "tagId": 1692,
          "tagName": "Cinta setelah Putus",
          "tagEnName": "Love After Breakup"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "配音剧",
        "人工"
      ],
      "protagonist": "Kris Salim,  Hannah Andian",
      "dataFrom": "大数据",
      "cardType": 1,
      "rankVo": {
        "rankType": 1,
        "hotCode": "65.1K",
        "sort": 9
      },
      "markNamesConnectKey": ", ",
      "bookShelfTime": 1784599201000,
      "shelfTime": "2026-07-21 10:00:01",
      "inLibrary": false
    },
    {
      "bookId": "42000022245",
      "bookName": "Istri Yang Terlewatkan",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000022245/42000022245.jpg?t=1784884619830",
      "chapterCount": 77,
      "introduction": "Kirana menggantikan saudara kembarnya, Farah, yang kabur dari pernikahan, menjadi istri pengganti Raka selama tiga tahun. Raka mencintai Vania dan bersikap dingin pada Kirana. Kirana hanya ingin bertahan demi kontrak dan kebebasannya. Saat kontrak habis, Kirana pergi diam-diam. Setelah kebohongan terbongkar, Raka menyingkirkan Vania dan mencarinya, tapi Kirana sudah bersama Zhou Shili. Raka pun hidup dalam penyesalan.",
      "tags": [
        "Penyesalan",
        "Romansa Tragis",
        "Pengganti",
        "Pembalikan Identitas",
        "Mengejar Istri",
        "Wanita Mandiri"
      ],
      "tagV3s": [
        {
          "tagId": 1654,
          "tagName": "Penyesalan",
          "tagEnName": "All-Too-Late"
        },
        {
          "tagId": 1635,
          "tagName": "Romansa Tragis",
          "tagEnName": "Toxic Love"
        },
        {
          "tagId": 10034,
          "tagName": "Pengganti",
          "tagEnName": "Stand-in"
        },
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1401,
          "tagName": "Mengejar Istri",
          "tagEnName": "Winning Her Back"
        },
        {
          "tagId": 1452,
          "tagName": "Wanita Mandiri",
          "tagEnName": "Independent Woman"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "markNames": [
        "自制",
        "国内翻译",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "中国",
        "AI+人工"
      ],
      "protagonist": "Kirana Mardani,  Raka Pradipta",
      "dataFrom": "大数据",
      "cardType": 1,
      "rankVo": {
        "rankType": 1,
        "hotCode": "55.7K",
        "sort": 10
      },
      "markNamesConnectKey": ", ",
      "bookShelfTime": 1785686400000,
      "shelfTime": "2026-08-03 00:00:00",
      "inLibrary": false
    }
  ],
  "meta": {
    "rankType": 1,
    "total": 10,
    "timestamp": "2026-09-27T23:56:29.694Z"
  }
}

Dramabox Latest
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/dramabox/latest?apikey=ahmuqkey",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "data": [
    {
      "bookId": "42000029250",
      "bookName": "Jangan Usik Si Gemuk",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000029250/42000029250.jpg?t=1790212307729",
      "chapterCount": 30,
      "introduction": "Aku habiskan waktu lima tahun untuk mengubah diriku yang gemuk, menjadi model internasional yang naik daun. Debut globalku berlangsung di hotel yang sama dengan reuni para perundungku saat SMA. Penyiksaku menggali video lama untuk mempermalukanku, sementara teman lainnya bertaruh aku tidak akan muncul. Akan kubuat mereka semua menyesal!",
      "tags": [
        "Balas Dendam",
        "Pembalikan Identitas",
        "Wanita Kuat"
      ],
      "tagV3s": [
        {
          "tagId": 1394,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1361,
          "tagName": "Wanita Kuat",
          "tagEnName": "Strong Heroine"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 2,
        "name": "Terbaru",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "动态小说漫",
        "印尼语",
        "美国",
        "AI+人工",
        "超短剧",
        "字幕剧"
      ],
      "dataFrom": "算法_推荐剧",
      "cardType": 1,
      "rankVo": {
        "rankType": 3,
        "hotCode": "7.8K",
        "recCopy": "Terbaru TOP 4",
        "sort": 4
      },
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"ebb33fada881b00ac94c45df932ee72a\",\"ret_time\":\"1790553406903\",\"scene_id\":\"ovs_vd_new_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "55.8K",
      "bookShelfTime": 1790474401000,
      "shelfTime": "2026-09-27 10:00:01",
      "inLibrary": false
    },
    {
      "bookId": "42000028314",
      "bookName": "Suami Miliarder yang Dibuang",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000028314/42000028314.jpg?t=1789711547858",
      "chapterCount": 36,
      "introduction": "James menyamar sebagai suami biasa dan menghabiskan 2,3 miliar dolar untuk membeli perusahaan lingeri demi mewujudkan impian istrinya, Vivian. Namun, Vivian justru mengkhianatinya dengan terapis spa dan meremehkannya. Semua kepalsuan dan keangkuhan Vivian akhirnya runtuh di konferensi pers akbar pengambilalihan perusahaan tersebut.",
      "tags": [
        "Perselingkuhan",
        "Pembalikan Identitas",
        "Balas Dendam",
        "Serangan Balik",
        "CEO",
        "Modern"
      ],
      "tagV3s": [
        {
          "tagId": 1400,
          "tagName": "Perselingkuhan",
          "tagEnName": "Betrayal"
        },
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1394,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1399,
          "tagName": "Serangan Balik",
          "tagEnName": "Counterattack"
        },
        {
          "tagId": 1362,
          "tagName": "CEO",
          "tagEnName": "Billionaire"
        },
        {
          "tagId": 1352,
          "tagName": "Modern",
          "tagEnName": "Modern"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 2,
        "name": "Terbaru",
        "color": "#8773DF"
      },
      "markNames": [
        "引入",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "AI+人工",
        "超短剧",
        "字幕剧"
      ],
      "dataFrom": "算法_推荐剧",
      "cardType": 1,
      "rankVo": {
        "rankType": 3,
        "hotCode": "7.2K",
        "recCopy": "Terbaru TOP 5",
        "sort": 5
      },
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"ebb33fada881b00ac94c45df932ee72a\",\"ret_time\":\"1790553406903\",\"scene_id\":\"ovs_vd_new_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "59.5K",
      "bookShelfTime": 1790474401000,
      "shelfTime": "2026-09-27 10:00:01",
      "inLibrary": false
    },
    {
      "bookId": "42000028253",
      "bookName": "Kini Giliran Mereka",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000028253/42000028253.jpg?t=1789694580657",
      "chapterCount": 63,
      "introduction": "Dalam perjalanan membawa istrinya ke rumah sakit untuk melahirkan, Hugo dan Sophie dipaksa keluar jalur oleh anak-anak orang kaya. Hugo memilih menahan penghinaan demi melindungi istrinya. Namun, anak-anak itu tak sadar telah memancing kehancuran keluarga mereka sendiri.",
      "tags": [
        "Balas Dendam",
        "Serangan Balik",
        "Modern",
        "Pria Dominan",
        "Pria Tangguh",
        "Keluarga"
      ],
      "tagV3s": [
        {
          "tagId": 1337,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1340,
          "tagName": "Serangan Balik",
          "tagEnName": "Counterattack"
        },
        {
          "tagId": 1318,
          "tagName": "Modern",
          "tagEnName": "Modern"
        },
        {
          "tagId": 1323,
          "tagName": "Pria Dominan",
          "tagEnName": "Powerful Male Lead"
        },
        {
          "tagId": 1328,
          "tagName": "Pria Tangguh",
          "tagEnName": "Tough Guy"
        },
        {
          "tagId": 1348,
          "tagName": "Keluarga",
          "tagEnName": "Family Bonds"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 2,
        "name": "Terbaru",
        "color": "#8773DF"
      },
      "markNames": [
        "引入",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "AI+人工",
        "18+",
        "字幕剧"
      ],
      "dataFrom": "算法_推荐剧",
      "cardType": 1,
      "rankVo": {
        "rankType": 3,
        "hotCode": "5.8K",
        "recCopy": "Terbaru TOP 7",
        "sort": 7
      },
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"ebb33fada881b00ac94c45df932ee72a\",\"ret_time\":\"1790553406903\",\"scene_id\":\"ovs_vd_new_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "160K",
      "bookShelfTime": 1790352000000,
      "shelfTime": "2026-09-26 00:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000028311",
      "bookName": "Kesempatan Kedua Cintaku",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000028311/42000028311.jpg?t=1789711169658",
      "chapterCount": 60,
      "introduction": "Cory akhirnya mendapatkan hati Zoe tepat sebelum lulus kuliah. Saat merayakan kelulusannya, dia mabuk berat dan terbangun tujuh tahun kemudian sebagai suami Zoe. Sayangnya, pernikahan mereka telah hancur karena dirinya, sementara anak mereka mengalami trauma sampai nggak bisa bicara.",
      "tags": [
        "Perjalanan Waktu",
        "Kesempatan Kedua",
        "Keluarga",
        "Penebusan",
        "Orang Biasa",
        "Cinta Setelah Menikah"
      ],
      "tagV3s": [
        {
          "tagId": 1344,
          "tagName": "Perjalanan Waktu",
          "tagEnName": "Time Travel"
        },
        {
          "tagId": 1422,
          "tagName": "Kesempatan Kedua",
          "tagEnName": "Second Chance"
        },
        {
          "tagId": 1348,
          "tagName": "Keluarga",
          "tagEnName": "Family Bonds"
        },
        {
          "tagId": 1478,
          "tagName": "Penebusan",
          "tagEnName": "Redemption"
        },
        {
          "tagId": 1331,
          "tagName": "Orang Biasa",
          "tagEnName": "A Nobody"
        },
        {
          "tagId": 1423,
          "tagName": "Cinta Setelah Menikah",
          "tagEnName": "Love After Marriage"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 2,
        "name": "Terbaru",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "转绘AI剧",
        "印尼语",
        "美国",
        "AI+人工",
        "字幕剧"
      ],
      "dataFrom": "算法_推荐剧",
      "cardType": 1,
      "rankVo": {
        "rankType": 3,
        "hotCode": "4.1K",
        "recCopy": "Terbaru TOP 9",
        "sort": 9
      },
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"ebb33fada881b00ac94c45df932ee72a\",\"ret_time\":\"1790553406903\",\"scene_id\":\"ovs_vd_new_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "139K",
      "bookShelfTime": 1790388000000,
      "shelfTime": "2026-09-26 10:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000029345",
      "bookName": "Pegulat Tak Bernama",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000029345/42000029345.jpg?t=1790229474989",
      "chapterCount": 50,
      "introduction": "Setelah ayahnya meninggal, Kane diasuh Eve, pemilik sebuah gym tinju. Ia bekerja sebagai petugas kebersihan sambil menyembunyikan kemampuan bertarungnya. Saat gangster mengancam gym itu, Kane terpaksa menunjukkan kekuatannya. Ia kemudian mengikuti pertarungan maut melawan juara dunia dan keluar sebagai pemenang. Setelah membalaskan dendam atas kematian ayah Eve, Kane dan Eve membangun kembali gym mereka serta menemukan arti keluarga.",
      "tags": [
        "Serangan Balik",
        "Pura-Pura Bodoh",
        "Balas Dendam",
        "Bangkitnya Orang Biasa",
        "Orang Biasa",
        "Modern"
      ],
      "tagV3s": [
        {
          "tagId": 1340,
          "tagName": "Serangan Balik",
          "tagEnName": "Counterattack"
        },
        {
          "tagId": 1333,
          "tagName": "Pura-Pura Bodoh",
          "tagEnName": "Playing Dumb"
        },
        {
          "tagId": 1337,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1339,
          "tagName": "Bangkitnya Orang Biasa",
          "tagEnName": "Underdog Story"
        },
        {
          "tagId": 1331,
          "tagName": "Orang Biasa",
          "tagEnName": "A Nobody"
        },
        {
          "tagId": 1318,
          "tagName": "Modern",
          "tagEnName": "Modern"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 2,
        "name": "Terbaru",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "AI+人工",
        "字幕剧"
      ],
      "dataFrom": "算法_推荐剧",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"ebb33fada881b00ac94c45df932ee72a\",\"ret_time\":\"1790553406904\",\"scene_id\":\"ovs_vd_new_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "92.3K",
      "bookShelfTime": 1790265601000,
      "shelfTime": "2026-09-25 00:00:01",
      "inLibrary": false
    },
    {
      "bookId": "42000029344",
      "bookName": "Mobil Rahasia Sang Miliarder (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000029344/42000029344.jpg?t=1790229423934",
      "chapterCount": 40,
      "introduction": "Menyamar sebagai karyawan biasa, pendiri sekaligus miliarder Ryan Carter meminjamkan mobil Bugetti-nya kepada Bella, manajer yang arogan. Setelah Bella dan keluarganya mencuri, mencemooh, dan berusaha memecatnya, Ryan mengungkap identitasnya di ruang direksi, dan membuat mereka mempertanggungjawabkan setiap pilihan kejam mereka.",
      "tags": [
        "Pembalikan Identitas",
        "Pria Dominan",
        "Balas Dendam",
        "CEO",
        "Modern",
        "Balas Dendam"
      ],
      "tagV3s": [
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1323,
          "tagName": "Pria Dominan",
          "tagEnName": "Powerful Male Lead"
        },
        {
          "tagId": 1394,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1362,
          "tagName": "CEO",
          "tagEnName": "Billionaire"
        },
        {
          "tagId": 1352,
          "tagName": "Modern",
          "tagEnName": "Modern"
        },
        {
          "tagId": 1337,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 2,
        "name": "Terbaru",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "速推AI剧",
        "印尼语",
        "美国",
        "配音剧"
      ],
      "dataFrom": "算法_推荐剧",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"ebb33fada881b00ac94c45df932ee72a\",\"ret_time\":\"1790553406904\",\"scene_id\":\"ovs_vd_new_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "37.6K",
      "bookShelfTime": 1790308800000,
      "shelfTime": "2026-09-25 12:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000029045",
      "bookName": "Pengkhianatan Cinta Sang Vampir (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000029045/42000029045.jpg?t=1790070157060",
      "chapterCount": 54,
      "introduction": "Alya menyerahkan hatinya pada Arta, tapi hanya dijadikan pion demi merebut hati saudari tirinya yang kejam. Hancur oleh pengkhianatan, sang Penjaga berbakat itu memilih pergi—dan menemukan cinta tulus seorang Vampir Kuno yang menantinya dua abad. Kini berkuasa di sisi pria jauh lebih hebat, Alya menghancurkan para musuhnya. Arta berlutut memohon kesempatan kedua, namun terlambat. Ia tenggelam dalam penyesalan, sementara Alya memilih cinta sejatinya.",
      "tags": [
        "Penyesalan",
        "Cinta Segitiga",
        "Balas Dendam",
        "Perselingkuhan",
        "Vampir",
        "Takdir Cinta"
      ],
      "tagV3s": [
        {
          "tagId": 1654,
          "tagName": "Penyesalan",
          "tagEnName": "All-Too-Late"
        },
        {
          "tagId": 1380,
          "tagName": "Cinta Segitiga",
          "tagEnName": "Love Triangle"
        },
        {
          "tagId": 1394,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1400,
          "tagName": "Perselingkuhan",
          "tagEnName": "Betrayal"
        },
        {
          "tagId": 1365,
          "tagName": "Vampir",
          "tagEnName": "Vampire"
        },
        {
          "tagId": 1382,
          "tagName": "Takdir Cinta",
          "tagEnName": "Destined Love"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 2,
        "name": "Terbaru",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "AI+人工",
        "配音剧"
      ],
      "dataFrom": "算法_推荐剧",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"ebb33fada881b00ac94c45df932ee72a\",\"ret_time\":\"1790553406904\",\"scene_id\":\"ovs_vd_new_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "34.6K",
      "bookShelfTime": 1790301600000,
      "shelfTime": "2026-09-25 10:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000029339",
      "bookName": "Rahasia Bayi Kembar Sang CEO (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000029339/42000029339.jpg?t=1790229296780",
      "chapterCount": 45,
      "introduction": "Di malam pernikahan, Ella dijebak suaminya, Arthur, yang minta cerai hingga tertidur dengan pria asing. Ella melahirkan bayi kembar, tetapi salah satunya dibuang Arthur di bangku RS. Pria asing itu, Fisher—seorang miliarder—menemukan dan membesarkannya. Bertahun-tahun kemudian, Ella menjadi terapis fisik di kediaman Fisher demi mencari putranya. Saat kebenaran terungkap, Ella menemukan anaknya, menyembuhkan mereka, dan keluarga beranggotakan empat orang ini akhirnya bersatu.",
      "tags": [
        "Pembalikan Identitas",
        "Kabur Saat Hamil",
        "Keluarga",
        "CEO",
        "Wanita Karier",
        "Cinta Rahasia"
      ],
      "tagV3s": [
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1397,
          "tagName": "Kabur Saat Hamil",
          "tagEnName": "Secret Baby"
        },
        {
          "tagId": 1408,
          "tagName": "Keluarga",
          "tagEnName": "Family Bonds"
        },
        {
          "tagId": 1362,
          "tagName": "CEO",
          "tagEnName": "Billionaire"
        },
        {
          "tagId": 1375,
          "tagName": "Wanita Karier",
          "tagEnName": "Career Woman"
        },
        {
          "tagId": 1386,
          "tagName": "Cinta Rahasia",
          "tagEnName": "Secret Crush"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 2,
        "name": "Terbaru",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "配音剧"
      ],
      "dataFrom": "算法_推荐剧",
      "cardType": 1,
      "rankVo": {
        "rankType": 3,
        "hotCode": "3.6K",
        "recCopy": "Terbaru TOP 10",
        "sort": 10
      },
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"ebb33fada881b00ac94c45df932ee72a\",\"ret_time\":\"1790553406904\",\"scene_id\":\"ovs_vd_new_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "46.4K",
      "bookShelfTime": 1790308800000,
      "shelfTime": "2026-09-25 12:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000028256",
      "bookName": "Mobil Rahasia Sang Miliarder",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000028256/42000028256.jpg?t=1789695037090",
      "chapterCount": 40,
      "introduction": "Menyamar sebagai karyawan biasa, pendiri sekaligus miliarder Ryan Carter meminjamkan mobil Bugetti-nya kepada Bella, manajer yang arogan. Setelah Bella dan keluarganya mencuri, mencemooh, dan berusaha memecatnya, Ryan mengungkap identitasnya di ruang direksi, dan membuat mereka mempertanggungjawabkan setiap pilihan kejam mereka.",
      "tags": [
        "Balas Dendam",
        "Pembalikan Identitas",
        "CEO",
        "Modern",
        "Pria Dominan",
        "Serangan Balik"
      ],
      "tagV3s": [
        {
          "tagId": 1337,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1338,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1324,
          "tagName": "CEO",
          "tagEnName": "Billionaire"
        },
        {
          "tagId": 1318,
          "tagName": "Modern",
          "tagEnName": "Modern"
        },
        {
          "tagId": 1323,
          "tagName": "Pria Dominan",
          "tagEnName": "Powerful Male Lead"
        },
        {
          "tagId": 1340,
          "tagName": "Serangan Balik",
          "tagEnName": "Counterattack"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 2,
        "name": "Terbaru",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "速推AI剧",
        "印尼语",
        "美国",
        "AI+人工",
        "字幕剧"
      ],
      "dataFrom": "算法_推荐剧",
      "cardType": 1,
      "rankVo": {
        "rankType": 3,
        "hotCode": "13.3K",
        "recCopy": "Terbaru TOP 3",
        "sort": 3
      },
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"ebb33fada881b00ac94c45df932ee72a\",\"ret_time\":\"1790553406904\",\"scene_id\":\"ovs_vd_new_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "302K",
      "bookShelfTime": 1790179200000,
      "shelfTime": "2026-09-24 00:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000029118",
      "bookName": "Dua Alpha Untukku (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000029118/42000029118.jpg?t=1790141764049",
      "chapterCount": 55,
      "introduction": "Setelah mimpi misterius menunjukkan dua pria sebagai pasangan takdirnya, Putri Liora menyamar sebagai gadis tanpa serigala di Akademi Iwara demi mencari cinta sejatinya dan menghindari perjodohan. Namun, dia justru menarik perhatian dua Alpha terkuat, Mario dan Evan. Liora pun menyadari bahwa menemukan cinta sejatinya ternyata lebih rumit.",
      "tags": [
        "Pembalikan Identitas",
        "Manusia Serigala",
        "Kekuatan Khusus",
        "Cinta Terlarang",
        "Cinta Segitiga",
        "Takdir Cinta"
      ],
      "tagV3s": [
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1363,
          "tagName": "Manusia Serigala",
          "tagEnName": "Werewolf"
        },
        {
          "tagId": 1371,
          "tagName": "Kekuatan Khusus",
          "tagEnName": "The Chosen One"
        },
        {
          "tagId": 1379,
          "tagName": "Cinta Terlarang",
          "tagEnName": "Forbidden Love"
        },
        {
          "tagId": 1380,
          "tagName": "Cinta Segitiga",
          "tagEnName": "Love Triangle"
        },
        {
          "tagId": 1382,
          "tagName": "Takdir Cinta",
          "tagEnName": "Destined Love"
        }
      ],
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 2,
        "name": "Terbaru",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "人工",
        "配音剧"
      ],
      "dataFrom": "算法_推荐剧",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"ebb33fada881b00ac94c45df932ee72a\",\"ret_time\":\"1790553406904\",\"scene_id\":\"ovs_vd_new_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "45.2K",
      "bookShelfTime": 1790145149000,
      "shelfTime": "2026-09-23 14:32:29",
      "inLibrary": false
    }
  ],
  "meta": {
    "pageNo": 1,
    "timestamp": "2026-09-27T23:56:46.996Z"
  }
}

Dramabox Dubbed

const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/dramabox/dubbed?apikey=ahmuqkey",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "data": [
    {
      "bookId": "42000028264",
      "bookName": "Pewaris Jiwa Sang Alpha (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000028264/42000028264.jpg?t=1789697707738",
      "chapterCount": 30,
      "introduction": "Mia Blackridge, putri bungsu Alpha Blackridge Pack, dianggap anak bodoh dan tak berguna karena tak mampu berubah menjadi serigala. Namun diam-diam, ia adalah reinkarnasi Alpha yang pernah memimpin selama 70 tahun. Saat Beta Grady memalsukan titah kerajaan untuk membunuh ayah Mia dan memusnahkan pack, Mia membongkar segel palsu itu dan menggunakan kebijaksanaannya untuk mengalahkan musuh serta menyelamatkan seluruh pack.",
      "tags": [
        "Pembalikan Identitas",
        "Serangan Balik",
        "Manusia Serigala",
        "Kekuatan Khusus",
        "Wanita Kuat"
      ],
      "tagV3s": [
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1399,
          "tagName": "Serangan Balik",
          "tagEnName": "Counterattack"
        },
        {
          "tagId": 1363,
          "tagName": "Manusia Serigala",
          "tagEnName": "Werewolf"
        },
        {
          "tagId": 1371,
          "tagName": "Kekuatan Khusus",
          "tagEnName": "The Chosen One"
        },
        {
          "tagId": 1361,
          "tagName": "Wanita Kuat",
          "tagEnName": "Strong Heroine"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 6,
        "name": "Terpopuler",
        "color": "#F54E96"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "动态小说漫",
        "印尼语",
        "美国",
        "AI+人工",
        "超短剧",
        "配音剧"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432598\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "306K",
      "bookShelfTime": 1789702185000,
      "shelfTime": "2026-09-18 11:29:45",
      "inLibrary": false
    },
    {
      "bookId": "42000026859",
      "bookName": "Penyesalan Terakhir Sang Pangeran (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000026859/42000026859.jpg?t=1788503414603",
      "chapterCount": 51,
      "introduction": "Setelah pesta topeng, Pangeran Kit salah mengenali saudari tiri Ella sebagai dirinya, lalu menyamar jadi pengawal di keluarga Ella sambil mengabaikan dan menyakitinya. Ella yang patah hati memilih menikahi Pangeran Buas terkutuk. Usai mengorbankan sisa usianya demi kebenaran, Kit meminta Ella pergi dengannya di hari pernikahan demi menebus dosa di tujuh hari terakhir hidupnya. Pada akhirnya, Kit dimaafkan dan selamat, sementara Ella kembali ke Pangeran Buas yang dicintainya.",
      "tags": [
        "Salah Identitas",
        "Penyesalan",
        "Romansa",
        "Perselingkuhan",
        "Mengejar Istri",
        "Penebusan"
      ],
      "tagV3s": [
        {
          "tagId": 1403,
          "tagName": "Salah Identitas",
          "tagEnName": "Mistaken Identity"
        },
        {
          "tagId": 1654,
          "tagName": "Penyesalan",
          "tagEnName": "All-Too-Late"
        },
        {
          "tagId": 1357,
          "tagName": "Romansa",
          "tagEnName": "Romance"
        },
        {
          "tagId": 1400,
          "tagName": "Perselingkuhan",
          "tagEnName": "Betrayal"
        },
        {
          "tagId": 1401,
          "tagName": "Mengejar Istri",
          "tagEnName": "Winning Her Back"
        },
        {
          "tagId": 1459,
          "tagName": "Penebusan",
          "tagEnName": "Redemption"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 3,
        "name": "Sulih Suara",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "配音剧",
        "人工"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432598\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "1.1M",
      "bookShelfTime": 1788506665000,
      "shelfTime": "2026-09-04 15:24:25",
      "inLibrary": false
    },
    {
      "bookId": "42000028086",
      "bookName": "Anjing Lemahku Ternyata Singa Legendaris (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000028086/42000028086.jpg?t=1789607956891",
      "chapterCount": 50,
      "introduction": "Dikhianati kekasihnya, Corrin, dan sahabatnya, Ophelia, Amber dicabut garis keturunannya lalu dibunuh secara keji. Terlahir kembali di hari pemilihan binatang ikatan, ia menolak Corrin yang kuat dan memilih Aerion—anjing putih lemah yang dulu mencoba menyelamatkannya, yang kelak membangkitkan wujud aslinya sebagai Singa Langit legendaris. Saat Amber mulai membalas dendam pada para pengkhianat, konspirasi yang lebih gelap terkuak, mengungkap dalang di balik segalanya.",
      "tags": [
        "Balas Dendam",
        "Pembalikan Identitas",
        "Terlahir Kembali",
        "Kekuatan Khusus",
        "Pemberontak",
        "Fantasi"
      ],
      "tagV3s": [
        {
          "tagId": 1394,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1405,
          "tagName": "Terlahir Kembali",
          "tagEnName": "Rebirth"
        },
        {
          "tagId": 1371,
          "tagName": "Kekuatan Khusus",
          "tagEnName": "The Chosen One"
        },
        {
          "tagId": 1372,
          "tagName": "Pemberontak",
          "tagEnName": "Rebellious"
        },
        {
          "tagId": 1355,
          "tagName": "Fantasi",
          "tagEnName": "Fantasy"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 3,
        "name": "Sulih Suara",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "人工",
        "配音剧"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432598\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "169K",
      "bookShelfTime": 1789609426000,
      "shelfTime": "2026-09-17 09:43:46",
      "inLibrary": false
    },
    {
      "bookId": "42000021621",
      "bookName": "Aku Raja Tersembunyi  (Sulih Suara) ",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000021621/42000021621.jpg?t=1784537880931",
      "chapterCount": 63,
      "introduction": "Di penerbangan menuju Kota Akios, Kris bertemu Hannah, pewaris Andian Tekno. Kris awalnya menolak pernikahan palsu yang ditawarkan Hannah. Setelah ditinggalkan tunangannya, Kris pun mengungkapkan identitas aslinya sebagai CEO Grup Titanio. Dia memutuskan memulai lembaran baru bersama Hannah.",
      "tags": [
        "Pembalikan Identitas",
        "Serangan Balik",
        "Mengejar Istri",
        "Penyesalan",
        "Putri Kaya",
        "Cinta setelah Putus"
      ],
      "tagV3s": [
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1399,
          "tagName": "Serangan Balik",
          "tagEnName": "Counterattack"
        },
        {
          "tagId": 1401,
          "tagName": "Mengejar Istri",
          "tagEnName": "Winning Her Back"
        },
        {
          "tagId": 1654,
          "tagName": "Penyesalan",
          "tagEnName": "All-Too-Late"
        },
        {
          "tagId": 1450,
          "tagName": "Putri Kaya",
          "tagEnName": "Heiress"
        },
        {
          "tagId": 1692,
          "tagName": "Cinta setelah Putus",
          "tagEnName": "Love After Breakup"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 6,
        "name": "Terpopuler",
        "color": "#F54E96"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "配音剧",
        "人工"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432598\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "13.2M",
      "bookShelfTime": 1784599201000,
      "shelfTime": "2026-07-21 10:00:01",
      "inLibrary": false
    },
    {
      "bookId": "42000028273",
      "bookName": "Tidur dengan Ayah Sahabatku (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000028273/42000028273.jpg?t=1789699695605",
      "chapterCount": 51,
      "introduction": "Setelah memergoki tunangannya selingkuh, Mia mabuk dan tidur dengan Damien, triliuner misterius. Keesokan harinya, dia baru tahu Damien adalah ayah sang pengantin wanita. Terpaksa menyembunyikan hubungan terlarang mereka, Mia harus menghadapi mantan yang cemburu dan sabotase yang mengancam pernikahan.",
      "tags": [
        "Pembalikan Identitas",
        "Perselingkuhan",
        "Gairah",
        "CEO",
        "Pelajar",
        "Cinta Terlarang"
      ],
      "tagV3s": [
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1400,
          "tagName": "Perselingkuhan",
          "tagEnName": "Betrayal"
        },
        {
          "tagId": 10047,
          "tagName": "Gairah",
          "tagEnName": "Steamy"
        },
        {
          "tagId": 1362,
          "tagName": "CEO",
          "tagEnName": "Billionaire"
        },
        {
          "tagId": 1443,
          "tagName": "Pelajar",
          "tagEnName": "Student"
        },
        {
          "tagId": 1379,
          "tagName": "Cinta Terlarang",
          "tagEnName": "Forbidden Love"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 3,
        "name": "Sulih Suara",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "人工",
        "配音剧"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432599\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "957K",
      "bookShelfTime": 1789711100000,
      "shelfTime": "2026-09-18 13:58:20",
      "inLibrary": false
    },
    {
      "bookId": "42000027278",
      "bookName": "Hati Yang Dihancurkan (Sulih Suara) ",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000027278/42000027278.jpg?t=1788951854191",
      "chapterCount": 52,
      "introduction": "Mia rela mengorbankan segalanya bahkan pergi diam-diam dalam kondisi hamil demi menyelamatkan kekasihnya, Vance. Vance adalah pewaris teragung Kota Awan, dan bertahun-tahun kemudian, takdir tragis anak mereka mempertemukan mereka kembali. Namun, fitnah keji membuat Vance membenci Mia hingga memicu kematian putra mereka. Mia hancur dalam duka, sementara Vance harus menanggung seumur hidup beban penyesalan setelah kebenaran terungkap.",
      "tags": [
        "Balas Dendam",
        "Pembalikan Identitas",
        "Kabur Saat Hamil",
        "Keluarga",
        "Penyesalan",
        "Kembali Bangkit"
      ],
      "tagV3s": [
        {
          "tagId": 1394,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1397,
          "tagName": "Kabur Saat Hamil",
          "tagEnName": "Secret Baby"
        },
        {
          "tagId": 1408,
          "tagName": "Keluarga",
          "tagEnName": "Family Bonds"
        },
        {
          "tagId": 1654,
          "tagName": "Penyesalan",
          "tagEnName": "All-Too-Late"
        },
        {
          "tagId": 10000,
          "tagName": "Kembali Bangkit",
          "tagEnName": "Comeback Story"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 3,
        "name": "Sulih Suara",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "配音剧",
        "人工"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432599\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "651K",
      "bookShelfTime": 1789121677000,
      "shelfTime": "2026-09-11 18:14:37",
      "inLibrary": false
    },
    {
      "bookId": "42000027890",
      "bookName": "Racun Cinta Sang Mafia (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000027890/42000027890.jpg?t=1789458905315",
      "chapterCount": 56,
      "introduction": "Di hari pernikahan saudari tirinya, Victoria, Lily Watson—perawat berusia 25 tahun—dipaksa membuat kesepakatan mematikan. Victoria seharusnya menikah dengan Dominic Castellano, raja mafia kejam yang dikabarkan membunuh istri pertamanya. Namun saat Victoria kabur, anak buah Dominic mengancam keluarga Lily. Demi melindungi mereka, Lily menggantikan Victoria di altar dan menjadi pengantin pria yang ia takutkan sebagai pembunuh.",
      "tags": [
        "Cinta Setelah Menikah",
        "Pengantin Kabur",
        "Mafia",
        "Cinta Paksaan",
        "Modern",
        "Romansa"
      ],
      "tagV3s": [
        {
          "tagId": 1393,
          "tagName": "Cinta Setelah Menikah",
          "tagEnName": "Love After Marriage"
        },
        {
          "tagId": 1396,
          "tagName": "Pengantin Kabur",
          "tagEnName": "Runaway Bride"
        },
        {
          "tagId": 1364,
          "tagName": "Mafia",
          "tagEnName": "Mafia"
        },
        {
          "tagId": 1378,
          "tagName": "Cinta Paksaan",
          "tagEnName": "Forced Love"
        },
        {
          "tagId": 1352,
          "tagName": "Modern",
          "tagEnName": "Modern"
        },
        {
          "tagId": 1357,
          "tagName": "Romansa",
          "tagEnName": "Romance"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 3,
        "name": "Sulih Suara",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "人工",
        "配音剧"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432599\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "540K",
      "bookShelfTime": 1789527601000,
      "shelfTime": "2026-09-16 11:00:01",
      "inLibrary": false
    },
    {
      "bookId": "41000122939",
      "bookName": "Istriku Tiga, Takdirku Gila (Sulih Suara) ",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000122939/41000122939.jpg?t=1765787838538",
      "chapterCount": 74,
      "introduction": "Arsa melakukan perjalanan waktu ke Dinasti Kina kuno. Kebetulan, pemerintah saat itu sedang memaksa para pemuda lajang untuk menikah. Di antara para calon istri itu, ada seorang putri kerajaan, putri dari keluarga jenderal, dan putri dari keluarga kaya. Saat Arsa masih bingung memilih, sebuah sistem tiba-tiba muncul dan memaksanya untuk menikahi ketiga wanita itu. Dia hanya bisa mendapatkan berbagai hadiah menarik dengan meningkatkan tingkat kasih sayang dari mereka...",
      "tags": [
        "Perjalanan Waktu",
        "Sistem",
        "Kekuatan Khusus",
        "Sejarah",
        "Bangsawan",
        "Pria Dominan"
      ],
      "tagV3s": [
        {
          "tagId": 1344,
          "tagName": "Perjalanan Waktu",
          "tagEnName": "Time Travel"
        },
        {
          "tagId": 1346,
          "tagName": "Sistem",
          "tagEnName": "Gamified World"
        },
        {
          "tagId": 1334,
          "tagName": "Kekuatan Khusus",
          "tagEnName": "The Chosen One"
        },
        {
          "tagId": 1319,
          "tagName": "Sejarah",
          "tagEnName": "Historical"
        },
        {
          "tagId": 1327,
          "tagName": "Bangsawan",
          "tagEnName": "Royalty"
        },
        {
          "tagId": 1323,
          "tagName": "Pria Dominan",
          "tagEnName": "Powerful Male Lead"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 3,
        "name": "Sulih Suara",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "国内翻译",
        "真人剧",
        "印尼语",
        "中国",
        "配音剧"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432599\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "174M",
      "bookShelfTime": 1761537600000,
      "shelfTime": "2025-10-27 12:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000021625",
      "bookName": "Raja Mecha Terakhir (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000021625/42000021625.jpg?t=1784538149920",
      "chapterCount": 58,
      "introduction": "Hancur karena kematian orang tuanya, Coki Tanu, sang Raja Mech, menyamar sebagai petugas kebersihan setelah diselamatkan oleh Freya. Namun saat Freya, wanita yang diam-diam dicintainya, dikhianati dan dipaksa mengikuti duel mech mematikan, Colt harus mengungkap identitas aslinya. Dengan membuka Neural Sync legendaris 100%, dia mengendalikan Tempest untuk menghancurkan musuh-musuhnya dan menyelamatkan dunia dari kawanan alien yang mengancam kepunahan.",
      "tags": [
        "Balas Dendam",
        "Pembalikan Identitas",
        "Serangan Balik",
        "Zaman Akhir",
        "Penebusan",
        "Kembali Bangkit"
      ],
      "tagV3s": [
        {
          "tagId": 1337,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1338,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1340,
          "tagName": "Serangan Balik",
          "tagEnName": "Counterattack"
        },
        {
          "tagId": 1347,
          "tagName": "Zaman Akhir",
          "tagEnName": "Apocalypse"
        },
        {
          "tagId": 1478,
          "tagName": "Penebusan",
          "tagEnName": "Redemption"
        },
        {
          "tagId": 10001,
          "tagName": "Kembali Bangkit",
          "tagEnName": "Comeback Story"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 6,
        "name": "Terpopuler",
        "color": "#F54E96"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "配音剧",
        "人工"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432599\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "5.6M",
      "bookShelfTime": 1784685600000,
      "shelfTime": "2026-07-22 10:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000022778",
      "bookName": "Aku Ternyata Sang Dewa Naga! (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000022778/42000022778.jpg?t=1785377797837",
      "chapterCount": 68,
      "introduction": "Sepanjang hidupnya, Aris hanyalah pelayan paling rendahan di akademi. Dia memiliki darah terkutuk yang membuat setiap naga ketakutan setengah mati padanya. Namun, segalanya berubah total saat setetes darahnya justru menetaskan sebutir telur naga legendaris. Diburu oleh musuh-musuh kuat dan dibebani takdir yang tak pernah ia inginkan, kini Aris harus mengungkap kebenaran yang tersembunyi sebelum seluruh dunia mengetahuinya.",
      "tags": [
        "Pembalikan Identitas",
        "Bangkitnya Orang Biasa",
        "Orang Biasa",
        "Kekuatan Khusus",
        "Naga",
        "Fantasi"
      ],
      "tagV3s": [
        {
          "tagId": 1338,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1339,
          "tagName": "Bangkitnya Orang Biasa",
          "tagEnName": "Underdog Story"
        },
        {
          "tagId": 1331,
          "tagName": "Orang Biasa",
          "tagEnName": "A Nobody"
        },
        {
          "tagId": 1334,
          "tagName": "Kekuatan Khusus",
          "tagEnName": "The Chosen One"
        },
        {
          "tagId": 10080,
          "tagName": "Naga",
          "tagEnName": "Dragon"
        },
        {
          "tagId": 1321,
          "tagName": "Fantasi",
          "tagEnName": "Fantasy"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 6,
        "name": "Terpopuler",
        "color": "#F54E96"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "配音剧",
        "人工"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432599\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "10.6M",
      "bookShelfTime": 1785470400000,
      "shelfTime": "2026-07-31 12:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000023894",
      "bookName": "Tolak Aku, Raja Naga (Sulih Suara) ",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000023894/42000023894.jpg?t=1786009197962",
      "chapterCount": 50,
      "introduction": "Lyra, seorang manusia, tak sengaja bertemu Raja Naga, Kael dan menghabiskan malam penuh gairah bersamanya. Terjebak ramalan palsu, Kael mengusirnya—tanpa tahu Lyra tengah mengandung Amber, putri separuh naga mereka. Waktu berlalu, Lyra kembali demi mencari tabib untuk menyelamatkan putrinya yang sakit. Asmara lama kembali mekar, intrik rival yang cemburu mengintai, dan rahasia garis keturunan pun terkuak saat mereka berjuang demi keluarga dan cinta mereka yang retak.",
      "tags": [
        "Kabur Saat Hamil",
        "Romansa",
        "Mengejar Istri",
        "Naga",
        "Cinta Terlarang",
        "Cinta Semalam"
      ],
      "tagV3s": [
        {
          "tagId": 1397,
          "tagName": "Kabur Saat Hamil",
          "tagEnName": "Secret Baby"
        },
        {
          "tagId": 1357,
          "tagName": "Romansa",
          "tagEnName": "Romance"
        },
        {
          "tagId": 1401,
          "tagName": "Mengejar Istri",
          "tagEnName": "Winning Her Back"
        },
        {
          "tagId": 10070,
          "tagName": "Naga",
          "tagEnName": "Dragon"
        },
        {
          "tagId": 1379,
          "tagName": "Cinta Terlarang",
          "tagEnName": "Forbidden Love"
        },
        {
          "tagId": 1385,
          "tagName": "Cinta Semalam",
          "tagEnName": "One Night Stand"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 6,
        "name": "Terpopuler",
        "color": "#F54E96"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "配音剧",
        "人工"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432599\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "12M",
      "bookShelfTime": 1786068449000,
      "shelfTime": "2026-08-07 10:07:29",
      "inLibrary": false
    },
    {
      "bookId": "42000025148",
      "bookName": "Putri Terkutuk Penakluk Siluman (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000025148/42000025148.jpg?t=1787128983170",
      "chapterCount": 41,
      "introduction": "Sylvia, seorang gadis rumahan abad ke-21, masuk ke komik roman siluman sebagai putri terkutuk yang cepat tua. Ditolak semua orang, ia terpaksa memilih suami dari para siluman kalah perang. Alih-alih satu, dia malah ambil tiga yang paling lemah. Kenapa? Sistem Afinitas tersembunyi membantunya kembali ke usia muda, membuka kekuatan hebat, dan meraih hadiah langka dengan menaikkan poin afinitas mereka. Bisakah Sylvia mengubah takdir—dan merebut hati mereka sebelum terlambat?",
      "tags": [
        "Serangan Balik",
        "Sistem",
        "Pertukaran Jiwa",
        "Kekuatan Khusus",
        "Cinta Terlarang",
        "Takdir Cinta"
      ],
      "tagV3s": [
        {
          "tagId": 1399,
          "tagName": "Serangan Balik",
          "tagEnName": "Counterattack"
        },
        {
          "tagId": 1406,
          "tagName": "Sistem",
          "tagEnName": "Gamified World"
        },
        {
          "tagId": 1458,
          "tagName": "Pertukaran Jiwa",
          "tagEnName": "Transmigration"
        },
        {
          "tagId": 1371,
          "tagName": "Kekuatan Khusus",
          "tagEnName": "The Chosen One"
        },
        {
          "tagId": 1379,
          "tagName": "Cinta Terlarang",
          "tagEnName": "Forbidden Love"
        },
        {
          "tagId": 1382,
          "tagName": "Takdir Cinta",
          "tagEnName": "Destined Love"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 3,
        "name": "Sulih Suara",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "仿真人剧",
        "印尼语",
        "美国",
        "配音剧",
        "人工"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432599\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "1.2M",
      "bookShelfTime": 1787673600000,
      "shelfTime": "2026-08-26 00:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000000651",
      "bookName": "Suami untuk Tiga Tahun (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000000651/42000000651.jpg?t=1764042578579",
      "chapterCount": 65,
      "introduction": "Ezra yang sudah hidup ribuan tahun menepati janji pada muridnya yang sekarat untuk menjaga keluarganya selama tiga tahun. Selama waktu itu, dia menikahi cucu sang murid, tapi malah diperlakukan dingin dan diremehkan. Meski sering disulitkan, Ezra tetap sabar. Begitu tiga tahun berlalu, dia pergi tanpa penyesalan.",
      "tags": [
        "Penyesalan",
        "Pembalikan Identitas",
        "Penebusan",
        "Pemberontak",
        "Supranatural",
        "Pria Dominan"
      ],
      "tagV3s": [
        {
          "tagId": 1658,
          "tagName": "Penyesalan",
          "tagEnName": "All-Too-Late"
        },
        {
          "tagId": 1338,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1478,
          "tagName": "Penebusan",
          "tagEnName": "Redemption"
        },
        {
          "tagId": 1335,
          "tagName": "Pemberontak",
          "tagEnName": "Rebellious"
        },
        {
          "tagId": 1322,
          "tagName": "Supranatural",
          "tagEnName": "Supernatural"
        },
        {
          "tagId": 1323,
          "tagName": "Pria Dominan",
          "tagEnName": "Powerful Male Lead"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 6,
        "name": "Terpopuler",
        "color": "#F54E96"
      },
      "markNames": [
        "印尼语",
        "配音剧",
        "中国",
        "国内翻译",
        "引入",
        "真人剧"
      ],
      "performerIdList": [
        28599,
        28600
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432599\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "149M",
      "bookShelfTime": 1764052944000,
      "shelfTime": "2025-11-25 14:42:24",
      "inLibrary": false
    },
    {
      "bookId": "42000029344",
      "bookName": "Mobil Rahasia Sang Miliarder (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000029344/42000029344.jpg?t=1790229423934",
      "chapterCount": 40,
      "introduction": "Menyamar sebagai karyawan biasa, pendiri sekaligus miliarder Ryan Carter meminjamkan mobil Bugetti-nya kepada Bella, manajer yang arogan. Setelah Bella dan keluarganya mencuri, mencemooh, dan berusaha memecatnya, Ryan mengungkap identitasnya di ruang direksi, dan membuat mereka mempertanggungjawabkan setiap pilihan kejam mereka.",
      "tags": [
        "Pembalikan Identitas",
        "Pria Dominan",
        "Balas Dendam",
        "CEO",
        "Modern",
        "Balas Dendam"
      ],
      "tagV3s": [
        {
          "tagId": 1395,
          "tagName": "Pembalikan Identitas",
          "tagEnName": "Hidden Identity"
        },
        {
          "tagId": 1323,
          "tagName": "Pria Dominan",
          "tagEnName": "Powerful Male Lead"
        },
        {
          "tagId": 1394,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        },
        {
          "tagId": 1362,
          "tagName": "CEO",
          "tagEnName": "Billionaire"
        },
        {
          "tagId": 1352,
          "tagName": "Modern",
          "tagEnName": "Modern"
        },
        {
          "tagId": 1337,
          "tagName": "Balas Dendam",
          "tagEnName": "Revenge"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 2,
        "name": "Terbaru",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "漫剧",
        "速推AI剧",
        "印尼语",
        "美国",
        "配音剧"
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432599\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "37.6K",
      "bookShelfTime": 1790308800000,
      "shelfTime": "2026-09-25 12:00:00",
      "inLibrary": false
    },
    {
      "bookId": "42000012104",
      "bookName": "Rahasia Sang Sekretaris (Sulih Suara)",
      "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000012104/42000012104.jpg?t=1778744075348",
      "chapterCount": 60,
      "introduction": "Karyawan magang di Grup LS, Vira, menghabiskan satu malam dengan Arya, sang CEO, saat mabuk. Vira menjatuhkan resume Reni. Reni pura-pura jadi Vira untuk jadi kekasih CEO, dan Vira jadi sekretaris Arya. Arya mencurigai identitas Vira. Reni berusaha menjebak Vira, tapi ketahuan. Vira dan Arya pun akhirnya menyatakan perasaan.",
      "tags": [
        "Salah Identitas",
        "Cinta Semalam",
        "Kekuatan Khusus",
        "Cinta Pandangan Pertama",
        "Modern",
        "Romansa"
      ],
      "tagV3s": [
        {
          "tagId": 1403,
          "tagName": "Salah Identitas",
          "tagEnName": "Mistaken Identity"
        },
        {
          "tagId": 1385,
          "tagName": "Cinta Semalam",
          "tagEnName": "One Night Stand"
        },
        {
          "tagId": 1371,
          "tagName": "Kekuatan Khusus",
          "tagEnName": "The Chosen One"
        },
        {
          "tagId": 1384,
          "tagName": "Cinta Pandangan Pertama",
          "tagEnName": "Love at First Sight"
        },
        {
          "tagId": 1352,
          "tagName": "Modern",
          "tagEnName": "Modern"
        },
        {
          "tagId": 1357,
          "tagName": "Romansa",
          "tagEnName": "Romance"
        }
      ],
      "bookSource": {
        "sceneId": "ovs_vd_cat_video_rec",
        "expId": "bigdata_rec",
        "strategyId": "gghfenzu",
        "strategyName": "流量固化分组",
        "log_id": "992ce964f53bd3e1eb111743643a052b"
      },
      "isEntry": 0,
      "index": 0,
      "corner": {
        "cornerType": 3,
        "name": "Sulih Suara",
        "color": "#8773DF"
      },
      "markNames": [
        "自制",
        "海外原创",
        "真人剧",
        "印尼语",
        "韩国",
        "配音剧",
        "人工"
      ],
      "performerIdList": [
        29288
      ],
      "dataFrom": "算法_分类筛选",
      "cardType": 1,
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"992ce964f53bd3e1eb111743643a052b\",\"ret_time\":\"1790553432599\",\"scene_id\":\"ovs_vd_cat_video_rec\",\"rec_id\":\"bigdata_rec\"}",
      "playCount": "3.2M",
      "bookShelfTime": 1779249600000,
      "shelfTime": "2026-05-20 12:00:00",
      "inLibrary": false
    }
  ],
  "meta": {
    "pageNo": 1,
    "pageSize": 15,
    "hasMore": true,
    "timestamp": "2026-09-27T23:57:12.655Z"
  }
}

Dramabox VIP
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/dramabox/vip?apikey=ahmuqkey",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

respone
{
  "success": true,
  "data": [
    {
      "columnId": 502,
      "title": "Pilihan Mingguan",
      "subTitle": "",
      "style": "BIG_PIC_LATERAL",
      "bookList": [
        {
          "bookId": "41000119583",
          "bookName": "Cerita Cinta Cheerleader Cantik",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000119583/41000119583.jpg?t=1766975046618",
          "chapterCount": 57,
          "introduction": "Jane adalah maskot tim cheerleader SMA yang sering dibully temannya. Karena rumahnya hancur oleh tornado, Jane terpaksa tinggal bersama musuh bebuyutannya sejak kecil, William, yang sudah lama tak ditemuinya. Tanpa diduga, William ternyata adalah kapten tim basket sekolah yang baru, tinggi, dan tampan.",
          "tags": [
            "Musuh Jadi Kekasih",
            "Serangan Balik",
            "Sahabat Masa Kecil",
            "Modern",
            "Romansa",
            "BG"
          ],
          "tagV3s": [
            {
              "tagId": 1390,
              "tagName": "Musuh Jadi Kekasih",
              "tagEnName": "Enemy to Lover"
            },
            {
              "tagId": 1399,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1381,
              "tagName": "Sahabat Masa Kecil",
              "tagEnName": "Childhood Sweetheart"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1357,
              "tagName": "Romansa",
              "tagEnName": "Romance"
            },
            {
              "tagId": 1358,
              "tagName": "BG",
              "tagEnName": "BG"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "自制",
            "海外原创",
            "真人剧",
            "印尼语",
            "美国"
          ],
          "performerIdList": [
            12045,
            12083,
            29105
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "4.9M",
          "bookShelfTime": 1754304081000,
          "shelfTime": "2025-08-04 18:41:21",
          "inLibrary": false
        },
        {
          "bookId": "41000119254",
          "bookName": "Ciumanmu Mengubah Duniaku",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000119254/41000119254.jpg?t=1766740652241",
          "chapterCount": 53,
          "introduction": "Sakit hati karena dikhianati oleh pacar dan sahabatnya sendiri, Gabrielle, seorang model, mengacaukan pesta pertunangan mereka. Takdir mempertemukan Gabrielle dengan Kyle, seorang CEO tampan, dan keduanya jatuh cinta, yang memicu serangkai kejadian yang mengubah dunia mereka berdua. ",
          "tags": [
            "Takdir Cinta",
            "Romansa Kantor",
            "CEO",
            "Wanita Karier",
            "Modern",
            "Romansa"
          ],
          "tagV3s": [
            {
              "tagId": 1382,
              "tagName": "Takdir Cinta",
              "tagEnName": "Destined Love"
            },
            {
              "tagId": 1388,
              "tagName": "Romansa Kantor",
              "tagEnName": "Office Romance"
            },
            {
              "tagId": 1362,
              "tagName": "CEO",
              "tagEnName": "Billionaire"
            },
            {
              "tagId": 1375,
              "tagName": "Wanita Karier",
              "tagEnName": "Career Woman"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1357,
              "tagName": "Romansa",
              "tagEnName": "Romance"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "美国",
            "海外原创",
            "自制",
            "真人剧"
          ],
          "performerIdList": [
            12047,
            12203,
            12240,
            29103
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "16.5M",
          "bookShelfTime": 1753691016000,
          "shelfTime": "2025-07-28 16:23:36",
          "inLibrary": false
        },
        {
          "bookId": "41000117836",
          "bookName": "Saat Kebohongan Terungkap",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000117836/41000117836.jpg?t=1751268457078",
          "chapterCount": 88,
          "introduction": "Di kehidupan sebelumnya, Simon, anak angkat Keluarga Wijaya, menggunakan kemampuan ajaib untuk mentransmisikan suara hati dengan tujuan menjebak dan memecah belah hubungan Herman dengan semua orang. Pada akhirnya, dia sendiri bahkan mendorong Herman dari atap gedung. Begitu hidup kembali untuk kedua kalinya, Herman tidak lagi mendambakan kasih sayang dari keluarganya. Dia membalas dendam dengan begitu kejam...",
          "tags": [
            "Intrik Keluarga",
            "Terlahir Kembali",
            "Kekuatan Khusus",
            "Balas Dendam",
            "Serangan Balik",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1350,
              "tagName": "Intrik Keluarga",
              "tagEnName": "Family Intrigue"
            },
            {
              "tagId": 1345,
              "tagName": "Terlahir Kembali",
              "tagEnName": "Rebirth"
            },
            {
              "tagId": 1334,
              "tagName": "Kekuatan Khusus",
              "tagEnName": "The Chosen One"
            },
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1340,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "8.3M",
          "bookShelfTime": 1751278081000,
          "shelfTime": "2025-06-30 18:08:01",
          "inLibrary": false
        },
        {
          "bookId": "41000110499",
          "bookName": "Gadis Lugu Penakluk Raja Mafia (Sulih Suara)",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000110499/41000110499.jpg?t=1766741103833",
          "chapterCount": 61,
          "introduction": "Setelah diculik oleh raja mafia, Bella yang polos dipaksa untuk menandatangani kontrak untuk membayar biaya operasi ibunya. Namun, kontrak yang bernilai 7,5 miliar ini menuntut Bella melakukan lebih banyak daripada yang pernah dia bayangkan... Sikap sang raja mafia yang keras, perlahan-lahan mulai melunak karena Bella. Sementara itu, Bella secara bertahap menemukan jati dirinya yang sebenarnya. Namun, apakah itu cinta, ataukah hanya sindrom Stockholm?",
          "tags": [
            "Balas Dendam",
            "Pembalikan Identitas",
            "Mafia",
            "Gadis Naif",
            "Cinta Paksaan",
            "Cinta Terlarang"
          ],
          "tagV3s": [
            {
              "tagId": 1394,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1395,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1364,
              "tagName": "Mafia",
              "tagEnName": "Mafia"
            },
            {
              "tagId": 1374,
              "tagName": "Gadis Naif",
              "tagEnName": "Innocent Damsel"
            },
            {
              "tagId": 1378,
              "tagName": "Cinta Paksaan",
              "tagEnName": "Forced Love"
            },
            {
              "tagId": 1379,
              "tagName": "Cinta Terlarang",
              "tagEnName": "Forbidden Love"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "自制",
            "海外原创",
            "真人剧",
            "印尼语",
            "美国",
            "配音剧"
          ],
          "performerIdList": [
            11015,
            12191
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "22.7M",
          "bookShelfTime": 1736314759000,
          "shelfTime": "2025-01-08 13:39:19",
          "inLibrary": false
        },
        {
          "bookId": "41000118942",
          "bookName": "Cinta Beracun (Sulih Suara)",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000118942/41000118942.jpg?t=1753164238233",
          "chapterCount": 81,
          "introduction": "Dengan hati yang penuh luka, Susan menahan rasa sedihnya dengan berfoya-foya dan menggoda semua pria di kalangan orang kaya. Sampai suatu saat, dirinya bertemu dengan seorang pengawal yang sangat tampan. Susan langsung mengejar pria itu dan menggodanya selama bertahun-tahun. Sampai suatu hari, dia mendapati bahwa pengawal tampan itu ternyata hanya mendekatinya karena jatuh cinta dengan adik tirinya, yang merupakan sumber dari segala penderitaannya sejak kecil.",
          "tags": [
            "Cinta Segitiga",
            "Mengejar Istri",
            "Perselingkuhan",
            "Modern",
            "Romansa",
            "BG"
          ],
          "tagV3s": [
            {
              "tagId": 1380,
              "tagName": "Cinta Segitiga",
              "tagEnName": "Love Triangle"
            },
            {
              "tagId": 1401,
              "tagName": "Mengejar Istri",
              "tagEnName": "Winning Her Back"
            },
            {
              "tagId": 1400,
              "tagName": "Perselingkuhan",
              "tagEnName": "Betrayal"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1357,
              "tagName": "Romansa",
              "tagEnName": "Romance"
            },
            {
              "tagId": 1358,
              "tagName": "BG",
              "tagEnName": "BG"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "配音剧",
            "中国",
            "国内翻译",
            "自制",
            "真人剧"
          ],
          "performerIdList": [
            19648,
            21643
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "28.5M",
          "bookShelfTime": 1753174283000,
          "shelfTime": "2025-07-22 16:51:23",
          "inLibrary": false
        },
        {
          "bookId": "41000116351",
          "bookName": "Raja Kecurangan (Sulih Suara)",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000116351/41000116351.jpg?t=1748248275207",
          "chapterCount": 75,
          "introduction": "Setelah menyaksikan kematian ayahnya karena berjudi, Leo belajar teknik curang dan memulai jalan anti-judi. Setelah selesai belajar, dia membujuk penggemar judi, Heru, untuk bergabung. Lalu, menantang pencuri wanita, Persik, untuk bergabung dengan dunia hitam. Kemudian, merekrut penggemar judi, John. Dia pun membentuk tim delapan ahli curang. Bisakah Leo mengetahui penyebab kematian ayahnya? Lalu, bisakah dengan lancar membalas dendam dan membawa orang jahat ke pengadilan?",
          "tags": [
            "Balas Dendam",
            "Intrik Keluarga",
            "Kekuatan Khusus",
            "Modern",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1350,
              "tagName": "Intrik Keluarga",
              "tagEnName": "Family Intrigue"
            },
            {
              "tagId": 1334,
              "tagName": "Kekuatan Khusus",
              "tagEnName": "The Chosen One"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "配音剧",
            "中国",
            "国内翻译",
            "引入",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "33.4M",
          "bookShelfTime": 1748253543000,
          "shelfTime": "2025-05-26 17:59:03",
          "inLibrary": false
        },
        {
          "bookId": "41000107468",
          "bookName": "Bangkit dan Berkuasa (Sulih Suara)",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000107468/41000107468.jpg?t=1730961135113",
          "chapterCount": 90,
          "introduction": "Rendy mendanai pacarnya Lini menyelesaikan kuliah dan menyukseskan kariernya. Namun, Lini malah dengan kejam meminta putus dengan alasan bahwa mereka sudah berada di dunia yang berbeda dan Rendy sudah tidak sepadan dengannya. Saat bersamaan, Ratu Bisnis, CEO cantik yang Bernama Friska menyadari kelebihan Rendy. Dia lalu mengajak Rendy menikah dan mereka pun menjadi suami istri yang mengejutkan semua orang… ",
          "tags": [
            "Balas Dendam",
            "Bangkitnya Orang Biasa",
            "CEO",
            "Orang Biasa",
            "Cinta Rahasia",
            "Cinta Setelah Menikah"
          ],
          "tagV3s": [
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1339,
              "tagName": "Bangkitnya Orang Biasa",
              "tagEnName": "Underdog Story"
            },
            {
              "tagId": 1324,
              "tagName": "CEO",
              "tagEnName": "Billionaire"
            },
            {
              "tagId": 1331,
              "tagName": "Orang Biasa",
              "tagEnName": "A Nobody"
            },
            {
              "tagId": 1416,
              "tagName": "Cinta Rahasia",
              "tagEnName": "Secret Crush"
            },
            {
              "tagId": 1423,
              "tagName": "Cinta Setelah Menikah",
              "tagEnName": "Love After Marriage"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "配音剧",
            "国内翻译",
            "中国",
            "真人剧"
          ],
          "performerIdList": [
            18356,
            18357
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "118M",
          "bookShelfTime": 1730967548000,
          "shelfTime": "2024-11-07 16:19:08",
          "inLibrary": false
        },
        {
          "bookId": "41000102847",
          "bookName": "Membangun Cinta di Era 80-an",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000102847/41000102847.jpg?t=1711076182854",
          "chapterCount": 82,
          "introduction": "Nala, seorang mahasiswi modern melintasi ruang dan waktu kembali ke tahun 1980-an. Di sana, dia bertemu dengan Riko, seorang pemilik peternakan babi yang telah bercerai dan memiliki dua anak.Nala mulai menjalin hubungan dengan Riko dan bersiap untuk menikah dengannya. Di saat yang sama, dia harus berhadapan dengan keluarga Riko yang penuh dengan berbagai masalah dan rintangan. Di tengah situasi tersebut, Nala juga menjadi lebih kuat.",
          "tags": [
            "Bangkitnya Orang Biasa",
            "Keluarga",
            "Serangan Balik",
            "Perjalanan Waktu",
            "Terlahir Kembali",
            "Intrik Keluarga"
          ],
          "tagV3s": [
            {
              "tagId": 1398,
              "tagName": "Bangkitnya Orang Biasa",
              "tagEnName": "Underdog Story"
            },
            {
              "tagId": 1408,
              "tagName": "Keluarga",
              "tagEnName": "Family Bonds"
            },
            {
              "tagId": 1399,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1404,
              "tagName": "Perjalanan Waktu",
              "tagEnName": "Time Travel"
            },
            {
              "tagId": 1405,
              "tagName": "Terlahir Kembali",
              "tagEnName": "Rebirth"
            },
            {
              "tagId": 1411,
              "tagName": "Intrik Keluarga",
              "tagEnName": "Family Intrigue"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "国内翻译",
            "中国",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "35.5M",
          "bookShelfTime": 1711089425000,
          "shelfTime": "2024-03-22 14:37:05",
          "inLibrary": false
        },
        {
          "bookId": "41000102848",
          "bookName": "Mengharumkan Nama Kampung Halaman",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000102848/41000102848.jpg?t=1711078643761",
          "chapterCount": 89,
          "introduction": "Pada Tahun Baru, Joe mengunjungi keluarga mertuanya untuk mengucapkan selamat tahun baru, tetapi dia malah mendapat perlakuan dingin dari seluruh keluarga istrinya. Mereka tidak tahu bahwa identitas asli Joe adalah Presdir Grup Sava yang masuk dalam 10 besar nasional!",
          "tags": [
            "Pembalikan Identitas",
            "Serangan Balik",
            "CEO",
            "Modern",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1338,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1340,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1324,
              "tagName": "CEO",
              "tagEnName": "Billionaire"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "国内翻译",
            "中国",
            "真人剧"
          ],
          "performerIdList": [
            19950,
            19951
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "64.9M",
          "bookShelfTime": 1711088967000,
          "shelfTime": "2024-03-22 14:29:27",
          "inLibrary": false
        },
        {
          "bookId": "41000103915",
          "bookName": "Bangkit dan Berkuasa",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000103915/41000103915.jpg?t=1718265079551",
          "chapterCount": 90,
          "introduction": "Rendy mendanai pacarnya Lini menyelesaikan kuliah dan menyukseskan kariernya. Namun, Lini malah dengan kejam meminta putus dengan alasan bahwa mereka sudah berada di dunia yang berbeda dan Rendy sudah tidak sepadan dengannya. Saat bersamaan, Ratu Bisnis, CEO cantik yang Bernama Friska menyadari kelebihan Rendy. Dia lalu mengajak Rendy menikah dan mereka pun menjadi suami istri yang mengejutkan semua orang… ",
          "tags": [
            "Serangan Balik",
            "Balas Dendam",
            "CEO",
            "Orang Biasa",
            "Kesempatan Kedua",
            "Cinta Setelah Menikah"
          ],
          "tagV3s": [
            {
              "tagId": 1340,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1324,
              "tagName": "CEO",
              "tagEnName": "Billionaire"
            },
            {
              "tagId": 1331,
              "tagName": "Orang Biasa",
              "tagEnName": "A Nobody"
            },
            {
              "tagId": 1422,
              "tagName": "Kesempatan Kedua",
              "tagEnName": "Second Chance"
            },
            {
              "tagId": 1423,
              "tagName": "Cinta Setelah Menikah",
              "tagEnName": "Love After Marriage"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "国内翻译",
            "中国",
            "真人剧"
          ],
          "performerIdList": [
            18356,
            18357
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "93.7M",
          "bookShelfTime": 1718270988000,
          "shelfTime": "2024-06-13 17:29:48",
          "inLibrary": false
        },
        {
          "bookId": "41000103847",
          "bookName": "Pengembara Pulang ke Rumah",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000103847/41000103847.jpg?t=1717656650654",
          "chapterCount": 88,
          "introduction": "20 tahun yang lalu, Tony Sunarto diadopsi oleh ketua direktur Grup Yunda karena kecelakaan mobil dan berpisah dari orang tuanya. 20 tahun kemudian, Tony mengembara pulang ke kampung halamannya. Dia mengenali orang tuanya dari sepasang liontin giok ibu dan anak.",
          "tags": [
            "Pembalikan Identitas",
            "Keluarga",
            "Kekuatan Khusus",
            "Modern",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1338,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1348,
              "tagName": "Keluarga",
              "tagEnName": "Family Bonds"
            },
            {
              "tagId": 1334,
              "tagName": "Kekuatan Khusus",
              "tagEnName": "The Chosen One"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "国内翻译",
            "中国",
            "真人剧"
          ],
          "performerIdList": [
            19397,
            20366
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "33.8M",
          "bookShelfTime": 1717663757000,
          "shelfTime": "2024-06-06 16:49:17",
          "inLibrary": false
        },
        {
          "bookId": "41000108588",
          "bookName": "Dalam Jebakan Hasrat",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000108588/41000108588.jpg?t=1733215824349",
          "chapterCount": 82,
          "introduction": "Althea telah ditipu dan disakiti oleh pacarnya, Axel. Untungnya, Althea akhirnya mampu keluar dari bayang-bayang masa lalunya berkat bantuan Jasver, CEO Grup Amani. Dengan dukungan Jasver, Althea berhasil membangun kembali kepercayaan dirinya dan kembali menekuni karier yang dia cintai. Melalui kerja kerasnya, dia berhasil mendapatkan pengakuan dari rekan kerja dan kliennya, serta membangun reputasi yang solid di masyarakat.",
          "tags": [
            "Pembalikan Identitas",
            "Bangkitnya Orang Biasa",
            "Balas Dendam",
            "Wanita Karier",
            "Modern",
            "Wanita Kuat"
          ],
          "tagV3s": [
            {
              "tagId": 1395,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1398,
              "tagName": "Bangkitnya Orang Biasa",
              "tagEnName": "Underdog Story"
            },
            {
              "tagId": 1394,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1375,
              "tagName": "Wanita Karier",
              "tagEnName": "Career Woman"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1361,
              "tagName": "Wanita Kuat",
              "tagEnName": "Strong Heroine"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "61.6M",
          "bookShelfTime": 1733282311000,
          "shelfTime": "2024-12-04 11:18:31",
          "inLibrary": false
        },
        {
          "bookId": "41000112479",
          "bookName": "Cinta Bersemi Di Malam",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000112479/41000112479.jpg?t=1739849559148",
          "chapterCount": 60,
          "introduction": "Nindi yang menghadapi pahitnya kehidupan akhirnya memutuskan mengganti identitasnya sebagai Indri untuk balas dendam pada kakak angkatnya yang bernama Siska. Di tengah rencana balas dendamnya, Indri malah jatuh cinta pada suami Siska, Nico Indrawan, mereka menikah karena terpaksa dan Nico mengira selama ini anaknya, Tiara, lahir dari rahim Siska. Pada akhirnya kebenaran pun terungkap dan balas dendam Indri pun berjalan sesuai keinginannya.",
          "tags": [
            "Pembalikan Identitas",
            "Balas Dendam",
            "Wanita Mandiri",
            "Cinta Paksaan",
            "Modern",
            "Romansa"
          ],
          "tagV3s": [
            {
              "tagId": 1395,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1394,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1452,
              "tagName": "Wanita Mandiri",
              "tagEnName": "Independent Woman"
            },
            {
              "tagId": 1378,
              "tagName": "Cinta Paksaan",
              "tagEnName": "Forced Love"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1357,
              "tagName": "Romansa",
              "tagEnName": "Romance"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "28.5M",
          "bookShelfTime": 1739875382000,
          "shelfTime": "2025-02-18 18:43:02",
          "inLibrary": false
        },
        {
          "bookId": "41000114318",
          "bookName": "Anak Ajaib Turun Gunung",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000114318/41000114318.jpg?t=1743492517835",
          "chapterCount": 100,
          "introduction": "Meskipun Lena tak terkalahkan di dunia, dia tetap tidak bisa menembus tahap pemurnian. Karena nafsu makannya yang luar biasa, dia ditipu oleh gurunya untuk turun gunung dan mencari juniornya, Yusdi. Setelah turun gunung, Lena selalu mengira dirinya lemah, sementara Yusdi kuat, dan dia bertekad untuk berpegangan pada Yusdi. Namun, kenyataannya, Yusdi sudah lumpuh. Melalui serangkaian kebetulan, Lena membantu Yusdi menyelesaikan masalah dengan musuh-musuhnya.",
          "tags": [
            "Bangkitnya Orang Biasa",
            "Fantasi",
            "Wanita Kuat"
          ],
          "tagV3s": [
            {
              "tagId": 1398,
              "tagName": "Bangkitnya Orang Biasa",
              "tagEnName": "Underdog Story"
            },
            {
              "tagId": 1355,
              "tagName": "Fantasi",
              "tagEnName": "Fantasy"
            },
            {
              "tagId": 1361,
              "tagName": "Wanita Kuat",
              "tagEnName": "Strong Heroine"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "15.6M",
          "bookShelfTime": 1743500632000,
          "shelfTime": "2025-04-01 17:43:52",
          "inLibrary": false
        },
        {
          "bookId": "41000114577",
          "bookName": "Karma untuk Suami Tak Berguna",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000114577/41000114577.jpg?t=1744015605524",
          "chapterCount": 50,
          "introduction": "Demi menolong keponakannya yang hanya terluka ringan, Sandro sampai harus menghambat pertolongan terhadap istrinya yang sudah akan melahirkan sang anak kembar. Ketika sudah menyadari kejanggalan ini, Valeri pun mengandalkan kecerdasan dirinya dan hukum untuk membalas dendam terhadap suami parasitnya itu beserta seluruh keluarganya, hingga akhirnya Valeri bisa menempuh hidup bahagia bersama putrinya.",
          "tags": [
            "Penebusan",
            "Balas Dendam",
            "Intrik Keluarga",
            "Wanita Karier",
            "Modern",
            "Wanita Kuat"
          ],
          "tagV3s": [
            {
              "tagId": 1459,
              "tagName": "Penebusan",
              "tagEnName": "Redemption"
            },
            {
              "tagId": 1394,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1411,
              "tagName": "Intrik Keluarga",
              "tagEnName": "Family Intrigue"
            },
            {
              "tagId": 1375,
              "tagName": "Wanita Karier",
              "tagEnName": "Career Woman"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1361,
              "tagName": "Wanita Kuat",
              "tagEnName": "Strong Heroine"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "超短剧",
            "真人剧"
          ],
          "performerIdList": [
            21982,
            28599
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "4.2M",
          "bookShelfTime": 1744018427000,
          "shelfTime": "2025-04-07 17:33:47",
          "inLibrary": false
        }
      ],
      "type": 3
    },
    {
      "columnId": 503,
      "title": "Eksklusif di Dramabox",
      "subTitle": "",
      "style": "BIG_PIC_LATERAL",
      "bookList": [
        {
          "bookId": "41000119598",
          "bookName": "Cinta yang Kurelakan",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000119598/41000119598.jpg?t=1754361121026",
          "chapterCount": 55,
          "introduction": "Maira kehilangan penglihatannya saat menyelamatkan Gyan. Gyan melamarnya, tetapi setelah menikah dan penglihatan Maira pulih, dia menemukan suaminya berselingkuh dengan sekretarisnya dan bahkan menampungnya di rumah mereka. Maira sangat terpukul. Dia akhirnya memutuskan untuk pergi jauh. Pada saat itulah Gyan menyesal. Namun, Maira kini telah mengabdikan dirinya pada bidang medis, dengan seorang kakak seperguruan yang setia diam-diam menjaganya.",
          "tags": [
            "Cinta Segitiga",
            "Perselingkuhan",
            "Balas Dendam",
            "Dokter",
            "Modern",
            "Romansa"
          ],
          "tagV3s": [
            {
              "tagId": 1380,
              "tagName": "Cinta Segitiga",
              "tagEnName": "Love Triangle"
            },
            {
              "tagId": 1400,
              "tagName": "Perselingkuhan",
              "tagEnName": "Betrayal"
            },
            {
              "tagId": 1394,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1440,
              "tagName": "Dokter",
              "tagEnName": "Doctor"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1357,
              "tagName": "Romansa",
              "tagEnName": "Romance"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "中国",
            "国内翻译",
            "自制",
            "真人剧"
          ],
          "performerIdList": [
            20149,
            24985
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "8.9M",
          "bookShelfTime": 1754373028000,
          "shelfTime": "2025-08-05 13:50:28",
          "inLibrary": false
        },
        {
          "bookId": "41000119286",
          "bookName": "Bayangan yang Selalu Kau Cari",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000119286/41000119286.jpg?t=1753769624450",
          "chapterCount": 83,
          "introduction": "Gavin jatuh cinta pada pandangan pertama dengan Liora dan bekerja sebagai sekretaris di perusahaan Liora. Suatu malam, setelah Liora mabuk, mereka tanpa sengaja tidur bersama. Maka dimulailah empat tahun kehidupan Gavin. Sekretaris di siang hari, kekasih di malam hari. Sampai akhirnya cinta pertama Liora, Rafael, kembali ke negara itu. Gavin akhirnya menyadari sepenuhnya bahwa Liora tidak pernah mencintainya. Setelah kepergian Gavin, Liora sangat menyesali perbuatannya.",
          "tags": [
            "Cinta Segitiga",
            "Cinta Pandangan Pertama",
            "Perselingkuhan",
            "CEO",
            "Orang Biasa",
            "Modern"
          ],
          "tagV3s": [
            {
              "tagId": 1413,
              "tagName": "Cinta Segitiga",
              "tagEnName": "Love Triangle"
            },
            {
              "tagId": 1415,
              "tagName": "Cinta Pandangan Pertama",
              "tagEnName": "Love at First Sight"
            },
            {
              "tagId": 1341,
              "tagName": "Perselingkuhan",
              "tagEnName": "Betrayal"
            },
            {
              "tagId": 1324,
              "tagName": "CEO",
              "tagEnName": "Billionaire"
            },
            {
              "tagId": 1331,
              "tagName": "Orang Biasa",
              "tagEnName": "A Nobody"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "中国",
            "国内翻译",
            "自制",
            "真人剧"
          ],
          "performerIdList": [
            18356,
            20184
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "8.2M",
          "bookShelfTime": 1753774631000,
          "shelfTime": "2025-07-29 15:37:11",
          "inLibrary": false
        },
        {
          "bookId": "41000118861",
          "bookName": "Takdir Putri yang Hilang",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000118861/41000118861.jpg?t=1753076245341",
          "chapterCount": 72,
          "introduction": "Nadia Sania (Siva), putri Tuan Teo terlantarkan waktu masih muda dan diadopsi oleh seorang pendeta. Kakak seniornya yang terlahir kembali, Wanda ambil liontin gioknya dan dorong dia dari tebing, lalu berpura-pura jadi putri Keluarga Sania. Untungnya, Siva diselamatkan Pangeran Juvanda dan diberi nama Putri Naras karena dia punya tubuh keberuntungan dalam sembuhkan Permaisuri...",
          "tags": [
            "Keluarga",
            "Anak Hilang",
            "Pertukaran Jiwa",
            "Fantasi",
            "Wanita Kuat"
          ],
          "tagV3s": [
            {
              "tagId": 1408,
              "tagName": "Keluarga",
              "tagEnName": "Family Bonds"
            },
            {
              "tagId": 1457,
              "tagName": "Anak Hilang",
              "tagEnName": "Lost Child"
            },
            {
              "tagId": 1458,
              "tagName": "Pertukaran Jiwa",
              "tagEnName": "Transmigration"
            },
            {
              "tagId": 1355,
              "tagName": "Fantasi",
              "tagEnName": "Fantasy"
            },
            {
              "tagId": 1361,
              "tagName": "Wanita Kuat",
              "tagEnName": "Strong Heroine"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "中国",
            "国内翻译",
            "自制",
            "真人剧"
          ],
          "performerIdList": [
            25525,
            27428
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "13.4M",
          "bookShelfTime": 1753693200000,
          "shelfTime": "2025-07-28 17:00:00",
          "inLibrary": false
        },
        {
          "bookId": "41000118399",
          "bookName": "Cintaku Gagal Membuatmu Hangat",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000118399/41000118399.jpg?t=1752459031014",
          "chapterCount": 82,
          "introduction": "Menikah tujuh tahun, suami Rania selalu dingin seperti es. Di hari ulang tahunnya, dia terbang ke luar negeri mencari suami dan putrinya, tetapi dia menemukan bahwa suaminya yang tidak mengingat hari ulang tahunnya, malah membawa putrinya merayakan ulang tahun wanita lain. Suaminya yang dingin dan jauh kepada semua orang, justru tersenyum hanya kepada wanita itu. Bahkan putri Rania ingin menganggap wanita itu sebagai ibunya. Rania akhirnya benar-benar menyerah.",
          "tags": [
            "Mengejar Istri",
            "Cinta Segitiga",
            "Perselingkuhan",
            "Pantang Menyerah",
            "Modern",
            "Wanita Kuat"
          ],
          "tagV3s": [
            {
              "tagId": 1401,
              "tagName": "Mengejar Istri",
              "tagEnName": "Winning Her Back"
            },
            {
              "tagId": 1380,
              "tagName": "Cinta Segitiga",
              "tagEnName": "Love Triangle"
            },
            {
              "tagId": 1400,
              "tagName": "Perselingkuhan",
              "tagEnName": "Betrayal"
            },
            {
              "tagId": 1453,
              "tagName": "Pantang Menyerah",
              "tagEnName": "Strong-Willed"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1361,
              "tagName": "Wanita Kuat",
              "tagEnName": "Strong Heroine"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "中国",
            "国内翻译",
            "自制",
            "真人剧"
          ],
          "performerIdList": [
            19783
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "38.9M",
          "bookShelfTime": 1753088400000,
          "shelfTime": "2025-07-21 17:00:00",
          "inLibrary": false
        },
        {
          "bookId": "41000118175",
          "bookName": "Terjebak dalam Penyesalan",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000118175/41000118175.jpg?t=1751954814015",
          "chapterCount": 60,
          "introduction": "Jelita menggunakan segala cara, akhirnya berhasil jadi istri Fiero. Namun suatu hari tanpa sengaja, Jelita menemukan bahwa suaminya menyimpan obsesi yang menyimpang terhadap Talia, adik dari suaminya yang nggak ada hubungan darah. Fiero membela Talia yang membuat Jelita benaran mati rasa. Jelita tanda tangan perjanjian cerai. Dia memulai hidup barunya dengan Malin yang sudah suka padanya. Setelah itu, Fiero baru mendadak merasa bahwa Jelita adalah orang yang dia cintai.",
          "tags": [
            "Mengejar Istri",
            "Pria Tangguh",
            "Wanita Mandiri",
            "Cinta Terlarang",
            "Kesempatan Kedua",
            "Modern"
          ],
          "tagV3s": [
            {
              "tagId": 1401,
              "tagName": "Mengejar Istri",
              "tagEnName": "Winning Her Back"
            },
            {
              "tagId": 1368,
              "tagName": "Pria Tangguh",
              "tagEnName": "Tough Guy"
            },
            {
              "tagId": 1452,
              "tagName": "Wanita Mandiri",
              "tagEnName": "Independent Woman"
            },
            {
              "tagId": 1379,
              "tagName": "Cinta Terlarang",
              "tagEnName": "Forbidden Love"
            },
            {
              "tagId": 1392,
              "tagName": "Kesempatan Kedua",
              "tagEnName": "Second Chance"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "中国",
            "国内翻译",
            "自制",
            "真人剧"
          ],
          "performerIdList": [
            19419,
            27094
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "28.1M",
          "bookShelfTime": 1751965207000,
          "shelfTime": "2025-07-08 17:00:07",
          "inLibrary": false
        },
        {
          "bookId": "41000117548",
          "bookName": "Cinta Beracun",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000117548/41000117548.jpg?t=1750747674745",
          "chapterCount": 81,
          "introduction": "Dengan hati yang penuh luka, Susan menahan rasa sedihnya dengan berfoya-foya dan menggoda semua pria di kalangan orang kaya. Sampai suatu saat, dirinya bertemu dengan seorang pengawal yang sangat tampan. Susan langsung mengejar pria itu dan menggodanya selama bertahun-tahun. Sampai suatu hari, dia mendapati bahwa pengawal tampan itu ternyata hanya mendekatinya karena jatuh cinta dengan adik tirinya, yang merupakan sumber dari segala penderitaannya sejak kecil.",
          "tags": [
            "Perselingkuhan",
            "Gadis Naif",
            "Cinta Terlarang",
            "Cinta Segitiga",
            "Modern",
            "Romansa"
          ],
          "tagV3s": [
            {
              "tagId": 1400,
              "tagName": "Perselingkuhan",
              "tagEnName": "Betrayal"
            },
            {
              "tagId": 1374,
              "tagName": "Gadis Naif",
              "tagEnName": "Innocent Damsel"
            },
            {
              "tagId": 1379,
              "tagName": "Cinta Terlarang",
              "tagEnName": "Forbidden Love"
            },
            {
              "tagId": 1380,
              "tagName": "Cinta Segitiga",
              "tagEnName": "Love Triangle"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1357,
              "tagName": "Romansa",
              "tagEnName": "Romance"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "中国",
            "国内翻译",
            "自制",
            "真人剧"
          ],
          "performerIdList": [
            19648,
            21643
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "93.2M",
          "bookShelfTime": 1750752708000,
          "shelfTime": "2025-06-24 16:11:48",
          "inLibrary": false
        },
        {
          "bookId": "41000104882",
          "bookName": "Gadis Lugu Penakluk Raja Mafia",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000104882/41000104882.jpg?t=1766741039586",
          "chapterCount": 61,
          "introduction": "Setelah diculik oleh raja mafia, Bella yang polos dipaksa untuk menandatangani kontrak untuk membayar biaya operasi ibunya. Namun, kontrak yang bernilai 7,5 miliar ini menuntut Bella melakukan lebih banyak daripada yang pernah dia bayangkan... Sikap sang raja mafia yang keras, perlahan-lahan mulai melunak karena Bella. Sementara itu, Bella secara bertahap menemukan jati dirinya yang sebenarnya. Namun, apakah itu cinta, ataukah hanya sindrom Stockholm?",
          "tags": [
            "Pembalikan Identitas",
            "Perselingkuhan",
            "Mafia",
            "Gadis Naif",
            "Cinta Paksaan",
            "Cinta Terlarang"
          ],
          "tagV3s": [
            {
              "tagId": 1395,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1400,
              "tagName": "Perselingkuhan",
              "tagEnName": "Betrayal"
            },
            {
              "tagId": 1364,
              "tagName": "Mafia",
              "tagEnName": "Mafia"
            },
            {
              "tagId": 1374,
              "tagName": "Gadis Naif",
              "tagEnName": "Innocent Damsel"
            },
            {
              "tagId": 1378,
              "tagName": "Cinta Paksaan",
              "tagEnName": "Forced Love"
            },
            {
              "tagId": 1379,
              "tagName": "Cinta Terlarang",
              "tagEnName": "Forbidden Love"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "自制",
            "海外原创",
            "真人剧",
            "印尼语",
            "美国"
          ],
          "performerIdList": [
            11015,
            12191
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "94.7M",
          "bookShelfTime": 1722394931000,
          "shelfTime": "2024-07-31 11:02:11",
          "inLibrary": false
        },
        {
          "bookId": "41000106122",
          "bookName": "Kebangkitan Jiwa (Sulih Suara)",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000106122/41000106122.jpg?t=1726717304452",
          "chapterCount": 87,
          "introduction": "Arya telah bereinkarnasi, tapi terlahir dengan kecacatan mental dan dihina oleh orang di sekitarnya.Tanpa sepengetahuan mereka, sebenarnya Arya punya identitas yang sangat spesial. Ketika dia sadar kembali, para muridnya bersukacita dan menantikan kembalinya guru yang mereka hormati.Namun, Arya harus menghadapi tatapan curiga dari semua orang yang menghadang jalan kejayaannya.",
          "tags": [
            "Pembalikan Identitas",
            "Serangan Balik",
            "Terlahir Kembali",
            "Modern",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1338,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1340,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1345,
              "tagName": "Terlahir Kembali",
              "tagEnName": "Rebirth"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "配音剧",
            "国内翻译",
            "自制",
            "中国",
            "真人剧"
          ],
          "performerIdList": [
            18356,
            19400,
            19406,
            19951
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "100M",
          "bookShelfTime": 1726727712000,
          "shelfTime": "2024-09-19 14:35:12",
          "inLibrary": false
        },
        {
          "bookId": "41000109990",
          "bookName": "Kaisar Pulang ke Desa",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000109990/41000109990.jpg?t=1735098057926",
          "chapterCount": 63,
          "introduction": "Sebelum meninggalkan kampung halamannya, Alingga berjanji pada tunangannya, Rinjani, bahwa ketika dia menjadi kaisar, dia akan kembali dan menjadikan Rinjani sebagai permaisuri. Bertahun-tahun kemudian, dia naik takhta sebagai kaisar. Untuk menepati janjinya, dia memutuskan untuk menyamar dan kembali ke kampung halamannya. Namun, saat memasuki gerbang kota, dia mendapati tunangannya, Rinjani, telah berubah hati dan akan menikah dengan putra Bupati...",
          "tags": [
            "Pembalikan Identitas",
            "Serangan Balik",
            "Balas Dendam",
            "Bangsawan",
            "Sejarah",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1338,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1340,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1327,
              "tagName": "Bangsawan",
              "tagEnName": "Royalty"
            },
            {
              "tagId": 1319,
              "tagName": "Sejarah",
              "tagEnName": "Historical"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "自制",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "performerIdList": [
            19900,
            23763
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "31.5M",
          "bookShelfTime": 1735123115000,
          "shelfTime": "2024-12-25 18:38:35",
          "inLibrary": false
        },
        {
          "bookId": "41000112204",
          "bookName": "Mawar di Medan Perang (Sulih Suara)",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000112204/41000112204.jpg?t=1739257773342",
          "chapterCount": 91,
          "introduction": "Demi menenangkan hati ibunya, Keeyara dinikahkan dengan Savero, pilihan ibunya, dan menjadi seorang istri yang lembut dan anggun.Pada malam pertama pernikahan, Savero pergi berperang. Namun, begitu Savero pulang, hal pertama yang dia lakukan adalah untuk menikahi wanita lain.Keeyara langsung mengajukan permohonan cerai dan kembali mengangkat tombaknya dan membangkitkan kejayaan keluarga yang ditinggalkan ayahnya. Dia kemudian menemukan jodoh sejatinya, yaitu Raja Arkana. ",
          "tags": [
            "Balas Dendam",
            "Mengejar Istri",
            "Bangsawan",
            "Wanita Karier",
            "Pantang Menyerah",
            "Takdir Cinta"
          ],
          "tagV3s": [
            {
              "tagId": 1394,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1401,
              "tagName": "Mengejar Istri",
              "tagEnName": "Winning Her Back"
            },
            {
              "tagId": 1367,
              "tagName": "Bangsawan",
              "tagEnName": "Royalty"
            },
            {
              "tagId": 1375,
              "tagName": "Wanita Karier",
              "tagEnName": "Career Woman"
            },
            {
              "tagId": 1453,
              "tagName": "Pantang Menyerah",
              "tagEnName": "Strong-Willed"
            },
            {
              "tagId": 1382,
              "tagName": "Takdir Cinta",
              "tagEnName": "Destined Love"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "配音剧",
            "中国",
            "国内翻译",
            "自制",
            "真人剧"
          ],
          "performerIdList": [
            19494,
            22707
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "14.6M",
          "bookShelfTime": 1739266053000,
          "shelfTime": "2025-02-11 17:27:33",
          "inLibrary": false
        },
        {
          "bookId": "41000112972",
          "bookName": "Dewa Pedang",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000112972/41000112972.jpg?t=1740990995512",
          "chapterCount": 71,
          "introduction": "Dulu kala, Dewa Pedang mengalahkan semua iblis jahat di segala penjuru dunia. Namun, karena suatu kesalahan yang menyebabkan kematian istrinya, dia merasa sangat bersalah. Sebagai hukuman, setiap hari ia menebas Batu Pengikat Langit sebanyak sepuluh ribu kali. Akhirnya Dewa Pedang pun meninggal karena kehabisan tenaga. Ajaibnya, jiwanya tidak musnah dan merasuki tubuh seorang pemuda lemah. Sejak saat itu, putaran hidupnya yang legendaris dituliskan kembali.",
          "tags": [
            "Terlahir Kembali",
            "Pertukaran Jiwa",
            "Bangkitnya Orang Biasa",
            "Penebusan",
            "Dewa Perang",
            "Fantasi"
          ],
          "tagV3s": [
            {
              "tagId": 1345,
              "tagName": "Terlahir Kembali",
              "tagEnName": "Rebirth"
            },
            {
              "tagId": 1477,
              "tagName": "Pertukaran Jiwa",
              "tagEnName": "Transmigration"
            },
            {
              "tagId": 1339,
              "tagName": "Bangkitnya Orang Biasa",
              "tagEnName": "Underdog Story"
            },
            {
              "tagId": 1478,
              "tagName": "Penebusan",
              "tagEnName": "Redemption"
            },
            {
              "tagId": 1330,
              "tagName": "Dewa Perang",
              "tagEnName": "War God"
            },
            {
              "tagId": 1321,
              "tagName": "Fantasi",
              "tagEnName": "Fantasy"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "自制",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "performerIdList": [
            20383,
            22734,
            22743
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "17.9M",
          "bookShelfTime": 1740994829000,
          "shelfTime": "2025-03-03 17:40:29",
          "inLibrary": false
        },
        {
          "bookId": "41000103207",
          "bookName": "Kebangkitan Jiwa",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000103207/41000103207.jpg?t=1713855222851",
          "chapterCount": 87,
          "introduction": "Arya telah bereinkarnasi, tapi terlahir dengan kecacatan mental dan dihina oleh orang di sekitarnya.Tanpa sepengetahuan mereka, sebenarnya Arya punya identitas yang sangat spesial. Ketika dia sadar kembali, para muridnya bersukacita dan menantikan kembalinya guru yang mereka hormati.Namun, Arya harus menghadapi tatapan curiga dari semua orang yang menghadang jalan kejayaannya.",
          "tags": [
            "Pembalikan Identitas",
            "Serangan Balik",
            "Terlahir Kembali",
            "Kekuatan Khusus",
            "Modern",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1338,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1340,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1345,
              "tagName": "Terlahir Kembali",
              "tagEnName": "Rebirth"
            },
            {
              "tagId": 1334,
              "tagName": "Kekuatan Khusus",
              "tagEnName": "The Chosen One"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "自制",
            "国内翻译",
            "中国",
            "真人剧"
          ],
          "performerIdList": [
            18356,
            19400,
            19406,
            19951
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "66M",
          "bookShelfTime": 1713858363000,
          "shelfTime": "2024-04-23 15:46:03",
          "inLibrary": false
        },
        {
          "bookId": "41000103905",
          "bookName": "Cinta Membutuhkan Timbal Balik",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000103905/41000103905.jpg?t=1718248060448",
          "chapterCount": 102,
          "introduction": "Vanya adalah putri orang terkaya yang menyembunyikan identitasnya. Dia bekerja di perusahaannya sendiri. Namun, CEO dari perusahaan ternyata adalah pacarnya, yaitu Revan, yang pergi tanpa pamit selama tiga tahun. Awalnya dia berpikir bahwa kesalahpahaman bisa diselesaikan, tetapi sang wanita licik Riri menghasutnya, menyebabkan kesalahpahaman antara Vanya dan Revan makin parah ...",
          "tags": [
            "Pembalikan Identitas",
            "Keluarga",
            "CEO",
            "Bangsawan",
            "Modern",
            "Romansa"
          ],
          "tagV3s": [
            {
              "tagId": 1395,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1408,
              "tagName": "Keluarga",
              "tagEnName": "Family Bonds"
            },
            {
              "tagId": 1362,
              "tagName": "CEO",
              "tagEnName": "Billionaire"
            },
            {
              "tagId": 1367,
              "tagName": "Bangsawan",
              "tagEnName": "Royalty"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1357,
              "tagName": "Romansa",
              "tagEnName": "Romance"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "自制",
            "国内翻译",
            "中国",
            "真人剧"
          ],
          "performerIdList": [
            19986,
            20228
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "55.1M",
          "bookShelfTime": 1718257321000,
          "shelfTime": "2024-06-13 13:42:01",
          "inLibrary": false
        },
        {
          "bookId": "41000105960",
          "bookName": "Mawar di Medan Perang",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000105960/41000105960.jpg?t=1725961593902",
          "chapterCount": 91,
          "introduction": "Demi menenangkan hati ibunya, Keeyara dinikahkan dengan Savero, pilihan ibunya, dan menjadi seorang istri yang lembut dan anggun.Pada malam pertama pernikahan, Savero pergi berperang. Namun, begitu Savero pulang, hal pertama yang dia lakukan adalah untuk menikahi wanita lain.Keeyara langsung mengajukan permohonan cerai dan kembali mengangkat tombaknya dan membangkitkan kejayaan keluarga yang ditinggalkan ayahnya. Dia kemudian menemukan jodoh sejatinya, yaitu Raja Arkana. ",
          "tags": [
            "Balas Dendam",
            "Serangan Balik",
            "Mengejar Istri",
            "Gadis Tomboy",
            "Bangsawan",
            "Sejarah"
          ],
          "tagV3s": [
            {
              "tagId": 1394,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1399,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1401,
              "tagName": "Mengejar Istri",
              "tagEnName": "Winning Her Back"
            },
            {
              "tagId": 1376,
              "tagName": "Gadis Tomboy",
              "tagEnName": "Tomboy"
            },
            {
              "tagId": 1367,
              "tagName": "Bangsawan",
              "tagEnName": "Royalty"
            },
            {
              "tagId": 1353,
              "tagName": "Sejarah",
              "tagEnName": "Historical"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "自制",
            "国内翻译",
            "中国",
            "真人剧"
          ],
          "performerIdList": [
            19494,
            22707
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "27.8M",
          "bookShelfTime": 1726022726000,
          "shelfTime": "2024-09-11 10:45:26",
          "inLibrary": false
        },
        {
          "bookId": "41000107149",
          "bookName": "Jatuh Cinta pada Berandal Berjas",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000107149/41000107149.jpg?t=1730107651851",
          "chapterCount": 56,
          "introduction": "Jeni harus bekerja di dua tempat sebagai penari klub dan pelayan hotel demi ibunya. Suatu malam, Milan, ketua mafia berandal yang terkenal, memasuki klub Jeni, berharap untuk mendapatkan kembali “kekuasaannya”. Setiap wanita merasa kecewa, kecuali Jeni. Dia langsung jatuh cinta pada Jeni tanpa mengetahui bahwa teman Jeni, Anton, juga rela mengorbankan segalanya demi dia. Dia harus membuat pilihan. Mafia yang amat dominan atau anak muda yang polos? Siapa yang akan dia pilih?",
          "tags": [
            "Serangan Balik",
            "Mafia",
            "Gadis Naif",
            "Cinta Segitiga",
            "Cinta Pandangan Pertama",
            "Cinta Rahasia"
          ],
          "tagV3s": [
            {
              "tagId": 1399,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1364,
              "tagName": "Mafia",
              "tagEnName": "Mafia"
            },
            {
              "tagId": 1374,
              "tagName": "Gadis Naif",
              "tagEnName": "Innocent Damsel"
            },
            {
              "tagId": 1380,
              "tagName": "Cinta Segitiga",
              "tagEnName": "Love Triangle"
            },
            {
              "tagId": 1384,
              "tagName": "Cinta Pandangan Pertama",
              "tagEnName": "Love at First Sight"
            },
            {
              "tagId": 1386,
              "tagName": "Cinta Rahasia",
              "tagEnName": "Secret Crush"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "美国",
            "海外原创",
            "自制",
            "真人剧"
          ],
          "performerIdList": [
            12308,
            29179
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "9.1M",
          "bookShelfTime": 1730172429000,
          "shelfTime": "2024-10-29 11:27:09",
          "inLibrary": false
        }
      ],
      "type": 3
    },
    {
      "columnId": 504,
      "title": "Favorit VIP",
      "subTitle": "",
      "style": "VERTICAL",
      "bookList": [
        {
          "bookId": "41000119275",
          "bookName": "Satpam Itu Tak Bisa Diremehkan",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000119275/41000119275.jpg?t=1753759350536",
          "chapterCount": 80,
          "introduction": "Rigo adalah seorang satpam di kompleks. Meskipun penampilannya terlihat biasa saja, tetapi dia memiliki bakat bisnis yang hebat. Bahkan kehebatannya itu membuat para pengusaha besar menjadi terpukau. Setelah kebenarannya terungkap, barulah semua orang mengerti. Ternyata si satpam yang penampilannya begitu sederhana itu adalah pebisnis nomor satu di masa lalu itu. ",
          "tags": [
            "Pembalikan Identitas",
            "Tokoh Legendaris",
            "Modern",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1338,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1332,
              "tagName": "Tokoh Legendaris",
              "tagEnName": "Divine Tycoon"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "中国",
            "国内翻译",
            "引入",
            "真人剧"
          ],
          "performerIdList": [
            22599,
            22862
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "12.8M",
          "bookShelfTime": 1753768713000,
          "shelfTime": "2025-07-29 13:58:33",
          "inLibrary": false
        },
        {
          "bookId": "41000118963",
          "bookName": "Duka di Balik Senyuman",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000118963/41000118963.jpg?t=1753173752227",
          "chapterCount": 73,
          "introduction": "Video mesum milik Leona tersebar, dirinya yang merupakan nona keluarga kaya pun menjadi bahan cemooh semua orang. Hal tersebut membuat Leona sadar bahwa Gio, pacar yang sangat dia sayangi, adalah dalang dari perudungan yang sering kali ia alami. Gio nggak pernah mencintainya, semua hal yang dia lakukan hanya demi balas dendam atas penderitaan yang diterima kakaknya. Dengan putus asa, Leona pun menyetujui perintah ayahnya untuk menikah dengan pria buta dan gila...",
          "tags": [
            "Cinta Segitiga",
            "Mengejar Istri",
            "Perselingkuhan",
            "Putri Kaya",
            "Modern",
            "Romansa"
          ],
          "tagV3s": [
            {
              "tagId": 1380,
              "tagName": "Cinta Segitiga",
              "tagEnName": "Love Triangle"
            },
            {
              "tagId": 1401,
              "tagName": "Mengejar Istri",
              "tagEnName": "Winning Her Back"
            },
            {
              "tagId": 1400,
              "tagName": "Perselingkuhan",
              "tagEnName": "Betrayal"
            },
            {
              "tagId": 1450,
              "tagName": "Putri Kaya",
              "tagEnName": "Heiress"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1357,
              "tagName": "Romansa",
              "tagEnName": "Romance"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "自制",
            "国内翻译",
            "真人剧",
            "印尼语",
            "中国"
          ],
          "performerIdList": [
            19553,
            27556
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "8.2M",
          "bookShelfTime": 1753178244000,
          "shelfTime": "2025-07-22 17:57:24",
          "inLibrary": false
        },
        {
          "bookId": "41000118123",
          "bookName": "Nafsu Terlarang",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000118123/41000118123.jpg?t=1751874058203",
          "chapterCount": 87,
          "introduction": "Lima tahun lalu, Kaiden Loren melanggar pantangan. Citra Joana membiusnya kemudian melarikan diri. Citra menyembunyikan identitas, tapi mereka tetap bertemu lagi. Dibawah batang hidung Kaiden, Citra berusaha merencanakan untuk kabur lagi. Namun tanpa diduga, kali ini dia adalah mangsa. Perangkap sang pemburu sudah dipasang sejak pertama kali mereka bertemu.",
          "tags": [
            "Pengantin Kabur",
            "Cinta Terlarang",
            "Kesempatan Kedua",
            "Modern",
            "Romansa",
            "BG"
          ],
          "tagV3s": [
            {
              "tagId": 1396,
              "tagName": "Pengantin Kabur",
              "tagEnName": "Runaway Bride"
            },
            {
              "tagId": 1379,
              "tagName": "Cinta Terlarang",
              "tagEnName": "Forbidden Love"
            },
            {
              "tagId": 1392,
              "tagName": "Kesempatan Kedua",
              "tagEnName": "Second Chance"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1357,
              "tagName": "Romansa",
              "tagEnName": "Romance"
            },
            {
              "tagId": 1358,
              "tagName": "BG",
              "tagEnName": "BG"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "36.1M",
          "bookShelfTime": 1752483600000,
          "shelfTime": "2025-07-14 17:00:00",
          "inLibrary": false
        },
        {
          "bookId": "41000118178",
          "bookName": "Sang Pendiri Kekaisaran",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000118178/41000118178.jpg?t=1751955039164",
          "chapterCount": 80,
          "introduction": "Dafa Tanata, perdana menteri setia yang dibebani amanat mendiang kaisar, terus mengabdi meski diperlakukan tidak adil oleh kaisar baru, Kira Sanur. Setelah janji toleransi seratus kali hampir habis, Dafa bersiap meninggalkan istana dan jabatannya untuk selamanya.",
          "tags": [
            "Cinta Segitiga",
            "Serangan Balik",
            "Balas Dendam",
            "Bangsawan",
            "Sejarah",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1413,
              "tagName": "Cinta Segitiga",
              "tagEnName": "Love Triangle"
            },
            {
              "tagId": 1340,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1327,
              "tagName": "Bangsawan",
              "tagEnName": "Royalty"
            },
            {
              "tagId": 1319,
              "tagName": "Sejarah",
              "tagEnName": "Historical"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "自制",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "performerIdList": [
            19731,
            19810
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "14.6M",
          "bookShelfTime": 1751965165000,
          "shelfTime": "2025-07-08 16:59:25",
          "inLibrary": false
        },
        {
          "bookId": "41000117508",
          "bookName": "Jenderal, Istrimu Kabur Lagi!",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000117508/41000117508.jpg?t=1750731207636",
          "chapterCount": 82,
          "introduction": "Semua orang mengira istri sang Jenderal Muda hanyalah gadis desa yang polos dan penurut. Ia bahkan berkata, “Istriku itu lembut, tidak tahu soal pengobatan atau senjata.” Tapi kenyataan berkata lain! Istrinya justru membuat para nyonya sosialita iri, menyembuhkan orang dengan keahlian pengobatan dan menumpas musuh dengan pistol di tangan. Sementara sang jenderal terus menyangkal dengan percaya diri—sambil berlutut. Sebuah romansa kocak antara suami halu dan istri luar biasa.",
          "tags": [
            "Pembalikan Identitas",
            "Jenderal",
            "Takdir Cinta",
            "Musuh Jadi Kekasih",
            "Modern",
            "Romansa"
          ],
          "tagV3s": [
            {
              "tagId": 1395,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1441,
              "tagName": "Jenderal",
              "tagEnName": "Marshal"
            },
            {
              "tagId": 1382,
              "tagName": "Takdir Cinta",
              "tagEnName": "Destined Love"
            },
            {
              "tagId": 1390,
              "tagName": "Musuh Jadi Kekasih",
              "tagEnName": "Enemy to Lover"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1357,
              "tagName": "Romansa",
              "tagEnName": "Romance"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "46.5M",
          "bookShelfTime": 1751274000000,
          "shelfTime": "2025-06-30 17:00:00",
          "inLibrary": false
        },
        {
          "bookId": "41000116901",
          "bookName": "Dewa Judi",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000116901/41000116901.jpg?t=1749522609038",
          "chapterCount": 74,
          "introduction": "Selama liburan Tahun Baru Imlek, Yena dijebak oleh sahabatnya, Ceni, dan kalah judi 400 juta. Uang itu adalah biaya sekolah putrinya, biaya pengobatan ayahnya, dan biaya hidup keluarga mereka bertiga. Demi mendapatkan kembali uang tersebut, Sandi nekat masuk ke dalam lingkaran judi itu untuk melawan mereka dengan menggunakan teknik judi tingkat tinggi...",
          "tags": [
            "Pembalikan Identitas",
            "Balas Dendam",
            "Modern",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1338,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "自制",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "performerIdList": [
            19424,
            19871
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "29.5M",
          "bookShelfTime": 1749535483000,
          "shelfTime": "2025-06-10 14:04:43",
          "inLibrary": false
        },
        {
          "bookId": "41000116423",
          "bookName": "Ketika Hati Memilih Pergi",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000116423/41000116423.jpg?t=1748330537344",
          "chapterCount": 69,
          "introduction": "Asya dan Dhevan telah menikah secara diam-diam selama empat tahun. Di siang hari, dia adalah bawahan Dhevan yang paling cakap, dan di malam hari, dia adalah istrinya yang sangat dicintai. Dia selalu berpikir bahwa hubungan mereka tidak akan berubah, tetapi di bawah bimbingan ibu mertuanya, Asya secara bertahap menyadari bahwa Dhevan perlahan-lahan melewati batas dengan Kezia yang muda dan ceria. Asya memutuskan untuk bercerai, dan mulai menata kembali masa depannya...",
          "tags": [
            "Balas Dendam",
            "Perselingkuhan",
            "Wanita Mandiri",
            "Kesempatan Kedua",
            "Cinta Setelah Menikah",
            "Modern"
          ],
          "tagV3s": [
            {
              "tagId": 1394,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1400,
              "tagName": "Perselingkuhan",
              "tagEnName": "Betrayal"
            },
            {
              "tagId": 1452,
              "tagName": "Wanita Mandiri",
              "tagEnName": "Independent Woman"
            },
            {
              "tagId": 1392,
              "tagName": "Kesempatan Kedua",
              "tagEnName": "Second Chance"
            },
            {
              "tagId": 1393,
              "tagName": "Cinta Setelah Menikah",
              "tagEnName": "Love After Marriage"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "自制",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "performerIdList": [
            19790,
            20314,
            25624
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "25.1M",
          "bookShelfTime": 1748334627000,
          "shelfTime": "2025-05-27 16:30:27",
          "inLibrary": false
        },
        {
          "bookId": "41000112706",
          "bookName": "Alunan Cinta",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000112706/41000112706.jpg?t=1740384131838",
          "chapterCount": 65,
          "introduction": "Sanny menyerahkan keperawanannya pada pria asing. Sang kakak, Emma, mengetahui bahwa pria yang meniduri adiknya adalah CEO Grup Paragon, Hansen Yuwono. Emma mengaku di depan Hansen bahwa dialah wanita yang tidur dengannya pada malam itu.Siapa sangka, takdir justru mendekatkan Sanny dengan Hansen kembali. Sanny bekerja di perusahaan Hansen sebagai pengacara. Cinta pun kembali tumbuh di antara mereka berdua.",
          "tags": [
            "Salah Identitas",
            "CEO",
            "Pengacara",
            "Cinta Pandangan Pertama",
            "Kesempatan Kedua",
            "Modern"
          ],
          "tagV3s": [
            {
              "tagId": 1403,
              "tagName": "Salah Identitas",
              "tagEnName": "Mistaken Identity"
            },
            {
              "tagId": 1362,
              "tagName": "CEO",
              "tagEnName": "Billionaire"
            },
            {
              "tagId": 1442,
              "tagName": "Pengacara",
              "tagEnName": "Lawyer"
            },
            {
              "tagId": 1384,
              "tagName": "Cinta Pandangan Pertama",
              "tagEnName": "Love at First Sight"
            },
            {
              "tagId": 1392,
              "tagName": "Kesempatan Kedua",
              "tagEnName": "Second Chance"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "15.2M",
          "bookShelfTime": 1740475384000,
          "shelfTime": "2026-04-28 17:18:17",
          "inLibrary": false
        },
        {
          "bookId": "41000113000",
          "bookName": "Abadi dalam Waktu",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000113000/41000113000.jpg?t=1741066494064",
          "chapterCount": 77,
          "introduction": "Orang paling berkuasa di Kota Jata, Arman, akan segera meninggal dunia. Namun, sebelum pergi, ada seseorang yang dia rindukan, membuatnya enggan mengembuskan napas terakhir. Saat itu, seorang wanita cantik jelita bernama Nadira mengetuk pintu rumah Keluarga Candra. Keluarga Candra mengira dia adalah keturunan dari orang yang dicintai Tuan Arman. Namun, ketika Nadira bertemu dengan Tuan Arman, Tuan Arman mengungkapkan kebenaran yang mengejutkan.",
          "tags": [
            "Pembalikan Identitas",
            "Intrik Keluarga",
            "Wanita Karier",
            "Modern",
            "Wanita Kuat"
          ],
          "tagV3s": [
            {
              "tagId": 1395,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1411,
              "tagName": "Intrik Keluarga",
              "tagEnName": "Family Intrigue"
            },
            {
              "tagId": 1375,
              "tagName": "Wanita Karier",
              "tagEnName": "Career Woman"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1361,
              "tagName": "Wanita Kuat",
              "tagEnName": "Strong Heroine"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "16.9M",
          "bookShelfTime": 1741071825000,
          "shelfTime": "2025-03-04 15:03:45",
          "inLibrary": false
        },
        {
          "bookId": "41000102444",
          "bookName": "Singgasana Bayangan",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000102444/41000102444.jpg?t=1709107635977",
          "chapterCount": 142,
          "introduction": "Felix Young, yang dikenal sebagai Yang Mulia secara diam-diam mendukung istrinya, Madison Xavier, untuk mencapai posisi jabatan yang lebih tinggi. Namun, pada hari Madison diangkat sebagai Dewa Perang, Madison mengajukan gugatan cerai. Terpukul, Felix bertekad untuk mendapatkan kembali segala sesuatu yang pernah dia berikan padanya.",
          "tags": [
            "Serangan Balik",
            "Balas Dendam",
            "Bangsawan",
            "Dewa Perang",
            "Modern",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1340,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1327,
              "tagName": "Bangsawan",
              "tagEnName": "Royalty"
            },
            {
              "tagId": 1330,
              "tagName": "Dewa Perang",
              "tagEnName": "War God"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "国内翻译",
            "中国",
            "真人剧"
          ],
          "performerIdList": [
            21397
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "42.1M",
          "bookShelfTime": 1709109633000,
          "shelfTime": "2024-02-28 16:40:33",
          "inLibrary": false
        },
        {
          "bookId": "41000112488",
          "bookName": "Raja Kecurangan",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000112488/41000112488.jpg?t=1739860403220",
          "chapterCount": 75,
          "introduction": "Setelah menyaksikan kematian ayahnya karena berjudi, Leo belajar teknik curang dan memulai jalan anti-judi. Setelah selesai belajar, dia membujuk penggemar judi, Heru, untuk bergabung. Lalu, menantang pencuri wanita, Persik, untuk bergabung dengan dunia hitam. Kemudian, merekrut penggemar judi, John. Dia pun membentuk tim delapan ahli curang. Bisakah Leo mengetahui penyebab kematian ayahnya? Lalu, bisakah dengan lancar membalas dendam dan membawa orang jahat ke pengadilan?",
          "tags": [
            "Pembalikan Identitas",
            "Balas Dendam",
            "Orang Biasa",
            "Pemberontak",
            "Modern",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1338,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1331,
              "tagName": "Orang Biasa",
              "tagEnName": "A Nobody"
            },
            {
              "tagId": 1335,
              "tagName": "Pemberontak",
              "tagEnName": "Rebellious"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "27.5M",
          "bookShelfTime": 1739875741000,
          "shelfTime": "2025-02-18 18:49:01",
          "inLibrary": false
        },
        {
          "bookId": "41000112453",
          "bookName": "Anak Pembawa Rezeki Datang",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000112453/41000112453.jpg?t=1739780205312",
          "chapterCount": 80,
          "introduction": "Briel, anak pembawa rezeki dapat membawa keberuntungan. Namun, dia sering membuat masalah di Langit. Alhasil, Dewa Rezeki mengirimkannya ke dunia awam untuk berlatih diri. Dia ditugaskan untuk mengantarkan keberuntungan pada manusia. Sesampai di dunia, Briel gagal menjalankan tugasnya. Ketika dia hampir mati kelaparan, dia diselamatkan dan diadopsi oleh seorang CEO yang jatuh bangkrut, Mika Kardana. Sejak bertemu dengan Briel, Mika terus dilanda oleh keberuntungan...",
          "tags": [
            "Pembalikan Identitas",
            "Penebusan",
            "Bangkitnya Orang Biasa",
            "Fantasi",
            "Wanita Kuat"
          ],
          "tagV3s": [
            {
              "tagId": 1395,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1459,
              "tagName": "Penebusan",
              "tagEnName": "Redemption"
            },
            {
              "tagId": 1398,
              "tagName": "Bangkitnya Orang Biasa",
              "tagEnName": "Underdog Story"
            },
            {
              "tagId": 1355,
              "tagName": "Fantasi",
              "tagEnName": "Fantasy"
            },
            {
              "tagId": 1361,
              "tagName": "Wanita Kuat",
              "tagEnName": "Strong Heroine"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "16.7M",
          "bookShelfTime": 1739788195000,
          "shelfTime": "2025-02-17 18:29:55",
          "inLibrary": false
        },
        {
          "bookId": "41000112449",
          "bookName": "Ketika Hati yang Hilang Kembali",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000112449/41000112449.jpg?t=1739778825426",
          "chapterCount": 100,
          "introduction": "Raline adalah pengagum rahasia yang rendah, sementara Randy adalah pria tampan dan dingin yang hanya memiliki cinta pertamanya di matanya. Tak disangka, Randy berulang kali mendekat, membuat hati Raline yang tenang kembali bergelombang, sampai dia mendengar langsung kata-kata meremehkan Randy, \"Dia hanya gadis dari keluarga miskin, bagaimana aku bisa menyukainya.\" Raline pergi dengan hati hancur, tetapi Randy tidak tenang, memohon dengan merendahkan diri...",
          "tags": [
            "Perselingkuhan",
            "Playboy",
            "Cinta Segitiga",
            "Cinta Rahasia",
            "Musuh Jadi Kekasih",
            "Modern"
          ],
          "tagV3s": [
            {
              "tagId": 1400,
              "tagName": "Perselingkuhan",
              "tagEnName": "Betrayal"
            },
            {
              "tagId": 1366,
              "tagName": "Playboy",
              "tagEnName": "Playboy"
            },
            {
              "tagId": 1380,
              "tagName": "Cinta Segitiga",
              "tagEnName": "Love Triangle"
            },
            {
              "tagId": 1386,
              "tagName": "Cinta Rahasia",
              "tagEnName": "Secret Crush"
            },
            {
              "tagId": 1390,
              "tagName": "Musuh Jadi Kekasih",
              "tagEnName": "Enemy to Lover"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "19M",
          "bookShelfTime": 1739787105000,
          "shelfTime": "2025-02-17 18:11:45",
          "inLibrary": false
        },
        {
          "bookId": "41000111771",
          "bookName": "Pesona Istri Manis Sang CEO",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000111771/41000111771.jpg?t=1737707779820",
          "chapterCount": 80,
          "introduction": "Shayna dan Darren secara tidak sengaja berhubungan dan menghasilkan seorang anak bernama Felix. Enam tahun kemudian, Darren mengetahuinya dan mulai mencari anak tersebut. Selama waktu itu, hubungan Shayna dengan Darren di Grup Agusta makin dekat, dan secara perlahan perasaan cinta mulai tumbuh di hati Shayna. Felix akhirnya diakui sebagai anak kandung Darren dan kembali ke keluarga besar, sementara Shayna pun hidup berkecukupan.",
          "tags": [
            "Kabur Saat Hamil",
            "Keluarga",
            "CEO",
            "Wanita Mandiri",
            "Cinta Setelah Menikah",
            "Modern"
          ],
          "tagV3s": [
            {
              "tagId": 1397,
              "tagName": "Kabur Saat Hamil",
              "tagEnName": "Secret Baby"
            },
            {
              "tagId": 1408,
              "tagName": "Keluarga",
              "tagEnName": "Family Bonds"
            },
            {
              "tagId": 1362,
              "tagName": "CEO",
              "tagEnName": "Billionaire"
            },
            {
              "tagId": 1452,
              "tagName": "Wanita Mandiri",
              "tagEnName": "Independent Woman"
            },
            {
              "tagId": 1393,
              "tagName": "Cinta Setelah Menikah",
              "tagEnName": "Love After Marriage"
            },
            {
              "tagId": 1352,
              "tagName": "Modern",
              "tagEnName": "Modern"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "54.1M",
          "bookShelfTime": 1737711620000,
          "shelfTime": "2026-03-19 17:19:30",
          "inLibrary": false
        },
        {
          "bookId": "41000110705",
          "bookName": "Rahasia di Balik Orang Tua Sederhana",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000110705/41000110705.jpg?t=1736391578945",
          "chapterCount": 89,
          "introduction": "Setelah melalui perjuangan yang panjang, pasangan terkaya, Doni Luberto dan Hanna Jiandra, akhirnya berhasil menemukan putra mereka, Yudha Luberto, yang hilang selama bertahun-tahun. Untuk menguji karakter putra mereka, keduanya menyamar sebagai pekerja biasa saat bertemu kembali. Tak disangka, Yudha sama sekali tidak keberatan dan bahkan mengajak mereka bertemu dengan kekasihnya, Jessy Fabian. Namun, keluarga Fabian justru meremehkan mereka...",
          "tags": [
            "Pembalikan Identitas",
            "Keluarga",
            "Orang Biasa",
            "Modern",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1338,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1348,
              "tagName": "Keluarga",
              "tagEnName": "Family Bonds"
            },
            {
              "tagId": 1331,
              "tagName": "Orang Biasa",
              "tagEnName": "A Nobody"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "引入",
            "中国",
            "国内翻译",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "28M",
          "bookShelfTime": 1736417403000,
          "shelfTime": "2025-01-09 18:10:03",
          "inLibrary": false
        },
        {
          "bookId": "41000108535",
          "bookName": "Sang Penguasa yang Bangkit (Sulih Suara)",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000108535/41000108535.jpg?t=1733205805800",
          "chapterCount": 98,
          "introduction": "Ada desas-desus bahwa jika seseorang berhasil mendapatkan restu dari Lord Cloud, dia akan menjadi seorang yang terhormat. Tiga puluh tahun sebelumnya, Lars Baxter diberitahu bahwa jika seseorang meremehkannya, dia harus melawan dan memberi tahu mereka bahwa dia bukanlah orang yang bisa diremehkan, tetapi seorang pria yang harus dihormati!",
          "tags": [
            "Balas Dendam",
            "Serangan Balik",
            "Tokoh Legendaris",
            "Modern",
            "Pria Dominan"
          ],
          "tagV3s": [
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1340,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1332,
              "tagName": "Tokoh Legendaris",
              "tagEnName": "Divine Tycoon"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            },
            {
              "tagId": 1323,
              "tagName": "Pria Dominan",
              "tagEnName": "Powerful Male Lead"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "配音剧",
            "中国",
            "国内翻译",
            "引入",
            "真人剧"
          ],
          "performerIdList": [
            20046,
            21507
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "47.4M",
          "bookShelfTime": 1733217979000,
          "shelfTime": "2024-12-03 17:26:19",
          "inLibrary": false
        },
        {
          "bookId": "41000108364",
          "bookName": "Kembalinya Sang Putra Pewaris (Sulih Suara)",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000108364/41000108364.jpg?t=1732776536765",
          "chapterCount": 96,
          "introduction": "Tommy Lutfi merancang sebuah paten dan memberikannya kepada tunangannya. Dia ingin tunangannya mendapatkan penghargaan dari Grup Tirtajaya. Namun, saat upacara penghargaan, Tommy harus menelan pil pahit. Tunangannya telah mengkhianatinya. Bahkan, untuk menyenangkan seorang pria kaya, tunangannya berniat melukai Tommy. Pada saat yang kritis, ketua Grup Tirtajaya dan mengungkapkan sebuah rahasia mengejutkan bahwa Tommy adalah putra kandungnya yang telah lama hilang.",
          "tags": [
            "Balas Dendam",
            "Pembalikan Identitas",
            "Perselingkuhan",
            "Bangsawan",
            "Kekuatan Khusus",
            "Modern"
          ],
          "tagV3s": [
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1338,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1341,
              "tagName": "Perselingkuhan",
              "tagEnName": "Betrayal"
            },
            {
              "tagId": 1327,
              "tagName": "Bangsawan",
              "tagEnName": "Royalty"
            },
            {
              "tagId": 1334,
              "tagName": "Kekuatan Khusus",
              "tagEnName": "The Chosen One"
            },
            {
              "tagId": 1318,
              "tagName": "Modern",
              "tagEnName": "Modern"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "印尼语",
            "配音剧",
            "中国",
            "国内翻译",
            "引入",
            "真人剧"
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "52.5M",
          "bookShelfTime": 1732849381000,
          "shelfTime": "2024-11-29 11:03:01",
          "inLibrary": false
        },
        {
          "bookId": "41000102734",
          "bookName": "Legenda Tak Terkalahkan",
          "coverWap": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000102734/41000102734.jpg?t=1710295633186",
          "chapterCount": 94,
          "introduction": "Sebagai pewaris Istana Nagar, Tyler Ellis tinggal di sisi Kaia Clarke sebagai seorang pria biasa untuk membalas budi karena telah menyelamatkan nyawanya di masa lalu. Dia membantu dan mendukung keluarga Clarke, tetapi setelah Kaia naik ke status yang lebih tinggi, dia berusaha untuk bercerai dengannya. Tanpa disangka, suami yang ia benci itu memiliki pengaruh atas tokoh-tokoh berpengaruh.",
          "tags": [
            "Balas Dendam",
            "Pembalikan Identitas",
            "Serangan Balik",
            "Bangsawan",
            "Pura-Pura Bodoh",
            "Kekuatan Khusus"
          ],
          "tagV3s": [
            {
              "tagId": 1337,
              "tagName": "Balas Dendam",
              "tagEnName": "Revenge"
            },
            {
              "tagId": 1338,
              "tagName": "Pembalikan Identitas",
              "tagEnName": "Hidden Identity"
            },
            {
              "tagId": 1340,
              "tagName": "Serangan Balik",
              "tagEnName": "Counterattack"
            },
            {
              "tagId": 1327,
              "tagName": "Bangsawan",
              "tagEnName": "Royalty"
            },
            {
              "tagId": 1333,
              "tagName": "Pura-Pura Bodoh",
              "tagEnName": "Playing Dumb"
            },
            {
              "tagId": 1334,
              "tagName": "Kekuatan Khusus",
              "tagEnName": "The Chosen One"
            }
          ],
          "isEntry": 0,
          "index": 0,
          "corner": {
            "cornerType": 4,
            "name": "Anggota Saja",
            "color": "#4D65ED"
          },
          "markNames": [
            "引入",
            "国内翻译",
            "真人剧",
            "印尼语",
            "中国"
          ],
          "performerIdList": [
            20876,
            21507
          ],
          "dataFrom": "运营",
          "cardType": 1,
          "markNamesConnectKey": ", ",
          "playCount": "48.2M",
          "bookShelfTime": 1710300678000,
          "shelfTime": "2024-03-13 11:31:18",
          "inLibrary": false
        }
      ],
      "type": 3
    }
  ],
  "meta": {
    "index": 4,
    "timestamp": "2026-09-27T23:57:31.660Z"
  }
}

Dramabox Detail

const axios = require("axios");

const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/dramabox/detail?apikey=ahmuqkey&bookId=42000028264",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "data": {
    "bookStatus": 1,
    "corner": {
      "cornerType": 6,
      "name": "Terpopuler",
      "color": "#F54E96"
    },
    "crossChapter": true,
    "crossChapterTips": "Masih ada episode yang belum dibuka, jangan sampai ketinggalan!",
    "list": [
      {
        "chapterId": "701647340",
        "chapterIndex": 0,
        "isCharge": 0,
        "isPay": 0,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 17113
          },
          {
            "quality": 1080,
            "size": 25669
          },
          {
            "quality": 540,
            "size": 12834
          },
          {
            "quality": 360,
            "size": 8556
          },
          {
            "quality": 144,
            "size": 3422
          }
        ]
      },
      {
        "chapterId": "701647341",
        "chapterIndex": 1,
        "isCharge": 0,
        "isPay": 0,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 6518
          },
          {
            "quality": 1080,
            "size": 9777
          },
          {
            "quality": 540,
            "size": 4888
          },
          {
            "quality": 360,
            "size": 3259
          },
          {
            "quality": 144,
            "size": 1303
          }
        ]
      },
      {
        "chapterId": "701647342",
        "chapterIndex": 2,
        "isCharge": 0,
        "isPay": 0,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 7902
          },
          {
            "quality": 1080,
            "size": 11853
          },
          {
            "quality": 540,
            "size": 5926
          },
          {
            "quality": 360,
            "size": 3951
          },
          {
            "quality": 144,
            "size": 1580
          }
        ]
      },
      {
        "chapterId": "701647343",
        "chapterIndex": 3,
        "isCharge": 0,
        "isPay": 0,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 7223
          },
          {
            "quality": 1080,
            "size": 10834
          },
          {
            "quality": 540,
            "size": 5417
          },
          {
            "quality": 360,
            "size": 3611
          },
          {
            "quality": 144,
            "size": 1444
          }
        ]
      },
      {
        "chapterId": "701647344",
        "chapterIndex": 4,
        "isCharge": 0,
        "isPay": 0,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 10236
          },
          {
            "quality": 1080,
            "size": 15354
          },
          {
            "quality": 540,
            "size": 7677
          },
          {
            "quality": 360,
            "size": 5118
          },
          {
            "quality": 144,
            "size": 2047
          }
        ]
      },
      {
        "chapterId": "701647345",
        "chapterIndex": 5,
        "isCharge": 0,
        "isPay": 0,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 4826
          },
          {
            "quality": 1080,
            "size": 7239
          },
          {
            "quality": 540,
            "size": 3619
          },
          {
            "quality": 360,
            "size": 2413
          },
          {
            "quality": 144,
            "size": 965
          }
        ]
      },
      {
        "chapterId": "701647346",
        "chapterIndex": 6,
        "isCharge": 0,
        "isPay": 0,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 4139
          },
          {
            "quality": 1080,
            "size": 6208
          },
          {
            "quality": 540,
            "size": 3104
          },
          {
            "quality": 360,
            "size": 2069
          },
          {
            "quality": 144,
            "size": 827
          }
        ]
      },
      {
        "chapterId": "701647347",
        "chapterIndex": 7,
        "isCharge": 0,
        "isPay": 0,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 5405
          },
          {
            "quality": 1080,
            "size": 8107
          },
          {
            "quality": 540,
            "size": 4053
          },
          {
            "quality": 360,
            "size": 2702
          },
          {
            "quality": 144,
            "size": 1081
          }
        ]
      },
      {
        "chapterId": "701647348",
        "chapterIndex": 8,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 3483
          },
          {
            "quality": 1080,
            "size": 5224
          },
          {
            "quality": 540,
            "size": 2612
          },
          {
            "quality": 360,
            "size": 1741
          },
          {
            "quality": 144,
            "size": 696
          }
        ]
      },
      {
        "chapterId": "701647349",
        "chapterIndex": 9,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 4468
          },
          {
            "quality": 1080,
            "size": 6702
          },
          {
            "quality": 540,
            "size": 3351
          },
          {
            "quality": 360,
            "size": 2234
          },
          {
            "quality": 144,
            "size": 893
          }
        ]
      },
      {
        "chapterId": "701647350",
        "chapterIndex": 10,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 5891
          },
          {
            "quality": 1080,
            "size": 8836
          },
          {
            "quality": 540,
            "size": 4418
          },
          {
            "quality": 360,
            "size": 2945
          },
          {
            "quality": 144,
            "size": 1178
          }
        ]
      },
      {
        "chapterId": "701647351",
        "chapterIndex": 11,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 5112
          },
          {
            "quality": 1080,
            "size": 7668
          },
          {
            "quality": 540,
            "size": 3834
          },
          {
            "quality": 360,
            "size": 2556
          },
          {
            "quality": 144,
            "size": 1022
          }
        ]
      },
      {
        "chapterId": "701647352",
        "chapterIndex": 12,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 5476
          },
          {
            "quality": 1080,
            "size": 8214
          },
          {
            "quality": 540,
            "size": 4107
          },
          {
            "quality": 360,
            "size": 2738
          },
          {
            "quality": 144,
            "size": 1095
          }
        ]
      },
      {
        "chapterId": "701647353",
        "chapterIndex": 13,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 6491
          },
          {
            "quality": 1080,
            "size": 9736
          },
          {
            "quality": 540,
            "size": 4868
          },
          {
            "quality": 360,
            "size": 3245
          },
          {
            "quality": 144,
            "size": 1298
          }
        ]
      },
      {
        "chapterId": "701647354",
        "chapterIndex": 14,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 5767
          },
          {
            "quality": 1080,
            "size": 8650
          },
          {
            "quality": 540,
            "size": 4325
          },
          {
            "quality": 360,
            "size": 2883
          },
          {
            "quality": 144,
            "size": 1153
          }
        ]
      },
      {
        "chapterId": "701647355",
        "chapterIndex": 15,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 4436
          },
          {
            "quality": 1080,
            "size": 6654
          },
          {
            "quality": 540,
            "size": 3327
          },
          {
            "quality": 360,
            "size": 2218
          },
          {
            "quality": 144,
            "size": 887
          }
        ]
      },
      {
        "chapterId": "701647356",
        "chapterIndex": 16,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 4668
          },
          {
            "quality": 1080,
            "size": 7002
          },
          {
            "quality": 540,
            "size": 3501
          },
          {
            "quality": 360,
            "size": 2334
          },
          {
            "quality": 144,
            "size": 933
          }
        ]
      },
      {
        "chapterId": "701647357",
        "chapterIndex": 17,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 4219
          },
          {
            "quality": 1080,
            "size": 6328
          },
          {
            "quality": 540,
            "size": 3164
          },
          {
            "quality": 360,
            "size": 2109
          },
          {
            "quality": 144,
            "size": 843
          }
        ]
      },
      {
        "chapterId": "701647358",
        "chapterIndex": 18,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 6369
          },
          {
            "quality": 1080,
            "size": 9553
          },
          {
            "quality": 540,
            "size": 4776
          },
          {
            "quality": 360,
            "size": 3184
          },
          {
            "quality": 144,
            "size": 1273
          }
        ]
      },
      {
        "chapterId": "701647359",
        "chapterIndex": 19,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 5738
          },
          {
            "quality": 1080,
            "size": 8607
          },
          {
            "quality": 540,
            "size": 4303
          },
          {
            "quality": 360,
            "size": 2869
          },
          {
            "quality": 144,
            "size": 1147
          }
        ]
      },
      {
        "chapterId": "701647360",
        "chapterIndex": 20,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 5291
          },
          {
            "quality": 1080,
            "size": 7936
          },
          {
            "quality": 540,
            "size": 3968
          },
          {
            "quality": 360,
            "size": 2645
          },
          {
            "quality": 144,
            "size": 1058
          }
        ]
      },
      {
        "chapterId": "701647361",
        "chapterIndex": 21,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 5818
          },
          {
            "quality": 1080,
            "size": 8727
          },
          {
            "quality": 540,
            "size": 4363
          },
          {
            "quality": 360,
            "size": 2909
          },
          {
            "quality": 144,
            "size": 1163
          }
        ]
      },
      {
        "chapterId": "701647362",
        "chapterIndex": 22,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 5168
          },
          {
            "quality": 1080,
            "size": 7752
          },
          {
            "quality": 540,
            "size": 3876
          },
          {
            "quality": 360,
            "size": 2584
          },
          {
            "quality": 144,
            "size": 1033
          }
        ]
      },
      {
        "chapterId": "701647363",
        "chapterIndex": 23,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 5715
          },
          {
            "quality": 1080,
            "size": 8572
          },
          {
            "quality": 540,
            "size": 4286
          },
          {
            "quality": 360,
            "size": 2857
          },
          {
            "quality": 144,
            "size": 1143
          }
        ]
      },
      {
        "chapterId": "701647364",
        "chapterIndex": 24,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 3693
          },
          {
            "quality": 1080,
            "size": 5539
          },
          {
            "quality": 540,
            "size": 2769
          },
          {
            "quality": 360,
            "size": 1846
          },
          {
            "quality": 144,
            "size": 738
          }
        ]
      },
      {
        "chapterId": "701647365",
        "chapterIndex": 25,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 3891
          },
          {
            "quality": 1080,
            "size": 5836
          },
          {
            "quality": 540,
            "size": 2918
          },
          {
            "quality": 360,
            "size": 1945
          },
          {
            "quality": 144,
            "size": 778
          }
        ]
      },
      {
        "chapterId": "701647366",
        "chapterIndex": 26,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 4203
          },
          {
            "quality": 1080,
            "size": 6304
          },
          {
            "quality": 540,
            "size": 3152
          },
          {
            "quality": 360,
            "size": 2101
          },
          {
            "quality": 144,
            "size": 840
          }
        ]
      },
      {
        "chapterId": "701647367",
        "chapterIndex": 27,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 3700
          },
          {
            "quality": 1080,
            "size": 5550
          },
          {
            "quality": 540,
            "size": 2775
          },
          {
            "quality": 360,
            "size": 1850
          },
          {
            "quality": 144,
            "size": 740
          }
        ]
      },
      {
        "chapterId": "701647368",
        "chapterIndex": 28,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 3987
          },
          {
            "quality": 1080,
            "size": 5980
          },
          {
            "quality": 540,
            "size": 2990
          },
          {
            "quality": 360,
            "size": 1993
          },
          {
            "quality": 144,
            "size": 797
          }
        ]
      },
      {
        "chapterId": "701647369",
        "chapterIndex": 29,
        "isCharge": 1,
        "isPay": 1,
        "chapterSizeVoList": [
          {
            "quality": 720,
            "size": 8309
          },
          {
            "quality": 1080,
            "size": 12463
          },
          {
            "quality": 540,
            "size": 6231
          },
          {
            "quality": 360,
            "size": 4154
          },
          {
            "quality": 144,
            "size": 1661
          }
        ]
      }
    ],
    "downLoadQuality": [
      {
        "quality": 720,
        "isVipEquity": 0
      },
      {
        "quality": 1080,
        "isVipEquity": 1
      },
      {
        "quality": 540,
        "isVipEquity": 0
      }
    ],
    "membershipUiTestInfo": {
      "lockUi": 1,
      "appIconAndBottomNavUi": 1
    },
    "aiChatSwitch": 0,
    "ratingConf": {
      "showRate": false,
      "rate": "4.9",
      "ratingCount": "299",
      "rated": false,
      "rateQualified": false,
      "notQualifiedTip": "Silakan beri rating setelah menonton 3 episode",
      "configStructComment": [
        [
          {
            "index": 0,
            "id": 457,
            "comment": "Cerita buruk"
          },
          {
            "index": 1,
            "id": 462,
            "comment": "Akting buruk"
          },
          {
            "index": 2,
            "id": 467,
            "comment": "Dubbing buruk"
          },
          {
            "index": 3,
            "id": 472,
            "comment": "Subtitle banyak kesalahan"
          }
        ],
        [
          {
            "index": 0,
            "id": 456,
            "comment": "Cerita lemah"
          },
          {
            "index": 1,
            "id": 461,
            "comment": "Akting kaku"
          },
          {
            "index": 2,
            "id": 466,
            "comment": "Dubbing kurang"
          },
          {
            "index": 3,
            "id": 471,
            "comment": "Subtitle ada beberapa kesalahan"
          }
        ],
        [
          {
            "index": 0,
            "id": 455,
            "comment": "Cerita biasa"
          },
          {
            "index": 1,
            "id": 460,
            "comment": "Akting standar"
          },
          {
            "index": 2,
            "id": 465,
            "comment": "Dubbing standar"
          },
          {
            "index": 3,
            "id": 470,
            "comment": "Subtitle bisa digunakan"
          }
        ],
        [
          {
            "index": 0,
            "id": 454,
            "comment": "Cerita bagus"
          },
          {
            "index": 1,
            "id": 459,
            "comment": "Akting baik"
          },
          {
            "index": 2,
            "id": 464,
            "comment": "Dubbing bagus"
          },
          {
            "index": 3,
            "id": 469,
            "comment": "Subtitle akurat"
          }
        ],
        [
          {
            "index": 0,
            "id": 453,
            "comment": "Cerita seru"
          },
          {
            "index": 1,
            "id": 459,
            "comment": "Akting baik"
          },
          {
            "index": 2,
            "id": 463,
            "comment": "Dubbing terasa hidup"
          },
          {
            "index": 3,
            "id": 468,
            "comment": "Subtitle sempurna"
          }
        ]
      ],
      "ratingOne": 2,
      "ratingTwo": 0,
      "ratingThree": 2,
      "ratingFour": 18,
      "ratingFive": 277
    }
  },
  "meta": {
    "bookId": "42000028264",
    "timestamp": "2026-09-27T23:58:43.683Z"
  }
}

Dramabox Chapters
bookId
*
string
42000028264
getAll
*
string
true

const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/dramabox/chapters?apikey=ahmuqkey&bookId=42000028264&getAll=true",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

Drama Box Search
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/dramabox/search?apikey=ahmuqkey&keyword=boss",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "data": [
    {
      "bookId": "42000016921",
      "bookName": "Boss Let Me Go",
      "introduction": "After a one-night encounter with Kevin, Crystal flees, only to discover he's her new boss. Misunderstandings lead her to become his secretary. When she becomes pregnant and tries to resign, her plans fail. Her best friend i mpersonates Crystal to approach Kevin, creating tensions. Despite repeated conflicts, the two resolve misunderstandings and confess their love.",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000016921/42000016921.jpg?t=1781774867453&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Kevin,  Crystal",
      "tagNames": [
        "Romance"
      ],
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617228\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    },
    {
      "bookId": "42000012553",
      "bookName": "Boss Up, My CEO!",
      "introduction": "Can't marry that timid guy from back then, what should I do? Let's just transform (torture) him into my ideal type.",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000012553/42000012553.jpg?t=1779181816816&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Damien Brute,  Eleanor Hilton",
      "tagNames": [
        "Romance",
        "Underdog Story",
        "Independent Woman",
        "Second Chance",
        "Love After Marriage",
        "Modern"
      ],
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617228\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    },
    {
      "bookId": "42000010126",
      "bookName": "Boss, Please don't ..!",
      "introduction": "Because of her grandmother's life-saving grace, Lacey has been paying for her grandmother's high medical expenses after she became a vegetable. She did everything she could to achieve this. After dressing up as a man to test whether a client's fiancé is gay, she accidentally helped the president of SCP solve a blind date crisis. In order to continue to have a high income, Lacey found Oni again. ",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000010126/42000010126.jpg?t=1776928945852&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Oni Reinhardt,  Lacey Victor",
      "tagNames": [
        "Family Bonds",
        "Billionaire",
        "Contract Lover",
        "BG"
      ],
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617229\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    },
    {
      "bookId": "42000000469",
      "bookName": "Boss, You're Busted!",
      "introduction": "After her ex Jack's betrayal left 24-year-old Emma without her child—or her ability to have another—she reinvented herself as a \"Scumbag Slayer,\" taking down corrupt rich men in the shadows. But when her operations racked up $25M in damages to tycoon Arthur's hotels, he cornered her with a deal: a fake marriage to help him ruin his upcoming society wedding.",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000000469/42000000469.jpg?t=1763521603713&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Arthur Wilson,  Emma Nelson",
      "tagNames": [
        "Revenge",
        "Hidden Identity",
        "Contract Lover",
        "Strong Heroine",
        "Romance",
        "Betrayal"
      ],
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617229\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    },
    {
      "bookId": "42000004139",
      "bookName": "Boss, She Said No Again!",
      "introduction": "Abandoned for sixteen years, Rowena returns to New York to reclaim her mother's inheritance. Posing as the Kingsley second son's fiancée, she plans a breakup as cover. But she saves Damien Kingsley, the Kingsley's elder son, from a mafia attack. Intrigued, Damien forces into her life. As Rowena navigates traps from her scheming family and ruthless Mrs. Kingsley, her bond with Damien shifts from enemies to allies as they uncover the truth behind a mysterious murder.",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000004139/42000004139.jpg?t=1768902103253&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Damien Kingsley,  Rowena Thorne",
      "tagNames": [
        "Billionaire",
        "Forbidden Love",
        "Counterattack",
        "Romance",
        "Modern",
        "BG"
      ],
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617229\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    },
    {
      "bookId": "42000019072",
      "bookName": "Boss That Isn’t Your Baby",
      "introduction": "Six years ago, after a one-night stand, Ella left behind Ethan's watch. Six years later, Ethan sent someone to find the woman from that night. Ella's sister, Eleanor, found the watch and seized the opportunity to impersonate her, moving into Ethan's estate with her son. To fight for custody of the child, Ethan hired top-tier lawyer Ella at a high salary, and during their time working together, he gradually developed feelings for her.",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000019072/42000019072.jpg?t=1782729385964&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Ethan,   Ella",
      "tagNames": [
        "Secret Baby",
        "Mistaken Identity",
        "Billionaire",
        "Lawyer",
        "One Night Stand",
        "Love After Marriage"
      ],
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617229\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    },
    {
      "bookId": "42000006708",
      "bookName": "Boss, Elle A Encore Dit Non !",
      "introduction": "Seize ans après avoir quitté New York, Roxanne Therval revient pour récupérer l'héritage de sa mère. Elle feint des fiançailles avec le cadet des Sinclair afin de mener son plan à bien. Mais en sauvant Daniel Sinclair, l'aîné, d'un attentat, elle déclenche une chaîne d'événements incontrôlables. Fasciné, Daniel s'impose dans sa vie. Entre complots familiaux et secrets enfouis, ils passent d'ennemis à alliés pour faire la lumière sur un meurtre ancien.",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000006708/42000006708.jpg?t=1772263655360&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Daniel Sinclair, Roxanne Therval",
      "tagNames": [
        "De l’ennemi à l’amant",
        "Contre-attaque",
        "Rebelle",
        "Intrigue Familiale",
        "PDG",
        "Volonté Forte"
      ],
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617229\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    },
    {
      "bookId": "42000026512",
      "bookName": "Boss, Your Wolf Secret Is Out!",
      "introduction": "A broke small-town perfumer agrees to a $50,000 marriage of convenience—only to discover her \"nobody\" husband is the werewolf king who married her for the scent that calms his beast.",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000026512/42000026512.jpg?t=1788427336732&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Lucien Ashcroft, Evelyn Reed",
      "tagNames": [
        "Hidden Identity",
        "Werewolf",
        "Secret Crush",
        "Supernatural",
        "Romance",
        "BG"
      ],
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617229\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    },
    {
      "bookId": "42000009203",
      "bookName": "Boss, Your Ex-Con Bride Is Back ",
      "introduction": "Framed and jailed, Evelyn hides Lucien's son to protect him. Six years later, they reunite and battle betrayal, custody threats, and a scheming rival for love and family. ",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000009203/42000009203.jpg?t=1775532320354&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Lucien Lowell,  Evelyn Langley",
      "tagNames": [
        "Second Chance",
        "Secret Baby",
        "Romance",
        "Modern",
        "BG"
      ],
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617229\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    },
    {
      "bookId": "42000004540",
      "bookName": "Boss Behind the Scenes Is My Husband",
      "introduction": "Holy moly! How could my husband be the most powerful person on earth?",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000004540/42000004540.jpg?t=1769736849937&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Annie,  Jude",
      "tagNames": [
        "Family Bonds",
        "Hidden Identity",
        "Forced Love",
        "Billionaire",
        "Second Chance"
      ],
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617229\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    },
    {
      "bookId": "42000001834",
      "bookName": "Boss, Your Executive Secretary has Resigned",
      "introduction": "Anne deeply in love with the Jackson, gives up her position as chief jewelry designer to become his personal secretary and secret lover, until she witnesses the Jackson and his first love Melissa being carried naked into an ambulance after carbon monoxide poisoning. After handling the situation, she decides to resign and return to her career.",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x2/42x0/420x0/42000001834/42000001834.jpg?t=1766473413266&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Jackson Winslow,  Anne Faulkner",
      "tagNames": [
        "Hidden Identity",
        "Counterattack",
        "Winning Her Back",
        "Toxic Love",
        "Second Chance",
        "Secret Crush"
      ],
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617229\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    },
    {
      "bookId": "41000111946",
      "bookName": "Boss! U Almost Got Her",
      "introduction": "When childhood sweethearts arrange to reunite at a bridal shop after twenty years apart, a manipulative best friend steals the bride's place and her billionaire groom. Now working as his secretary, the real bride must navigate growing feelings for her boss while unaware he's her long-lost love - even as her friend rushes them toward a wedding built on lies.",
      "author": "",
      "cover": "https://hwztchapter.dramaboxdb.com/data/cppartner/4x1/41x0/410x0/41000111946/41000111946.jpg?t=1739258026649&image_process=resize,h_300",
      "inLibraryCount": 0,
      "bookSource": {
        "sceneId": "ovs_vd_suggest_reco",
        "expId": "bigdata_rec",
        "strategyId": "g7vu1ofq",
        "strategyName": "",
        "log_id": "7b74a64be18fdbb9425cbc4912d7fa86"
      },
      "sort": 0,
      "protagonist": "Clyde Croft, Elise",
      "tagNames": [
        "Hidden Identity",
        "Revenge",
        "Betrayal",
        "Mistaken Identity",
        "Billionaire",
        "Innocent Damsel"
      ],
      "corner": {
        "cornerType": 4,
        "name": "Anggota Saja",
        "color": ""
      },
      "markNamesConnectKey": ", ",
      "algorithmRecomDot": "{\"log_id\":\"7b74a64be18fdbb9425cbc4912d7fa86\",\"ret_time\":\"1790553617229\",\"scene_id\":\"ovs_vd_suggest_reco\",\"rec_id\":\"bigdata_rec\"}",
      "inLibrary": false
    }
  ],
  "meta": {
    "keyword": "boss",
    "timestamp": "2026-09-28T00:00:17.319Z"
  }
}

