/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.i;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author kornmare
 */
public class TestIConexionALaBaseDeDatos {

    @Test
    public void prueba() {
	try {
	    Assert.assertFalse(IConexionALaBaseDeDatos.una_conexion.isClosed());
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}
    }
}
