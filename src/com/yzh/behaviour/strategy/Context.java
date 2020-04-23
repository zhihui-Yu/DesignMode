package com.yzh.behaviour.strategy;

/**
 * 负责与具体策略交互
 * @Author yzh
 * @Date 2020/4/23 18:40
 * @Version 1.0
 */
public class Context {
    private Strategy strategy;//当前使用的算法

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s) {
        System.out.println("价格为"+String.format("%.2f",strategy.getPrice(998)));
    }
}
