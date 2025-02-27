package com.store.api.config

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration()
class AppConfig {

    @Bean
    fun mongoClient(): MongoClient {
        return MongoClients.create("mongodb://localhost:28017/spring")
    }
}