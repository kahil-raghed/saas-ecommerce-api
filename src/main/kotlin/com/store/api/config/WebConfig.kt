package com.store.api.config

import com.store.api.modules.subscription.SubscriptionInterceptor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.handler.MappedInterceptor

@Configuration
class WebConfig: WebMvcConfigurer {

    @Bean
    fun subscriptionInterceptor(): MappedInterceptor {
        return MappedInterceptor(arrayOf("/**"), SubscriptionInterceptor())
    }
}