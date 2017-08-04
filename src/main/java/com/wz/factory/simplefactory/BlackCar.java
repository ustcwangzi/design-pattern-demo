package com.wz.factory.simplefactory;

/**
 * Created by wangzi on 2017-08-02.
 */
public class BlackCar implements Car {

    public BlackCar() {
        System.out.println("BlackCar ...");
    }

    @Override
    public Car getCar() {
        return new BlackCar();
    }
}
