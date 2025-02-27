package com.store.api

import com.store.api.common.exceptions.AbstractAppException
import com.store.api.common.exceptions.TestException
import com.store.api.common.responses.RestErrorResponse
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.HandlerInterceptor

@RestControllerAdvice
class AppControllerAdvice: HandlerInterceptor {
    @ExceptionHandler(AbstractAppException::class)
    fun handleAppException(ex: AbstractAppException): Any {
        val code = ex.code.code;
        val codeName = ex.code.name;
        return ResponseEntity.status(ex.httpStatusCode.value())
            .body(RestErrorResponse(ex))
    }
}