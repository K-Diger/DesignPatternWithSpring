package com.diger.designpatternwithspring.facadeproxystrategy.usercontroller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/user")
class UserController {

    @PostMapping
    fun createUser(@RequestBody createUserRequest: com.diger.designpatternwithspring.facadeproxystrategy.usercontroller.dto.CreateUserRequest) {

    }
}