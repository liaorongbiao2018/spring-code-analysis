package com.spring.code.analysis.basic.usage.compentscan;

import com.spring.code.analysis.basic.usage.compentscan.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * 测试包扫描{@link org.springframework.context.annotation.ComponentScan}
 * <p>
 *     includeFilters 包含哪些Fitter
 *     excludeFilters 不包含哪些Fitter
 * </p>
 * @author liaorb
 * @version 1.0
 * @date 2021/1/13 17:13
 */
public class AnnotationConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }
}
