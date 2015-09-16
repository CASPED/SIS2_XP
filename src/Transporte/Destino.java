/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author root
 */
public class Destino {
    private int UserID;
    private MookPunto origen;
    private MookPunto destino;

    public Destino(int UserID, MookPunto origen, MookPunto destino) {
        this.UserID = UserID;
        this.origen = origen;
        this.destino = destino;
    }
    
    public Destino(int UserID, String origen, String destino) {
        this.UserID = UserID;
        this.origen = new MookPunto(origen);
        this.destino = new MookPunto(destino);
    }

    public String Verificar() throws SQLException{
        String resp="Destino no encontrado";
        /*Moock de rutas en caso de existir*/
        List<MookPunto> ruta = destino.obtenerRuta();
        if (ruta.contains(origen) && ruta.contains(destino)) {
            resp = "Destino Valido";
        }
        if (origen.equals(destino)) {
            resp = "Ya se encuentra en el destino";
        }
        return resp;
    }    
}
