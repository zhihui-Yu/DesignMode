package com.yzh.creational.factory.factoryMethod;

import com.yzh.creational.factory.Byd;
import com.yzh.creational.factory.Car;

/**
 * @Author yzh
 * @Date 2020/4/20 11:19
 * @Version 1.0
 */
public class BydFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Byd();
    }
}
