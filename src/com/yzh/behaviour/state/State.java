package com.yzh.behaviour.state;

import javafx.scene.control.TextFormatter;

/**
 * @Author yzh
 * @Date 2020/4/23 19:12
 * @Version 1.0
 */
public interface State {
    void hanler();
}
class FreeState implements State {

    @Override
    public void hanler() {
        System.out.println("空闲");
    }
}
class BookedState implements State {

    @Override
    public void hanler() {
        System.out.println("已预订");
    }
}
class checkedInState implements State {

    @Override
    public void hanler() {
        System.out.println("已入住");
    }
}

