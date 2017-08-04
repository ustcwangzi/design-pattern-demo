package com.wz.strategy;

/**
 * 环境类
 * Create by wangzi on 2017/8/4
 */
public class PriceContext {
    //持有一个具体的策略类
    private MemberStrategy strategy;

    public PriceContext(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    public double calPrice(double price){
        return strategy.calPrice(price);
    }
}
