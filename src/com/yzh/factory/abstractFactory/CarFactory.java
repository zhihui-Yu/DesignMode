package com.yzh.factory.abstractFactory;

/**
 * @Author yzh
 * @Date 2020/4/20 12:52
 * @Version 1.0
 */
public interface CarFactory {
    Engine createEngine();
    Wheel createWheel();
    Seat createSeat();
}
