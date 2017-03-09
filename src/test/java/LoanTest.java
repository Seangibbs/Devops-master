/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;

import static org.junit.Assert.assertEquals;


public class LoanTest {
    private Loan instance;
    
    public LoanTest() {
    }
    

    
    @Before
    public void setUp() {
        //called every time
        instance = new Loan(5000.0,10,5);
    }
    
    @After
    public void tearDown() { 
        //called every time
    }

    /**
     * Test of getAmount method, of class Loan. 5000
     */
    @Test
    public void testGetAmount() {
        double expResult = 5000.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getPeriod method, of class Loan.
     */
    @Test
    public void testGetPeriod() {
        int expResult = 5;
        int result = instance.getPeriod();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRate method, of class Loan.
     */
    @Test
    public void testGetRate() {
        double expResult = 10.0;
        double result = instance.getRate();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getMonthlyPayment method, of class Loan.
     */
    @Test
    public void testGetMonthlyPayment() {
        double expResult = 106.23;
        double result = instance.getMonthlyPayment();
        assertEquals(expResult, result, 0.01);
        
    }

    /**
     * Test of getTotalPayment method, of class Loan.
     */
    @Test
    public void testGetTotalPayment() {
        double expResult = 6374.11;
        double result = instance.getTotalPayment();
        assertEquals(expResult, result, 0.01);
        
    }
   
    
}
