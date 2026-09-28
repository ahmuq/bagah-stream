ReelShort Detail
Parameters
bookId*
lang
select
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/reelshort/detail?apikey=ahmuqkey&bookId=6a0f8432be29f7108105f4f8&lang=id",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

respone
{
  "success": true,
  "bookId": "6a0f8432be29f7108105f4f8",
  "title": "I Accidentally Sexted My Enemy",
  "cover": "",
  "description": "",
  "totalEpisodes": 58,
  "chapters": [
    {
      "index": 1,
      "chapterId": "ktoixrickn",
      "title": "Episode 0",
      "isLocked": false,
      "serialNumber": "1"
    },
    {
      "index": 2,
      "chapterId": "myfmgrrtxa",
      "title": "Episode 1",
      "isLocked": false,
      "serialNumber": "1"
    },
    {
      "index": 3,
      "chapterId": "owz9fvyvt1",
      "title": "Episode 2",
      "isLocked": false,
      "serialNumber": "2"
    },
    {
      "index": 4,
      "chapterId": "3rhm67injc",
      "title": "Episode 3",
      "isLocked": false,
      "serialNumber": "3"
    },
    {
      "index": 5,
      "chapterId": "mwz7gshku1",
      "title": "Episode 4",
      "isLocked": false,
      "serialNumber": "4"
    },
    {
      "index": 6,
      "chapterId": "yrsuh0u5ee",
      "title": "Episode 5",
      "isLocked": false,
      "serialNumber": "5"
    },
    {
      "index": 7,
      "chapterId": "dfj3t2qk8z",
      "title": "Episode 6",
      "isLocked": false,
      "serialNumber": "6"
    },
    {
      "index": 8,
      "chapterId": "vhv65tpnmj",
      "title": "Episode 7",
      "isLocked": false,
      "serialNumber": "7"
    },
    {
      "index": 9,
      "chapterId": "kzjkqibozd",
      "title": "Episode 8",
      "isLocked": false,
      "serialNumber": "8"
    },
    {
      "index": 10,
      "chapterId": "mbo762mdnf",
      "title": "Episode 9",
      "isLocked": true,
      "serialNumber": "9"
    },
    {
      "index": 11,
      "chapterId": "cs6w4y3ri8",
      "title": "Episode 10",
      "isLocked": true,
      "serialNumber": "10"
    },
    {
      "index": 12,
      "chapterId": "7xbr9nq2ql",
      "title": "Episode 11",
      "isLocked": true,
      "serialNumber": "11"
    },
    {
      "index": 13,
      "chapterId": "8g4mjhotiz",
      "title": "Episode 12",
      "isLocked": true,
      "serialNumber": "12"
    },
    {
      "index": 14,
      "chapterId": "u9mxrvl6lz",
      "title": "Episode 13",
      "isLocked": true,
      "serialNumber": "13"
    },
    {
      "index": 15,
      "chapterId": "xqjtzy6jy9",
      "title": "Episode 14",
      "isLocked": true,
      "serialNumber": "14"
    },
    {
      "index": 16,
      "chapterId": "x2swqzbftx",
      "title": "Episode 15",
      "isLocked": true,
      "serialNumber": "15"
    },
    {
      "index": 17,
      "chapterId": "zssack65ab",
      "title": "Episode 16",
      "isLocked": true,
      "serialNumber": "16"
    },
    {
      "index": 18,
      "chapterId": "j429dph66q",
      "title": "Episode 17",
      "isLocked": true,
      "serialNumber": "17"
    },
    {
      "index": 19,
      "chapterId": "hpjnuqh9bv",
      "title": "Episode 18",
      "isLocked": true,
      "serialNumber": "18"
    },
    {
      "index": 20,
      "chapterId": "069yvyhq96",
      "title": "Episode 19",
      "isLocked": true,
      "serialNumber": "19"
    },
    {
      "index": 21,
      "chapterId": "xjc03k9j9e",
      "title": "Episode 20",
      "isLocked": true,
      "serialNumber": "20"
    },
    {
      "index": 22,
      "chapterId": "i6hqzz61qe",
      "title": "Episode 21",
      "isLocked": true,
      "serialNumber": "21"
    },
    {
      "index": 23,
      "chapterId": "xnq08fbu31",
      "title": "Episode 22",
      "isLocked": true,
      "serialNumber": "22"
    },
    {
      "index": 24,
      "chapterId": "jkl48tmc72",
      "title": "Episode 23",
      "isLocked": true,
      "serialNumber": "23"
    },
    {
      "index": 25,
      "chapterId": "ulh7qovoef",
      "title": "Episode 24",
      "isLocked": true,
      "serialNumber": "24"
    },
    {
      "index": 26,
      "chapterId": "jv9n23mr85",
      "title": "Episode 25",
      "isLocked": true,
      "serialNumber": "25"
    },
    {
      "index": 27,
      "chapterId": "00l1pues28",
      "title": "Episode 26",
      "isLocked": true,
      "serialNumber": "26"
    },
    {
      "index": 28,
      "chapterId": "rh6jcke2sb",
      "title": "Episode 27",
      "isLocked": true,
      "serialNumber": "27"
    },
    {
      "index": 29,
      "chapterId": "6rkd8tgetc",
      "title": "Episode 28",
      "isLocked": true,
      "serialNumber": "28"
    },
    {
      "index": 30,
      "chapterId": "954wr41aw0",
      "title": "Episode 29",
      "isLocked": true,
      "serialNumber": "29"
    },
    {
      "index": 31,
      "chapterId": "yru4bwgz1s",
      "title": "Episode 30",
      "isLocked": true,
      "serialNumber": "30"
    },
    {
      "index": 32,
      "chapterId": "l61y6avud0",
      "title": "Episode 31",
      "isLocked": true,
      "serialNumber": "31"
    },
    {
      "index": 33,
      "chapterId": "f0zwc8pp2t",
      "title": "Episode 32",
      "isLocked": true,
      "serialNumber": "32"
    },
    {
      "index": 34,
      "chapterId": "o1hakk1owr",
      "title": "Episode 33",
      "isLocked": true,
      "serialNumber": "33"
    },
    {
      "index": 35,
      "chapterId": "odqtqj55mt",
      "title": "Episode 34",
      "isLocked": true,
      "serialNumber": "34"
    },
    {
      "index": 36,
      "chapterId": "2z91a0zwuw",
      "title": "Episode 35",
      "isLocked": true,
      "serialNumber": "35"
    },
    {
      "index": 37,
      "chapterId": "k17dd5xq1v",
      "title": "Episode 36",
      "isLocked": true,
      "serialNumber": "36"
    },
    {
      "index": 38,
      "chapterId": "excdo79r5w",
      "title": "Episode 37",
      "isLocked": true,
      "serialNumber": "37"
    },
    {
      "index": 39,
      "chapterId": "ggirpwpxpf",
      "title": "Episode 38",
      "isLocked": true,
      "serialNumber": "38"
    },
    {
      "index": 40,
      "chapterId": "zrdzkhcnls",
      "title": "Episode 39",
      "isLocked": true,
      "serialNumber": "39"
    },
    {
      "index": 41,
      "chapterId": "afa1oqgboq",
      "title": "Episode 40",
      "isLocked": true,
      "serialNumber": "40"
    },
    {
      "index": 42,
      "chapterId": "73r1mlzmo8",
      "title": "Episode 41",
      "isLocked": true,
      "serialNumber": "41"
    },
    {
      "index": 43,
      "chapterId": "8f3704zm6f",
      "title": "Episode 42",
      "isLocked": true,
      "serialNumber": "42"
    },
    {
      "index": 44,
      "chapterId": "s9s7v17agb",
      "title": "Episode 43",
      "isLocked": true,
      "serialNumber": "43"
    },
    {
      "index": 45,
      "chapterId": "r4ienbclgz",
      "title": "Episode 44",
      "isLocked": true,
      "serialNumber": "44"
    },
    {
      "index": 46,
      "chapterId": "i2aohm5rsd",
      "title": "Episode 45",
      "isLocked": true,
      "serialNumber": "45"
    },
    {
      "index": 47,
      "chapterId": "ayt539hzfb",
      "title": "Episode 46",
      "isLocked": true,
      "serialNumber": "46"
    },
    {
      "index": 48,
      "chapterId": "33rezumezw",
      "title": "Episode 47",
      "isLocked": true,
      "serialNumber": "47"
    },
    {
      "index": 49,
      "chapterId": "cvo1euwesk",
      "title": "Episode 48",
      "isLocked": true,
      "serialNumber": "48"
    },
    {
      "index": 50,
      "chapterId": "8gmywnnrow",
      "title": "Episode 49",
      "isLocked": true,
      "serialNumber": "49"
    },
    {
      "index": 51,
      "chapterId": "swaqa881uy",
      "title": "Episode 50",
      "isLocked": true,
      "serialNumber": "50"
    },
    {
      "index": 52,
      "chapterId": "j1xy9l01g7",
      "title": "Episode 51",
      "isLocked": true,
      "serialNumber": "51"
    },
    {
      "index": 53,
      "chapterId": "04ihlzejjv",
      "title": "Episode 52",
      "isLocked": true,
      "serialNumber": "52"
    },
    {
      "index": 54,
      "chapterId": "dhgzihvqcr",
      "title": "Episode 53",
      "isLocked": true,
      "serialNumber": "53"
    },
    {
      "index": 55,
      "chapterId": "zg2tiiex3i",
      "title": "Episode 54",
      "isLocked": true,
      "serialNumber": "54"
    },
    {
      "index": 56,
      "chapterId": "dmalyzzw0w",
      "title": "Episode 55",
      "isLocked": true,
      "serialNumber": "55"
    },
    {
      "index": 57,
      "chapterId": "7s025c2kym",
      "title": "Episode 56",
      "isLocked": true,
      "serialNumber": "56"
    },
    {
      "index": 58,
      "chapterId": "4lce1jjukv",
      "title": "Episode 57",
      "isLocked": true,
      "serialNumber": "57"
    }
  ]
}

ReelShort Episode
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/reelshort/episode?apikey=ahmuqkey&bookId=6a0f8432be29f7108105f4f8&episode=1&lang=id",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);
{
  "success": true,
  "isLocked": false,
  "videoList": [
    {
      "url": "https://v-mps.crazymaplestudios.com/109ae5965a2771f18e28e7f6d44b0102/video/2014c2a405a34c3d8b1735c5eef1d50a-38632476b0de7c8d75bff1df3712145a-video-sd.m3u8",
      "encode": "H265",
      "quality": "720",
      "bitrate": "795.254"
    },
    {
      "url": "https://v-mps.crazymaplestudios.com/vod-112094/109ae5965a2771f18e28e7f6d44b0102/2014c2a405a34c3d8b1735c5eef1d50a-f14ca814dfb1d5d475700c4e78e336f3-ld.m3u8",
      "encode": "H264",
      "quality": "540",
      "bitrate": "1195.731"
    },
    {
      "url": "https://v-mps.crazymaplestudios.com/109ae5965a2771f18e28e7f6d44b0102/2014c2a405a34c3d8b1735c5eef1d50a.m3u8",
      "encode": "H265",
      "quality": "",
      "bitrate": "0"
    }
  ]
}

ReelShort For You
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/reelshort/foryou?apikey=ahmuqkey&page=1&lang=id",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);
respone
{
  "success": true,
  "page": 1,
  "data": {
    "lists": [
      {
        "lang": "in",
        "t_book_id": "504201150000006731",
        "book_title": "Menolak Lima Pasangan Wanitaku",
        "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504200150000006731/b3d67828-232c-4b00-8020-a9be57795c53.jpg",
        "special_desc": "Selama sepuluh tahun Caine yang yatim melindungi kelima putri dari ayah angkatnya, Alpha, percaya bahwa dia akan berjodoh dengan salah satu dari mereka. Namun kedatangan Seth, seorang begundal licik, menghancurkan dunianya. Dibutakan oleh tipu daya Seth, kelima saudari itu berbalik melawan Caine, dengan terus mempermalukan dan menjatuhkan harga dirinya demi memuaskan sang begundal. Dikecewakan oleh keluarga yang pernah dia sayangi, Caine menghadapi titik balik saat upacara penobatannya. Akankah sang kesatria perkasa terus membiarkan pengkhianatan mereka, atau dia akan memutus hubungan dengan mereka demi mencapai takdir yang lebih besar?",
        "share_text": "Dikhianati oleh kelima calon istrinya demi seorang begundal licik? Terdesak oleh situasi, saksikan bagaimana calon Raja Serigala melawan balik!",
        "book_type": 1,
        "screen_mode": 1,
        "is_preview": 0,
        "collect_count": 227022,
        "chapter_count": 50,
        "is_paid": 1,
        "publish_at": 1790081645,
        "book_id": "6aa69e2ff969ab813e03c177",
        "paid_start": 14,
        "book_share_url": "https://app.reelshort.com/app-video-share/6aa69e2ff969ab813e03c177",
        "start_play": {
          "screen_mode": 1,
          "chapter_id": "cusgeytbqf",
          "duration": 102,
          "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/2ed5773619722879.jpg",
          "video_type": 1,
          "chapter_index": 2,
          "episode_index": 1,
          "play_info": "UQjUu23sKeOmxW9rAUYvMtWrvWv2LRYZp4z8mKXhSCdFAbHElLJnD2gYLoh9pRWPon6qjFltjSssvpfaac1I27oO4lG/NAalGeQ4cWvfceivmhdhDkzEngrvMO3ETYSzgXDEUW6c7Sgbpkdg5XXCrz5a8Qw7RlB8OqLBR/zD1ycWN69zgU03BtJPe8MBfe0paT6l+0St6MWPi2IG1dn/B+gAugeHN/QzYa4x8awWXph39byYi/KnjT48hz0koZ/O2Rjb6S+WbAnqCqAcuF8bbwff7pryigF5B50PD8yaM/ZJxbT8FZDXexYDmgBVWoU9rf+SRplXeunHbbI/WLlN6iFhmYnPkAtkOOuEJfm13zWfbYyTQisnkof1LgGRYY0EizeajVkGcBkfx3ODV/7XMdgddjQlH3yOP9qCykSDv6BwoYUCbj9ac8AtYNrDXz39BnroUhDOyNpfv0onZVbMc5/9/gw9Yn7WHI/MEbpMFcuDEf2/JfRykpxhxQZhHE+CA1zQsARAfupno84Xnm9M0oDibhdKRMjgnouFvXrZqfG05vplmqffZtoytioky9n272XLu0FyUsQZM3/juIYXJOyVbnN/Tz4j896VT9YRaYAR3M5fskL5xVph761i40D1iVB61BvVUSAY34uFcWwfTA==",
          "adult_content_remind": 0,
          "aspect_ratio": 0.56,
          "vtt_lang": []
        },
        "chapter_id": "zj2iojyw77",
        "like_count": 3749,
        "video_id": "9000356fb72a71f199b0e6e7d77b0102",
        "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/bb91e9584c3563e1.jpg",
        "duration": 237,
        "video_type": 1,
        "serial_number": 1,
        "watch_recommend": false,
        "episode_index": 0,
        "video_level": 0,
        "play_info": "j4lVkXqGbjvFCBpqFoupLDvHUwPtPyghSRAcVsIuHUrLubth1OwdEw7TzTX/vT+/xCCk5pmyT/GwliOjrZHVseoR6XfOFWnneU/BWaoajvi8SU0R5XPDA9CBtX8gdH/6Cg9Al6yLc1LoU/G88LCNBaUfSwlQsdacbb7Tc9nEYMtRbRcRBqj3WzcFPHFZkxszA3R5mCi4Y6jSnt6qfKiQvT+MPzb/GTitK2DOCKo7RPtSQBy2z7eZ05PgqyXF3cd/lY6tAWrF5nQPEyBRWSwe9ujzmjR3Aqm+UWCpUJcpxnqQU26bDYEsZIwfs9hbe1mcZvZxyggd2qt+Y3QF8z2BogasmhrI4Qs1txVrcDJsBULj3Xtym/Md9JFVgTO6/lz3F1pr+diLUYlzGRJ4R5LuVyE0HlGxUZMQc7DT9B7C5/ZQmDM3cHBn3f17b2GaWldfEnorzQ3mtZhfiPmJnvbF97xqgu3MFbPHBMlDaBHEf8YHT9g2LQEJnWkL+eJL9G2qxSKIJeunQ0m3kLZ2czbTaKXLE2MJg+lSr/1yoEK5uRIh1GjDUfRxOTGRoIuCtQwvxiRr7IofD31TZ02i/yDOz18/9QTjrYvPqPWgZLYERrUfMSuPRxlSfOAe9z+qYrZ3wc2+7Y+RgqV7XZqAjt7qgg==",
        "first_chapter_id": "zj2iojyw77",
        "rank_tag": {
          "name": "Top Harian No.1",
          "ranking_period": 1,
          "has_rank": 0
        },
        "theme": [
          "Berpura-pura bodoh"
        ],
        "thumbnail_url": "https://v-mps.crazymaplestudios.com/vod-112094/9000356fb72a71f199b0e6e7d77b0102/snapshots/webvtt/217C83B6-1A0CD6F0AE0-5270-0806-526-96429.vtt",
        "aspect_ratio": 0.56,
        "book_genre": 15,
        "book_source": 45,
        "vtt_lang": [],
        "drama_comic_category": 3,
        "book_mark": {
          "type": 16,
          "color": "#FFE52E2E",
          "text": "Trending",
          "text_color": "#FFFFFFFF"
        },
        "item_type": 1,
        "left_days": 0,
        "have_trailer": true,
        "tag_list": [
          {
            "tag_id": "6979237ebed521eb8c083a44",
            "tag_name": "Laki-laki"
          },
          {
            "tag_id": "697929abbddd0319740c02b6",
            "tag_name": "Penyesalan"
          }
        ],
        "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905563850157755389\\\",\\\"rec_client_trace_id\\\":\\\"17905563850157755389_1291848116_1790556385342_b946013f-b8ae-4aba-aad7-72a3cfcab234\\\",\\\"origin_book_id\\\":\\\"6aa69e2ff969ab813e03c177\\\",\\\"ts\\\":1790556385409,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.4077000021934509},{\\\"type\\\":\\\"u2i\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedForYouV2\\\",\\\"pos\\\":0},\\\"exp\\\":[{\\\"expId\\\":\\\"abtForU_pp\\\",\\\"grp\\\":\\\"2\\\"},{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.9950437545776367,\\\"click_pred\\\":0,\\\"paywall_pred\\\":0,\\\"pay_pred\\\":0,\\\"play_time_pred\\\":0,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.99504375,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":1,\\\"click_pred_index\\\":1,\\\"paywall_pred_index\\\":1,\\\"play_time_pred_index\\\":1,\\\"pay_pred_index\\\":1}}\",\"show_session_id\":\"d34d263d-624f-49f4-9a65-6ccb82f3a8aa\"}",
        "rank_level": "rank_level 1",
        "jump_text": "1",
        "ai_tag": {
          "enabled": true,
          "display_duration": 3
        }
      },
      {
        "lang": "in",
        "t_book_id": "500001000000003683",
        "book_title": "Selamat Tinggal, Cinta Pertama",
        "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500000000000003683/90de700f-e937-4fb3-a9db-866a74d67ee1.jpg",
        "special_desc": "Bagi Jason, Tessa hanya pengganti gadis yang benar-benar dia cintai. Setelah harga dirinya hancur, Tessa memutuskan meninggalkan masa lalu dan memulai hidup baru. Namun saat hendak pergi, muncul seorang pria yang bertekad tak akan membiarkannya menghadapi semuanya sendirian.",
        "share_text": "Saat dia pergi, dunianya runtuh.",
        "book_type": 1,
        "screen_mode": 1,
        "is_preview": 0,
        "collect_count": 61197,
        "chapter_count": 73,
        "is_paid": 1,
        "publish_at": 1786951022,
        "book_id": "6a7943d4b52b0556e80314c5",
        "paid_start": 14,
        "book_share_url": "https://app.reelshort.com/app-video-share/6a7943d4b52b0556e80314c5",
        "start_play": {
          "screen_mode": 1,
          "chapter_id": "eoy3t6fen2",
          "duration": 95,
          "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/4f6024d1697b1993.jpg",
          "video_type": 1,
          "chapter_index": 2,
          "episode_index": 2,
          "play_info": "IzT2+vXHkVyPYxcCsrhdz5/JUK2cgV4yK7hD8eVor50xxDGeFHeTjb6NrbLtKFG5PBhGaWZAO1p7RqgDuGcIctDBqID12i9uMLx8MCROGOacNG9wPXsDS7Bx08jhbHQWQ7enjltaWDkUdLCyGempCZRFt8NiLxyolWyp7yeMii4LMkaOr+piB+qBnI/XNJKVshyfn8ghEAvlHNUKevKqfJQGuBIyinc+y0scjv58P0GXry+gXDJ1pPBfqQfYchhd0K53pwORTe8VZi3WjTfuxq2LEgopoHUUGCke/um61DFmZGYOGdBivFPXf2p3qoqRdEFjdTTDeUtMyYfqrmPCQ8mTeI4QBGp99ksd9G3WB/GsowbkCKKAPUxs40mVx+8oQT1j2vNdkE7q5foXU3g33gO/S7lRSQRapTZWW+P8/HQ3p8cd6yDcnwD/4t7+xUid90ENqzrAZEj2sNZTU57uEEiNOhZlW6nJYCQDAhSAZoCuiKzCUwKT6Fe+Aiq2jtl2JNSXprdBOPZ85K9vh6F/k69I5X51+o+O6WjmiSly6uJsnhj3ntASAQ8S+ihcvJaWhQ2Bjd/WB7Qafp3rr6jfrtI+TWnGOTbxMJLxN5GFoEvo71fkSR+dUVA/MQQXlAmcVSELwEZ4CXT6ZeLC1CTkig==",
          "adult_content_remind": 0,
          "aspect_ratio": 0.56,
          "vtt_lang": []
        },
        "chapter_id": "9ft497da57",
        "like_count": 2866,
        "video_id": "e047ff839acb71f18192e6e7c64b0102",
        "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/22b38a3c7c137b72.jpg",
        "duration": 116,
        "video_type": 1,
        "serial_number": 1,
        "watch_recommend": false,
        "episode_index": 1,
        "video_level": 0,
        "play_info": "SJNyHd1DpuTNMwWJPzcsETmBUzi885NDo16Y9/oWXo5SrIhCzF6fYZZl31kCCbOsNuygXmSTI40yPG/jkui93dtfTuqf5IqvIQI87RsA+4drdmbD+CYVDeC1UXYb6UU2TWCr0Zj9hHx7eGft0eUG9qEIGkzeVoLaaHUCOtbUAvtHmKDfHn39sa6xctYIwMc7+B+84JtOs9ml9YBgRCkDirEIfnmC7hn2JnWWXulIj+OjzM/DhfWkAPavh9jopTzxzK3idL1mDtecou5xyT18wqLOyeKSVizp0PO1zdsHIMGCUKYndi923PtzQ31IJo8XLzWinFxbIFJUYkgbEb9IaDmd2hqclREFF+/xzpqkql73drGvSrtrZy6y1QvTSD5MNlLMO8atqbprztpetcqow4/klajxX5VrmzlzeFUB48g5H9t4ZW4GMPquDrap2TF+pXrA66/E4Bt8OhIEDumwx0cOg/1/eBwimZG7iOl3WW1lywO/wReFqfUBTfVs6WprYDO5n8pQCpxo37FrCAjDRzQwXLDgeXSig6T84b9kWg+G9Ps1NQshGFoesbUgUQUECmTi0Zq9qdm2dfIbVJ4PhILj2eK2J3gcUEgkUkLp5K4/pKZ+EoIBNbHH8H+nQsyMsBuGEK0qEplHbT7H2+gD0Q==",
        "first_chapter_id": "s1kbchz7kf",
        "theme": [
          "Berpura-pura bodoh"
        ],
        "thumbnail_url": "https://v-mps.crazymaplestudios.com/vod-112094/e047ff839acb71f18192e6e7c64b0102/snapshots/webvtt/3E806FA5-1A0137FDCD8-5270-0806-526-96429.vtt",
        "aspect_ratio": 0.56,
        "book_genre": 1,
        "book_source": 1,
        "vtt_lang": [],
        "drama_comic_category": 0,
        "book_mark": {
          "type": 16,
          "color": "#FFE52E2E",
          "text": "Trending",
          "text_color": "#FFFFFFFF"
        },
        "item_type": 1,
        "left_days": 0,
        "have_trailer": true,
        "tag_list": [
          {
            "tag_id": "6979260956164594ab08bf2b",
            "tag_name": "Dewasa Muda"
          },
          {
            "tag_id": "69792d1a4a8f42295502bdfb",
            "tag_name": "Romansa Beracun"
          }
        ],
        "cast": [
          {
            "actor_id": "681db2541c2117d7b103e144",
            "actor_name": "Armand Procacci",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/6590a9c0-2ca9-11f0-93de-cb0b88a6d7a9.jpg",
            "gender": 2,
            "actor_fans_num": 4018
          },
          {
            "actor_id": "688a6b65e504a8b1fc0c3378",
            "actor_name": "Katherine Gibson",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/0c2bd2d0-be38-11f0-84ad-6b5693b490dc.jpg",
            "gender": 1,
            "actor_fans_num": 3422
          },
          {
            "actor_id": "6a469a870244d00f6807d479",
            "actor_name": "Jake Lively",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/507a6240-7638-11f1-a475-8b2e43cf329c.jpg",
            "gender": 2,
            "actor_fans_num": 4022
          },
          {
            "actor_id": "6a469af2252a9648660b048a",
            "actor_name": "Claire Kerofsky",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/9158ad30-7638-11f1-a475-8b2e43cf329c.jpg",
            "gender": 1,
            "actor_fans_num": 3486
          }
        ],
        "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905563850157755389\\\",\\\"rec_client_trace_id\\\":\\\"17905563850157755389_1291848116_1790556385342_b946013f-b8ae-4aba-aad7-72a3cfcab234\\\",\\\"origin_book_id\\\":\\\"6a7943d4b52b0556e80314c5\\\",\\\"ts\\\":1790556385409,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.33629998564720154},{\\\"type\\\":\\\"u2i\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedForYouV2\\\",\\\"pos\\\":1},\\\"exp\\\":[{\\\"expId\\\":\\\"abtForU_pp\\\",\\\"grp\\\":\\\"2\\\"},{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.9919707775115967,\\\"click_pred\\\":0,\\\"paywall_pred\\\":0,\\\"pay_pred\\\":0,\\\"play_time_pred\\\":0,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.9919708,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":56,\\\"click_pred_index\\\":56,\\\"paywall_pred_index\\\":56,\\\"play_time_pred_index\\\":56,\\\"pay_pred_index\\\":56}}\",\"show_session_id\":\"d34d263d-624f-49f4-9a65-6ccb82f3a8aa\"}",
        "rank_level": "rank_level 1",
        "jump_text": "1"
      },
      {
        "lang": "in",
        "t_book_id": "500000000000000428",
        "book_title": "Cinta di Atas Darah",
        "book_pic": "https://v-mps.crazymaplestudios.com/v-images/book_cover_batch/500000000000000428/e04f9e1a-3e36-41b8-a95b-24c3e4a43961.jpg",
        "special_desc": "Dalam pernikahan mafia yang diatur keluarga, Aria akhirnya berhasil membuat Luca jatuh cinta padanya. Tapi semuanya runtuh saat Aria diam-diam membantu kakaknya melarikan diri dan menghancurkan kepercayaan Luca.\n\nDi dunia mafia, pengkhianatan dibayar dengan darah. Kini Luca harus memilih—menghukum wanita yang mengkhianatinya, atau tetap mencintainya.",
        "share_text": "Cinta mafia diuji oleh pengkhianatan dan darah.",
        "book_type": 1,
        "screen_mode": 1,
        "is_preview": 0,
        "collect_count": 206832,
        "chapter_count": 118,
        "is_paid": 1,
        "publish_at": 1780307825,
        "book_id": "6a166378c040bd96890c71c9",
        "paid_start": 16,
        "book_share_url": "https://app.reelshort.com/app-video-share/6a166378c040bd96890c71c9",
        "start_play": {
          "screen_mode": 1,
          "chapter_id": "c1pnewv7bq",
          "duration": 79,
          "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/126ecc50c92a9e0f.jpg",
          "video_type": 1,
          "chapter_index": 4,
          "episode_index": 4,
          "play_info": "j4lVkXqGbjvFCBpqFoupLMz/TyKdNaIMsz69incKjEMxQDZWMHo+k4k6vQ9HGr6jlrphtEl+bBfKGs7DxF7ljPp+elin9udIQfpJ+DwG0Q/rAXXKUTGT50NSpsvp0B9LpSzUBa95eAKOHjXM7Pxw0QGTE1YUY6Kk0ZbU5EewqzliVVvz3qmPi0rjF65Ll5NnCOvcTr2ZxUixs+lQLUKvxxazLcsyvveGlUHgs0yNweXhQdP0YwVvV7CCuqedUsMSn1fwbFIrhSd2XTlQ5qKpiSK4TdLgF8vLZe7sDjiKN626ive/zoNtIicAQ6FKwpFfiixH1t75juZjX88Zpa6UWoIQCOClqtAv2vJQpGrFre9HPnFh2HzBIRLeELS6C8YPKbOPjm13CivP0tj5R2kF4koBblp/K1fg/PpyftyhsuRyAMMqcq69owQNwILb2ELlMm+5l+2ISXosWvJu0FyAZZyig6023uuSLjR5WQdygv5hOgaogeqBxjhipuv5tm/wj4x7ChlTZ99l4YljQ3r6s0IUtixLyBY8NbqRP9FZ5H33xV2bfTVGbqWoTAZvz5yDR8KO36CLh93V4U2dEE7hE3bJED3q8qFPdkog90fAnC2z249MV8ajV3iYMtwsbIrIBkOjY5A3njDTNz5QVuNlNw==",
          "adult_content_remind": 0,
          "aspect_ratio": 0.56,
          "vtt_lang": []
        },
        "chapter_id": "oombkhp08g",
        "like_count": 5775,
        "video_id": "f0acda8e5d6271f1a293e6e7d6490102",
        "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/baa6f5eb43d81ddb.jpg",
        "duration": 119,
        "video_type": 1,
        "serial_number": 3,
        "watch_recommend": false,
        "episode_index": 3,
        "video_level": 0,
        "play_info": "UQjUu23sKeOmxW9rAUYvMl8A3ien/ahLFZ/2USKO87/jsoFlqOjN4um1x434vEksl1Y7RlL5Fe4AKE1eJNiGVnjLr39+lejiNtRxV7RRJb+5tx1K+n09ZVlBnChzN825G2uMLHweyXEB1T2SAEQOloMEzmPel7bQzg+YqNzR7x7mygQ/e+7LaR1C0LF2NDInkjH2ciKrX76d05w8LSMojCRGXCcg7e/Bs3owrXEWtgs8Bz+Wgh4D9Ni3Qk5qd509Hhw+f+JrrbBA5TPzNHe4fU9wRPaNf7Qeb0kdc0QVKUfTncJMLit7ZGWa5KD2LfLLuYlHpXQZGQ6jxYljzveCWTk4KjwmEwzjy+Rk7hkOULp9lMX7hFtHdmhwKZkRazC4n8DB9/48qoJGfcK+RVGg31BrkcKTpn7iZogOd8WBXNajNn1bM840d3OD9cfwCWsuTu/+dZwUNLZcBwjXaUmuQf/2IQ7YFzEPSabM34h13AsU1Puuion8+qg5xIBNJxbQQeOW7T125NGVhtHks6mOnMNBJ9rnUKr+4j0NtJdVxXKgRg+xPW5V22VULYuM4UDczwNWuEVyLP+B48FKPvPHRUtBo8lipfOcSrpmMRIY4hbYx9A2adR//6Xg+OWFjmIZInlvrwVRNY0Z73zBvMaZJg==",
        "first_chapter_id": "tjae3hlmp7",
        "theme": [
          "Berpura-pura bodoh"
        ],
        "thumbnail_url": "https://v-mps.crazymaplestudios.com/vod-112094/f0acda8e5d6271f1a293e6e7d6490102/snapshots/webvtt/15C17323-19E810B1055-5270-0806-526-96429.vtt",
        "aspect_ratio": 0.56,
        "book_genre": 1,
        "book_source": 1,
        "vtt_lang": [],
        "drama_comic_category": 0,
        "item_type": 1,
        "left_days": 0,
        "have_trailer": true,
        "tag_list": [
          {
            "tag_id": "6979235891281db9e40bca5d",
            "tag_name": "Mafia"
          },
          {
            "tag_id": "697926d7c288046c1c06d00d",
            "tag_name": "Dari Musuh Jadi Kekasih"
          }
        ],
        "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905563850157755389\\\",\\\"rec_client_trace_id\\\":\\\"17905563850157755389_1291848116_1790556385342_b946013f-b8ae-4aba-aad7-72a3cfcab234\\\",\\\"origin_book_id\\\":\\\"6a166378c040bd96890c71c9\\\",\\\"ts\\\":1790556385409,\\\"algo\\\":[{\\\"type\\\":\\\"u2i\\\",\\\"score\\\":0.8316180109977722},{\\\"type\\\":\\\"hot\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedForYouV2\\\",\\\"pos\\\":2},\\\"exp\\\":[{\\\"expId\\\":\\\"abtForU_pp\\\",\\\"grp\\\":\\\"2\\\"},{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.9889696836471558,\\\"click_pred\\\":0,\\\"paywall_pred\\\":0,\\\"pay_pred\\\":0,\\\"play_time_pred\\\":0,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.9889697,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":132,\\\"click_pred_index\\\":132,\\\"paywall_pred_index\\\":132,\\\"play_time_pred_index\\\":132,\\\"pay_pred_index\\\":132}}\",\"show_session_id\":\"d34d263d-624f-49f4-9a65-6ccb82f3a8aa\"}",
        "rank_level": "rank_level 1",
        "jump_text": "1"
      },
      {
        "lang": "in",
        "t_book_id": "504400000000006067",
        "book_title": "Arsitek Legendaris Milik CEO Cantik",
        "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504400000000006067/75b114bf-d6e8-4337-a794-e43adc5503dd.jpg",
        "special_desc": "Kehidupan seorang wanita berubah setelah sebuah malam tak terduga mempertemukannya dengan pria misterius. Pertemuan itu membawanya masuk ke dalam hubungan rumit yang dipenuhi kesalahpahaman, rahasia, dan perebutan kekuasaan. Di tengah tekanan keluarga serta persaingan bisnis, ia harus menghadapi orang-orang yang ingin menjatuhkan dan merampas haknya. Dengan keberanian dan keteguhan hati, ia berusaha mengungkap kebenaran, mempertahankan martabat, serta menentukan sendiri jalan hidup dan cintanya.",
        "share_text": "Satu malam tak terduga mempertemukannya dengan pria misterius dan menyeretnya ke dalam perebutan cinta, kekuasaan, serta rahasia keluarga.",
        "book_type": 1,
        "screen_mode": 1,
        "is_preview": 0,
        "collect_count": 77183,
        "chapter_count": 63,
        "is_paid": 1,
        "publish_at": 1788493023,
        "book_id": "6a858fee5e536d8c5f0b4445",
        "paid_start": 13,
        "book_share_url": "https://app.reelshort.com/app-video-share/6a858fee5e536d8c5f0b4445",
        "start_play": {
          "screen_mode": 1,
          "chapter_id": "4rpur2a02w",
          "duration": 337,
          "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/764044fe9529c96f.jpg",
          "video_type": 1,
          "chapter_index": 2,
          "episode_index": 1,
          "play_info": "rti+wVLg+sTTkppWWXBPIPdi/n14WB0ap0yV6YEx6UgIfgULB5kHp4xbe+tYZhMtAHmyy+QaOEwacsxnmZ1cs96HbybJ5rU+rYndlg28xtC96wlTLS1HIYPsVqjoQ61+iZm+eZSQ7uaLIRnEfsxdBEpzpJLC1ZNW4yovspbGl1OQ/+L558ytLzVWLxZg6ockiOmGPo46Y/+TtKaHlph0rLnviwQ04cTd8ZoUKrvBzyZi5eJZCoU3ch4s6TcIV2u4LUofz49DUjAp+Fz0/BAn2AO0Xc9krlhUKg/gvVDiWCQgIsJGGMOM1aWMmTjIBvVxLKZoZMZuJgM7wKGygBT+wdDJCXQE0V/xQB+LZymKCrXZ8QeAPAk7uc+N7otKJc+6JNW1kpbO4L5OaJGkyzSiGp+ho3dKVAOdDufohJgPUsF+ZC1uJmQmyrRBkPNcTx0zBIRpV572nobznM/OOjvCMzHRgtsVO1nIry7IROu8F/pQ8wT9OfhHCMkp1JAFxZezTcRYZQQcGnAi985eyjU03xPbRL6swwBAnadu0pJrM1TnWKiYFcgQE30ii4tSb9ZVNl0s7cnniyftsXGdpXMJkUX2QC6uU+i2yvBEWpRAA2bqwdYzQ9YHCK4yfXEdA/uQhXCoyueUn/6x8/vQPuc2xw==",
          "adult_content_remind": 0,
          "aspect_ratio": 0.56,
          "vtt_lang": []
        },
        "chapter_id": "f2u2imi8vw",
        "like_count": 1660,
        "video_id": "50124d32a6b171f1816ff7e6c5580102",
        "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/bdb41cac672c4958.jpg",
        "duration": 288,
        "video_type": 1,
        "serial_number": 1,
        "watch_recommend": false,
        "episode_index": 0,
        "video_level": 0,
        "play_info": "n3e27vXHBLNYIYuxJgTWT7lQiBl1nozqDarNHmefnNtBxi6jdhWb4EILgHCL74m/RvxdbGfk5V/KOxNv2fA7q2aTTzS+dq3+9D4eioxRMIsK3Wzgt6akSiDXiljNjzHM9sawewULtcLFH/k7qNTtEzW9Vy7pXlNOeCwx/9bkjXzS9HqkUjAWI3e56Dw/7swBLq8uWiy4AxwTMW/m1F5w64QXntxO1f3MkDeGZH/3CAN6jHThNptd4EFNbRgo07Xx26bLP19B8TWchpDjoIqx+cHfuSaYUHku/EE8UI/c8ofTvIaavHZwUr1odISLI8RGZzJNSP6ZbJQ0kubLGWN1g3QcbgtuPsyCWmF+SOkG6CtIX1svztHJWDDwA3QW8BB9sOx3qzwns+FYbZGRcItgQ9Wu5pG+qYdsO0YvhID9awzX8Qei5lBPfAY6Rfw/H9PRM5IF2ANwASbKqzcCmyP2GL34TaCssc3143BjOKH6lqavegmwB/duSOK21HlLw9MREvXOdPG9HJqeAHYXYBf7gmjP03QTZTCC+yLzqHl1IfVOA96CYoY+yUsNMOTtlSP/9hxJGkPijlcaf/9vL6FlWW8f15n5wHTuv1oqgsPG7e8I2KVuvC+VjQj3+v/OSTTm4qZ2rN+1EqKCLZVEeqXkHQ==",
        "first_chapter_id": "f2u2imi8vw",
        "rank_tag": {
          "name": "Rilisan Baru No.4",
          "ranking_period": 14,
          "has_rank": 0
        },
        "theme": [
          "Berpura-pura bodoh"
        ],
        "thumbnail_url": "https://v-mps.crazymaplestudios.com/vod-112094/50124d32a6b171f1816ff7e6c5580102/snapshots/webvtt/1132D42D-1A06178F346-5270-0806-526-96429.vtt",
        "aspect_ratio": 0.56,
        "book_genre": 1,
        "book_source": 15,
        "vtt_lang": [],
        "drama_comic_category": 0,
        "book_mark": {
          "type": 16,
          "color": "#FFE52E2E",
          "text": "Trending",
          "text_color": "#FFFFFFFF"
        },
        "item_type": 1,
        "left_days": 0,
        "have_trailer": true,
        "tag_list": [
          {
            "tag_id": "6348f5093c6ca761764d85f3",
            "tag_name": "Berpura-pura bodoh"
          }
        ],
        "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905563850157755389\\\",\\\"rec_client_trace_id\\\":\\\"17905563850157755389_1291848116_1790556385342_b946013f-b8ae-4aba-aad7-72a3cfcab234\\\",\\\"origin_book_id\\\":\\\"6a858fee5e536d8c5f0b4445\\\",\\\"ts\\\":1790556385409,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.39100000262260437},{\\\"type\\\":\\\"u2i\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedForYouV2\\\",\\\"pos\\\":3},\\\"exp\\\":[{\\\"expId\\\":\\\"abtForU_pp\\\",\\\"grp\\\":\\\"2\\\"},{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.9888344407081604,\\\"click_pred\\\":0,\\\"paywall_pred\\\":0,\\\"pay_pred\\\":0,\\\"play_time_pred\\\":0,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.98883444,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":133,\\\"click_pred_index\\\":133,\\\"paywall_pred_index\\\":133,\\\"play_time_pred_index\\\":133,\\\"pay_pred_index\\\":133}}\",\"show_session_id\":\"d34d263d-624f-49f4-9a65-6ccb82f3a8aa\"}",
        "rank_level": "rank_level 1",
        "jump_text": "1"
      },
      {
        "lang": "in",
        "t_book_id": "509001000000003116",
        "book_title": "Penipuan Jalanan, Legenda Bela Diri",
        "book_pic": "https://v-mps.crazymaplestudios.com/images/c86f2250-fcfc-11f0-84ad-6b5693b490dc.jpg",
        "special_desc": "Awalnya hanya kurir biasa, Rio tanpa sengaja memahami rahasia di balik kitab palsu yang ternyata menyimpan ilmu sakti tertinggi. Setelah menikah mendadak dengan Meylani dan masuk ke keluarga pendekar yang hampir runtuh, ia bangkit sebagai penopang terakhir kehormatan mereka. Dengan teknik misteriusnya, ia mengalahkan para jawara dan membuktikan bahwa dirinya bukan orang sembarangan.",
        "share_text": "Ilmu Palsu? Master Sejati!",
        "book_type": 1,
        "screen_mode": 1,
        "is_preview": 0,
        "collect_count": 242258,
        "chapter_count": 63,
        "is_paid": 1,
        "publish_at": 1773044462,
        "book_id": "699d1eefa3a7262cff05534b",
        "paid_start": 12,
        "book_share_url": "https://app.reelshort.com/app-video-share/699d1eefa3a7262cff05534b",
        "start_play": {
          "screen_mode": 1,
          "chapter_id": "y3ng35c8rb",
          "duration": 121,
          "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/014170524138c98d.jpg",
          "video_type": 1,
          "chapter_index": 3,
          "episode_index": 2,
          "play_info": "UQjUu23sKeOmxW9rAUYvMmLk37TvNaz26LUgxIK7DPyQO+QF0dMID8GCcWKoM/cLRvCkAW905rXKmYzkEPbAxH2NaY4QgEHni3OYEq09nW5rsocH6BhYxkANQODKVR0/r7K5JAAGuCzvsPTm91R5mfDAW2lH+G//K5SDH9IewjHflNCPfK1zSLw2nSXEYIlHycrDci9dFUBsMYAEHcOP+DnC9djLidWXpHjohCRPbmqE65Dc3s+FMSJs5WzXGUSf/QL6K1ezh1dcLO6duqE5z4fUKrO2OfzSjRk9rZ6/mxmeQcDsX7kCv8iKLULtqbq5WZo5OS1r9IaGNlix2kgYZsUo3H1/j7Adjz8bFW150CdNrmqdXMQZTtS47KS7yKCwEXWWspw9WpUZxiS6oVLF5Mc/GeJPMw992SzMPrhCftLKyCaVHqqyEdw4zlMTK9/AMKZqynClltMjosul0fs9SXNcULd1p9mk4vNEADCjc8dfQNlzKH/Y1DXnoZSc3dI1mUbOT0WGUTB+e6UEtmsdwwVYo5K7bkGqmqEdWTT5f8ehNY2+fC8+TgeEN2UuobojtHERH4imrkVq6GScm7Q3hzCguQCafpR4AzHca1NqM3OMmXTpFhBhdbrSOspKOM+YhQuZe7rkn5UWqt7tJpGFcg==",
          "adult_content_remind": 0,
          "aspect_ratio": 0.56,
          "vtt_lang": []
        },
        "chapter_id": "ivdlrfwkgu",
        "like_count": 10662,
        "video_id": "50b1be0b1b7b71f1bff45114c1ca0102",
        "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/53a9ebacdc038a51.jpg",
        "duration": 110,
        "video_type": 1,
        "serial_number": 2,
        "watch_recommend": false,
        "episode_index": 1,
        "video_level": 0,
        "play_info": "n3e27vXHBLNYIYuxJgTWT/tIouT8HF42XnPEp6zH35SXrnxMk2fSP8k0D2uu3Bcrx36Ra633zop6J7Qd9ZyFnDOt1dTBGug9SzYp+qQxfI+s1KfslrcHTqGR64EnKKl+wtheq7FMKltkXaDm5QXbIVSTBzmuIzQbpmZBLMmmrgN0fcvB1mfyShsF/p1VAi97gRVgEPlRnd5wdo2fKXN1/keu3oGlWI8VspCYCnytjQbWGVzjCZLsf64ooKdXd5Jl6Crjx0V+boS2i+YDZNtbPy43hAgHxh/XWfduw0pPjfZ+ZIM5damJIftLPEFvR7Bj8bgHOewKESZgikBI9pp4lypdY+HzQ0vXfsJFdLsb43tfgXex7noa6du8dCROQv9pJlPWzWSCBXdgmEeOxRv+Ydf+l96TeuxccYj7JSDSkmacs6rToStb4G945dz0MS+rYRwXiatWn2vak2zZ9IyI0kFFZmyl+6A4739j07zRAd5ggOawZ7Hb4UiKjknDDgoEKW/jQDsuUxyjCruzvM7ziEVw5dbqsVi/O6wwYUJnx6B4JegkljfBNXepIuhHhS+EIrV0CL6gwi2ElRBNQPuIw8hAume3XtIe5SpUMZ9MwEEWXCcynaUx/tsqyzsvatxD",
        "first_chapter_id": "adj8qcpiob",
        "theme": [
          "Berpura-pura bodoh"
        ],
        "thumbnail_url": "https://v-mps.crazymaplestudios.com/vod-112094/50b1be0b1b7b71f1bff45114c1ca0102/snapshots/webvtt/343D80EC-19CD126261D-5270-0806-526-96429.vtt",
        "aspect_ratio": 0.56,
        "book_genre": 1,
        "book_source": 2,
        "vtt_lang": [],
        "drama_comic_category": 0,
        "item_type": 1,
        "left_days": 0,
        "have_trailer": true,
        "tag_list": [
          {
            "tag_id": "6979210aad30640b810929aa",
            "tag_name": "Aksi"
          },
          {
            "tag_id": "6979264615178bd167079fe8",
            "tag_name": "Yang Terpilih"
          }
        ],
        "cast": [
          {
            "actor_id": "69e9f57185752da7a90e4361",
            "actor_name": "YiHai Wang",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/d670f06de3239f30",
            "gender": 2,
            "actor_fans_num": 3784
          },
          {
            "actor_id": "69e9f57185752da7a90e4364",
            "actor_name": "HuiYao Zhang",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/02ef44060f0d388e",
            "gender": 1,
            "actor_fans_num": 3541
          },
          {
            "actor_id": "69e9f57185752da7a90e4365",
            "actor_name": "YuXiao Qiu",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/8af885c59efb2dad",
            "gender": 2,
            "actor_fans_num": 3786
          },
          {
            "actor_id": "69e9f57185752da7a90e4368",
            "actor_name": "MaoMao Li",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/fbd778fc96c1b65b",
            "gender": 1,
            "actor_fans_num": 3990
          }
        ],
        "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905563850157755389\\\",\\\"rec_client_trace_id\\\":\\\"17905563850157755389_1291848116_1790556385342_b946013f-b8ae-4aba-aad7-72a3cfcab234\\\",\\\"origin_book_id\\\":\\\"699d1eefa3a7262cff05534b\\\",\\\"ts\\\":1790556385409,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3188999891281128}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedForYouV2\\\",\\\"pos\\\":4},\\\"exp\\\":[{\\\"expId\\\":\\\"abtForU_pp\\\",\\\"grp\\\":\\\"2\\\"},{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.9873446226119995,\\\"click_pred\\\":0,\\\"paywall_pred\\\":0,\\\"pay_pred\\\":0,\\\"play_time_pred\\\":0,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.9873446,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":167,\\\"click_pred_index\\\":167,\\\"paywall_pred_index\\\":167,\\\"play_time_pred_index\\\":167,\\\"pay_pred_index\\\":167}}\",\"show_session_id\":\"d34d263d-624f-49f4-9a65-6ccb82f3a8aa\"}",
        "rank_level": "rank_level 1",
        "jump_text": "1"
      },
      {
        "lang": "in",
        "t_book_id": "509001000000004132",
        "book_title": "Penjaga Bangkit: Siapa Berani Lawan?",
        "book_pic": "https://v-mps.crazymaplestudios.com/images/a46d6640-284a-11f1-84ad-6b5693b490dc.jpg",
        "special_desc": "Karena semangkuk malatang, satpam kecil Julian Fernando berkenalan dengan CEO wanita Grup Fora, Olivia Sanjaya. Secara tak terduga dia tersengat listrik, dan kekuatan warisan kultivasi dari kakeknya, Komar Robert, dalam tubuhnya pun terbangun dan sejak saat itu dia mulai bangkit. Keluarga Robert? Keluarga Sanjaya? Memangnya kenapa? Aku, Julian, hanya melihat kekuatan, bukan latar belakang. Kalau tidak terima, kita bicara dengan tinju.",
        "share_text": "Satpam paling brutal! Kekuatan dewa bangkit, menghancurkan keluarga kaya!",
        "book_type": 1,
        "screen_mode": 1,
        "is_preview": 0,
        "collect_count": 436527,
        "chapter_count": 80,
        "is_paid": 1,
        "publish_at": 1776934022,
        "book_id": "69d777dcd881afc0ea0c7a5e",
        "paid_start": 14,
        "book_share_url": "https://app.reelshort.com/app-video-share/69d777dcd881afc0ea0c7a5e",
        "start_play": {
          "screen_mode": 1,
          "chapter_id": "ssfn319dck",
          "duration": 140,
          "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/bb3146ba7d1b3d77.jpg",
          "video_type": 1,
          "chapter_index": 4,
          "episode_index": 3,
          "play_info": "rVTdYj/v7JxFbvuP9UEI03+CpdUR0l//tJYZhwPyuf5S9Lit9M2ynMi3p7FHeUq2v5KH8LNgYQyJVUi8VyaaSK+gXpS54+gpscQw5pQlLH//KsdjGbC8S2XtHVTYFK7KswbM66WovzuySsDfGNPGpSoRXDc7CwEGMywdjOgflWbgCs0u6b/qTCZNINZcNFAVpUuNSBHUEWBj/WTfMMb+bzqgPBQ/21W8KPRgTVz6dICNL/0Q2xJdMwPu3DU6hXz6EsryqRijnDjwQZ0ceYkkG2/NY8rvWN1dg2d2Zh+Z+uoJmkG7k2BoEVavpyzYGY3m0y6DpqENnoE5ulA08ucg61wR9wITWB0bbW4FzSxa+rNgkpgDwbJSv0GRgq0YRYueJ0dsbQohqEufePrhy3inQEmpHMOye9mBCiMihNRMQqP50wXDY+6A2LHwaoR7TiMv5tjAiKVK9exjL42bDmPmEAvz6fh4GgaK8AsHMLYl6fD2hGSCx6nJECnl1FljkNCIyI6mSV8zFyY3RJnMrFcAbFeVXbMdbqGvV2i13PTSuKaFe8tKsQy5UARRTVQ6iI2lorqrgjjgnbMPgPAoNRilqx3yBHkuXnMuObJoApCNN9WjjfSlSoJIjcnS9JXTuP0TwWhTsDA4RlDbVIjGLgdasw==",
          "adult_content_remind": 0,
          "aspect_ratio": 0.56,
          "vtt_lang": []
        },
        "chapter_id": "fmdx5pelj1",
        "like_count": 1822,
        "video_id": "70bcd82e3fc171f1bfa6e6e6c4580102",
        "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/9d34602f83b07fd0.jpg",
        "duration": 146,
        "video_type": 1,
        "serial_number": 3,
        "watch_recommend": false,
        "episode_index": 2,
        "video_level": 0,
        "play_info": "UQjUu23sKeOmxW9rAUYvMpTiWpexTTtwykE+RTBU1zjsfWEceRXJzaIzmfDMab7YA+Z0HLMSo6smVq9/wk6S8I2R+6itegHGEDyulzN2xjlwjCqzD2/WwocVSpJbNjEPy9bJIx7OagjNTCAwCD1HJXgkgZb4dmX7p2JGRWNNJZLGpdkxmRdPqQdww40ZRRVrExrH3FKXe7K+b1P3xeYngzqX77hm4pZd9eplqN/O1y9zBu88ciu03ZAH7NibblJHmNdhwOQwh9sfqOnSyB6og4oXKeqIu2YQa0cJ7gc6eZzmW+CzVDUC1PM01M77OIZd8NfVF32DLZZnsY8yw/7WpJNdQXbk0L3dnoOnWrAqPI7oIuvTuJ30kWIWzUGMME5wmh8DGtVnafJmvAweniMu8J7J7JEkzjOsYURdE4naLY91mk/ikdibfpmnR+ylZcs/G7EjH2V4Tlx2I5oObTFBBMpEc9Yob8ZRtYc2D42PNHBJVLsuODT7nNH9MpLnETAlLIOVXQxTWgs8kQ72NbGr8UWUUPnaaCF+ZifbIVpDiD5NkUNIKgrm+IsAriXU78+9VLkUmHGT2/InTFQcVopZ77VuxekQRRlAOUcjOFBWu4RvNzF67mfTUe0WE0lkfbPWQW5fDNHU64vPacIwejRRww==",
        "first_chapter_id": "enh2hqgxn0",
        "theme": [
          "Bercerita Pria"
        ],
        "thumbnail_url": "https://v-mps.crazymaplestudios.com/vod-112094/70bcd82e3fc171f1bfa6e6e6c4580102/snapshots/webvtt/281B38B0-19DBEE2375A-5270-0806-526-96429.vtt",
        "aspect_ratio": 0.56,
        "book_genre": 1,
        "book_source": 2,
        "vtt_lang": [],
        "drama_comic_category": 0,
        "book_mark": {
          "type": 17,
          "color": "#FFE52E2E",
          "text": "Populer",
          "text_color": "#FFFFFFFF"
        },
        "item_type": 1,
        "left_days": 0,
        "have_trailer": true,
        "tag_list": [
          {
            "tag_id": "6979210aad30640b810929aa",
            "tag_name": "Aksi"
          },
          {
            "tag_id": "69792cbaea504a39050e2fe9",
            "tag_name": "Pahlawan super"
          }
        ],
        "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905563850157755389\\\",\\\"rec_client_trace_id\\\":\\\"17905563850157755389_1291848116_1790556385342_b946013f-b8ae-4aba-aad7-72a3cfcab234\\\",\\\"origin_book_id\\\":\\\"69d777dcd881afc0ea0c7a5e\\\",\\\"ts\\\":1790556385409,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3257000148296356}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedForYouV2\\\",\\\"pos\\\":5},\\\"exp\\\":[{\\\"expId\\\":\\\"abtForU_pp\\\",\\\"grp\\\":\\\"2\\\"},{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.9873319864273071,\\\"click_pred\\\":0,\\\"paywall_pred\\\":0,\\\"pay_pred\\\":0,\\\"play_time_pred\\\":0,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.987332,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":168,\\\"click_pred_index\\\":168,\\\"paywall_pred_index\\\":168,\\\"play_time_pred_index\\\":168,\\\"pay_pred_index\\\":168}}\",\"show_session_id\":\"d34d263d-624f-49f4-9a65-6ccb82f3a8aa\"}",
        "rank_level": "rank_level 1",
        "jump_text": "1"
      },
      {
        "lang": "in",
        "t_book_id": "500001000000000478",
        "book_title": "Mata X-Ray Menembus Hatimu",
        "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500000000000000478/37a8be7b-cd98-43cc-9870-092784ec1ac6.jpg",
        "special_desc": "Setelah diputuskan pacarnya, Eric, CEO merek mewah dengan penglihatan X-ray, memakai kemampuan dan percaya dirinya untuk melawan influencer arogan, sambil memenangkan hati gadis paling populer di sekolah.",
        "share_text": "CEO merek mewah. Kemampuan penglihatan X-ray. Drama SMA.",
        "book_type": 1,
        "screen_mode": 1,
        "is_preview": 0,
        "collect_count": 385377,
        "chapter_count": 62,
        "is_paid": 1,
        "publish_at": 1784622724,
        "book_id": "6a5444e1cfd43f5e42019549",
        "paid_start": 11,
        "is_collect": 1,
        "book_share_url": "https://app.reelshort.com/app-video-share/6a5444e1cfd43f5e42019549",
        "start_play": {
          "screen_mode": 1,
          "chapter_id": "fasicshybn",
          "duration": 124,
          "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/87a2659f823039c3.jpg",
          "video_type": 1,
          "chapter_index": 2,
          "episode_index": 2,
          "play_info": "VZbhx5q64iMhEOPxf3DPhBqgDNkIvc5NlBPP9aIZUvWY5Q1CdXFBih7qfXLg790xgdX26K+J9rtKGN+bYGP2dRcVgnGc8YVqo9SMWWWOoRmab5JHGAyRhn/HbLc+0nQSj9YuhdCnhhJE8sgnNZPLoBZ8URfHvukYH6vKWSeTxHXvS4rAF5Ead7yqDluF/Vxo/rJbuaiP0xrIU9z+LJuxg8ooWHjwzrrIBfGTY5Ahn5vYf/eXLvjckuzftyRvUhvnF09lSVsUZceQpXmxEbdluJOZbzNPdjGg9lgpIfrPpYOMDOxytHvRSainZfTxKSBcQ6c/bV6Kwg/qbGR8ALL6uzYkdOE8k8J9siwUtFr8ieb/pT9RT1dzxI+n4WvWJue3pj2dWumcboN1tvnHaWBBaUGJvQBZNFE4z9J8hnI9h/SrLayM2jHbvu1kDDI51QjQKxSwYk06uhY/FP1SE1o0cjngN+0Ua8vWpxCwqWniJULy7LEDIWRCiL0OV5zUhcIMQt47RO+Wt8pWfa5lLlhXWQ6ZsRYHRfzT/yCbNOOrgIsLsPQC3EWPpbRc09CBoGXq0Ngqy4uweFC3L4h9E5xqgbWIZlowCIvBXVHX3D/JQdv+MY+8l8bem30fvoUwhh6D7Izxi2Ri7UcF+US7MRA9NQ==",
          "adult_content_remind": 0,
          "aspect_ratio": 0.56,
          "vtt_lang": []
        },
        "chapter_id": "1sqqrm72q7",
        "like_count": 6790,
        "video_id": "702171a183f871f1a969f7e6c5580102",
        "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/4303eb783972ae2d.jpg",
        "duration": 177,
        "video_type": 1,
        "serial_number": 1,
        "watch_recommend": false,
        "episode_index": 1,
        "video_level": 0,
        "play_info": "1lLEPqJ163Z7JN7PGoQa9qy5HA7VtOGAyiJYzueSZoW+MuxFtouYrLiGKy5M2uP4CkF+j8gcy2tk2RlY1Vt0bVTQSZp8JyctaKrxi6Dtv9fm0K3xQ/B102VnS2ekDu/J0DA32WOWWwlj9JaDo4dMQwNHENfngoFmDb7YVM2Ex4pz66uhNTnhgtuPcxUIIoaknnF12ExVvOMixDk1eTfDgzjs92A/g/zrgw5l8pZ1MyoOXlq5/IiqBJGH19F3VblQHSc1bveGlMv7GSsEFOh7gA1TD/IXX8p3XTiLQxM7GLaGqglh9+o1bas0wcGh8+O6Nq7Mi1bHAEF9A0/p4w9xxtlhmwXmX4GgvlhqzygBETbu/YqZZ/5JY0Tc1UAr5PcZI1eQtZaUUnQKUfAdStM0LYUyorCFmWD0Lc95tLsZ6Gq2BzBUJ7ezxO3kfKFDd3tvipybSNPJU/5jRBzgxgG6g64HQplUsKtfVykSxNtX+9NHOrm0+uen7koG0vqnWtm5r4jyg98QhYcMsS5tYcvlvugNSxf1rWhS8IVV2a/l0bqTnybhYEtAuCJDG8JoIJ63wYNdLJjL9BirwLohZSQQeMAUnn+uyDnmd2LwZvCOUDY/Dg0+TJYU6QWSQo9oyBJ8",
        "first_chapter_id": "6stldf8hza",
        "theme": [
          "Berpura-pura bodoh"
        ],
        "thumbnail_url": "https://v-mps.crazymaplestudios.com/vod-112094/702171a183f871f1a969f7e6c5580102/snapshots/webvtt/62F38E4A-19F7DEC1589-5270-0806-526-96429.vtt",
        "aspect_ratio": 0.56,
        "book_genre": 1,
        "book_source": 1,
        "vtt_lang": [],
        "drama_comic_category": 0,
        "item_type": 1,
        "left_days": 0,
        "have_trailer": true,
        "tag_list": [
          {
            "tag_id": "6979260956164594ab08bf2b",
            "tag_name": "Dewasa Muda"
          },
          {
            "tag_id": "69792cbaea504a39050e2fe9",
            "tag_name": "Pahlawan super"
          }
        ],
        "cast": [
          {
            "actor_id": "6a39b11b07fcbcd66e0dfe1b",
            "actor_name": "Joel Erdmann",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/22745b80-6e86-11f1-a475-8b2e43cf329c.jpg",
            "gender": 2,
            "actor_fans_num": 3928
          },
          {
            "actor_id": "6a39b20370442235870cb42d",
            "actor_name": "Katelyn Rose",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/aa9e7360-6e86-11f1-a475-8b2e43cf329c.jpg",
            "gender": 1,
            "actor_fans_num": 4592
          },
          {
            "actor_id": "6a39b2617e2ed1276d00c5eb",
            "actor_name": "Belle Moskowitz",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/e3e5d780-6e86-11f1-a475-8b2e43cf329c.jpg",
            "gender": 1,
            "actor_fans_num": 3823
          },
          {
            "actor_id": "6a39b2a3e2adcd184801067f",
            "actor_name": "Garrison Dunn",
            "actor_pic": "https://v-mps.crazymaplestudios.com/images/09d65dc0-6e87-11f1-a475-8b2e43cf329c.jpg",
            "gender": 2,
            "actor_fans_num": 3875
          }
        ],
        "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905563850157755389\\\",\\\"rec_client_trace_id\\\":\\\"17905563850157755389_1291848116_1790556385342_b946013f-b8ae-4aba-aad7-72a3cfcab234\\\",\\\"origin_book_id\\\":\\\"6a5444e1cfd43f5e42019549\\\",\\\"ts\\\":1790556385409,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3725000023841858},{\\\"type\\\":\\\"u2i\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedForYouV2\\\",\\\"pos\\\":6},\\\"exp\\\":[{\\\"expId\\\":\\\"abtForU_pp\\\",\\\"grp\\\":\\\"2\\\"},{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.9865118265151978,\\\"click_pred\\\":0,\\\"paywall_pred\\\":0,\\\"pay_pred\\\":0,\\\"play_time_pred\\\":0,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.9865118,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":180,\\\"click_pred_index\\\":180,\\\"paywall_pred_index\\\":180,\\\"play_time_pred_index\\\":180,\\\"pay_pred_index\\\":180}}\",\"show_session_id\":\"d34d263d-624f-49f4-9a65-6ccb82f3a8aa\"}",
        "rank_level": "rank_level 1",
        "jump_text": "1"
      },
      {
        "lang": "in",
        "t_book_id": "509001000000005331",
        "book_title": "Sistem Manjakan Istri Kembar",
        "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/509000000000005331/a8430f1a-154a-46bd-8d69-a4bd2543f37e.jpg",
        "special_desc": "Jimy, pekerja kantoran modern yang terlempar ke tubuh seorang cendekiawan miskin, memperoleh sistem yang membuatnya makin kuat saat membahagiakan istrinya. Bersama Nayla dan Nayra, dia menumpas para penindas, menggagalkan konspirasi, membantu sang Maharani menyingkirkan musuh politik, lalu memilih meninggalkan kejayaan demi hidup bahagia bersama keluarganya.",
        "share_text": "Dari budak korporat jadi tabib istana, bahkan Maharani pun ditolak!",
        "book_type": 1,
        "screen_mode": 1,
        "is_preview": 0,
        "collect_count": 258661,
        "chapter_count": 72,
        "is_paid": 1,
        "publish_at": 1782814443,
        "book_id": "6a38f6e862b46266d506076f",
        "paid_start": 12,
        "book_share_url": "https://app.reelshort.com/app-video-share/6a38f6e862b46266d506076f",
        "start_play": {
          "screen_mode": 1,
          "chapter_id": "ms19httdy4",
          "duration": 103,
          "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/6279f0758e9be46c.jpg",
          "video_type": 1,
          "chapter_index": 3,
          "episode_index": 2,
          "play_info": "GM3ZVTFxYeScBChiQ5vuDyPzZNE5y00wurNXmWRjDQKSoLODTtLaYgFLVfqx5c2FsC4U/niYnKs5nbmdOg24thk2EQ/iMePXF3O+lHYLPskYTr2BGmRKIgxm8PJH++sfqL3T6I1OAwKtt7Z/F7o38wf/If1TESjezJ3rThVeVfdKAzbSxBBa5H3m7LwM5sam2+PbgAWBanbSyt5N3nKa/yA33MDELRwr+r7x8KENIfDHp7bBLHxGFhucyFkjAnWSuxSyMQ2EAIHwzL6IHuVAEhJaSi3S1ikEFM5QsURkQzC9LSodGtvoKHmytIB3XHGn059OzK4GKap3eeHS+7CK9+BPpvXnHAcxFSbHKy13wBsbbnh9w5b3KW1m5sFYilT1aTa73UP0E+jfN2LnWKKL+lAidHflfRE9Yjdj/xkqjFgrlVO1LgPWukv2fIQMWIFLbpcRXmkk/449oQzBPS+O+M2J4LGDz8LxP2qaxgCm1l/23o5gHsRfeM6jeBoksuYbnoh25HHI/ZGC6B7H8W6BpmNsyAxzAxYA0FWGkNp8mbmpy2U7m+586LCA9EMaHauwANx2qhYSRKYTgENzZuBoHBO7oM5c0Fsomas6SJaz0FjW6uL/PMfC2Yx+T051x8Bu5TK3VqgT9Wtr9He8CABARA==",
          "adult_content_remind": 0,
          "aspect_ratio": 0.56,
          "vtt_lang": []
        },
        "chapter_id": "lew9alhnda",
        "like_count": 1556,
        "video_id": "00a6e2c174f271f1aeb6e6e6d5480102",
        "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/af785a4b099c38e5.jpg",
        "duration": 154,
        "video_type": 1,
        "serial_number": 2,
        "watch_recommend": false,
        "episode_index": 1,
        "video_level": 0,
        "play_info": "UQjUu23sKeOmxW9rAUYvMuiZ/l+EEbeY276wR/BgaK/jOzd/30ioRvdXFzXmoXH7Yy5JDTBoeEskiP7/9VPUb6Vt5UrMYFCTtqtypPS6MMy46QXCnF7XAE4uc/QKQXE8jUY2sH7pDTQ0cu2arrGzGRtmA4cXOfKBAyZn38EfurFiZMjYiSP5ieZEA0Kom6QATvFdRaSLZFQ58HPQU1Wbh4JCqQuHmHIyMk//Rtjif089PYT6pbjIX0bWKA7wAPZQrsjtXymBVCWk3hMEDBsYLZJwh2IUHiB0D3zLy5a6CrUDaEZsgB7TcqpFof76FQXI6JBMJu4sgh8Yu+3BuLVjgNbu3jHqZKNedgXYOxqmPINT1vpKm8aX6OWjmXXaK+KeJqYFifwWmo4dIRIWGZVm7jk9iGicQnW1b0knDiocXnm4gtkfvfqLwEFVU3ODVveuJdJRzm650vCeNNJxffTwa8zc4M99a7HsJ9G0/LMDgFTgzTTy1KnJ7yC/BiNJ5Dio0M+Oi+uXhuj678AaVfUW95Ue2CkzrU6ZQ6+TgW0XoI791DoXJa0awxPfZTm7Bf9oq8Mb0nvAiEmKm4nt+VCCDtaj0TZzeWqyrG0Qr7jSQp+2FvGiVBpNSg9LEDRz3cKMZTbjGlQN8xHsDPRBXrqetw==",
        "first_chapter_id": "0zdmlym3ve",
        "theme": [
          "Berpura-pura bodoh"
        ],
        "thumbnail_url": "https://v-mps.crazymaplestudios.com/vod-112094/00a6e2c174f271f1aeb6e6e6d5480102/snapshots/webvtt/68C7447-19F1B77EBA1-5270-0806-526-96429.vtt",
        "aspect_ratio": 0.56,
        "book_genre": 1,
        "book_source": 2,
        "vtt_lang": [],
        "drama_comic_category": 0,
        "item_type": 1,
        "left_days": 0,
        "have_trailer": true,
        "tag_list": [
          {
            "tag_id": "697922b6df7fa004af07596a",
            "tag_name": "Sejarah"
          },
          {
            "tag_id": "69792d64425b444a120172fc",
            "tag_name": "Dari Nol ke Pahlawan"
          }
        ],
        "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905563850157755389\\\",\\\"rec_client_trace_id\\\":\\\"17905563850157755389_1291848116_1790556385342_b946013f-b8ae-4aba-aad7-72a3cfcab234\\\",\\\"origin_book_id\\\":\\\"6a38f6e862b46266d506076f\\\",\\\"ts\\\":1790556385409,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.35679998993873596}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedForYouV2\\\",\\\"pos\\\":7},\\\"exp\\\":[{\\\"expId\\\":\\\"abtForU_pp\\\",\\\"grp\\\":\\\"2\\\"},{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.9863901138305664,\\\"click_pred\\\":0,\\\"paywall_pred\\\":0,\\\"pay_pred\\\":0,\\\"play_time_pred\\\":0,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.9863901,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":184,\\\"click_pred_index\\\":184,\\\"paywall_pred_index\\\":184,\\\"play_time_pred_index\\\":184,\\\"pay_pred_index\\\":184}}\",\"show_session_id\":\"d34d263d-624f-49f4-9a65-6ccb82f3a8aa\"}",
        "rank_level": "rank_level 1",
        "jump_text": "1"
      },
      {
        "lang": "in",
        "t_book_id": "500001000130000268",
        "book_title": "Teruntuk Kakak-Kakakku yang Kejam",
        "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500001000130000268/bdcc6077-44bd-45af-8094-d927b5e1721d.jpg",
        "special_desc": "Setelah kedua orang tuaku meninggal, aku dibesarkan oleh Tante Sandra, sahabat ibuku, dan disayangi oleh kedua putranya, kakak-beradik Miller. Aku selalu percaya suatu hari nanti akan menikahi salah satu dari mereka. Tapi sejak kedatangan Lola, putri seorang pembantu, semuanya berubah. Kakak-beradik Miller menghancurkan hatiku tanpa belas kasihan. Baru setelah aku pergi, mereka sadar telah kehilangan dan mati-matian mencariku.",
        "share_text": "Sejak kepergianku, mereka mendambakan kepulanganku lebih dari apa pun.",
        "book_type": 1,
        "screen_mode": 1,
        "is_preview": 0,
        "collect_count": 96048,
        "chapter_count": 74,
        "is_paid": 1,
        "publish_at": 1786003622,
        "book_id": "6a6ae46512895345d90f1e43",
        "paid_start": 14,
        "book_share_url": "https://app.reelshort.com/app-video-share/6a6ae46512895345d90f1e43",
        "start_play": {
          "screen_mode": 1,
          "chapter_id": "n3p1cf6x8g",
          "duration": 152,
          "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/e1a826cf03229509.jpg",
          "video_type": 1,
          "chapter_index": 2,
          "episode_index": 2,
          "play_info": "UQjUu23sKeOmxW9rAUYvMl8A3ien/ahLFZ/2USKO87+Pojtbqo9w5sJiER3I+Y/mRwx/BV2/LaVUoMdkoDGhOevIXkPB5cA0EIVKthtr/6cU2lPpYGHQLNBGI7GmfvkwB+HIrfLgHPjzGDiZk8XzQIv+M0dn8fO6tKJlibBbQuDcX+4HkcYDnNCh7hPpQMOM5UdNM81TN1RhEDsUpcSXnWh6RTRXd/MN21eD5UDCGu61K2TambJWCfSaQ/6r7hGohEBDBb6m7WuPlZITxZGTZipZFGr1pHFhsXfjmu3md8Olw7OJW9d+kLSakjh8Vwa6b16aH30y6jJkwFyeRnYdcstX5DOe9wPhHvECn3RoNCAOER47COhNkM07yTGO53ig9e4TqssgegF0Qpg6yumh2/kvL8/cTcpIHgACPTZ5XW43Azf5AAAY0oOBjU10pKuFkzM8isPok6U0ti0xu5dWdVF/eOEZ1ZSA83Y7791Jk7AGqc2/luPJ1o9NGKLpEkBrEwoYnMGu9P7+0n6cKuQMxYvNJzVG2vjVPpD9CefXwcjjA9ywAxh9750vtRs9XFXgvTL8ruBhD1MUDQh/X34p+TuwuNbtUJZoUpcoYlHbeHd6bVWhWTQKutlV2l4bJX92KYmdjQfI1JKkY2r6KLe3LA==",
          "adult_content_remind": 0,
          "aspect_ratio": 0.56,
          "vtt_lang": []
        },
        "chapter_id": "nqac3vfwy3",
        "like_count": 2006,
        "video_id": "00d957a7916671f1bfee4077c0c20102",
        "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/4b261eef87669966.jpg",
        "duration": 173,
        "video_type": 1,
        "serial_number": 1,
        "watch_recommend": false,
        "episode_index": 1,
        "video_level": 0,
        "play_info": "87PfyZsb7pZ36gLVHKOatmcPvY5xB/ApgyZlrdVqdtrw5uJ3ZWq7mh6VQMwiJUUYuB7AuMsaLCLnQncm0POPTGvao+gZ3JHaZEsd3PEPwoVlB5kt1gTB+HqHOpNPBGC9FjC6Zt33G34q1Ykje2Z+rlYScneWxluMW9k/r2izKjgTlAADi8QLvYPX58X9CLb9NM0EqBK9vVveSpJtd1uxoW/z+jxWO0y03xqJ0Cj8d9Wh173Un1RleDExJegq83lgMm0xP//x+nYnCIE24MzzTpl+1aAX0Q+754ODt4jJnOsSgahfF+C+PaFGeRcJ2tmgJ2jaq4pRYi7dO+e+EbLqDDR8v7vcNnJXMwC7UDd9Dg3D9NYe+62jgQV8YDfmFQz4qGnJKENnkxSnM5lU9rRpc8JBqPCzWQr/I06XObtXbRHGsJJQvVhK2z1YihSwVqXWyul663YnY2D/7GjNcIiZF0BIGl2Hmbp6dnagVZA3Wo5gTXRDl5G3bSQ5CUFe7izGZ2g7Emuxy6V9jIHfwB3i6j8zNwI7mVt6D2pQI0Kiih9+LKPFcTcFChaFGAQ9DRl8QJiqi5uySmp99qrIoxTBx+I/N3fMJfFCg2lGC28p8QtpiG4x9izQce3Ls1uLBLMJyPrMssbaapSNZws9psge3g==",
        "first_chapter_id": "67r98b15yx",
        "theme": [
          "Drama Keluarga"
        ],
        "thumbnail_url": "https://v-mps.crazymaplestudios.com/vod-112094/00d957a7916671f1bfee4077c0c20102/snapshots/webvtt/1A1C880C-19FD5EF3744-5270-0806-526-96429.vtt",
        "aspect_ratio": 0.56,
        "book_genre": 1,
        "book_source": 22,
        "vtt_lang": [
          "vi",
          "bg",
          "cs",
          "ro",
          "ru",
          "pl",
          "it",
          "tr",
          "ar",
          "zh-TW",
          "ko",
          "ja",
          "fr",
          "de",
          "in",
          "th",
          "pt",
          "es",
          "en"
        ],
        "drama_comic_category": 0,
        "item_type": 1,
        "left_days": 0,
        "have_trailer": true,
        "tag_list": [
          {
            "tag_id": "6979260956164594ab08bf2b",
            "tag_name": "Dewasa Muda"
          },
          {
            "tag_id": "69792d1a4a8f42295502bdfb",
            "tag_name": "Romansa Beracun"
          }
        ],
        "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905563850157755389\\\",\\\"rec_client_trace_id\\\":\\\"17905563850157755389_1291848116_1790556385342_b946013f-b8ae-4aba-aad7-72a3cfcab234\\\",\\\"origin_book_id\\\":\\\"6a6ae46512895345d90f1e43\\\",\\\"ts\\\":1790556385409,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3515999913215637},{\\\"type\\\":\\\"u2i\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedForYouV2\\\",\\\"pos\\\":8},\\\"exp\\\":[{\\\"expId\\\":\\\"abtForU_pp\\\",\\\"grp\\\":\\\"2\\\"},{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.9859192371368408,\\\"click_pred\\\":0,\\\"paywall_pred\\\":0,\\\"pay_pred\\\":0,\\\"play_time_pred\\\":0,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.98591924,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":186,\\\"click_pred_index\\\":186,\\\"paywall_pred_index\\\":186,\\\"play_time_pred_index\\\":186,\\\"pay_pred_index\\\":186}}\",\"show_session_id\":\"d34d263d-624f-49f4-9a65-6ccb82f3a8aa\"}",
        "rank_level": "rank_level 1",
        "jump_text": "1"
      },
      {
        "lang": "in",
        "t_book_id": "509001000000004678",
        "book_title": "Diputus Hari Ini, Bangkit Besok",
        "book_pic": "https://v-mps.crazymaplestudios.com/images/fffc5540-4477-11f1-acb2-c14bef828c82.jpg",
        "special_desc": "Setelah dikhianati pacarnya demi pria kaya, kurir miskin Ben membangkitkan sistem misterius yang memberinya hadiah besar setiap membantu wanita yang sedang kesulitan. \nDari hidup susah, dia perlahan menjadi pengusaha sukses. Saat mantan pacarnya mencoba menjatuhkannya, orang-orang yang pernah dia bantu justru berdiri membelanya.",
        "share_text": "Di hari putus cinta, sistem kaya aktif.",
        "book_type": 1,
        "screen_mode": 1,
        "is_preview": 0,
        "collect_count": 466784,
        "chapter_count": 70,
        "is_paid": 1,
        "publish_at": 1778844962,
        "book_id": "69faa1fdb23e0401d004e225",
        "paid_start": 12,
        "book_share_url": "https://app.reelshort.com/app-video-share/69faa1fdb23e0401d004e225",
        "start_play": {
          "screen_mode": 1,
          "chapter_id": "a2h8jzobjx",
          "duration": 115,
          "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/c08b9249eafab4c2.jpg",
          "video_type": 1,
          "chapter_index": 2,
          "episode_index": 1,
          "play_info": "ykex98fe+B4PpHLeRa8Glf2KXTnfc17P3U0AdB0m06OfWO+a9Jha1RTEV/vV3YzZWWzSnMlUKP7CsQuRRQqVMZhwNPuZBZ3UZXqO4VNjNInKqCefA0ttccvTJ3cbev7vkgpxWRr+2QCON2zeieTJq/n0ADC7aqfLwpKx17l/aRgKKK7ghwcZpYzlQQjq5ESFwevXDfG9VfDYTcsglbSTXky+M9ZAAQ9BI2/sI6hNZ3IUsFigsuw0IZtM2YPUXr7eAjZ1/fcgC0kXoicaqn9l2c+vbVD7aRjzhEsWGj1XyfKc3JQoJKkcpbkFCaYTVRyLzefRmP9QJWbJ0V/09Kw38FWVHRVj0zQK+pPa0mqqAaroxf3xzrtBgE7Z+1QXNehoQ0SEtLpRhh6ggqkkrfPSMqgL6wudwq/ElwBud2jYcbxTV+J9ycTT2BwWmfIzRuUllcEp1sHd/ukz6ZxThrIJ3pT7ImVtdKsqkijEcEu8IfMpsCOAR2nQmKcrNoNxrETLekvoQXqMxoVw4/NQzVp0rECeiW1wCXrLQ1MgLDmbp8MRReBme7HflJNbQ3tCSslFDUhgHKhFz3UyxjrLtWwQmcbpn0unr3ZNEt2S1tjA7O0gJQhQUPTtbTzsVScQ+fvPQb/jhxE1o1jpAv1g9qHXmA==",
          "adult_content_remind": 0,
          "aspect_ratio": 0.56,
          "vtt_lang": []
        },
        "chapter_id": "ha2gssv9sr",
        "like_count": 9464,
        "video_id": "f0499e33527c71f1bfb3e6f6c54b0102",
        "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/ce994d67cc60e513.jpg",
        "duration": 176,
        "video_type": 1,
        "serial_number": 1,
        "watch_recommend": false,
        "episode_index": 0,
        "video_level": 0,
        "play_info": "ykex98fe+B4PpHLeRa8GlWWduIyO2kACsjHzgJ3P6+r+LWvvqlkCKO4Li8dORzBJB38uGthzG3GinYVHvKC4CSaM1ciAS7tLmRhGCN2d70SO2xNrJKpp9mbQ0Ph3j3lmm/+BhdGY9wUIfFIQICm2P33Hx47WBjpnXU6mG4TDC2EoetQmwKQlub4Jqd5+q+UA6R67xyD+wjaimdNLpS/jmF1a/pp/ZDbcR3pXsHHEcoiTbwDY4qib9SKrkdXNDePB/94DXmtFpfdnJOeVOjzIFpAEPHfi2/WLRDj3MWynNbKu8H29qFvh7GzC4VknTz+mmNM903e29wCX0hr3H3iDdGtSGtPT5Hjnfy7A9r/0swF6AAkfRW5uud9KVckf58BsnTL5qxngWqexd/ljHeptOcsrhAvadeNKWmgDJTTu7LOxIOH/TkEvLwyxPrzaq+y/U9WHh2OTw/m8kJ3R0s4Z7DdsP34FMuLPloZXev0aWkBhnhBei1Sg6OEP7P7ObSR/9TOiYUUp0JHuK876rFDnHxOGN3Rz2DJ/xZopmkrkiM8UQl9DuCjiefxi9yowS6wWOQ3yk0w7f+8+Uhn5cN5/STKtQX89HAqOF6RrFaPYkhOJOTtk4saZLBjCBwz2e+3M2mWWl09zwkbFP15fKpz+wQ==",
        "first_chapter_id": "ha2gssv9sr",
        "theme": [
          "Berpura-pura bodoh"
        ],
        "thumbnail_url": "https://v-mps.crazymaplestudios.com/vod-112094/f0499e33527c71f1bfb3e6f6c54b0102/snapshots/webvtt/54DB2AAF-19E399C6C26-5270-0806-526-96429.vtt",
        "aspect_ratio": 0.56,
        "book_genre": 1,
        "book_source": 2,
        "vtt_lang": [],
        "drama_comic_category": 0,
        "book_mark": {
          "type": 17,
          "color": "#FFE52E2E",
          "text": "Populer",
          "text_color": "#FFFFFFFF"
        },
        "item_type": 1,
        "left_days": 0,
        "have_trailer": true,
        "tag_list": [
          {
            "tag_id": "6979237ebed521eb8c083a44",
            "tag_name": "Laki-laki"
          },
          {
            "tag_id": "697d0844460f3cd38608fdef",
            "tag_name": "Harem"
          }
        ],
        "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905563850157755389\\\",\\\"rec_client_trace_id\\\":\\\"17905563850157755389_1291848116_1790556385342_b946013f-b8ae-4aba-aad7-72a3cfcab234\\\",\\\"origin_book_id\\\":\\\"69faa1fdb23e0401d004e225\\\",\\\"ts\\\":1790556385409,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.37929999828338623},{\\\"type\\\":\\\"u2i\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedForYouV2\\\",\\\"pos\\\":9},\\\"exp\\\":[{\\\"expId\\\":\\\"abtForU_pp\\\",\\\"grp\\\":\\\"2\\\"},{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.9849578142166138,\\\"click_pred\\\":0,\\\"paywall_pred\\\":0,\\\"pay_pred\\\":0,\\\"play_time_pred\\\":0,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.9849578,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":201,\\\"click_pred_index\\\":201,\\\"paywall_pred_index\\\":201,\\\"play_time_pred_index\\\":201,\\\"pay_pred_index\\\":201}}\",\"show_session_id\":\"d34d263d-624f-49f4-9a65-6ccb82f3a8aa\"}",
        "rank_level": "rank_level 1",
        "jump_text": "1"
      }
    ],
    "page": 1,
    "limit": 10,
    "count": 0,
    "total_page": 0,
    "sort_type": 1,
    "preload_pos": -3,
    "group": "dev_26_rec",
    "show_session_id": "d34d263d-624f-49f4-9a65-6ccb82f3a8aa",
    "jump_text_enum": {
      "1": "Tonton Versi Lengkap",
      "2": "Lanjutkan menonton"
    }
  }
}

ReelShort Homepage
const axios = require("axios");

const response = await axios({
  method: "GET",
  url: "https://api.bagahproject.com/api/reelshort/homepage?apikey=ahmuqkey&page=1&lang=id",
  headers: {
    "x-api-key": "ahmuqkey"
  }
});

console.log(response.data);

{
  "success": true,
  "data": {
    "hall_id": 4000648,
    "search_keyword_list": [
      "Takdir Kedua Putri Mafia",
      "Sistem Menikah: Dari Petani Jadi Panglima",
      "Cinta yang Terikat Sumpah",
      "Pengawal Andalan Sang CEO",
      "Rahasia Gelap Bos Mafiaku",
      "Balas Dendam Pewaris Sejati",
      "Rahasia Gelap si Pengasuh",
      "Ditakdirkan untuk Menemukanmu",
      "Cinta di Atas Darah",
      "Penguasa Surgawi",
      "Malam Bersama CEO-ku",
      "Kereta Tempur",
      "Dia Tidak Pernah Memilihmu",
      "Ikatan Sunyi: Jatuh Cinta pada Petani Duda",
      "Penguasa Reinkarnasi Jadi Anak SMA",
      "Hamil Anak Kakak Mantanku",
      "Perawat Biasa, Pahlawan Rahasia",
      "Kontrak 100 Hari: Hasrat Berbahaya Mafia",
      "Istri Rahasia yang Selalu Pak Gio Lindungi",
      "Ayah, Selamatkan Ibu!",
      "Dikurung Bos Mafia",
      "Hutang Darah Harus Dibayar Darah",
      "Pengantin Ular Perak",
      "Sang Guru Tersembunyi",
      "Terus Kenapa? Ayahmu Mencintaiku",
      "Ibu Rumah Tangga Mafia",
      "Jebakan si Guru Les",
      "Tidur dengan Kakak Iparku",
      "Atlet Bad Boy Itu Menginginkanku",
      "Raja Tinju yang Kembali"
    ],
    "tabs_md5": "BRPoJKgbEFJsRTwxRUXYvA==",
    "tab_list": [
      {
        "tab_id": 44421,
        "tab_name": "POPULER",
        "last_modified_time": 1776527750,
        "is_current": 1,
        "tab_md5": "BNV/noy8lns5VuypXDeqrQ==",
        "sort": 1
      },
      {
        "tab_id": 44422,
        "tab_name": "TERBARU",
        "last_modified_time": 1775141700,
        "tab_md5": "aKg+ug0m91kD3cXjAlKT/w==",
        "sort": 2
      },
      {
        "tab_id": 44423,
        "tab_name": "RANKING",
        "last_modified_time": 1760593572,
        "tab_md5": "rVuHNANX2f9SVp+CxnlCWA==",
        "sort": 3,
        "tab_category": 2
      },
      {
        "tab_id": 44424,
        "tab_name": "ANIME",
        "last_modified_time": 1774613853,
        "tab_md5": "7Q2/1Cj7D08eUDZ0efOM/A==",
        "sort": 4
      },
      {
        "tab_id": 44425,
        "tab_name": "ASIA",
        "last_modified_time": 1762151359,
        "tab_md5": "hbx9Eu9Z6lsUka/JpkMRoQ==",
        "sort": 5
      },
      {
        "tab_id": 44426,
        "tab_name": "KATEGORI",
        "last_modified_time": 1758510372,
        "tab_md5": "6ybpqZRq8Le3gMG7VaShKw==",
        "sort": 6,
        "tab_category": 3
      },
      {
        "tab_id": 44427,
        "tab_name": "KHUSUS PRIA",
        "last_modified_time": 1753425677,
        "tab_md5": "Wa5R+6zLEGdF43Kt/EHsPA==",
        "sort": 7
      },
      {
        "tab_id": 44428,
        "tab_name": "KHUSUS WANITA",
        "last_modified_time": 1753425692,
        "tab_md5": "3CI426YKoKdLmsuWMEuTig==",
        "sort": 8
      }
    ],
    "lists": [
      {
        "bs_id": 41008201,
        "tab_id": 44421,
        "ui_style": 9,
        "display_play_num": true,
        "display_theme": true,
        "books": [
          {
            "book_id": "6aa69e2ff969ab813e03c177",
            "book_type": 1,
            "book_source": 45,
            "book_title": "Menolak Lima Pasangan Wanitaku",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504200150000006731/b3d67828-232c-4b00-8020-a9be57795c53.jpg",
            "special_desc": "Selama sepuluh tahun Caine yang yatim melindungi kelima putri dari ayah angkatnya, Alpha, percaya bahwa dia akan berjodoh dengan salah satu dari mereka. Namun kedatangan Seth, seorang begundal licik, menghancurkan dunianya. Dibutakan oleh tipu daya Seth, kelima saudari itu berbalik melawan Caine, dengan terus mempermalukan dan menjatuhkan harga dirinya demi memuaskan sang begundal. Dikecewakan oleh keluarga yang pernah dia sayangi, Caine menghadapi titik balik saat upacara penobatannya. Akankah sang kesatria perkasa terus membiarkan pengkhianatan mereka, atau dia akan memutus hubungan dengan mereka demi mencapai takdir yang lebih besar?",
            "chapter_count": 50,
            "theme": [
              "Laki-laki"
            ],
            "collect_count": 227022,
            "init_collect_count": 1351,
            "read_count": 9003655,
            "t_book_id": "504201150000006731",
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "is_new": 1,
            "first_chapter_id": "zj2iojyw77",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "zj2iojyw77",
              "duration": 237,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/bb91e9584c3563e1.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "j4lVkXqGbjvFCBpqFoupLDvHUwPtPyghSRAcVsIuHUrLubth1OwdEw7TzTX/vT+/xCCk5pmyT/GwliOjrZHVseoR6XfOFWnneU/BWaoajvi8SU0R5XPDA9CBtX8gdH/6Cg9Al6yLc1LoU/G88LCNBaUfSwlQsdacbb7Tc9nEYMtRbRcRBqj3WzcFPHFZkxszA3R5mCi4Y6jSnt6qfKiQvT+MPzb/GTitK2DOCKo7RPtSQBy2z7eZ05PgqyXF3cd/lY6tAWrF5nQPEyBRWSwe9ujzmjR3Aqm+UWCpUJcpxnqQU26bDYEsZIwfs9hbe1mcZvZxyggd2qt+Y3QF8z2BogasmhrI4Qs1txVrcDJsBULj3Xtym/Md9JFVgTO6/lz3F1pr+diLUYlzGRJ4R5LuVyE0HlGxUZMQc7DT9B7C5/ZQmDM3cHBn3f17b2GaWldfEnorzQ3mtZhfiPmJnvbF97xqgu3MFbPHBMlDaBHEf8YHT9g2LQEJnWkL+eJL9G2qxSKIJeunQ0m3kLZ2czbTaKXLE2MJg+lSr/1yoEK5uRIh1GjDUfRxOTGRoIuCtQwvxiRr7IofD31TZ02i/yDOz18/9QTjrYvPqPWgZLYERrUfMSuPRxlSfOAe9z+qYrZ3wc2+7Y+RgqV7XZqAjt7qgg==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979237ebed521eb8c083a44",
                "tag_name": "Laki-laki"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6aa69e2ff969ab813e03c177\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.4077000021934509},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedGridShelf\\\",\\\"pos\\\":0},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.1107085570693016,\\\"click_pred\\\":0.19777977466583252,\\\"paywall_pred\\\":0.7981828451156616,\\\"pay_pred\\\":0.003902614116668701,\\\"play_time_pred\\\":0.49993661046028137,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.11070856,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":1,\\\"click_pred_index\\\":2,\\\"paywall_pred_index\\\":10,\\\"play_time_pred_index\\\":10,\\\"pay_pred_index\\\":1}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Dikhianati oleh kelima calon istrinya demi seorang begundal licik? Terdesak oleh situasi, saksikan bagaimana calon Raja Serigala melawan balik!",
            "score": 170834,
            "like_count": 42434,
            "book_genre": 15,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6aa69e2ff969ab813e03c177\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.4077000021934509},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedGridShelf\",\"pos\":0},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.1107085570693016,\"click_pred\":0.19777977466583252,\"paywall_pred\":0.7981828451156616,\"pay_pred\":0.003902614116668701,\"play_time_pred\":0.49993661046028137,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.11070856,\"is_new_user_feature\":\"\",\"origin_score_index\":1,\"click_pred_index\":2,\"paywall_pred_index\":10,\"play_time_pred_index\":10,\"pay_pred_index\":1}}",
            "rank_level": "Top1",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a858fee5e536d8c5f0b4445",
            "book_type": 1,
            "book_source": 15,
            "book_title": "Arsitek Legendaris Milik CEO Cantik",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504400000000006067/75b114bf-d6e8-4337-a794-e43adc5503dd.jpg",
            "special_desc": "Kehidupan seorang wanita berubah setelah sebuah malam tak terduga mempertemukannya dengan pria misterius. Pertemuan itu membawanya masuk ke dalam hubungan rumit yang dipenuhi kesalahpahaman, rahasia, dan perebutan kekuasaan. Di tengah tekanan keluarga serta persaingan bisnis, ia harus menghadapi orang-orang yang ingin menjatuhkan dan merampas haknya. Dengan keberanian dan keteguhan hati, ia berusaha mengungkap kebenaran, mempertahankan martabat, serta menentukan sendiri jalan hidup dan cintanya.",
            "chapter_count": 63,
            "theme": [
              "Berpura-pura bodoh"
            ],
            "collect_count": 77183,
            "init_collect_count": 1460,
            "read_count": 3602500,
            "t_book_id": "504400000000006067",
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "f2u2imi8vw",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "f2u2imi8vw",
              "duration": 288,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/bdb41cac672c4958.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "n3e27vXHBLNYIYuxJgTWT7lQiBl1nozqDarNHmefnNtBxi6jdhWb4EILgHCL74m/RvxdbGfk5V/KOxNv2fA7q2aTTzS+dq3+9D4eioxRMIsK3Wzgt6akSiDXiljNjzHM9sawewULtcLFH/k7qNTtEzW9Vy7pXlNOeCwx/9bkjXzS9HqkUjAWI3e56Dw/7swBLq8uWiy4AxwTMW/m1F5w64QXntxO1f3MkDeGZH/3CAN6jHThNptd4EFNbRgo07Xx26bLP19B8TWchpDjoIqx+cHfuSaYUHku/EE8UI/c8ofTvIaavHZwUr1odISLI8RGZzJNSP6ZbJQ0kubLGWN1g3QcbgtuPsyCWmF+SOkG6CtIX1svztHJWDDwA3QW8BB9sOx3qzwns+FYbZGRcItgQ9Wu5pG+qYdsO0YvhID9awzX8Qei5lBPfAY6Rfw/H9PRM5IF2ANwASbKqzcCmyP2GL34TaCssc3143BjOKH6lqavegmwB/duSOK21HlLw9MREvXOdPG9HJqeAHYXYBf7gmjP03QTZTCC+yLzqHl1IfVOA96CYoY+yUsNMOTtlSP/9hxJGkPijlcaf/9vL6FlWW8f15n5wHTuv1oqgsPG7e8I2KVuvC+VjQj3+v/OSTTm4qZ2rN+1EqKCLZVEeqXkHQ==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6348f5093c6ca761764d85f3",
                "tag_name": "Berpura-pura bodoh"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a858fee5e536d8c5f0b4445\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.39100000262260437},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedGridShelf\\\",\\\"pos\\\":1},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.05164157971739769,\\\"click_pred\\\":0.0986681878566742,\\\"paywall_pred\\\":0.7254148125648499,\\\"pay_pred\\\":0.00020015239715576172,\\\"play_time_pred\\\":0.5314558148384094,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.05164158,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":6,\\\"click_pred_index\\\":7,\\\"paywall_pred_index\\\":17,\\\"play_time_pred_index\\\":7,\\\"pay_pred_index\\\":86}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Satu malam tak terduga mempertemukannya dengan pria misterius dan menyeretnya ke dalam perebutan cinta, kekuasaan, serta rahasia keluarga.",
            "score": 55676,
            "like_count": 35005,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 16,
              "color": "#FFE52E2E",
              "text": "Trending",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a858fee5e536d8c5f0b4445\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.39100000262260437},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedGridShelf\",\"pos\":1},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.05164157971739769,\"click_pred\":0.0986681878566742,\"paywall_pred\":0.7254148125648499,\"pay_pred\":0.00020015239715576172,\"play_time_pred\":0.5314558148384094,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.05164158,\"is_new_user_feature\":\"\",\"origin_score_index\":6,\"click_pred_index\":7,\"paywall_pred_index\":17,\"play_time_pred_index\":7,\"pay_pred_index\":86}}",
            "rank_level": "Top5",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a6ae46512895345d90f1e43",
            "book_type": 1,
            "book_source": 22,
            "book_title": "Teruntuk Kakak-Kakakku yang Kejam",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500001000130000268/bdcc6077-44bd-45af-8094-d927b5e1721d.jpg",
            "special_desc": "Setelah kedua orang tuaku meninggal, aku dibesarkan oleh Tante Sandra, sahabat ibuku, dan disayangi oleh kedua putranya, kakak-beradik Miller. Aku selalu percaya suatu hari nanti akan menikahi salah satu dari mereka. Tapi sejak kedatangan Lola, putri seorang pembantu, semuanya berubah. Kakak-beradik Miller menghancurkan hatiku tanpa belas kasihan. Baru setelah aku pergi, mereka sadar telah kehilangan dan mati-matian mencariku.",
            "chapter_count": 74,
            "theme": [
              "Dewasa Muda"
            ],
            "collect_count": 96048,
            "init_collect_count": 74,
            "read_count": 5910593,
            "t_book_id": "500001000130000268",
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "67r98b15yx",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "nqac3vfwy3",
              "duration": 173,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/4b261eef87669966.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979260956164594ab08bf2b",
                "tag_name": "Dewasa Muda"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a6ae46512895345d90f1e43\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3515999913215637},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedGridShelf\\\",\\\"pos\\\":2},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.022099856287240982,\\\"click_pred\\\":0.010727941989898682,\\\"paywall_pred\\\":0.6255792379379272,\\\"pay_pred\\\":0.0009059607982635498,\\\"play_time_pred\\\":0.4567927420139313,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.022099856,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":27,\\\"click_pred_index\\\":132,\\\"paywall_pred_index\\\":26,\\\"play_time_pred_index\\\":23,\\\"pay_pred_index\\\":19}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Sejak kepergianku, mereka mendambakan kepulanganku lebih dari apa pun.",
            "score": 55169,
            "like_count": 14489,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a6ae46512895345d90f1e43\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3515999913215637},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedGridShelf\",\"pos\":2},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.022099856287240982,\"click_pred\":0.010727941989898682,\"paywall_pred\":0.6255792379379272,\"pay_pred\":0.0009059607982635498,\"play_time_pred\":0.4567927420139313,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.022099856,\"is_new_user_feature\":\"\",\"origin_score_index\":27,\"click_pred_index\":132,\"paywall_pred_index\":26,\"play_time_pred_index\":23,\"pay_pred_index\":19}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "69faa1fdb23e0401d004e225",
            "book_type": 1,
            "book_source": 2,
            "book_title": "Diputus Hari Ini, Bangkit Besok",
            "book_pic": "https://v-img.crazymaplestudios.com/images/fffc5540-4477-11f1-acb2-c14bef828c82.jpg",
            "special_desc": "Setelah dikhianati pacarnya demi pria kaya, kurir miskin Ben membangkitkan sistem misterius yang memberinya hadiah besar setiap membantu wanita yang sedang kesulitan. \nDari hidup susah, dia perlahan menjadi pengusaha sukses. Saat mantan pacarnya mencoba menjatuhkannya, orang-orang yang pernah dia bantu justru berdiri membelanya.",
            "chapter_count": 70,
            "theme": [
              "Laki-laki"
            ],
            "collect_count": 466784,
            "init_collect_count": 2435,
            "read_count": 54798265,
            "t_book_id": "509001000000004678",
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "ha2gssv9sr",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "ha2gssv9sr",
              "duration": 176,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/ce994d67cc60e513.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "ykex98fe+B4PpHLeRa8GlWWduIyO2kACsjHzgJ3P6+r+LWvvqlkCKO4Li8dORzBJB38uGthzG3GinYVHvKC4CSaM1ciAS7tLmRhGCN2d70SO2xNrJKpp9mbQ0Ph3j3lmm/+BhdGY9wUIfFIQICm2P33Hx47WBjpnXU6mG4TDC2EoetQmwKQlub4Jqd5+q+UA6R67xyD+wjaimdNLpS/jmF1a/pp/ZDbcR3pXsHHEcoiTbwDY4qib9SKrkdXNDePB/94DXmtFpfdnJOeVOjzIFpAEPHfi2/WLRDj3MWynNbKu8H29qFvh7GzC4VknTz+mmNM903e29wCX0hr3H3iDdGtSGtPT5Hjnfy7A9r/0swF6AAkfRW5uud9KVckf58BsnTL5qxngWqexd/ljHeptOcsrhAvadeNKWmgDJTTu7LOxIOH/TkEvLwyxPrzaq+y/U9WHh2OTw/m8kJ3R0s4Z7DdsP34FMuLPloZXev0aWkBhnhBei1Sg6OEP7P7ObSR/9TOiYUUp0JHuK876rFDnHxOGN3Rz2DJ/xZopmkrkiM8UQl9DuCjiefxi9yowS6wWOQ3yk0w7f+8+Uhn5cN5/STKtQX89HAqOF6RrFaPYkhOJOTtk4saZLBjCBwz2e+3M2mWWl09zwkbFP15fKpz+wQ==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979237ebed521eb8c083a44",
                "tag_name": "Laki-laki"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"69faa1fdb23e0401d004e225\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.37929999828338623},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedGridShelf\\\",\\\"pos\\\":3},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.016115037724375725,\\\"click_pred\\\":0.006382276304066181,\\\"paywall_pred\\\":0.6359295845031738,\\\"pay_pred\\\":0.00021985650528222322,\\\"play_time_pred\\\":0.493412584066391,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.016115038,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":36,\\\"click_pred_index\\\":169,\\\"paywall_pred_index\\\":24,\\\"play_time_pred_index\\\":13,\\\"pay_pred_index\\\":76}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Di hari putus cinta, sistem kaya aktif.",
            "score": 72372,
            "read_episode": 1,
            "like_count": 96079,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"69faa1fdb23e0401d004e225\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.37929999828338623},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedGridShelf\",\"pos\":3},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.016115037724375725,\"click_pred\":0.006382276304066181,\"paywall_pred\":0.6359295845031738,\"pay_pred\":0.00021985650528222322,\"play_time_pred\":0.493412584066391,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.016115038,\"is_new_user_feature\":\"\",\"origin_score_index\":36,\"click_pred_index\":169,\"paywall_pred_index\":24,\"play_time_pred_index\":13,\"pay_pred_index\":76}}",
            "rank_level": "Top20",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a5444e1cfd43f5e42019549",
            "book_type": 1,
            "book_source": 1,
            "book_title": "Mata X-Ray Menembus Hatimu",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500000000000000478/37a8be7b-cd98-43cc-9870-092784ec1ac6.jpg",
            "special_desc": "Setelah diputuskan pacarnya, Eric, CEO merek mewah dengan penglihatan X-ray, memakai kemampuan dan percaya dirinya untuk melawan influencer arogan, sambil memenangkan hati gadis paling populer di sekolah.",
            "chapter_count": 62,
            "theme": [
              "Dewasa Muda"
            ],
            "collect_count": 385376,
            "init_collect_count": 1752,
            "read_count": 15543737,
            "t_book_id": "500001000000000478",
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "6stldf8hza",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "1sqqrm72q7",
              "duration": 177,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/4303eb783972ae2d.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "1lLEPqJ163Z7JN7PGoQa9qy5HA7VtOGAyiJYzueSZoW+MuxFtouYrLiGKy5M2uP4CkF+j8gcy2tk2RlY1Vt0bVTQSZp8JyctaKrxi6Dtv9fm0K3xQ/B102VnS2ekDu/J0DA32WOWWwlj9JaDo4dMQwNHENfngoFmDb7YVM2Ex4pz66uhNTnhgtuPcxUIIoaknnF12ExVvOMixDk1eTfDgzjs92A/g/zrgw5l8pZ1MyoOXlq5/IiqBJGH19F3VblQHSc1bveGlMv7GSsEFOh7gA1TD/IXX8p3XTiLQxM7GLaGqglh9+o1bas0wcGh8+O6Nq7Mi1bHAEF9A0/p4w9xxtlhmwXmX4GgvlhqzygBETbu/YqZZ/5JY0Tc1UAr5PcZI1eQtZaUUnQKUfAdStM0LYUyorCFmWD0Lc95tLsZ6Gq2BzBUJ7ezxO3kfKFDd3tvipybSNPJU/5jRBzgxgG6g64HQplUsKtfVykSxNtX+9NHOrm0+uen7koG0vqnWtm5r4jyg98QhYcMsS5tYcvlvugNSxf1rWhS8IVV2a/l0bqTnybhYEtAuCJDG8JoIJ63wYNdLJjL9BirwLohZSQQeMAUnn+uyDnmd2LwZvCOUDY/Dg0+TJYU6QWSQo9oyBJ8",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979260956164594ab08bf2b",
                "tag_name": "Dewasa Muda"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a5444e1cfd43f5e42019549\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3725000023841858},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedGridShelf\\\",\\\"pos\\\":4},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.010930565185844898,\\\"click_pred\\\":0.006132781505584717,\\\"paywall_pred\\\":0.5741906762123108,\\\"pay_pred\\\":0.0001302957534790039,\\\"play_time_pred\\\":0.39433959126472473,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.010930565,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":61,\\\"click_pred_index\\\":172,\\\"paywall_pred_index\\\":32,\\\"play_time_pred_index\\\":60,\\\"pay_pred_index\\\":127}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "CEO merek mewah. Kemampuan penglihatan X-ray. Drama SMA.",
            "score": 209413,
            "read_episode": 7,
            "like_count": 61525,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 14,
              "color": "#FFE52E2E",
              "text": "Lanjutkan",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a5444e1cfd43f5e42019549\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3725000023841858},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedGridShelf\",\"pos\":4},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.010930565185844898,\"click_pred\":0.006132781505584717,\"paywall_pred\":0.5741906762123108,\"pay_pred\":0.0001302957534790039,\"play_time_pred\":0.39433959126472473,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.010930565,\"is_new_user_feature\":\"\",\"origin_score_index\":61,\"click_pred_index\":172,\"paywall_pred_index\":32,\"play_time_pred_index\":60,\"pay_pred_index\":127}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {},
            "is_collect": 1
          },
          {
            "book_id": "69bb9182a88c4eada20bb6ae",
            "book_type": 1,
            "book_source": 2,
            "book_title": "Suami Rumah Tangga, Raja Judi Tersembunyi",
            "book_pic": "https://v-img.crazymaplestudios.com/images/b2bc4fb0-17ae-11f1-84ad-6b5693b490dc.jpg",
            "special_desc": "Harold, sang Raja Judi, menyembunyikan identitasnya demi menjaga Grace dan keluarga Dalton selama tiga tahun sesuai amanat mendiang Victor. Namun, pengorbanannya hanya dibalas hinaan. Harold bertahan hingga waktu tersisa tiga hari. Saat Grace tertipu dan keluarganya terancam rugi besar, Harold menggunakan keahlian judinya untuk mengalahkan musuh, lalu pergi meninggalkan Grace yang kini panik mencarinya.",
            "chapter_count": 61,
            "theme": [
              "Perceraian"
            ],
            "collect_count": 577102,
            "init_collect_count": 1508,
            "read_count": 32312853,
            "t_book_id": "509001000000003508",
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "zhlttnbkyb",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "zhlttnbkyb",
              "duration": 275,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/8ecb7408fce8e7ca.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "87PfyZsb7pZ36gLVHKOatgrORhVuUd2qxEj0ZRL5D7yWzr6Rh5uktRpAoVqKnX5ge3erSl7DhsGwjrXZC0zhM2dFCu+CY9ieaMEJq6dYP74EhZtoL+ZE10bMsg2QPSBvEIlc/hoVZuU2jjQGnNvBrrHdlUIzj+mYZJaF213dyfEwtTTGRyExG2QXM+YxRvjqxgu/xZ6JccYlxImqA4ZcCmshvcLTt6BqiPeHs8PYMzSfAVNya72Tao5Ok1QOd7DJ4XI3nyFPFk9lnBxE5O7IbO1b0CFUwWWzay5L7baGPU+RVNf6wryybpkYVnRKRajQzaqcULseQBPMiWkXwxOZNWBIoM9yckwdv2lGMcUC4TJD6y9OcG4Eyi72Owq1jxwH2wkxTIslkYqUlUvAY27dZdtnjdSXQvD8dq/WxH5L8//q8QX1fLZHzZXTbJ5wl4tZGglCZeWVjdqVQIJP2cnTF8moj7FlxgMPYFwoilI2RXpTH5bnwc5AE1F866Nxr2bG7wO+8820mBNlWNvyDOYf73TCePYig21q1/JVQ2i8ovrJodYhkvrUVBgA6auIkQmrkrAcLvgsiKgsddk2PVfNjKJAqEe0qZmtOVGrUVgVVvN8oRDoEvP3dc2LB9XvaJW3Q0FTPx62jidMUAEiSovoBg==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979222ac7e01bb4220474ed",
                "tag_name": "Perceraian"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"69bb9182a88c4eada20bb6ae\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3402999937534332},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedGridShelf\\\",\\\"pos\\\":5},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.010649343021214008,\\\"click_pred\\\":0.005107611417770386,\\\"paywall_pred\\\":0.49016740918159485,\\\"pay_pred\\\":0.00036078691482543945,\\\"play_time_pred\\\":0.4404580295085907,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.010649343,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":62,\\\"click_pred_index\\\":182,\\\"paywall_pred_index\\\":52,\\\"play_time_pred_index\\\":34,\\\"pay_pred_index\\\":53}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Kau kehilangan suami yang baik, tapi tak ada jalan kembali.",
            "score": 52958,
            "like_count": 65668,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"69bb9182a88c4eada20bb6ae\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3402999937534332},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedGridShelf\",\"pos\":5},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.010649343021214008,\"click_pred\":0.005107611417770386,\"paywall_pred\":0.49016740918159485,\"pay_pred\":0.00036078691482543945,\"play_time_pred\":0.4404580295085907,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.010649343,\"is_new_user_feature\":\"\",\"origin_score_index\":62,\"click_pred_index\":182,\"paywall_pred_index\":52,\"play_time_pred_index\":34,\"pay_pred_index\":53}}",
            "rank_level": "Top18",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a6ae6ecef4031cc220fb33f",
            "book_type": 1,
            "book_source": 22,
            "book_title": "Teruntuk Kakak-Kakakku yang Kejam",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500001000130000268/bdcc6077-44bd-45af-8094-d927b5e1721d.jpg",
            "special_desc": "Setelah kedua orang tuaku meninggal, aku dibesarkan oleh Tante Sandra, sahabat ibuku, dan disayangi oleh kedua putranya, kakak-beradik Miller. Aku selalu percaya suatu hari nanti akan menikahi salah satu dari mereka. Tapi sejak kedatangan Lola, putri seorang pembantu, semuanya berubah. Kakak-beradik Miller menghancurkan hatiku tanpa belas kasihan. Baru setelah aku pergi, mereka sadar telah kehilangan dan mati-matian mencariku.",
            "chapter_count": 74,
            "theme": [
              "Dewasa Muda"
            ],
            "collect_count": 63456,
            "init_collect_count": 74,
            "read_count": 4301825,
            "t_book_id": "500000000130000268",
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "tu27ultfcw",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "yt9egxtpxf",
              "duration": 173,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/48fbcf0bead47024.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979260956164594ab08bf2b",
                "tag_name": "Dewasa Muda"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a6ae6ecef4031cc220fb33f\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.32580000162124634},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedGridShelf\\\",\\\"pos\\\":6},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.010461828671395779,\\\"click_pred\\\":0.008452266454696655,\\\"paywall_pred\\\":0.5115143656730652,\\\"pay_pred\\\":0.0008745789527893066,\\\"play_time_pred\\\":0.2653178572654724,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.010461829,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":63,\\\"click_pred_index\\\":144,\\\"paywall_pred_index\\\":49,\\\"play_time_pred_index\\\":147,\\\"pay_pred_index\\\":21}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Sejak kepergianku, mereka mendambakan kepulanganku lebih dari apa pun.",
            "score": 55169,
            "like_count": 10018,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {},
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a6ae6ecef4031cc220fb33f\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.32580000162124634},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedGridShelf\",\"pos\":6},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.010461828671395779,\"click_pred\":0.008452266454696655,\"paywall_pred\":0.5115143656730652,\"pay_pred\":0.0008745789527893066,\"play_time_pred\":0.2653178572654724,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.010461829,\"is_new_user_feature\":\"\",\"origin_score_index\":63,\"click_pred_index\":144,\"paywall_pred_index\":49,\"play_time_pred_index\":147,\"pay_pred_index\":21}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a5090281be80038a3055506",
            "book_type": 1,
            "book_source": 1,
            "book_title": "Pura-Pura Pacaran dengan Sahabat Mantanku",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500000000000002139/8c388af4-91ed-496c-a8c6-1773dfc49686.jpg",
            "special_desc": "Clara pura-pura amnesia untuk menguji pacarnya. Namun, dia malah mendapati pacarnya berselingkuh dan mencampakkannya demi sahabatnya sendiri, Ethan. Untuk membalas dendam, Clara mulai berpura-pura pacaran dengan Ethan agar mantannya terbakar api cemburu. Namun, apa jadinya jika ciuman pura-pura Ethan mulai terasa nyata?",
            "chapter_count": 56,
            "theme": [
              "Dewasa Muda"
            ],
            "collect_count": 46851,
            "init_collect_count": 1608,
            "read_count": 2088006,
            "t_book_id": "500000000000002139",
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "efsklxxue3",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "8bf1xu11w4",
              "duration": 181,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/d5945cea5c46dd47.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "bR7Q7F1pwy/5VRtJ/mVzMRpzTMhUXz1b4JoQfBGuzuCUhQniBeNyyjBgR8Hie6HCas0Rr+aAbu0zE5GYe8IK+P/NkrKSjA7y7fjyqrcExTrSwvq6FtUiaooQIX2OkjbcyxqVSw8kBizNRQZTwPXywIkEi9zUy8m9Rfy54LniJko5VgJ5wzqi24p1rwjedeBhIHlBwVMuLNrGVfbb9mUoPkAZUsvHg9h4Z5LBjuVVPTS+Sz59p6Og1qp8Nf4Nup0t4SxwkMmITXEucjPrEONbVDT5wEbFQO0g5n38Z5leKi5lKor3SGGJBUW+s7o32lgiZjRLy4RFC0FCoeZZ1c2UXo7f8m+OKeYXUgSV+ulfs3lh+s4zRf2cGWOp2zaxNF3lwRPp3fe0FPB80lN49OlH8J3GEkZqkshgpZTKXK/5E8Axr9dZVMAibopYIasDcLnZK4On5xyu7om3w2DsBQ/PbqyMzKOefRkpFdg01IoWMvnFtP/ys9iPuldPAylX+FzZBS6Nz1ODtKZRm7jVnUgDZxKV58/Klf0U3CLf3wru5ds+gBTR+1Q2+APgT+cXKNXRg3hTgH9f0hcUjyHxYadbBFTdTNwkkQdz0wuu0B6I2nXUJXbMoadHIBsmZCTKdFH9cXYGMAgGBA9eyf6fB8NjQQ==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979260956164594ab08bf2b",
                "tag_name": "Dewasa Muda"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a5090281be80038a3055506\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.35019999742507935},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedGridShelf\\\",\\\"pos\\\":7},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.009955332614481449,\\\"click_pred\\\":0.0036305785179138184,\\\"paywall_pred\\\":0.5193038582801819,\\\"pay_pred\\\":0.0003299415111541748,\\\"play_time_pred\\\":0.4365449845790863,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.009955333,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":65,\\\"click_pred_index\\\":195,\\\"paywall_pred_index\\\":44,\\\"play_time_pred_index\\\":35,\\\"pay_pred_index\\\":57}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Pura-pura pacaran dengan sahabat mantanku, tapi malah jatuh cinta sungguhan.",
            "score": 13104,
            "like_count": 32766,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {},
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a5090281be80038a3055506\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.35019999742507935},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedGridShelf\",\"pos\":7},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.009955332614481449,\"click_pred\":0.0036305785179138184,\"paywall_pred\":0.5193038582801819,\"pay_pred\":0.0003299415111541748,\"play_time_pred\":0.4365449845790863,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.009955333,\"is_new_user_feature\":\"\",\"origin_score_index\":65,\"click_pred_index\":195,\"paywall_pred_index\":44,\"play_time_pred_index\":35,\"pay_pred_index\":57}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "698da53ed3fc71ebbf0b4577",
            "book_type": 1,
            "book_source": 2,
            "book_title": "Keluar Penjara, Langsung Jadi Raja Judi",
            "book_pic": "https://v-img.crazymaplestudios.com/images/7035fb30-0022-11f1-84ad-6b5693b490dc.jpg",
            "special_desc": "Raditya dijebak tunangannya dan dipenjara. Ia berguru pada tiga master judi. Usai bebas, ia jadi Raja Judi demi balas dendam dan bersumpah mengakhiri dunia perjudian.",
            "chapter_count": 60,
            "theme": [
              "Miliarder"
            ],
            "collect_count": 218287,
            "init_collect_count": 876,
            "read_count": 14730725,
            "t_book_id": "509001000000003151",
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "azwr3gsbdh",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "65lcusi18s",
              "duration": 174,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/a7a68e05d28888f2.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "UQjUu23sKeOmxW9rAUYvMgQ8xjG98Vfe/JtM+wbrtQILVh21l73KtGpeFjc5pdO/tE72tlVg02aBXoMuPipVnjzFqNr5NrthA2Okjo7LvBCWqkR2c9AJHfCPg30zzroCW08FvaPT71MlvaVn8Kgr0wJtdBBkdHhLkFofQxMp0VvynVWF4tBjEBuMt5/nDvXmLhl+TGBPh8exLIEC4V8L3garpKoE22k0jxAzhI8EfB7Jyn3CHK290LZg7CpDKS1BRPP9hFsoQdcCZwMpDUFDZYhTCK8XjMoCxl4aHTEuobNkF5ifw4y6HE76shu6dF3U344qBxhap1OcQaTipCXyqwyvCcvvqaXz9Ujx+7N50XdWfwDM4OEikpu4QHgSqmINInrOFCFLHJEiWIE4nt/VdCU8Wo4mmqmQlulVbmyqD+6Ldwnceej9ke96VTg79TH6iOiFl1WvfPT9mf1BKKasIHTxqdqtkGsrVCxumlI/9Ay4jvzEjaXgDNtVqpqTUbgLUMzZbjsALAkC57O9GDZv9c4LbhZCUpReZ07eeSQI5SV7tW/V/TUDg0eV9pUoq9xc91l4g0VfBi41tZ40nq3dmuvrei4mVe/cAcKRvhS6681s6Hsk3aGtNvov0JDdCBydtmyBUgj4trd1ZanTVzCprw==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979218e9e339e7cd60709b8",
                "tag_name": "Miliarder"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"698da53ed3fc71ebbf0b4577\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3346000015735626},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedGridShelf\\\",\\\"pos\\\":8},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.00860739778727293,\\\"click_pred\\\":0.003395213047042489,\\\"paywall_pred\\\":0.4791924059391022,\\\"pay_pred\\\":0.00013879976177122444,\\\"play_time_pred\\\":0.5043866634368896,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.008607398,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":72,\\\"click_pred_index\\\":197,\\\"paywall_pred_index\\\":56,\\\"play_time_pred_index\\\":9,\\\"pay_pred_index\\\":120}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Balas dendam ilmu judi, bersumpah hapus perjudian di dunia.",
            "score": 7684,
            "like_count": 16898,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"698da53ed3fc71ebbf0b4577\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3346000015735626},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedGridShelf\",\"pos\":8},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.00860739778727293,\"click_pred\":0.003395213047042489,\"paywall_pred\":0.4791924059391022,\"pay_pred\":0.00013879976177122444,\"play_time_pred\":0.5043866634368896,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.008607398,\"is_new_user_feature\":\"\",\"origin_score_index\":72,\"click_pred_index\":197,\"paywall_pred_index\":56,\"play_time_pred_index\":9,\"pay_pred_index\":120}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          }
        ],
        "double_two_rank_info": {},
        "last_book_id": "698da53ed3fc71ebbf0b4577",
        "show_watch_progress": false
      },
      {
        "bs_id": 41008202,
        "tab_id": 44421,
        "ui_style": 10,
        "display_play_num": true,
        "books": [
          {
            "book_id": "6a28d5950d500ddee903508c",
            "book_type": 1,
            "book_source": 1,
            "book_title": "Nggak Sengaja Rayu Musuh",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500001000000004988/da12455a-fd93-4413-a699-d57372338c13.jpg",
            "special_desc": "Evelyn dipermalukan di depan umum setelah perasaannya pada seorang pemain hoki populer terungkap. Kemudian dia memberanikan diri mengirim foto seksi secara anonim untuk menarik perhatiannya. Tapi dia malah mengirim foto-foto itu pada Colton, kapten tim hoki yang selalu menggodanya. Apa yang akan terjadi di antara mereka?",
            "chapter_count": 57,
            "theme": [
              "Dewasa Muda",
              "Bertolak Belakang Menarik"
            ],
            "collect_count": 338716,
            "init_collect_count": 1388,
            "read_count": 13913382,
            "t_book_id": "500001000000004988",
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "4cbmmxwguv",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "no7wghg0c6",
              "duration": 229,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/834fcf7a1118de7e.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "87PfyZsb7pZ36gLVHKOattvp5mW/U2zUlYgNQ8k9KJUB9rJP9DkbHwOHnwBDPIjsm3BjUWd3wggxIylvwd+ujDKZnR3qLgsMG4Opbr0l9dPlEnnbu5uBXUkIvGocoUpxkbXDSYRg24NrYLK4PY1cP4iBj6Xb8Tu7A7Gw+bjjrAowNnwrf04C0DaXof5CAeMd8G9xA88BIweBFv0QyJkVbGWZ2L759rOPcPTFJoFkaKS6t1B0qkheJLvpEhwywY14SLGeVP6z+TPP+eexkvNSWp30n2IFOVusqwHCWiHMqWLkjTyd8i+vX2zHJUgM8QDlqJN1YgDmwkNDipExVU2DxFAaJ6NPjW/lPiPUcD8M2nr69OdK8LPK/m58iIWNgBKuszUR1lv5et0/iNOtaMvlU4cFG9M1cKCT4vZ6+6nvTcuYlEtzh5FUAGBZeehW7WiSNUlnp53TWXYXvvl91xLzVPXIPRz3+Vs1IImLIH92Gi/UdfCXlvv1mwOA4/25lazUhI+U8DIxUbwuwW8UipQm9gUHTlIklO6xWIbKrHYbzpxuVyn+IZ3MlkWhtaeOeNxL98Q8U8UsPtHYl4fYh8jTXMkUZD//WfhLkiBtXsJwzDPuu3xv/TYLdyDArH0vT2zg2pXnKAoOkUk+q/KJDGJm9w==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979260956164594ab08bf2b",
                "tag_name": "Dewasa Muda"
              },
              {
                "tag_id": "69792993049fff534b0e767c",
                "tag_name": "Bertolak Belakang Menarik"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a28d5950d500ddee903508c\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3294999897480011},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":0},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.007618515752255917,\\\"click_pred\\\":0.003212596056982875,\\\"paywall_pred\\\":0.4912450313568115,\\\"pay_pred\\\":0.00021650358394254,\\\"play_time_pred\\\":0.386104017496109,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.0076185158,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":82,\\\"click_pred_index\\\":201,\\\"paywall_pred_index\\\":51,\\\"play_time_pred_index\\\":68,\\\"pay_pred_index\\\":77}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Evelyn tidak sengaja mengirim foto telanjang pada musuh bebuyutannya.",
            "score": 767909,
            "read_episode": 2,
            "like_count": 58807,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 14,
              "color": "#FFE52E2E",
              "text": "Lanjutkan",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a28d5950d500ddee903508c\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3294999897480011},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":0},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.007618515752255917,\"click_pred\":0.003212596056982875,\"paywall_pred\":0.4912450313568115,\"pay_pred\":0.00021650358394254,\"play_time_pred\":0.386104017496109,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.0076185158,\"is_new_user_feature\":\"\",\"origin_score_index\":82,\"click_pred_index\":201,\"paywall_pred_index\":51,\"play_time_pred_index\":68,\"pay_pred_index\":77}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "screen_mode": 0,
            "start_play": {
              "screen_mode": 0,
              "chapter_id": "",
              "duration": 0,
              "video_pic": "",
              "video_type": 0,
              "chapter_index": 0,
              "episode_index": 0,
              "play_info": "",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0,
              "is_voiceover": false
            },
            "report": "{\"is_manual\":0,\"recall_level\":\"\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "ranking_period": 1,
            "ranking_rule": 87,
            "title": "Paling Trending",
            "rank_tag": {},
            "item_type": 3,
            "series": {},
            "play_list": {},
            "book_mark": {},
            "rank_list": [
              {
                "book_id": "6aa69e2ff969ab813e03c177",
                "book_type": 1,
                "book_source": 45,
                "book_title": "Menolak Lima Pasangan Wanitaku",
                "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504200150000006731/b3d67828-232c-4b00-8020-a9be57795c53.jpg",
                "special_desc": "Selama sepuluh tahun Caine yang yatim melindungi kelima putri dari ayah angkatnya, Alpha, percaya bahwa dia akan berjodoh dengan salah satu dari mereka. Namun kedatangan Seth, seorang begundal licik, menghancurkan dunianya. Dibutakan oleh tipu daya Seth, kelima saudari itu berbalik melawan Caine, dengan terus mempermalukan dan menjatuhkan harga dirinya demi memuaskan sang begundal. Dikecewakan oleh keluarga yang pernah dia sayangi, Caine menghadapi titik balik saat upacara penobatannya. Akankah sang kesatria perkasa terus membiarkan pengkhianatan mereka, atau dia akan memutus hubungan dengan mereka demi mencapai takdir yang lebih besar?",
                "chapter_count": 50,
                "theme": [
                  "Berpura-pura bodoh"
                ],
                "collect_count": 227022,
                "init_collect_count": 1351,
                "read_count": 9003655,
                "t_book_id": "504201150000006731",
                "online_at": 1790081585,
                "trailer_bookshelf_color": "#2E2E2E",
                "screen_mode": 1,
                "start_play_episode": 1,
                "is_new": 1,
                "first_chapter_id": "zj2iojyw77",
                "start_play": {
                  "screen_mode": 1,
                  "chapter_id": "zj2iojyw77",
                  "duration": 237,
                  "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/bb91e9584c3563e1.jpg",
                  "video_type": 1,
                  "chapter_index": 1,
                  "episode_index": 0,
                  "play_info": "j4lVkXqGbjvFCBpqFoupLDvHUwPtPyghSRAcVsIuHUrLubth1OwdEw7TzTX/vT+/xCCk5pmyT/GwliOjrZHVseoR6XfOFWnneU/BWaoajvi8SU0R5XPDA9CBtX8gdH/6Cg9Al6yLc1LoU/G88LCNBaUfSwlQsdacbb7Tc9nEYMtRbRcRBqj3WzcFPHFZkxszA3R5mCi4Y6jSnt6qfKiQvT+MPzb/GTitK2DOCKo7RPtSQBy2z7eZ05PgqyXF3cd/lY6tAWrF5nQPEyBRWSwe9ujzmjR3Aqm+UWCpUJcpxnqQU26bDYEsZIwfs9hbe1mcZvZxyggd2qt+Y3QF8z2BogasmhrI4Qs1txVrcDJsBULj3Xtym/Md9JFVgTO6/lz3F1pr+diLUYlzGRJ4R5LuVyE0HlGxUZMQc7DT9B7C5/ZQmDM3cHBn3f17b2GaWldfEnorzQ3mtZhfiPmJnvbF97xqgu3MFbPHBMlDaBHEf8YHT9g2LQEJnWkL+eJL9G2qxSKIJeunQ0m3kLZ2czbTaKXLE2MJg+lSr/1yoEK5uRIh1GjDUfRxOTGRoIuCtQwvxiRr7IofD31TZ02i/yDOz18/9QTjrYvPqPWgZLYERrUfMSuPRxlSfOAe9z+qYrZ3wc2+7Y+RgqV7XZqAjt7qgg==",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0.56,
                  "is_voiceover": false
                },
                "tag_list": [
                  {
                    "tag_id": "6348f5093c6ca761764d85f3",
                    "tag_name": "Berpura-pura bodoh"
                  }
                ],
                "have_trailer": true,
                "report": "{\"is_manual\":0,\"recall_level\":\"rank\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                },
                "rank_tag": {},
                "share_text": "Dikhianati oleh kelima calon istrinya demi seorang begundal licik? Terdesak oleh situasi, saksikan bagaimana calon Raja Serigala melawan balik!",
                "score": 161093,
                "like_count": 42434,
                "book_genre": 15,
                "series": {},
                "play_list": {},
                "book_mark": {
                  "type": 4,
                  "color": "#FFF26118",
                  "text": "Dubbing",
                  "text_color": "#FFFFFFFF"
                },
                "recall_level": "rank",
                "hallPic": {
                  "jump_param": {
                    "start_play": {
                      "screen_mode": 0,
                      "chapter_id": "",
                      "duration": 0,
                      "video_pic": "",
                      "video_type": 0,
                      "chapter_index": 0,
                      "episode_index": 0,
                      "play_info": "",
                      "clip_id": "",
                      "sum_clip_id": "",
                      "adult_content_remind": 0,
                      "need_show_pre_roll": false,
                      "aspect_ratio": 0,
                      "is_voiceover": false
                    },
                    "preLoad": {},
                    "start_read_info": {
                      "screen_mode": 0,
                      "chapter_id": "",
                      "chapter_index": 0,
                      "adult_content_remind": 0,
                      "char_offset": 0,
                      "comic_index": 0
                    }
                  },
                  "book_mark": {}
                },
                "continue_watch": {}
              },
              {
                "book_id": "6a9e2b3f912f12575b046762",
                "book_type": 1,
                "book_source": 45,
                "book_title": "Menolak Lima Pasangan Wanitaku",
                "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504200150000006731/b3d67828-232c-4b00-8020-a9be57795c53.jpg",
                "special_desc": "Selama sepuluh tahun Caine yang yatim melindungi kelima putri dari ayah angkatnya, Alpha, percaya bahwa dia akan berjodoh dengan salah satu dari mereka. Namun kedatangan Seth, seorang begundal licik, menghancurkan dunianya. Dibutakan oleh tipu daya Seth, kelima saudari itu berbalik melawan Caine, dengan terus mempermalukan dan menjatuhkan harga dirinya demi memuaskan sang begundal. Dikecewakan oleh keluarga yang pernah dia sayangi, Caine menghadapi titik balik saat upacara penobatannya. Akankah sang kesatria perkasa terus membiarkan pengkhianatan mereka, atau dia akan memutus hubungan dengan mereka demi mencapai takdir yang lebih besar?",
                "chapter_count": 50,
                "theme": [
                  "Berpura-pura bodoh"
                ],
                "collect_count": 99446,
                "init_collect_count": 1311,
                "read_count": 3976389,
                "t_book_id": "504200150000006731",
                "online_at": 1789123920,
                "trailer_bookshelf_color": "#2E2E2E",
                "screen_mode": 1,
                "start_play_episode": 1,
                "first_chapter_id": "52n1yrcpcw",
                "start_play": {
                  "screen_mode": 1,
                  "chapter_id": "52n1yrcpcw",
                  "duration": 237,
                  "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/4040d5f376f382b5.jpg",
                  "video_type": 1,
                  "chapter_index": 1,
                  "episode_index": 0,
                  "play_info": "sBblIWKDmYURKyujQHvf6jivy+U+B1970vfFQ+4oLzBgZ/Q5ga+5kglooqFYL2QGSWekoYUFiJfhF6e1cTtswc20d4P/7HAsQpqMetz/+3LVruEUNg252cmt7aeHwJoSF4bwhuF0nb8cMIlG//yuU0V7hkJw7oJk8TzBGtYupF+s8WfxjV5n6iA+G0SNoZ/j0MgJhgsJKJqUWk9LJMxgUtM9YVYYPiRJHOl6MvEtR/Dklk4me+kVKcItUIZ7dLLfWRlemfBvAoAC/P4VwY82zw6e83Y+NAY2iHfmdeytCvykOVT0m1wdY+X0dU2J3PNOx50nU/timq9hP0/J7z4KD9cPZ2uQLgyyS+Px6MguklcWEm5Rc8W3tzV3PHxcPzKtfbYH8b1sH7yHOzbhKByvDCnlBMsTxOhJwYAlR7pKFi4VkWhAGh49qdzirktbTDiJQt+4gvsLHfFP7g2m6vM7zyWTMZg7Kh5eY27QoLeMHHsudU++cQXdZ6NXMfHHoR4791gy5cGzdz/ZTcZ+CkXOBWp+s7CQp2jHnoMHhN49OZ7KkkAmbBHDk9eWTTMgCQm7qoemSgwdk7AfkzWKlffjCOocNjJ0XEQplgpvRuz1fQB3leU2UCYXDAIQgJEeNNdZ/S8NClt/DnT/PmiuSNIE5g==",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0.56,
                  "is_voiceover": false
                },
                "tag_list": [
                  {
                    "tag_id": "6348f5093c6ca761764d85f3",
                    "tag_name": "Berpura-pura bodoh"
                  }
                ],
                "have_trailer": true,
                "report": "{\"is_manual\":0,\"recall_level\":\"rank\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                },
                "rank_tag": {},
                "share_text": "Dikhianati oleh kelima calon istrinya demi seorang begundal licik? Terdesak oleh situasi, saksikan bagaimana calon Raja Serigala melawan balik!",
                "score": 46806,
                "like_count": 33996,
                "book_genre": 15,
                "series": {},
                "play_list": {},
                "book_mark": {
                  "type": 16,
                  "color": "#FFE52E2E",
                  "text": "Trending",
                  "text_color": "#FFFFFFFF"
                },
                "recall_level": "rank",
                "hallPic": {
                  "jump_param": {
                    "start_play": {
                      "screen_mode": 0,
                      "chapter_id": "",
                      "duration": 0,
                      "video_pic": "",
                      "video_type": 0,
                      "chapter_index": 0,
                      "episode_index": 0,
                      "play_info": "",
                      "clip_id": "",
                      "sum_clip_id": "",
                      "adult_content_remind": 0,
                      "need_show_pre_roll": false,
                      "aspect_ratio": 0,
                      "is_voiceover": false
                    },
                    "preLoad": {},
                    "start_read_info": {
                      "screen_mode": 0,
                      "chapter_id": "",
                      "chapter_index": 0,
                      "adult_content_remind": 0,
                      "char_offset": 0,
                      "comic_index": 0
                    }
                  },
                  "book_mark": {}
                },
                "continue_watch": {}
              },
              {
                "book_id": "6a8265a1af43836c55050ef7",
                "book_type": 1,
                "book_source": 46,
                "book_title": "CEO Baru Ternyata Dokter Kandunganku",
                "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504300150000006129/d70e026f-564c-44e1-98f0-bc6a54d8fd0e.jpg",
                "special_desc": "Pernikahan tanpa seks menjadikan Clara hiperseksual. Dia berobat dan bertemu Dokter Killian. Setelah menolak ajakan bercinta, suaminya masturbasi dengan foto adik tiri Clara, Vivian.\n\nBesoknya Killian datang sebagai CEO baru di kantor Clara dan menjadikan Clara asistennya demi mengeksploitasinya. Saat Clara menerima telepon, Killian mendorong Clara hingga orgasme, membuat hasrat terlarang mereka memuncak.\n\nKillian semakin posesif dan mudah cemburu. Di sebuah gala, histeria Clara terpantik. Killian terus terang berkata ingin “mengobatinya”. Mereka tak mampu lagi menahan hasrat mereka.",
                "chapter_count": 52,
                "theme": [
                  "Berpura-pura bodoh"
                ],
                "collect_count": 311251,
                "init_collect_count": 1163,
                "read_count": 11045596,
                "t_book_id": "504301150000006129",
                "online_at": 1787627500,
                "trailer_bookshelf_color": "#2E2E2E",
                "screen_mode": 1,
                "start_play_episode": 1,
                "first_chapter_id": "rlpydfffi6",
                "start_play": {
                  "screen_mode": 1,
                  "chapter_id": "rlpydfffi6",
                  "duration": 97,
                  "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/59bb0f82c20f6616.jpg",
                  "video_type": 1,
                  "chapter_index": 1,
                  "episode_index": 0,
                  "play_info": "87PfyZsb7pZ36gLVHKOatoOamVBl3Qw45CeREql0yB+DnVk5ulLCn0RY3bZmCdPTarOnxgFBB/ytkCO9wXh9KkX3p3A114IzQTdzsNqIptNYnutAz6TVb17zPfDC7YAkTPZlDeG+cBF7QOKmYi+NdWizvYs27xOc9/tsD0Mheji7CG0HEAVdmN7rwEUCfTnuYke3NMwXz1Bg6Gz9vI1R7zXlsM2rIE1gWRGbLndDkdgNk9u/cbho1d6OsG4ILuiQwVDstlVtkBhR0BA7nwt4ULfNiBYXMnZJ13R2iIwGJgXWd7U7G1PueZYRVw07HESLZyZs2fyGaUATQIPotKyQe0zFSo7HU6HncyzdhFihBp3BIchth9ATR7xRAyF2vdDxFPegK5GRXxE38B1Qtm4QYeg/MXf3+BHogCpOrLvaclIBPuuqTZQJyOg79wsGxWtcPd8ApsHsvnHBM6KFKtpIdPRWudl2r3mqLuUCSutvJ9jXuZTpTxprp2iGN6wjgTml8f1dAZMHoDd78jtdmT9eyQ6uo50/sagmluwn7xF+73tI5mXyWfzx5JfJKU9V6rbckp20RNk/kvkSvvW1z4bXln9QkHmAc+XkoyK+Fe4cDTKz2U5U7fOKc6txv9rJA3SH0rlE7EYvk0wxhougofqJFw==",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0.56,
                  "is_voiceover": false
                },
                "tag_list": [
                  {
                    "tag_id": "6348f5093c6ca761764d85f3",
                    "tag_name": "Berpura-pura bodoh"
                  }
                ],
                "have_trailer": true,
                "report": "{\"is_manual\":0,\"recall_level\":\"rank\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                },
                "rank_tag": {},
                "share_text": "Dia menyembuhkan histeria Clara, meski dia yang menyebabkannya.",
                "score": 40900,
                "like_count": 38328,
                "book_genre": 15,
                "series": {},
                "play_list": {},
                "book_mark": {
                  "type": 4,
                  "color": "#FFF26118",
                  "text": "Dubbing",
                  "text_color": "#FFFFFFFF"
                },
                "recall_level": "rank",
                "hallPic": {
                  "jump_param": {
                    "start_play": {
                      "screen_mode": 0,
                      "chapter_id": "",
                      "duration": 0,
                      "video_pic": "",
                      "video_type": 0,
                      "chapter_index": 0,
                      "episode_index": 0,
                      "play_info": "",
                      "clip_id": "",
                      "sum_clip_id": "",
                      "adult_content_remind": 0,
                      "need_show_pre_roll": false,
                      "aspect_ratio": 0,
                      "is_voiceover": false
                    },
                    "preLoad": {},
                    "start_read_info": {
                      "screen_mode": 0,
                      "chapter_id": "",
                      "chapter_index": 0,
                      "adult_content_remind": 0,
                      "char_offset": 0,
                      "comic_index": 0
                    }
                  },
                  "book_mark": {}
                },
                "continue_watch": {}
              }
            ],
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a90eb2845995a507e0198e4",
            "book_type": 1,
            "book_source": 45,
            "book_title": "Pengantin Ular Perak",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504200150000006421/37effe8d-2750-416d-bafb-83fb920dd93f.jpg",
            "special_desc": "Sejak kecil, Bella hidup di bawah aturan ketat neneknya untuk menjauhi ular. Namun, dia tak menyangka akan menolong seorang pria yang terluka parah di tengah hutan—Silvan, Raja Ular Perak yang ditakuti semua orang.\n\nSilvan bertekad menjadikan Bella miliknya. Di hari pernikahan Bella, dia menerobos masuk dan mengklaim Bella sebagai miliknya. Demi melarikan diri dari monster posesif itu, Bella kabur bersama kekasih masa kecilnya.\n\nNamun, pria yang paling dia percaya justru mengkhianatinya dan menjadikannya tumbal. Dikhianati, diburu, dan nyaris tewas, Bella hanya bisa bergantung pada pria yang dulu paling dia takuti.",
            "chapter_count": 40,
            "theme": [
              "Fantasi Tinggi",
              "Kekasih Takdir"
            ],
            "collect_count": 274558,
            "init_collect_count": 1279,
            "read_count": 11476793,
            "t_book_id": "504200150000006421",
            "online_at": 1788523526,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "4e5y6g16cy",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "4e5y6g16cy",
              "duration": 158,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/db8a663dc24a7270.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "bR7Q7F1pwy/5VRtJ/mVzMTZWlETCpJNGeoX6m0sVRSIksYKl8HKPSp9p/QcJkfCItKvjq8IYJhcXZoCpYtqhgUvV7wIpSWsuVZABMAI7sX7y3HTWA8Eag7Yd9vIv9aMtrQwOm/DinlrPb7KFD0jhs7Ukx5rpIeDMuAQCMhVD7D8AyLHwoFV6hieMlIRejZ3f4VtteL1EsPf1md/iXDunrCP4Zph3WVQA+XJMJs21A0HBTeobjugaVLjWfGaPNBDO6Ybv/SZqlJuQfuKcSW1IBzUtF7Pkwcp4memsUoEyK2+Sye0xazQHcploeYxu/yaFRCcHw2ZryKUguVx9TalibqrCKlUBLZ2jGpu0KuGqfZzotzjs2z8Od0zQqdhQKd2TAKsGGv+deOAbdZJ+55YkkKb15Svgk1IvXenK5b7fgVmN5ibULxjVTKq5l3KX6B3QaFFJ4VUn/MmhAXqjnpiI+ADZ2KVua/Vo09kTP9HewZwhKzQNFc5dyW45pkQyJOM1mo5YXtN9XqIk3d5KgoyT1mIZOGDLptu3tu+tGpHXNkzUl/PLAooX74XtIf1S7RaJ6gssmP5Ty9xtRF07wxTEuCLcavLctE/JFmkyVmWoNzMY2a2nItyrUesCvsYvPSb2DJaam2LmAfvoFf4jJASIZw==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979228985d52fffc305d6cb",
                "tag_name": "Fantasi Tinggi"
              },
              {
                "tag_id": "69792744cb71594fae036f2b",
                "tag_name": "Kekasih Takdir"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a90eb2845995a507e0198e4\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.4505000114440918},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":2},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.10075585544109344,\\\"click_pred\\\":0.14829769730567932,\\\"paywall_pred\\\":0.8095631003379822,\\\"pay_pred\\\":0.001658797264099121,\\\"play_time_pred\\\":0.5845044851303101,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.100755855,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":2,\\\"click_pred_index\\\":3,\\\"paywall_pred_index\\\":8,\\\"play_time_pred_index\\\":2,\\\"pay_pred_index\\\":10}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Dikhianati oleh tunanganku, diselamatkan oleh Raja Ular.",
            "score": 116283,
            "like_count": 48367,
            "book_genre": 15,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 16,
              "color": "#FFE52E2E",
              "text": "Trending",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a90eb2845995a507e0198e4\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.4505000114440918},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":2},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.10075585544109344,\"click_pred\":0.14829769730567932,\"paywall_pred\":0.8095631003379822,\"pay_pred\":0.001658797264099121,\"play_time_pred\":0.5845044851303101,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.100755855,\"is_new_user_feature\":\"\",\"origin_score_index\":2,\"click_pred_index\":3,\"paywall_pred_index\":8,\"play_time_pred_index\":2,\"pay_pred_index\":10}}",
            "rank_level": "Top2",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "68be74645f39c9467d0a99f8",
            "book_type": 1,
            "book_source": 2,
            "book_title": "Putri Nakal, Penakluk Hati",
            "book_pic": "https://v-img.crazymaplestudios.com/images/12ebb1f0-8e11-11f0-a06b-bdb674869ea1.jpg",
            "special_desc": "Di ulang tahunnya yang ke-16, Putri Mesa dari Dinasti Sali tiba-tiba terlempar ke tubuh gadis modern berusia delapan tahun. Semua kasih sayangnya dulu dirampas oleh sang putri palsu, tetapi kini Mesa siap membalas dengan menaklukkan ayahnya yang pemalas dan urakan. Sebagai Putri Sah Dinasti Sali, melatih pria urakan itu jelas bukan masalah baginya!",
            "chapter_count": 66,
            "theme": [
              "Terlahir Kembali",
              "Hubungan Rahasia"
            ],
            "collect_count": 503031,
            "init_collect_count": 654,
            "read_count": 26420936,
            "t_book_id": "509001000000000928",
            "online_at": 1759041976,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "pzo1v23g9j",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "pzo1v23g9j",
              "duration": 162,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/f32d40654dafb149.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "UQjUu23sKeOmxW9rAUYvMpIOj/boFOiPYL2jS18Q/hbTMjVMcnRlsb0JNSXZG5WjxP6b4GPk0/MqeLceMPABpxAEcWIAlSgfdP+fAd6u3FhQHu2GyF6py/vp2Dft31ggLhKtrtUHAJIrCGwnNkUWbYHOPgiat2X45kJ8YPYFOLk3uBvzPReqYphGOOCrpE+d6P+jVySgJcqcMbWdOIBdiABG2Ys428qkN7uF2eZKma8KnfwCWMW5eTLoqCImSJsQotLmpXpoHuVu8PfrgUFVAp1dTwcmgE+1PWVeXqIp/hEfN2873yiqFbBPvCnMgWR4WwCs/wFHo0DAwZv02026nh7J5Xu2fzyqOBFDj99so9pIPrjEIZYqU+lcLixlR+rp7n+iDN6waqcHtlvQW4BV1eLsDzmkHD+mXVi2gpnJ/BTcVSnt/i2f8LOJNswuC5eJccr6/6ugb+0nbDJeBq3So/uAS5y4egxKL1O8Hep9Re98CzfbvB4Gi9rmYdlBeFUOMOjnpL97hJH/43ONr5O5CwZo2uxPsAo7rkTIoaKjratA3pFZ/jJWjU2AVRpfwn0D5lQK3eJSSqoy5mMGhUmP06m4CSndWmFoQ+7sSt+bzYioxN01MZhr00YNVaOKhT/0QloUNAWl9IyWQFtcAN4GMA==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "697924c8c1841cf6eb0cdcff",
                "tag_name": "Terlahir Kembali"
              },
              {
                "tag_id": "69792b705e48e61c0e0c073c",
                "tag_name": "Hubungan Rahasia"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"68be74645f39c9467d0a99f8\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3222000002861023},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":3},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.00808966625481844,\\\"click_pred\\\":0.0015202645445242524,\\\"paywall_pred\\\":0.5839000940322876,\\\"pay_pred\\\":0.00004539786823443137,\\\"play_time_pred\\\":0.6077251434326172,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.008089666,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":75,\\\"click_pred_index\\\":228,\\\"paywall_pred_index\\\":30,\\\"play_time_pred_index\\\":1,\\\"pay_pred_index\\\":228}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {
              "name": "Top Tahunan No.12",
              "ranking_period": 4
            },
            "item_type": 1,
            "share_text": "Kali ini aku akan menaklukkanmu, si palsu.",
            "score": 9844,
            "like_count": 106198,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"68be74645f39c9467d0a99f8\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3222000002861023},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":3},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.00808966625481844,\"click_pred\":0.0015202645445242524,\"paywall_pred\":0.5839000940322876,\"pay_pred\":0.00004539786823443137,\"play_time_pred\":0.6077251434326172,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.008089666,\"is_new_user_feature\":\"\",\"origin_score_index\":75,\"click_pred_index\":228,\"paywall_pred_index\":30,\"play_time_pred_index\":1,\"pay_pred_index\":228}}",
            "rank_level": "Top12",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "screen_mode": 0,
            "start_play": {
              "screen_mode": 0,
              "chapter_id": "",
              "duration": 0,
              "video_pic": "",
              "video_type": 0,
              "chapter_index": 0,
              "episode_index": 0,
              "play_info": "",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "676d210f4582b53a14081b02",
                "tag_name": "Identitas Tersembunyi",
                "genre_list": [
                  1,
                  2
                ]
              },
              {
                "tag_id": "676d210e4582b53a14081ae8",
                "tag_name": "Cinta Setelah Menikah",
                "genre_list": [
                  1,
                  2
                ]
              },
              {
                "tag_id": "676d210e4582b53a14081aea",
                "tag_name": "Balas dendam",
                "genre_list": [
                  1,
                  2
                ]
              },
              {
                "tag_id": "676d210e4582b53a14081aec",
                "tag_name": "Perbedaan Usia",
                "genre_list": [
                  1,
                  2
                ]
              }
            ],
            "report": "{\"is_manual\":0,\"recall_level\":\"\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "title": "Lihat Lebih Banyak",
            "rank_tag": {},
            "item_type": 2,
            "series": {},
            "play_list": {},
            "book_mark": {},
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "698004f02593c82ff003e1b8",
            "book_type": 1,
            "book_source": 2,
            "book_title": "Saat Aku Pergi, Hidupnya Runtuh",
            "book_pic": "https://v-img.crazymaplestudios.com/images/2365c860-fb6f-11f0-84ad-6b5693b490dc.jpg",
            "special_desc": "Miles mendedikasikan hidupnya demi menjadikan Wendy ratu bisnis, namun malah dikhianati dan dibunuh. Mendapat kesempatan hidup kedua, Miles memutuskan mencampakkan Wendy. Namun, Wendy yang juga terlahir kembali yakin kesuksesannya tak bergantung pada Miles. Saat hidup diulang, realitas berubah: Miles tak lagi mengejarnya dan punya cinta baru, sementara Jack ternyata lelaki brengsek.",
            "chapter_count": 80,
            "theme": [
              "Terlahir Kembali",
              "Penyesalan"
            ],
            "collect_count": 257263,
            "init_collect_count": 925,
            "read_count": 22603858,
            "t_book_id": "509001000000003134",
            "online_at": 1770962418,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "ujjv4rqd8e",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "ujjv4rqd8e",
              "duration": 206,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/8dc47fa0a11a3478.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "GM3ZVTFxYeScBChiQ5vuD+etiMK8ruV5KjyKnYZosD3g3CqQzoa5wTmghUh+Qvy9okBR9Y2qLTC+1HOusTbyT9Z17OHa0WlyspfF6i6/mqQJcfGITTi20kgCx93UdVRbvdUJ2qJBWihic5X2xk58B5Oy48ATtowcjCWps8eaasLnpM18XlA2D3vz35OHWbKeviTcm12BxwlOG4nA+ZWYbTBuh0J9oa0jgvzL8E1x63TlqVlxhPMGNjPNTiKRyCiKomwP7wfbTFC3/VQwZ5cS+wv2pxqJb5U9VnrLrcrBKJP7lGAuF3vwjYPjVsYgsKbH76uRpK1tMG29e/4romO8+OerFHz2pgI2+xomUGMYPJhprpTGc/kSrWAqgxbaV031shpXdUXI24RlzT2bk9fzEH4tzXzFc4w6MbPJIByNG8EV3BdfrzP2skeQ2pKMH9s3xwKOZniqCar0AvkIyfx3YX7oEHVZlC1LV++jR8lUV8WySrbQF3Fdrn8qUanlQ2zckEl9XX+mE47HW0foFRimX7aAyLbedAFoYiQawIZjgJIhCR9nbhmlj4F9xylZosjpi45PAlOxmTXdG9cuVAj84DQCbjG+6tYvhwpF2DBZdlkW33czYycyPvO/ZrtvsAr8BI3D/OCsByhvdAOg7uxcpw==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "697924c8c1841cf6eb0cdcff",
                "tag_name": "Terlahir Kembali"
              },
              {
                "tag_id": "697929abbddd0319740c02b6",
                "tag_name": "Penyesalan"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"698004f02593c82ff003e1b8\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3215999901294708},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":5},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.0075274379923939705,\\\"click_pred\\\":0.0027658052276819944,\\\"paywall_pred\\\":0.4680024981498718,\\\"pay_pred\\\":0.00011009549052687362,\\\"play_time_pred\\\":0.505722165107727,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.007527438,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":84,\\\"click_pred_index\\\":208,\\\"paywall_pred_index\\\":61,\\\"play_time_pred_index\\\":8,\\\"pay_pred_index\\\":145}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Dia pikir dia tak butuh pria itu. Ternyata dia salah.",
            "score": 8541,
            "like_count": 27825,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"698004f02593c82ff003e1b8\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3215999901294708},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":5},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.0075274379923939705,\"click_pred\":0.0027658052276819944,\"paywall_pred\":0.4680024981498718,\"pay_pred\":0.00011009549052687362,\"play_time_pred\":0.505722165107727,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.007527438,\"is_new_user_feature\":\"\",\"origin_score_index\":84,\"click_pred_index\":208,\"paywall_pred_index\":61,\"play_time_pred_index\":8,\"pay_pred_index\":145}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "69c644b0e422ab28730c757b",
            "book_type": 1,
            "book_source": 15,
            "book_title": "Istri Cantik Temani Tahun Baru",
            "book_pic": "https://v-img.crazymaplestudios.com/images/32cc3700-2e58-11f1-84ad-6b5693b490dc.jpg",
            "special_desc": "Untuk menghindari tekanan pernikahan, Fiona secara tidak sengaja bertemu Adrian, seorang pemuda desa yang menyembunyikan latar belakang keluarganya, dan mereka berpura-pura jadi pasangan.\nAdrian tidak tahu bahwa Fiona adalah direktur eksekutif di perusahaannya hingga ia dipindahkan menjadi asistennya. Saat keluarga mulai ikut campur, identitas Adrian perlahan terungkap dan cerita pun mulai memanas.",
            "chapter_count": 63,
            "theme": [
              "Identitas Tersembunyi"
            ],
            "collect_count": 1484924,
            "init_collect_count": 1234,
            "read_count": 94858983,
            "t_book_id": "504400000000004230",
            "online_at": 1775235600,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "y65gbi7gec",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "x6xax9eo3g",
              "duration": 171,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/7492510f0e3d33cd.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "UQjUu23sKeOmxW9rAUYvMpaXGfKWAJL8G00wtsMDJuKqCDf1SPWPOtG0tfE8i5tjqMqo/vn8vHR7ZpQsXoaYJtBuTjw3NU3DfPYJaOZ2wD0E34lIcDytV39oOVMEwX5AyznSfxfl9jIpj/9kdjGZQruMWRYtl/F6F9P7Np21+E9NW1WIAfdAs+wbsSr9ZAahQekqGYUQQKfz1EGRylEBUUNNrajqlDt/kBmkD5Spk2qjEYXUgu92zap7o0HuTFhlV63VY+01/ukAfDM4DiP3WhqOVaNIg7PWx/F0HDoQyFqBMtyt4Pi3ztIVizQWuC1TlDJFHkiVM/LU0KuxxUgEpFt6/DkpfFywdXNeJukV3AAUs53Gk6kgl5f3gdV/2wxjGZJ7oGiEAN9fouIBFf0JELuRVVNDW1A1n/+HbTiEw96dHU1tQJ6kQCxAvQm9iCgQf+QTARo/OsxnkX37xEJsewwXoHTyk55anUDGtScw1663M4+zNYsY9IlTUYmKFpsx/HBdYdnNYyO40S1CE84nAU0+Ja03w1V4K6B+qG04A1Adrtj8tHUzG0VemleLwqrOi7koRBlakK7YpzCch6O4wEtlQpD1K4AWIOPk/AX6Nx8pwPWLprGYUWIM/avmp6Kcn1vPhqjsi8rTzKTt0h5FhQ==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "66124bba32b773444c0609c9",
                "tag_name": "Identitas Tersembunyi"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"69c644b0e422ab28730c757b\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3815999925136566},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":6},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.007313605863600969,\\\"click_pred\\\":0.002688602777197957,\\\"paywall_pred\\\":0.4526817202568054,\\\"pay_pred\\\":0.00032964919228106737,\\\"play_time_pred\\\":0.418598473072052,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.007313606,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":88,\\\"click_pred_index\\\":210,\\\"paywall_pred_index\\\":65,\\\"play_time_pred_index\\\":45,\\\"pay_pred_index\\\":58}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {
              "name": "Top Tahunan No.1",
              "ranking_period": 4
            },
            "item_type": 1,
            "share_text": "Bermula dari kebohongan sederhana untuk menghindari perjodohan, kini berubah menjadi permainan berbahaya penuh rahasia...",
            "score": 94437,
            "like_count": 261972,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 17,
              "color": "#FFE52E2E",
              "text": "Populer",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"69c644b0e422ab28730c757b\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3815999925136566},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":6},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.007313605863600969,\"click_pred\":0.002688602777197957,\"paywall_pred\":0.4526817202568054,\"pay_pred\":0.00032964919228106737,\"play_time_pred\":0.418598473072052,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.007313606,\"is_new_user_feature\":\"\",\"origin_score_index\":88,\"click_pred_index\":210,\"paywall_pred_index\":65,\"play_time_pred_index\":45,\"pay_pred_index\":58}}",
            "rank_level": "Top1",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a4604c49c68c1bca5045cec",
            "book_type": 1,
            "book_source": 1,
            "book_title": "Mata X-Ray Menembus Hatimu",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500000000000000478/37a8be7b-cd98-43cc-9870-092784ec1ac6.jpg",
            "special_desc": "Setelah diputuskan pacarnya, Eric, CEO merek mewah dengan penglihatan X-ray, memakai kemampuan dan percaya dirinya untuk melawan influencer arogan, sambil memenangkan hati gadis paling populer di sekolah.",
            "chapter_count": 62,
            "theme": [
              "Dewasa Muda",
              "Pahlawan super"
            ],
            "collect_count": 71764,
            "init_collect_count": 1672,
            "read_count": 2387747,
            "t_book_id": "500000000000000478",
            "online_at": 1783420187,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "mcpq2822ou",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "k2jv5eeajh",
              "duration": 177,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/9e796c37ee01fd80.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "wUObFK2S4hqvm84N9bHV3Y2n8TONhHMOqF1Afkyrro0tyVlG5wr/dCn+YncPf8MVkbyf97bm3XPyoaE5bgdX62N43E2Yu8cnoWTF4aLDJHdju3Xx3TxsgzBjLiMY7cyI50Xwnn+5M7yz0uVgccG1PKz545BQVQOVtfsvyrsXwHG8ECmlxQW7vpEFbeHeUh7rPBpaUkAkR6Q/dEf6lNjJHiE/L6Q3pJoMII9iFlNHBYYn080+g98audOs598uk/P7aF2vVqzCY9oqiWVo8BThzm65yL3nxkYmL1kgqzGk84B9Nvnpv0PuSaBKoZCeTkc9IhaBSmvBISeECj/Rt5QTYU2RGI+wUiytNN9g8UwGCVon46dS7MskPd6S29d/3xffAeybjBmOShjZuhq5eQLvoiZ9CSm1KvflFBkTbYRndmGbhV5xuyoFsCuB8Uqp6yrEq/8IM0f2FczCOvL9OR7zsaXnAweU3YjWlnMY4MjE5OQS+8/e0OiVPVbb65z0LarkUZITrn0+CTmfbbV9ugUKkpOq1Waf5TeI7aYXZCfjcmgs/yDZvxEm//+qg/YU7IgGjOBgCFhMyA4LrD1PYLYb87U95dtuMFljvg/5S6WiETz7sSOuEPxqYNFbAmW4o6cofr62rJRm1wHJT7q2JQxRNg==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979260956164594ab08bf2b",
                "tag_name": "Dewasa Muda"
              },
              {
                "tag_id": "69792cbaea504a39050e2fe9",
                "tag_name": "Pahlawan super"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a4604c49c68c1bca5045cec\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3336000144481659},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":7},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.006337983999401331,\\\"click_pred\\\":0.007808804512023926,\\\"paywall_pred\\\":0.36921510100364685,\\\"pay_pred\\\":0.0005276203155517578,\\\"play_time_pred\\\":0.2688223123550415,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.006337984,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":99,\\\"click_pred_index\\\":153,\\\"paywall_pred_index\\\":96,\\\"play_time_pred_index\\\":142,\\\"pay_pred_index\\\":41}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "CEO merek mewah. Kemampuan penglihatan X-ray. Drama SMA.",
            "score": 13911,
            "like_count": 36681,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {},
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a4604c49c68c1bca5045cec\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3336000144481659},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":7},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.006337983999401331,\"click_pred\":0.007808804512023926,\"paywall_pred\":0.36921510100364685,\"pay_pred\":0.0005276203155517578,\"play_time_pred\":0.2688223123550415,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.006337984,\"is_new_user_feature\":\"\",\"origin_score_index\":99,\"click_pred_index\":153,\"paywall_pred_index\":96,\"play_time_pred_index\":142,\"pay_pred_index\":41}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "69a10c15851589d5e00e5c38",
            "book_type": 1,
            "book_source": 1,
            "book_title": "Kakakku Sang Ratu Perang",
            "book_pic": "https://v-img.crazymaplestudios.com/images/034febb0-e9e4-11f0-84ad-6b5693b490dc.jpg",
            "special_desc": "Ditinggalkan orang tua, Catherine dan Grace Blackwood tumbuh saling mengandalkan. Di pesta pertunangan Grace, Catherine yang baru pulang dari misi penyamaran justru direndahkan. Saat Grace dikhianati, Catherine mengungkap identitasnya sebagai Ratu Perang dan membuat semua orang menyesal.",
            "chapter_count": 68,
            "theme": [
              "Militer",
              "Pahlawan Wanita Kuat"
            ],
            "collect_count": 1889068,
            "init_collect_count": 1610,
            "read_count": 95338551,
            "t_book_id": "500001000000000443",
            "online_at": 1773126370,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "o5xchsy4n0",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "y6h32bth87",
              "duration": 146,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/234d54026bdff244.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "UQjUu23sKeOmxW9rAUYvMqk9m0hF/opt7ISwVEGcl3IRmlYbI3aAXbljJMOysXnZeGSvRZQVSLcIDrNx0kIYPZWB9XjWZlAos1QD7TojICw4d1jX8gLJ3JMERINpYP2NOkuk6zekshRYplATrE+csFciK5tbDoztUMgayc9oGTJjAOU4LmhVWKM+eYBj5F8CZij4tB6oqzTz9IhtfT/86H8H+Y4uyCeCcDcSdXpfZN02PX+gC512NJ1ASY937pZt7YWXKUueGszkWcX6VnWvVTNOX+zV8c8XWwM6AcV7bwt1Z/Tw7lBVRUja/cOpFy1eBEQetYxLQ+JuPEQGrZiIXjyNtRHFIGeWZSnyUPu9iy7Cn8G2dWsSIGVUajd3bv4wQkFqqASvrV4sS3Prn/3Wqw1xm+AgOgrW5CCdoT7vBL12GnE6syAhc1mPkl/CTFlgI8dFKsEbKxdj9UnQYXsCOmVDnLEOC1+XucAIupYB96ZFBK9g5Nol7x9Y8UWElSC7U0Npd6MqXg8gRxMuYcNbT/Muj/JXX+p3prcv8HORSB5e2OpWcchuqLO11DKIzj+3Wr0B7U0dVrSCMopujiPXfkWv/FxqB/+WOvJuhHI0gz5tlyWky6VcK0hREh7rKwiclB8SEal3YUawnGDd5oEUJA==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "69792438a11b08657d04264b",
                "tag_name": "Militer"
              },
              {
                "tag_id": "69792ca1bb0b7aac1603dece",
                "tag_name": "Pahlawan Wanita Kuat"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"69a10c15851589d5e00e5c38\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3513999879360199},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":8},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.006279680412262678,\\\"click_pred\\\":0.004146873950958252,\\\"paywall_pred\\\":0.441280722618103,\\\"pay_pred\\\":0.0001051382496370934,\\\"play_time_pred\\\":0.36596250534057617,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.0062796804,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":102,\\\"click_pred_index\\\":190,\\\"paywall_pred_index\\\":68,\\\"play_time_pred_index\\\":77,\\\"pay_pred_index\\\":151}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {
              "name": "Top Tahunan No.2",
              "ranking_period": 4
            },
            "item_type": 1,
            "share_text": "Kakakku? Seorang Ratu Perang?",
            "score": 59994,
            "read_episode": 2,
            "like_count": 2669965,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"69a10c15851589d5e00e5c38\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3513999879360199},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":8},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.006279680412262678,\"click_pred\":0.004146873950958252,\"paywall_pred\":0.441280722618103,\"pay_pred\":0.0001051382496370934,\"play_time_pred\":0.36596250534057617,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.0062796804,\"is_new_user_feature\":\"\",\"origin_score_index\":102,\"click_pred_index\":190,\"paywall_pred_index\":68,\"play_time_pred_index\":77,\"pay_pred_index\":151}}",
            "rank_level": "Top2",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a8e58d1159c1a2c280d34d7",
            "book_type": 1,
            "book_source": 45,
            "book_title": "Tidur dengan Kakak Iparku",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504200150000006360/4743765a-3c0d-4c71-917b-e65ed38593f1.jpg",
            "special_desc": "Pernikahan aliansi Bella berubah menjadi mimpi buruk saat dia mengetahui tunangannya berselingkuh. Demi membalas dendam, Bella tidur dengan pria asing yang ternyata Damian Gotti, bos mafia berkuasa sekaligus kakak tunangannya. Kembali terjerat Keluarga Gotti, Bella harus menghadapi rahasia berbahaya dan cinta terlarang. Namun, Damian justru melindunginya, membongkar kejahatan adiknya, dan bersama Bella merebut kembali takhta mafia.",
            "chapter_count": 45,
            "theme": [
              "Mafia",
              "Peningkatan dari Ex"
            ],
            "collect_count": 91402,
            "init_collect_count": 1102,
            "read_count": 5533613,
            "t_book_id": "504200150000006360",
            "online_at": 1788849164,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "d1dg24qsp3",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "d1dg24qsp3",
              "duration": 130,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/96603e4f575c8a95.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "8jnB7teRYVcgIT/sPROpcA6nI5HdRAT8+sIrmSrSv0qyH8rQmFtqX1dsjGzGfuy6CJ0dZOMwpls8T4CGssEK1VMgIChI79D6RYvbaFsbIhjoCX9zAStQnrpTk6xqgrVzwL2giHjeJZ5ma82kEtcDM4V/Guuun3vRWEr6ff6OqyxdTzGjgKweTZbV25uT/BsM+1mwJ21AHbdkEnEV5MkUdGVxfq3d1X0hfthm/mTIer35B7JnWqbUg5lwAukWohKd877gcyuBTQ5YfOKrmjQugqIRzPyQVKi9Mwa1OrRIHMmT1KL1pPRwJEne3041MX6ZTRBz41U7tis07owlQOPJ89Tu0EGzovUzKotvnE6TQf8JqwORrnBDZW52T/R+O8twfmRqSOcD9Y6uynfLAmXG/yeb0GSow13SpjC8X14qSttZUKVMvdVKWLNFzexazeza2aYho6DPGPPt6vsLunQ9c81W7KfNPZmgBoZu8mDOPXz1qhE8qIuP/NIdnqKd9l7i7qQq8cvGIlqdN1Nho7swaJ1aUtLZRsU/vIy5RfgURcXH+bmRUwUC3URpn/cRwl1LeV0NMs3NJGyMopf3KUEYYaPeNeR2AXTJLj8/zrc/jM9Pgl87GT6gLMvTxB620j/jRSnYOVIoGOpYKao22Wt7O/MKsJAJeA2PgioookLSq0I=",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979235891281db9e40bca5d",
                "tag_name": "Mafia"
              },
              {
                "tag_id": "69792d44647edf0dd108d639",
                "tag_name": "Peningkatan dari Ex"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a8e58d1159c1a2c280d34d7\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.40209999680519104},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":9},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.08812054246664047,\\\"click_pred\\\":0.1027134358882904,\\\"paywall_pred\\\":0.8230223059654236,\\\"pay_pred\\\":0.002156198024749756,\\\"play_time_pred\\\":0.5356976985931396,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.08812054,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":3,\\\"click_pred_index\\\":6,\\\"paywall_pred_index\\\":7,\\\"play_time_pred_index\\\":6,\\\"pay_pred_index\\\":3}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Dikhianati oleh tunangannya, tanpa sengaja dia tidur dengan seorang bos mafia sekaligus kakak tunangannya sendiri.",
            "score": 77568,
            "like_count": 33784,
            "book_genre": 15,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 17,
              "color": "#FFE52E2E",
              "text": "Populer",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a8e58d1159c1a2c280d34d7\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.40209999680519104},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":9},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.08812054246664047,\"click_pred\":0.1027134358882904,\"paywall_pred\":0.8230223059654236,\"pay_pred\":0.002156198024749756,\"play_time_pred\":0.5356976985931396,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.08812054,\"is_new_user_feature\":\"\",\"origin_score_index\":3,\"click_pred_index\":6,\"paywall_pred_index\":7,\"play_time_pred_index\":6,\"pay_pred_index\":3}}",
            "rank_level": "Top10",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "692416cc36ab29f79e0e4fbb",
            "book_type": 1,
            "book_source": 1,
            "book_title": "Misi 30.000 Kaki: Pertaruhan Nyawa",
            "book_pic": "https://v-img.crazymaplestudios.com/images/c7745060-b0c5-11f0-a06b-bdb674869ea1.jpg",
            "special_desc": "Triliuner ternama Derek Wolf sekarat dan memerintahkan dokter bedah elite bernama Shaun membawa ginjal donor untuk transplantasi rahasia lewat pesawat pribadi. Namun, penerbangannya tertunda gara-gara Kim dan putrinya, Jessica, yang juga merupakan tunangan cucu Derek. Setelah pesawat lepas landas, Kim mendadak mengalami serangan jantung. Shaun berhasil menyelamatkannya, meski harus mematahkan beberapa tulang rusuknya. Bukannya berterima kasih, Jessica malah menuntut Shaun minta maaf dengan cara yang merendahkan. Ketika Shaun menolak, Jessica mengancam akan menghancurkan ginjal donor itu. Shaun terpaksa mengungkap kebenaran bahwa organ itu ditujukan untuk Derek Wolf. Jessica tidak percaya, sampai akhirnya dia menghancurkan kotak itu dan melihat nama yang tertera di sana: Derek Wolf, kakek dari tunangannya sendiri.",
            "chapter_count": 65,
            "theme": [
              "Laki-laki",
              "Pahlawan super"
            ],
            "collect_count": 405984,
            "init_collect_count": 1608,
            "read_count": 25317266,
            "t_book_id": "500001000000000345",
            "online_at": 1764932418,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "02vlie83jn",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "q5184gj1cf",
              "duration": 126,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/67249bdb28b76856.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "UQjUu23sKeOmxW9rAUYvMswPdap5oN7Jc7sXZVoeWdXIULFODB8W14fTfmDpuyIKibavqdPEos0TwaGtf1MGvMwJDjHdGpn1H957bFIsNjvDdtgbNGy82jQN0O0AjNHA4sm25iEsIIn3uWBNfie1F0USYUMU/zqtwOV9ka6lkYpR38n89aJ2dYsLK8eF8h9qWYOD4odGsG/J9u+UvzhZ9y8Ed8UKoKWg3OYGu2aGvQLmpi7GOJQgUL/M/9mugWaOo7kx2agQwA4Df4JB3hlgDa/Dt6uUjJTn8rnR0SEwwpa3Ecfr79pQJJSl18nmORO++lgHR3tytd3iiijT7OBx++jxEB/q5NDJPMSb++vly5Wda+yRAbHVseZhjM7HA5txAyExABNmtpMbLzJz1dwzEimqPyxzr+AGJZM8rCFJoT7DWK64AKtnF/dzY5VN/Ei7yhgpxs0kn9OaCVermY0B86IDKzNOTe09Js9jbQbZOizCvcrsWekbXPdeSRQiMSO/KhD7saMwbYikPKNqJ1rdhMmuwSYKYIUKLOkhwUyDa0TuqomihCu1UDSHRDBOwzI04t5J1vrdaBdJapBIyK7LY/oPQkkAI30VxjqXC9PygcBaQJCITAYXwV55GgYLqFHiRUG1M0wZGuMx4Oo2eI3A7w==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979237ebed521eb8c083a44",
                "tag_name": "Laki-laki"
              },
              {
                "tag_id": "69792cbaea504a39050e2fe9",
                "tag_name": "Pahlawan super"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"692416cc36ab29f79e0e4fbb\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.33239999413490295},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":10},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.005779528524726629,\\\"click_pred\\\":0.00349581241607666,\\\"paywall_pred\\\":0.5158800482749939,\\\"pay_pred\\\":0.0000766842786106281,\\\"play_time_pred\\\":0.29130297899246216,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.0057795285,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":110,\\\"click_pred_index\\\":196,\\\"paywall_pred_index\\\":45,\\\"play_time_pred_index\\\":131,\\\"pay_pred_index\\\":173}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Astaga! Dia minta jendela pesawatnya dibuka!",
            "score": 9742,
            "like_count": 4422221,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"692416cc36ab29f79e0e4fbb\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.33239999413490295},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":10},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.005779528524726629,\"click_pred\":0.00349581241607666,\"paywall_pred\":0.5158800482749939,\"pay_pred\":0.0000766842786106281,\"play_time_pred\":0.29130297899246216,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.0057795285,\"is_new_user_feature\":\"\",\"origin_score_index\":110,\"click_pred_index\":196,\"paywall_pred_index\":45,\"play_time_pred_index\":131,\"pay_pred_index\":173}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a38f6e862b46266d506076f",
            "book_type": 1,
            "book_source": 2,
            "book_title": "Sistem Manjakan Istri Kembar",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/509000000000005331/a8430f1a-154a-46bd-8d69-a4bd2543f37e.jpg",
            "special_desc": "Jimy, pekerja kantoran modern yang terlempar ke tubuh seorang cendekiawan miskin, memperoleh sistem yang membuatnya makin kuat saat membahagiakan istrinya. Bersama Nayla dan Nayra, dia menumpas para penindas, menggagalkan konspirasi, membantu sang Maharani menyingkirkan musuh politik, lalu memilih meninggalkan kejayaan demi hidup bahagia bersama keluarganya.",
            "chapter_count": 72,
            "theme": [
              "Sejarah",
              "Dari Nol ke Pahlawan"
            ],
            "collect_count": 258660,
            "init_collect_count": 1056,
            "read_count": 15837162,
            "t_book_id": "509001000000005331",
            "online_at": 1782814418,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "0zdmlym3ve",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "0zdmlym3ve",
              "duration": 166,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/6bc5edaf53b5119a.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "UQjUu23sKeOmxW9rAUYvMuA9HBGLuJ2P2pydafiUyG/IabUonY3jqA2u3WiOsw74hF1KUbNcOdZ2rdRmZ+Avap8GhVBQua4rql2mNuDMBN83anzCoO9ImMwqYPL1FugCJkATg8mC4id6AD2N5dzw1jqUP1GevaUgCRr+gDQ/C8QX/+fcp4wM0/7eOEzwnWYjAGq5Lpy9FtmB9YQTtsKaWICRMU86DpVxdxdXpxAJWEenV9sFieb4Dt6vRkrIz39avAhmIFeedBMET4NFWltbRlXuMmO5oniw5RTdD83Gd8WQa8PSiK4QE4fsqeb4+5J72aay+mBQ6pAx+ed/rIqqoa57vSRr777GaTvNc08l7E5QnX4kMKVVlw2Z/UqQFuvmyRMqb37YPtzVmB666qdev+/j8lrTgUskPThLfl/X8zFlExzXUY0xDYIE8uNeL7aPRIZutV43VjgD4OmtTpEv4V40rp37IctVldfpMF98yDIFy4V42WvTzWPiN4Z2DJ5gJlyJNX8WVf+3avy4vGteeK7xY3DNcpVv9hyX+W7C0dW48B+N5BgAN43v/aslpkpIEKf9RrK3PeLnSnZ94zZtKZbje22gh3iYI3ziZIlWMQv1euII7xZzuc25RXHAQbUrbtajkMyvfN7/TnBo2iaxuw==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "697922b6df7fa004af07596a",
                "tag_name": "Sejarah"
              },
              {
                "tag_id": "69792d64425b444a120172fc",
                "tag_name": "Dari Nol ke Pahlawan"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a38f6e862b46266d506076f\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.35679998993873596},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":11},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.006156055256724358,\\\"click_pred\\\":0.0024870370980352163,\\\"paywall_pred\\\":0.4337735176086426,\\\"pay_pred\\\":0.00013521280197892338,\\\"play_time_pred\\\":0.4427001476287842,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.0061560553,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":106,\\\"click_pred_index\\\":213,\\\"paywall_pred_index\\\":72,\\\"play_time_pred_index\\\":31,\\\"pay_pred_index\\\":123}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Dari budak korporat jadi tabib istana, bahkan Maharani pun ditolak!",
            "score": 103216,
            "like_count": 66624,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a38f6e862b46266d506076f\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.35679998993873596},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":11},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.006156055256724358,\"click_pred\":0.0024870370980352163,\"paywall_pred\":0.4337735176086426,\"pay_pred\":0.00013521280197892338,\"play_time_pred\":0.4427001476287842,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.0061560553,\"is_new_user_feature\":\"\",\"origin_score_index\":106,\"click_pred_index\":213,\"paywall_pred_index\":72,\"play_time_pred_index\":31,\"pay_pred_index\":123}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "683555e93faf19070b02fc90",
            "book_type": 1,
            "book_source": 1,
            "book_title": "Telan Aku Sepenuhnya",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500000000000000239/2ef577d6-b09b-4227-8eb8-7298a136d962.jpg",
            "special_desc": "Aku harus tahu cara melakukan oral. Ashton Levine adalah kakak sahabatku dan terlarang bagiku... sampai suatu malam liar di bawah meja bar mengubah segalanya. Aturan mainnya sebagai guru ranjangku sangat sederhana: Tanpa ciuman. Tanpa seks. Jangan jatuh cinta. Namun, makin jauh aku bereksperimen dengan tubuhku, makin kusadar berteman saja tidak cukup. Berlebihankah jika aku menginginkan dirinya seutuhnya?",
            "chapter_count": 57,
            "theme": [
              "Miliarder",
              "Romansa Erotis"
            ],
            "collect_count": 581128,
            "init_collect_count": 6645,
            "read_count": 19890407,
            "t_book_id": "500000000000000239",
            "online_at": 1777281380,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "4lulagoxrp",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "cv6gh02561",
              "duration": 77,
              "video_pic": "https://v-mps.crazymaplestudios.com/vtt-m3u8/303467198838476800/96bb780abd89b6ac6d1cb630068c4f28/cover.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0,
              "vtt_lang": [
                "in",
                "en",
                "es",
                "pt",
                "ja",
                "de",
                "fr",
                "pl",
                "ar",
                "ro",
                "ru",
                "th",
                "ko",
                "tr",
                "zh-TW",
                "it",
                "cs",
                "bg",
                "vi"
              ],
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979218e9e339e7cd60709b8",
                "tag_name": "Miliarder"
              },
              {
                "tag_id": "697926f456acfb2fe905ab09",
                "tag_name": "Romansa Erotis"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"683555e93faf19070b02fc90\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.39469999074935913},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":12},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.005670232232660055,\\\"click_pred\\\":0.013436198234558105,\\\"paywall_pred\\\":0.3461805582046509,\\\"pay_pred\\\":0.00004626830923371017,\\\"play_time_pred\\\":0.32586991786956787,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.005670232,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":112,\\\"click_pred_index\\\":114,\\\"paywall_pred_index\\\":109,\\\"play_time_pred_index\\\":108,\\\"pay_pred_index\\\":196}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Aku butuh pelajaran ranjang dari kakak sahabatku...",
            "score": 17007,
            "like_count": 186680,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 16,
              "color": "#FFE52E2E",
              "text": "Trending",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"683555e93faf19070b02fc90\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.39469999074935913},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":12},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.005670232232660055,\"click_pred\":0.013436198234558105,\"paywall_pred\":0.3461805582046509,\"pay_pred\":0.00004626830923371017,\"play_time_pred\":0.32586991786956787,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.005670232,\"is_new_user_feature\":\"\",\"origin_score_index\":112,\"click_pred_index\":114,\"paywall_pred_index\":109,\"play_time_pred_index\":108,\"pay_pred_index\":196}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a744177ea7e3b47fd09fb95",
            "book_type": 1,
            "book_source": 45,
            "book_title": "Ayahnya Menjadikanku Miliknya",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504200000000005968/876a9096-ce83-41a0-abc2-22d317643003.jpg",
            "special_desc": "Memergoki tunangannya selingkuh dengan sahabatnya menjelang pernikahan, Flora kabur dan terlibat cinta satu malam dengan pria asing tampan. Tanpa disangka, pria itu ayah mantan tunangannya, dan ia menyimpan rahasia kelam. Akankah Flora pasrah pada gairah, atau kembali melarikan diri?",
            "chapter_count": 57,
            "theme": [
              "Perbedaan Usia",
              "Romansa Erotis"
            ],
            "collect_count": 82400,
            "init_collect_count": 1468,
            "read_count": 3309632,
            "t_book_id": "504200000000005968",
            "online_at": 1787907170,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "3gvawm7fj6",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "3gvawm7fj6",
              "duration": 99,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/94d9b1c3cd24acef.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "bR7Q7F1pwy/5VRtJ/mVzMYtvXh7slBpGmztxb+ZBkVGB1sJyktxRJ+LUwDDg+n752xQ2LjIHlz/smKO7zjAds0dJ6ydz0kXxvcK91qj1Stj9LhrNCJsF4tk2Px2iOiauJn2JNfZT/RFKrvvsOjCmLzvSe1Y067x9rjqDbAPMEufI/lZKbLsBbB6fRTU+VMbo9iEFBVvKZSiXuJDGHsdSA2qNEqoT35zzbIkVf78makOL+5CMtskzRBaowkzGV6oCdkjsDf7L2jhZfjTyX2LdthVfvEQlAl4dAduX1ZI1PZ1Bx0Em3K794aWFbQsOZViKGKYaBAN5eKkMI3VPouucUSi2BZnQ+7e+lRZFTxGZuvOscK9EaCvM6SfQu4WtVWk8nLfx+dPd7KMqJFsOodfHwPOtSw+6BIJTaznmlBSfoN/4zdNYqOV3W9WVQMtJuWJQEKeNrPZObTIIITdPrVReEXnqq+AW1NM8cr+uoqjvvzOXqJvrK1V96rDLlWNlR0isgrHO2XLKhBVeDzDqBZbOMkYj83JlJU1dxM3JivZV7N2Fr/GnM/NBgOneoybV370kugjObIJAz4f24v+RNqgUTMUgIpt+5R9tBqBBZZB0R+w9CkOf40wPA4UzAI+Z5adr1cPhWjk/o2D3JQJOt+4/Wg==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "697921622b23e0a1980fd1e6",
                "tag_name": "Perbedaan Usia"
              },
              {
                "tag_id": "697926f456acfb2fe905ab09",
                "tag_name": "Romansa Erotis"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a744177ea7e3b47fd09fb95\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.392300009727478},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":13},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.00597714027389884,\\\"click_pred\\\":0.01120668649673462,\\\"paywall_pred\\\":0.2947482466697693,\\\"pay_pred\\\":0.00006004008901072666,\\\"play_time_pred\\\":0.47220247983932495,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.0059771403,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":107,\\\"click_pred_index\\\":128,\\\"paywall_pred_index\\\":130,\\\"play_time_pred_index\\\":19,\\\"pay_pred_index\\\":183}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Setelah memergoki tunangannya selingkuh dengan temannya, Flora jatuh ke pelukan pria asing menawan—hingga ia tahu pria itu ayah mantan tunangannya, yang menyimpan rahasia kelam.",
            "score": 16593,
            "like_count": 33427,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {},
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a744177ea7e3b47fd09fb95\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.392300009727478},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":13},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.00597714027389884,\"click_pred\":0.01120668649673462,\"paywall_pred\":0.2947482466697693,\"pay_pred\":0.00006004008901072666,\"play_time_pred\":0.47220247983932495,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.0059771403,\"is_new_user_feature\":\"\",\"origin_score_index\":107,\"click_pred_index\":128,\"paywall_pred_index\":130,\"play_time_pred_index\":19,\"pay_pred_index\":183}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6926b28aadc716bad70c4ee8",
            "book_type": 1,
            "book_source": 1,
            "book_title": "Panduan Menggoda Pria Mapan",
            "book_pic": "https://v-img.crazymaplestudios.com/images/481b7510-c442-11f0-84ad-6b5693b490dc.jpg",
            "special_desc": "Sophie hanya seorang intern, sampai pesan pribadinya yang berisi fantasi tentang sang bos tersebar. Dia malu, patah hati, tapi masih mencintainya. Saat bahaya datang, Jesse menyelamatkannya. Sekarang, mereka tinggal serumah. Tatapan malam berubah jadi rahasia. Padahal, godaan sama sekali bukan bagian dari rencana.",
            "chapter_count": 68,
            "theme": [
              "Perbedaan Usia",
              "Romansa Erotis"
            ],
            "collect_count": 447459,
            "init_collect_count": 1602,
            "read_count": 23675040,
            "t_book_id": "500001000000000362",
            "online_at": 1765273552,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "s7e7glzj2v",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "znfz1howar",
              "duration": 108,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/48d3114dc55ccd0a.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "j4lVkXqGbjvFCBpqFoupLHWCTyvncWrcXQX/K2fDB93qBziYjqH4MYw5KWfqxkMLorWaSZcTjkEdacornbvJBC9mmWEMP+A1YCa/cm3VwNoqpCax1pGfkRl4xRJ4zsLM/4OBPGPF73wQEd59unq/KSGN38Q+IM1Z4DHanUnNmxfX5teme6Kx1M4+TMmCpI+97B2Qp6rBCht1rjf16YMOfNYVbmSLv4GxPTb3AgGC+2/MYo0vy3njY2FWp2MuMTRcXLHqzDNR2xszMVkshL3JEkrHwoAlSahJlAKpLY9yK9VXQ3Dw1ZZs7TZAMxy8085v9bcO08KXx/zyV7C+o1UATnzMGoQ5QON/0sX/Dp7WuM+fakK+VFrM6gOif7+hVXf85d3OprkmLXzXNFltGsvyh0B1k8K44sOEfd7AbxeHpj0FqUd4ghtJ4icsspvd2FPl2IKo+qnah5wZwq9GpQOzVeqiaYOmmaJdNppuVELSQisp5RT/Pp/f0lulYRAkfe0Im+bLUO2emfeXEEp6l/nhcU7XFO/GSe8Ftz5lF1U/g4g4+68ZbDbp7sxHZD+SXP9BSpV0CDGwu9p6yxpZ4ZsV8on23P9T8Mugf4ihumTRYbYSpCc+WDHW3ZgGEECnNnGnYjmmTbBiXsxTBENf+VPkzQ==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "697921622b23e0a1980fd1e6",
                "tag_name": "Perbedaan Usia"
              },
              {
                "tag_id": "697926f456acfb2fe905ab09",
                "tag_name": "Romansa Erotis"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6926b28aadc716bad70c4ee8\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3292999863624573},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":14},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.005543624050915241,\\\"click_pred\\\":0.00440108822658658,\\\"paywall_pred\\\":0.4255034327507019,\\\"pay_pred\\\":0.00006118061719462276,\\\"play_time_pred\\\":0.3569185435771942,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.005543624,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":116,\\\"click_pred_index\\\":188,\\\"paywall_pred_index\\\":75,\\\"play_time_pred_index\\\":89,\\\"pay_pred_index\\\":181}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Aku jatuh cinta pada sahabat ayahku. Bagaimana cara membuatnya takluk?",
            "score": 24873,
            "like_count": 5718211,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6926b28aadc716bad70c4ee8\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3292999863624573},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":14},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.005543624050915241,\"click_pred\":0.00440108822658658,\"paywall_pred\":0.4255034327507019,\"pay_pred\":0.00006118061719462276,\"play_time_pred\":0.3569185435771942,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.005543624,\"is_new_user_feature\":\"\",\"origin_score_index\":116,\"click_pred_index\":188,\"paywall_pred_index\":75,\"play_time_pred_index\":89,\"pay_pred_index\":181}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "69d777dcd881afc0ea0c7a5e",
            "book_type": 1,
            "book_source": 2,
            "book_title": "Penjaga Bangkit: Siapa Berani Lawan?",
            "book_pic": "https://v-img.crazymaplestudios.com/images/a46d6640-284a-11f1-84ad-6b5693b490dc.jpg",
            "special_desc": "Karena semangkuk malatang, satpam kecil Julian Fernando berkenalan dengan CEO wanita Grup Fora, Olivia Sanjaya. Secara tak terduga dia tersengat listrik, dan kekuatan warisan kultivasi dari kakeknya, Komar Robert, dalam tubuhnya pun terbangun dan sejak saat itu dia mulai bangkit. Keluarga Robert? Keluarga Sanjaya? Memangnya kenapa? Aku, Julian, hanya melihat kekuatan, bukan latar belakang. Kalau tidak terima, kita bicara dengan tinju.",
            "chapter_count": 80,
            "theme": [
              "Aksi",
              "Pahlawan super"
            ],
            "collect_count": 436527,
            "init_collect_count": 2382,
            "read_count": 37611908,
            "t_book_id": "509001000000004132",
            "online_at": 1776933978,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "enh2hqgxn0",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "enh2hqgxn0",
              "duration": 207,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/02b3b0388249566b.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "87PfyZsb7pZ36gLVHKOatgrORhVuUd2qxEj0ZRL5D7yWzr6Rh5uktRpAoVqKnX5ge3erSl7DhsGwjrXZC0zhM2dFCu+CY9ieaMEJq6dYP74EhZtoL+ZE10bMsg2QPSBvEIlc/hoVZuU2jjQGnNvBrn5cHk9Z/zti2d26n0s6i24+wd00Bv7ESIV+T8O0Kw+T21qGpg1C6HjWeZV0UAlwx7BGzOOro4JBPGk0abq99Ph38vyUnMZjticOjIXV0/JLHqj1C5FqC+DLY1+gdRREne76s40bVHhRHIfwiSbWU+gK6TGTHxZfutpNNF9jgP0yYYvTCfpCin1NOLGPrH1GwqZg+M2Hbm3/7DgtkZkJhBSsxKPyhUOKNZm6FEgoHbDegHRhllX7JC+IOLyo2Ru/MCXALcItL0ExmgtsbkI1d0SVdXdY+t34bX9Ex9Uz+qQV7tOMvb4W4Ocv8pdRFs5MwkierBJ+G20hlYUYmEV9r9/1D61FtlHcB4N91So6V8veEdVsSuqh97SVa8SpKmHxEyIAKKjbKNrXIEHibX0+4+13Lu9QThNcU7r1aAVMbsPDoLEMRK+fkXjTbtVBkTfuDaaf8Ih8aGs/CXIOD5B3JRQ7xOcQdFgOlfAWVQ4AZXGdrNTt+LcguhsmYkmZyvFrzQ==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979210aad30640b810929aa",
                "tag_name": "Aksi"
              },
              {
                "tag_id": "69792cbaea504a39050e2fe9",
                "tag_name": "Pahlawan super"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"69d777dcd881afc0ea0c7a5e\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3257000148296356},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":15},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.0057121338322758675,\\\"click_pred\\\":0.0030133426189422607,\\\"paywall_pred\\\":0.3961805999279022,\\\"pay_pred\\\":0.0001436173915863037,\\\"play_time_pred\\\":0.42096415162086487,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.005712134,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":111,\\\"click_pred_index\\\":205,\\\"paywall_pred_index\\\":85,\\\"play_time_pred_index\\\":44,\\\"pay_pred_index\\\":115}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {
              "name": "Top Tahunan No.11",
              "ranking_period": 4
            },
            "item_type": 1,
            "share_text": "Satpam paling brutal! Kekuatan dewa bangkit, menghancurkan keluarga kaya!",
            "score": 78533,
            "like_count": 124862,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"69d777dcd881afc0ea0c7a5e\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3257000148296356},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":15},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.0057121338322758675,\"click_pred\":0.0030133426189422607,\"paywall_pred\":0.3961805999279022,\"pay_pred\":0.0001436173915863037,\"play_time_pred\":0.42096415162086487,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.005712134,\"is_new_user_feature\":\"\",\"origin_score_index\":111,\"click_pred_index\":205,\"paywall_pred_index\":85,\"play_time_pred_index\":44,\"pay_pred_index\":115}}",
            "rank_level": "Top11",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "69a10c201c0d9ca2190ef135",
            "book_type": 1,
            "book_source": 1,
            "book_title": "Ikatan Sunyi: Jatuh Cinta pada Petani Duda",
            "book_pic": "https://v-img.crazymaplestudios.com/images/9e7ca670-e15e-11f0-84ad-6b5693b490dc.jpg",
            "special_desc": "Natalie dijodohkan oleh nenek dan keluarganya dengan Rhett, seorang petani duda yang membesarkan putrinya yang bisu, Ellie. Kehadirannya ditolak, dan Ellie sering ditindas oleh orang-orang di sekitar mereka. Perlahan, Natalie membangun ikatan dengan Ellie. Saat gadis kecil itu berbicara untuk pertama kalinya demi menyelamatkannya, segalanya berubah. Kini, Natalie bertekad melindungi cinta dan keluarga yang telah ia bangun, apa pun risikonya.",
            "chapter_count": 83,
            "theme": [
              "Pedalaman",
              "Pernikahan Kontrak"
            ],
            "collect_count": 1153896,
            "init_collect_count": 1656,
            "read_count": 78735250,
            "t_book_id": "500001000000002502",
            "online_at": 1773135110,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "j1njws44q9",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "g6it6migfk",
              "duration": 105,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/a9eab59b8111bd04.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "UQjUu23sKeOmxW9rAUYvMp5TtyJ6xUBbe1xfIdlv7lWtO+CuT3CqdI4M/SJAcliQCkuDZMEqkVS3/xWorjUs7tIQ2CqiX/mRSs5hBop1pHktxlW8ZfVpEDpG5k4pjxrql45yrCisXjCENYs5TnCFtsAdUBYH+lG8nlYMRqmBdvsUbEYsHhJVAEaIpuDCy8r7pKidd6ds0PJScBZzYrk0t/Q7LdfHaHVHB+hWZVzq74QDb6RD4dolAhHv7UJ5UPeiukKh9owpV9pt3gBAenUlZWilnQjQr5KJSa44HvOeS3Rn6VxzF2DrvljKbY6xl3rbymtkT/DJv5pkpOqPyyBzdkwsrMbOQ8Ov+1pxRX92mn0/s1G41PR/fcHIsw6D2jvp8UZG2PzE9kbxLaWIQnUVl9w3taCTTod2To9hJxqDuU4Sdr8CbycspdgzPPRxNN3K03Id112Re6/D5Xf7NOC6l+z3MdCj+ssM5+HwD0Igc8r1ElmQxsj08Vl22xOM9FFNN5lpCT+ozdx2qwqtj1l9RODZoKa8qtbvHLRxdwrnloa2G+SCF5BTN0hS1xc66AwWrXJxoynBf/xb7PLBRXPirdWQus7D+aMcsytiJrkbvTfK24ex09vr6uNBU7+468TS/HZ//LhJv2K7EtoEhnKEew==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "697921fadeff15a1580d3bef",
                "tag_name": "Pedalaman"
              },
              {
                "tag_id": "697929289d752c2dec071009",
                "tag_name": "Pernikahan Kontrak"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"69a10c201c0d9ca2190ef135\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3517000079154968},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":16},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.005440141074359417,\\\"click_pred\\\":0.002920299768447876,\\\"paywall_pred\\\":0.4339507818222046,\\\"pay_pred\\\":0.00010724688763730228,\\\"play_time_pred\\\":0.36458852887153625,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.005440141,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":119,\\\"click_pred_index\\\":206,\\\"paywall_pred_index\\\":71,\\\"play_time_pred_index\\\":79,\\\"pay_pred_index\\\":148}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {
              "name": "Top Tahunan No.4",
              "ranking_period": 4
            },
            "item_type": 1,
            "share_text": "Natalie menikahi petani yang memiliki putri bisu.",
            "score": 77135,
            "like_count": 10219167,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"69a10c201c0d9ca2190ef135\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3517000079154968},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":16},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.005440141074359417,\"click_pred\":0.002920299768447876,\"paywall_pred\":0.4339507818222046,\"pay_pred\":0.00010724688763730228,\"play_time_pred\":0.36458852887153625,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.005440141,\"is_new_user_feature\":\"\",\"origin_score_index\":119,\"click_pred_index\":206,\"paywall_pred_index\":71,\"play_time_pred_index\":79,\"pay_pred_index\":148}}",
            "rank_level": "Top4",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "69e0ee3361d01cba1a00b53f",
            "book_type": 1,
            "book_source": 2,
            "book_title": "Semakin Bertarung, Aku Semakin Kuat",
            "book_pic": "https://v-img.crazymaplestudios.com/images/589557e0-453d-11f1-acb2-c14bef828c82.jpg",
            "special_desc": "Pembunuh legendaris Aditya Jaya terlempar ke era Kekaisaran Aruna sebagai terpidana mati, tapi mengaktifkan Sistem Jadi Kuat dengan Membunuh.\nDari prajurit biasa, ia bangkit, menipu musuh, hingga menebas pemimpin Burman di tengah pesta kemenangan.\n\nNamun saat jasanya memuncak, ia justru dikhianati Istana…",
            "chapter_count": 71,
            "theme": [
              "Fantasi Tinggi",
              "Pahlawan super"
            ],
            "collect_count": 13688,
            "init_collect_count": 2217,
            "read_count": 1371116,
            "t_book_id": "509001000000003618",
            "online_at": 1777626550,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "h6fj6k3tay",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "h6fj6k3tay",
              "duration": 209,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/b3a701045dbb4470.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "UQjUu23sKeOmxW9rAUYvMjqEZ5TWJeevNSnZpcct//qIyriGyR15eevwNk0dqLWFW6pHmR9RpNO0RrbHYGQQvmMCeebi8HT/5kZu+sg9+L4imZqRJeDr/uuw7IG1w5CZmJziSf0t2lt0KZSuX26x0BDqkys5jYqlYzPNiotTHMgTldnU7VB99v9KlCYZy0DO86r0merE6mL/zwnngC5DnXXhuTbeBRRV9H13m29tQib6FjxGa1Br0Nfs7RNqlz7fC7UdAHDIfXsh3AWeGdJJBqJre/7WYU0kxObFVfJGe46//YDFPMmisyGwqWfEsTCbKFPVpvXDEGSzj+OW0LibWPia4pSEMlkPLDXUhCrzQfCKl6fw0HFqHv/cw39apRwWeLRsxa5EOJkxMFtztfl9zXE+yf3pToUdwyoQu2mFv0J2+YZCd5JnUcb3JjhHkAKxINfiLbpXWSo6jvxPjBMzDGDUCdncVuwmAhlVSkpj1DJBJfwVKpbiM3lo5qB4Nkn9bToVL55nXyxMKYkpaGCuipe0q9b3bNTo5o1ZTrF85M6SdoR1ZtF+k+LsGFg7MWBC4itpSJW+YP5j1kq+3KE1G8+3vXi+vt1tHEi8UG20k6abxcO38FUJgN9EBvbopBd9tjwyC91t/A9Ox285p7F+Qw==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979228985d52fffc305d6cb",
                "tag_name": "Fantasi Tinggi"
              },
              {
                "tag_id": "69792cbaea504a39050e2fe9",
                "tag_name": "Pahlawan super"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"69e0ee3361d01cba1a00b53f\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.32330000400543213},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":17},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.0054579367861151695,\\\"click_pred\\\":0.0027772188186645508,\\\"paywall_pred\\\":0.4050893783569336,\\\"pay_pred\\\":0.00004539786823443137,\\\"play_time_pred\\\":0.4992998242378235,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.005457937,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":118,\\\"click_pred_index\\\":207,\\\"paywall_pred_index\\\":81,\\\"play_time_pred_index\\\":11,\\\"pay_pred_index\\\":230}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Dari Terpidana Mati ke Kaisar—Legenda Tak Terkalahkan yang Ditebas dengan Darah!",
            "score": 3554,
            "like_count": 73894,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"69e0ee3361d01cba1a00b53f\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.32330000400543213},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":17},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.0054579367861151695,\"click_pred\":0.0027772188186645508,\"paywall_pred\":0.4050893783569336,\"pay_pred\":0.00004539786823443137,\"play_time_pred\":0.4992998242378235,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.005457937,\"is_new_user_feature\":\"\",\"origin_score_index\":118,\"click_pred_index\":207,\"paywall_pred_index\":81,\"play_time_pred_index\":11,\"pay_pred_index\":230}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "689950f9e8d4d64a25005ff1",
            "book_type": 1,
            "book_source": 1,
            "book_title": "Menemani Dokter Miliader Kejam",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500000000000000299/e0268b29-2c7e-47ac-a3de-522b6fc95765.jpg",
            "special_desc": "Violet, harus membayar biaya operasi ayahnya, memutuskan untuk menjual keperawanannya, tapi dokter baik yang dia telepon bertekad untuk menariknya kembali dari jurang keterpurukan. Namun, setelah mereka berdua berbagi malam yang panas dan tak terlupakan, Dax mendapati dirinya terpikat pada Violet meskipun dia mengira bahwa Violet hanyalah wanita mata duitan lainnya. Saat rahasia tergelap mereka terbongkar, akankah ikatan mereka yang rapuh ini bertahan?",
            "chapter_count": 68,
            "theme": [
              "Dewasa Baru",
              "Perlahan Membara"
            ],
            "collect_count": 643480,
            "init_collect_count": 614,
            "read_count": 44083569,
            "t_book_id": "500000000000000299",
            "online_at": 1755499775,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "ttsioh0r4f",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "as1tgg5rcx",
              "duration": 131,
              "video_pic": "https://v-mps.crazymaplestudios.com/vtt-m3u8/303180660485394432/1ea2540a3ff1a537d944f551d35785b4/cover.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0,
              "vtt_lang": [
                "in",
                "en",
                "es",
                "pt",
                "ja",
                "de",
                "fr",
                "pl",
                "ar",
                "ro",
                "ru",
                "th",
                "tr",
                "it"
              ],
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "69792494feb8436411091afb",
                "tag_name": "Dewasa Baru"
              },
              {
                "tag_id": "69792b87467005b88304631a",
                "tag_name": "Perlahan Membara"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"689950f9e8d4d64a25005ff1\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3391000032424927},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":18},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.00525172334164381,\\\"click_pred\\\":0.008051127195358276,\\\"paywall_pred\\\":0.30887746810913086,\\\"pay_pred\\\":0.00013947486877441406,\\\"play_time_pred\\\":0.3623484671115875,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.0052517233,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":122,\\\"click_pred_index\\\":150,\\\"paywall_pred_index\\\":123,\\\"play_time_pred_index\\\":82,\\\"pay_pred_index\\\":119}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {
              "name": "Top Tahunan No.13",
              "ranking_period": 4
            },
            "item_type": 1,
            "share_text": "Lepas bajumu. Itu perintah Dokter!",
            "score": 6843,
            "like_count": 91974,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 17,
              "color": "#FFE52E2E",
              "text": "Populer",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"689950f9e8d4d64a25005ff1\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3391000032424927},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":18},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.00525172334164381,\"click_pred\":0.008051127195358276,\"paywall_pred\":0.30887746810913086,\"pay_pred\":0.00013947486877441406,\"play_time_pred\":0.3623484671115875,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.0052517233,\"is_new_user_feature\":\"\",\"origin_score_index\":122,\"click_pred_index\":150,\"paywall_pred_index\":123,\"play_time_pred_index\":82,\"pay_pred_index\":119}}",
            "rank_level": "Top13",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a7934055f288c9db10229c3",
            "book_type": 1,
            "book_source": 45,
            "book_title": "Aku Kehilangan Suami Jin-ku",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504200150000005664/5437ede3-aa03-4399-b15d-7ccd819d97a8.jpg",
            "special_desc": "Elijah Baran adalah jin dalam lampu ajaib. Seorang miliarder menggunakan permintaan terakhirnya untuk membebaskan Elijah dengan syarat Elijah harus menikahi cucunya, Christine, selama 5 tahun! Saat 5 tahun hampir berakhir, Elijah menyadari Christine mungkin tidak akan pernah mencintainya. Dia menceraikannya.",
            "chapter_count": 51,
            "theme": [
              "Fantasi Tinggi",
              "Pahlawan super"
            ],
            "collect_count": 758353,
            "init_collect_count": 1423,
            "read_count": 35966716,
            "t_book_id": "504201150000005664",
            "online_at": 1786957886,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "r6yv3a2qwc",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "r6yv3a2qwc",
              "duration": 283,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/4a91c39997315580.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "UQjUu23sKeOmxW9rAUYvMp5TtyJ6xUBbe1xfIdlv7lWtO+CuT3CqdI4M/SJAcliQCkuDZMEqkVS3/xWorjUs7tIQ2CqiX/mRSs5hBop1pHktxlW8ZfVpEDpG5k4pjxrql45yrCisXjCENYs5TnCFtgcqMvq/Horfdn3LCPSgDWzM+LwcTk9Z1Za1zGeVdS8bhxshY2QAjwdL8KENdIUV0b0SJ+jgO734+y7yVjZxzIyKwYKzj2nfZHUAZuMSOTX2vdaagOqoulZP+i7uFmK55JAsJDyRgoNN5XQSWid0niJcO9N1iQf8ULw12i6AxQI7ymN44atSPFcdbcXQ1PH79d8cxF8E4H2umcNuY/GDnSwE63kocH575rf1SQj0B0OcruT8yveEc8z5U92dKKozKxIdsTLdryQ2fyMgIX+gFcDzcUHKSICX7UQlB4OBo6xfSavuZ4Voq91DFUlXmdFmS5ihtMWvWhjSlZz/XZg30hdK+kh2qZHKLZ+lBJRK8DgT95QapXhqO7QWAns5sHflK+BitAbXZUmcuT6y8JgzrnBMIln5026Cawg3/jMtvDxXWvk4B3mR+odBRInayv6ECBvZSZYodvKn7ZJjm0CdRw5sRm0rQ3UpKgdyfRxK9pdE6gf+gc1DaE0UM+akLaQWlQ==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979228985d52fffc305d6cb",
                "tag_name": "Fantasi Tinggi"
              },
              {
                "tag_id": "69792cbaea504a39050e2fe9",
                "tag_name": "Pahlawan super"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a7934055f288c9db10229c3\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.45719999074935913},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":19},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.0752548798918724,\\\"click_pred\\\":0.13682222366333008,\\\"paywall_pred\\\":0.7670767307281494,\\\"pay_pred\\\":0.001776367425918579,\\\"play_time_pred\\\":0.44381487369537354,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.07525488,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":4,\\\"click_pred_index\\\":4,\\\"paywall_pred_index\\\":13,\\\"play_time_pred_index\\\":30,\\\"pay_pred_index\\\":4}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Aku menikah dengan jin ajaib, tapi aku kehilangan dia.",
            "score": 124481,
            "like_count": 61850,
            "book_genre": 15,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a7934055f288c9db10229c3\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.45719999074935913},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":19},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.0752548798918724,\"click_pred\":0.13682222366333008,\"paywall_pred\":0.7670767307281494,\"pay_pred\":0.001776367425918579,\"play_time_pred\":0.44381487369537354,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.07525488,\"is_new_user_feature\":\"\",\"origin_score_index\":4,\"click_pred_index\":4,\"paywall_pred_index\":13,\"play_time_pred_index\":30,\"pay_pred_index\":4}}",
            "rank_level": "Top1",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a66be1083a362dba60dc21b",
            "book_type": 1,
            "book_source": 22,
            "book_title": "Identitasku Dicuri Pembantuku",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500000000130005352/8086cccf-c97d-4984-9d8b-2d7bf64e9d6f.jpg",
            "special_desc": "Demi menikmati kehidupan sekolah seperti gadis biasa, pewaris Grup MK, Seo Hae-in, menyembunyikan identitasnya. Namun, putri pembantu keluarganya justru mengaku sebagai pewaris MK dan merebut semua yang seharusnya menjadi milik Hae-in. Dianggap pembohong dan menjadi korban perundungan, Hae-in memutuskan untuk merebut kembali identitas, kehormatan, dan hidupnya.",
            "chapter_count": 94,
            "theme": [
              "Dewasa Muda",
              "Identitas yang Salah"
            ],
            "collect_count": 24183,
            "init_collect_count": 1220,
            "read_count": 1332587,
            "t_book_id": "500001000130005352",
            "online_at": 1785824797,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "8szltq5ig5",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "knpaoffcsg",
              "duration": 128,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/138023e23f6debb9.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "UQjUu23sKeOmxW9rAUYvMgRT9i0gt5XI4D8iIfyBvP/PjNXYdn/suQVmL5LDjkpchQShGhafxGXsRA1RBar7oRpJQY/rFIexSqKln171KBG4aU7HuoDpBuwZeLuY8es8riHtUnJCAtMwmnvpZLGz/wd8K0fvUK8MtGPf3oKtvcW0+MQAfV0rVD2kQtuCLyirQWFV0OKcGx/JUV7D8ysTvIb7QO+ccFScpGIt+CD12mfvK8urIzO+NNIytGxhdgDdilDZqF5kGLzIzs3Do+I6ov+BWQD2wvbsAKR58kh71XQ2+RZ0VQgmBcoGaX2LEOHKnP+JjEr4oaH2FyPjhvrR1eIRAtsy796Vifwmacf4+hDEg3HxVTATO1CowT9CP4zuQvIZpIYYb36ewCKHnp/nMGn/QSHOIkwOaj4ZJc/KLOyiSljSJAkSWJzykgg+xJsP9hh4zeulVOKn6gqS95j/dJpc14JB3mKUaB8OSKvdJ2pir9Co3jiB7r7k0QrstuRzvMcSW9tI3GR7EuVvWlGXvgFujRpH9QUIQSJJB3DjOoPy1Az/sJn26SfJAFof/ubDDiE0VLMUOe2bLDLxMd9RFKATtHtws2/UhildGu7U1mLa4oJvuHI8euocgrxNtnNNRAEQ3s2Y2zf0lFLvKr3+UA==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979260956164594ab08bf2b",
                "tag_name": "Dewasa Muda"
              },
              {
                "tag_id": "6979294078f07d6d7c0c6917",
                "tag_name": "Identitas yang Salah"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a66be1083a362dba60dc21b\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3488999903202057},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":20},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.00521691283211112,\\\"click_pred\\\":0.0033689572010189295,\\\"paywall_pred\\\":0.4152217209339142,\\\"pay_pred\\\":0.00015797476225998253,\\\"play_time_pred\\\":0.32126930356025696,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.005216913,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":123,\\\"click_pred_index\\\":199,\\\"paywall_pred_index\\\":77,\\\"play_time_pred_index\\\":110,\\\"pay_pred_index\\\":106}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Dua gadis. Satu takhta. Siapa pewaris yang sebenarnya?",
            "score": 6219,
            "like_count": 53524,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a66be1083a362dba60dc21b\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3488999903202057},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":20},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.00521691283211112,\"click_pred\":0.0033689572010189295,\"paywall_pred\":0.4152217209339142,\"pay_pred\":0.00015797476225998253,\"play_time_pred\":0.32126930356025696,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.005216913,\"is_new_user_feature\":\"\",\"origin_score_index\":123,\"click_pred_index\":199,\"paywall_pred_index\":77,\"play_time_pred_index\":110,\"pay_pred_index\":106}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a8ba7938db8c7372b0cf06e",
            "book_type": 1,
            "book_source": 2,
            "book_title": "Terlahir Kembali Membangun Kekaisaran",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/509000000000006361/870a2d4f-2410-4fb8-8d13-f29ae4385cdb.jpg",
            "special_desc": "Terlahir kembali di kerajaan yang telah runtuh, Gavin Thorne ditawan bersama sekelompok pengungsi wanita. Ia kemudian membangkitkan sistem pembangunan negara: makin banyak orang yang diselamatkan, makin besar imbalan yang didapat. Bersama pasukan wanitanya yang tangguh, ia akan mengubah tanah tandus menjadi sebuah kekaisaran.",
            "chapter_count": 79,
            "theme": [
              "Fantasi Tinggi",
              "Harem"
            ],
            "collect_count": 11668,
            "init_collect_count": 1237,
            "read_count": 532603,
            "t_book_id": "509000000000006361",
            "online_at": 1787729314,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "vvju84aloc",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "vvju84aloc",
              "duration": 150,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/ee23ee788d677bcb.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "n3e27vXHBLNYIYuxJgTWTzwf5KUK6SQSlArWqNiF4Qj/azx4CZobe0qNvrlT464HQwyuEXfGtpMBwxXGi+ppFB3KzvfenyittOfyQl/2TwN5NulLSuVIgQ0zUy+FcowSMopGo9FurLiuHxw65re4HXkiYzd27CcHeOIQZoeSvOXIa6QUVjHNDYAaddVB6t5fm5AYO69eFHAzptOV8SIxDHdwZw9khK3+IjmfKxag/vfnJvAj8pr0IH1g6gkrmk/T11l1yqPt3NWROwDSkEuot4MillbhK7dR/hcC/wVMJ+AHvKYIyLzle2Mlc7APtCWZ1SCQFAnJ8Nh6O8okQqSY3NJFywBDXcobpWTvlUZtO7vLz8d06S9Jc2OKA4GcdthjJ+yLWpYFRIZHGzbtbdLjAWqYtIkZxcKh0eXEbrxmwnmQ57Z8yc9x+8UlwEmmXl7NP75fNiOoOUalsOf1cQWg52GlJeQpnqXJEHqdCPnS3T/USFypXIMsYPK9C7itWGeA9KF3J6Tf2BQWqHN82PkYIukM3tZBVURsRBc9qNglf9sqd8ehghLYy1zyr1kv1Xf8+2LCiiOcLyKNzLcN9YcI5q4hhNub/OOKryBtNQvk/hc/uoNKOxfsB1N4fOoxiFMsAq9u87Tt23pLKbd4skEiJw==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979228985d52fffc305d6cb",
                "tag_name": "Fantasi Tinggi"
              },
              {
                "tag_id": "697d0844460f3cd38608fdef",
                "tag_name": "Harem"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a8ba7938db8c7372b0cf06e\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.33149999380111694},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":21},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.004903130233287811,\\\"click_pred\\\":0.004764974117279053,\\\"paywall_pred\\\":0.3246960937976837,\\\"pay_pred\\\":0.00014287233352661133,\\\"play_time_pred\\\":0.38673925399780273,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.0049031302,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":124,\\\"click_pred_index\\\":185,\\\"paywall_pred_index\\\":117,\\\"play_time_pred_index\\\":67,\\\"pay_pred_index\\\":117}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Sebuah kerajaan runtuh. Pasukan wanitanya pun bangkit.",
            "score": 3656,
            "like_count": 44817,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {},
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a8ba7938db8c7372b0cf06e\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.33149999380111694},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":21},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.004903130233287811,\"click_pred\":0.004764974117279053,\"paywall_pred\":0.3246960937976837,\"pay_pred\":0.00014287233352661133,\"play_time_pred\":0.38673925399780273,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.0049031302,\"is_new_user_feature\":\"\",\"origin_score_index\":124,\"click_pred_index\":185,\"paywall_pred_index\":117,\"play_time_pred_index\":67,\"pay_pred_index\":117}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a7943d4b52b0556e80314c5",
            "book_type": 1,
            "book_source": 1,
            "book_title": "Selamat Tinggal, Cinta Pertama",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/500000000000003683/90de700f-e937-4fb3-a9db-866a74d67ee1.jpg",
            "special_desc": "Bagi Jason, Tessa hanya pengganti gadis yang benar-benar dia cintai. Setelah harga dirinya hancur, Tessa memutuskan meninggalkan masa lalu dan memulai hidup baru. Namun saat hendak pergi, muncul seorang pria yang bertekad tak akan membiarkannya menghadapi semuanya sendirian.",
            "chapter_count": 73,
            "theme": [
              "Dewasa Muda",
              "Romansa Beracun"
            ],
            "collect_count": 61197,
            "init_collect_count": 1069,
            "read_count": 2366155,
            "t_book_id": "500001000000003683",
            "online_at": 1786950984,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "s1kbchz7kf",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "9ft497da57",
              "duration": 116,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/22b38a3c7c137b72.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 1,
              "play_info": "SJNyHd1DpuTNMwWJPzcsETmBUzi885NDo16Y9/oWXo5SrIhCzF6fYZZl31kCCbOsNuygXmSTI40yPG/jkui93dtfTuqf5IqvIQI87RsA+4drdmbD+CYVDeC1UXYb6UU2TWCr0Zj9hHx7eGft0eUG9qEIGkzeVoLaaHUCOtbUAvtHmKDfHn39sa6xctYIwMc7+B+84JtOs9ml9YBgRCkDirEIfnmC7hn2JnWWXulIj+OjzM/DhfWkAPavh9jopTzxzK3idL1mDtecou5xyT18wqLOyeKSVizp0PO1zdsHIMGCUKYndi923PtzQ31IJo8XLzWinFxbIFJUYkgbEb9IaDmd2hqclREFF+/xzpqkql73drGvSrtrZy6y1QvTSD5MNlLMO8atqbprztpetcqow4/klajxX5VrmzlzeFUB48g5H9t4ZW4GMPquDrap2TF+pXrA66/E4Bt8OhIEDumwx0cOg/1/eBwimZG7iOl3WW1lywO/wReFqfUBTfVs6WprYDO5n8pQCpxo37FrCAjDRzQwXLDgeXSig6T84b9kWg+G9Ps1NQshGFoesbUgUQUECmTi0Zq9qdm2dfIbVJ4PhILj2eK2J3gcUEgkUkLp5K4/pKZ+EoIBNbHH8H+nQsyMsBuGEK0qEplHbT7H2+gD0Q==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6979260956164594ab08bf2b",
                "tag_name": "Dewasa Muda"
              },
              {
                "tag_id": "69792d1a4a8f42295502bdfb",
                "tag_name": "Romansa Beracun"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a7943d4b52b0556e80314c5\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.33629998564720154},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":22},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.00483344029635191,\\\"click_pred\\\":0.0030330121517181396,\\\"paywall_pred\\\":0.3688645362854004,\\\"pay_pred\\\":0.00012182254431536421,\\\"play_time_pred\\\":0.39103007316589355,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.0048334403,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":125,\\\"click_pred_index\\\":204,\\\"paywall_pred_index\\\":97,\\\"play_time_pred_index\\\":64,\\\"pay_pred_index\\\":133}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {
              "name": "Top Harian No.18",
              "ranking_period": 1
            },
            "item_type": 1,
            "share_text": "Saat dia pergi, dunianya runtuh.",
            "score": 13673,
            "like_count": 39169,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {
              "type": 4,
              "color": "#FFF26118",
              "text": "Dubbing",
              "text_color": "#FFFFFFFF"
            },
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a7943d4b52b0556e80314c5\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.33629998564720154},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":22},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.00483344029635191,\"click_pred\":0.0030330121517181396,\"paywall_pred\":0.3688645362854004,\"pay_pred\":0.00012182254431536421,\"play_time_pred\":0.39103007316589355,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.0048334403,\"is_new_user_feature\":\"\",\"origin_score_index\":125,\"click_pred_index\":204,\"paywall_pred_index\":97,\"play_time_pred_index\":64,\"pay_pred_index\":133}}",
            "rank_level": "Top18",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          },
          {
            "book_id": "6a94e32cb47adfe0c30178da",
            "book_type": 1,
            "book_source": 15,
            "book_title": "Kisah Cinta Rahasia",
            "book_pic": "https://v-img.crazymaplestudios.com/v-images/book_cover_batch/504400000000006341/40b0f1c7-9ef3-434c-855e-6e65bd75b11a.jpg",
            "special_desc": "Dila Kusuma tak pernah menyangka pertemuannya dengan Kenzo Wijaya, seorang CEO muda, akan berakhir menjadi cinta satu malam. Saat Dila harus melahirkan seorang diri, tragedi kembali menghantam: sang ibu tewas dalam kecelakaan tabrak lari, meninggalkan Dila tanpa uang dan tanpa tempat untuk bergantung.\n\nDalam keputusasaan, Dila mengambil keputusan paling menyakitkan dalam hidupnya. Ia meninggalkan bayinya di depan rumah Kenzo, berharap putrinya bisa tumbuh dalam kehidupan yang lebih baik.\n\nTanpa pernah direncanakan, langkah Dila kembali membawanya ke kehidupan Kenzo. Dila diterima bekerja di Wijaya Group, sementara Kenzo sama sekali tak menyadari bahwa wanita di hadapannya adalah perempuan dari masa lalunya sekaligus ibu dari putrinya.\n\nNamun, rahasia itu terbongkar ketika bayi Kenzo yang tak pernah berhenti menangis tiba-tiba hanya bisa tenang dalam pelukan Dila.\n\nSebuah tes darah mengungkap kebenaran yang tak bisa lagi disembunyikan. Demi putri mereka, Kenzo menikahi Dila.\n\nTetapi pernikahan itu bukan akhir dari kisah cinta mereka. Justru menjadi awal dari permainan berbahaya yang dipenuhi kecemburuan, perebutan kekuasaan, rahasia identitas, dan dendam masa lalu.\n\nKetika Dila akhirnya mengetahui siapa dirinya sebenarnya dan siapa yang bertanggung jawab atas kematian ibunya, ia harus memilih: mempertahankan keluarga yang baru saja ia miliki… atau membalas semua orang yang telah menghancurkan hidupnya.",
            "chapter_count": 89,
            "theme": [
              "Berpura-pura bodoh"
            ],
            "collect_count": 11994,
            "init_collect_count": 1184,
            "read_count": 532399,
            "t_book_id": "504400000000006341",
            "online_at": 1789110000,
            "trailer_bookshelf_color": "#2E2E2E",
            "screen_mode": 1,
            "start_play_episode": 1,
            "first_chapter_id": "fqa096cq0o",
            "start_play": {
              "screen_mode": 1,
              "chapter_id": "fqa096cq0o",
              "duration": 164,
              "video_pic": "https://v-mps.crazymaplestudios.com/Snapshots/5db6c6deb4cd9c26.jpg",
              "video_type": 1,
              "chapter_index": 1,
              "episode_index": 0,
              "play_info": "GM3ZVTFxYeScBChiQ5vuD72u+kt5obVzCcZykp1sqPzaI0JpFkWYmLfzNF3U/qyTdtTF4tr1eI/ZLDyMHzB2vMFkMZJXVVEI39h6Sx2LFIAVnYK7sWbhqz9zPO2cfBHc6pfM7L7/vFjjHyI/T+rkPtLpLtrsY4+HGtUU5mWtmsnRuoDfS83WZIwt4ehh2CLVuOCLsYOZvFNefDY/T/m2pb1Ldw0ng/Bxktm2W5y3yisOLXVwLyjesQGSitOjVJj414P9uUZX35euOSUV0Xg9oLYaFhsVd0f13gJN3rqFapuwidnRCl3lneRMyXdl4AJdcQVjCj+dXaxxlbj0RD9NCI5sWq1vphw8GI6x3y9cop8sashO0RPa930GNLhbzZ7WkQwQ6u0nYMmlutBDpHmVSTkSBuVrxy3XxS7u16v9Xlv8Lb44npNdLA7juIM9YVxOUEZKRrYnOl0YMuHyh0dq4fw73IFxALn8bAgNBOOQP/phWWOIylxd8hGtwmkpwIn/s5bllfkp3REr3EIFn9pXitQqfySMzSnfnKFLw/fpuXWiCe9ew6NmoATGkO0vIpLwq255THumtjKtK49pwhkVCqKec/2BUt5HCwmw1TRazCuDRU/CAPE/CMnYGgTk2SebTqTRDJYUT/GBokzRQb/zcw==",
              "clip_id": "",
              "sum_clip_id": "",
              "adult_content_remind": 0,
              "need_show_pre_roll": false,
              "aspect_ratio": 0.56,
              "is_voiceover": false
            },
            "tag_list": [
              {
                "tag_id": "6348f5093c6ca761764d85f3",
                "tag_name": "Berpura-pura bodoh"
              }
            ],
            "have_trailer": true,
            "report": "{\"is_manual\":0,\"recall_level\":\"{\\\"id\\\":\\\"17905564040047236103\\\",\\\"rec_client_trace_id\\\":\\\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\\\",\\\"origin_book_id\\\":\\\"6a94e32cb47adfe0c30178da\\\",\\\"ts\\\":1790556404200,\\\"algo\\\":[{\\\"type\\\":\\\"hot\\\",\\\"score\\\":0.3237999975681305},{\\\"type\\\":\\\"u2i\\\"},{\\\"type\\\":\\\"backup\\\"}],\\\"user\\\":{\\\"uid\\\":\\\"1291848116\\\",\\\"life_type\\\":\\\"old\\\",\\\"vip_type\\\":\\\"free\\\"},\\\"ctx\\\":{\\\"scn\\\":\\\"recommendedWaterfall\\\",\\\"pos\\\":23},\\\"exp\\\":[{\\\"expId\\\":\\\"wtBook\\\",\\\"grp\\\":\\\"11\\\"}],\\\"metrics\\\":{\\\"qscore\\\":0,\\\"rank_score\\\":0.004830584395676851,\\\"click_pred\\\":0.003776252269744873,\\\"paywall_pred\\\":0.3626083731651306,\\\"pay_pred\\\":0.00010188754822593182,\\\"play_time_pred\\\":0.376140832901001,\\\"collect_pred\\\":0,\\\"duration_vip_prob\\\":0,\\\"duration_free_prob\\\":0,\\\"paywall_chapter_cnt_vip_prob\\\":0,\\\"paywall_chapter_cnt_free_prob\\\":0,\\\"duration_prob\\\":0,\\\"paywall_chapter_cnt_prob\\\":0,\\\"pay_cvr_pred\\\":0,\\\"pay_ctcvr_pred\\\":0,\\\"pay_show_cvr_pred\\\":0,\\\"pay_show_ctcvr_pred\\\":0,\\\"origin_score\\\":0.0048305844,\\\"is_new_user_feature\\\":\\\"\\\",\\\"origin_score_index\\\":126,\\\"click_pred_index\\\":192,\\\"paywall_pred_index\\\":102,\\\"play_time_pred_index\\\":71,\\\"pay_pred_index\\\":155}}\",\"show_session_id\":\"b5a4af33-4185-405c-a3fa-13e46cc5b943\",\"data_page\":1}",
            "start_read_info": {
              "screen_mode": 0,
              "chapter_id": "",
              "chapter_index": 0,
              "adult_content_remind": 0,
              "char_offset": 0,
              "comic_index": 0
            },
            "rank_tag": {},
            "item_type": 1,
            "share_text": "Tangisan bayi CEO cuma bisa tenang di pelukan karyawan baru—siapa dia sebenarnya?",
            "score": 5518,
            "like_count": 44282,
            "book_genre": 1,
            "series": {},
            "play_list": {},
            "book_mark": {},
            "recall_level": "{\"id\":\"17905564040047236103\",\"rec_client_trace_id\":\"17905564040047236103_1291848116_1790556404136_1641e982-6399-43ad-aec5-0accbdfc77fb\",\"origin_book_id\":\"6a94e32cb47adfe0c30178da\",\"ts\":1790556404200,\"algo\":[{\"type\":\"hot\",\"score\":0.3237999975681305},{\"type\":\"u2i\"},{\"type\":\"backup\"}],\"user\":{\"uid\":\"1291848116\",\"life_type\":\"old\",\"vip_type\":\"free\"},\"ctx\":{\"scn\":\"recommendedWaterfall\",\"pos\":23},\"exp\":[{\"expId\":\"wtBook\",\"grp\":\"11\"}],\"metrics\":{\"qscore\":0,\"rank_score\":0.004830584395676851,\"click_pred\":0.003776252269744873,\"paywall_pred\":0.3626083731651306,\"pay_pred\":0.00010188754822593182,\"play_time_pred\":0.376140832901001,\"collect_pred\":0,\"duration_vip_prob\":0,\"duration_free_prob\":0,\"paywall_chapter_cnt_vip_prob\":0,\"paywall_chapter_cnt_free_prob\":0,\"duration_prob\":0,\"paywall_chapter_cnt_prob\":0,\"pay_cvr_pred\":0,\"pay_ctcvr_pred\":0,\"pay_show_cvr_pred\":0,\"pay_show_ctcvr_pred\":0,\"origin_score\":0.0048305844,\"is_new_user_feature\":\"\",\"origin_score_index\":126,\"click_pred_index\":192,\"paywall_pred_index\":102,\"play_time_pred_index\":71,\"pay_pred_index\":155}}",
            "hallPic": {
              "jump_param": {
                "start_play": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "duration": 0,
                  "video_pic": "",
                  "video_type": 0,
                  "chapter_index": 0,
                  "episode_index": 0,
                  "play_info": "",
                  "clip_id": "",
                  "sum_clip_id": "",
                  "adult_content_remind": 0,
                  "need_show_pre_roll": false,
                  "aspect_ratio": 0,
                  "is_voiceover": false
                },
                "preLoad": {},
                "start_read_info": {
                  "screen_mode": 0,
                  "chapter_id": "",
                  "chapter_index": 0,
                  "adult_content_remind": 0,
                  "char_offset": 0,
                  "comic_index": 0
                }
              },
              "book_mark": {}
            },
            "continue_watch": {}
          }
        ],
        "double_two_rank_info": {},
        "last_book_id": "6a94e32cb47adfe0c30178da",
        "show_watch_progress": false
      }
    ],
    "show_session_id": "b5a4af33-4185-405c-a3fa-13e46cc5b943"
  }
}

ReelShort Search
{
  "success": true,
  "keyword": "love",
  "page": 1,
  "total": 120,
  "results": [
    {
      "bookId": "65df8281515dc2c2300535b9",
      "title": "Cintai aku, gigit aku",
      "cover": "",
      "description": "",
      "chapterCount": 68,
      "tag": []
    },
    {
      "bookId": "68c8c9b006a711d92c0ac155",
      "title": "Ramalan Darah",
      "cover": "",
      "description": "",
      "chapterCount": 50,
      "tag": []
    },
    {
      "bookId": "6a86d7f75eaf4433d8020a8e",
      "title": "Gelombang Sentuhan Terlarang",
      "cover": "",
      "description": "",
      "chapterCount": 30,
      "tag": []
    },
    {
      "bookId": "6aa8a741d0f3de565602b2c6",
      "title": "Terlahir Kembali sebagai Pewaris Konglomerat",
      "cover": "",
      "description": "",
      "chapterCount": 56,
      "tag": []
    },
    {
      "bookId": "6a852513bb44f5571606e093",
      "title": "Diterjang Obsesi Sang Rival",
      "cover": "",
      "description": "",
      "chapterCount": 60,
      "tag": []
    },
    {
      "bookId": "6a9001fe70167e37a90c799f",
      "title": "Istri Rahasia Enam Tahun Sang Pewaris Konglomerat",
      "cover": "",
      "description": "",
      "chapterCount": 70,
      "tag": []
    },
    {
      "bookId": "69fe999fd2fa30bca602eee6",
      "title": "Ratu Visioner",
      "cover": "",
      "description": "",
      "chapterCount": 90,
      "tag": []
    },
    {
      "bookId": "6aa9fab6134cba65de08089c",
      "title": "Terjebak dalam Novel Menjadi Kesalahan Terbesarnya",
      "cover": "",
      "description": "",
      "chapterCount": 60,
      "tag": []
    },
    {
      "bookId": "68d205a1675684bb770ddc28",
      "title": "Debut Asmara Voli Pantai",
      "cover": "",
      "description": "",
      "chapterCount": 52,
      "tag": []
    },
    {
      "bookId": "6a86aeaf3cdc6fbb91059895",
      "title": "Bos Vampirku Memberiku Les Privat",
      "cover": "",
      "description": "",
      "chapterCount": 45,
      "tag": []
    }
  ]
}