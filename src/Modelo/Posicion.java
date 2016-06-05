
package Modelo;

import Controladores.ControlTerreno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Posicion implements ActionListener {
    
    public JButton boton;
    public boolean sinUso;
    public int Turno;
    
    public Posicion (String NumeroCasilla)
    {        
            boton= new JButton (NumeroCasilla);
           
            sinUso = true;
            
    }

    @Override
    public void actionPerformed(ActionEvent e) { //respueta a actionevent
        
    }

    public void setIcon(ImageIcon ICONO) {
        
    }

    public void removeActionListener(ControlTerreno aThis) {
        
    }
}
