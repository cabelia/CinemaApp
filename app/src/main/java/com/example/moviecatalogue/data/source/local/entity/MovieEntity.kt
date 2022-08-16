package com.example.moviecatalogue.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "moviesentities")
data class MovieEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "filmId")
    var filmId: String,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "overview")
    var overview: String,

    @ColumnInfo(name = "stars")
    var stars: String,

    @ColumnInfo(name = "image")
    var image: String,

    @ColumnInfo(name = "genre")
    var genre: String,

    @ColumnInfo(name = "runtime")
    var runtime: String,

    @ColumnInfo(name = "oriLanguage")
    var oriLanguage: String,

    @ColumnInfo(name = "release")
    var release: String,

    @ColumnInfo(name = "director")
    var director: String,

    @ColumnInfo(name = "writer")
    var writer: String,

    @ColumnInfo(name = "production")
    var production: String,

    @ColumnInfo(name = "rating")
    var rating: String,

    @ColumnInfo(name = "image1")
    var image1: String,

    @ColumnInfo(name = "image2")
    var image2: String,

    @ColumnInfo(name = "image3")
    var image3: String,

    @ColumnInfo(name = "favFilm")
    var favFilm: Boolean = false
)