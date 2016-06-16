package Controladores;

import Vistas.VRegistro;
import Modelo.ConexionDB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlRegistro implements ActionListener {
    
    String nombreUsuario;
    String pass1;
    String pass2;
    boolean checkboxPNJ;

    VRegistro vr;
    ControlRegistro cr;
    ControlAcceso ca;
    ConexionDB mdb;
    
     
    public void mostrarRegistro (){
    
    vr = new VRegistro(this); 
    vr.setVisible(true);
    
    }
    
    public void volverR (){
    
    ca = new ControlAcceso ();
    ca.iniciar();
    vr.dispose();
    
    }
    
    //nameUsuario=nombre del usuario
    //Para saber si es usuario ya existente
    
    
    public boolean confirmacionUsuario(String nameUsuario){
        mdb =  new ConexionDB();
        ArrayList<String> nombresUsuarios = mdb.obtenerListaUsuarios();
        for(String nombre:nombresUsuarios){
            if(nameUsuario.equals(nombre)){
            JOptionPane.showMessageDialog(null,"Nombre de usuario ya existente. Por favor elija otro.");
            return false;
                                     
            }
        }return true;
    } 
           
    
    public boolean coincidenContrasena(String contrasena1,String contrasena2){
        if(contrasena1.equals(contrasena2)){
            return true;
        }else{
            JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
            return false;
        }
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(vr.getBotonConfirmarRegistro() == ae.getSource()){
            this.pass1 = vr.getContrasena1();
            this.pass2 = vr.getContrasena2();
            this.nombreUsuario = vr.getTextoUsuario();
            this.checkboxPNJ = vr.estadoPNJ();            
            if (coincidenContrasena(pass1,pass2) == true && confirmacionUsuario(nombreUsuario) == true){
                if (checkboxPNJ == false){
                    mdb.registroUsuario(nombreUsuario, pass1, false);
                }else{
                    mdb.registroUsuario(nombreUsuario, null, true);
                }                                
            }else{
                JOptionPane.showMessageDialog(null,"Error al registrarse");                
                }            
        }else{
            JOptionPane.showMessageDialog(null,"Error al registrarse");  
        
        }
    
    }
}
