package com.store.api.common.responses

abstract class AbstractRestResponse<T> {
    abstract val data: T?
    abstract val status: String
}