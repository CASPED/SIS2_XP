/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Transporte.Controlador;
import java.awt.Color;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class testHorasconducidas {
    Controlador cont;
    
    public testHorasconducidas() {
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
    // @Test
    // public void hello() {}
    @Test
    
    public void tiempoSobrepasado(){
         cont = new Controlador();
        cont.setHora(8);
        assertEquals(Color.RED, cont.getColor());
         cont.setHora(7);
        assertEquals(Color.RED, cont.getColor());
    }
    
    @Test
    public void tiempoAceptado(){
     cont = new Controlador();
        assertEquals(Color.WHITE, cont.getColor());
        cont.setHora(2);
        assertEquals(Color.WHITE, cont.getColor());
    
    }
    
    @Test
    public void iniciaEnCero(){
      cont = new Controlador();
        assertEquals("00:00", cont.getHora());
    }
    
}
