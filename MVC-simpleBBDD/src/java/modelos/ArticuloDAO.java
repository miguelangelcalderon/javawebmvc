/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import excepciones.BaseDatosException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojos.Articulo;

/**
 *
 * @author Practicas
 */
public class ArticuloDAO {
    
    public ArrayList<Articulo> getAll() throws BaseDatosException {
        
        ArrayList<Articulo> articulos=new ArrayList<Articulo>();
        Connection miConexion;
        try {
            miConexion = Conexion.conectar();
        } catch (BaseDatosException ex) {
           //System.out.println("Error de SQL estoy en la capa DAO "+ex.getMessage());
         throw new BaseDatosException("Error de SQL estoy en la capa DAO",ex); 
        }
        
        String sql="selec *from articulos";
        Statement sentencia;
        ResultSet registros;
        
        try {
            sentencia = miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
            while(registros.next())
            {
               articulos.add(new Articulo(registros.getInt("id_articulo"),registros.getString("nombre"),registros.getFloat("Pvp")));
            }
        } catch (SQLException ex) {
              throw new BaseDatosException("Error de la consulta",ex); 
            //System.out.println("Error:"+ex.getMessage());
        } finally {
            Conexion.desconectar();
        }
        return articulos;
    }
}
