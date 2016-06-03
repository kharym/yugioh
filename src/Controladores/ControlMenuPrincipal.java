
package Controladores;

import Vistas.VMenuPrincipal;


public class ControlMenuPrincipal {
    
    VMenuPrincipal vmp;
    
    ControlMenuBatalla cmb;
    
    
  public void mostrarMenuPrincipal (){
    
    vmp = new VMenuPrincipal(this); 
    vmp.setVisible(true);
    
}
  public void confirmarOpcionBatalla(){
     
      cmb = new ControlMenuBatalla();
      cmb.mostrarMenuBatalla();
      vmp.dispose();

}

}
