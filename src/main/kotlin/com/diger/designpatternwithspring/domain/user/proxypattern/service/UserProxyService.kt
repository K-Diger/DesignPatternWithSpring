package com.diger.designpatternwithspring.domain.user.proxypattern.service

import com.diger.designpatternwithspring.domain.user.User

interface UserProxyService {
    fun createUser(loginId: String, password: String): User
}