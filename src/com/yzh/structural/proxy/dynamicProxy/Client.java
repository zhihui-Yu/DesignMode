package com.yzh.structural.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Author yzh
 * @Date 2020/4/20 16:32
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStart();
        StarHandler handler = new StarHandler(realStar);

        Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Star.class}, handler);

        proxy.sing();
    }
}
