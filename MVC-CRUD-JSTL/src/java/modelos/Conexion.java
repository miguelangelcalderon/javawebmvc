/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




/**
 *
 * @author Practicas
 */
public class Conexion {
    
     public final static String BASEDATOS="inmobiliaria";
     public final static String URL="jdbc:mysql://localhost:3306/"+BASEDATOS;
     public final static String USER="root";
     public final static String PASSWORD="root";
    
     public static Connection conexion;
    public static Connection conectar(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
             conexion=DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar del Driver");
        } catch (Exception ex) {
          System.out.println("Error de conexion:"+ex.getMessage());
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
