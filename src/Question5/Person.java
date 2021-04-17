/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Madhu Babu Konda
 */
public class Person {
    private String Name;
    private String address;
    private String mobileNumber; 
    private String email;

    public Person(String Name, String address, String mobileNumber, String email) {
        this.Name = Name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person :" + "\nName :" + Name;
    }
    
    
}
