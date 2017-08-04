package com.wz.adapter.objectadapter;

import com.wz.adapter.Adaptee;
import com.wz.adapter.Target;

/**
 * 对象适配器，采用委派
 * Create by wangzi on 2017/8/5
 */
public class ObjectAdapter implements Target{
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 直接委派
     */
    public void method1(){
        adaptee.method1();
    }

    /**
     * 适配器补充该方法
     */
    public void method2(){
        System.out.println("ObjectAdapter.method2 ...");
    }
}
