

package com.example.moviecatalogue.ui.series

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.example.moviecatalogue.vo.Resource
import com.example.moviecatalogue.data.source.FilmRepository
import com.example.moviecatalogue.data.source.local.entity.SeriesEntity

class SeriesViewModel(private val seriesRepository: FilmRepository) : ViewModel() {

    fun getSeries(): LiveData<Resource<PagedList<SeriesEntity>>> = seriesRepository.getAllSeries()
}