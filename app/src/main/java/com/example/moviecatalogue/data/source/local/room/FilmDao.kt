package com.example.moviecatalogue.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.*
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.data.source.local.entity.MovieWithId
import com.example.moviecatalogue.data.source.local.entity.SeriesEntity
import com.example.moviecatalogue.data.source.local.entity.SeriesWithId

@Dao
interface FilmDao {

    @Query("SELECT * FROM moviesentities")
    fun getMovies(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM seriesentities")
    fun getSeries(): DataSource.Factory<Int, SeriesEntity>

    @Transaction
    @Query("SELECT * FROM moviesentities WHERE filmId = :filmId")
    fun getMovieWithId(filmId: String): LiveData<MovieWithId>

    @Transaction
    @Query("SELECT * FROM seriesentities WHERE filmId = :filmId")
    fun getseriesWithId(filmId: String): LiveData<SeriesWithId>

    @Query("SELECT * FROM moviesentities where favFilm = 1")
    fun getMoviesFavorite(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM seriesentities where favFilm = 1")
    fun getSeriesFavorite(): DataSource.Factory<Int, SeriesEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(movies: List<MovieEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSeries(series: List<SeriesEntity>)

    @Update
    fun updateMovies(movies: MovieEntity)

    @Update
    fun updateSeries(series: SeriesEntity)
}