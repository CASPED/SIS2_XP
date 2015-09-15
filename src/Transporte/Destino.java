/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;
import java.util.ArrayList;
/**
 *
 * @author root
 */
public class Destino {
    private String UserID;
    private MookPunto origen;
    private MookPunto destino;

    public Destino(String UserID, MookPunto origen, MookPunto destino) {
        this.UserID = UserID;
        this.origen = origen;
        this.destino = destino;
    }

    public Destino(String UserID, String origen, String destino) {
        this.UserID = UserID;
        this.origen = new MookPunto(origen);
        this.destino = new MookPunto(destino);
    }

    public String Verificar(){
        String resp="Destino no encontrado";
        /*Moock de rutas en caso de existir*/
        ArrayList<MookPunto> ruta = destino.obtenerRuta();
        if (ruta.contains(origen) && ruta.contains(destino)) {
            resp = "Destino Valido";
        }
        if (origen.equals(destino)) {
            resp = "Ya se encuentra en el destino";
        }
        return resp;
    }
    
}
