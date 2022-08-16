package com.example.moviecatalogue.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.moviecatalogue.data.source.FilmRepository
import com.example.moviecatalogue.di.FilmInjection
import com.example.moviecatalogue.ui.detail.DetailFilmViewModel
import com.example.moviecatalogue.ui.favorite.favmovies.FavoriteMoviesViewModel
import com.example.moviecatalogue.ui.favorite.favseries.FavoriteSeriesViewModel
import com.example.moviecatalogue.ui.movies.MovieViewModel
import com.example.moviecatalogue.ui.series.SeriesViewModel

class ViewModelFactory private constructor(private val mFilmRepository: FilmRepository) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: ViewModelFactory(FilmInjection.provideRepository(context)).apply {
                instance = this
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                return MovieViewModel(mFilmRepository) as T
            }
            modelClass.isAssignableFrom(SeriesViewModel::class.java) -> {
                return SeriesViewModel(mFilmRepository) as T
            }
            modelClass.isAssignableFrom(DetailFilmViewModel::class.java) -> {
                return DetailFilmViewModel(mFilmRepository) as T
            }
            modelClass.isAssignableFrom(FavoriteMoviesViewModel::class.java) -> {
                return FavoriteMoviesViewModel(mFilmRepository) as T
            }
            modelClass.isAssignableFrom(FavoriteSeriesViewModel::class.java) -> {
                return FavoriteSeriesViewModel(mFilmRepository) as T
            }

            else -> throw  Throwable("Unknown ViewModel Class: " + modelClass.name)
        }
    }
}