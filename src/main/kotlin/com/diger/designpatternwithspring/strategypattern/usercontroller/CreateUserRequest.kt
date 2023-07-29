package com.diger.designpatternwithspring.strategypattern.usercontroller

data class CreateUserRequest(
    val loginId: String,
    val password: String,
)
