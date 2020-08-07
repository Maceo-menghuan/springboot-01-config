package com.springboot01config.demo.calculate;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wh_yi
 */

@Component
@ConfigurationProperties(prefix = "add")
public class Add {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "Add{" +
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

    public int add(int x,int y){
        return x + y;
    }
}
