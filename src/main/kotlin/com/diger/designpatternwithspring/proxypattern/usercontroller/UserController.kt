package com.diger.designpatternwithspring.proxypattern.usercontroller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/proxy")
class UserController(
    private val postProxyService: com.diger.designpatternwithspring.proxypattern.userservice.UserProxyService
) {

    @PostMapping
    fun createUser(@RequestBody createUserRequest: com.diger.designpatternwithspring.facadepattern.usercontroller.CreateUserRequest) {
        postProxyService.createUser(createUserRequest.loginId, createUserRequest.password)
    }
}