package com.yzh.builder;

/**
 * @Author yzh
 * @Date 2020/4/20 13:11
 * @Version 1.0
 */
public interface AirShipBuilder {
    Engine buiderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
