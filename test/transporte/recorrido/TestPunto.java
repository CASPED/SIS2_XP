package transporte.recorrido;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author kornmare
 */
public class TestPunto {


    @Test
    public void test() {
	double una_latitud = 2.30000;
	double una_longitud = 2.55555;
	double una_tolerancia_en_latitud_norte = 0.5;
	double una_tolerancia_en_latitud_sur = 0.5;
	double una_tolerancia_en_longitud_este = 0.5;
	double una_tolerancia_en_longitud_oeste = 0.5;
	Punto un_punto = new Punto("",una_latitud, una_longitud, una_tolerancia_en_latitud_norte, una_tolerancia_en_latitud_sur, una_tolerancia_en_longitud_este, una_tolerancia_en_longitud_oeste);

	una_latitud = 2.00000;
	una_longitud = 2.00000;
	una_tolerancia_en_latitud_norte = 0.7;
	una_tolerancia_en_latitud_sur = 0.7;
	una_tolerancia_en_longitud_este = 0.7;
	una_tolerancia_en_longitud_oeste = 0.7;
	Punto otro_punto = new Punto("",una_latitud, una_longitud, una_tolerancia_en_latitud_norte, una_tolerancia_en_latitud_sur, una_tolerancia_en_longitud_este, una_tolerancia_en_longitud_oeste);

	Assert.assertEquals(2.30000, un_punto.latitud);
	Assert.assertEquals(2.55555, un_punto.longitud);
	Assert.assertEquals(0.5, un_punto.tolerancia_latitud_norte);
	Assert.assertEquals(0.5, un_punto.tolerancia_latitud_sur);
	Assert.assertEquals(0.5, un_punto.tolerancia_longitud_este);
	Assert.assertEquals(0.5, un_punto.tolerancia_longitud_oeste);
	Assert.assertEquals(2.00000, otro_punto.latitud);
	Assert.assertEquals(2.00000, otro_punto.longitud);
	Assert.assertEquals(0.7, otro_punto.tolerancia_latitud_norte);
	Assert.assertEquals(0.7, otro_punto.tolerancia_latitud_sur);
	Assert.assertEquals(0.7, otro_punto.tolerancia_longitud_este);
	Assert.assertEquals(0.7, otro_punto.tolerancia_longitud_oeste);
    }
}
