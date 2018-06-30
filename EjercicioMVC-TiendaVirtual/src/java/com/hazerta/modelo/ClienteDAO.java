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


public class ClienteDAO {
    
    public Cliente getByNif(String nif){
         Connection miConexion=Conexion.conectar();
           Statement sentencia;
           ResultSet registros;
           String sql="SELECT * FROM clientes WHERE nif  like '"+nif+"'";
           Cliente c=new Cliente();
           try {
            sentencia=miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
            registros.next();
            
            c.setNif(nif);
            c.setApellidos(registros.getString("apellidos"));
            c.setNombre(registros.getString("nombre"));
            c.setDireccion(registros.getString("direccion"));
            c.setEmail(registros.getString("email"));
            c.setTelefono(registros.getInt("telefono"));
           }catch (SQLException ex){
           }finally {Conexion.desconectar();}
        return c;
    }
    
    
}
