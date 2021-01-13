package com.spring.code.analysis.basic.usage.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用xml配置
 * {@link AnnotationConfigTest}
 * @author liaorb
 * @version 1.0
 * @date 2021/1/13 17:00
 */
public class XmlBeanFactoryTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlBeanFactory.xml");
        System.out.println(applicationContext.getBean("person"));
    }
}
