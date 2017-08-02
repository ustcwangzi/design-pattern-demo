package com.wz.factory.factorymethod;

/**
 * 工厂方法模式
 * Created by wangzi on 2017-08-02.
 */
public class ProductTest {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactoryA();
        factory.getProduct().create();
    }
}
