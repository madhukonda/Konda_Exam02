/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Madhu Babu Konda
 */
public class Driver {

    public static void main(String[] args) {
        
        System.out.println("Answer for Question 3 : Madhu babu Konda ");
        ArrayList<Object> listArray = new ArrayList<>();
        String name = "babu";
        Date birthDate = new Date();
        Loan loan = new Loan("babu", "BarodaBank", 40000);
        Circle circle = new Circle(6.5);
        listArray.add(loan);
        listArray.add(circle);
        listArray.add(name);
        listArray.add(birthDate);

        for (int i = 0; i < listArray.size(); i++) {
            System.out.println(listArray.get(i));
            System.out.println("---------------------");
        }
    }

}
