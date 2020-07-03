package com.codegym.solid;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
	    VolumeCalculator volumeCalculator = new VolumeCalculator();

	    TotalArealOutputter totalArealOutputter = new TotalArealOutputter(volumeCalculator);
        totalArealOutputter.saveFile();
    }
}
