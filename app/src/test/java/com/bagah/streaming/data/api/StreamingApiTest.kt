package com.bagah.streaming.data.api

import com.bagah.streaming.data.repository.anime.AnimeRepository
import com.bagah.streaming.data.repository.anime.AnimeRepositoryImpl
import com.bagah.streaming.data.repository.drama.DramaRepository
import com.bagah.streaming.data.repository.drama.DramaRepositoryImpl
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class StreamingApiTest {

    private val animeRepository: AnimeRepository = AnimeRepositoryImpl()
    private val dramaRepository: DramaRepository = DramaRepositoryImpl()

    @Test
    fun testAnimeLatestApi() = runBlocking {
        val result = animeRepository.getLatest(1)
        assertTrue("Anime Latest call should succeed: ${result.exceptionOrNull()?.message}", result.isSuccess)
        val list = result.getOrNull()
        assertNotNull(list)
        assertTrue("Anime list should not be empty", list!!.isNotEmpty())
        val first = list.first()
        println("TEST ANIME LATEST -> Title: ${first.judul}, URL: ${first.url}, Score: ${first.score}")
    }

    @Test
    fun testDramaPopularApi() = runBlocking {
        val result = dramaRepository.getPopular()
        assertTrue("Drama Popular call should succeed: ${result.exceptionOrNull()?.message}", result.isSuccess)
        val list = result.getOrNull()
        assertNotNull(list)
        assertTrue("Drama list should not be empty", list!!.isNotEmpty())
        val first = list.first()
        println("TEST DRAMA POPULAR -> Title: ${first.bookName}, BookId: ${first.bookId}, Chapters: ${first.chapterCount}")
    }

    @Test
    fun testDramaChaptersStreamApi() = runBlocking {
        val result = dramaRepository.getChapters("42000028264")
        assertTrue("Drama Chapters call should succeed: ${result.exceptionOrNull()?.message}", result.isSuccess)
        val chapters = result.getOrNull()
        assertNotNull(chapters)
        assertTrue("Chapters should not be empty", chapters!!.isNotEmpty())
        val ep1 = chapters.first()
        val videoUrl = ep1.getPreferredVideoUrl()
        println("TEST DRAMA EP1 STREAM -> Chapter: ${ep1.chapterName}, VideoUrl: $videoUrl")
        assertNotNull("Video stream URL should be resolved", videoUrl)
    }
}
