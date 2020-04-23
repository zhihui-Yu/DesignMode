package com.yzh.behaviour.observer.juo;

import java.util.Observable;

/**
 * @Author yzh
 * @Date 2020/4/23 19:44
 * @Version 1.0
 */
public class ConcreteSubject extends Observable {
    private int state;

    public void set (int state) {
        this.state = state;

        setChanged();//表示目标已经做了更改
        notifyObservers(state);//通知所有观察者
    }

    public int getState() {
        return state;
    }
}
