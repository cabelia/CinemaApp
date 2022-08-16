package com.example.moviecatalogue.data.source

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.moviecatalogue.data.source.local.LocalDataSource
import com.example.moviecatalogue.data.source.local.entity.MovieEntity
import com.example.moviecatalogue.data.source.local.entity.MovieWithId
import com.example.moviecatalogue.data.source.local.entity.SeriesEntity
import com.example.moviecatalogue.data.source.local.entity.SeriesWithId
import com.example.moviecatalogue.data.source.remote.RemoteDataSource
import com.example.moviecatalogue.data.source.remote.response.ApiResponse
import com.example.moviecatalogue.data.source.remote.response.MovieResponse
import com.example.moviecatalogue.data.source.remote.response.SeriesResponse
import com.example.moviecatalogue.utils.AppExecutors
import com.example.moviecatalogue.vo.Resource

class FilmRepository private constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) :
    FilmDataSource {

    companion object {
        @Volatile
        private var instance: FilmRepository? = null

        fun getInstance(
            remoteData: RemoteDataSource,
            localDataSource: LocalDataSource,
            appExecutors: AppExecutors
        ): FilmRepository =
            instance ?: synchronized(this) {
                instance ?: FilmRepository(
                    remoteData,
                    localDataSource,
                    appExecutors
                ).apply { instance = this }
            }
    }

    override fun getAllMovies(): LiveData<Resource<PagedList<MovieEntity>>> {
        return object :
            NetworkBoundResource<PagedList<MovieEntity>, List<MovieResponse>>(appExecutors) {
            public override fun loadFromDB(): LiveData<PagedList<MovieEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()
                return LivePagedListBuilder(localDataSource.getAllMovies(), config).build()
            }

            override fun shouldFetch(data: PagedList<MovieEntity>?): Boolean =
                data == null || data.isEmpty()

            public override fun createCall(): LiveData<ApiResponse<List<MovieResponse>>> =
                remoteDataSource.getAllMovies()

            public override fun saveCallResult(data: List<MovieResponse>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in data) {
                    val movie = MovieEntity(
                        response.filmId,
                        response.title,
                        response.overview,
                        response.stars,
                        response.image,
                        response.genre,
                        response.runtime,
                        response.oriLanguage,
                        response.release,
                        response.director,
                        response.writer,
                        response.production,
                        response.rating,
                        response.image1,
                        response.image2,
                        response.image3,
                        false
                    )
                    movieList.add(movie)
                }
                localDataSource.insertMovies(movieList)
            }
        }.asLiveData()
    }

    override fun getAllSeries(): LiveData<Resource<PagedList<SeriesEntity>>> {
        return object :
            NetworkBoundResource<PagedList<SeriesEntity>, List<SeriesResponse>>(appExecutors) {

            public override fun loadFromDB(): LiveData<PagedList<SeriesEntity>> {
                val config = PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setInitialLoadSizeHint(4)
                    .setPageSize(4)
                    .build()
                return LivePagedListBuilder(localDataSource.getAllSeries(), config).build()
            }

            override fun shouldFetch(data: PagedList<SeriesEntity>?): Boolean =
                data == null || data.isEmpty()


           public override fun createCall(): LiveData<ApiResponse<List<SeriesResponse>>> =
                remoteDataSource.getAllSeries()


           public override fun saveCallResult(data: List<SeriesResponse>) {
                val seriesList = ArrayList<SeriesEntity>()
                for (response in data) {
                    val series = SeriesEntity(
                        response.filmId,
                        response.title,
                        response.overview,
                        response.stars,
                        response.image,
                        response.genre,
                        response.episode,
                        response.oriLanguage,
                        response.release,
                        response.producers,
                        response.production,
                        response.image1,
                        response.image2,
                        response.image3,
                        false
                    )
                    seriesList.add(series)
                }
                localDataSource.insertSeries(seriesList)
            }
        }.asLiveData()
    }

    override fun getMovies(filmId: String): LiveData<Resource<MovieWithId>> {
        return object : NetworkBoundResource<MovieWithId, List<MovieResponse>>(appExecutors) {
            override fun loadFromDB(): LiveData<MovieWithId> =
                localDataSource.getMoviesId(filmId)

            override fun shouldFetch(data: MovieWithId?): Boolean =
                data?.mDesc == null || data.mDesc.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<MovieResponse>>> =
                remoteDataSource.getAllMovies()

            override fun saveCallResult(data: List<MovieResponse>) {
                val movieList = ArrayList<MovieEntity>()
                for (response in data) {
                    val movie = MovieEntity(
                        response.filmId,
                        response.title,
                        response.overview,
                        response.stars,
                        response.image,
                        response.genre,
                        response.runtime,
                        response.oriLanguage,
                        response.release,
                        response.director,
                        response.writer,
                        response.production,
                        response.rating,
                        response.image1,
                        response.image2,
                        response.image3,
                        false
                    )
                    movieList.add(movie)
                }
                localDataSource.insertMovies(movieList)
            }
        }.asLiveData()
    }

    override fun getSeries(filmId: String): LiveData<Resource<SeriesWithId>> {
        return object : NetworkBoundResource<SeriesWithId, List<SeriesResponse>>(appExecutors) {
            override fun loadFromDB(): LiveData<SeriesWithId> =
                localDataSource.getSeriesId(filmId)

            override fun shouldFetch(data: SeriesWithId?): Boolean =
                data?.mDesc == null || data.mDesc.isEmpty()

            override fun createCall(): LiveData<ApiResponse<List<SeriesResponse>>> =
                remoteDataSource.getAllSeries()

            override fun saveCallResult(data: List<SeriesResponse>) {
                val seriesList = ArrayList<SeriesEntity>()
                for (response in data) {
                    val series = SeriesEntity(
                        response.filmId,
                        response.title,
                        response.overview,
                        response.stars,
                        response.image,
                        response.genre,
                        response.episode,
                        response.oriLanguage,
                        response.release,
                        response.producers,
                        response.production,
                        response.image1,
                        response.image2,
                        response.image3,
                        false
                    )
                    seriesList.add(series)
                }
                localDataSource.insertSeries(seriesList)
            }
        }.asLiveData()
    }

    override fun getFavoriteMovies(): LiveData<PagedList<MovieEntity>> {
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(4)
            .setPageSize(4)
            .build()
        return LivePagedListBuilder(localDataSource.getMoviesFavorite(), config).build()
    }

    override fun getFavoriteSeries(): LiveData<PagedList<SeriesEntity>> {
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setInitialLoadSizeHint(4)
            .setPageSize(4)
            .build()
        return LivePagedListBuilder(localDataSource.getSeriesFavorite(), config).build()
    }

    override fun setFavMovies(movies: MovieEntity, state: Boolean) {
        appExecutors.diskIO().execute { localDataSource.setMovieFavorite(movies, state) }
    }

    override fun setfavSeries(series: SeriesEntity, state: Boolean) {
        appExecutors.diskIO().execute { localDataSource.setSeriesFavorite(series, state) }
    }

}