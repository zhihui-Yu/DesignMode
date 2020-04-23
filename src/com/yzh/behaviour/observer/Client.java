package com.yzh.behaviour.observer;

/**
 * 观察者模式：多个订阅者，在数据变化时，所有订阅者数据都要变
 * 案例：
 *  1.Servlet监听器实现
 *  2.聊天室
 *  3.多人游戏
 * @Author yzh
 * @Date 2020/4/23 19:27
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建观察者
        ObserveA obs1 = new ObserveA();
        ObserveA obs2 = new ObserveA();
        ObserveA obs3 = new ObserveA();

        //添加到目标对象的观察者队伍中
        subject.register(obs1);
        subject.register(obs2);
        subject.register(obs3);

        //改变subject的状态
        subject.setState(300);

        //观察者状态？
        System.out.println("===================");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());


        //改变subject的状态
        subject.setState(100);

        //观察者状态？
        System.out.println("===================");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
