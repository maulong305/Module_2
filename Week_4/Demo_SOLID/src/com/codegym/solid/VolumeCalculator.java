package com.codegym.solid;

public class VolumeCalculator extends AreaCalculator {

    @Override
    public double getTotalArea() {
        throw new RuntimeException("Thao tác này chưa hỗ trợ");
    }
}
