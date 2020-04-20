package com.yzh.factory.simpleFactory;

import com.yzh.factory.Audi;
import com.yzh.factory.Byd;
import com.yzh.factory.Car;

/**
 * 没有工厂模式的情况下
 *
 * 什么都要依赖
 *
 * @Author yzh
 * @Date 2020/4/20 11:05
 * @Version 1.0
 */
public class Client01 {
    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new Byd();

        c1.run();
        c2.run();
    }
}
