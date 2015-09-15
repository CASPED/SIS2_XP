/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Transporte;


public class Chofer {
    int ci;
    String nombre;
    
    
    public Chofer(int c, String n){
    ci=c; 
    nombre=n;        
        
    }
    
    
    public String getNombre(){
    return nombre;
    }
    
    public int getCi(){
    return ci;
    }
    
}
