package com.yzh.factory.factoryMethod;

import com.yzh.factory.Audi;
import com.yzh.factory.Car;

/**
 * @Author yzh
 * @Date 2020/4/20 11:19
 * @Version 1.0
 */
public class Client {
    //扩展时 通过扩展类  继承CarFactory
    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactory().createCar();

        c1.run();
        c2.run();
    }
}
