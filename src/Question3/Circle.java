/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Madhu Babu Konda
 */
public class Circle {
    private double circumfrence;
    private double radius;

    public Circle(double radius) {
        this.circumfrence = radius;
    }

    public double getCircumfrence() {
        return circumfrence;
    }

    public double getRadius() {
        return radius;
    }
    public double calcCircumfrence(){
         return Math.round(Math.PI*2*radius);
    }

    @Override
    public String toString() {
        return "Circle :" + "circumfrence :" + circumfrence + ", radius :" + radius + '}';
    }
    
    
}
