package com.yzh.behaviour.mediator;

/**
 * @Author yzh
 * @Date 2020/4/23 15:14
 * @Version 1.0
 */
public interface Mediator {
    void register(String dname,Department d);
    void command(String dname);
}
