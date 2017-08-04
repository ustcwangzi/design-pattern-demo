package com.wz.template;

/**
 * 具体模板类
 * Create by wangzi on 2017/8/4
 */
public class ConcreteTemplateA extends AbstractTemplate {
    @Override
    protected void method1() {
        System.out.println("ConcreteTemplateA.method1 ...");
    }

    @Override
    protected void method2() {
        System.out.println("ConcreteTemplateA.method2 ...");
    }

    @Override
    protected void method3() {
        System.out.println("ConcreteTemplateA.method3 ...");
    }
}
