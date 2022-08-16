package com.example.moviecatalogue.utils

import android.content.Context
import com.example.moviecatalogue.data.source.remote.response.MovieResponse
import com.example.moviecatalogue.data.source.remote.response.SeriesResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovies(): List<MovieResponse> {
        val list = ArrayList<MovieResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("MoviesResponses.json").toString())
            val listArray = responseObject.getJSONArray("movies")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val filmId = movie.getString("filmId")
                val title = movie.getString("title")
                val overview = movie.getString("overview")
                val stars = movie.getString("stars")
                val image = movie.getString("image")
                val genre = movie.getString("genre")
                val runtime = movie.getString("runtime")
                val oriLanguage = movie.getString("oriLanguage")
                val release = movie.getString("release")
                val director = movie.getString("director")
                val writer = movie.getString("writer")
                val production = movie.getString("production")
                val rating = movie.getString("rating")
                val image1 = movie.getString("image1")
                val image2 = movie.getString("image2")
                val image3 = movie.getString("image3")

                val movieResponse = MovieResponse(
                    filmId,
                    title,
                    overview,
                    stars,
                    image,
                    genre,
                    runtime,
                    oriLanguage,
                    release,
                    director,
                    writer,
                    production,
                    rating,
                    image1,
                    image2,
                    image3
                )
                list.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }

    fun loadSeries(): List<SeriesResponse> {
        val list = ArrayList<SeriesResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("SeriesResponses.json").toString())
            val listArray = responseObject.getJSONArray("series")
            for (i in 0 until listArray.length()) {
                val series = listArray.getJSONObject(i)

                val filmId = series.getString("filmId")
                val title = series.getString("title")
                val overview = series.getString("overview")
                val stars = series.getString("stars")
                val image = series.getString("image")
                val genre = series.getString("genre")
                val episode = series.getString("episode")
                val oriLanguage = series.getString("oriLanguage")
                val release = series.getString("release")
                val producers = series.getString("producers")
                val production = series.getString("production")
                val image1 = series.getString("image1")
                val image2 = series.getString("image2")
                val image3 = series.getString("image3")

                val seriesResponse = SeriesResponse(
                    filmId,
                    title,
                    overview,
                    stars,
                    image,
                    genre,
                    episode,
                    oriLanguage,
                    release,
                    producers,
                    production,
                    image1,
                    image2,
                    image3
                )
                list.add(seriesResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }
}