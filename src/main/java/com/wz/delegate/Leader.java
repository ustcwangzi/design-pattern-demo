package com.wz.delegate;

/**
 * Create by wangzi on 2017/8/3
 */
public class Leader {

    Employee employee = new Employee();

    public void method(){
        System.out.println("Leader call Employee...");
        employee.method();
    }
}
