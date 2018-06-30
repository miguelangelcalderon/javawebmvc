/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import excepciones.DataBaseException;

/**
 *
 * @author Curso Mañana
 */
public class DbConexion {
        
        static final String bbdd="daw2";
        static final String user="root";
        static final String pass="";
        static final String url="jdbc:mysql://localhost/"+bbdd;
        Connection conexion=null;
        public Connection conectar() throws DataBaseException{
            try 
                {
                Class.forName("com.mysql.jdbc.Driver");
                conexion=DriverManager.getConnection(url,user,pass);
                }catch(SQLException e)
                {
                    System.out.println("Ha ocurrido un error SQL"+e.getMessage());
                    throw new DataBaseException("Error de SQL", e);
                }catch (ClassNotFoundException e) {
                    System.out.println("Ha ocurrido un error de Clase"+e.getMessage());
                    throw new DataBaseException("Error Clase no encontrada", e);
                    
            }
            return conexion;
        }
        public void desconectar() {
            try {
                conexion.close();
            } catch (SQLException e) {
                    System.out.println("Ha ocurrido un error"+e.getMessage());
            }
        }
        
}
