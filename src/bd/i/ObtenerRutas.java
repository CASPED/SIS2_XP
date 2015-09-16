/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.i;

import Transporte.MookPunto;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author irvin
 */
public class ObtenerRutas {
    private MookPunto punto;
    private String nombre;
    private double latitud;
    private double longutud;
    public List<MookPunto> getDatos(int ID_LINEA) throws SQLException{

        List<MookPunto> ruta = new ArrayList<MookPunto>();
        String LINEA = Integer.toString(ID_LINEA);
        try{
            Statement st;
            ResultSet rs;
            st = IConexionALaBaseDeDatos.una_conexion.createStatement();
            rs = st.executeQuery("SELECT NOMBRE_PARADA,LATITUD_PARADA,LONGITUD_PARADA "+
            "FROM ruta AS R, paradas AS P WHERE R.ID_PARADA = P.ID_PARADA AND ID_LINEA ="+LINEA);
            while(rs.next()){
                nombre = rs.getString("NOMBRE_PARADA");
                latitud = rs.getDouble("LATITUD_PARADA");
                longutud = rs.getDouble("LONGITUD_PARADA");
                ruta.add(new  MookPunto(nombre, latitud, longutud));
            }
            rs.close();
            return ruta;
        }catch(SQLException e){
            System.out.println(e);
    } 
        return null;
    }
    
}
