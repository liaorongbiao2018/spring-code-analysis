package com.spring.code.analysis.basic.usage.aop;

import com.spring.code.analysis.basic.usage.aop.service.Calculate;
import com.spring.code.analysis.basic.usage.aop.service.impl.CalculateImpl;
import com.spring.code.analysis.basic.usage.aop.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * 测试aop切面
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
        Calculate calculate = applicationContext.getBean("calculate",Calculate.class);
        calculate.add(1,2);
    }
}
