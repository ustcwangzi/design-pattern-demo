package com.wz.factory.factorymethod;

/**
 * Created by wangzi on 2017-08-02.
 */
public class ProductB implements Product {
    @Override
    public void create() {
        System.out.println("ProductB ...");
    }
}
