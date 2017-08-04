package com.wz.strategy;

/**
 * 测试策略模式
 * Create by wangzi on 2017/8/4
 */
public class TestStrategy {
    public static void main(String[] args) {
        MemberStrategy strategy = new AdvancedMemberStrategy();
        PriceContext context = new PriceContext(strategy);
        double price = context.calPrice(1000);
        System.out.println(price);
    }
}
