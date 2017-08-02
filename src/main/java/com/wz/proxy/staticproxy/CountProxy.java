package com.wz.proxy.staticproxy;

/**
 * 静态代理类
 * Created by wangzi on 2017-08-02.
 */
public class CountProxy implements Count {
    private CountImpl count;

    public CountProxy(CountImpl count) {
        this.count = count;
    }

    @Override
    public void query() {
        System.out.println("before...");
        count.query();
        System.out.println("after...");
    }
}
