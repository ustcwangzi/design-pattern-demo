package com.wz.prototype;

import java.util.Arrays;

/**
 * 测试原型模式
 * 浅拷贝只拷贝八大基本类型，对于其他类型只拷贝引用，即地址相同
 * 深拷贝会拷贝其他类型，使用新的地址
 * Create by wangzi on 2017/8/4
 */
public class TestPrototype {
    public static void main(String[] args) {
        Prototype prototype = new Prototype(100, "wang", Arrays.asList("a", "b", "c"));
        Prototype copy = prototype.clone();
        Prototype deepCopy = prototype.deepClone();
        System.out.println(copy == prototype);  //false
        System.out.println(deepCopy == prototype);  //false
        System.out.println(copy.getId() == prototype.getId());  //true
        System.out.println(deepCopy.getId() == prototype.getId());  //true
        System.out.println(copy.getName() == prototype.getName());  //true
        System.out.println(deepCopy.getName() == prototype.getName());  //true
        System.out.println(copy.getList() == prototype.getList());  //true
        System.out.println(deepCopy.getList() == prototype.getList());  //false
    }
}
