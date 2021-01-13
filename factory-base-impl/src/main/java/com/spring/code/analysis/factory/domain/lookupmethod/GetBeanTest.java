package com.spring.code.analysis.factory.domain.lookupmethod;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/7 15:05
 */
public abstract class GetBeanTest {

    public void showMe(){
        this.getBean().showMe();
    }

    public abstract User getBean();
}
