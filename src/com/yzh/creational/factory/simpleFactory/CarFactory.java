package com.yzh.creational.factory.simpleFactory;

import com.yzh.creational.factory.Audi;
import com.yzh.creational.factory.Byd;
import com.yzh.creational.factory.Car;

/**
 * @Author yzh
 * @Date 2020/4/20 11:07
 * @Version 1.0
 */
public class CarFactory {
    // 不足： 添加时，需要修改代码，违反开闭原则
    public static Car createCar(String name){
        if("奥迪".equals(name)){
            return new Audi();
        }
        else if("比亚迪".equals(name)){
            return new Byd();
        }
        else {
            return null;
        }
    }
}
