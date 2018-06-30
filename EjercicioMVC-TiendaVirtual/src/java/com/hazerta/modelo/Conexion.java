/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class Conexion {
    
        public final static String BASEDATOS="tienda-generica";
        public final static String URL="jdbc:mysql://localhost:3306/"+BASEDATOS;
        public final static String USER="root";
        public final static String PASSWORD="root";
    
        public static Connection conexion;
    public static Connection conectar(){
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexion=DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al cargar el driver");
            } catch (SQLException ex) {
                System.out.println("Error de conexión: "+ex.getMessage());
            }
            
            return conexion;
    
    }
    
    public static void desconectar(){
    
            try {
                conexion.close();
            } catch (SQLException ex) {
                System.out.println("Error al crear la conexion "+ ex.getMessage());
            }
    
    }
    
    
}
