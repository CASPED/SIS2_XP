
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Geolocalizacion.SetLocation;
import javax.swing.*;
import javax.swing.JPanel; 

/**
 *
 * @author CASPED
 */
public class Interface extends JFrame{
    JPanel panel = new javax.swing.JPanel();
    
    public Interface(SetLocation loc){  
        initComponents(loc);
        setTitle("Letrero");
        setBounds(500, 200, 900, 300);    
    } 
    
    private void initComponents(SetLocation loc) {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        panel= new Letrero(loc);
        getContentPane().add(panel);
        setVisible(true);
    }
}
