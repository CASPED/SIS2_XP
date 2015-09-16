package bd.transporte.recorrido;

import bd.i.IConexionALaBaseDeDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import transporte.recorrido.Punto;

public class BDRuta {

    private String sentencia;

    private Statement st;
    private ResultSet rs;

    public BDRuta(String un_nombre_de_linea) {
	sentencia = "select * from ruta , paradas, linea where ruta.ID_LINEA = linea.ID_LINEA and linea.NOMBRE_LINEA ='" + un_nombre_de_linea + "' and paradas.ID_PARADA = ruta.ID_PARADA";
	try {
	    st = IConexionALaBaseDeDatos.una_conexion.createStatement();
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}
    }

    public void consultar() {
	try {
	    rs = st.executeQuery(sentencia);
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}
    }

    public boolean tenga_mas_paradas() {
	boolean respuesta = false;
	try {
	    respuesta = !rs.isLast();
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}
	return respuesta;
    }

    private int id;
    private String nombre;
    private double lon;
    private double lat;
    private double tn;
    private double ts;
    private double to;
    private double te;

    public Punto siguiente_parada() {
	try {
	    rs.next();
	    id = rs.getInt("ID_PARADA");
	    nombre = rs.getString("NOMBRE_PARADA");
	    lon = rs.getDouble("LONGITUD_PARADA");
	    lat = rs.getDouble("LATITUD_PARADA");
	    tn = rs.getDouble("TNORTE_PARADA");
	    ts = rs.getDouble("TSUR_PARADA");
	    to = rs.getDouble("TOESTE_PARADA");
	    te = rs.getDouble("TESTE_PARADA");
	} catch (SQLException ex) {
	    ex.printStackTrace();
	}
	return new Punto(nombre, lon, lat, tn, ts, te, to);
    }
}
