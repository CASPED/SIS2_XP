/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author irene
 */
public class Bus {

    private final String placa;
    private final String modelo;

    private String linea;
    private Estado estado;

    public Bus(String placa, String modelo, String linea, Estado estado) {
        this.linea = linea;
        this.placa = placa;
        this.modelo = modelo;
        this.estado = estado;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void cambiarEstado(Estado estado) {
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getLinea() {
        return linea;
    }

    public String getModelo() {
        return modelo;
    }

    public Estado getEstado() {
        return estado;
    }

}
