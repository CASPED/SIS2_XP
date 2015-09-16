
package Transporte;

import Geolocalizacion.Coordinates;
import Interface.Interface;
import Interface.Letrero;

public class Main {

    public static void main(String[] args) {
        Coordinates intro=new Coordinates();
        Interface ver=new Interface(intro.getSetLocation());
    }
    
}
