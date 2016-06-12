
package Vistas;
import Controladores.ControlBatalla;
import Controladores.ControlDado;

import Controladores.ControlCriatura;
import Controladores.ControlPuzleDados;
import Controladores.ControlAccion;
import Controladores.ControlTurno;

import Modelo.Posicion;
import Modelo.Criatura;
import Modelo.DadoB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.Icon;

import javax.swing.JFrame;


public class VBatalla extends javax.swing.JDialog implements ActionListener {
    
    ControlBatalla cb;
    ControlDado cd;
   
    ControlCriatura cc;
    ControlPuzleDados cpd;
    ControlAccion ca;
    ControlTurno cturno;
    Posicion x;
    
    int contadorTurno = 1;
    int auxContadorTurno = 1;
    int contadordados=0;
    int contadorMov=1;
    int auxMov = 0; 
    int contadorAtk=1;
    int auxAtk = 0; 
    int contadorTramp=1;
    int auxTramp = 0; 
    int contadorMag=1;
    int auxMag = 0; 
    boolean uso = false;
    
  
    String terreno;
    String numerocd="terreno";
    
    ImageIcon imagenCriatura;
    String Criatura;
    String caraObtenida1;
    String caraObtenida2; 
    String caraObtenida3; 
    String caraObtenida4;
    String caraObtenida5;
    String caraObtenida6; 
    String caraObtenida7; 
    String caraObtenida8;
     String caraObtenida9;
    String caraObtenida10; 
    String caraObtenida11; 
    String caraObtenida12;
    String caraObtenida13;
    String caraObtenida14; 
    String caraObtenida15;
   
    
    private Posicion[][]MatrizTablero = new Posicion [15][15];
    
    public VBatalla(ControlBatalla aThis) {

        initComponents();
        
        cb = aThis;
          for(int i=0; i<15;i++) // recorrer columnas 
          {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j]= new Posicion (null); // instanciacion de cada elemento del objeto matriztablero 
             
                MatrizTablero[i][j].boton.setBounds(i*100, j*35, 100, 34);
                
                this.TABLERO.add(MatrizTablero[i][j].boton);
                
                MatrizTablero[i][j].boton.setEnabled(false);
               
               
              terreno = null;
               
               MatrizTablero[i][j].boton.setText(terreno);

                BotonDetener.setEnabled(false);
                BotonDetener1.setEnabled(false);
                BotonDetener2.setEnabled(false);
                BotonDetener3.setEnabled(false);
                BotonDetener4.setEnabled(false);
                BotonDetener5.setEnabled(false);
                BotonDetener6.setEnabled(false);
                BotonDetener7.setEnabled(false);
                BotonDetener8.setEnabled(false);
                BotonDetener9.setEnabled(false);
                BotonDetener10.setEnabled(false);
                BotonDetener11.setEnabled(false);
                BotonDetener12.setEnabled(false);
                BotonDetener13.setEnabled(false);
                BotonDetener14.setEnabled(false);
                BotonDetener15.setEnabled(false);
                BotonDetener16.setEnabled(false);
                BotonDetener17.setEnabled(false);
                BotonDetener18.setEnabled(false);
                BotonDetener19.setEnabled(false);
                BotonDetener20.setEnabled(false);
                BotonDetener21.setEnabled(false);
                BotonDetener22.setEnabled(false);
                BotonDetener23.setEnabled(false);
                BotonDetener24.setEnabled(false);
                BotonDetener25.setEnabled(false);
                BotonDetener26.setEnabled(false);
                BotonDetener27.setEnabled(false);
                BotonDetener28.setEnabled(false);
                BotonDetener29.setEnabled(false);
                BotonAtacar1.setEnabled(false);
                BotonAtacar2.setEnabled(false);
                BotonAtacar3.setEnabled(false);
                BotonAtacar4.setEnabled(false);
                BotonMover1.setEnabled(false);
                
               
                BotonMover3.setEnabled(false);
                BotonMover4.setEnabled(false);
                Dado21.setEnabled(false);
                Dado31.setEnabled(false);
                Dado41.setEnabled(false);
            }
        }
    }

    private VBatalla(JFrame jFrame, boolean b) {   
    }

    public VBatalla() {    
    }

    
    public void hacerVisiblesBox2(){         
        
                Dado21.setEnabled(false);
               
    
    
    }
    
    
    public void despliegue(Posicion x) {
 
            x.boton.setBackground(Color.yellow);
            
             for(int i=0; i<15;i++) // recorrer columnas 
            {
            for(int j=0; j<15;j++) // recorrer filas
            {
           
         MatrizTablero[i][j].boton.removeActionListener(this);
         
         terreno= "ocupado";
         
         x.boton.setText(String.valueOf(terreno));

         terreno= (x.boton.getText());
            
            }
          }
          
    }
    
    public void despliegueJefeDeTerrenos(){
    
            ImageIcon imagenJefeTerreno1;
            ImageIcon imagenJefeTerreno2;
            ImageIcon imagenJefeTerreno3;
            ImageIcon imagenJefeTerreno4;
       
            imagenJefeTerreno1 = null;
            imagenJefeTerreno2 = null;
            imagenJefeTerreno3 = null;
            imagenJefeTerreno4 = null;
      
            imagenJefeTerreno1 = new ImageIcon("src\\Imagenes\\jefeTerrenoAmarillo.jpg");
            imagenJefeTerreno2 = new ImageIcon("src\\Imagenes\\jefeTerrenoRojo.jpg");
            imagenJefeTerreno3 = new ImageIcon("src\\Imagenes\\jefeTerrenoAzul.png");
            imagenJefeTerreno4 = new ImageIcon("src\\Imagenes\\jefeTerrenoVerde.jpg");
         
            MatrizTablero[7][0].boton.setIcon(imagenJefeTerreno1);
            MatrizTablero[7][14].boton.setIcon(imagenJefeTerreno2);
            MatrizTablero[0][7].boton.setIcon(imagenJefeTerreno3);
            MatrizTablero[14][7].boton.setIcon(imagenJefeTerreno4);
           
            MatrizTablero[7][0].boton.removeActionListener(this);
            MatrizTablero[7][14].boton.removeActionListener(this);
            MatrizTablero[0][7].boton.removeActionListener(this);
            MatrizTablero[14][7].boton.removeActionListener(this);
    
    }
    
    
    public void invocacion1 (Posicion x){  //mago oscuro
        
            
          Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(1)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
         
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\mago oscuro.jpg");
       
        x.boton.setIcon(imagenCriatura);
        
        for(int i=0; i<15;i++) // recorrer columnas 
            {
            for(int j=0; j<15;j++) // recorrer filas
            {
           
         MatrizTablero[i][j].boton.addActionListener(this);
         
         
            }
          }
         caraObtenida1 = null;
         
    }
     
    public void invocacion2 (Posicion x){ //goblin
        
         Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(2)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
            
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\goblin.jpg");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
            
            caraObtenida2 = null;
    }
      
     public void invocacion3 (Posicion x){   //orco
        
        Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(3)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
            
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\orco.jpg");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            
        }
            caraObtenida3 = null;
    }
       
      public void invocacion4 (Posicion x){      //pikachu
        
       Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(4)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
            
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\Pikachu.png");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
            caraObtenida4 = null;
    }
    public void invocacion5 (Posicion x){  // kuriboh
        
       Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(5)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
            
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\kuriboh.jpg");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
            caraObtenida5 = null;
    }
     
    public void invocacion6 (Posicion x){ // agumon
        
      Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(6)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
          
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\agumon.png");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            
             for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
             caraObtenida6 = null;
    }
      
     public void invocacion7 (Posicion x){   // dboa
        
       Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(7)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
            
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\dboa.jpg");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
            caraObtenida7 = null;
    }
       
      public void invocacion8 (Posicion x){      // metabee
        
       Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(8)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
            
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\metabee.png");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
            caraObtenida8 = null;
    }
      
      public void invocacion9 (Posicion x){  //mago del tiempo
        
     
           Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(9)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\mago del tiempo.jpg");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
              for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
              caraObtenida9 = null;
    }
     
    public void invocacion10 (Posicion x){ //guardian celta 
        
       Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(10)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
            
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\guardian celta.jpg");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
            caraObtenida10 = null;
    }
      
     public void invocacion11 (Posicion x){   // charizard
        
       Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(11)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
            
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\charizard.png");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
            caraObtenida11 = null;
    }
       
      public void invocacion12 (Posicion x){      // maga oscura
        
       Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(12)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
           
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\maga oscura.png");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
            caraObtenida12 = null;
    }
    public void invocacion13 (Posicion x){  // slifer
        
       
            Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(13)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\slifer.jpg");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
            caraObtenida13 = null;
    }
     
    public void invocacion14 (Posicion x){ // mewtwo
        Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(14)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
      
            
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\mewtwo.png");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            
             for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
             caraObtenida14 = null;
    }
      
     public void invocacion15 (Posicion x){   // garurumon 
        
       
            Criatura criatura1 = new Criatura();          
       
          x.boton.setText((criatura1.Criaturas(15)));
          
         
          x.boton.setBackground(Color.yellow);
   
         terreno = (x.boton.getText());
       
            imagenCriatura = null;
      
            imagenCriatura = new ImageIcon("src\\Imagenes\\garurumon.png");
       
            x.boton.setIcon(imagenCriatura);
         
            x.boton.removeActionListener(this);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
        }
            caraObtenida15 = null;
    }
        
    public void mostrarCarasObtenidas(int num1){ //mago Oscuro
        
        DadoB cara1 = new DadoB(); 
        lblDado5.setText(String.valueOf(cara1.Dado1(num1)));
       
        caraObtenida1 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida1)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
               auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               
               BotonMover1.setEnabled(true);
        
        }
        else if ( "atk".equals(caraObtenida1)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
            
             for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida1)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida1)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        
        }
        else if ( "mag".equals(caraObtenida1)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
           auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        
        }
    
        System.out.println("Se obtuvo: "+caraObtenida1);
         
        
        BotonDetener.setEnabled(false);
    }
    
    public void mostrarCarasObtenidas1(int num1){  //goblin 
        
        DadoB cara2 = new DadoB();
        lblDado5.setText(String.valueOf(cara2.Dado2(num1)));
        
        
        caraObtenida2 = (lblDado5.getText());
        if ( "mov".equals(caraObtenida2)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            
            }
        
            auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
                BotonMover1.setEnabled(true);
                 
        }
                else if ( "atk".equals(caraObtenida2)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
              for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
                else if ( "inv".equals(caraObtenida2)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
                else if ( "tramp".equals(caraObtenida2)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        
        }
                else if ( "mag".equals(caraObtenida2)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            
        auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        }
        
        System.out.println("Se obtuvo: "+caraObtenida2);
         
        
        BotonDetener1.setEnabled(false);
    }
    public void mostrarCarasObtenidas2(int num1){ //orco
        
        DadoB cara3 = new DadoB(); 
        lblDado5.setText(String.valueOf(cara3.Dado3(num1)));
       
        caraObtenida3 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida3)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }

            }
           auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
        }
        else if ( "atk".equals(caraObtenida3)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida3)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida3)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        
        }
        else if ( "mag".equals(caraObtenida3)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
        auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        }
    
         System.out.println("Se obtuvo: "+caraObtenida3);
         
        
        BotonDetener2.setEnabled(false);
    }
    public void mostrarCarasObtenidas3(int num1){        //pikachu
        
        DadoB cara4 = new DadoB();
        lblDado5.setText(String.valueOf(cara4.Dado4(num1)));
       
        caraObtenida4 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida4)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            
            }
            
            auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
        }
        else if ( "atk".equals(caraObtenida4)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida4)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida4)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        }
        else if ( "mag".equals(caraObtenida4)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
           auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        
        }
    
         System.out.println("Se obtuvo: "+caraObtenida4);
         
        
        BotonDetener3.setEnabled(false);
    }
    
    public void mostrarCarasObtenidas4(int num1){            //kuriboh
        
        DadoB cara1 = new DadoB(); 
        lblDado5.setText(String.valueOf(cara1.Dado5(num1)));
       
        caraObtenida5 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida5)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
            
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
           
            auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
            
        }
        else if ( "atk".equals(caraObtenida5)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida5)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida5)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
            
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
        auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        }
        else if ( "mag".equals(caraObtenida5)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        
        }
    
        System.out.println("Se obtuvo: "+caraObtenida5);
         
        
        BotonDetener4.setEnabled(false);
        BotonMover1.setEnabled(true);
    }
    
    public void mostrarCarasObtenidas5(int num1){  // agumon
        
        DadoB cara2 = new DadoB();
        lblDado5.setText(String.valueOf(cara2.Dado6(num1)));
        
        caraObtenida6 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida6)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            
            }
           
            
            auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
        }
        else if ( "atk".equals(caraObtenida6)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida6)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida6)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
           auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        
        }
        else if ( "mag".equals(caraObtenida6)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
            
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
        auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        }
        
        System.out.println("Se obtuvo: "+caraObtenida6);
         
        
        BotonDetener5.setEnabled(false);
    }
    public void mostrarCarasObtenidas6(int num1){ // dboa
        
        DadoB cara3 = new DadoB(); 
        lblDado5.setText(String.valueOf(cara3.Dado7(num1)));
       
        caraObtenida7 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida7)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            
           
            }
             auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
        }
        else if ( "atk".equals(caraObtenida7)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida7)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida7)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        
        }
        else if ( "mag".equals(caraObtenida7)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        
        }
    
         System.out.println("Se obtuvo: "+caraObtenida7);
         
        
        BotonDetener6.setEnabled(false);
    }
    public void mostrarCarasObtenidas7(int num1){        //metabee
        
        DadoB cara4 = new DadoB();
        lblDado5.setText(String.valueOf(cara4.Dado8(num1)));
       
        caraObtenida8 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida8)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
               
               auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
        }
        else if ( "atk".equals(caraObtenida8)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
            
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
        
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        }
        else if ( "inv".equals(caraObtenida8)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida8)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
           auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        
        }
        else if ( "mag".equals(caraObtenida8)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        
        }
    
         System.out.println("Se obtuvo: "+caraObtenida8);
         
        
        BotonDetener7.setEnabled(false);
    }
    
    public void mostrarCarasObtenidas8(int num1){ //mago del tiempo
        
        DadoB cara1 = new DadoB(); 
        lblDado5.setText(String.valueOf(cara1.Dado1(num1)));
       
        caraObtenida9 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida9)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
               auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
        
        }
        else if ( "atk".equals(caraObtenida9)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
            
             for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida9)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
            
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
       else  if ( "tramp".equals(caraObtenida9)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        
        }
        else if ( "mag".equals(caraObtenida9)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
           auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        
        }
    
        System.out.println("Se obtuvo: "+caraObtenida9);
         
        
        BotonDetener8.setEnabled(false);
    }
    
    public void mostrarCarasObtenidas9(int num1){  //guardian celta 
        
        DadoB cara2 = new DadoB();
        lblDado5.setText(String.valueOf(cara2.Dado2(num1)));
        
        
        caraObtenida10 = (lblDado5.getText());
        if ( "mov".equals(caraObtenida10)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            
            }
        
            auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
        }
       else  if ( "atk".equals(caraObtenida10)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
              for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida10)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida10)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        
        }
        else if ( "mag".equals(caraObtenida10)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            
        auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        }
        
        System.out.println("Se obtuvo: "+caraObtenida10);
         
        
        BotonDetener9.setEnabled(false);
    }
    public void mostrarCarasObtenidas10(int num1){ // charizard
        
        DadoB cara3 = new DadoB(); 
        lblDado5.setText(String.valueOf(cara3.Dado3(num1)));
       
        caraObtenida11 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida11)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }

            }
           auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
        }
       else  if ( "atk".equals(caraObtenida11)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida11)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
       else  if ( "tramp".equals(caraObtenida11)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        
        }
        else if ( "mag".equals(caraObtenida11)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
        auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        }
    
         System.out.println("Se obtuvo: "+caraObtenida11);
         
        
        BotonDetener10.setEnabled(false);
    }
    public void mostrarCarasObtenidas11(int num1){        // maga oscura
        
        DadoB cara4 = new DadoB();
        lblDado5.setText(String.valueOf(cara4.Dado4(num1)));
       
        caraObtenida12 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida12)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            
            }
            
            

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
        }
        else if ( "atk".equals(caraObtenida12)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
       else  if ( "inv".equals(caraObtenida12)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida12)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
            auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        }
        else if ( "mag".equals(caraObtenida12)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
           auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        
        }
    
         System.out.println("Se obtuvo: "+caraObtenida12);
         
        
        BotonDetener11.setEnabled(false);
    }
    
    public void mostrarCarasObtenidas12(int num1){            // slifer
        
        DadoB cara1 = new DadoB(); 
        lblDado5.setText(String.valueOf(cara1.Dado5(num1)));
       
        caraObtenida13 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida13)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
           
            auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
            
        }
        else if ( "atk".equals(caraObtenida13)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida13)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida13)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
            
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
        auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        }
       else  if ( "mag".equals(caraObtenida13)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        
        }
    
        System.out.println("Se obtuvo: "+caraObtenida13);
         
        
        BotonDetener12.setEnabled(false);
    }
    
    public void mostrarCarasObtenidas13(int num1){  // mewtwo
        
        DadoB cara2 = new DadoB();
        lblDado5.setText(String.valueOf(cara2.Dado6(num1)));
        
        caraObtenida14 = (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida14)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            
            }
           
            
            auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
        }
        else if ( "atk".equals(caraObtenida14)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida14)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida14)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
           auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        
        }
        else if ( "mag".equals(caraObtenida14)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
            
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
        auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        }
        
        System.out.println("Se obtuvo: "+caraObtenida14);
         
        
        BotonDetener13.setEnabled(false);
    }
    public void mostrarCarasObtenidas14(int num1){ // garurumon
        
        DadoB cara3 = new DadoB(); 
        lblDado1.setText(String.valueOf(cara3.Dado7(num1)));
       
        caraObtenida15= (lblDado5.getText());
        
        if ( "mov".equals(caraObtenida15)){
           
            ImageIcon imagenmov;
       
            imagenmov= null;
            imagenmov = new ImageIcon("src\\Imagenes\\mov.png");
       
            lblDado1.setIcon(imagenmov);
            for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            
           
            }
             auxMov = auxMov + contadorMov;

               System.out.println("valor mov es igual a "+auxMov);

            
               jlabelmov1.setText(String.valueOf(auxMov));
               BotonMover1.setEnabled(true);
        }
        else if ( "atk".equals(caraObtenida15)){
           
            ImageIcon imagenatk;
       
            imagenatk= null;
            imagenatk = new ImageIcon("src\\Imagenes\\atk.png");
       
            lblDado1.setIcon(imagenatk);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          
               auxAtk = auxAtk + contadorAtk;

               System.out.println("valor atk es igual a "+auxAtk);

            
              jlabelatk1.setText(String.valueOf(auxAtk));
        
        }
        else if ( "inv".equals(caraObtenida15)){
           
            ImageIcon imageninv;
       
            imageninv= null;
            imageninv = new ImageIcon("src\\Imagenes\\inv.png");
       
            lblDado1.setIcon(imageninv);
           for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            MatrizTablero[i][j].boton.addActionListener(this);
            }
            }
        }
        else if ( "tramp".equals(caraObtenida15)){
           
            ImageIcon imagentramp;
       
            imagentramp= null;
            imagentramp= new ImageIcon("src\\Imagenes\\tramp.png");
       
            lblDado1.setIcon(imagentramp);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          auxTramp = auxTramp + contadorTramp;

               System.out.println("valor tramp es igual a "+auxTramp);

            
              jlabeltramp1.setText(String.valueOf(auxTramp));
        
        }
        else if ( "mag".equals(caraObtenida15)){
           
            ImageIcon imagenmag;
       
            imagenmag= null;
            imagenmag = new ImageIcon("src\\Imagenes\\mag.png");
       
            lblDado1.setIcon(imagenmag);
               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
            
            MatrizTablero[i][j].boton.removeActionListener(this);
            }
            }
          auxMag = auxMag + contadorMag;

               System.out.println("valor mag es igual a "+auxMag);

            
              jlabelmag1.setText(String.valueOf(auxMag));
          
        
        }
    
         System.out.println("Se obtuvo: "+caraObtenida15);
         
        
        BotonDetener14.setEnabled(false);
    }
     
    public void subActionPerformed1(int i ,int j, ActionEvent e)//mago oscuro
    {
        System.out.println("cara obtenida es igual a "+caraObtenida1);
                    System.out.println("salió inovocación...elija posición de invocación"); 
                    System.out.println("invoco al mago oscuro");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida1) && MatrizTablero[i][j].boton.getText()==null && !"1".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion1(MatrizTablero[i][j]);
                                    
                                   
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(lblDado5.getText()) && terreno==null /**&& !"1".equals(terreno)**/){
                              
                                    invocacion1(MatrizTablero[i][j]);
                                  
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                              
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                            
                                   invocacion1(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                               
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                               
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                            
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                               
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                            
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                            
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                               
                                   invocacion1(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                             
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                               
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                               
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                               
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                    
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton   && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                               
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                   invocacion1(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                   invocacion1(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida1)){
                                
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
        
    }

    
    public void subActionPerformed2(int i ,int j, ActionEvent e)//goblin 
    {
        System.out.println("cara obtenida es igual a "+caraObtenida2);
                    System.out.println("salió inovocación...elija posición de invocación");            // goblin
                    System.out.println("invoco a goblin");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2) && MatrizTablero[i][j].boton.getText()==null && !"2".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText()) ){
                                    
                                   
                                    invocacion2(MatrizTablero[i][j]);
                                    
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                              
                                    invocacion2(MatrizTablero[i][j]);
                                  
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                              
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                            
                                   invocacion2(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                               
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                               
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                            
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                               
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                            
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                            
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                               
                                   invocacion2(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                             
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                               
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                               
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                               
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                               
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                   invocacion2(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                   invocacion2(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida2)){
                                
                                    invocacion2(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
    }
    
    
    public void subActionPerformed3(int i,int j, ActionEvent e)//orco
    {
         System.out.println("cara obtenida es igual a "+caraObtenida3);
                    System.out.println("salió inovocación...elija posición de invocación");      // orco
                    System.out.println("invoco a orco");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida3)&& MatrizTablero[i][j].boton.getText()==null && !"3".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion3(MatrizTablero[i][j]);
                                   
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida3)){
                              
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida3)){
                              
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                            
                                   invocacion3(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                               
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                               
                                    invocacion3(MatrizTablero[i][j]);    
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                            
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                               
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                            
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                            
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                               
                                   invocacion3(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                             
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                               
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                               
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                               
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                               
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                   invocacion3(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                   invocacion3(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)){
                                
                                    invocacion3(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
    }
    
    
    public void subActionPerformed4(int i, int j, ActionEvent e)//pikachu
    {
        System.out.println("salió inovocación...elija posición de invocación"); // pikachu
                    System.out.println("invoco a pikachu");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4) && MatrizTablero[i][j].boton.getText()==null && !"4".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion4(MatrizTablero[i][j]);
                                    
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                              
                                    invocacion4(MatrizTablero[i][j]);
                                 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                              
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                            
                                   invocacion4(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                               
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                               
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                            
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                               
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                            
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                            
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                               
                                   invocacion4(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                             
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                               
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                               
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                               
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                               
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                   invocacion4(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                   invocacion4(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)){
                                
                                    invocacion4(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
               }
           
    public void subActionPerformed5(int i, int j, ActionEvent e)//kuriboh
     {System.out.println("salió inovocación...elija posición de invocación");
                    System.out.println("invoco a kuriboh");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)&& MatrizTablero[i][j].boton.getText()==null && !"5".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion5(MatrizTablero[i][j]);
                                 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                              
                                    invocacion1(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                              
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                            
                                   invocacion5(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                               
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                               
                                    invocacion5(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                            
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                               
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                            
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                            
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                               
                                   invocacion5(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                             
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                               
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                               
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                               
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                               
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                   invocacion5(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                   invocacion5(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)){
                                
                                    invocacion5(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
                }
     
    public void subActionPerformed6(int i, int j, ActionEvent e)//agumon 
    { System.out.println("salió inovocación...elija posición de invocación");            // agumon
                    System.out.println("invoco a agumon");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6) && MatrizTablero[i][j].boton.getText()==null && !"6".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion6(MatrizTablero[i][j]);
                                   
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                              
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                              
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                            
                                   invocacion6(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                               
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                               
                                    invocacion6(MatrizTablero[i][j]);    
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                            
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                               
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                            
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                            
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                               
                                   invocacion6(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                             
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                               
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                               
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                               
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                               
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                   invocacion6(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                   invocacion6(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)){
                                
                                    invocacion6(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
                }
    
    public void subActionPerformed7(int i, int j, ActionEvent e) //dboa
    { System.out.println("salió inovocación...elija posición de invocación");      // dboa
                    System.out.println("invoco al dragón blanco de ojos azules");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7) && MatrizTablero[i][j].boton.getText()==null && !"7".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion7(MatrizTablero[i][j]);
                                   
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                              
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                              
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                            
                                   invocacion7(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                               
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                               
                                    invocacion7(MatrizTablero[i][j]);   
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                            
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                               
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                            
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                            
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                               
                                   invocacion7(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                             
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                               
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                               
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                               
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                               
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                   invocacion7(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                   invocacion7(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)){
                                
                                    invocacion7(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
                }
    
    public void subActionPerformed8(int i, int j, ActionEvent e)//metabee
    {System.out.println("salió inovocación...elija posición de invocación"); // metabee
                    System.out.println("invoco a metabee");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8) && MatrizTablero[i][j].boton.getText()==null && !"8".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion8(MatrizTablero[i][j]);
                                  
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                              
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                              
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                            
                                   invocacion8(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                               
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                               
                                    invocacion8(MatrizTablero[i][j]);   
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                            
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                               
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                            
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                            
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                               
                                   invocacion8(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                             
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                               
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                               
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                               
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                               
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                   invocacion8(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                   invocacion8(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)){
                                
                                    invocacion8(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
                }
    
    public void subActionPerformed9(int i, int j, ActionEvent e) //mago del tiempo
    { System.out.println("cara obtenida es igual a "+caraObtenida9);
                    System.out.println("salió inovocación...elija posición de invocación"); 
                    System.out.println("invoco al mago deltiempo");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9) && MatrizTablero[i][j].boton.getText()==null && !"9".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                   
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                  if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                               if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                               if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                               if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                               if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                               if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                               if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)){
                                    
                                   
                                    invocacion9(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
                }
    
    public void subActionPerformed10(int i, int j, ActionEvent e) // guardian celta
   {System.out.println("cara obtenida es igual a "+caraObtenida10);
                    System.out.println("salió inovocación...elija posición de invocación");            // guardian celta
                    System.out.println("invoco al guardián celta");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10)&& MatrizTablero[i][j].boton.getText()==null && !"10".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText()) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                               if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);   
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                               if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                               if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida10) ){
                                    
                                   
                                    invocacion10(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
                }
    
    public void subActionPerformed11(int i, int j, ActionEvent e) // charizard 
    {System.out.println("cara obtenida es igual a "+caraObtenida11);
                    System.out.println("salió inovocación...elija posición de invocación");      // charizard
                    System.out.println("invoco a charizard");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11) && MatrizTablero[i][j].boton.getText()==null && !"11".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                   
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                   if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                               if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton  && "inv".equals(caraObtenida11)){
                                    
                                   
                                    invocacion11(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
                }
    
    public void subActionPerformed12(int i, int j, ActionEvent e) //  maga oscura
    {System.out.println("cara obtenida es igual a "+caraObtenida12);
                    System.out.println("salió inovocación...elija posición de invocación"); // maga oscura
                    System.out.println("invoco a la maga oscura");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)&& MatrizTablero[i][j].boton.getText()==null && !"12".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]); 
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                               if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)){
                                    
                                   
                                    invocacion12(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
                }
    
    public void subActionPerformed13(int i, int j, ActionEvent e) // slifer
    {System.out.println("salió inovocación...elija posición de invocación");
                    System.out.println("invoco a slifer el dios del cielo");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)&& MatrizTablero[i][j].boton.getText()==null && !"13".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                  
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);   
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)){
                                    
                                   
                                    invocacion13(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
                }
    
    public void subActionPerformed14(int i, int j, ActionEvent e) // mewtwo
    {System.out.println("salió inovocación...elija posición de invocación");            //  mewtwo
                    System.out.println("invoco a mewtwo");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)&& MatrizTablero[i][j].boton.getText()==null && !"14".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);   
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                               if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)){
                                    
                                   
                                    invocacion14(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
                }
    
    public void subActionPerformed15(int i, int j, ActionEvent e) // garurumon
    {System.out.println("salió inovocación...elija posición de invocación");      // garurumon
                    System.out.println("invoco a garurumon");
                    System.out.println("Se presionó: "+i+","+j);
                
                    int ocupa= BoxForma.getSelectedIndex();
                    int rotado = BoxRotar.getSelectedIndex();
                
                        switch (ocupa) {
                            case 0:
                                switch (rotado){
                                    case 0:
                           
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15) && MatrizTablero[i][j].boton.getText()==null && !"15".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                   
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);                         
                                    }       
                                break;
                                
                                    case 1:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    }       
                                break;
                                
                                    case 2:
                                        
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }      
                                break;
                                
                                    case 3:
                                    if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    }       
                                break; 
                        
                        
                                                                                     
                                } 
                        break;
                    
                        case 1:
                                switch (rotado){
                                    case 0:
                                        
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                
                                break;
                                
                                    case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);   
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                 
                                
                                }
                                break;  
                            
                                    case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }
                                break;
                                
                                    case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }
                                break;
                                
                        
                                }   
                        break;
                       
                        
                        case 2:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-2][j-1]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                                                      
                            } 
                            break;
                        
                        case 3:
                            switch (rotado){
                                
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                }       
                                break;
                                
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j+1]);  
                                }       
                                break; 
                            } 
                        
                            break;
                            
                        case 4:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                                    
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                        
                        break;
                        
                        case 5:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i][j+3]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+3][j]);
                                }      
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i][j-3]);
                                }     
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-3][j]);
                                
                                }       
                                break; 
                            } 
                            break;
                        case 6:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-1][j+2]); 
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 7:
                            switch (rotado){
                                case 0:
                                 if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i+1][j+2]);
                                 }       
                                 break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i+2][j-1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i-1][j-2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i-2][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 8:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                    despliegue(MatrizTablero[i-1][j+2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+2][j+1]);
                                }       
                                break;
                                
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i][j-2]);
                                    despliegue(MatrizTablero[i+1][j-2]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                }       
                                break;
                                
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                    despliegue(MatrizTablero[i-1][j]);
                                    despliegue(MatrizTablero[i-2][j]);
                                    despliegue(MatrizTablero[i-2][j-1]);
                                }       
                                break; 
                            } 
                            break;
                        
                        case 9:
                            switch (rotado){
                                case 0:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j+1]);
                                   despliegue(MatrizTablero[i][j-1]);
                                   despliegue(MatrizTablero[i+1][j-1]);
                                   despliegue(MatrizTablero[i][j-2]);
                                }       
                                break;
                            
                                case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                   despliegue(MatrizTablero[i-1][j]);
                                   despliegue(MatrizTablero[i-1][j-1]);
                                   despliegue(MatrizTablero[i-2][j]);
                                   despliegue(MatrizTablero[i][j+1]);
                                   despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break;
                            
                                case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+1][j-1]);
                                    despliegue(MatrizTablero[i-1][j+1]);
                                    despliegue(MatrizTablero[i][j+1]);
                                    despliegue(MatrizTablero[i][j+2]);
                                }       
                                break;
                            
                                case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)){
                                    
                                   
                                    invocacion15(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j]);
                                    despliegue(MatrizTablero[i][j-1]);
                                    despliegue(MatrizTablero[i-1][j-1]);
                                    despliegue(MatrizTablero[i+1][j]);
                                    despliegue(MatrizTablero[i+2][j]);
                                    despliegue(MatrizTablero[i+1][j+1]);
                                }       
                                break; 
                            } 
                            break;
                        default: 
                        }
                }
   
    @Override
    public void actionPerformed(ActionEvent e) {
   
            for(int i=0; i<15;i++) // recorrer columnas 
            {
            for(int j=0; j<15;j++) // recorrer filas
            {
           
                if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida1) && MatrizTablero[i][j].boton.getText() == null && !"1".equals(MatrizTablero[i][j].boton.getText())&& !"terreno".equals(MatrizTablero[i][j].boton.getText())){ //mago oscuro
                    subActionPerformed1(i,j,e);
                }
                   
           
                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida2) && MatrizTablero[i][j].boton.getText()==null && !"2".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){//goblin
                    subActionPerformed2(i,j,e);
                }
            
                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida3)&& MatrizTablero[i][j].boton.getText()==null && !"3".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){//orco
                    subActionPerformed3(i,j,e);
                   
                }
    
                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida4)&& MatrizTablero[i][j].boton.getText()==null && !"4".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){//pikachu
                     subActionPerformed4(i,j,e);
                    
                }

                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida5)&& MatrizTablero[i][j].boton.getText()==null && !"5".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){// kuriboh 
                    subActionPerformed5(i,j,e);
                }
                    
     
                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida6)&& MatrizTablero[i][j].boton.getText()==null && !"6".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){//agumon
                    subActionPerformed6(i,j,e);
                }

                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida7)&& MatrizTablero[i][j].boton.getText()==null && !"7".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){ // dboa
                    subActionPerformed7(i,j,e);
                }
 
                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida8)&& MatrizTablero[i][j].boton.getText()==null && !"8".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){  // metabee             
                subActionPerformed8(i,j,e);
                    
                }
               
                
                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida9)&& MatrizTablero[i][j].boton.getText()==null && !"9".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){ //mago del tiempo
                   subActionPerformed9(i,j,e);
 
                }

                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida10)&& MatrizTablero[i][j].boton.getText()==null && !"10".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){// guardian celta
                    
                     subActionPerformed10(i,j,e);
                     
                }

                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida11)&& MatrizTablero[i][j].boton.getText()==null && !"11".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){  // charizard
                    subActionPerformed11(i,j,e);
                    
                }
    
                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida12)&& MatrizTablero[i][j].boton.getText()==null && !"12".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){  // maga oscura
                    subActionPerformed12(i,j,e);
                    
                }

                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida13)&& MatrizTablero[i][j].boton.getText()==null && !"13".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){// slifer                  
                    subActionPerformed13(i,j,e);

                }
     
                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida14)&& MatrizTablero[i][j].boton.getText()==null && !"14".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){ //  mewtwo
                    subActionPerformed14(i,j,e);
                    
                }

                else if(e.getSource()==MatrizTablero[i][j].boton && "inv".equals(caraObtenida15)&& MatrizTablero[i][j].boton.getText()==null && !"15".equals(MatrizTablero[i][j].boton.getText()) && !"terreno".equals(MatrizTablero[i][j].boton.getText())){  // garurumon
                    
                    subActionPerformed15(i,j,e);
                    
                }
          

                else if (!"inv".equals(caraObtenida1)){

                        MatrizTablero[i][j].boton.removeActionListener(this);

        }
        
                else if (!"inv".equals(caraObtenida2)){

                        MatrizTablero[i][j].boton.removeActionListener(this);
   
        }
                else if (!"inv".equals(caraObtenida3)){

                      MatrizTablero[i][j].boton.removeActionListener(this);  
        
        }
                else if (!"inv".equals(caraObtenida4)){

                        MatrizTablero[i][j].boton.removeActionListener(this);
        }
                else if (!"inv".equals(caraObtenida5)){
 

                        MatrizTablero[i][j].boton.removeActionListener(this);

        }
                else if (!"inv".equals(caraObtenida6)){

                        MatrizTablero[i][j].boton.removeActionListener(this);

        }
                else if (!"inv".equals(caraObtenida7)){

                        MatrizTablero[i][j].boton.removeActionListener(this);

        }
                else if (!"inv".equals(caraObtenida8)){

                        MatrizTablero[i][j].boton.removeActionListener(this);
        }
   
                else if (!"inv".equals(caraObtenida9)){

                        MatrizTablero[i][j].boton.removeActionListener(this);
        }
                else if (!"inv".equals(caraObtenida10)){

                        MatrizTablero[i][j].boton.removeActionListener(this);
        }
                else if (!"inv".equals(caraObtenida11)){
       
                        MatrizTablero[i][j].boton.removeActionListener(this);
        }
                else if (!"inv".equals(caraObtenida12)){
        
                        MatrizTablero[i][j].boton.removeActionListener(this);
        }
                else if (!"inv".equals(caraObtenida13)){
       
                        MatrizTablero[i][j].boton.removeActionListener(this);
        }
                else if (!"inv".equals(caraObtenida14)){
     
                        MatrizTablero[i][j].boton.removeActionListener(this);
  
        }
                else if (!"inv".equals(caraObtenida15)){
      
                        MatrizTablero[i][j].boton.removeActionListener(this);
  
        }

            if(e.getSource()== MatrizTablero[i][j].boton && "ocupado".equals(MatrizTablero[i][j].boton.getText()) && auxMov >0 && MatrizTablero[i][j].boton.getText()!= null ){
                               
                 System.out.println(" boton funciona! " + terreno);
                                    
                                    MatrizTablero[i][j].boton.setText(MatrizTablero[i][j+1].boton.getText());
                                      
                                      MatrizTablero[i][j].boton.setIcon(MatrizTablero[i][j+1].boton.getIcon());
                                       
                                      MatrizTablero[i][j+1].boton.setText("ocupado");
                                      
        
                                            MatrizTablero[i][j+1].boton.setIcon(null);
                                              
                                            auxMov = auxMov - 1; 
                                            jlabelmov1.setText(String.valueOf(auxMov));}  
                                            
            if (e.getSource()== MatrizTablero[i][j].boton && MatrizTablero[i][j].boton.getText() == null ) {
                 
                System.out.println(" el terreno está " );
            
            MatrizTablero[i][j].boton.setText(null);
             MatrizTablero[i][j].boton.setIcon(null);  
             
                                            
            } else if (auxMov == 0){BotonMover1.setEnabled(false);} 
           
                                             
                                        
             }
                                      

            }
            }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TABLERO = new javax.swing.JPanel();
        BoxDado11 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        BotonAtacar1 = new javax.swing.JButton();
        BotonMover1 = new javax.swing.JButton();
        BotonTrampa1 = new javax.swing.JComboBox<>();
        BotonMagia1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonFinalizar = new javax.swing.JButton();
        BotonMover5 = new javax.swing.JButton();
        BotonMover6 = new javax.swing.JButton();
        BotonMover7 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        Dado21 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        BotonMagia2 = new javax.swing.JComboBox<>();
        BotonAtacar2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotonTrampa2 = new javax.swing.JComboBox<>();
        BotonFinalizar2 = new javax.swing.JButton();
        BotonMover11 = new javax.swing.JButton();
        BotonMover8 = new javax.swing.JButton();
        BotonMover10 = new javax.swing.JButton();
        BotonMover9 = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        PanelAcciones2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        Dado31 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BotonMagia3 = new javax.swing.JComboBox<>();
        BotonTrampa3 = new javax.swing.JComboBox<>();
        BotonAtacar3 = new javax.swing.JButton();
        BotonMover3 = new javax.swing.JButton();
        BotonFinalizar3 = new javax.swing.JButton();
        Dado41 = new javax.swing.JComboBox<>();
        jProgressBar4 = new javax.swing.JProgressBar();
        jPanel9 = new javax.swing.JPanel();
        BotonAtacar4 = new javax.swing.JButton();
        BotonMover4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        BotonTrampa4 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        BotonMagia4 = new javax.swing.JComboBox<>();
        BotonFinalizar4 = new javax.swing.JButton();
        BoxForma = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        BoxRotar = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lblDado5 = new javax.swing.JLabel();
        lblDado1 = new javax.swing.JLabel();
        PanelAcciones1 = new javax.swing.JPanel();
        jlabelatk1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jlabelmag1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jlabeltramp1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jlabelmov1 = new javax.swing.JLabel();
        PanelAcciones5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        PanelAcciones6 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        numeroturno = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jlabeljugadorActual = new javax.swing.JLabel();
        BotonDetener30 = new javax.swing.JButton();
        BotonDetener31 = new javax.swing.JButton();
        BotonDetener32 = new javax.swing.JButton();
        BotonDetener33 = new javax.swing.JButton();
        BotonDetener34 = new javax.swing.JButton();
        BotonDetener35 = new javax.swing.JButton();
        BotonDetener36 = new javax.swing.JButton();
        BotonDetener37 = new javax.swing.JButton();
        BotonDetener38 = new javax.swing.JButton();
        BotonDetener39 = new javax.swing.JButton();
        BotonDetener40 = new javax.swing.JButton();
        BotonDetener41 = new javax.swing.JButton();
        BotonDetener42 = new javax.swing.JButton();
        BotonDetener43 = new javax.swing.JButton();
        BotonDetener44 = new javax.swing.JButton();
        BotonDetener45 = new javax.swing.JButton();
        BotonDetener46 = new javax.swing.JButton();
        BotonDetener47 = new javax.swing.JButton();
        BotonDetener48 = new javax.swing.JButton();
        BotonDetener49 = new javax.swing.JButton();
        BotonDetener50 = new javax.swing.JButton();
        BotonDetener51 = new javax.swing.JButton();
        BotonDetener52 = new javax.swing.JButton();
        BotonDetener53 = new javax.swing.JButton();
        BotonDetener54 = new javax.swing.JButton();
        BotonDetener55 = new javax.swing.JButton();
        BotonDetener56 = new javax.swing.JButton();
        BotonDetener57 = new javax.swing.JButton();
        BotonDetener58 = new javax.swing.JButton();
        BotonDetener59 = new javax.swing.JButton();
        BotonDetener = new javax.swing.JButton();
        BotonDetener1 = new javax.swing.JButton();
        BotonDetener2 = new javax.swing.JButton();
        BotonDetener3 = new javax.swing.JButton();
        BotonDetener4 = new javax.swing.JButton();
        BotonDetener5 = new javax.swing.JButton();
        BotonDetener6 = new javax.swing.JButton();
        BotonDetener7 = new javax.swing.JButton();
        BotonDetener8 = new javax.swing.JButton();
        BotonDetener9 = new javax.swing.JButton();
        BotonDetener10 = new javax.swing.JButton();
        BotonDetener11 = new javax.swing.JButton();
        BotonDetener12 = new javax.swing.JButton();
        BotonDetener13 = new javax.swing.JButton();
        BotonDetener14 = new javax.swing.JButton();
        BotonDetener15 = new javax.swing.JButton();
        BotonDetener16 = new javax.swing.JButton();
        BotonDetener17 = new javax.swing.JButton();
        BotonDetener18 = new javax.swing.JButton();
        BotonDetener19 = new javax.swing.JButton();
        BotonDetener20 = new javax.swing.JButton();
        BotonDetener21 = new javax.swing.JButton();
        BotonDetener22 = new javax.swing.JButton();
        BotonDetener23 = new javax.swing.JButton();
        BotonDetener24 = new javax.swing.JButton();
        BotonDetener25 = new javax.swing.JButton();
        BotonDetener26 = new javax.swing.JButton();
        BotonDetener27 = new javax.swing.JButton();
        BotonDetener28 = new javax.swing.JButton();
        BotonDetener29 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TABLERO.setBackground(new java.awt.Color(102, 102, 102));
        TABLERO.setBorder(new javax.swing.border.MatteBorder(null));
        TABLERO.setPreferredSize(new java.awt.Dimension(660, 660));

        javax.swing.GroupLayout TABLEROLayout = new javax.swing.GroupLayout(TABLERO);
        TABLERO.setLayout(TABLEROLayout);
        TABLEROLayout.setHorizontalGroup(
            TABLEROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );
        TABLEROLayout.setVerticalGroup(
            TABLEROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        getContentPane().add(TABLERO, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 524, 524));

        BoxDado11.setBackground(new java.awt.Color(255, 255, 0));
        BoxDado11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mago oscuro", "goblin", "orco", "pikachu", "kuriboh", "agumon", "dragon blanco ojos azules", "metabee", "mago del tiempo", "guardian celta", "charizard", "maga oscura", "slifer", "mewtwo", "garurumon" }));
        BoxDado11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxDado11ActionPerformed(evt);
            }
        });
        getContentPane().add(BoxDado11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, -1));

        jPanel6.setBackground(new java.awt.Color(204, 204, 0));

        BotonAtacar1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonAtacar1.setText("ATACAR");
        BotonAtacar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonAtacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtacar1ActionPerformed(evt);
            }
        });

        BotonMover1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonMover1.setText("UP");
        BotonMover1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonMover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMover1ActionPerformed(evt);
            }
        });

        BotonTrampa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonMagia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TRAMPAS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MAGIAS");

        BotonFinalizar.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonFinalizar.setText("FINALIZAR");
        BotonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalizarActionPerformed(evt);
            }
        });

        BotonMover5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonMover5.setText("LEFT");
        BotonMover5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonMover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMover5ActionPerformed(evt);
            }
        });

        BotonMover6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonMover6.setText("RIGHT");
        BotonMover6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonMover6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMover6ActionPerformed(evt);
            }
        });

        BotonMover7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonMover7.setText("DOWN");
        BotonMover7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonMover7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMover7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BotonAtacar1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonMover7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonMover1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(BotonMover5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonMover6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(BotonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonMagia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonTrampa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(141, 141, 141))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(BotonAtacar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonMover1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(BotonMover5)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(BotonMover6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonMover7)))
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMagia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTrampa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonFinalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, 170));

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 0));
        jProgressBar1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 180, -1));

        Dado21.setBackground(new java.awt.Color(255, 0, 0));
        Dado21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 70, -1));

        jPanel8.setBackground(new java.awt.Color(204, 0, 0));

        BotonMagia2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonAtacar2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonAtacar2.setText("ATACAR");
        BotonAtacar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonAtacar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtacar2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MAGIAS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TRAMPAS");

        BotonTrampa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonFinalizar2.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonFinalizar2.setText("FINALIZAR");
        BotonFinalizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalizar2ActionPerformed(evt);
            }
        });

        BotonMover11.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonMover11.setText("LEFT");
        BotonMover11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonMover11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMover11ActionPerformed(evt);
            }
        });

        BotonMover8.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonMover8.setText("UP");
        BotonMover8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotonMover10.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonMover10.setText("DOWN");
        BotonMover10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonMover10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMover10ActionPerformed(evt);
            }
        });

        BotonMover9.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonMover9.setText("RIGHT");
        BotonMover9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonMover9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMover9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonFinalizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BotonMagia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(BotonTrampa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(BotonAtacar2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonMover10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonMover8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(BotonMover11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonMover9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(BotonAtacar2)
                .addGap(1, 1, 1)
                .addComponent(BotonMover8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(BotonMover11)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(BotonMover9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonMover10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMagia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTrampa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(BotonFinalizar2)
                .addContainerGap())
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 180, 180));

        jProgressBar2.setBackground(new java.awt.Color(204, 0, 0));
        jProgressBar2.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar2.setName(""); // NOI18N
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 180, -1));

        PanelAcciones2.setBackground(new java.awt.Color(204, 0, 0));
        PanelAcciones2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.setOpaque(true);

        jLabel21.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel21.setText("atk");

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel22.setText("mov");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.setOpaque(true);

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel24.setText("tramp");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.setOpaque(true);

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel26.setText("mag");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.setOpaque(true);

        javax.swing.GroupLayout PanelAcciones2Layout = new javax.swing.GroupLayout(PanelAcciones2);
        PanelAcciones2.setLayout(PanelAcciones2Layout);
        PanelAcciones2Layout.setHorizontalGroup(
            PanelAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAcciones2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAcciones2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAcciones2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 11, Short.MAX_VALUE)
                .addGroup(PanelAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAcciones2Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAcciones2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        PanelAcciones2Layout.setVerticalGroup(
            PanelAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAcciones2Layout.createSequentialGroup()
                .addGroup(PanelAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
            .addGroup(PanelAcciones2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(PanelAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelAcciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 180, 60));

        jProgressBar3.setBackground(new java.awt.Color(0, 102, 255));
        jProgressBar3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jProgressBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 180, -1));

        Dado31.setBackground(new java.awt.Color(0, 102, 255));
        Dado31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, 70, -1));

        jPanel7.setBackground(new java.awt.Color(0, 102, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TRAMPAS");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MAGIAS");

        BotonMagia3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonTrampa3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonAtacar3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonAtacar3.setText("ATACAR");
        BotonAtacar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonAtacar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtacar3ActionPerformed(evt);
            }
        });

        BotonMover3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonMover3.setText("MOVER");
        BotonMover3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotonFinalizar3.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonFinalizar3.setText("FINALIZAR");
        BotonFinalizar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalizar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonMover3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAtacar3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BotonTrampa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonMagia3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BotonFinalizar3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(BotonAtacar3)
                .addGap(41, 41, 41)
                .addComponent(BotonMover3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMagia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTrampa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(BotonFinalizar3)
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 180, 170));

        Dado41.setBackground(new java.awt.Color(0, 153, 0));
        Dado41.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 70, -1));

        jProgressBar4.setBackground(new java.awt.Color(0, 153, 0));
        jProgressBar4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jProgressBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 180, -1));

        jPanel9.setBackground(new java.awt.Color(0, 153, 0));

        BotonAtacar4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonAtacar4.setText("ATACAR");
        BotonAtacar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonAtacar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtacar4ActionPerformed(evt);
            }
        });

        BotonMover4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        BotonMover4.setText("MOVER");
        BotonMover4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TRAMPAS");

        BotonTrampa4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MAGIAS");

        BotonMagia4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonFinalizar4.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonFinalizar4.setText("FINALIZAR");
        BotonFinalizar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalizar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonTrampa4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMagia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonMover4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonAtacar4, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BotonFinalizar4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BotonAtacar4)
                .addGap(18, 18, 18)
                .addComponent(BotonMover4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMagia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTrampa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BotonFinalizar4)
                .addContainerGap())
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 180, 180));

        BoxForma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10" }));
        BoxForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxFormaActionPerformed(evt);
            }
        });
        getContentPane().add(BoxForma, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 620, -1, -1));

        jLabel11.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ROTAR");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 580, -1, 20));

        BoxRotar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(BoxRotar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 620, -1, -1));

        jLabel6.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("dados");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 70, 20));

        lblDado5.setBackground(new java.awt.Color(255, 255, 0));
        lblDado5.setFont(new java.awt.Font("Engravers MT", 3, 10)); // NOI18N
        lblDado5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDado5.setToolTipText("");
        lblDado5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lblDado5.setName(""); // NOI18N
        lblDado5.setOpaque(true);
        lblDado5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblDado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 80, 30));

        lblDado1.setBackground(new java.awt.Color(255, 255, 0));
        lblDado1.setFont(new java.awt.Font("Engravers MT", 3, 14)); // NOI18N
        lblDado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDado1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        lblDado1.setName(""); // NOI18N
        lblDado1.setOpaque(true);
        getContentPane().add(lblDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 80, 70));

        PanelAcciones1.setBackground(new java.awt.Color(204, 204, 0));
        PanelAcciones1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlabelatk1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelatk1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlabelatk1.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel13.setText("atk");

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel14.setText("tramp");

        jlabelmag1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelmag1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlabelmag1.setOpaque(true);

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel16.setText("mag");

        jlabeltramp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabeltramp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlabeltramp1.setOpaque(true);

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel18.setText("mov");

        jlabelmov1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelmov1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlabelmov1.setOpaque(true);

        javax.swing.GroupLayout PanelAcciones1Layout = new javax.swing.GroupLayout(PanelAcciones1);
        PanelAcciones1.setLayout(PanelAcciones1Layout);
        PanelAcciones1Layout.setHorizontalGroup(
            PanelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAcciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAcciones1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabeltramp1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAcciones1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlabelatk1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAcciones1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabelmag1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAcciones1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabelmov1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        PanelAcciones1Layout.setVerticalGroup(
            PanelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAcciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jlabelmov1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlabelatk1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAcciones1Layout.createSequentialGroup()
                        .addGroup(PanelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jlabeltramp1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAcciones1Layout.createSequentialGroup()
                        .addGroup(PanelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlabelmag1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(3, 3, 3))))
        );

        getContentPane().add(PanelAcciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 180, 60));

        PanelAcciones5.setBackground(new java.awt.Color(0, 102, 255));
        PanelAcciones5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel28.setOpaque(true);

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel29.setText("atk");

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel30.setText("tramp");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel31.setOpaque(true);

        jLabel32.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel32.setText("mag");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel33.setOpaque(true);

        jLabel34.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel34.setText("mov");

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel35.setOpaque(true);

        javax.swing.GroupLayout PanelAcciones5Layout = new javax.swing.GroupLayout(PanelAcciones5);
        PanelAcciones5.setLayout(PanelAcciones5Layout);
        PanelAcciones5Layout.setHorizontalGroup(
            PanelAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAcciones5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAcciones5Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAcciones5Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAcciones5Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAcciones5Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        PanelAcciones5Layout.setVerticalGroup(
            PanelAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAcciones5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAcciones5Layout.createSequentialGroup()
                        .addGroup(PanelAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAcciones5Layout.createSequentialGroup()
                        .addGroup(PanelAcciones5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(3, 3, 3))))
        );

        getContentPane().add(PanelAcciones5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 180, 60));

        PanelAcciones6.setBackground(new java.awt.Color(0, 153, 0));
        PanelAcciones6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel36.setOpaque(true);

        jLabel37.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel37.setText("atk");

        jLabel38.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel38.setText("tramp");

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel39.setOpaque(true);

        jLabel40.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel40.setText("mag");

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel41.setOpaque(true);

        jLabel42.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel42.setText("mov");

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel43.setOpaque(true);

        javax.swing.GroupLayout PanelAcciones6Layout = new javax.swing.GroupLayout(PanelAcciones6);
        PanelAcciones6.setLayout(PanelAcciones6Layout);
        PanelAcciones6Layout.setHorizontalGroup(
            PanelAcciones6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAcciones6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAcciones6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAcciones6Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAcciones6Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAcciones6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAcciones6Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAcciones6Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        PanelAcciones6Layout.setVerticalGroup(
            PanelAcciones6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAcciones6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAcciones6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAcciones6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAcciones6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAcciones6Layout.createSequentialGroup()
                        .addGroup(PanelAcciones6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAcciones6Layout.createSequentialGroup()
                        .addGroup(PanelAcciones6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addGap(3, 3, 3))))
        );

        getContentPane().add(PanelAcciones6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 180, 60));

        jLabel12.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("FORMA");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 580, 70, 20));

        jLabel44.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("dados");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, 70, 20));

        jLabel45.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 204, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("dados");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 310, 70, 20));

        jLabel46.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 204, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("dados");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 20));

        numeroturno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroturno.setOpaque(true);
        getContentPane().add(numeroturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 50, 20));

        jLabel48.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 204, 0));
        jLabel48.setText("N° TURNO");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 70, 20));

        jLabel49.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(204, 204, 0));
        jLabel49.setText("Turno del jugador:");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 130, 20));

        jlabeljugadorActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabeljugadorActual.setOpaque(true);
        getContentPane().add(jlabeljugadorActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 50, 20));

        BotonDetener30.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener30.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener30.setText("1");
        BotonDetener30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener30ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener30, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 50, 20));

        BotonDetener31.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener31.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener31.setText("2");
        BotonDetener31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener31ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener31, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 50, -1));

        BotonDetener32.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener32.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener32.setText("3");
        BotonDetener32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener32ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener32, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, 50, -1));

        BotonDetener33.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener33.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener33.setText("4");
        BotonDetener33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener33ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener33, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 50, -1));

        BotonDetener34.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener34.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener34.setText("5");
        BotonDetener34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener34ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener34, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 50, -1));

        BotonDetener35.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener35.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener35.setText("6");
        BotonDetener35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener35ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener35, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 50, -1));

        BotonDetener36.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener36.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener36.setText("7");
        BotonDetener36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener36ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener36, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 50, -1));

        BotonDetener37.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener37.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener37.setText("8");
        BotonDetener37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener37ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener37, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, 50, -1));

        BotonDetener38.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener38.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener38.setText("9");
        BotonDetener38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener38ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener38, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 50, 20));

        BotonDetener39.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener39.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener39.setText("10");
        BotonDetener39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener39ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener39, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 50, 20));

        BotonDetener40.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener40.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener40.setText("11");
        BotonDetener40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener40ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener40, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, 50, 20));

        BotonDetener41.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener41.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener41.setText("12");
        BotonDetener41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener41ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener41, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 50, 20));

        BotonDetener42.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener42.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener42.setText("13");
        BotonDetener42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener42ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener42, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 660, 50, 20));

        BotonDetener43.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener43.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener43.setText("14");
        BotonDetener43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener43ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener43, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, 50, 20));

        BotonDetener44.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener44.setForeground(new java.awt.Color(0, 102, 255));
        BotonDetener44.setText("15");
        BotonDetener44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener44ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener44, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 680, 50, 20));

        BotonDetener45.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener45.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener45.setText("1");
        BotonDetener45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener45ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener45, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 50, 20));

        BotonDetener46.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener46.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener46.setText("2");
        BotonDetener46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener46ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener46, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, 50, -1));

        BotonDetener47.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener47.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener47.setText("3");
        BotonDetener47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener47ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener47, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, 50, -1));

        BotonDetener48.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener48.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener48.setText("4");
        BotonDetener48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener48ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener48, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, 50, -1));

        BotonDetener49.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener49.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener49.setText("5");
        BotonDetener49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener49ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener49, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, 50, -1));

        BotonDetener50.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener50.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener50.setText("6");
        BotonDetener50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener50ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener50, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 50, -1));

        BotonDetener51.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener51.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener51.setText("7");
        BotonDetener51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener51ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener51, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 600, 50, -1));

        BotonDetener52.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener52.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener52.setText("8");
        BotonDetener52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener52ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener52, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, 50, -1));

        BotonDetener53.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener53.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener53.setText("9");
        BotonDetener53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener53ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener53, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, 50, 20));

        BotonDetener54.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener54.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener54.setText("10");
        BotonDetener54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener54ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener54, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 620, 50, 20));

        BotonDetener55.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener55.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener55.setText("11");
        BotonDetener55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener55ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener55, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, 50, 20));

        BotonDetener56.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener56.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener56.setText("12");
        BotonDetener56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener56ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener56, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 640, 50, 20));

        BotonDetener57.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener57.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener57.setText("13");
        BotonDetener57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener57ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener57, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, 50, 20));

        BotonDetener58.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener58.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener58.setText("14");
        BotonDetener58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener58ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener58, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 660, 50, 20));

        BotonDetener59.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener59.setForeground(new java.awt.Color(0, 153, 0));
        BotonDetener59.setText("15");
        BotonDetener59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener59ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener59, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 680, 50, 20));

        BotonDetener.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener.setText("1");
        BotonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetenerActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 50, 20));

        BotonDetener1.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener1.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener1.setText("2");
        BotonDetener1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 50, -1));

        BotonDetener2.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener2.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener2.setText("3");
        BotonDetener2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener2ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 50, -1));

        BotonDetener3.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener3.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener3.setText("4");
        BotonDetener3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener3ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 50, -1));

        BotonDetener4.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener4.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener4.setText("5");
        BotonDetener4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener4ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 50, -1));

        BotonDetener5.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener5.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener5.setText("6");
        BotonDetener5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener5ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 50, -1));

        BotonDetener6.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener6.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener6.setText("7");
        BotonDetener6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener6ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 50, -1));

        BotonDetener7.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener7.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener7.setText("8");
        BotonDetener7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener7ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 50, -1));

        BotonDetener8.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener8.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener8.setText("9");
        BotonDetener8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener8ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 50, 20));

        BotonDetener9.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener9.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener9.setText("10");
        BotonDetener9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener9ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 50, 20));

        BotonDetener10.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener10.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener10.setText("11");
        BotonDetener10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener10ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 50, 20));

        BotonDetener11.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener11.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener11.setText("12");
        BotonDetener11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener11ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 640, 50, 20));

        BotonDetener12.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener12.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener12.setText("13");
        BotonDetener12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener12ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, 50, 20));

        BotonDetener13.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener13.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener13.setText("14");
        BotonDetener13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener13ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 660, 50, 20));

        BotonDetener14.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener14.setForeground(new java.awt.Color(153, 153, 0));
        BotonDetener14.setText("15");
        BotonDetener14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener14ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 680, 50, 20));

        BotonDetener15.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener15.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener15.setText("1");
        BotonDetener15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener15ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 50, 20));

        BotonDetener16.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener16.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener16.setText("2");
        BotonDetener16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener16ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 50, -1));

        BotonDetener17.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener17.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener17.setText("3");
        BotonDetener17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener17ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 50, -1));

        BotonDetener18.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener18.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener18.setText("4");
        BotonDetener18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener18ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 50, -1));

        BotonDetener19.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener19.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener19.setText("5");
        BotonDetener19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener19ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 50, -1));

        BotonDetener20.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener20.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener20.setText("6");
        BotonDetener20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener20ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 50, -1));

        BotonDetener21.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener21.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener21.setText("7");
        BotonDetener21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener21ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 50, -1));

        BotonDetener22.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener22.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener22.setText("8");
        BotonDetener22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener22ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 50, -1));

        BotonDetener23.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener23.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener23.setText("9");
        BotonDetener23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener23ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 50, 20));

        BotonDetener24.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener24.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener24.setText("10");
        BotonDetener24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener24ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, 50, 20));

        BotonDetener25.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener25.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener25.setText("11");
        BotonDetener25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener25ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 50, 20));

        BotonDetener26.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener26.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener26.setText("12");
        BotonDetener26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener26ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 50, 20));

        BotonDetener27.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener27.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener27.setText("13");
        BotonDetener27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener27ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 50, 20));

        BotonDetener28.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener28.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener28.setText("14");
        BotonDetener28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener28ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 660, 50, 20));

        BotonDetener29.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener29.setForeground(new java.awt.Color(204, 0, 0));
        BotonDetener29.setText("15");
        BotonDetener29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener29ActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 680, 50, 20));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg2.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAtacar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtacar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAtacar2ActionPerformed

    private void BotonAtacar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtacar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAtacar3ActionPerformed

    private void BotonAtacar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtacar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAtacar4ActionPerformed

    private void BotonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinalizarActionPerformed
 
        if(evt.getSource()==BotonFinalizar ){   //Si el Metodo regresa un valor char igual a "X" cambia el valor de "turno" a "false".
               
               cb.setTurno(2);
             System.out.println("Le toca al otro jugador ");
            auxContadorTurno= auxContadorTurno + contadorTurno;

              System.out.println("turno n° "+ auxContadorTurno); 
              
              cb.indicarTurno();
              cb.obtenerJugador();
              
              BoxDado11.setEnabled(false);
              Dado21.setEnabled(true);
              
              
                String jugadorActual = cb.obtenerJugador();
                
                jlabeljugadorActual.setText(jugadorActual);
                
                
        }else{
                
                cb.setTurno(1); 

                
    }
       numeroturno.setText(String.valueOf(auxContadorTurno));    
    }//GEN-LAST:event_BotonFinalizarActionPerformed

    private void BotonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetenerActionPerformed
    for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar();
     
    }//GEN-LAST:event_BotonDetenerActionPerformed

    private void BotonAtacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtacar1ActionPerformed
    cb.realizarAtaque();
    }//GEN-LAST:event_BotonAtacar1ActionPerformed

    private void BoxFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxFormaActionPerformed
   
    }//GEN-LAST:event_BoxFormaActionPerformed

    private void BoxDado11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxDado11ActionPerformed
    
        System.out.println("elije tu dado");
           int seleccionDados= BoxDado11.getSelectedIndex();
          
           if (contadordados<=100){ 
                System.out.println("contador="+contadordados);
           switch (seleccionDados) {
                            case 0: BotonDetener.setEnabled(true);
                                    contadordados++; 
                                    System.out.println("contador="+contadordados);
                            break;      
                            case 1:   BotonDetener1.setEnabled(true);
                                    contadordados++;
                                    System.out.println("contador="+contadordados);
                            break;   
                            case 2:  BotonDetener2.setEnabled(true);
                                     contadordados++;
                                     System.out.println("contador="+contadordados);
                            break;     
                            case 3:  BotonDetener3.setEnabled(true);
                                    contadordados++;
                                    System.out.println("contador="+contadordados);
                            break;   
                            case 4: BotonDetener4.setEnabled(true);
                                    contadordados++;
                                    System.out.println("contador="+contadordados);
                            break;    
                            case 5:   BotonDetener5.setEnabled(true);
                                      contadordados++;
                                      System.out.println("contador="+contadordados);
                            break;    
                            case 6:  BotonDetener6.setEnabled(true);
                                     contadordados++;
                                     System.out.println("contador="+contadordados);
                            break; 
                            case 7:  BotonDetener7.setEnabled(true);
                                     contadordados++;
                                     System.out.println("contador="+contadordados);
                            break; 
                                 
                            case 8:   BotonDetener8.setEnabled(true);
                                    contadordados++;
                                    System.out.println("contador="+contadordados);
                            break;   
                            case 9:  BotonDetener9.setEnabled(true);
                                     contadordados++;
                                     System.out.println("contador="+contadordados);
                            break;     
                            case 10:  BotonDetener10.setEnabled(true);
                                    contadordados++;
                                    System.out.println("contador="+contadordados);
                            break;   
                            case 11: BotonDetener11.setEnabled(true);
                                    contadordados++;
                                    System.out.println("contador="+contadordados);
                            break;    
                            case 12:   BotonDetener12.setEnabled(true);
                                      contadordados++;
                                      System.out.println("contador="+contadordados);
                            break;    
                            case 13:  BotonDetener13.setEnabled(true);
                                     contadordados++;
                                     System.out.println("contador="+contadordados);
                            break; 
                            case 14:  BotonDetener14.setEnabled(true);
                                     contadordados++;
                                     System.out.println("contador="+contadordados);
                            break; 
                            
                            default:
          
           }
           } else {BoxDado11.setEnabled(false);}    
    }//GEN-LAST:event_BoxDado11ActionPerformed

    private void BotonDetener1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener1ActionPerformed
        for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar1();
        
    }//GEN-LAST:event_BotonDetener1ActionPerformed

    private void BotonDetener2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener2ActionPerformed
        for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar2();
        
    }//GEN-LAST:event_BotonDetener2ActionPerformed

    private void BotonDetener3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener3ActionPerformed
      for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar3();
        
    }//GEN-LAST:event_BotonDetener3ActionPerformed

    private void BotonDetener6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener6ActionPerformed
         for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar6();
       
    }//GEN-LAST:event_BotonDetener6ActionPerformed

    private void BotonDetener7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener7ActionPerformed
         for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar7();
        
    }//GEN-LAST:event_BotonDetener7ActionPerformed

    private void BotonDetener8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener8ActionPerformed
        for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar8();
    }//GEN-LAST:event_BotonDetener8ActionPerformed

    private void BotonDetener9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener9ActionPerformed
        for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar9();
    }//GEN-LAST:event_BotonDetener9ActionPerformed

    private void BotonDetener10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener10ActionPerformed
        for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar10();
    }//GEN-LAST:event_BotonDetener10ActionPerformed

    private void BotonDetener11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener11ActionPerformed
        for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar11();
    }//GEN-LAST:event_BotonDetener11ActionPerformed

    private void BotonDetener12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener12ActionPerformed
        for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar12();
    }//GEN-LAST:event_BotonDetener12ActionPerformed

    private void BotonDetener13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener13ActionPerformed
      for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar13();
    }//GEN-LAST:event_BotonDetener13ActionPerformed

    private void BotonDetener14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener14ActionPerformed
        for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
      cb.lanzar14();
    }//GEN-LAST:event_BotonDetener14ActionPerformed

    private void BotonDetener5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener5ActionPerformed
        for(int i=0; i<15;i++) // recorrer columnas
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
            cb.lanzar5();
            
    }//GEN-LAST:event_BotonDetener5ActionPerformed

    private void BotonDetener4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener4ActionPerformed
        for(int i=0; i<15;i++) // recorrer columnas
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j].boton.setEnabled(true);
            }}
            cb.lanzar4();
            
    }//GEN-LAST:event_BotonDetener4ActionPerformed

    private void BotonDetener15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener15ActionPerformed

    private void BotonDetener16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener16ActionPerformed

    private void BotonDetener17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener17ActionPerformed

    private void BotonDetener18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener18ActionPerformed

    private void BotonDetener19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener19ActionPerformed

    private void BotonDetener20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener20ActionPerformed

    private void BotonDetener21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener21ActionPerformed

    private void BotonDetener22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener22ActionPerformed

    private void BotonDetener23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener23ActionPerformed

    private void BotonDetener24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener24ActionPerformed

    private void BotonDetener25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener25ActionPerformed

    private void BotonDetener26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener26ActionPerformed

    private void BotonDetener27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener27ActionPerformed

    private void BotonDetener28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener28ActionPerformed

    private void BotonDetener29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener29ActionPerformed

    private void BotonFinalizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinalizar2ActionPerformed
     
        if(evt.getSource()==BotonFinalizar2 ){   //Si el Metodo regresa un valor char igual a "X" cambia el valor de "turno" a "false".
               
              cb.setTurno(1);
             System.out.println("Le toca al otro jugador ");
            auxContadorTurno= auxContadorTurno + contadorTurno;

              System.out.println("turno n° "+ auxContadorTurno); 
              
              cb.indicarTurno();
              cb.obtenerJugador();
              
              BoxDado11.setEnabled(true);
              Dado21.setEnabled(false);
              
                String jugadorActual = cb.obtenerJugador();
                
                jlabeljugadorActual.setText(jugadorActual);
                
                
        }else{
                
                cb.setTurno(2); 

                
    }
       numeroturno.setText(String.valueOf(auxContadorTurno)); 
    }//GEN-LAST:event_BotonFinalizar2ActionPerformed

    private void BotonDetener30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener30ActionPerformed

    private void BotonDetener31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener31ActionPerformed

    private void BotonDetener32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener32ActionPerformed

    private void BotonDetener33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener33ActionPerformed

    private void BotonDetener34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener34ActionPerformed

    private void BotonDetener35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener35ActionPerformed

    private void BotonDetener36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener36ActionPerformed

    private void BotonDetener37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener37ActionPerformed

    private void BotonDetener38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener38ActionPerformed

    private void BotonDetener39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener39ActionPerformed

    private void BotonDetener40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener40ActionPerformed

    private void BotonDetener41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener41ActionPerformed

    private void BotonDetener42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener42ActionPerformed

    private void BotonDetener43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener43ActionPerformed

    private void BotonDetener44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener44ActionPerformed

    private void BotonDetener45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener45ActionPerformed

    private void BotonDetener46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener46ActionPerformed

    private void BotonDetener47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener47ActionPerformed

    private void BotonDetener48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener48ActionPerformed

    private void BotonDetener49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener49ActionPerformed

    private void BotonDetener50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener50ActionPerformed

    private void BotonDetener51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener51ActionPerformed

    private void BotonDetener52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener52ActionPerformed

    private void BotonDetener53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener53ActionPerformed

    private void BotonDetener54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener54ActionPerformed

    private void BotonDetener55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener55ActionPerformed

    private void BotonDetener56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener56ActionPerformed

    private void BotonDetener57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener57ActionPerformed

    private void BotonDetener58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener58ActionPerformed

    private void BotonDetener59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetener59ActionPerformed

    private void BotonFinalizar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinalizar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonFinalizar3ActionPerformed

    private void BotonFinalizar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinalizar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonFinalizar4ActionPerformed

    private void BotonMover7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMover7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMover7ActionPerformed

    private void BotonMover6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMover6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMover6ActionPerformed

    private void BotonMover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMover5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMover5ActionPerformed

    private void BotonMover9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMover9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMover9ActionPerformed

    private void BotonMover10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMover10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMover10ActionPerformed

    private void BotonMover11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMover11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMover11ActionPerformed

    private void BotonMover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMover1ActionPerformed
            if(auxMov>=1){

               for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {

        MatrizTablero[i][j].boton.addActionListener(this); } 
               }
            }
     

    }//GEN-LAST:event_BotonMover1ActionPerformed
                        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VBatalla dialog = new VBatalla(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtacar1;
    private javax.swing.JButton BotonAtacar2;
    private javax.swing.JButton BotonAtacar3;
    private javax.swing.JButton BotonAtacar4;
    private javax.swing.JButton BotonDetener;
    private javax.swing.JButton BotonDetener1;
    private javax.swing.JButton BotonDetener10;
    private javax.swing.JButton BotonDetener11;
    private javax.swing.JButton BotonDetener12;
    private javax.swing.JButton BotonDetener13;
    private javax.swing.JButton BotonDetener14;
    private javax.swing.JButton BotonDetener15;
    private javax.swing.JButton BotonDetener16;
    private javax.swing.JButton BotonDetener17;
    private javax.swing.JButton BotonDetener18;
    private javax.swing.JButton BotonDetener19;
    private javax.swing.JButton BotonDetener2;
    private javax.swing.JButton BotonDetener20;
    private javax.swing.JButton BotonDetener21;
    private javax.swing.JButton BotonDetener22;
    private javax.swing.JButton BotonDetener23;
    private javax.swing.JButton BotonDetener24;
    private javax.swing.JButton BotonDetener25;
    private javax.swing.JButton BotonDetener26;
    private javax.swing.JButton BotonDetener27;
    private javax.swing.JButton BotonDetener28;
    private javax.swing.JButton BotonDetener29;
    private javax.swing.JButton BotonDetener3;
    private javax.swing.JButton BotonDetener30;
    private javax.swing.JButton BotonDetener31;
    private javax.swing.JButton BotonDetener32;
    private javax.swing.JButton BotonDetener33;
    private javax.swing.JButton BotonDetener34;
    private javax.swing.JButton BotonDetener35;
    private javax.swing.JButton BotonDetener36;
    private javax.swing.JButton BotonDetener37;
    private javax.swing.JButton BotonDetener38;
    private javax.swing.JButton BotonDetener39;
    private javax.swing.JButton BotonDetener4;
    private javax.swing.JButton BotonDetener40;
    private javax.swing.JButton BotonDetener41;
    private javax.swing.JButton BotonDetener42;
    private javax.swing.JButton BotonDetener43;
    private javax.swing.JButton BotonDetener44;
    private javax.swing.JButton BotonDetener45;
    private javax.swing.JButton BotonDetener46;
    private javax.swing.JButton BotonDetener47;
    private javax.swing.JButton BotonDetener48;
    private javax.swing.JButton BotonDetener49;
    private javax.swing.JButton BotonDetener5;
    private javax.swing.JButton BotonDetener50;
    private javax.swing.JButton BotonDetener51;
    private javax.swing.JButton BotonDetener52;
    private javax.swing.JButton BotonDetener53;
    private javax.swing.JButton BotonDetener54;
    private javax.swing.JButton BotonDetener55;
    private javax.swing.JButton BotonDetener56;
    private javax.swing.JButton BotonDetener57;
    private javax.swing.JButton BotonDetener58;
    private javax.swing.JButton BotonDetener59;
    private javax.swing.JButton BotonDetener6;
    private javax.swing.JButton BotonDetener7;
    private javax.swing.JButton BotonDetener8;
    private javax.swing.JButton BotonDetener9;
    public javax.swing.JButton BotonFinalizar;
    public javax.swing.JButton BotonFinalizar2;
    public javax.swing.JButton BotonFinalizar3;
    public javax.swing.JButton BotonFinalizar4;
    private javax.swing.JComboBox<String> BotonMagia1;
    private javax.swing.JComboBox<String> BotonMagia2;
    private javax.swing.JComboBox<String> BotonMagia3;
    private javax.swing.JComboBox<String> BotonMagia4;
    private javax.swing.JButton BotonMover1;
    private javax.swing.JButton BotonMover10;
    private javax.swing.JButton BotonMover11;
    private javax.swing.JButton BotonMover3;
    private javax.swing.JButton BotonMover4;
    private javax.swing.JButton BotonMover5;
    private javax.swing.JButton BotonMover6;
    private javax.swing.JButton BotonMover7;
    private javax.swing.JButton BotonMover8;
    private javax.swing.JButton BotonMover9;
    private javax.swing.JComboBox<String> BotonTrampa1;
    private javax.swing.JComboBox<String> BotonTrampa2;
    private javax.swing.JComboBox<String> BotonTrampa3;
    private javax.swing.JComboBox<String> BotonTrampa4;
    private javax.swing.JComboBox<String> BoxDado11;
    private javax.swing.JComboBox<String> BoxForma;
    private javax.swing.JComboBox<String> BoxRotar;
    private javax.swing.JComboBox<String> Dado21;
    private javax.swing.JComboBox<String> Dado31;
    private javax.swing.JComboBox<String> Dado41;
    private javax.swing.JPanel PanelAcciones1;
    private javax.swing.JPanel PanelAcciones2;
    private javax.swing.JPanel PanelAcciones5;
    private javax.swing.JPanel PanelAcciones6;
    private javax.swing.JPanel TABLERO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JLabel jlabelatk1;
    private javax.swing.JLabel jlabeljugadorActual;
    private javax.swing.JLabel jlabelmag1;
    private javax.swing.JLabel jlabelmov1;
    private javax.swing.JLabel jlabeltramp1;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado5;
    private javax.swing.JLabel numeroturno;
    // End of variables declaration//GEN-END:variables


public Posicion[][] getMatrizTablero() {
        return MatrizTablero;
    }

     
}



