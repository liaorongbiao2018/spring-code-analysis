package com.spring.code.analysis.factory;

import com.spring.code.analysis.factory.domain.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/6 10:44
 */
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("META-INF/beanFactoryTest.xml"));
        MyTestBean myTestBean = beanFactory.getBean("myTestBean", MyTestBean.class);
        System.out.println(myTestBean.getTestStr().equals("testStr"));
    }
}
