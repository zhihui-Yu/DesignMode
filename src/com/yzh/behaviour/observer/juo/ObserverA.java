package com.yzh.behaviour.observer.juo;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author yzh
 * @Date 2020/4/23 19:46
 * @Version 1.0
 */
public class ObserverA implements Observer {
    private int myState;
    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject)o).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
