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
public abstract class GeometricObject {

    private String color;
    private boolean isColorFilled;

    public GeometricObject(String color, boolean isColorFilled) {
        this.color = color;
        this.isColorFilled = isColorFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isIsColorFilled() {
        return isColorFilled;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
