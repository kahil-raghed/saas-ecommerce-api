package com.store.api.modules.user

import org.springframework.data.annotation.Id
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class User {
    @Id()
    var id: String? = null
    var password: String? = null;
    var email: String? = null;
    var firstName: String? = null
    var lastName: String? = null
    var tenantId: String? = null

    override fun toString(): String {
        return String.format(
            "Customer[id=%s, firstName='%s', lastName='%s']",
            id, firstName, lastName
        )
    }
}