package com.store.api.security

import com.store.api.security.dtos.LoginDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("auth")
class AuthController {
    @PostMapping("access_token")
    fun obtainToken(@RequestBody() dto: LoginDto){

    }

}