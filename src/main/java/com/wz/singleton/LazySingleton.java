/**
 * <p>Title: LazySingleton</p>
 * <p>Description: </p>
 * <p>Created by wangzi on 2019/4/14</p>
 * <p>Emil: ustcwangzi@foxmail.com</p>
 * <p>WebSite: https://github.com/ustcwangzi/</p>
 */
package com.wz.singleton;

/**
 * <p>懒汉式单例</p>
 * <p>无法保证线程安全</p>
 *
 * @author wangzi
 */
public class LazySingleton {
    private static LazySingleton singleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (singleton == null) {
            return new LazySingleton();
        }
        return singleton;
    }

}
