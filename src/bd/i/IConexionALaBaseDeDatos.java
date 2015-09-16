package bd.i;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class IConexionALaBaseDeDatos {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/sisbdxp";

    static final String USUARIO = "root";
    static final String CONTRASENIA = "";

    public static Connection una_conexion = null;

    static {
	try {
	    Class.forName(JDBC_DRIVER);
	    una_conexion = DriverManager.getConnection(DB_URL, USUARIO, CONTRASENIA);
	} catch (SQLException | ClassNotFoundException se) {
	    se.printStackTrace();
	}
    }
}
