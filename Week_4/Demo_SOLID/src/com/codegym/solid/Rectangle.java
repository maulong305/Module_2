package com.codegym.solid;

public class Rectangle implements Shape {

    private int width;
    private int height;

    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
