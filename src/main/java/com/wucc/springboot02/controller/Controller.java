package com.wucc.springboot02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WuDingJia
 * @create 2019-07-30 14:57
 */
@RestController
public class Controller {
    @Value("${person.name}")
    private String name;
    @RequestMapping("/sayHello")
    public String sayHello(){
        return name;
    }
}
