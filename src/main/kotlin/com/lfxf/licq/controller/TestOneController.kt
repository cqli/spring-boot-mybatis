package com.lfxf.licq.controller

import com.lfxf.licq.http.Http
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(value = "/hello")
class TestOneController {
    @RequestMapping("/world",method = arrayOf(RequestMethod.GET))
    fun helloWorld(): String? {
        return Http.getHttpService().query().execute().body()
    }

}