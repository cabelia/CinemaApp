package com.example.moviecatalogue.data.source.local.entity

import androidx.room.Embedded
import androidx.room.Relation

class SeriesWithId(
    @Embedded
    var mSeries: SeriesEntity,

    @Relation(parentColumn = "filmId", entityColumn = "filmId")
    var mDesc: List<SeriesEntity>

)
