package bd.i;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class IConexionALaBaseDeDatos {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/sisbdxp";

    private static final String USUARIO = "root";
    private static final String CONTRASENIA = System.getProperty("os.name").toLowerCase().equals("win") ? "" : "23lol7";

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
