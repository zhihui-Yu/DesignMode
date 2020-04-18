package com.yzh.singleton;

/**
 * 单例 -- 静态内部类
 *  线程安全，调用效率高，具有延时加载特点
 * @Author yzh
 * @Date 2020/4/18 15:48
 * @Version 1.0
 */
public class SingletonDemo4 {
    //延时加载 --  需要时 才调用静态内部类
    private static class SingletonClassInstance{
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }
    public static SingletonDemo4 getInstance() {
        return SingletonClassInstance.instance;
    }
    private SingletonDemo4(){}
}
