/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Madhu Babu Konda
 */
public enum MoviesLength {
    MASTER(3.55), KGF(3.20), PURSUIT_OF_HAPPINESS(2.4), MIRCHI(2.5);

    private double length;

    private MoviesLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

}
