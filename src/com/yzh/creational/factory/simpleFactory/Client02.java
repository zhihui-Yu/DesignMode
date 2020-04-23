package com.yzh.creational.factory.simpleFactory;

import com.yzh.creational.factory.Car;

/**
 * 使用简单工厂情况下 只需要知道工厂和产品名
 * @Author yzh
 * @Date 2020/4/20 11:07
 * @Version 1.0
 */
public class Client02 {
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪");

        c1.run();
        c2.run();
    }
}
