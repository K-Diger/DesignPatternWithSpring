package com.diger.designpatternwithspring.domain.user.facadepattern.controller

import com.diger.designpatternwithspring.domain.user.facadepattern.service.UserFacadeService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/facade")
class FPUserController(
    private val userFacadeService: UserFacadeService
) {

    @PostMapping
    fun createUser(@RequestBody createUserRequest: CreateUserRequest) {
        userFacadeService.createUser(
            loginId = createUserRequest.loginId,
            password = createUserRequest.password
        )
    }
}