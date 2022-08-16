

package com.example.moviecatalogue.data.source

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.data.source.local.entity.MovieWithId
import com.example.moviecatalogue.data.source.local.entity.SeriesEntity
import com.example.moviecatalogue.data.source.local.entity.SeriesWithId
import com.example.moviecatalogue.vo.Resource

interface FilmDataSource {

    fun getAllMovies(): LiveData<Resource<PagedList<MovieEntity>>>
    fun getAllSeries(): LiveData<Resource<PagedList<SeriesEntity>>>

    fun getMovies(filmId: String): LiveData<Resource<MovieWithId>>
    fun getSeries(filmId: String): LiveData<Resource<SeriesWithId>>

    fun getFavoriteMovies(): LiveData<PagedList<MovieEntity>>
    fun getFavoriteSeries(): LiveData<PagedList<SeriesEntity>>

    fun setFavMovies(movies: MovieEntity, state: Boolean)
    fun setfavSeries(series: SeriesEntity, state: Boolean)
}