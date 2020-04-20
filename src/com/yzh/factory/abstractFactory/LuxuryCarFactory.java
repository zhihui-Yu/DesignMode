package com.yzh.factory.abstractFactory;

/**
 * @Author yzh
 * @Date 2020/4/20 12:53
 * @Version 1.0
 */
public class LuxuryCarFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new luxuryEngine();
    }

    @Override
    public Wheel createWheel() {
        return new luxuryWheel();
    }

    @Override
    public Seat createSeat() {
        return new luxurySeat();
    }
}
