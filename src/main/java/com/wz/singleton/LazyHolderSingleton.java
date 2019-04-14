/**
 * <p>Title: LazyHolderSingleton</p>
 * <p>Description: </p>
 * <p>Created by wangzi on 2019/4/14</p>
 * <p>Emil: ustcwangzi@foxmail.com</p>
 * <p>WebSite: https://github.com/ustcwangzi/</p>
 */
package com.wz.singleton;

/**
 * <p>静态内部类式单例</p>
 * <p>借鉴了饿汉式，能够保证线程安全，并且因为静态内部类在使用时才加载，不会浪费内存</p>
 * <p>
 *     饿汉式方式是只要类被装载就会实例化，没有Lazy-Loading的作用，而静态内部类方式在外部类被装载时并不会立即实例化，
 *     而是在调用getInstance方法，才会装载LazyHolder类，从而完成LazyHolderSingleton的实例化。
 *     类的静态属性只会在第一次加载类的时候初始化，JVM帮助我们保证了线程的安全性。
 * </p>
 *
 * @author wangzi
 */
public class LazyHolderSingleton {
    private LazyHolderSingleton() {
    }

    public static LazyHolderSingleton getInstance() {
        return LazyHolder.SINGLETON;
    }

    private static class LazyHolder {
        private static final LazyHolderSingleton SINGLETON = new LazyHolderSingleton();
    }
}
