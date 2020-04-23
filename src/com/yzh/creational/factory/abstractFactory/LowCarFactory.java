package com.yzh.creational.factory.abstractFactory;

/**
 * @Author yzh
 * @Date 2020/4/20 12:54
 * @Version 1.0
 */
public class LowCarFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new lowEngine();
    }

    @Override
    public Wheel createWheel() {
        return new lowWheel();
    }

    @Override
    public Seat createSeat() {
        return new lowSeat();
    }
}