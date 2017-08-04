package com.wz.factory.simplefactory;

/**
 * Created by wangzi on 2017-08-02.
 */
public class RedCar implements Car {
    public RedCar() {
        System.out.println("RedCar ...");
    }

    @Override
    public Car getCar() {
        return new RedCar();
    }
}
