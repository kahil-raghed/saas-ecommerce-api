package com.store.api.modules.subscription

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.stereotype.Component
import org.springframework.web.method.HandlerMethod
import org.springframework.web.servlet.HandlerInterceptor

class SubscriptionInterceptor : HandlerInterceptor {

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        if (HandlerMethod::class.isInstance(handler))
            return preHandleMethod(request, response, handler as HandlerMethod)
        return super.preHandle(request, response, handler)
    }

    private fun preHandleMethod(request: HttpServletRequest, response: HttpServletResponse, handler: HandlerMethod): Boolean {

        return super.preHandle(request, response, handler)
    }
}