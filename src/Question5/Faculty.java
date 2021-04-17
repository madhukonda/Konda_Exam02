/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Date;

/**
 *
 * @author Madhu Babu Konda
 */
public class Faculty extends Employee {

    private double officeHours;
    private int noOfSubjects;

    public Faculty(double officeHours, int noOfSubjects, String Office, double Salary, Date dateHired, String Name, String address, String mobileNumber, String email) {
        super(Office, Salary, dateHired, Name, address, mobileNumber, email);
        this.officeHours = officeHours;
        this.noOfSubjects = noOfSubjects;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public int getNoOfSubjects() {
        return noOfSubjects;
    }

    @Override
    public String toString() {
        return "\nFaculty :" + "\nName:" + super.getName();
    }

}
