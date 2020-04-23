package com.yzh.behaviour.template;

/**
 * @Author yzh
 * @Date 2020/4/23 19:00
 * @Version 1.0
 */
public abstract class BlankTemplate {
    //具体方法
    public void takeNumber(){
        System.out.println("取号排队");
    }
    public abstract void transact(); //办理具体的业务
    // 钩子方法
    public void evaluate(){
        System.out.println("反馈评分");
    }
    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
