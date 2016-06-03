package Controladores;

import Vistas.VAcceso;


public class ControlAcceso {
     
    private VAcceso va;
    private ControlLogin cl;
    private ControlRegistro cr;

    public void iniciar() {
        va = new VAcceso(this);
        va.setVisible(true);
    }
    
    
    public void ingresar (){
        
        cl = new ControlLogin();
        cl.mostrarLogin();
        va.dispose();
    }
    
    public void registrar (){
    
        cr = new ControlRegistro();
        cr.mostrarRegistro();
        va.dispose();
    }
    
    
}
