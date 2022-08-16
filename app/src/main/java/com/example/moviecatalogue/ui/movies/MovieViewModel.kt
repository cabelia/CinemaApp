
package com.example.moviecatalogue.ui.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.example.moviecatalogue.vo.Resource
import com.example.moviecatalogue.data.source.FilmRepository
import com.example.moviecatalogue.data.source.local.entity.MovieEntity

class MovieViewModel(private val movieRepository: FilmRepository) : ViewModel() {

    fun getMovies(): LiveData<Resource<PagedList<MovieEntity>>> = movieRepository.getAllMovies()
}