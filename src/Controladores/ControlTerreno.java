
package Controladores;

import Modelo.Posicion;
import Vistas.VBatalla;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

 
public class ControlTerreno implements ActionListener {
    
    int contador;
   
 private Posicion[][]MatrizTablero = new Posicion [15][15];
 
    public void despliegue(Posicion x )
    {
        ImageIcon ICONO;
        ICONO = null;
        if(contador%2==0)
        {   
            ICONO = new ImageIcon("src\\Imagenes\\amarillo.png");
            x.Turno=1;
        }
        else
        {
            ICONO = new ImageIcon("src\\Imagenes\\rojo.png");
            x.Turno=2;
        }
        //ICONO = new ImageIcon(ICONO.getImage().getScaledInstance(,-1,java.awt.image.SCALE_DEFAULT)),;//
        x.boton.setIcon(ICONO);
        x.boton.removeActionListener(this);
      
        }
    
    
    
  
     
       
        public void actionPerformed(ActionEvent e) {
       
    
}


}