package com.store.api

import com.store.api.common.exceptions.TestException
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AppController {
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello World"
    }

    @GetMapping("/test-error")
    fun testError() {
        throw TestException("Test Exception");
    }
}