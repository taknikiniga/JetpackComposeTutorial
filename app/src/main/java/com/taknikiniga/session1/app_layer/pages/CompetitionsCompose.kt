package com.taknikiniga.session1.app_layer.pages

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.taknikiniga.session1.ui.components.CardComponent
import com.taknikiniga.session1.ui.sharedVM.SharedVM

@Composable
fun CompetitionsCompose(viewModel: SharedVM = androidx.lifecycle.viewmodel.compose.viewModel()) {

    val data by viewModel.tourCompetitionData

    Log.e("CompetitionsCompose: ", "$data", )

    LazyColumn {
        items(data) {
            CardComponent(
                bannerUrl = it.bannerImageUrl,
                matchName = it.name,
                matchDate = it.startDateTime,
                logo = it.imageUrl
            ) {
            }
        }
    }
}