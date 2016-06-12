
package Controladores;


import Modelo.Criatura;
import Modelo.DadoB;

import Modelo.Posicion;
import Vistas.VBatalla;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon; 


public class ControlCriatura implements ActionListener {
    
     private String nombreCriatura;
     private int puntosDeVida;
     private int ataque;
     private int defensa; 
     private ImageIcon imagenCriatura;
     private int daño = defensa - ataque;
     private int accionesAtaque; 
    
     private  String cara1; 
     private  String cara2;
     private  String cara3;
     private  String cara4;
     private  String cara5;
     private  String cara6;
    
     DadoB d; 
     int contador;
     
      public ControlCriatura() {
         
      }

    public String getNombreCriatura() {
        return nombreCriatura;
    }

    public void setNombreCriatura(String nombreCriatura) {
        this.nombreCriatura = nombreCriatura;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getAccionesAtaque() {
        return accionesAtaque;
    }

    public void setAccionesAtaque(int accionesAtaque) {
        this.accionesAtaque = accionesAtaque;
    }
  
   
    
 
    
      
        
         public void crearCriatura (Posicion x){
          
         ControlCriatura criatura3= new ControlCriatura();
         ControlCriatura criatura4= new ControlCriatura();
         ControlCriatura criatura5= new ControlCriatura();
         ControlCriatura criatura6= new ControlCriatura();
         ControlCriatura criatura7= new ControlCriatura();
         ControlCriatura criatura8= new ControlCriatura();
         ControlCriatura criatura9= new ControlCriatura();
         ControlCriatura criatura10= new ControlCriatura();
         ControlCriatura criatura11= new ControlCriatura();
         ControlCriatura criatura12= new ControlCriatura();
         ControlCriatura criatura13= new ControlCriatura();
         ControlCriatura criatura14= new ControlCriatura();
         ControlCriatura criatura15= new ControlCriatura();
        
         ControlCriatura criatura1= new ControlCriatura(); // instanciar criatura 1
                
         criatura1.setAtaque(1000);                        // asignacion a metodos de criatura1
         criatura1.setDefensa(500);
         criatura1.setNombreCriatura("mago oscuro");
         criatura1.setPuntosDeVida(2500); 
         
        
       
        }
       
        

   
        
        
        
         
       /** ControlCriatura criatura2= new ControlCriatura();
         criatura2.setAtaque(300);
         criatura2.setDefensa(200);
         criatura2.setNombreCriatura("kuriboh");
         criatura2.setPuntosDeVida(1000); **/
       
        
        
        

    
    
    public int atacar (){
    if (accionesAtaque>0){
    accionesAtaque--;
    return ataque;
    }
    else { 
        return 0;
        
    }
    }
 
    public void daño (int puntosDeVida){
        this.puntosDeVida-=puntosDeVida;
      
    }
        
        @Override
    public void actionPerformed(ActionEvent e) {
        
    }

   

    
    

}