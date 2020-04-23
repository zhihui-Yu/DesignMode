package com.yzh.creational.factory.abstractFactory;

/**
 * @Author yzh
 * @Date 2020/4/20 12:50
 * @Version 1.0
 */
public interface Wheel {
    void revolve();
}
class luxuryWheel implements Wheel{

    @Override
    public void revolve() {
        System.out.println("旋转不磨损");
    }
}
class lowWheel implements Wheel{

    @Override
    public void revolve() {
        System.out.println("旋转磨损快");
    }
}