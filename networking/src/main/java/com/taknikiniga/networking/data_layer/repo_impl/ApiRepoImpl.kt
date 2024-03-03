package com.taknikiniga.networking.data_layer.repo_impl

import com.taknikiniga.networking.data_layer.ApiService
import com.taknikiniga.networking.data_layer.repo.ApiRepo
import com.taknikiniga.networking.data_layer.result.result
import com.taknikiniga.networking.data_layer.state.ApiState
import com.taknikiniga.networking.domain.model.CurrentMatchModel
import com.taknikiniga.networking.domain.model.MatchFixModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ApiRepoImpl @Inject constructor(private val api: ApiService) : ApiRepo {
    override suspend fun getCurrentCompetitions(): Flow<ApiState<CurrentMatchModel>> {
        return result {
            api.getCurrentCompetitions()
        }
    }

    override suspend fun getFixturesList(): Flow<ApiState<MatchFixModel>> {
        return result {
            api.getFixturesList()
        }
    }
}