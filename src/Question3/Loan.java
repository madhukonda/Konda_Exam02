/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Madhu Babu Konda
 */
public class Loan {
    public String customerName;
    public String bankName;
    public int loanAmount;

    public Loan(String customerName, String bankName, int loanAmount) {
        this.customerName = customerName;
        this.bankName = bankName;
        this.loanAmount = loanAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getBankName() {
        return bankName;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    @Override
    public String toString() {
        return "Loan :" + "\ncustomerName :" + customerName + "\nbankName :" + bankName + "\nloanAmount :" + loanAmount ;
    }
   
}
