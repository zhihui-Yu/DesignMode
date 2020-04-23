package com.yzh.behaviour.mediator;

/**
 * 中介者模式
 * 案列：
 *  1.MVC中C为中介者
 *  2.反射 invoke方法
 * @Author yzh
 * @Date 2020/4/23 15:21
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development dev = new Development(m);
        Finacial finacial = new Finacial(m);

        market.selAction();
        market.outAction();
    }
}
