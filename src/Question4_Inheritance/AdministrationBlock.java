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
public class AdministrationBlock extends ColdenHall {

    private int height;

    public AdministrationBlock() {
        super();
        this.height = 6;
    }

    public AdministrationBlock(int height) {
        super();  // invoke superclass' constructor Circle()
        this.height = height;
    }

    public AdministrationBlock(int height, double radius) {
        super(radius);
        this.height = height;
    }

    public AdministrationBlock(int height, double radius, String color) {
        super(radius, color);  // invoke superclass' constructor coldenhall(radius, color)
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "AdministrationBlock[" + super.toString() + ",height=" + height + "]";
    }
}
