package com.yzh.behaviour.mediator;

/**
 * @Author yzh
 * @Date 2020/4/23 15:16
 * @Version 1.0
 */
public class Market implements Department {

    private Mediator m ;//持有中介者（总经理）的引用

    public Market(Mediator m) {
        this.m = m;
        m.register("market",this);
    }

    @Override
    public void selAction() {
        System.out.println("接项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，项目进度");
        m.command("finacial");
    }
}
