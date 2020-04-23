package com.yzh.behaviour.mediator;

/**
 * @Author yzh
 * @Date 2020/4/23 15:15
 * @Version 1.0
 */
public interface Department {
    void selAction();   //做本部门的事
    void outAction();   //向总经理发出申请
}

