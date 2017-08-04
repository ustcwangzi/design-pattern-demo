package com.wz.template;

/**
 * 抽象模板类
 * Create by wangzi on 2017/8/4
 */
public abstract class AbstractTemplate {

    /**
     * 模版方法
     */
    public void templateMethod(){
        method1();
        method2();
        method3();
    }

    protected abstract void method1();
    protected abstract void method2();
    protected abstract void method3();
}
