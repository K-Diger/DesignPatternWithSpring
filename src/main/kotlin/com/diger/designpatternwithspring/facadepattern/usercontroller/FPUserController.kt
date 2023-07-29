package com.diger.designpatternwithspring.facadepattern.usercontroller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/facade")
class FPUserController(
    private val userFacadeService: com.diger.designpatternwithspring.facadepattern.userservice.UserFacadeService
) {

    @PostMapping
    fun createUser(@RequestBody createUserRequest: com.diger.designpatternwithspring.facadepattern.usercontroller.CreateUserRequest) {
        userFacadeService.createUser(
            loginId = createUserRequest.loginId,
            password = createUserRequest.password
        )
    }
}