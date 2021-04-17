/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import Question5.Person;

/**
 *
 * @author Madhu Babu Konda
 */
public class Student extends Person {

    private String grade;
    private final static String CLASS_STATUS = "Graduate";

    public Student(String grade, String Name, String address, String mobileNumber, String email) {
        super(Name, address, mobileNumber, email);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {

        return "\nStudent :" + "\nName :" + super.getName();
    }

}
