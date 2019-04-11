package com.mongo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jimmy
 * @date 2019-04-11 11:30
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
