package com.example.moviecatalogue.data.source.local.entity

import androidx.room.Embedded
import androidx.room.Relation

class MovieWithId (
    @Embedded
    var mMovies: MovieEntity,

    @Relation(parentColumn = "filmId", entityColumn = "filmId")
    var mDesc: List<MovieEntity>

    )
