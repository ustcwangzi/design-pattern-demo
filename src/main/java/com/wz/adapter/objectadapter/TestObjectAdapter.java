package com.wz.adapter.objectadapter;

import com.wz.adapter.Adaptee;
import com.wz.adapter.Target;

/**
 * 测试对象适配器
 * Create by wangzi on 2017/8/5
 */
public class TestObjectAdapter {
    public static void main(String[] args) {
        Target target = new ObjectAdapter(new Adaptee());
        target.method1();
        target.method2();
    }
}
