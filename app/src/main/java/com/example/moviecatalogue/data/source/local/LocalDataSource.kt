package com.example.moviecatalogue.data.source.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.data.source.local.entity.MovieWithId
import com.example.moviecatalogue.data.source.local.entity.SeriesEntity
import com.example.moviecatalogue.data.source.local.entity.SeriesWithId
import com.example.moviecatalogue.data.source.local.room.FilmDao


class LocalDataSource private constructor(private val mFilmDao: FilmDao) {

    companion object {
        private var INSTANCE: LocalDataSource? = null

        fun getInstance(filmDao: FilmDao): LocalDataSource =
            INSTANCE ?: LocalDataSource(filmDao)
    }

    fun getAllMovies(): DataSource.Factory<Int, MovieEntity> = mFilmDao.getMovies()

    fun getAllSeries(): DataSource.Factory<Int, SeriesEntity> = mFilmDao.getSeries()

    fun getMoviesId(filmId: String): LiveData<MovieWithId> =
        mFilmDao.getMovieWithId(filmId)

    fun getSeriesId(filmId: String): LiveData<SeriesWithId> =
        mFilmDao.getseriesWithId(filmId)

    fun getMoviesFavorite (): DataSource.Factory<Int, MovieEntity> = mFilmDao.getMoviesFavorite()

    fun getSeriesFavorite () :DataSource.Factory<Int, SeriesEntity> = mFilmDao.getSeriesFavorite()

    fun insertMovies(movies: List<MovieEntity>) = mFilmDao.insertMovies(movies)

    fun insertSeries(series: List<SeriesEntity>) = mFilmDao.insertSeries(series)

    fun setMovieFavorite(movies: MovieEntity, newState: Boolean){
        movies.favFilm = newState
        mFilmDao.updateMovies(movies)
    }

    fun setSeriesFavorite(series: SeriesEntity, newState: Boolean){
        series.favFilm = newState
        mFilmDao.updateSeries(series)
    }

}