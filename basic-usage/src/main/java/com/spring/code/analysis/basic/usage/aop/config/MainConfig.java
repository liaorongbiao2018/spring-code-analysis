package com.spring.code.analysis.basic.usage.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/14 14:28
 */
@ComponentScan(basePackages = "com.spring.code.analysis.basic.usage.aop")
@EnableAspectJAutoProxy
@Configuration
public class MainConfig {

}
