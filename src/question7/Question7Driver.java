/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Madhu Babu Konda
 */
public class Question7Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer for Question 7 : Madhu babu Konda ");
        System.out.println("1. Master");
        System.out.println("2. KGF");
        System.out.println("3. Pursuit of hapiness");
        System.out.println("4. Mirchi");
        System.out.print("Enter the movie from the above to know "
                + "the length of the movie:");
        String movieName = scan.nextLine().toUpperCase();

        while (!movieName.equals("MASTER") && !movieName.equals("KGF")
                && !movieName.equals("PURSUIT OF HAPINESS")
                && !movieName.equals("MIRCHI")) {
            System.out.println("Enter the movie from name from the given list "
                    + "only");
            movieName = scan.nextLine().toUpperCase();
        }
        movieName = movieName.replace(" ", "_");
        System.out.println("The length of the movie " + movieName.toLowerCase()
                + " is " + MoviesLength.valueOf(movieName).getLength());
        System.out.println("***********************");
        for (MoviesLength value : MoviesLength.values()) {
            System.out.println("The length of the movie " + 
                    value.name().replace("_", " ") + " is "
                    + value.getLength());
        }

    }

}
