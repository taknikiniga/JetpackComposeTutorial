package com.taknikiniga.networking.data_layer.state

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.transform

sealed class ApiState<out T> {
    data object Loading : ApiState<Nothing>()
    data class Failed(val error: String) : ApiState<Nothing>()

    data class Success<D>(val data: D) : ApiState<D>()

    override fun toString(): String {
        return when (this) {
            is Failed -> {
                "Failure $error"
            }

            Loading -> {
                "Loading"
            }

            is Success -> {
                "Success $data"
            }
        }
    }
}

fun <T, R> ApiState<T>.map(transform: (T) -> R): ApiState<R> {
    return when (this) {
        is ApiState.Failed -> {
            ApiState.Failed(error)
        }

        ApiState.Loading -> {
            ApiState.Loading
        }

        is ApiState.Success -> {
            ApiState.Success(transform(data))
        }
    }
}

fun <T> Flow<ApiState<T>>.doOnSuccess(action:suspend (T)->Unit): Flow<ApiState<T>> = transform { result ->
    if (result is ApiState.Success){
        action(result.data)
    }
    return@transform emit(result)
}

fun <T> Flow<ApiState<T>>.doOnFailure(action: suspend (String) -> Unit): Flow<ApiState<T>> = transform { result ->
    if (result is ApiState.Failed){
        action(result.error)
    }
    return@transform emit(result)

}

fun <T> Flow<ApiState<T>>.doOnLoading(action: suspend () -> Unit): Flow<ApiState<T>> = transform { result ->
    if (result is ApiState.Loading){
        action()
    }
    return@transform emit(result)

}