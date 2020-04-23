package com.yzh.behaviour.memento;

/**
 * 负责人类 管理备忘录对象
 * @Author yzh
 * @Date 2020/4/23 20:00
 * @Version 1.0
 */
public class CareTaker {
    private EmpMemento memento ;//保存一次，想保存多次则可以用集合

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
