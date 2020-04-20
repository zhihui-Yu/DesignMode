package com.yzh.factory.abstractFactory;

/**
 * @Author yzh
 * @Date 2020/4/20 12:45
 * @Version 1.0
 */
public interface Engine {
    void start();
}
class luxuryEngine implements Engine{
    @Override
    public void start() {
        System.out.println("好发动机 启动");
    }
}

class lowEngine implements Engine{

    @Override
    public void start() {
        System.out.println("差发动机 启动");
    }
}