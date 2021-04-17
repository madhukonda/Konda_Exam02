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
public class Question5Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Answer for Question 5 : Madhu babu Konda ");
        Person person = new Person("Rishab Pant", "Delhi", "999999999",
                "pant@gmail.com");
        Student student = new Student("A", "Virak Kohli", "Bengaluru",
                "888888888", "kohli@gmail.com");
        Employee employee = new Employee("Colden Hall", 90000, new Date(10, 10, 10),
                "Sanju Samson", "Jaipur", "7777777777", "samson@gmail.com");
        Faculty faculty = new Faculty(8, 5, "Franken Hall", 60000,
                new Date(2, 2, 2), "David Warner", "Hyderabad", "9898989898",
                "warner@gmail.com");
        Staff staff = new Staff("Associate Professor", "Colden Hall", 90000,
                new Date(), "Lokesh Rahul", "Mohali", "9087654321", "lokesh@gmail.com");

        System.out.println(person + "\n" + student + "\n" + employee + "\n" + faculty
                + "\n" + staff);

    }

}
