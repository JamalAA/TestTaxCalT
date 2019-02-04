/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.tax.cal;

/**
 *
 * @author jamal ahmed
 */
public class TaxCalculator {

    public double TaxCalculator(double amount) {

        if (amount >= 0 && amount < 25000) {

            return amount;
        }

        if (amount >= 25000 && amount < 90000) {
            
            return  amount - (amount * 0.21);
        }
        
        if (amount >= 90000 && amount < 200000) {
            
            return  amount - (amount * 0.31);
        }
        
        if (amount >= 200000 && amount < 330000) {
            
            return  amount - (amount * 0.37);
        }
        
        if (amount >= 330000 && amount < 450000) {
            
            return  amount - (amount * 0.43);
        }
        
        if (amount >= 450000) {
            
            return  amount - (amount * 0.52);
        }


        return 0;
    }
}
