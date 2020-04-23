package com.yzh.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yzh
 * @Date 2020/4/23 19:32
 * @Version 1.0
 */
public class Subject {
    protected List<Observe> list = new ArrayList<>();

    public void register(Observe o) {
        list.add(o);
    }

    public void remove (Observe observe) {
        list.remove(observe);
    }

    //通知所有观察者更新状态
    public void notifyAllObservers () {
        for (Observe observe : list) {
            observe.update(this);
        }
    }
}
