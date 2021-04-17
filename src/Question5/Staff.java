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
public class Staff extends Employee {

    private String title;

    public Staff(String title, String Office, double Salary, Date dateHired,
            String Name, String address, String mobileNumber, String email) {
        super(Office, Salary, dateHired, Name, address, mobileNumber, email);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "\nStaff:" + "\nName:" + super.getName();
    }

}
