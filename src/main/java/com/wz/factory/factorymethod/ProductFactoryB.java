package com.wz.factory.factorymethod;

/**
 * Created by wangzi on 2017-08-02.
 */
public class ProductFactoryB implements ProductFactory {
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}
