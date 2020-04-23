package com.yzh.creational.builder;

/**
 * @Author yzh
 * @Date 2020/4/20 13:21
 * @Version 1.0
 */
public class CreatorAirShipDirector implements AirShipDirector{
    private AirShipBuilder builder;

    public CreatorAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }
    @Override
    public AirShip directAirShop() {
        Engine engine = builder.buiderEngine();
        EscapeTower escapeTower = builder.builderEscapeTower();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();

        //组装
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalModule(orbitalModule);
        return ship;
    }
}
