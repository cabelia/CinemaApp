package com.example.moviecatalogue.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.moviecatalogue.data.source.remote.response.SeriesResponse
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
class DetailSeriesViewModelTest {
    private lateinit var viewModel: DetailSeriesViewModel
    private val dummySeries = DataDummyFilm.generateDummySeries()[0]
    private val filmId = dummySeries.filmId

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var seriesRepository: FilmRepository

    @Mock
    private lateinit var seriesObserver: Observer<SeriesResponse>

    @Before
    fun setUp() {
        viewModel = DetailSeriesViewModel(seriesRepository)
        viewModel.selectedSeries(filmId)
    }

    @Test
    fun getSeries() {
        val series = MutableLiveData<SeriesResponse>()
        series.value = (dummySeries)

        `when`(seriesRepository.getSeries(filmId)).thenReturn(series)
        val seriesEntity = viewModel.getSeries().value as SeriesResponse
        verify(seriesRepository).getSeries(filmId)
        assertNotNull(seriesEntity)
        assertEquals(dummySeries.filmId, seriesEntity.filmId)
        assertEquals(dummySeries.title, seriesEntity.title)
        assertEquals(dummySeries.overview, seriesEntity.overview)
        assertEquals(dummySeries.stars, seriesEntity.stars)
        assertEquals(dummySeries.image, seriesEntity.image)
        assertEquals(dummySeries.genre, seriesEntity.genre)
        assertEquals(dummySeries.episode, seriesEntity.episode)
        assertEquals(dummySeries.oriLanguage, seriesEntity.oriLanguage)
        assertEquals(dummySeries.release, seriesEntity.release)
        assertEquals(dummySeries.producers, seriesEntity.producers)
        assertEquals(dummySeries.production, seriesEntity.production)
        assertEquals(dummySeries.image1, seriesEntity.image1)
        assertEquals(dummySeries.image2, seriesEntity.image2)
        assertEquals(dummySeries.image3, seriesEntity.image3)

        viewModel.getSeries().observeForever(seriesObserver)
        verify(seriesObserver).onChanged(dummySeries)
    }
}