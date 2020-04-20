package com.yzh.factory.factoryMethod;

import com.yzh.factory.Byd;
import com.yzh.factory.Car;

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
