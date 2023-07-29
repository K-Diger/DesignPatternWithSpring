package com.diger.designpatternwithspring.domain.user.strategypattern.controller

data class CreateUserRequest(
    val loginId: String,
    val password: String,
)
