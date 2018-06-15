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
     * Test of Detectar method, of class Principal.
     */
    @Test
    public void testDetectar() throws Exception {
        System.out.println("Detectar");
        String sentence = "He is man";
        System.out.println("1");
        Principal instance = new Principal();
        System.out.println("2");
        String expResult = "Activa\n";
        System.out.println("3");
        String result = instance.Detectar(sentence);
        System.out.println("4");
        assertEquals(expResult, result);
        System.out.println(expResult);
        System.out.println(result);
    }
    
}
