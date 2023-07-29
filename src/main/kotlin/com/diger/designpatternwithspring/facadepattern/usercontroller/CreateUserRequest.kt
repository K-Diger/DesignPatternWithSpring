package com.diger.designpatternwithspring.facadepattern.usercontroller

data class CreateUserRequest(
    val loginId: String,
    val password: String,
)
