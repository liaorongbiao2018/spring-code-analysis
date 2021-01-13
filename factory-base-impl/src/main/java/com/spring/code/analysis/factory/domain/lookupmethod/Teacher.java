package com.spring.code.analysis.factory.domain.lookupmethod;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/7 15:05
 */
public class Teacher extends User{

    @Override
    public void showMe() {
        System.out.println("i am teacher");
    }
}
