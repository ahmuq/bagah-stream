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
        val result = dramaRepository.getRanking(1)
        assertTrue("Drama Popular call should succeed: ${result.exceptionOrNull()?.message}", result.isSuccess)
        val list = result.getOrNull()
        assertNotNull(list)
        assertTrue("Drama list should not be empty", list!!.isNotEmpty())
        val first = list.first()
        println("TEST DRAMA POPULAR -> Title: ${first.title}, BookId: ${first.bookId}, Chapters: ${first.chapterCount}")
    }

    @Test
    fun testDramaEpisodeStreamApi() = runBlocking {
        val popular = dramaRepository.getRanking(1).getOrNull().orEmpty()
        assertTrue("Need a drama to test episodes", popular.isNotEmpty())
        val bookId = popular.first().bookId

        val episodesResult = dramaRepository.getEpisodes(bookId)
        assertTrue("Drama episodes call should succeed: ${episodesResult.exceptionOrNull()?.message}", episodesResult.isSuccess)
        val episodes = episodesResult.getOrNull()
        assertNotNull(episodes)
        assertTrue("Episodes should not be empty", episodes!!.isNotEmpty())
        println("TEST DRAMA EP1 EPISODES -> Chapter: ${episodes.first().title}")

        val streamResult = dramaRepository.getEpisodeStream(bookId, 1)
        assertTrue("Episode stream should succeed: ${streamResult.exceptionOrNull()?.message}", streamResult.isSuccess)
        val stream = streamResult.getOrNull()
        assertNotNull(stream)
        println("TEST DRAMA EP1 STREAM -> Title: ${stream!!.title}, VideoUrl: ${stream.bestUrl}")
        assertTrue("Video stream URL should be resolved", stream.bestUrl.isNotBlank())
    }
}
