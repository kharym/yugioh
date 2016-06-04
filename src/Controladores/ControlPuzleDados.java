package Controladores;

import Vistas.VPuzleDados;

public class ControlPuzleDados {
    
    VPuzleDados vpd;
    
    ControlPuzleDados cpd;
    ControlMenuBatalla cmb;
    ControlBatalla cb;
    
    String dado1;
    String dado2;
    String dado3;
    String dado4;
    String dado5;
    String dado6;
    String dado7;
    String dado8;
    String dado9;
    String dado10;
    String dado11;
    String dado12;
    String dado13;
    String dado14;
    String dado15;
    
     public void agregarDado(){
    
}
     public void quitarDado (){
     
     }
     
    public void mostrarPuzleDados (){
    
    vpd = new VPuzleDados(this); 
    vpd.setVisible(true);
    } 
    
    public void Confirmar (){
    
    cb = new ControlBatalla();
    cb.mostrarBatalla();
    vpd.dispose();
    
    }
    
    public void volver(){
         cmb = new ControlMenuBatalla();
         cmb.mostrarMenuBatalla();
         vpd.dispose();
    }
}
