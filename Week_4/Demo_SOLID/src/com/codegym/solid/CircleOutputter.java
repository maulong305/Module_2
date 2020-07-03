package com.codegym.solid;

public class CircleOutputter {

    private Circle circle;

    public CircleOutputter(Circle circle) {
        this.circle = circle;
    }

    public void printArea() {
        System.out.println(this.circle.getArea());
    }
}
