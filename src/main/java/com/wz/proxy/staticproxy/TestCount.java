package com.wz.proxy.staticproxy;

/**
 * 测试静态代理
 * Created by wangzi on 2017-08-02.
 */
public class TestCount {
    public static void main(String[] args) {
        Count count = new CountProxy(new CountImpl());
        count.query();
    }
}
