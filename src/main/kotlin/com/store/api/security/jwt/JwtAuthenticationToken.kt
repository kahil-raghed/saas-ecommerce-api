package com.store.api.security.jwt

import com.store.api.modules.user.User
import org.jose4j.jwt.JwtClaims
import org.jose4j.jwt.consumer.JwtContext
import org.springframework.security.core.Authentication
import org.springframework.security.core.GrantedAuthority

class JwtAuthenticationToken(
    final val jwtContext: JwtContext,
    private val user: User
) : Authentication {

    private var token: String = ""

    override fun getName(): String {
        return user.firstName + " " + user.lastName
    }

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return mutableSetOf()
    }

    override fun getCredentials(): String {
        return token
    }

    override fun getDetails(): User {
        return user
    }

    override fun getPrincipal(): User {
        return user
    }

    override fun isAuthenticated(): Boolean {
        return true;
    }

    override fun setAuthenticated(isAuthenticated: Boolean) {

    }
}