package com.yzh.builder;

/**
 * @Author yzh
 * @Date 2020/4/20 13:14
 * @Version 1.0
 */
public class CreatorAirShipBuider implements AirShipBuilder{

    @Override
    public Engine buiderEngine() {
        System.out.println("create engine");
        return new Engine("creator");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("create OrbitalModule");
        return new OrbitalModule("creator");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("create EscapeTower");
        return new EscapeTower("creator");
    }
}
