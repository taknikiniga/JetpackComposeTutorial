package com.taknikiniga.session1.ui.navigation

sealed class AppRoutes(val route:String) {
    data object HomeScreen:AppRoutes("home_screen")
    data object CompetitionsScreen:AppRoutes("competitions_screen")
}