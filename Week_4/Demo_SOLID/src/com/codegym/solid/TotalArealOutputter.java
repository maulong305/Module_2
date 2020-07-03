package com.codegym.solid;

public class TotalArealOutputter {

    private AreaCalculator calculator;

    public TotalArealOutputter(AreaCalculator calculator) {
        this.calculator = calculator;
    }

    public void saveFile() {
        double totalArea = this.calculator.getTotalArea();
        System.out.println(totalArea);
    }


}
