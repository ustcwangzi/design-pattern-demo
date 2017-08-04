package com.wz.strategy;

/**
 * 实现类
 * Create by wangzi on 2017/8/4
 */
public class CommonMemberStrategy implements MemberStrategy {
    @Override
    public double calPrice(double price) {
        System.out.println("普通会员折扣为10%");
        return price * 0.9;
    }
}
