package Controladores;

import Modelo.Posicion;
import Vistas.VBatalla;

public class ControlBatalla {
    
    ControlBatalla cb;
    ControlDado cd;
    ControlCriatura cc;
    VBatalla vb;
    
    int puntosDeVida;
    
    boolean monstruo1 = true; 
    boolean monstruo2 = true;
    


    
    public void mostrarBatalla(){
    
      vb = new VBatalla(this);
      vb.setVisible(true);
      
    }
    
   
        
    
      
    
    
    public void lanzar (){
    
       ControlDado cara1 = new ControlDado(); 
        int num1 = cara1.calcularnumero();
         
        ControlDado cara2 = new ControlDado();
         int num2 = cara2.calcularnumero();
              
        ControlDado cara3 = new ControlDado();
        int num3 = cara3.calcularnumero();
       
         ControlDado cara4 = new ControlDado();
         int num4 = cara4.calcularnumero();
        
         vb.mostrarCarasObtenidas(num1,num2,num3,num4);
    }
    
    public void elegirDado () {
    
    
    
    
    }
    
    public void getNumeroDado(){
        
     cd = new ControlDado();
     cd.calcularnumero();
    
    }
    
    

    public void realizarAtaque()
   {
       
       
       do{ 
       
       ControlCriatura criatura1= new ControlCriatura();
       ControlCriatura criatura2= new ControlCriatura();
       
       puntosDeVida= criatura1.atacar();
       
       criatura2.daño(puntosDeVida);
       
       if (criatura2.getPuntosDeVida()<=0){
           monstruo2 = false;}
       if (criatura1.getPuntosDeVida()<=0){
           monstruo1 = false;}
       
           
       
  
       
      puntosDeVida= criatura2.atacar();
       
       criatura1.daño(puntosDeVida);
       
    
    }
       
       while(monstruo1 && monstruo2);   
}

  
    
}
