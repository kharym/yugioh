package Controladores;

import Vistas.VMenuBatalla;

public class ControlMenuBatalla {
    
    VMenuBatalla vmb; 
    
    ControlPuzleDados cpd;
    ControlMenuPrincipal cmp; 
   
    
     public void mostrarMenuBatalla (){
    
    vmb = new VMenuBatalla(this); 
    vmb.setVisible(true);
   
    }
     
     public void volver(){ 
         
     cmp = new ControlMenuPrincipal ();
     cmp.mostrarMenuPrincipal();
     vmb.dispose();
     }
     
   public void irAlPuzleDados (){
       
       cpd = new ControlPuzleDados();
       cpd.mostrarPuzleDados();
       vmb.dispose();
       
       
       
       

   }
} 
