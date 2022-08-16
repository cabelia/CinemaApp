package com.example.moviecatalogue.ui.series

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.moviecatalogue.data.source.remote.response.SeriesResponse
import com.example.moviecatalogue.utils.DataDummyFilm
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class SeriesViewModelTest {
    private lateinit var viewModel: SeriesViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var seriesRepository: FilmRepository

    @Mock
    private lateinit var observer: Observer<List<SeriesResponse>>

    @Before
    fun setUp() {
        viewModel = SeriesViewModel(seriesRepository)
    }

    @Test
    fun testGetSeries() {

        val dummySeries = DataDummyFilm.generateDummySeries()
        val series = MutableLiveData<List<SeriesResponse>>()
        series.value = dummySeries

        `when`(seriesRepository.getAllSeries()).thenReturn(series)
        val seriesEntities = viewModel.getSeries().value
        assertNotNull(seriesEntities)
        assertEquals(10, seriesEntities?.size)

        viewModel.getSeries().observeForever(observer)
        verify(observer).onChanged(dummySeries)
    }
}