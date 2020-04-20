package com.yzh.factory.simpleFactory;

import com.yzh.factory.Audi;
import com.yzh.factory.Byd;
import com.yzh.factory.Car;

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
