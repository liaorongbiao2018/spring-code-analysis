package com.spring.code.analysis.basic.usage.circulardepencies;


import javax.annotation.Resource;

/**
 * @author liaorb
 * @version 1.0
 * @date 2021/1/15 9:22
 */
public class Son {

    @Resource
    private Father father;

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }
}
