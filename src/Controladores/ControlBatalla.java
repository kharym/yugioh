package Controladores;


import Vistas.VBatalla;

public class ControlBatalla {
    
    ControlBatalla cb;
    ControlDado cd;
    VBatalla vb;


    
    public void mostrarBatalla(){
    
      vb = new VBatalla(this);
      vb.setVisible(true);
      
    }
    
    public void lanzarDado (){
    
  ControlDado objDado = new ControlDado(); 
        int dado1 =objDado.calcularnumero();
      
        ControlDado objDado2 = new ControlDado(); 
        int dado2 =objDado2.calcularnumero();
        
        
        ControlDado objDado3 = new ControlDado(); 
        int dado3 =objDado3.calcularnumero();
        
        
       ControlDado objDado4 = new ControlDado();
        int dado4 =objDado4.calcularnumero();
        
    
      vb.mostrarLanzamiento(dado1,dado2,dado3,dado4);
    }
    
    public void detenerDado (){
    
       ControlDado objDado = new ControlDado(); 
        int num1 = objDado.calcularnumero();
         
        ControlDado objDado2 = new ControlDado();
         int num2 = objDado2.calcularnumero();
              
        ControlDado objDado3 = new ControlDado();
        int num3 = objDado3.calcularnumero();
       
         ControlDado objDado4 = new ControlDado();
         int num4 = objDado4.calcularnumero();
        
         vb.mostrarCarasObtenidas(num1,num2,num3,num4);
    }
    
    public void getNumeroDado(){
        
     cd = new ControlDado();
     cd.calcularnumero();
    
    }
    
   
}
