package com.wz.factory.factorymethod;

/**
 * Created by wangzi on 2017-08-02.
 */
public class ProductA implements Product {
    @Override
    public void create() {
        System.out.println("ProductA ...");
    }
}
