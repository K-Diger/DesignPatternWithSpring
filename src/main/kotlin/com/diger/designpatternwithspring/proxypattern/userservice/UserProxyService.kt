package com.diger.designpatternwithspring.proxypattern.userservice

import com.diger.designpatternwithspring.domain.User

interface UserProxyService {
    fun createUser(loginId: String, password: String): User
}