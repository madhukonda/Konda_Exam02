/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4_Polymorohism_LateBinding;

/**
 *
 * @author Madhu Babu Konda
 */
public class Student {

    private String name;
    private String id;
    private double GPA;

    public Student(String n, String id) //constructor
    {
        name = n;
        this.id = id;
        GPA = 0.0;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGPA(double g) {
        GPA = g;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGPA() {
        return GPA;
    }

    public boolean isPassing() {
        if (this.getGPA() > 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Name of the student : " + name
                + "\nID of the student : " + id
                + "\nGPA of the student " + GPA;

    }

}
