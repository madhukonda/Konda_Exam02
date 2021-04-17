/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4_Inheritance;

/**
 *
 * @author Madhu Babu Konda
 */
public class ColdenHall {

    private double radius;
    private String color;

    public ColdenHall() {
        this.radius = 5000.0;
        this.color = "Grey";
    }

    public ColdenHall(double radius) {
        this.radius = radius;
        this.color = "Grey";
    }

    public ColdenHall(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColdenHall[radius=" + radius + ",color=" + color + "]";
    }

}
