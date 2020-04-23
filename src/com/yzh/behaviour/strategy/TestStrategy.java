package com.yzh.behaviour.strategy;

/**
 * 不适用策略模式情况下：
 * 实现简单，但是不符合开闭原则，每次都要修改源码
 * @Author yzh
 * @Date 2020/4/23 17:25
 * @Version 1.0
 */
public class TestStrategy {
    public double getPrice(String type, double price){
        if(type.equals("普通客户小批量")){
            System.out.println("不打折,原价");
            return price;
        }else if(type.equals("普通客户大批量")){
            System.out.println("打九折");
            return price*0.9;
        }else if(type.equals("老客户小批量")){
            System.out.println("打八五折");
            return price*0.85;
        }else if(type.equals("老客户大批量")){
            System.out.println("打八折"); return price*0.8;
        }
        return price;
    }
}
