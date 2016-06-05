
package Controladores;

import Modelo.Criatura;
import Modelo.Dado;

import Modelo.Posicion;
import Vistas.VBatalla;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon; 


public class ControlCriatura implements ActionListener {
     int contador;
     private String nombreCriatura;
     private int puntosDeVida;
     private int ataque;
     private int defensa; 
     private ImageIcon imagenCriatura;
     private int daño = defensa - ataque;
     private int accionesAtaque;
     String [] nombreimagenes = {"1.png","2.png","3.png","4.png","5.png"};
     private ImageIcon cara1; 
     private ImageIcon cara2;
     private ImageIcon cara3;
     private ImageIcon cara4;
     private ImageIcon cara5;
     private ImageIcon cara6;
     Dado d; 
     
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
   public ImageIcon getCara1() {
        return cara1;
    }

    public void setCara1(ImageIcon cara1) {
        this.cara1 = cara1;
    }

    public ImageIcon getCara2() {
        return cara2;
    }

    public void setCara2(ImageIcon cara2) {
        this.cara2 = cara2;
    }

    public ImageIcon getCara3() {
        return cara3;
    }

    public void setCara3(ImageIcon cara3) {
        this.cara3 = cara3;
    }

    public ImageIcon getCara4() {
        return cara4;
    }

    public void setCara4(ImageIcon cara4) {
        this.cara4 = cara4;
    }

    public ImageIcon getCara5() {
        return cara5;
    }

    public void setCara5(ImageIcon cara5) {
        this.cara5 = cara5;
    }

    public ImageIcon getCara6() {
        return cara6;
    }

    public void setCara6(ImageIcon cara6) {
        this.cara6 = cara6;
    }
   
     private Posicion[][]MatrizTablero = new Posicion [15][15];
 
    
     
     public void comparacion (){
     
     
     
     }
     
     
     
     
     
     
     
     public void invocacion1(Posicion x )
    {
        
         
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
         
        imagenCriatura = null;
        if(contador%2==0)
        {   
            imagenCriatura = new ImageIcon("src\\Imagenes\\mago oscuro.jpg");
           
        }
        x.boton.setIcon(imagenCriatura);
        x.boton.removeActionListener(this);
        
        
        
        
        ControlCriatura criatura2= new ControlCriatura();
         criatura2.setAtaque(300);
         criatura2.setDefensa(200);
         criatura2.setNombreCriatura("kuriboh");
         criatura2.setPuntosDeVida(1000); 
       
        
    }
    
    
    
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