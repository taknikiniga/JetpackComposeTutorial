package com.taknikiniga.session1.app_layer.tab

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentComposer
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.taknikiniga.session1.app_layer.pages.viewmodel.HomeVM
import com.taknikiniga.session1.ui.components.CardComponent
import com.taknikiniga.session1.ui.navigation.AppNavController
import com.taknikiniga.session1.ui.navigation.AppRoutes
import com.taknikiniga.session1.ui.sharedVM.SharedVM
import kotlinx.coroutines.launch

@Composable
fun AllCompose(
    viewModel: HomeVM = hiltViewModel(),
    sharedVm: SharedVM = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    AllCompetitionCom(viewModel, sharedVm)
}

@Composable
fun AllCompetitionCom(viewModel: HomeVM, sharedVm: SharedVM) {

    viewModel._allMatches.value.apply {

        if (isLoading) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(strokeWidth = 3.dp)
            }
        }


        if (isSuccess) {
            data?.let {
                LazyColumn() {

                }
            }
        }

        if (hasError) {
            Text(text = errMsg)
        }

    }
}