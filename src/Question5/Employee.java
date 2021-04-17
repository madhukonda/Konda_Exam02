/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import Question5.Person;
import java.util.Date;

/**
 *
 * @author Madhu Babu Konda
 */
public class Employee extends Person {

    private String Office;
    private double Salary;
    private Date dateHired;

    public Employee(String Office, double Salary, Date dateHired, String Name,
            String address, String mobileNumber, String email) {
        super(Name, address, mobileNumber, email);
        this.Office = Office;
        this.Salary = Salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return Office;
    }

    public double getSalary() {
        return Salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "\nEmployee :" + "\nName:" + super.getName();
    }

}
