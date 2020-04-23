package com.yzh.behaviour.strategy;

/**
 * @Author yzh
 * @Date 2020/4/23 17:31
 * @Version 1.0
 */
public class OldCustomManyStrategy implements Strategy {
    @Override
    public double getPrice(double price) {
        System.out.println("打八折");
        return price*0.8;
    }
}
