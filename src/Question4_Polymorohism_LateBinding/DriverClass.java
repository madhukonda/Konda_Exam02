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

  public class DriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
	{
		Student[] students = new Student[5];
		          System.out.println("Answer for question 4: Madhu Babu Konda");
		students[0] = new Undergraduation("Mahesh", "501");
		students[1] = new Graduation("Tarak", "502");
		students[2] = new Undergraduation("Ajay", "503");
		students[3] = new Graduation("kajal", "504");
		students[4] = new Undergraduation("Ram", "505");
		
		students[0].setGPA(4.0);
		students[1].setGPA(4.1);
		students[2].setGPA(4.2);
		students[3].setGPA(2.5);
		students[4].setGPA(1.0);
		
		for (Student s: students)
		{
                        System.out.println("---------------------------------------------");
			System.out.println(s);
			System.out.println();
                       
		}
		System.out.println("---------------------------------------------");
		for (Student s: students)
		{
			if (s.isPassing() ) System.out.println(s.getName() + " is passing");
			else System.out.println(s.getName() + " is Failed");
		}	
	}	
}
     