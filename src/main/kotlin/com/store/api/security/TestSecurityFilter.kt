package com.store.api.security

import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.security.authentication.TestingAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.OncePerRequestFilter

class TestSecurityFilter: OncePerRequestFilter() {
    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        val ctx = SecurityContextHolder.createEmptyContext()
        val token = TestingAuthenticationToken("user", "password", "user");
        token.isAuthenticated = false;
        ctx.authentication = token;
        SecurityContextHolder.setContext(ctx);
    }

}