/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.tax.cal;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamalahmed
 */
public class TaxCalculatorTest {
    
    

    /**
     * Test of TaxCalculator method, of class TaxCalculator.
     */
   @Test
    public void testTaxCalculatorNoTax() {
        
        double amount = 7500;
        TaxCalculator instance = new TaxCalculator();
        double expResult = 7500;
        double result = instance.TaxCalculator(amount);
        assertEquals(expResult, result, 0.0);
     
    }
    
    @Test
    public void testTax21Calculator() {
        
        double amount = 50000;
        TaxCalculator instance = new TaxCalculator();
        double expResult = 39500;
        double result = instance.TaxCalculator(amount);
        assertEquals(expResult, result, 0.0);
     
    }
    
    @Test
    public void testTax31Calculator() {
        
        double amount = 100000;
        TaxCalculator instance = new TaxCalculator();
        double expResult = 69000;
        double result = instance.TaxCalculator(amount);
        assertEquals(expResult, result, 0.0);
     
    }
    
    @Test
    public void testTax37Calculator() {
        
        double amount = 200000;
        TaxCalculator instance = new TaxCalculator();
        double expResult = 126000;
        double result = instance.TaxCalculator(amount);
        assertEquals(expResult, result, 0.0);
     
    }
    
    @Test
    public void testTax43Calculator() {
        
        double amount = 449000;
        TaxCalculator instance = new TaxCalculator();
        double expResult = 255930;
        double result = instance.TaxCalculator(amount);
        assertEquals(expResult, result, 0.0);
     
    }
    
    @Test
    public void testTax52Calculator() {
        
        double amount = 600000;
        TaxCalculator instance = new TaxCalculator();
        double expResult = 288000;
        double result = instance.TaxCalculator(amount);
        assertEquals(expResult, result, 0.0);
     
    }
    
}
