package com.weather.favorites.presentation

import androidx.lifecycle.ViewModel
import com.weather.favorites.domain.Sort
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FavoritesScreenViewModel @Inject constructor(
    private val sort: Sort
) : ViewModel() {

}