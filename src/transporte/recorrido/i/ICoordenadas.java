package transporte.recorrido.i;

import Transporte.Coordinates;
import java.util.HashMap;

public class ICoordenadas {
    private static HashMap<String, Coordinates> coordenadas = new HashMap<>();

    public static void agregar_la_coordenada_para_el_bus(String placa, Coordinates coordenada) {
	coordenadas.put(placa, coordenada);
    }

    public static Coordinates la_coordenada_del_bus(String una_matricula) {
	return coordenadas.get(una_matricula);
    }
}
