
package Modelo;

import Controladores.ControlCriatura;

public class DadoB {
    
     public int valorTira; 
     public String cara;
     
     ControlCriatura cc;
     
     public String Dado1 (int vDados){ //mago Oscuro
        
        switch (vDados){
            
            case 1: cara = new String ("mov");
            break;
            case 2: cara = new String ("atk");
            break;
            case 3: cara = new String ("tramp");
            break;
            case 4: cara = new String ("mag");
            break;
            case 5: cara = new String ("inv");
            break;
            case 6: cara = new String ("inv");
         
            break;
            
           
        }
    
    return cara; 
 
     }
}

