/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte.recorrido;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import transporte.recorrido.ControladorDeRecorrido;
import transporte.recorrido.Punto;

/**
 *
 * @author kornmare
 */
public class TestControladorDeRecorrido {

    public TestControladorDeRecorrido() {
    
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
    public void prueba() {
	double una_latitud = 0.00000;
	double una_longitud = 0.00000;
	double una_tolerancia_en_latitud_norte = 0.0;
	double una_tolerancia_en_latitud_sur = 0.0;
	double una_tolerancia_en_longitud_este = 0.0;
	double una_tolerancia_en_longitud_oeste = 0.0;
	Punto un_punto = new Punto("", una_latitud, una_longitud, una_tolerancia_en_latitud_norte, una_tolerancia_en_latitud_sur, una_tolerancia_en_longitud_este, una_tolerancia_en_longitud_oeste);

	una_latitud = 2.00000;
	una_longitud = 2.00000;
	una_tolerancia_en_latitud_norte = 0.0;
	una_tolerancia_en_latitud_sur = -2.0;
	una_tolerancia_en_longitud_este = 0.0;
	una_tolerancia_en_longitud_oeste = -2.0;
	Punto otro_punto = new Punto("",una_latitud, una_longitud, una_tolerancia_en_latitud_norte, una_tolerancia_en_latitud_sur, una_tolerancia_en_longitud_este, una_tolerancia_en_longitud_oeste);

	una_latitud = -1.00000;
	una_longitud = -1.00000;
	una_tolerancia_en_latitud_norte = 0.0;
	una_tolerancia_en_latitud_sur = 0.0;
	una_tolerancia_en_longitud_este = 0.0;
	una_tolerancia_en_longitud_oeste = 0.0;
	Punto un_bus = new Punto("",una_latitud, una_longitud, una_tolerancia_en_latitud_norte, una_tolerancia_en_latitud_sur, una_tolerancia_en_longitud_este, una_tolerancia_en_longitud_oeste);

	ControladorDeRecorrido unControladorDeRecorrido = new ControladorDeRecorrido(un_bus);

	unControladorDeRecorrido.agregarUnPunto(un_punto);
	unControladorDeRecorrido.agregarUnPunto(otro_punto);
	Assert.assertEquals(2, unControladorDeRecorrido.numero_de_puntos());

	Assert.assertFalse(unControladorDeRecorrido.estaElBusEnElRadioDeAlcanceDeAlgunPunto());

	un_bus.latitud = 1.0;
	un_bus.longitud = 1.0;
	Assert.assertTrue(unControladorDeRecorrido.estaElBusEnElRadioDeAlcanceDeAlgunPunto());

	un_bus.latitud = 2.1;
	un_bus.longitud = 2.1;
	Assert.assertFalse(unControladorDeRecorrido.estaElBusEnElRadioDeAlcanceDeAlgunPunto());
    }
}
