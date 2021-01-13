package com.spring.code.analysis.basic.usage.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解版本的用法
 * @author liaorb
 * @version 1.0
 * @date 2021/1/13 17:01
 */
public class AnnotationConfigTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(applicationContext.getBean("person"));
    }
}
