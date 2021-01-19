package com.spring.code.analysis.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/19 15:15
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public Object test(){
        return "sda";
    }
}
