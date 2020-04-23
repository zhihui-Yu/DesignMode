package com.yzh.structural.decorator;

/**
 * @Author yzh
 * @Date 2020/4/23 11:42
 * @Version 1.0
 */
public interface ICar {
    void move();
}
//ConcreateComponent 具体构建角色（真实对象）
class Car implements ICar {

    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}
//装饰器角色
class SuperCar implements ICar{

    private ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

//具体装饰角色
class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("在天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
//具体装饰角色
class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("在水中游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
//具体装饰角色
class AICar extends SuperCar {

    public AICar(ICar car) {
        super(car);
    }

    public void run(){
        System.out.println("自动跑");
    }

    @Override
    public void move() {
        super.move();
        run();
    }
}