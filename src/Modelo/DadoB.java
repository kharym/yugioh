
package Modelo;

import Controladores.ControlCriatura;
import javax.swing.ImageIcon;

public class DadoB {
    
     public int valorTira; 
     public String cara;
     public ImageIcon carai;
     
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
     
     public ImageIcon Dado1i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\tramp.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\mag.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\inv.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\inv.png"); 
            break;
        }
    
    return carai; 
        
    }
     
      public String Dado2 (int vDados){ // goblin
        
        switch (vDados){
            
            case 1: cara = new String ("mov");
            break;
            case 2: cara = new String ("inv");
            break;
            case 3: cara = new String ("atk");
            break;
            case 4: cara = new String ("atk");
            break;
            case 5: cara = new String ("mov");
            break;
            case 6: cara = new String ("inv");
         
            break;

        }
          return cara;
      }
      
          public ImageIcon Dado2i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\mov.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
        }
    
    return carai; 
   
     }
       public String Dado3 (int vDados){ // orco
        
        switch (vDados){
            
            case 1: cara = new String ("tramp");
            break;
            case 2: cara = new String ("inv");
            break;
            case 3: cara = new String ("atk");
            break;
            case 4: cara = new String ("atk");
            break;
            case 5: cara = new String ("inv");
            break;
            case 6: cara = new String ("tramp");
         
            break;
            
           
        }
    

    return cara; 
    
     }

  public ImageIcon Dado3i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\tramp.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\inv.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\tramp.png");
            break;
        }
    
    return carai; 
        
    }
        public String Dado4 (int vDados){ // pikachu
        
        switch (vDados){
            
            case 1: cara = new String ("atk");
            break;
            case 2: cara = new String ("atk");
            break;
            case 3: cara = new String ("mov");
            break;
            case 4: cara = new String ("inv");
            break;
            case 5: cara = new String ("inv");
            break;
            case 6: cara = new String ("mov");
         
            break;
            
           
        }
        return cara; 
     }
  public ImageIcon Dado4i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\inv.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
        }
    
    return carai; 
        
    }
  
  public String Dado5 (int vDados){ // kuriboh
        
        switch (vDados){
            
            case 1: cara = new String ("mov");
            break;
            case 2: cara = new String ("inv");
            break;
            case 3: cara = new String ("mag");
            break;
            case 4: cara = new String ("tramp");
            break;
            case 5: cara = new String ("inv");
            break;
            case 6: cara = new String ("inv");
         
            break;
            
           
        }
    
    return cara; 
  
     }
     
     public ImageIcon Dado5i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\mag.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\tramp.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\inv.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\inv.png"); 
            break;
        }
    
    return carai; 
        
    }
     
      public String Dado6 (int vDados){ // agumon
        
        switch (vDados){
            
            case 1: cara = new String ("atk");
            break;
            case 2: cara = new String ("inv");
            break;
            case 3: cara = new String ("atk");
            break;
            case 4: cara = new String ("atk");
            break;
            case 5: cara = new String ("mov");
            break;
            case 6: cara = new String ("inv");
         
            break;

        }
          return cara;
      }
      
          public ImageIcon Dado6i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\mov.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
        }
    
    return carai; 
   
     }
       public String Dado7 (int vDados){ // dragon blanco de ojos azules 
        
        switch (vDados){
            
            case 1: cara = new String ("inv");
            break;
            case 2: cara = new String ("inv");
            break;
            case 3: cara = new String ("atk");
            break;
            case 4: cara = new String ("atk");
            break;
            case 5: cara = new String ("mov");
            break;
            case 6: cara = new String ("mov");
         
            break;
            
           
        }
    

    return cara; 
    
     }

  public ImageIcon Dado7i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\mov.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
        }
    
    return carai; 
        
    }
        public String Dado8 (int vDados){ // metabee
        
        switch (vDados){
            
            case 1: cara = new String ("atk");
            break;
            case 2: cara = new String ("atk");
            break;
            case 3: cara = new String ("mov");
            break;
            case 4: cara = new String ("inv");
            break;
            case 5: cara = new String ("inv");
            break;
            case 6: cara = new String ("mag");
         
            break;
            
           
        }
        return cara; 
     }
  public ImageIcon Dado8i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\inv.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\mag.png");
            break;
        }
        
        
        return carai; 
  }
  
  public String Dado9 (int vDados){   //  mago del tiempo 
        
        switch (vDados){
            
            case 1: cara = new String ("mag");
            break;
            case 2: cara = new String ("inv");
            break;
            case 3: cara = new String ("tramp");
            break;
            case 4: cara = new String ("mag");
            break;
            case 5: cara = new String ("inv");
            break;
            case 6: cara = new String ("mag");
         
            break;
            
           
        }
    
    return cara; 
  
     }
     
     public ImageIcon Dado9i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\mag.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\tramp.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\mag.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\inv.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\mag.png"); 
            break;
        }
    
    return carai; 
        
    }
     
      public String Dado10 (int vDados){ // guardian celta 
        
        switch (vDados){
            
            case 1: cara = new String ("mov");
            break;
            case 2: cara = new String ("inv");
            break;
            case 3: cara = new String ("atk");
            break;
            case 4: cara = new String ("atk");
            break;
            case 5: cara = new String ("mov");
            break;
            case 6: cara = new String ("inv");
         
            break;

        }
          return cara;
      }
      
          public ImageIcon Dado10i(int vDados){   
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\mov.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
        }
    
    return carai; 
   
     }
       public String Dado11 (int vDados){ // charizard
        
        switch (vDados){
            
            case 1: cara = new String ("atk");
            break;
            case 2: cara = new String ("mov");
            break;
            case 3: cara = new String ("atk");
            break;
            case 4: cara = new String ("mag");
            break;
            case 5: cara = new String ("mov");
            break;
            case 6: cara = new String ("inv");
         
            break;
            
           
        }
    

    return cara; 
    
     }

  public ImageIcon Dado11i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\mag.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\inv.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
        }
    
    return carai; 
        
    }
        public String Dado12 (int vDados){ // maga Oscura 
        
        switch (vDados){
            
            case 1: cara = new String ("atk");
            break;
            case 2: cara = new String ("mag");
            break;
            case 3: cara = new String ("atk");
            break;
            case 4: cara = new String ("mag");
            break;
            case 5: cara = new String ("inv");
            break;
            case 6: cara = new String ("mag");
         
            break;
            
           
        }
        return cara; 
     }
  public ImageIcon Dado12i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\mag.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\mag.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\inv.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\mag.png");
            break;
        }
    
    return carai; 
        
    }
  
  public String Dado13 (int vDados){ // slifer 
        
        switch (vDados){
            
            case 1: cara = new String ("mov");
            break;
            case 2: cara = new String ("inv");
            break;
            case 3: cara = new String ("mov");
            break;
            case 4: cara = new String ("atk");
            break;
            case 5: cara = new String ("atk");
            break;
            case 6: cara = new String ("mag");
         
            break;
            
           
        }
    
    return cara; 
  
     }
     
     public ImageIcon Dado13i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\atk.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\mag.png"); 
            break;
        }
    
    return carai; 
        
    }
     
      public String Dado14 (int vDados){ // mewtwo
        
        switch (vDados){
            
            case 1: cara = new String ("atk");
            break;
            case 2: cara = new String ("inv");
            break;
            case 3: cara = new String ("tramp");
            break;
            case 4: cara = new String ("atk");
            break;
            case 5: cara = new String ("tramp");
            break;
            case 6: cara = new String ("mov");
         
            break;

        }
          return cara;
      }
      
          public ImageIcon Dado14i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\tramp.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\tramp.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
        }
    
    return carai; 
   
         }
 
          
            public String Dado15 (int vDados){ // garurumon 
        
        switch (vDados){
            
            case 1: cara = new String ("atk");
            break;
            case 2: cara = new String ("inv");
            break;
            case 3: cara = new String ("atk");
            break;
            case 4: cara = new String ("inv");
            break;
            case 5: cara = new String ("mov");
            break;
            case 6: cara = new String ("mov");
         
            break;

        }
          return cara;
      }
      
          public ImageIcon Dado15i(int vDados){
        
        switch (vDados){
            
            case 1: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 2: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 3: carai = new ImageIcon("src\\Imagenes\\atk.png");
            break;
            case 4: carai = new ImageIcon("src\\Imagenes\\inv.png");
            break;
            case 5: carai = new ImageIcon("src\\Imagenes\\mov.png"); 
            break;
            case 6: carai = new ImageIcon("src\\Imagenes\\mov.png");
            break;
        }
    
    return carai; 
   
         }
}

