package org.courses.ex2;

public class Rectangle {

    private double side1;
    private double side2;

    public Rectangle (double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator(){
       double s = side1 * side2;
       return s;
    }

    public double perimeterCalculator(){
        double p = 2 * (side1 + side2);
        return p;
    }
}
