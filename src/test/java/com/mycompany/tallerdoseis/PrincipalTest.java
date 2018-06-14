/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tallerdoseis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BrayanHR09
 */
public class PrincipalTest {
    
    public PrincipalTest() {
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
     * Test of main method, of class Principal.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Principal.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of Detectar method, of class Principal.
     */
    @Test
    public void testDetectar() throws Exception {
        System.out.println("Detectar");
        String sentence = "holas";
        System.out.println(sentence);
        Principal instance = new Principal();
        String expResult = "Pasiva\n";
        String result = instance.Detectar(sentence);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
