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
 *
 * @author wangzi
 */
public class LazyHolderSingleton {
    private LazyHolderSingleton() {
    }

    public static LazyHolderSingleton getInstance() {
        return LazyHolder.singleton;
    }

    private static class LazyHolder {
        private static LazyHolderSingleton singleton = new LazyHolderSingleton();
    }
}
