package com.springboot01config.demo.controller;

/**
 * @author wh_yi
 */
public class TestHello {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "TestHello{" +
                "x=" + x +
                ", y=" + y +
                '}';
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

    public int add(int x, int y){
        return x + y;
    }
}
