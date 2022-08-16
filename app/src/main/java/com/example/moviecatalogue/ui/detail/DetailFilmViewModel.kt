package com.example.moviecatalogue.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.moviecatalogue.data.source.FilmRepository
import com.example.moviecatalogue.data.source.local.entity.MovieWithId
import com.example.moviecatalogue.data.source.local.entity.SeriesWithId
import com.example.moviecatalogue.vo.Resource

class DetailFilmViewModel(private val filmRepository: FilmRepository) : ViewModel() {
   val filmId = MutableLiveData<String>()

    fun selectedMovie(filmId: String) {
        this.filmId.value = filmId
    }

    fun selectedSeries(filmId: String){
        this.filmId.value = filmId
    }

    var mMovie : LiveData<Resource<MovieWithId>> = Transformations.switchMap(filmId) { movies ->
        filmRepository.getMovies(movies)
    }

    var mSeries : LiveData<Resource<SeriesWithId>> = Transformations.switchMap(filmId){ series ->
        filmRepository.getSeries(series)
    }

    fun getFavoriteMovie(){
        val movieResource = mMovie.value
        if (movieResource != null){
            val movieWithId = movieResource.data
            if (movieWithId != null){
                val movieEntity = movieWithId.mMovies
                val newState = !movieEntity.favFilm
                filmRepository.setFavMovies(movieEntity, newState)
            }
        }
    }

    fun getFavoriteSeries(){
        val seriesResource = mSeries.value
        if (seriesResource != null){
            val seriesWithId = seriesResource.data
            if (seriesWithId != null){
                val seriesEntity = seriesWithId.mSeries
                val newState = !seriesEntity.favFilm
                filmRepository.setfavSeries(seriesEntity, newState)
            }
        }
    }
}