package com.wz.proxy.staticproxy;

/**
 * 被代理类
 * Created by wangzi on 2017-08-02.
 */
public class CountImpl implements Count {
    @Override
    public void query() {
        System.out.println("CountImpl.query()...");
    }
}
