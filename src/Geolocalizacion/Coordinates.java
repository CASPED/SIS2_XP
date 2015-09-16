package Geolocalizacion;

import javax.swing.*;
import javax.swing.JPanel; 

/**
 *
 * @author CASPED
 */
public class Coordinates extends JFrame{
    private SetLocation panel;
    
    public Coordinates(){  
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
    
    public SetLocation getSetLocation() {
	return panel;
    }
}
