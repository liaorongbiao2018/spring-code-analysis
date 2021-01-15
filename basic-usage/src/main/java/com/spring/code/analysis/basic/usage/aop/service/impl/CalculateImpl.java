package com.spring.code.analysis.basic.usage.aop.service.impl;

import com.spring.code.analysis.basic.usage.aop.service.Calculate;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/14 13:12
 */
@Service("calculate")
public class CalculateImpl implements Calculate {

    @Override
    public int add(int numA, int numB) {
        System.out.println("执行目标方法:add");
        return numA + numB;
    }

    @Override
    public int reduce(int numA, int numB) {
        System.out.println("执行目标方法:reduce");
        return numA - numB;
    }

    @Override
    public int div(int numA, int numB) {
        System.out.println("执行目标方法:div");
        return numA / numB;
    }

    @Override
    public int multi(int numA, int numB) {
        System.out.println("执行目标方法:multi");
        return numA * numB;
    }

    @Override
    public int mod(int numA, int numB) {
        System.out.println("执行目标方法:mod");
        int retVal = ((Calculate) AopContext.currentProxy()).add(numA,numB);

        //int retVal = this.add(numA,numB);

        return retVal%numA;
    }
}
