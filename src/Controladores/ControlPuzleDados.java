package Controladores;

import Vistas.VPuzleDados;

public class ControlPuzleDados {
    
    VPuzleDados vpd;
    
    ControlPuzleDados cpd;
    ControlMenuBatalla cmb;
    ControlBatalla cb;
    
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
