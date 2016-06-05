
package Vistas;
import Controladores.ControlBatalla;
import Controladores.ControlDado;
import Controladores.ControlTerreno;
import Controladores.ControlCriatura;
import Controladores.ControlPuzleDados;
import Modelo.Posicion;
import Modelo.Dado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class VBatalla extends javax.swing.JDialog implements ActionListener {
    
    ControlBatalla cb;
    ControlDado cd;
    ControlTerreno ct;
    ControlCriatura cc;
    ControlPuzleDados cpd;
    
    int contador;
 
    private Posicion[][]MatrizTablero = new Posicion [15][15];
    
    public VBatalla(ControlBatalla aThis) {

        initComponents();
        
        cb = aThis;
          for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                MatrizTablero[i][j]= new Posicion (String.valueOf((i+1)+15*j)); // instanciacion de cada elemento del objeto matriztablero 
                MatrizTablero[i][j].boton.setBounds(i*35, j*35, 34, 34);
                MatrizTablero[i][j].boton.addActionListener(this);
                this.TABLERO.add(MatrizTablero[i][j].boton);

            }
        }
    }

    private VBatalla(JFrame jFrame, boolean b) {
        
    }

    public VBatalla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

   

    
        
    

    @Override
     public void actionPerformed(ActionEvent e) 
    {
    for(int i=0; i<15;i++) // recorrer columnas 
        {
            for(int j=0; j<15;j++) // recorrer filas
            {
                
                if(e.getSource()==MatrizTablero[i][j].boton){
                    System.out.println("Se presionó: "+i+","+j);}
                
          
                int ocupa= BoxForma.getSelectedIndex();
                int rotado = BoxRotar.getSelectedIndex();
                
                switch (ocupa) {
                    case 0:
                        switch (rotado){
                            case 0:
                            if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i][j-2]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            
                            
                                                        
                        }       break;
                            case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                                    ct.despliegue(MatrizTablero[i][j-1]);
                                    ct.despliegue(MatrizTablero[i][j+1]);
                                    ct.despliegue(MatrizTablero[i-2][j]);
                                    ct.despliegue(MatrizTablero[i-1][j]);
                                    ct.despliegue(MatrizTablero[i+1][j]);
                            
                            
                        }       break;
                            case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                                    ct.despliegue(MatrizTablero[i][j+2]);
                                    ct.despliegue(MatrizTablero[i][j-1]);
                                    ct.despliegue(MatrizTablero[i][j+1]);
                                    ct.despliegue(MatrizTablero[i+1][j]);
                                    ct.despliegue(MatrizTablero[i-1][j]);
                            
                            
                        }       break;
                            case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                                    ct.despliegue(MatrizTablero[i][j-1]);
                                    ct.despliegue(MatrizTablero[i+2][j]);
                                    ct.despliegue(MatrizTablero[i][j+1]);
                                    ct.despliegue(MatrizTablero[i+1][j]);
                                    ct.despliegue(MatrizTablero[i-1][j]);
                            
                           
                        }       break; 
                        
                        
                                                                                       
                                } 
                        
                        break;
                    
                    case 1:
                        switch (rotado){
                            case 0:
                            if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i][j-2]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+1][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j+2]);
                            
                            contador++;
                        }       break;
                            case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-2][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i+2][j-1]);
                             break;
                                
                        }
                            case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i][j+2]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-1][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j-2]);
                              }
                                break;
                            case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+2][j]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i-1][j+1]);
                            ct.despliegue(MatrizTablero[i-2][j+1]);
                              }
                                break;
                                
                        
                        }   
                                break;
                        
                        
                        
                        
                        
                    case 2:
                        switch (rotado){
                            case 0:
                            if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j+1]);
                            ct.despliegue(MatrizTablero[i-1][j+2]);
                            
                            
                                                        
                        }       break;
                            case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                                    ct.despliegue(MatrizTablero[i-1][j-1]);
                                    ct.despliegue(MatrizTablero[i][j-1]);
                                    ct.despliegue(MatrizTablero[i+1][j]);
                                    ct.despliegue(MatrizTablero[i+1][j+1]);
                                    ct.despliegue(MatrizTablero[i+2][j+1]);
                            
                            
                        }       break;
                            case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                                    ct.despliegue(MatrizTablero[i-1][j]);
                                    ct.despliegue(MatrizTablero[i-1][j+1]);
                                    ct.despliegue(MatrizTablero[i][j-1]);
                                    ct.despliegue(MatrizTablero[i+1][j-1]);
                                    ct.despliegue(MatrizTablero[i+1][j-2]);
                            
                            
                        }       break;
                            case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                                    ct.despliegue(MatrizTablero[i-2][j-1]);
                                    ct.despliegue(MatrizTablero[i-1][j-1]);
                                    ct.despliegue(MatrizTablero[i-1][j]);
                                    ct.despliegue(MatrizTablero[i][j+1]);
                                    ct.despliegue(MatrizTablero[i+1][j+1]);
                            
                           
                        }       break; 
                        
                        
                                                                                       
                                } 
                        
                        break;
                    case 3:
                        switch (rotado){
                            case 0:
                            if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j-1]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i][j+2]);
                            ct.despliegue(MatrizTablero[i+1][j+2]);
                            
                            
                                                        
                        }       break;
                            case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-1][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+2][j]);
                            ct.despliegue(MatrizTablero[i+2][j-1]);
                            
                            
                        }       break;
                            case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i-1][j-2]);
                            ct.despliegue(MatrizTablero[i][j-2]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j+1]);
                            
                            
                        }       break;
                            case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-2][j]);
                            ct.despliegue(MatrizTablero[i-2][j+1]);
                            
                           
                        }       break; 
                        
                        
                                                                                       
                                } 
                        
                        break;
                    case 4:
                        switch (rotado){
                            case 0:
                            if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j-1]);
                            ct.despliegue(MatrizTablero[i][j-2]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+1][j+1]);
                            
                            
                                                        
                        }       break;
                            case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-2][j]);
                            ct.despliegue(MatrizTablero[i-1][j+1]);
                            
                            
                        }       break;
                            case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-1][j-1]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j+1]);
                            ct.despliegue(MatrizTablero[i][j+2]);
                            
                            
                        }       break;
                            case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i-1][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+2][j]);
                            
                           
                        }       break; 
                        
                        
                                                                                       
                                } 
                        
                        break;
                    case 5:
                        switch (rotado){
                            case 0:
                            if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i][j+2]);
                            ct.despliegue(MatrizTablero[i][j+3]);
                            
                            
                                                        
                        }       break;
                            case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+2][j]);
                            ct.despliegue(MatrizTablero[i+3][j]);
                            
                            
                        }       break;
                            case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i][j-2]);
                            ct.despliegue(MatrizTablero[i][j-3]);
                            
                            
                        }       break;
                            case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-2][j]);
                            ct.despliegue(MatrizTablero[i-3][j]);
                            
                           
                        }       break; 
                        
                        
                                                                                       
                                } 
                        
                        break;
                    case 6:
                        switch (rotado){
                            case 0:
                            if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i][j-2]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-1][j+1]);
                            ct.despliegue(MatrizTablero[i-1][j+2]);
                            
                            
                                                        
                        }       break;
                            case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                  cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-2][j]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j+1]);
                            ct.despliegue(MatrizTablero[i+2][j+1]);
                            
                            
                        }       break;
                            case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                  cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i][j+2]);
                            
                            
                        }       break;
                            case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                  cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j-1]);
                            ct.despliegue(MatrizTablero[i-2][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+2][j]);
                            
                           
                        }       break; 
                        
                        
                                                                                       
                                } 
                        
                        break;
                    case 7:
                        switch (rotado){
                            case 0:
                            if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-1][j-1]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j+2]);
                            
                            
                                                        
                        }       break;
                            case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i-1][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i+2][j-1]);
                            
                            
                        }       break;
                            case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+1][j+1]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j-2]);
                            
                            
                        }       break;
                            case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-1][j+1]);
                            ct.despliegue(MatrizTablero[i-2][j+1]);
                            
                           
                        }       break; 
                        
                        
                                                                                       
                                } 
                        
                        break;
                    case 8:
                        switch (rotado){
                            case 0:
                            if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i][j+2]);
                            ct.despliegue(MatrizTablero[i-1][j+2]);
                            
                            
                                                        
                        }       break;
                            case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-1][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+2][j]);
                            ct.despliegue(MatrizTablero[i+2][j+1]);
                            
                            
                        }       break;
                            case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i][j-2]);
                            ct.despliegue(MatrizTablero[i+1][j-2]);
                            ct.despliegue(MatrizTablero[i-1][j+1]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            
                            
                        }       break;
                            case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+1][j+1]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-2][j]);
                            ct.despliegue(MatrizTablero[i-2][j-1]);
                            
                           
                        }       break; 
                        
                        
                                                                                       
                                } 
                        
                        break;
                        
                    case 9:
                        switch (rotado){
                            case 0:
                            if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                                cc= new ControlCriatura();
                            cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-1][j+1]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i][j-2]);
                            
                            
                                                        
                        }       break;
                            case 1:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                   cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i-1][j]);
                            ct.despliegue(MatrizTablero[i-1][j-1]);
                            ct.despliegue(MatrizTablero[i-2][j]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i+1][j+1]);
                            
                            
                        }       break;
                            case 2:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+1][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j+1]);
                            ct.despliegue(MatrizTablero[i][j+1]);
                            ct.despliegue(MatrizTablero[i][j+2]);
                            
                            
                        }       break;
                            case 3:
                                if(e.getSource()==MatrizTablero[i][j].boton){
                                ct = new ControlTerreno ();
                            cc= new ControlCriatura();
                                    cc.invocacion1(MatrizTablero[i][j]);
                            ct.despliegue(MatrizTablero[i][j-1]);
                            ct.despliegue(MatrizTablero[i-1][j-1]);
                            ct.despliegue(MatrizTablero[i+1][j]);
                            ct.despliegue(MatrizTablero[i+2][j]);
                            ct.despliegue(MatrizTablero[i+1][j+1]);
                            
                           
                        }       break; 
                        
                        
                                                                                       
                                } 
                        
                        break;
                    default:
                        break;
                }
            }
               
                
    }
    }    
            
            

    
    
    
    
    public void mostrarLanzamiento(int dado1, int dado2, int dado3, int dado4){
     
        Dado objImag1 = new Dado();
        lblDado1.setIcon(objImag1.gifDado1(dado1)); 
        Dado objImag2 = new Dado();
        lblDado2.setIcon(objImag2.gifDado2(dado2));
        Dado objImag3 = new Dado();
        lblDado3.setIcon(objImag3.gifDado3(dado3));
        Dado objImag4 = new Dado();
        lblDado4.setIcon(objImag4.gifDado4(dado4));
    }
    
    public void mostrarCarasObtenidas(int num1,int num2,int num3,int num4){
    
         Dado objImag1 = new Dado();
         lblDado1.setIcon(objImag1.Dado1(num1));
         Dado objImag2 = new Dado();
         lblDado2.setIcon(objImag2.Dado1(num2));
         Dado objImag3 = new Dado(); 
         lblDado3.setIcon(objImag3.Dado1(num3));
         Dado objImag4 = new Dado();
         lblDado4.setIcon(objImag4.Dado1(num4)); 
         
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
        Dado12 = new javax.swing.JComboBox<>();
        Dado13 = new javax.swing.JComboBox<>();
        Dado14 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jlabelDuelista1 = new javax.swing.JLabel();
        BotonAtacar1 = new javax.swing.JButton();
        BotonMover1 = new javax.swing.JButton();
        BotonTrampa1 = new javax.swing.JComboBox<>();
        BotonMagia1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        PanelAcciones1 = new javax.swing.JPanel();
        Dado21 = new javax.swing.JComboBox<>();
        Dado22 = new javax.swing.JComboBox<>();
        Dado23 = new javax.swing.JComboBox<>();
        Dado24 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jlabelDuelista2 = new javax.swing.JLabel();
        BotonMover2 = new javax.swing.JButton();
        BotonMagia2 = new javax.swing.JComboBox<>();
        BotonAtacar2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BotonTrampa2 = new javax.swing.JComboBox<>();
        jProgressBar2 = new javax.swing.JProgressBar();
        PanelAcciones2 = new javax.swing.JPanel();
        Dado33 = new javax.swing.JComboBox<>();
        PanelAcciones3 = new javax.swing.JPanel();
        jProgressBar3 = new javax.swing.JProgressBar();
        Dado31 = new javax.swing.JComboBox<>();
        Dado32 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jlabelDuelista3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BotonMagia3 = new javax.swing.JComboBox<>();
        BotonTrampa3 = new javax.swing.JComboBox<>();
        BotonAtacar3 = new javax.swing.JButton();
        BotonMover3 = new javax.swing.JButton();
        Dado34 = new javax.swing.JComboBox<>();
        Dado41 = new javax.swing.JComboBox<>();
        jProgressBar4 = new javax.swing.JProgressBar();
        Dado44 = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jlabelDuelista4 = new javax.swing.JLabel();
        BotonAtacar4 = new javax.swing.JButton();
        BotonMover4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        BotonTrampa4 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        BotonMagia4 = new javax.swing.JComboBox<>();
        PanelAcciones4 = new javax.swing.JPanel();
        Dado43 = new javax.swing.JComboBox<>();
        Dado42 = new javax.swing.JComboBox<>();
        BotonLanzar = new javax.swing.JButton();
        BotonFinalizar = new javax.swing.JButton();
        BotonDetener = new javax.swing.JButton();
        lblDado1 = new javax.swing.JLabel();
        lblDado2 = new javax.swing.JLabel();
        lblDado3 = new javax.swing.JLabel();
        lblDado4 = new javax.swing.JLabel();
        BoxForma = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        BoxRotar = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(TABLERO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 524, 524));

        BoxDado11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BoxDado11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxDado11ActionPerformed(evt);
            }
        });
        getContentPane().add(BoxDado11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        Dado12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        Dado13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Dado14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jlabelDuelista1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelDuelista1.setBorder(javax.swing.BorderFactory.createTitledBorder("duelista 1"));

        BotonAtacar1.setText("ATACAR");
        BotonAtacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtacar1ActionPerformed(evt);
            }
        });

        BotonMover1.setText("MOVER");

        BotonTrampa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonMagia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TRAMPAS");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MAGIAS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonMagia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTrampa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonMover1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAtacar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelDuelista1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jlabelDuelista1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonAtacar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonMover1)
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMagia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTrampa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, 170));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 180, -1));

        PanelAcciones1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelAcciones1Layout = new javax.swing.GroupLayout(PanelAcciones1);
        PanelAcciones1.setLayout(PanelAcciones1Layout);
        PanelAcciones1Layout.setHorizontalGroup(
            PanelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelAcciones1Layout.setVerticalGroup(
            PanelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        getContentPane().add(PanelAcciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 180, 50));

        Dado21.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        Dado22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        Dado23.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        Dado24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        jlabelDuelista2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelDuelista2.setBorder(javax.swing.BorderFactory.createTitledBorder("duelista 2"));

        BotonMover2.setText("MOVER");

        BotonMagia2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonAtacar2.setText("ATACAR");
        BotonAtacar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtacar2ActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MAGIAS");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TRAMPAS");

        BotonTrampa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonMagia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BotonTrampa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonMover2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonAtacar2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                    .addComponent(jlabelDuelista2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jlabelDuelista2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonAtacar2)
                .addGap(9, 9, 9)
                .addComponent(BotonMover2)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMagia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTrampa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 180, 180));

        jProgressBar2.setName(""); // NOI18N
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 180, -1));

        PanelAcciones2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelAcciones2Layout = new javax.swing.GroupLayout(PanelAcciones2);
        PanelAcciones2.setLayout(PanelAcciones2Layout);
        PanelAcciones2Layout.setHorizontalGroup(
            PanelAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelAcciones2Layout.setVerticalGroup(
            PanelAcciones2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        getContentPane().add(PanelAcciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 180, 50));

        Dado33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, -1, -1));

        PanelAcciones3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelAcciones3Layout = new javax.swing.GroupLayout(PanelAcciones3);
        PanelAcciones3.setLayout(PanelAcciones3Layout);
        PanelAcciones3Layout.setHorizontalGroup(
            PanelAcciones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        PanelAcciones3Layout.setVerticalGroup(
            PanelAcciones3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        getContentPane().add(PanelAcciones3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 180, 50));
        getContentPane().add(jProgressBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 180, -1));

        Dado31.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, -1, -1));

        Dado32.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, -1, -1));

        jlabelDuelista3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelDuelista3.setBorder(javax.swing.BorderFactory.createTitledBorder("duelista 3"));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TRAMPAS");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MAGIAS");

        BotonMagia3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonTrampa3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonAtacar3.setText("ATACAR");
        BotonAtacar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtacar3ActionPerformed(evt);
            }
        });

        BotonMover3.setText("MOVER");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
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
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonMover3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAtacar3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlabelDuelista3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jlabelDuelista3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonAtacar3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonMover3)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMagia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTrampa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 180, 170));

        Dado34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 170, -1, -1));

        Dado41.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 310, -1, -1));
        getContentPane().add(jProgressBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 190, -1));

        Dado44.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 430, -1, -1));

        jlabelDuelista4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelDuelista4.setBorder(javax.swing.BorderFactory.createTitledBorder("duelista 4"));

        BotonAtacar4.setText("ATACAR");
        BotonAtacar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtacar4ActionPerformed(evt);
            }
        });

        BotonMover4.setText("MOVER");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TRAMPAS");

        BotonTrampa4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MAGIAS");

        BotonMagia4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonMover4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonAtacar4, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabelDuelista4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jlabelDuelista4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonAtacar4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonMover4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMagia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonTrampa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 190, 180));

        PanelAcciones4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelAcciones4Layout = new javax.swing.GroupLayout(PanelAcciones4);
        PanelAcciones4.setLayout(PanelAcciones4Layout);
        PanelAcciones4Layout.setHorizontalGroup(
            PanelAcciones4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        PanelAcciones4Layout.setVerticalGroup(
            PanelAcciones4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        getContentPane().add(PanelAcciones4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 487, 190, 50));

        Dado43.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 390, -1, -1));

        Dado42.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Dado42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 350, -1, -1));

        BotonLanzar.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonLanzar.setText("LANZAR");
        BotonLanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLanzarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 110, -1));

        BotonFinalizar.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonFinalizar.setText("FINALIZAR");
        BotonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 120, -1));

        BotonDetener.setFont(new java.awt.Font("Engravers MT", 1, 10)); // NOI18N
        BotonDetener.setText("DETENER");
        BotonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetenerActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, 110, -1));

        lblDado1.setBorder(javax.swing.BorderFactory.createTitledBorder("dado 1"));
        getContentPane().add(lblDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 110, 100));

        lblDado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDado2.setBorder(javax.swing.BorderFactory.createTitledBorder("dado2"));
        getContentPane().add(lblDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 110, 100));

        lblDado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDado3.setBorder(javax.swing.BorderFactory.createTitledBorder("dado 3"));
        getContentPane().add(lblDado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 110, 100));

        lblDado4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDado4.setBorder(javax.swing.BorderFactory.createTitledBorder("dado 4"));
        getContentPane().add(lblDado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, 110, 100));

        BoxForma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10" }));
        BoxForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxFormaActionPerformed(evt);
            }
        });
        getContentPane().add(BoxForma, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 600, -1, -1));

        jLabel11.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ROTAR");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 570, -1, 20));

        BoxRotar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(BoxRotar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 600, -1, -1));

        jLabel6.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FORMA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, 70, 20));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bg2.jpg"))); // NOI18N
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
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonFinalizarActionPerformed

    private void BotonLanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLanzarActionPerformed
    cb.lanzarDado();
    }//GEN-LAST:event_BotonLanzarActionPerformed

    private void BotonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetenerActionPerformed
    cb.detenerDado();
    }//GEN-LAST:event_BotonDetenerActionPerformed

    private void BotonAtacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtacar1ActionPerformed
    cb.realizarAtaque();
    }//GEN-LAST:event_BotonAtacar1ActionPerformed

    private void BoxFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxFormaActionPerformed
   
    }//GEN-LAST:event_BoxFormaActionPerformed

    private void BoxDado11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxDado11ActionPerformed
      int listaDados= BoxDado11.getSelectedIndex();
      
        switch (listaDados) {
                    case 0:
                        if(evt.getSource()==BoxDado11){
                            
                            
                               
                            }
                       }
        
    }//GEN-LAST:event_BoxDado11ActionPerformed
                        
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
    private javax.swing.JButton BotonFinalizar;
    private javax.swing.JButton BotonLanzar;
    private javax.swing.JComboBox<String> BotonMagia1;
    private javax.swing.JComboBox<String> BotonMagia2;
    private javax.swing.JComboBox<String> BotonMagia3;
    private javax.swing.JComboBox<String> BotonMagia4;
    private javax.swing.JButton BotonMover1;
    private javax.swing.JButton BotonMover2;
    private javax.swing.JButton BotonMover3;
    private javax.swing.JButton BotonMover4;
    private javax.swing.JComboBox<String> BotonTrampa1;
    private javax.swing.JComboBox<String> BotonTrampa2;
    private javax.swing.JComboBox<String> BotonTrampa3;
    private javax.swing.JComboBox<String> BotonTrampa4;
    private javax.swing.JComboBox<String> BoxDado11;
    private javax.swing.JComboBox<String> BoxForma;
    private javax.swing.JComboBox<String> BoxRotar;
    private javax.swing.JComboBox<String> Dado12;
    private javax.swing.JComboBox<String> Dado13;
    private javax.swing.JComboBox<String> Dado14;
    private javax.swing.JComboBox<String> Dado21;
    private javax.swing.JComboBox<String> Dado22;
    private javax.swing.JComboBox<String> Dado23;
    private javax.swing.JComboBox<String> Dado24;
    private javax.swing.JComboBox<String> Dado31;
    private javax.swing.JComboBox<String> Dado32;
    private javax.swing.JComboBox<String> Dado33;
    private javax.swing.JComboBox<String> Dado34;
    private javax.swing.JComboBox<String> Dado41;
    private javax.swing.JComboBox<String> Dado42;
    private javax.swing.JComboBox<String> Dado43;
    private javax.swing.JComboBox<String> Dado44;
    private javax.swing.JPanel PanelAcciones1;
    private javax.swing.JPanel PanelAcciones2;
    private javax.swing.JPanel PanelAcciones3;
    private javax.swing.JPanel PanelAcciones4;
    private javax.swing.JPanel TABLERO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jlabelDuelista1;
    private javax.swing.JLabel jlabelDuelista2;
    private javax.swing.JLabel jlabelDuelista3;
    private javax.swing.JLabel jlabelDuelista4;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado2;
    private javax.swing.JLabel lblDado3;
    private javax.swing.JLabel lblDado4;
    // End of variables declaration//GEN-END:variables


public Posicion[][] getMatrizTablero() {
        return MatrizTablero;
    }

}
