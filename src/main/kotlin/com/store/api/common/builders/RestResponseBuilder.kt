package com.store.api.common.builders

import com.store.api.common.enums.ExceptionCode

class RestResponseBuilder {
    private var code: ExceptionCode? = null
    private var message: String? = null
}