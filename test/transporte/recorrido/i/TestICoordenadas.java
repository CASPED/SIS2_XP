package transporte.recorrido.i;

import Transporte.Coordinates;
import junit.framework.Assert;
import org.junit.Test;
import recursos.Bus;
import recursos.Estado;

public class TestICoordenadas {
    

    @Test
    public void test() {
	Bus bus = new Bus("esta_es_una_matricula", "", "", Estado.DISPONIBLE);
	Coordinates coordenada = new Coordinates("2.0", "2.0");
	
	ICoordenadas.agregar_la_coordenada_para_el_bus(bus.getPlaca(), coordenada);
	Assert.assertEquals(coordenada, ICoordenadas.la_coordenada_del_bus("esta_es_una_matricula"));
    }
}
