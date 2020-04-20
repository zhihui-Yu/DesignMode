package com.yzh.builder;

/**
 * @Author yzh
 * @Date 2020/4/20 13:06
 * @Version 1.0
 */
public class AirShip {
    private  OrbitalModule orbitalModule;//轨道舱
    private Engine engine;//发动机
    private EscapeTower escapeTower;//逃逸塔

    public void launch() {
        System.out.println("--发射--");
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
class OrbitalModule {
    private String name;
    OrbitalModule(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Engine{
    private String name;
    Engine(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class EscapeTower {
    private String name;
    EscapeTower(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
