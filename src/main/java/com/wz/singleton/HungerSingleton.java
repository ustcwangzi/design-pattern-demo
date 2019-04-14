/**
 * <p>Title: HungerSingleton</p>
 * <p>Description: </p>
 * <p>Created by wangzi on 2019/4/14</p>
 * <p>Emil: ustcwangzi@foxmail.com</p>
 * <p>WebSite: https://github.com/ustcwangzi/</p>
 */
package com.wz.singleton;

/**
 * <p>饿汉式单例</p>
 * <p>能够保证线程安全，但是在未使用时就加载，可能会浪费内存</p>
 *
 * @author wangzi
 */
public class HungerSingleton {
    private static HungerSingleton singleton = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return singleton;
    }
}
