package com.diger.designpatternwithspring.domain.user.strategypattern.repository

import com.diger.designpatternwithspring.domain.user.User
import org.springframework.data.jpa.repository.JpaRepository

interface StrategyPatternUserRepository : JpaRepository<User, Long> {
}