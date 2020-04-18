package com.yzh.singleton;

import java.io.Serializable;

/**
 *  单例 -- 饿汉式
 *
 * @Author yzh
 * @Date 2020/4/18 15:37
 * @Version 1.0
 */
public class SingletonDemo1 implements Serializable {

    //类初始化时，立即加载对象（没有延时加载的优势）。加载类时，天然的线程安全！
    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1(){

    }
    //方法没有同步，调用效率高
    public  static SingletonDemo1 getInstance(){
        return instance;
    }
}
