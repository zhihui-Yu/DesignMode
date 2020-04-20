package com.yzh.factory.factoryMethod;

import com.yzh.factory.Audi;
import com.yzh.factory.Car;

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
