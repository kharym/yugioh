
package Controladores;

import Vistas.VLogin;
import javax.swing.JOptionPane;




public class ControlLogin {
    
    VLogin vl; 
    
    ControlMenuPrincipal cmp;
    ControlAcceso ca;
    
   
    String nombreUsuario="karim";
    String contraseña = "hola";

    public void mostrarLogin (){
    
    vl = new VLogin(this); 
    vl.setVisible(true);
   
    }
    
    public void volver (){
    
    ca = new ControlAcceso ();
    ca.iniciar();
    vl.dispose();
    
    }

    public void verificarLogin(String nombre, String pass) {
          
        if(nombre.equals(nombreUsuario)&& pass.equals(contraseña)){
               
            cmp= new ControlMenuPrincipal();
            vl.dispose();
            cmp = new ControlMenuPrincipal ();
            cmp.mostrarMenuPrincipal();
        }
        
            
        if(!nombreUsuario.equals(nombre) ){
            JOptionPane.showMessageDialog(null,"Usuario inexistente");
            
        }
        
        if (!contraseña.equals(pass) ){
            JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
        } 
    }
    

 
}

    

