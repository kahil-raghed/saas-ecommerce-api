package com.store.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class DemoApplication {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello World"
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}