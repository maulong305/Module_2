package com.codegym.solid;

public class Circle implements Shape {
    private int radius;

    public double getArea() {
        double area = this.radius * Math.PI;

        return area;
    }

}
