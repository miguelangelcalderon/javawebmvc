/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.modelo;

import com.hazerta.pojos.Categoria;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class CategoriaDAO {
       public ArrayList<Categoria> getAll() {
        
       ArrayList<Categoria> categorias= new ArrayList<Categoria>();
        
        Connection miConexion= Conexion.conectar();
        Statement sentencia;
        ResultSet registros;
        
        String sql = "select * from categorias order by nombre";
        try {
            sentencia=miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
            
            while(registros.next()){
        
                categorias.add(new Categoria(registros.getInt("id_categoria"),registros.getString("nombre")));

            }
            
        } catch (SQLException ex) {
            
        }finally{
            Conexion.desconectar();
        }
        
        
        return categorias;
    }
       
       
    public String getById(int id) {
        
        Connection miConexion= Conexion.conectar();
        Statement sentencia;
        ResultSet registros;
        
        String sql = "select nombre from categorias where id_categoria = "+id;
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
