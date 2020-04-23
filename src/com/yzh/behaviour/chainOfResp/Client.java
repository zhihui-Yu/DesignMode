package com.yzh.behaviour.chainOfResp;

/**
 * 责任链模式
 * 使用场景：
 *  1.try-catch
 *  2.过滤器链式处理
 * @Author yzh
 * @Date 2020/4/23 14:37
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        a.setNextLeader(b);
        b.setNextLeader(c);

        LeaveRequest request = new LeaveRequest("Tom",10,"探亲");
        a.handleRequest(request);
    }
}
