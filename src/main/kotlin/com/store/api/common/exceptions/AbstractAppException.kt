package com.store.api.common.exceptions

import com.store.api.common.enums.ExceptionCode
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode

abstract class AbstractAppException(override val message: String?) : Exception() {
    val httpStatusCode = HttpStatus.BAD_REQUEST
    val debugOnly = false;
    abstract val code: ExceptionCode
}