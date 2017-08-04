package com.wz.template;

/**
 * 测试模板模式
 * Create by wangzi on 2017/8/4
 */
public class TestTemplate {
    public static void main(String[] args) {
        ConcreteTemplateA templateA = new ConcreteTemplateA();
        templateA.templateMethod();

        ConcreteTemplateB templateB = new ConcreteTemplateB();
        templateB.templateMethod();
    }
}
