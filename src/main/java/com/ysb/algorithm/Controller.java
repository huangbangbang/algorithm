package com.ysb.algorithm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huang Bangbang
 * @date 2022/3/3 - 23:15
 */
@RestController
public class Controller {

    @RequestMapping("/getMessage")
    public String start(){
        return "hello springboot";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
