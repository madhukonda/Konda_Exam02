/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Madhu Babu Konda
 */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3,
            String color, boolean isColorFilled) {
        super(color, isColorFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double temp = calculatePerimeter() / 2;
        return Math.round(Math.sqrt(temp * (temp - side1) * (temp - side2)
                * (temp - side3)) * 100) / 100.0;
    }

    @Override
    public double calculatePerimeter() {
        return Math.round((side1 + side2 + side3) * 100) / 100.0;
    }

    @Override
    public String toString() {
        return "Area: " + calculateArea() + "\nPerimeter: " + calculatePerimeter()
                + "\nColor: " + super.getColor() + "\nIs color filled: " + super.isIsColorFilled();
    }

}
