/**
 * <p>Title: TestSingleton</p>
 * <p>Description: </p>
 * <p>Created by wangzi on 2019/4/14</p>
 * <p>Emil: ustcwangzi@foxmail.com</p>
 * <p>WebSite: https://github.com/ustcwangzi/</p>
 */
package com.wz.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>测试单例模式</p>
 *
 * @author wangzi
 */
public class TestSingleton {
    public static void main(String[] args) throws Exception {
        int count = 100;
        CountDownLatch latch = new CountDownLatch(count);
        ExecutorService service = Executors.newFixedThreadPool(count);
        for (int i = 0; i < count; i++) {
            service.execute(() -> {
                latch.countDown();
                System.out.println(System.currentTimeMillis() + ": " + LazySingleton.getInstance());
            });
        }
        latch.await();
        service.shutdown();
    }
}
