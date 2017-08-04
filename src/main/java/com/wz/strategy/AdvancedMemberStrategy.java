package com.wz.strategy;

/**
 * 实现类
 * Create by wangzi on 2017/8/4
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calPrice(double price) {
        System.out.println("高级会员折扣为20%");
        return price * 0.8;
    }
}
