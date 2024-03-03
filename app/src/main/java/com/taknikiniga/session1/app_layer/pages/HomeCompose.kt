package com.taknikiniga.session1.app_layer.pages

import android.annotation.SuppressLint
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.taknikiniga.session1.app_layer.pages.viewmodel.HomeVM
import com.taknikiniga.session1.app_layer.tab.AllCompose
import com.taknikiniga.session1.app_layer.tab.CompletedCompose
import com.taknikiniga.session1.app_layer.tab.LiveCompose
import com.taknikiniga.session1.app_layer.tab.UpComingCompose
import com.taknikiniga.session1.ui.components.CardComponent
import com.taknikiniga.session1.ui.navigation.AppRoutes
import com.taknikiniga.session1.ui.navigation.TabRoutes
import com.taknikiniga.session1.ui.sharedVM.SharedVM
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeCompose(
    sharedVm: SharedVM = androidx.lifecycle.viewmodel.compose.viewModel(),
    viewModel:HomeVM = hiltViewModel()
) {

    val tabList = mutableListOf(
//        TabRoutes.AllTab,
        TabRoutes.LiveTab,
        TabRoutes.UpComingTab,
        TabRoutes.CompletedTab,
    )

    val pagerState = rememberPagerState() {
        tabList.size
    }
    Column {
        TabRowComp(tabData = tabList, pagerState = pagerState)
        TabContent(pagerState = pagerState,sharedVm,viewModel)
    }

}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabContent(pagerState: PagerState,sharedVm: SharedVM,viewModel: HomeVM) {
    HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) {
        when (it) {
//            0 -> AllCompose(sharedVm = sharedVm)
            0 -> LiveCompose(viewModel)
            1 -> UpComingCompose(viewModel)
            2 -> CompletedCompose(viewModel)
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabRowComp( tabData: List<TabRoutes>,pagerState: PagerState) {
    val scope = rememberCoroutineScope()

    TabRow(selectedTabIndex = pagerState.currentPage, modifier = Modifier.fillMaxWidth()) {
        tabData.forEachIndexed { index, tabRoutes ->
            Tab(
                text = {
                    Text(text = tabRoutes.title, style = TextStyle(fontWeight = FontWeight.Bold))
                },
                unselectedContentColor = Color.Gray,
                selectedContentColor = Color.Black,
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }

                })
        }
    }

}