/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbus;

 * @author Isabel
 */
public class Pasajero {

    private String nombre;
    private String apellido;
    private int ci;
    private int edad;
    
   
    public Pasajero(String nombre, String apellido, int ci, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCi(){
        return ci;
    }
    
    
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCi(int ci){
        this.ci = ci;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
