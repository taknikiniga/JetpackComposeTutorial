package com.taknikiniga.networking.domain.usecase

import com.taknikiniga.networking.data_layer.repo.ApiRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ApiUsecase @Inject constructor(private val apiRepo: ApiRepo) {

    suspend fun getCurrentCompetitions() = withContext(Dispatchers.IO){
        return@withContext apiRepo.getCurrentCompetitions()
    }

    suspend fun getFixturesList() = withContext(Dispatchers.IO){
        return@withContext apiRepo.getFixturesList()
    }
}