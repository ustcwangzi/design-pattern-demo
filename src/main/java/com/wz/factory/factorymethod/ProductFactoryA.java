package com.wz.factory.factorymethod;

/**
 * Created by wangzi on 2017-08-02.
 */
public class ProductFactoryA implements ProductFactory {
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
