package transporte;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import recursos.BusUpdater;

/**
 *
 * @author ireene
 */
public class TestBusUpdated {

    private BusUpdater updater;

    @Before
    public void setUp() {
        updater = new BusUpdater();
    }

    @Test
    public void testRegistrarBus() {
        updater.registrarBus("placa12", 10, 'A');

        assertTrue(updater.containsBus("placa12"));
    }

    @Test
    public void testCambiarEstado() {
        updater.registrarBus("placa12", 10, 'A');
        boolean isUpdated = updater.cambiarEstado("placa12", 'D');

        assertTrue(isUpdated);

        assertFalse(updater.cambiarEstado("no hay", 'D'));
    }

}
