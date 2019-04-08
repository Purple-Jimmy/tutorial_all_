package com.tutorial.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jimmy
 * @date 2019-04-0822:12
 */
@RestController
@Slf4j
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
