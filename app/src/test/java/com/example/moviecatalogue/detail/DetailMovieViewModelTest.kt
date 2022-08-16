package com.example.moviecatalogue.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.moviecatalogue.data.source.remote.response.MovieResponse
import com.example.moviecatalogue.utils.DataDummyFilm
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class DetailMovieViewModelTest {
    private lateinit var viewModel: DetailFilmViewModel
    private val dummyMovie = DataDummyFilm.generateDummyMovie()[0]
    private val filmId = dummyMovie.filmId

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: FilmRepository

    @Mock
    private lateinit var movieObserver: Observer<MovieResponse>

    @Before
    fun setUp() {
        viewModel = DetailFilmViewModel(movieRepository)
        viewModel.selectedMovie(filmId)
    }

    @Test
    fun getMovie() {
        val movie = MutableLiveData<MovieResponse>()
        movie.value = (dummyMovie)

        `when`(movieRepository.getMovies(filmId)).thenReturn(movie)
        val movieEntity = viewModel.getMovie().value as MovieResponse
        verify(movieRepository).getMovies(filmId)
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.filmId, movieEntity.filmId)
        assertEquals(dummyMovie.image, movieEntity.image)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.overview, movieEntity.overview)
        assertEquals(dummyMovie.stars, movieEntity.stars)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.runtime, movieEntity.runtime)
        assertEquals(dummyMovie.oriLanguage, movieEntity.oriLanguage)
        assertEquals(dummyMovie.release, movieEntity.release)
        assertEquals(dummyMovie.director, movieEntity.director)
        assertEquals(dummyMovie.writer, movieEntity.writer)
        assertEquals(dummyMovie.production, movieEntity.production)
        assertEquals(dummyMovie.rating, movieEntity.rating)
        assertEquals(dummyMovie.image1, movieEntity.image1)
        assertEquals(dummyMovie.image2, movieEntity.image2)
        assertEquals(dummyMovie.image3, movieEntity.image3)

        viewModel.getMovie().observeForever(movieObserver)
        verify(movieObserver).onChanged(dummyMovie)
    }
}