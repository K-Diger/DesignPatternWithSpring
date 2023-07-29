package com.diger.designpatternwithspring.domain.user.strategypattern.service.strategy

import com.diger.designpatternwithspring.domain.user.User


interface PointStrategy {
    fun calculateStrategy(user: User): Int
}