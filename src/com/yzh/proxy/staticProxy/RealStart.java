package com.yzh.proxy.staticProxy;

/**
 * @Author yzh
 * @Date 2020/4/20 16:21
 * @Version 1.0
 */
public class RealStart implements Star{
    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    @Override
    public void sing() {
        System.out.println("RealStar(jay).sing()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
