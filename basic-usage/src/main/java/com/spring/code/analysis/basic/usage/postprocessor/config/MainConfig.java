package com.spring.code.analysis.basic.usage.postprocessor.config;

import com.spring.code.analysis.basic.usage.postprocessor.PersonInterceptor;
import com.spring.code.analysis.basic.usage.postprocessor.domian.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/15 16:34
 */
@Configuration
public class MainConfig {


    @Bean
    public Person person(){
        return new Person();
    }

    @Bean
    public PersonInterceptor personInterceptor(){
        return new PersonInterceptor();
    }
}
