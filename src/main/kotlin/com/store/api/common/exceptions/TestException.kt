package com.store.api.common.exceptions

import com.store.api.common.enums.ExceptionCode

class TestException(override val message: String) : AbstractAppException(message) {
    override val code = ExceptionCode.TEST_EXCEPTION
}