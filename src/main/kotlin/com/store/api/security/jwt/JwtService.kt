package com.store.api.security.jwt

import org.jose4j.jws.AlgorithmIdentifiers
import org.jose4j.jws.JsonWebSignature
import org.jose4j.jwt.JwtClaims
import org.jose4j.jwt.consumer.InvalidJwtException
import org.jose4j.jwt.consumer.JwtConsumer
import org.jose4j.jwt.consumer.JwtConsumerBuilder
import org.jose4j.jwt.consumer.JwtContext

import org.jose4j.keys.HmacKey
import org.springframework.stereotype.Component


@Component
class JwtService {

    private final val issuer = "test"
    private final val key = HmacKey("password".toByteArray())


    val jwtConsumer: JwtConsumer = JwtConsumerBuilder()
        .setExpectedIssuer(issuer)
        .setVerificationKey(key)
        .build()

    fun signJwt(username: String): String {
        val claims = JwtClaims()
        claims.issuer = issuer
        claims.subject = username
        claims.setGeneratedJwtId()
        claims.setStringListClaim("roles", "user")

        val jws = JsonWebSignature()
        jws.payload = claims.toJson()
        jws.key = key
        jws.algorithmHeaderValue = AlgorithmIdentifiers.HMAC_SHA256

        return jws.compactSerialization
    }

    @Throws(InvalidJwtException::class)
    fun parseJwt(token: String): JwtContext {
        return jwtConsumer.process(token)
    }
}