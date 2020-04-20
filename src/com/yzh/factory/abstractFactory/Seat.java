package com.yzh.factory.abstractFactory;

import java.io.Serializable;

/**
 * @Author yzh
 * @Date 2020/4/20 12:49
 * @Version 1.0
 */
public interface Seat {
    void massage();
}

class luxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("可以按摩");
    }
}

class lowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("不可以按摩");
    }
}