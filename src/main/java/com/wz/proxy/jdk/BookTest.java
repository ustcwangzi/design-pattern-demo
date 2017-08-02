package com.wz.proxy.jdk;

/**
 * 测试JDK动态代理
 * Created by wangzi on 2017-08-02.
 */
public class BookTest {
    public static void main(String[] args) {
        Book book = (Book) new BookProxy().getInstance(new BookImpl());
        book.query();
    }
}
