package com.diger.designpatternwithspring.domain.user.proxypattern.controller

data class CreateUserRequest(
    val loginId: String,
    val password: String,
)
