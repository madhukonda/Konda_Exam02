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
public class Undergraduation extends Student{
    
    public Undergraduation( String n, String id){
		super(n,id);
	}
    
    public String toString()
	{
		return "Name of the student  : " + this.getName() +
                       "\nID of the student : " + this.getId() +
                       "\nGPA of the student : " + this.getGPA() ;
                    
	}
}
	