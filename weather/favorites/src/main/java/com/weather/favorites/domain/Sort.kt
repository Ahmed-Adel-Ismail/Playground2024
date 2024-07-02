package com.weather.favorites.domain

import javax.inject.Inject

class Sort @Inject constructor() : suspend (List<FavoriteCity>, SortType) -> List<FavoriteCity> {
    override suspend fun invoke(list: List<FavoriteCity>, sortType: SortType): List<FavoriteCity> {
        TODO("Not yet implemented")
    }
}