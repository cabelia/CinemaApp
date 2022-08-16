package com.example.moviecatalogue.ui.favorite.favseries

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.example.moviecatalogue.data.source.FilmRepository
import com.example.moviecatalogue.data.source.local.entity.SeriesEntity
import com.example.moviecatalogue.vo.Resource

class FavoriteSeriesViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    fun getFavoriteSeries(): LiveData<PagedList<SeriesEntity>> =
        filmRepository.getFavoriteSeries()

    fun setFavorite(seriesEntity: SeriesEntity) {
        val newState = !seriesEntity.favFilm
        filmRepository.setfavSeries(seriesEntity, newState)
    }
}
