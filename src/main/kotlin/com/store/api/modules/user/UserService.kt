package com.store.api.modules.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service()
class UserService {
    @Autowired
    lateinit var userRepository: UserRepository

    fun list(): List<User> = userRepository.findAll()
}