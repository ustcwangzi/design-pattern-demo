package com.wz.adapter.classadapter;

import com.wz.adapter.Target;

/**
 * 测试类适配器
 * Create by wangzi on 2017/8/5
 */
public class TestClassAdapter {
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.method1();
        target.method2();
    }
}
