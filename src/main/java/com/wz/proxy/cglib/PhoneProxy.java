package com.wz.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB动态代理类
 * Created by wangzi on 2017-08-02.
 */
public class PhoneProxy implements MethodInterceptor {

    /**
     * 生成代理对象
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getInstance(Class<T> clazz){
        Enhancer enhancer = new Enhancer();
        //设置被代理的类
        enhancer.setSuperclass(clazz);
        //设置回调
        enhancer.setCallback(this);
        //创建代理对象
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("before...");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("after...");
        return result;
    }
}
