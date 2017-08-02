package com.wz.factory.simplefactory;

/**
 * 简单工厂测试
 * Created by wangzi on 2017-08-02.
 */
public class CarTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        factory.getCar("red").carName();
    }
}
