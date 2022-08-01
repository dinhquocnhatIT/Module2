package com.codegym;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double perimeter = getPerimeter(radius);
        double baseArea = getBaseArea(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    public static double getBaseArea(int radius) {
        return  Math.PI * radius * radius;
    }
    public  static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }
}
