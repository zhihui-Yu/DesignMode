package com.yzh.creational.singleton;

/**
 *  单例 -- 双重检测锁
 *  由于JVM底层原因 偶尔会出问题，不建议使用
 * @Author yzh
 * @Date 2020/4/18 15:44
 * @Version 1.0
 */
public class SingletonDemo3 {
    private  static SingletonDemo3 instance = null;

    private  SingletonDemo3() {}

    public static SingletonDemo3 getInstance() {
        if(instance == null) {
            SingletonDemo3 sc;
            synchronized (SingletonDemo3.class) {
                sc = instance;
                if(sc == null) {
                    synchronized (SingletonDemo3.class) {
                        if(sc == null) {
                            sc = new SingletonDemo3();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }
}
