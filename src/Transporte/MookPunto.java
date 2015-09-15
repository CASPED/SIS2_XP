/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author root
 */
public class MookPunto {
    private String Site;
    private Coordinates cordenada;

    public MookPunto(String Site, Coordinates cordenada) {
        this.Site = Site;
        this.cordenada = cordenada;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }

    public Coordinates getCordenada() {
        return cordenada;
    }

    public void setCordenada(Coordinates cordenada) {
        this.cordenada = cordenada;
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
    
    public ArrayList<MookPunto> obtenerRuta(){
        ArrayList<MookPunto> resp = new ArrayList<MookPunto>();
        MookPunto punto = new MookPunto("Laguna",
                new Coordinates(47.08712, 57.08712));
        resp.add(punto);
        punto = new MookPunto("UMSS",
                new Coordinates(47.08713, 57.08715));
        resp.add(punto);
        punto = new MookPunto("UCB",
                new Coordinates(47.08714, 57.08717));
        resp.add(punto);
        punto = new MookPunto("IC NORTE",
                new Coordinates(47.08715, 57.08719));
        resp.add(punto);
        punto = new MookPunto("IC NORTE 2",
                new Coordinates(47.08716, 57.08721));
        resp.add(punto);
        punto = new MookPunto("Blanco Galindo",
                new Coordinates(47.08717, 57.08723));
        resp.add(punto);
        return resp;
    }

    public MookPunto(String Site) {
        this.Site = Site;
    }

    public MookPunto() {
    }
}
