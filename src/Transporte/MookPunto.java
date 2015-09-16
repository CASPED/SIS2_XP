/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;
import  bd.i.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author irvin
 */
public class MookPunto {
    private String Site;
    private double latitud;
    private double longitud;

    public MookPunto() {
    }

    public MookPunto(String Site) {
        this.Site = Site;
    }
    
    public MookPunto(String Site, double latitud, double longitud) {
        this.Site = Site;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MookPunto other = (MookPunto) obj;
        if (!Objects.equals(this.Site, other.Site)) {
            return false;
        }
        return true;
    }
    
    public List<MookPunto> obtenerRuta() throws SQLException{
        int ID_LINEA = 1100;
        ObtenerRutas rutas = new ObtenerRutas();
        List<MookPunto> resp = new ArrayList<MookPunto>();
        resp = rutas.getDatos(ID_LINEA);
        return resp;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
