package com.yzh.proxy.staticProxy;

/**
 * @Author yzh
 * @Date 2020/4/20 16:24
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        Star star = new RealStart();
        Star proxy = new ProxyStar(star);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();

    }
}
