package com.diger.designpatternwithspring.facadeproxystrategy.userservice

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserFacadeService(
    private val userService: com.diger.designpatternwithspring.strategypattern.userservice.UserService,

    ) {
}