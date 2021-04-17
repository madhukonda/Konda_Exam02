/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4_Inheritance;

/**
 *
 * @author Madhu Babu Konda
 */
public class BuildingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 4: Madhu Babu Konda");
        System.out.println("Colden Hall Dimensions :");
        AdministrationBlock ab = new AdministrationBlock();
        System.out.println("     Area            : " + ab.getRadius() + "sqfts" + "\n"
                + "     Building Height : " + ab.getHeight() + " floors" + "\n"
                + "     Building Color  : " + ab.getColor());

        System.out.println("---------------------------------------------------");
        System.out.println("AdministrationBlock Dimensions :");
        AdministrationBlock ab2 = new AdministrationBlock(8, 8000.0);
        System.out.println("     Area            : " + ab2.getRadius() + "sqfts" + "\n"
                + "     Building Height : " + ab2.getHeight() + " floors" + "\n"
                + "     Building Color  : " + ab2.getColor());

    }

}
