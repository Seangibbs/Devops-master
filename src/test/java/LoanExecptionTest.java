/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class LoanExecptionTest {
    
    public LoanExecptionTest() {
    }
    
    /* how to test console output */
   

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
            /* for console output testing */
        public void setUpStreams() { 
            System.setOut(new PrintStream(outContent)); 
            System.setErr(new PrintStream(errContent)); 
    }

    @Test
    public void testMain() throws IOException
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        Loan testloan = new Loan(-500.0, 10.0, 5);  
        baos.flush();
        String whatWasPrinted = new String(baos.toByteArray());
        String[] linesOfOutput = whatWasPrinted.split(//
                System.getProperty("line.separator"));
        assertEquals(1, linesOfOutput.length);
        assertEquals("Error Negative and zero amount values invalid", linesOfOutput[0]);
    }
    @After
        /* for console output testing */
        public void cleanUpStreams() { 
        System.setOut(null); 
        System.setErr(null); 
    }


    
}
