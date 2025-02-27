package com.store.api.common.enums

enum class ExceptionCode(val code: Int, val defaultMessage: String) {
    TEST_EXCEPTION(99999, "Test exception"),
    USER_NOT_FOUND(11001, "User not found"),
}