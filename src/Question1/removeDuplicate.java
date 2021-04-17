/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Madhu Babu Konda
 */
public class removeDuplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question 1 : Madhu babu Konda ");
        Scanner value = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(value.nextInt());
        }
        removeDuplicate(list);

    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> value2 = new ArrayList<>();
        value2 = list;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j = j - 1;
                }
            }
        }
        System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
