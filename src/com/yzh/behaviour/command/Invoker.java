package com.yzh.behaviour.command;

/**
 * @Author yzh
 * @Date 2020/4/23 16:57
 * @Version 1.0
 */
public class Invoker {
    private Command command;//可以用集合存多个Command

    public Invoker(Command command) {
        this.command = command;
    }

    //调用命令类的方法
    public void call(){
        command.execute();
    }
}
