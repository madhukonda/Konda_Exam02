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
public class Graduation extends Student {

    public Graduation(String n, String id) {
        super(n, id);
    }

    public boolean isPassing() {
        if (this.getGPA() > 3) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Name of the student : " + this.getName()
                + "\nID of the student : " + this.getId()
                + "\nGPA of the student : " + this.getGPA();
        //  "\nThe student's thesis topic : " + Masters +
        //  "\nThe student's thesis advisor : " + thesisAdvisor ; 
    }

}