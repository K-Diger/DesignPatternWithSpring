package com.diger.designpatternwithspring.strategypattern.userservice.strategy

import com.diger.designpatternwithspring.domain.User


interface PointStrategy {
    fun calculateStrategy(user: User): Int
}