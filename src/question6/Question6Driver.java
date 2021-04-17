/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Madhu Babu Konda
 */
public class Question6Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for Question 6 : Madhu babu Konda ");
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        double side1 = 0, side2 = 0, side3 = 0;
        do {
            flag = false;
            System.out.print("Enter side 1 of triangle: ");
            side1 = scan.nextDouble();
            System.out.print("Enter side 2 of triangle: ");
            side2 = scan.nextDouble();
            System.out.print("Enter side 3 of triangle: ");
            side3 = scan.nextDouble();

            if (side1 + side2 <= side3 || side2 + side3 <= side1
                    || side1 + side3 <= side2) {
                System.out.println("The sum of two sides should be greater than the"
                        + "other side");
                flag = true;
            }
        } while (flag == true);
        Triangle triangle = new Triangle(side1, side2, side3, "blue", true);
        System.out.println("****************");
        System.out.println(triangle);

    }

}
