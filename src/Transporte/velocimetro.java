/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

import java.awt.Color;

public class velocimetro {
 Color c = Color.WHITE;
 int vel = 0;  
 
 public int getVel(){
   vel = (int) (Math.random()*100);
   return vel;
 }
 
 public Color getcolor(){
 if(vel>90) c = Color.RED;
 else c=Color.WHITE;
 return c;
 }
 
 public void setVel(int ve){
 vel=ve;
 }
  
   
       
    
    
}
