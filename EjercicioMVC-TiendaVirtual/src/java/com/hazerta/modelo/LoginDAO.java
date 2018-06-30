/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.modelo;

import com.hazerta.pojos.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Practicas
 */
public class LoginDAO {
    
    public String login(String user,String pass){
           String nif="";
           
           Connection miConexion=Conexion.conectar();
           Statement sentencia;
           ResultSet registros;
           String sql="SELECT * FROM usuarios WHERE login like '"
                   +user+"' AND password like '"+pass+"'";
           try {
            sentencia=miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
            
            if (registros.next())
            { 
              nif=registros.getString("nif_cliente");
            }
            
           }catch (SQLException ex){
           }finally {Conexion.desconectar();}
           return nif;
    }
    
    
    
}
