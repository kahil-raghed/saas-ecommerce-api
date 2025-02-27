package com.store.api.common.responses

import com.store.api.common.enums.ExceptionCode
import com.store.api.common.enums.ResponseStatus
import com.store.api.common.exceptions.AbstractAppException

class RestErrorResponse(val message: String, code: ExceptionCode) : AbstractRestResponse<Any>() {

    constructor(ex: AbstractAppException): this(ex.message ?: ex.code.defaultMessage, ex.code)

    override val data = null
    override val status = ResponseStatus.error.name
    val code = code.code
    val codeName = code.name
}