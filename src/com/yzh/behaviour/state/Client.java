package com.yzh.behaviour.state;

/**
 * 状态模式：用于转态切换 不同状态对应不同行为
 * 案例：
 *  1.银行中账号状态管理
 *  2.酒店系统中，房间状态管理
 *  3.线程对象各状态之间的切换
 * @Author yzh
 * @Date 2020/4/23 19:08
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setState(new FreeState());

        context.setState(new BookedState());

        context.setState(new checkedInState());
    }
}
