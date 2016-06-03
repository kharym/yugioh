
package Modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class Posicion implements ActionListener {
    
    public JButton boton;
    public boolean sinUso;
    public int Turno;
    
    public Posicion (String NumeroCasilla)
    {        
            boton= new JButton (NumeroCasilla);
            sinUso = true;
            Turno= 0; 
    }

    @Override
    public void actionPerformed(ActionEvent e) { //respueta a actionevent
        
    }
}
