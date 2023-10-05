package org.courses.ex2;

public class Main {
    public static void main(String[] args) {

        double side1 = 12;
        double side2 = 6;

        Rectangle rectangle = new Rectangle(side1, side2);

        System.out.println("Area rectangle = " + rectangle.areaCalculator());
        System.out.println("Perimeter rectangle = " + rectangle.perimeterCalculator());
    }

}
