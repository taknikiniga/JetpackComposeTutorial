package com.taknikiniga.networking.data_layer.repo

import com.taknikiniga.networking.data_layer.state.ApiState
import com.taknikiniga.networking.domain.model.CurrentMatchModel
import com.taknikiniga.networking.domain.model.MatchFixModel
import kotlinx.coroutines.flow.Flow

interface ApiRepo {
    suspend fun getCurrentCompetitions(): Flow<ApiState<CurrentMatchModel>>
    suspend fun getFixturesList(): Flow<ApiState<MatchFixModel>>

}