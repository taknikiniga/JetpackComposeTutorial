package com.taknikiniga.session1.ui.sharedVM

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.taknikiniga.networking.domain.model.CurrentMatchModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


class SharedVM : ViewModel() {

     val tourCompetitionData =
        mutableStateOf<List<CurrentMatchModel.CurrentCompetitionDetail.TourCompetition>>(
            emptyList()
        )

    fun setTourCompetitionData(data: List<CurrentMatchModel.CurrentCompetitionDetail.TourCompetition>) =
        viewModelScope.launch {
            tourCompetitionData.value = data
        }


}