package com.spring.code.analysis.basic.usage.circulardepencies;


import javax.annotation.Resource;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/15 9:21
 */
public class Father {

    @Resource
    private Son son;

    public Son getSon() {
        return son;
    }

    public void setSon(Son son) {
        this.son = son;
    }
}
