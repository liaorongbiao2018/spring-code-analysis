package com.spring.code.analysis.basic.usage.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/14 14:29
 */
@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.spring.code.analysis.basic.usage.aop.service.impl.CalculateImpl.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        System.out.println(logMessage("before",joinPoint));
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint){
        System.out.println(logMessage("after",joinPoint));
    }

    @AfterReturning("pointCut()")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println(logMessage("afterReturning",joinPoint));
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(JoinPoint joinPoint){
        System.out.println(logMessage("afterThrowing",joinPoint));
    }

//    @Around("pointCut()")
//    public Object around(JoinPoint joinPoint){
//        System.out.println(logMessage("around",joinPoint));
//    }

    private String logMessage(String type,JoinPoint joinPoint){
        return String.format("LogAspect %s 类名称: %s , 方法名: %s , 接口参数: %s",
                type,
                joinPoint.getTarget().getClass().getName(),
                joinPoint.getSignature().getName(),
                Arrays.toString(joinPoint.getArgs()));
    }

}
