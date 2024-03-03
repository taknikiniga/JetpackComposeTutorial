package com.taknikiniga.session1.app_layer.utils

data class DataState<T>(
    var isSuccess: Boolean = false,
    var data: List<T>? = null,
    var hasError: Boolean = false,
    var errMsg: String = "",
    var isLoading: Boolean = false
)
