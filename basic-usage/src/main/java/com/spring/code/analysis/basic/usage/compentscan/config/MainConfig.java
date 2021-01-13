package com.spring.code.analysis.basic.usage.compentscan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/13 17:14
 */
@Configuration
@ComponentScan(basePackages = "com.spring.code.analysis.basic.usage.compentscan",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)})
public class MainConfig {

}
