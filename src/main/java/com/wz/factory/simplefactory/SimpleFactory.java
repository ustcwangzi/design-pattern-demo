package com.wz.factory.simplefactory;

/**
 * 简单工厂
 * Created by wangzi on 2017-08-02.
 */
public class SimpleFactory {
    public Car getCar(String color){
        switch (color){
            case "red":
                return new RedCar();
            case "black":
                return new BlackCar();
            default:
                break;
        }
        return null;
    }
}
