/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.modelo;


import com.hazerta.pojos.Proveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ProveedorDAO {
         public ArrayList<Proveedor> getAll() {
        
       ArrayList<Proveedor> proveedores= new ArrayList<Proveedor>();
        
        Connection miConexion= Conexion.conectar();
        Statement sentencia;
        ResultSet registros;
        
        String sql = "select * from proveedores order by nombre";
        try {
            sentencia=miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
            
            while(registros.next()){
        
                proveedores.add(new Proveedor(registros.getInt("id_proveedor"),registros.getString("nombre"),registros.getString("logo")));

            }
            
        } catch (SQLException ex) {
            
        }finally{
            Conexion.desconectar();
        }
        
        
        return proveedores;
    }

         
         
     public String getById(int id) {
        
        Connection miConexion= Conexion.conectar();
        Statement sentencia;
        ResultSet registros;
        
        String sql = "select nombre from proveedores where id_proveedor = "+id;
        String nombre="";
        try {
            sentencia=miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
            
            while(registros.next()){
                nombre=registros.getString("nombre");
                

            }
            
        } catch (SQLException ex) {
            
        }finally{
            Conexion.desconectar();
        }
           
        
        
        return nombre;
    
    }
}
