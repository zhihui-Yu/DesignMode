package com.yzh.structural.decorator;

/**
 * 装饰器模式
 * 优点：扩展对象功能，可以对一个对象进行多次装饰，创造出不同行为的组合
 * 缺点：产生很大小对象，出错不易排查
 * 案例：
 * IO输入流输出流(典型)
 * @Author yzh
 * @Date 2020/4/23 11:48
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新功能： 飞行-----");

        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加新功能：水里游");

        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("增加新功能：天上飞，自动跑");
        AICar aiCar = new AICar(new FlyCar(car));
        aiCar.move();
    }
}
