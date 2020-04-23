package com.yzh.behaviour.command;

/**
 * 命令模式：将一个请求封装为一个对象，从而我们可以用不同的请求对客户进行参数化；
 *           发送命令者不需要知道接受者是谁，只需要发送命令就可以。
 * 场景：
 *  1.数据库事务机制
 *  2.命令的撤销和恢复
 *  3.Struts2 action的整个调用过程
 * @Author yzh
 * @Date 2020/4/23 16:59
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Command c = new ConcreteCommand(new Receiver());

        Invoker i = new Invoker(c);
        i.call();
    }
}
