package com.diger.designpatternwithspring.domain.user.strategypattern.service.strategy

import com.diger.designpatternwithspring.domain.User


interface PointStrategy {
    fun calculateStrategy(user: User): Int
}