package Geolocalizacion;

import javax.swing.*;
import javax.swing.JPanel; 

/**
 *
 * @author CASPED
 */
public class Localizate extends JFrame{
    JPanel panel = new javax.swing.JPanel();
    
    public Localizate(){  
        initComponents();
        setTitle("Introducir Coordenadas");
        setBounds(500, 500, 400, 300);    
    } 
    
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        panel= new SetLocation();
        getContentPane().add(panel);
        setVisible(true);        
    }
}
