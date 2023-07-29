package com.diger.designpatternwithspring.domain.user.facadepattern.controller

data class CreateUserRequest(
    val loginId: String,
    val password: String,
)
