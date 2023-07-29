package com.diger.designpatternwithspring.proxypattern.usercontroller

data class CreateUserRequest(
    val loginId: String,
    val password: String,
)
