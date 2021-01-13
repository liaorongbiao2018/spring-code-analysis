package com.spring.code.analysis.basic.usage.start;

import com.spring.code.analysis.basic.usage.start.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 主要的配置文件 {@link AnnotationConfigTest}
 * @author liaorb
 * @version 1.0
 * @date 2021/1/13 17:02
 */
@Configuration
public class MainConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
