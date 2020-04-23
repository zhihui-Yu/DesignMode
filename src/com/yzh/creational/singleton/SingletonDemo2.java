package com.yzh.creational.singleton;

/**
 *  单例 -- 懒汉
 *
 * @Author yzh
 * @Date 2020/4/18 15:40
 * @Version 1.0
 */
public class SingletonDemo2 {
    //延时加载，在需要时候再加载
    private static  SingletonDemo2 s ;

    private SingletonDemo2 () {}

    /**
     * 线程安全，资源利用率高了，但是并发效率低
     * @return
     */
    public static synchronized SingletonDemo2 getInstance() {
        if(s == null) {
            s = new SingletonDemo2();
        }
        return s;
    }
}
