
package Modelo;

import javax.swing.ImageIcon;

import Controladores.ControlCriatura;
import javax.swing.Icon;


public class Dado {
    
    public int valorTira; 
    public ImageIcon cara;
    ControlCriatura cc;
    
    
    
    public ImageIcon Dado1(int vDados){
        
        switch (vDados){
            
            case 1: cara = new ImageIcon("src\\Imagenes\\mov.png");
            break;
            case 2: cara = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 3: cara = new ImageIcon("src\\Imagenes\\tramp.png");
            break;
            case 4: cara = new ImageIcon("src\\Imagenes\\mag.png");
            break;
            case 5: cara = new ImageIcon("src\\Imagenes\\inv.png"); 
                    cc = new ControlCriatura();
                  
                   
                    
                    break;
        }
    
    return cara; 
        
    }
     
     
   public ImageIcon gifDado1(int Dado1){
        
        switch (Dado1){
            
            case 1: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 2: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 3: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 4: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 5: cara = new ImageIcon("src\\Imagenes\\girodado.gif");   
        }
    
    return cara; 
    
        
    } 
     public ImageIcon gifDado2(int Dado2){
        
        switch (Dado2){
            
            case 1: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 2: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 3: cara= new ImageIcon("src\\Imagenes\\girodado.gif");
            case 4: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 5: cara = new ImageIcon("src\\Imagenes\\girodado.gif");   
        }
    
    return cara; 
    
}
 
     public ImageIcon gifDado3(int Dado3){
        
        switch (Dado3){
            
            case 1: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 2: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 3: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 4: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 5: cara = new ImageIcon("src\\Imagenes\\girodado.gif");   
        }
    
    return cara; 
    
} 
     
     public ImageIcon gifDado4(int Dado4){
        
        switch (Dado4){
            
            case 1: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 2: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 3: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 4: cara = new ImageIcon("src\\Imagenes\\girodado.gif");
            case 5: cara = new ImageIcon("src\\Imagenes\\girodado.gif");   
        }
    
    return cara;
} 

    
     
    
}
