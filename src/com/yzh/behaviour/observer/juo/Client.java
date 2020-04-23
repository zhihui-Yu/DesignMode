package com.yzh.behaviour.observer.juo;

/**
 * 使用 java.util.observable 测试观察者模式
 *
 * @Author yzh
 * @Date 2020/4/23 19:48
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建目标
        ConcreteSubject subject = new ConcreteSubject();

        //创建观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //添加观察者
        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);

        //改变state
        subject.set(3000);

        //查看观察者的mystate
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
