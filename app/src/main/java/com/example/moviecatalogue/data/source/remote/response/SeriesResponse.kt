package com.example.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SeriesResponse(
    var filmId: String,
    var title: String,
    var overview: String,
    var stars: String,
    var image: String,
    var genre: String,
    var episode: String,
    var oriLanguage: String,
    var release: String,
    var producers: String,
    var production: String,
    var image1: String,
    var image2: String,
    var image3: String
):Parcelable

