package com.codegym.solid;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {

    protected List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    public double getTotalArea() {
        double totalSum = 0;
        for (Shape shape : this.shapes) {
            totalSum += shape.getArea();
        }
        return totalSum;
    }

}
