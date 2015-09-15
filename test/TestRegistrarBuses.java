
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import recursos.Estado;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import recursos.Bus;
import registros.Registro;

/**
 *
 * @author ireene
 */
public class TestRegistrarBuses {

    private Registro registro;
    private Object EstadoActualBus;

    @Before
    public void setUp() {
        registro = new Registro();
    }

    @Test
    public void testRegistrarBus() {
        String placa = "12BDOP";
        Estado estado = Estado.DISPONIBLE;
        Bus bus1 = new Bus(placa, "", "", estado);
        registro.registrarBus(bus1);

        boolean esperado = true;

        assertEquals(esperado, registro.contieneBus(bus1));
    }

    @Test
    public void testCambiarDeEstado() {
        Bus bus = new Bus("uuu11", "0", "r", Estado.DISPONIBLE);
        registro.registrarBus(bus);
        registro.cambiarEstadoAlBus("uuu11", Estado.DISPONIBLE);

        Estado esperado = Estado.NO_DISPONIBLE;
        assertEquals(esperado, registro.getEstadoDeBus(bus));
    }
}
