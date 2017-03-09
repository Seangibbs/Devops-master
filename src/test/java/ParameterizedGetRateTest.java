/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(value = Parameterized.class)
public class ParameterizedGetRateTest {
    private double expected;
    private double amount;
    private double rate;
    private int period;
    
    @Parameterized.Parameters
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][]{
            {10, 5000.0, 10.0, 5}, //expected,  amount, rate, period 
            {10, 5000.0, 10.0, 5},//expected,  amount, rate, period
            {10, 5000.0, 10.0, 6},
        });
    }

    public ParameterizedGetRateTest(double expected, double amount, double rate, int period) {
        this.expected = expected;
        this.amount = amount;
        this.rate = rate;
        this.period = period;
    }
    
     @Test
    public void TestGetRate_Calc() {
        Loan calc = new Loan(amount, rate, period);
        assertEquals(expected, calc.getRate(), 0.5);
    }
}
