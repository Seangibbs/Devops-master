/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;


public class PrivateSetPeriodTest {
    
    /**
     * Test of setRate method, of class Loan
     * @throws Exception
     */
    @Test
    public void testSetPeriod() throws Exception {

        /* Set up a new loan */
        Loan target = new Loan();
        /* get the setPeriod method details */
        Method method = Loan.class.getDeclaredMethod("setPeriod", int.class);
        /* make the field assessible */
        method.setAccessible(true);
        /* invoke the method setPeriod with the value 10 */
        method.invoke(target, 10);
        /*access the field loanAmount and check its value is set the 0.01*/
        Class secretClass = target.getClass();
        Field f = secretClass.getDeclaredField("numberOfPayments");
        f.setAccessible(true);

        int result = f.getInt(target);
        assertEquals("The period should be equal", 120, result);
    }
}
