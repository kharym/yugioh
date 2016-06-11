package Controladores;

import Modelo.Posicion;
import Vistas.VBatalla;


public class ControlBatalla {
    
    ControlBatalla cb;
    ControlDado cd;
    ControlCriatura cc;
    VBatalla vb;
    ControlAccion ca;
    
    
    int turno = 1;

 public String Jugador1 = "Amarillo";
 public String Jugador2 = "Rojo";
 public String Jugador3 = "Azul";
    
    int puntosDeVida;
    
    boolean monstruo1 = true; 
    boolean monstruo2 = true;
    
   
    
 

    
    public void mostrarBatalla(){
    
      vb = new VBatalla(this);
      vb.setVisible(true);
      vb.despliegueJefeDeTerrenos();
      
    }
    
   
        
    
      
    
    
    public void lanzar (){
    
       ControlDado cara1 = new ControlDado(); 
        int num1 = cara1.calcularnumero();
         
        System.out.println("cara verdadera obtenida es: "+num1 );
            
  
        
         vb.mostrarCarasObtenidas(num1);
    }

    
     public void lanzar1 (){
    
      
         
        ControlDado cara2 = new ControlDado();
         int num1 = cara2.calcularnumero();
           
            System.out.println("cara verdadera obtenida es: "+num1 );
       
        
         vb.mostrarCarasObtenidas1(num1);
    }
     
      public void lanzar2 (){
    
       
              
        ControlDado cara3 = new ControlDado();
        int num1 = cara3.calcularnumero();
        
        System.out.println("cara verdadera obtenida es: "+num1 );
         
        
         vb.mostrarCarasObtenidas2(num1);
    }
      
       public void lanzar3 (){
    
       
       
         ControlDado cara4 = new ControlDado();
         int num1 = cara4.calcularnumero();
         System.out.println("cara verdadera obtenida es: "+num1 );
        
       
         vb.mostrarCarasObtenidas3(num1);
    }
    
     public void lanzar4 (){
    
       ControlDado cara1 = new ControlDado(); 
        int num1 = cara1.calcularnumero();
        
       System.out.println("cara verdadera obtenida es: "+num1 );
         
       
       
         vb.mostrarCarasObtenidas4(num1);
    }
    
     public void lanzar5 (){
    
      
         
        ControlDado cara2 = new ControlDado();
         int num1 = cara2.calcularnumero();
        
           System.out.println("cara verdadera obtenida es: "+num1 );
              
       
         vb.mostrarCarasObtenidas5(num1);
    }
     
      public void lanzar6 (){
    
       
              
        ControlDado cara3 = new ControlDado();
        int num1 = cara3.calcularnumero();
        
            
       System.out.println("cara verdadera obtenida es: "+num1 );
         
       
         vb.mostrarCarasObtenidas6(num1);
    }
      
       public void lanzar7 (){
    
       
       
         ControlDado cara4 = new ControlDado();
         int num1 = cara4.calcularnumero();
         
         System.out.println("cara verdadera obtenida es: "+num1 );
           
        ;
         vb.mostrarCarasObtenidas7(num1);
    }
       
        public void lanzar8 (){
    
       ControlDado cara1 = new ControlDado(); 
        int num1 = cara1.calcularnumero();
         
        System.out.println("cara verdadera obtenida es: "+num1 );
            
  
        
         vb.mostrarCarasObtenidas8(num1);
    }

    
     public void lanzar9 (){
    
      
         
        ControlDado cara2 = new ControlDado();
         int num1 = cara2.calcularnumero();
           
            System.out.println("cara verdadera obtenida es: "+num1 );
       
        
         vb.mostrarCarasObtenidas9(num1);
    }
     
      public void lanzar10 (){
    
       
              
        ControlDado cara3 = new ControlDado();
        int num1 = cara3.calcularnumero();
        
        System.out.println("cara verdadera obtenida es: "+num1 );
         
        
         vb.mostrarCarasObtenidas10(num1);
    }
      
       public void lanzar11 (){
    
       
       
         ControlDado cara4 = new ControlDado();
         int num1 = cara4.calcularnumero();
         System.out.println("cara verdadera obtenida es: "+num1 );
        
       
         vb.mostrarCarasObtenidas11(num1);
    }
    
     public void lanzar12 (){
    
       ControlDado cara1 = new ControlDado(); 
        int num1 = cara1.calcularnumero();
        
       System.out.println("cara verdadera obtenida es: "+num1 );
         
       
       
         vb.mostrarCarasObtenidas12(num1);
    }
    
     public void lanzar13 (){
    
      
         
        ControlDado cara2 = new ControlDado();
         int num1 = cara2.calcularnumero();
        
           System.out.println("cara verdadera obtenida es: "+num1 );
              
       
         vb.mostrarCarasObtenidas13(num1);
    }
     
      public void lanzar14 (){
    
       
              
        ControlDado cara3 = new ControlDado();
        int num1 = cara3.calcularnumero();
        
            
       System.out.println("cara verdadera obtenida es: "+num1 );
         
       
         vb.mostrarCarasObtenidas14(num1);
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
    
   

 

 
    public String getJugador1() {
        return Jugador1;
    }

    public void setJugador1(String Jugador1) {
        this.Jugador1 = Jugador1;
    }

    public String getJugador2() {
        return Jugador2;
    }

    public void setJugador2(String Jugador2) {
        this.Jugador2 = Jugador2;
    }

    public String getJugador3() {
        return Jugador3;
    }

    public void setJugador3(String Jugador3) {
        this.Jugador3 = Jugador3;
    }

    public String getJugador4() {
        return Jugador4;
    }

    public void setJugador4(String Jugador4) {
        this.Jugador4 = Jugador4;
    }
 public String Jugador4 = "Verde";
    

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void indicarTurno(){
    
     if(getTurno()==1){
                
                System.out.println("Le toca al JUGADOR Amarillo: Elija sus Dados");
                
                
    
     
     }else{
                
                System.out.println("Le toca al JUGADOR Rojo: Elija sus Dados");       
    }
    
}  
    //Regresa El Caracter De Tipo String.
    public String obtenerJugador(){
        
        
        if(getTurno()==1){
                
                return Jugador1;
                
        }else{
                
                return Jugador2;      
    }
    }
  
  
    
}
