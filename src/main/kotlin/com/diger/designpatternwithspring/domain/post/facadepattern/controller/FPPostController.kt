package com.diger.designpatternwithspring.domain.post.facadepattern.controller

import com.diger.designpatternwithspring.domain.post.facadepattern.service.FPPostService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/facade")
class FPPostController(
    private val fpPostService: FPPostService
) {

    
}