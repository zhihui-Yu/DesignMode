package com.yzh.behaviour.observer;

/**
 * @Author yzh
 * @Date 2020/4/23 19:35
 * @Version 1.0
 */
public class ConcreteSubject extends Subject{

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //通知所有观察者更新状态
        this.notifyAllObservers();
    }
}
