/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import excepciones.BaseDatosException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Practicas
 */
public class Conexion {
    
     public final static String BASEDATOS="tienda-generica";
     public final static String URL="jdbc:mysql://localhost:3306/"+BASEDATOS;
     public final static String USER="root";
     public final static String PASSWORD="root";
    
     public static Connection conexion;
    public static Connection conectar() throws BaseDatosException {
        try {
             Class.forName("com.mysql.jdbc.Driver");
             conexion=DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException ex) {
            //System.out.println("Error al cargar del Driver");
          throw new BaseDatosException("Error al cargar del Driver",ex);  
        } catch (SQLException ex ){
            //System.out.println("Error de sql, estoy en la conexion:"+ex.getMessage());
          throw new BaseDatosException("Error de sql, estoy en la conexion:",ex); 
        }
        
        return conexion;
        }
    public static void desconectar() {
         try {
             conexion.close();
         } catch (SQLException ex) {
            System.out.println("Error al cerear la  conexion:"+ex.getMessage());
         }
    }
    
    
    
}
