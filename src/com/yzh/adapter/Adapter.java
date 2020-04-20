package com.yzh.adapter;

/**
 * 适配器
 * 1.类适配器 继承--不灵活
 * 2.对象适配器--组合
 * @Author yzh
 * @Date 2020/4/20 15:16
 * @Version 1.0
 */
public class Adapter /*extends Adaptee*/ implements Target {

    private Adaptee adaptee;

    @Override
    public void handleReq() {
        adaptee.request();
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
