package com.store.api.security.jwt

import com.store.api.modules.user.User
import com.store.api.modules.user.UserRepository
import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.http.HttpHeaders
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.OncePerRequestFilter

class JwtAuthenticationFilter(private val jwtService: JwtService, private val userRepository: UserRepository) :
    OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest, response: HttpServletResponse, filterChain: FilterChain
    ) {
        val header = request.getHeader(HttpHeaders.AUTHORIZATION);
        try {
            if (header != null && header.startsWith("Bearer ")) {
                val token = header.split(" ")[1].trim();
                val jwt = jwtService.parseJwt(token);
                val user = User()
                val authentication = JwtAuthenticationToken(jwt, user)
                val ctx = SecurityContextHolder.createEmptyContext()
                ctx.authentication = authentication
                SecurityContextHolder.setContext(ctx);
            }
        } catch (_: Exception) {

        }
        filterChain.doFilter(request, response)
    }

}