/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.easymock.EasyMock;
import org.junit.Test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;


public class CustomerTest {
    private Loan mockloan;
    
    public CustomerTest() {
    }

    /**
     * Test of takeoutloan method, of class Customer.
     */
    @Test
    public void testTakeoutloan() {
        Customer instance = new Customer("Jake Black",0.0);
       
        mockloan = EasyMock.createMock(Loan.class);
        expect(mockloan.getMonthlyPayment()).andReturn(106.23);
        replay(mockloan);
        double expResult = 106.23;
        instance.takeoutloan();
        double result = instance.getMonthlypayments();
        assertEquals("The monthly payments must be equal", expResult, result, 0.5) ; 
    }
    
}
