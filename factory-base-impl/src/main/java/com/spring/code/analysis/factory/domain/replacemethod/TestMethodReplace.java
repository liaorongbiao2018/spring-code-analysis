package com.spring.code.analysis.factory.domain.replacemethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/7 17:12
 */
public class TestMethodReplace implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("i replace method");
        return null;
    }
}
