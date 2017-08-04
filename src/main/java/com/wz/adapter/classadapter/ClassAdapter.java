package com.wz.adapter.classadapter;

import com.wz.adapter.Adaptee;
import com.wz.adapter.Target;

/**
 * 类适配器
 * Create by wangzi on 2017/8/5
 */
public class ClassAdapter extends Adaptee implements Target{
    /**
     * 源类Adaptee上没有该方法，因此在适配器里补充上该方法
     */
    @Override
    public void method2() {
        System.out.println("ClassAdapter.method2 ...");
    }
}
