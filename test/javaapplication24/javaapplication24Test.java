/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class javaapplication24Test {
    
    public javaapplication24Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class javaapplication24.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int number1 = 0;
        int number2 = 0;
        int expResult = 0;
        int result = javaapplication24.add(number1, number2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class javaapplication24.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int number1 = 0;
        int number2 = 0;
        int expResult = 0;
        int result = javaapplication24.sub(number1, number2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class javaapplication24.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        int number1 = 0;
        int number2 = 0;
        int expResult = 0;
        int result = javaapplication24.mul(number1, number2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divInt method, of class javaapplication24.
     */
    @Test
    public void testDivInt() {
        System.out.println("divInt");
        int number1 = 0;
        int number2 = 0;
        int expResult = 0;
        int result = javaapplication24.divInt(number1, number2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divReal method, of class javaapplication24.
     */
    @Test
    public void testDivReal() {
        System.out.println("divReal");
        int number1 = 0;
        int number2 = 0;
        double expResult = 0.0;
        double result = javaapplication24.divReal(number1, number2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
