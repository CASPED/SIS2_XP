/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte.recorrido;

/**
 *
 * @author kornmare
 */
public class Punto {

    public String nombre;
    public double latitud;
    public double longitud;
    public double tolerancia_latitud_norte;
    public double tolerancia_latitud_sur;
    public double tolerancia_longitud_este;
    public double tolerancia_longitud_oeste;

    public Punto(String un_nombre, double una_latitud, double una_longitud, double una_tolerancia_en_latitud_norte, double una_tolerancia_en_latitud_sur, double una_tolerancia_en_longitud_este, double una_tolerancia_en_longitud_oeste) {
	nombre = un_nombre;
	latitud = una_latitud;
	longitud = una_longitud;
	tolerancia_latitud_norte = una_tolerancia_en_latitud_norte;
	tolerancia_latitud_sur = una_tolerancia_en_latitud_sur;
	tolerancia_longitud_este = una_tolerancia_en_longitud_este;
	tolerancia_longitud_oeste = una_tolerancia_en_longitud_oeste;
    }
}
