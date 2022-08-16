package com.example.moviecatalogue.ui.favorite.favmovies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.example.moviecatalogue.data.source.FilmRepository
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.vo.Resource


class FavoriteMoviesViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    fun getFavoriteMovie(): LiveData<PagedList<MovieEntity>> =
        filmRepository.getFavoriteMovies()


    fun setFavorite(movieEntity: MovieEntity) {
        val newState = !movieEntity.favFilm
        filmRepository.setFavMovies(movieEntity, newState)
    }
}