package com.yzh.behaviour.state;

/**
 * 房间对象
 * @Author yzh
 * @Date 2020/4/23 19:16
 * @Version 1.0
 */
public class Context {
    private State state;

    public void setState(State state) {
        System.out.println("修改状态");
        this.state = state;
        state.hanler();
    }
}
