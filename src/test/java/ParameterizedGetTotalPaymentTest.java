/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(value = Parameterized.class)
public class ParameterizedGetTotalPaymentTest {

    private final double expected;
    private double amount;
    private double rate;
    private int period;

    @Parameters
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][]{
            {6374.11, 5000.0, 10.0, 5}, //expected,  amount, rate, period 
            {6374.11, 5000.0, 10.0, 5},//expected,  amount, rate, period
            {6669.30, 5000.0, 10.0, 6},
        });
    }

    public ParameterizedGetTotalPaymentTest(double expected, double amount, double rate, int period) {
        this.expected = expected;
        this.amount = amount;
        this.rate = rate;
        this.period = period;
    }

    @Test
    public void TestTotalPayment_Calc() {
        Loan calc = new Loan(amount, rate, period);
        assertEquals(expected, calc.getTotalPayment(), 0.5);
    }

}
