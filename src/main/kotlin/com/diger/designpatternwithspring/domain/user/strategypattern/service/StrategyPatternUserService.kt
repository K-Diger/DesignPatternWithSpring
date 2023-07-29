package com.diger.designpatternwithspring.domain.user.strategypattern.service

import com.diger.designpatternwithspring.domain.post.facadepattern.repository.FPPostRepository
import org.springframework.stereotype.Service

@Service
class StrategyPatternUserService(
    private val FPPostRepository: FPPostRepository,
) {
}