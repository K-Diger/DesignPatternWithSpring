package com.diger.designpatternwithspring.strategypattern.usercontroller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/strategy")
class UserController(
    private val userService: com.diger.designpatternwithspring.strategypattern.userservice.UserService
) {

    @PostMapping
    fun createUser(@RequestBody createUserRequest: com.diger.designpatternwithspring.strategypattern.usercontroller.CreateUserRequest) {
        userService.createUser(
            loginId = createUserRequest.loginId,
            password = createUserRequest.password
        )
    }

    @PutMapping
    fun updateUserGrade(@RequestBody updateUserGradeRequest: com.diger.designpatternwithspring.strategypattern.usercontroller.UpdateUserGradeRequest) {
        userService.updateUserGradeVIP(updateUserGradeRequest.id)
    }
}