package com.store.api.modules.user.exceptions

import com.store.api.common.enums.ExceptionCode
import com.store.api.common.exceptions.AbstractAppException

class UserNotFoundException: AbstractAppException("User not found") {
    override val code = ExceptionCode.USER_NOT_FOUND
}