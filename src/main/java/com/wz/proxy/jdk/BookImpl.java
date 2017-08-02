package com.wz.proxy.jdk;

/**
 * 被代理类
 * Created by wangzi on 2017-08-02.
 */
public class BookImpl implements Book {
    @Override
    public void query() {
        System.out.println("BookImpl.query()...");
    }
}
