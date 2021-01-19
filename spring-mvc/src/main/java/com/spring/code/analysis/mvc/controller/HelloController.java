package com.spring.code.analysis.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/19 9:22
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("/WEB-INF/page/hello.jsp");
        modelAndView.addObject("name","liaorb");
        return modelAndView;
    }
}
