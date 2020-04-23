package com.yzh.creational.factory.abstractFactory;

/**
 * @Author yzh
 * @Date 2020/4/20 12:55
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        e.start();
    }
}
