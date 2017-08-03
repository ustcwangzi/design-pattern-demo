package com.wz.delegate;

/**
 * 测试委派模式，Leader委派Employee进行实际的工作
 * Create by wangzi on 2017/8/3
 */
public class TestDelegate {
    public static void main(String[] args) {
        Leader leader = new Leader();
        leader.method();
    }
}
