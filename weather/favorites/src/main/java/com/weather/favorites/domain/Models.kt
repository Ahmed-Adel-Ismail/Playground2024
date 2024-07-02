package com.weather.favorites.domain

import java.util.Date

enum class SortType {
    NAME_ASCENDING,
    NAME_DESCENDING,
    TEMPERATURE_ASCENDING,
    TEMPERATURE_DESCENDING,
    TIME_ASCENDING,
    TIME_DESCENDING,
}

data class FavoriteCity(val id: String, val name: String, val temperature: Int, val time: Date)