package com.yzh.structural.flyWeight;

/**
 * 享元类
 * @Author yzh
 * @Date 2020/4/23 12:28
 * @Version 1.0
 */
public interface Chess {
    void setColor(String color);
    String getColor();
    void display(Coordinate c);
}
//具体享元类
class ConcreteChess implements Chess{

    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色"+color);
        System.out.println("棋子位置"+c.getX()+","+c.getY());
    }
}