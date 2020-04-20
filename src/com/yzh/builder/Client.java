package com.yzh.builder;

/**
 * 建造者模式 -- 使用场景： 多个原件组装复杂的对象
 * 一般与工厂模式互用
 * @Author yzh
 * @Date 2020/4/20 13:24
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        AirShipDirector director = new CreatorAirShipDirector(new CreatorAirShipBuider());

        AirShip airShip = director.directAirShop();

        System.out.println(airShip.getEngine().getName());

        airShip.launch();
    }
}
