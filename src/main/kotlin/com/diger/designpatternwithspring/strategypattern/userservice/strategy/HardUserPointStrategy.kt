package com.diger.designpatternwithspring.strategypattern.userservice.strategy

import com.diger.designpatternwithspring.domain.User
import org.springframework.stereotype.Component

@Component
class HardUserPointStrategy : com.diger.designpatternwithspring.strategypattern.userservice.strategy.PointStrategy {

    // 일반 유저의 포인트 정책은 아래와 같다.
    // 기본 점수 20 + 현재 존재하는 일반 유저의 수 * 일반 유저를 제외한 유저의 수
    override fun calculateStrategy(user: User): Int {
        val currentNormalUserCount = 789123 // 레포지토리 계층에서 쿼리를 통해 얻어온 것으로 가정한다.
        val withoutNormalUserCount = 123456 // 레포지토리 계층에서 쿼리를 통해 얻어온 것으로 가정한다.

        return com.diger.designpatternwithspring.strategypattern.userservice.strategy.HardUserPointStrategy.Companion.DEFAULT_POINT + currentNormalUserCount * withoutNormalUserCount
    }


    companion object {
        const val DEFAULT_POINT = 20
    }

}