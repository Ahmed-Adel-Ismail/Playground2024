package com.weather.favorites.presentation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun FavoritesScreen(
    viewModel: FavoritesScreenViewModel = hiltViewModel(),
    navigateToCityDetails: (cityId: String) -> Unit,
    navigateBack: () -> Unit
) {
    BackHandler(enabled = true) { navigateBack() }
}