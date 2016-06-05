package Controladores;


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
