package com.diger.designpatternwithspring.domain.user.strategypattern.controller

import com.diger.designpatternwithspring.domain.post.facadepattern.service.FPPostService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/strategy")
class StrategyPatternUserController(
    private val FPPostService: FPPostService
) {


}