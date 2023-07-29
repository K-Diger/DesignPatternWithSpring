package com.diger.designpatternwithspring.domain.user.strategypattern.controller

import com.diger.designpatternwithspring.domain.user.strategypattern.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/strategy")
class UserController(
    private val userService: UserService
) {

    @PostMapping
    fun createUser(@RequestBody createUserRequest: CreateUserRequest) {
        userService.createUser(
            loginId = createUserRequest.loginId,
            password = createUserRequest.password
        )
    }

    @PutMapping
    fun updateUserGrade(@RequestBody updateUserGradeRequest: UpdateUserGradeRequest) {
        userService.updateUserGradeVIP(updateUserGradeRequest.id)
    }
}