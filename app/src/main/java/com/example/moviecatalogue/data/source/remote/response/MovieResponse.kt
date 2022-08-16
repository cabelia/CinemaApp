package com.example.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieResponse (
    var filmId: String,
    var title: String,
    var overview: String,
    var stars: String,
    var image: String,
    var genre: String,
    var runtime: String,
    var oriLanguage: String,
    var release: String,
    var director: String,
    var writer: String,
    var production: String,
    var rating: String,
    var image1: String,
    var image2: String,
    var image3: String
):Parcelable