/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author shali
 */
    
public class ConexionDB {

    private final String url = "jdbc:derby://localhost:1527/ConexionDB;user=grupo;password=metodos";   
    
//Para registrar en la base de datos.
    public void registroUsuario(String nombreUsuario, String passUsuario, boolean pnj){
         
        try {            
            java.sql.Connection conn = java.sql.DriverManager.getConnection(url);
            java.sql.Statement stmt = conn.createStatement();
            String insertar = "INSERT INTO JUGADOR (NOMBRE_JUGADOR,PASS_JUGADOR,ES_PNJ) VALUES ('" + nombreUsuario + "','" + passUsuario + "',"+pnj+")";
            int resultado = stmt.executeUpdate(insertar);
            JOptionPane.showMessageDialog(null, "Jugador registrado exitosamente.");
            conn.close();          
                            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error");
            System.out.println("Error en la conexion de base de datos" + e);
        }
    }
    
    
    //Para obtener nombres de usuario de la base de datos y comparar si el nombre está en la base de datos o no. 
    public ArrayList obtenerListaUsuarios(){
        ArrayList<String> listaUsuarios = new ArrayList();
        try {
            java.sql.Connection conn = java.sql.DriverManager.getConnection(url);
            java.sql.Statement stmt = conn.createStatement();
            String consulta = "SELECT NOMBRE_JUGADOR FROM JUGADOR";
            java.sql.ResultSet rst = stmt.executeQuery(consulta);
            
            while (rst.next()){
                String nombre = rst.getString(1);
                listaUsuarios.add(nombre);
                System.out.println("Lista de usuarios es:" + listaUsuarios);
            rst.close();
            conn.close();
            return listaUsuarios;           
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error");
            System.out.println("Error en la conexion de base de datos" + e);
        }
    return listaUsuarios;
    }
    
        
   
    
    
    }

     
    
