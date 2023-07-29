package com.diger.designpatternwithspring.domain.user.proxypattern.controller

import com.diger.designpatternwithspring.domain.user.facadepattern.controller.CreateUserRequest
import com.diger.designpatternwithspring.domain.user.proxypattern.service.UserProxyService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/proxy")
class UserController(
    private val postProxyService: UserProxyService
) {

    @PostMapping
    fun createUser(@RequestBody createUserRequest: CreateUserRequest) {
        postProxyService.createUser(createUserRequest.loginId, createUserRequest.password)
    }
}