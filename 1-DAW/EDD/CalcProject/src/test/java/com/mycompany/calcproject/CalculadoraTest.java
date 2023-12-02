/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calcproject;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fidel
 */
public class CalculadoraTest {
    
    Calculadora instance;
    public CalculadoraTest() {
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Comencen els tests");
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("Acabant els tests");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Comença");
        instance=new Calculadora();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Acaba");
    }
    

    /**
     * Test of getLastResult method, of class Calculadora.
     */
    @Test
    public void testGetLastResult() {
        System.out.println("getLastResult");
        double expResult = 0.0;
        double result = instance.getLastResult();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastOp method, of class Calculadora.
     */
    @Test
    public void testGetLastOp() {
        System.out.println("getLastOp");
        String expResult = "";
        String result = instance.getLastOp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        assertEquals(10+12, instance.suma(10,12),0.0);     
        assertEquals(8+0, instance.suma(8,0),0.0); 
        assertEquals(0+0, instance.suma(0,0),0.0); 
        assertEquals(14+(-6), instance.suma(14,-6),0.0); 
        assertEquals(-8+5, instance.suma(-8,5),0.0); 
        assertEquals(-4+(-7), instance.suma(-4,-7),0.0); 
        assertEquals(10.5F+12.10F, instance.suma(10.5F,12.10F),0.0); 
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        float op1 = 0.0F;
        float op2 = 0.0F;
        float expResult = 0.0F;
        float result = instance.resta(op1, op2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        float op1 = 0.0F;
        float op2 = 0.0F;
        float expResult = 0.0F;
        float result = instance.multiplica(op1, op2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divideix method, of class Calculadora.
     */
    @Test
    public void testDivideix() {
        System.out.println("divideix");
        float op1 = 0.0F;
        float op2 = 0.0F;
        float expResult = 0.0F;
        float result = instance.divideix(op1, op2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tantpercent method, of class Calculadora.
     */
    @Test
    public void testTantpercent() {
        System.out.println("tantpercent");
        float op1 = 0.0F;
        float op2 = 0.0F;
        float expResult = 0.0F;
        float result = instance.tantpercent(op1, op2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of potencia method, of class Calculadora.
     */
    @Test
    public void testPotencia() {
        System.out.println("potencia");
        float op1 = 10.0F;
        float op2 = 20.0F;
        double expResult = 30.0;
        double result = instance.potencia(op1, op2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
