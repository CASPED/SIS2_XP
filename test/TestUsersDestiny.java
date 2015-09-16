/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Transporte.Coordinates;
import Transporte.Destino;
import Transporte.MookPunto;
import java.sql.SQLException;
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
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void TestVerificarDestino() throws SQLException{
        int idCliente = 805038;
        destino = new Destino(idCliente,"Sacaba","Vinto");
        assertEquals( "Destino Valido",destino.Verificar());
        
        /*destino = new Destino(idCliente,"IC. Norte","Laguna");
        assertEquals(destino.Verificar(), "Destino ya recorrido");*/
        
        destino = new Destino(idCliente,"Quillacollo","Chinata");
        assertEquals( "Destino no encontrado",destino.Verificar());
        
        destino = new Destino(idCliente,"Quillacollo","Quillacollo");
        assertEquals("Ya se encuentra en el destino", destino.Verificar());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
