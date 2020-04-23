package com.yzh.creational.factory.factoryMethod;

import com.yzh.creational.factory.Audi;
import com.yzh.creational.factory.Car;

/**
 * @Author yzh
 * @Date 2020/4/20 11:18
 * @Version 1.0
 */
public class AudiFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Audi();
    }
}
