package com.wz.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理类
 * Created by wangzi on 2017-08-02.
 */
public class BookProxy implements InvocationHandler {
    private Object target;

    /**
     * 生成代理对象
     * @param target
     * @return
     */
    public Object getInstance(Object target){
        this.target = target;
        //获取代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before...");
        Object result = method.invoke(target, args);
        System.out.println("after...");
        return result;
    }
}
