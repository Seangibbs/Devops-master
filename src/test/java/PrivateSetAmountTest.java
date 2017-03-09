/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;


public class PrivateSetAmountTest {

    /**
     * Accessing a private member Test of LoanAmount field, of class Loan.
     */
    @Test
    public void testSetAmount1() throws Exception {
        Loan target = new Loan(4000.0, 10.0, 5);
        Class secretClass = target.getClass();

        /*Retrieve the field loanAmount */
        Field f = secretClass.getDeclaredField("loanAmount");
        /* make sure the field is accessible. */
        f.setAccessible(true);
        /* get the value of the field */
        double result = f.getDouble(target);
        assertEquals("The amounts should be equal", 4000.00, result, 0.0);
    }

    /**
     * Accessing a private member Test of setAmount method, of class Loan.
     */
    @Test
    public void testSetAmount2() throws Exception {
        Loan target = new Loan();

        /* get the setAmount method details */
        Method method = Loan.class.getDeclaredMethod("setAmount", double.class);

        /* make  assessible */
        method.setAccessible(true);

        /* invoke the method setAmount with the value 3000.0 */
        method.invoke(target, 3000.0);

        /*access the field loanAmount and check its value is set the 3000.0*/
        Class secretClass = target.getClass();
        Field f = secretClass.getDeclaredField("loanAmount");
        f.setAccessible(true);
        double result = f.getDouble(target);
        assertEquals("The amounts should be equal", 3000.00, result, 0.0);
    }

    /**
     * Test of setRate method, of class Loan
     */
    @Test
    public void testSetRate() throws Exception {

        /* Set up a new loan */
        Loan target = new Loan();
        /* get the setRate method details */
        Method method = Loan.class.getDeclaredMethod("setRate", double.class);
        /* make the field assessible */
        method.setAccessible(true);
        /* invoke the method setRate with the value 12.0 */
        method.invoke(target, 12.0);
        /*access the field loanAmount and check its value is set the 0.01*/
        Class secretClass = target.getClass();
        Field f = secretClass.getDeclaredField("monthlyInterestRate");
        f.setAccessible(true);

        double result = f.getDouble(target);
        assertEquals("The amounts should be equal", 0.01, result, 0.0);
    }

}
