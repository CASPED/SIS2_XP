/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

import java.awt.Color;
import javax.swing.JTextField;

 public class velocimetro {
 int max = 90;    
 public JTextField actualizar(JTextField n){
     int vel = (int)(Math.random()*100);   n.setText(""+vel); 
     if(control_velocidad(vel)){
     n.setBackground(Color.WHITE);   
     }else{
     n.setBackground(Color.RED);
     }
     return n;
 }
 
 public boolean control_velocidad(int vel){
   return vel>max;
 }
 

 public void setVelMax(int Maximo){
 max=Maximo;
 }
}
         
 
  
   
       
    
  
