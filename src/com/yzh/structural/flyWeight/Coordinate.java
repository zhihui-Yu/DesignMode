package com.yzh.structural.flyWeight;

/**
 * 外部状态类 unshare
 * @Author yzh
 * @Date 2020/4/23 12:29
 * @Version 1.0
 */
public class Coordinate {
    private int x,y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
