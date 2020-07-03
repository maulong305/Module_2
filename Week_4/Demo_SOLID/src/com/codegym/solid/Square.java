package com.codegym.solid;

public class Square implements Shape {

    private int side;

    public double getArea() {
        return this.side * this.side;
    }
}
