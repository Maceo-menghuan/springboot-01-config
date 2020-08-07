package com.springboot01config.demo.bean;

/**
 * @author wh_yi
 */

public class Dog {
    private String name;
    private Integer age;
    private String weight;
    private String birth;
    private String heigh;
    private String color;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight='" + weight + '\'' +
                ", birth='" + birth + '\'' +
                ", heigh='" + heigh + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getHeigh() {
        return heigh;
    }

    public void setHeigh(String heigh) {
        this.heigh = heigh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}