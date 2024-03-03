package com.taknikiniga.session1.ui.navigation

sealed class TabRoutes(var route: String, var title: String) {
    data object AllTab : TabRoutes("all_tab", "All")
    data object LiveTab : TabRoutes("live_tab", "Live")
    data object UpComingTab : TabRoutes("upcoming_tab", "Up Coming")
    data object CompletedTab : TabRoutes("completed_tab", "Completed")
}