package com.taknikiniga.networking.data_layer.result

import com.taknikiniga.networking.data_layer.state.ApiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response

fun <T> result(call: suspend () -> Response<T>): Flow<ApiState<T>> = flow {
    emit(ApiState.Loading)
    val apiCall = call()
    apiCall.let {
        if (it.isSuccessful) {
            if (apiCall.body() != null) {
                emit(ApiState.Success(apiCall.body()!!))
            }
        } else {
            apiCall.errorBody()?.let { error ->
                error.close()
                emit(ApiState.Failed(error.string()))
            }
        }
    }
}.catch {
    emit(ApiState.Failed("${it.message}"))
}.flowOn(Dispatchers.IO)