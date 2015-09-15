/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Transporte.velocimetro;
import java.awt.Color;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestVelocimetro {
    velocimetro veloc;
    
    
    public TestVelocimetro() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestVelocidadAceptada() {
     veloc = new velocimetro();
         assertEquals(Color.WHITE, veloc.getcolor());
         
     }
     
     @Test
     public void velocidadSobrepasada() {
     veloc = new velocimetro();
     veloc.setVel(95);
         assertEquals(Color.RED, veloc.getcolor());
     
     }
}
