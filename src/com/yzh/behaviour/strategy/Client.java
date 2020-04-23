package com.yzh.behaviour.strategy;

/**
 * 策略模式：选择相应的策略做某些事情
 * 场景：
 *  1.Resource接口 资源访问策略
 *  2.HttpServlet 中 service()
 * @Author yzh
 * @Date 2020/4/23 17:21
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new OldCustomManyStrategy();
        Context context = new Context(strategy);
        context.printPrice(998);
    }
}
