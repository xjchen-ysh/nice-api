package com.zyr.nice.module.core.model

data class ResponseDTO<T>(val data: T? = null, val message: String = "", val success: Boolean) {
}

fun <T> succ(data: T): ResponseDTO<T> {
    return ResponseDTO(data, "success", success = true)
}