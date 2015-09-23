/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Transporte;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isabel
 */
public class PasajeroTest {
    
    public PasajeroTest() {
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
     * Test of getNombre method, of class Pasajero.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Pasajero instance = new Pasajero("", "", 0);
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);

    }

    /**
     * Test of getApellido method, of class Pasajero.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Pasajero instance = new Pasajero("", "", 0);
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEdad method, of class Pasajero.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        Pasajero instance = new Pasajero("", "", 0);
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);


    }

    /**
     * Test of setNombre method, of class Pasajero.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Pasajero instance = new Pasajero("", "", 0);
        instance.setNombre(nombre);
    }

    /**
     * Test of setApellido method, of class Pasajero.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Pasajero instance = new Pasajero("", "", 0);
        instance.setApellido(apellido);
    }

    /**
     * Test of setEdad method, of class Pasajero.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        Pasajero instance = new Pasajero("", "", 0);
        instance.setEdad(edad);
    }
    
}
