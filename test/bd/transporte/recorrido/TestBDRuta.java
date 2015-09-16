package bd.transporte.recorrido;


import transporte.recorrido.ControladorDeRecorrido;
import transporte.recorrido.Punto;

/**
 *
 * @author kornmare
 */
public class TestBDRuta {

    public void testConsultar() {
	double una_latitud = 0.00000;
	double una_longitud = 0.00000;
	double una_tolerancia_en_latitud_norte = 0.0;
	double una_tolerancia_en_latitud_sur = 0.0;
	double una_tolerancia_en_longitud_este = 0.0;
	double una_tolerancia_en_longitud_oeste = 0.0;
	Punto un_bus = new Punto("", una_latitud, una_longitud, una_tolerancia_en_latitud_norte, una_tolerancia_en_latitud_sur, una_tolerancia_en_longitud_este, una_tolerancia_en_longitud_oeste);
	ControladorDeRecorrido unControladorDeRecorrido = new ControladorDeRecorrido(un_bus);

	BDRuta la_ruta = new BDRuta("A");
	la_ruta.consultar();

	while (la_ruta.tenga_mas_paradas()) {
	    unControladorDeRecorrido.agregarUnPunto(la_ruta.siguiente_parada());
	}

	Assert.assertEquals(5, unControladorDeRecorrido.numero_de_puntos());
    }
}
