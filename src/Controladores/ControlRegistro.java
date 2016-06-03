package Controladores;

import Vistas.VRegistro;

public class ControlRegistro {
    
    VRegistro vr;
    ControlRegistro cr;
    ControlAcceso ca;
    
    
    public void mostrarRegistro (){
    
    vr = new VRegistro(this); 
    vr.setVisible(true);
    
    }
    
    public void volverR (){
    
    ca = new ControlAcceso ();
    ca.iniciar();
    vr.dispose();
    
    }
    
}
