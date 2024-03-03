package com.taknikiniga.session1.app_layer.pages.viewmodel

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.taknikiniga.networking.data_layer.state.doOnFailure
import com.taknikiniga.networking.data_layer.state.doOnLoading
import com.taknikiniga.networking.data_layer.state.doOnSuccess
import com.taknikiniga.networking.domain.model.CurrentMatchModel
import com.taknikiniga.networking.domain.model.MatchFixModel
import com.taknikiniga.networking.domain.usecase.ApiUsecase
import com.taknikiniga.session1.app_layer.utils.DataState
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class HomeVM @Inject constructor(private val apiuc: ApiUsecase) : ViewModel() {

    private val currentCompetitions: MutableState<DataState<CurrentMatchModel>> =
        mutableStateOf(DataState())
    val _currentCompetitions: State<DataState<CurrentMatchModel>> = currentCompetitions

    private fun getCurrentCompetitions() = viewModelScope.launch(Dispatchers.IO) {
        apiuc.getCurrentCompetitions().doOnSuccess {
            withContext(Dispatchers.Main) {
//                currentCompetitions.value = DataState(isSuccess = true, data = it.currentCompetitionDetails)
            }
        }.doOnFailure {
            withContext(Dispatchers.Main) {
                currentCompetitions.value = DataState(hasError = true, errMsg = it)
            }
        }.doOnLoading {
            withContext(Dispatchers.Main) {
                currentCompetitions.value = DataState(isLoading = true)
            }
        }.collect()
    }


    // Upcoming Matches
    private val upcomingMatches: MutableState<DataState<MatchFixModel.UpcomingFixture>> =
        mutableStateOf(DataState())
    val _upcomingMatches: State<DataState<MatchFixModel.UpcomingFixture>> = upcomingMatches


    // Inprogress Matches
    private val inprogressMatches: MutableState<DataState<MatchFixModel.InProgressFixture>> =
        mutableStateOf(DataState())
    val _inprogressMatches: State<DataState<MatchFixModel.InProgressFixture>> = inprogressMatches

    // Completed Matches
    private val completedMatches: MutableState<DataState<MatchFixModel.CompletedFixture>> =
        mutableStateOf(DataState())
    val _completedMatches: State<DataState<MatchFixModel.CompletedFixture>> = completedMatches


    // Completed Matches
    private val allMatches: MutableState<DataState<MatchFixModel>> =
        mutableStateOf(DataState())
    val _allMatches: State<DataState<MatchFixModel>> = allMatches



    private fun getFixturesList() = viewModelScope.launch(Dispatchers.IO) {

        apiuc.getFixturesList().doOnSuccess {
            withContext(Dispatchers.Main){
                allMatches.value = DataState(isSuccess = true, data = listOf(it))
                upcomingMatches.value = DataState(isSuccess = true, data = it.upcomingFixtures)
                inprogressMatches.value = DataState(isSuccess = true, data = it.inProgressFixtures)
                completedMatches.value = DataState(isSuccess = true, data = it.completedFixtures)
            }

        }.doOnFailure {

            withContext(Dispatchers.Main){
                allMatches.value = DataState(hasError = true, errMsg = it)
                upcomingMatches.value = DataState(hasError = true, errMsg = it)
                inprogressMatches.value = DataState(hasError = true, errMsg = it)
                completedMatches.value = DataState(hasError = true, errMsg = it)
            }


        }.doOnLoading {
            withContext(Dispatchers.Main){
                allMatches.value = DataState(isLoading = true)
                upcomingMatches.value = DataState(isLoading = true)
                inprogressMatches.value = DataState(isLoading = true)
                completedMatches.value = DataState(isLoading = true)
            }
        }.collect()
    }


    init {
//        getCurrentCompetitions()
        getFixturesList()
    }

}