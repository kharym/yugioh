
package Controladores;

import Modelo.Posicion;
import Vistas.VBatalla;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;


public class ControlCriatura implements ActionListener {

     int contador;
   
 private Posicion[][]MatrizTablero = new Posicion [15][15];
 
    public void invocacion(Posicion x )
    {
        ImageIcon magoOscuro;
        magoOscuro = null;
        if(contador%2==0)
        {   
            magoOscuro = new ImageIcon("src\\Imagenes\\mago oscuro.jpg");
            x.Turno=1;
        }
        x.boton.setIcon(magoOscuro);
        x.boton.removeActionListener(this);
    
    
    
    
    }       
        
        @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    

}