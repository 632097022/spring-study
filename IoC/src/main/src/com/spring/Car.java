package com.spring;

public class Car {
    private String brand;
    private String color;
    private String parameer;
    public Car(String brand, String color, String parameer) {
        this.brand = brand;
        this.color = color;
        this.parameer = parameer;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getParameer() {
        return parameer;
    }

    public void setParameer(String parameer) {
        this.parameer = parameer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", parameer='" + parameer + '\'' +
                '}';
    }
}
