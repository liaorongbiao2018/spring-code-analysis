package com.spring.code.analysis.basic.usage.aop.service;

/**
 * 计算类
 * @author liaorb
 * @version 1.0
 * @date 2021/1/14 13:11
 */
public interface Calculate {

    /**
     * 加法
     * @param numA
     * @param numB
     * @return
     */
    int add(int numA,int numB);

    /**
     * 减法
     * @param numA
     * @param numB
     * @return
     */
    int reduce(int numA,int numB);

    /**
     * 除法
     * @param numA
     * @param numB
     * @return
     */
    int div(int numA,int numB);

    /**
     * 乘法
     * @param numA
     * @param numB
     * @return
     */
    int multi(int numA,int numB);

    int mod(int numA,int numB);
}
