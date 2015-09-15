/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Transporte.Coordinates;
import Transporte.Destino;
import Transporte.MookPunto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;


/**
 *
 * @author irvin
 */
public class TestUsersDestiny {
    Destino destino;
    ArrayList<MookPunto> resp = new ArrayList<MookPunto>();
    public TestUsersDestiny() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        MookPunto punto = new MookPunto("Laguna",
                new Coordinates(47.08712, 57.08712));
        resp.add(punto);
        punto = new MookPunto("UMSS",
                new Coordinates(47.08713, 57.08715));
        resp.add(punto);
        punto = new MookPunto("UCB",
                new Coordinates(47.08714, 57.08717));
        resp.add(punto);
        punto = new MookPunto("IC NORTE",
                new Coordinates(47.08715, 57.08719));
        resp.add(punto);
        punto = new MookPunto("IC NORTE 2",
                new Coordinates(47.08716, 57.08721));
        resp.add(punto);
        punto = new MookPunto("Blanco Galindo",
                new Coordinates(47.08717, 57.08723));
        resp.add(punto);
        
        //List<Punto> ruta = new ArrayList<Punto>();
        //ruta = conection.obtenerRuta();
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void MookPunto(){
        MookPunto rutas = new MookPunto();
        assertEquals(rutas.obtenerRuta(), resp);
        //assertArrayEquals(resp, rutas.obtenerRuta());
    }
    
    @Test
    public void TestVerificarDestino(){
        String idCliente = "805038";
        destino = new Destino(idCliente,"Laguna","IC NORTE");
        assertEquals( "Destino Valido",destino.Verificar());
        
        /*destino = new Destino(idCliente,"IC. Norte","Laguna");
        assertEquals(destino.Verificar(), "Destino ya recorrido");*/
        
        destino = new Destino(idCliente,"IC. Norte","Circunvalacion");
        assertEquals( "Destino no encontrado",destino.Verificar());
        
        destino = new Destino(idCliente,"IC. Norte","IC. Norte");
        assertEquals("Ya se encuentra en el destino", destino.Verificar());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
