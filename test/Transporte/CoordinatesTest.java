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
 * @author CASPED
 */
public class CoordinatesTest {
    //public double longitudeExpected;
    //public double latitudeExpected;
    @Test
    public void testGetCoordinates(){
        double latitudeExpected=-66.1448429;
        double longitudeExpected=-17.3947305;
        Coordinates date=new Coordinates(latitudeExpected,longitudeExpected);
        date.setLatitude(latitudeExpected);
        date.setLongitude(longitudeExpected);
        double latitude=date.getLatitude();
        double longitude=date.getLongitude();
        assertEquals(latitudeExpected,latitude,0);
        assertEquals(longitudeExpected,longitude,0);
    }
    
    public CoordinatesTest() {
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
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
