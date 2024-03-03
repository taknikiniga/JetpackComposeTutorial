package com.taknikiniga.session1.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.taknikiniga.session1.app_layer.pages.CompetitionsCompose
import com.taknikiniga.session1.app_layer.pages.HomeCompose
import com.taknikiniga.session1.app_layer.tab.AllCompose
import com.taknikiniga.session1.app_layer.tab.CompletedCompose
import com.taknikiniga.session1.app_layer.tab.LiveCompose
import com.taknikiniga.session1.app_layer.tab.UpComingCompose
import com.taknikiniga.session1.ui.sharedVM.SharedVM

@Composable
fun AppNavigation(sharedVm: SharedVM) {
    val navController = rememberNavController()

    CompositionLocalProvider(AppNavController provides navController) {
        NavHost(navController = navController, startDestination = AppRoutes.HomeScreen.route) {
            composable(route = AppRoutes.HomeScreen.route) {
                HomeCompose(sharedVm = sharedVm)
            }

            composable(route = AppRoutes.CompetitionsScreen.route) {
                CompetitionsCompose(sharedVm)
            }

//            composable(TabRoutes.AllTab.route) {
//                AllCompose()
//            }

//            composable(TabRoutes.LiveTab.route) {
//                LiveCompose()
//            }

//            composable(TabRoutes.UpComingTab.route) {
//                UpComingCompose()
//            }

//            composable(TabRoutes.CompletedTab.route) {
//                CompletedCompose()
//            }
        }
    }


}

val AppNavController =
    compositionLocalOf<NavHostController> { error("Main NavHostController error") }