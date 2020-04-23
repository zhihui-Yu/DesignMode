package com.yzh.behaviour.observer;

/**
 * @Author yzh
 * @Date 2020/4/23 19:37
 * @Version 1.0
 */
public class ObserveA implements Observe {

    private int myState;//与目标对象保持一致

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
