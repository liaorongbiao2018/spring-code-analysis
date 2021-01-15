package com.spring.code.analysis.basic.usage.circulardepencies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 循环依赖
 * @author liaorb
 * @version 1.0
 * @date 2021/1/15 9:23
 */
@Configuration
public class AnnotationConfigTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfigTest.class);
        Father father = applicationContext.getBean("father", Father.class);
        Son son = applicationContext.getBean("son", Son.class);
        System.out.println(father.getSon() == son);
    }

    @Bean
    public Father father(){
        return new Father();
    }

    @Bean
    public Son son(){
        return new Son();
    }
}
