package com.wz.proxy.cglib;

/**
 * 测试CGLIB动态代理
 * Created by wangzi on 2017-08-02.
 */
public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new PhoneProxy().getInstance(Phone.class);
        phone.query();
    }
}
