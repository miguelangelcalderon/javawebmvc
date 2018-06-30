/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.modelo;

import com.hazerta.pojos.Articulo;
import com.hazerta.pojos.Categoria;
import com.hazerta.pojos.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ArticuloDAO {
     public boolean insert(Articulo a) {
        
        Connection miConexion= Conexion.conectar();
        String sql2 = "insert into articulos (nombre, descripcion,Pvp,Stock,foto,id_categoria, id_proveedor,novedad,oferta) values(?,?,?,?,?,?,?,?,?)";
        boolean respuesta=true;
        try {
       
            Statement sentencia;
            PreparedStatement sp=miConexion.prepareStatement(sql2);
            
            sp.setString(1, a.getNombre());
            sp.setString(2, a.getDescripcion());
            sp.setInt(3, a.getPvp());
            sp.setInt(4, a.getStock());
            sp.setString(5, a.getFoto());
            sp.setInt(6, a.getCategoria().getId_categoria());
            sp.setInt(7, a.getProveedor().getId_proveedor());
            sp.setShort(8, a.getNovedad());
            sp.setShort(9, a.getOferta());

            sp.executeUpdate();

        } catch (SQLException ex) {
            respuesta=false;
        }finally{
            Conexion.desconectar();
        }
        return respuesta;
    }
     
     public ArrayList<Articulo> getAll() {
        ArrayList<Articulo> articulos= new  ArrayList<Articulo>();
        Connection miConexion=Conexion.conectar();
        Statement sentencia;
        ResultSet registros;
        String sql="SELECT a.*,prov.nombre as nombreProveedor,cat.nombre as nombreCategoria "
                + " FROM articulos a, proveedores prov, categorias cat "
               + " where (a.id_proveedor=prov.id_proveedor)AND(a.id_categoria=cat.id_categoria) order by id_articulo";
         
         
        try {
            sentencia=miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
          while(registros.next()){
                Articulo a=new Articulo();
                a.setId(registros.getInt("id_articulo"));
                a.setNombre(registros.getString("nombre"));
                a.setDescripcion(registros.getString("descripcion"));
                a.setPvp(registros.getInt("Pvp"));
                a.setStock(registros.getInt("Stock"));
                a.setFoto(registros.getString("foto"));
                a.setNovedad(registros.getShort("novedad"));
                a.setOferta(registros.getShort("oferta"));
                a.setCategoria(new Categoria(registros.getInt("id_categoria"),registros.getString("nombreCategoria")));
                a.setProveedor(new Proveedor(registros.getInt("id_proveedor"),registros.getString("nombreProveedor"),""));
                articulos.add(a);
          }
        
    }catch (SQLException ex){
}finally {Conexion.desconectar();}
       //To change body of generated methods, choose Tools | Templates.
         return articulos;
    
    }
     
     public ArrayList<Articulo> getAll(int categoria,int limite) {
        ArrayList<Articulo> articulos= new  ArrayList<Articulo>();
        Connection miConexion=Conexion.conectar();
        Statement sentencia;
        ResultSet registros;
        String sql="SELECT a.*,prov.nombre as nombreProveedor,cat.nombre as nombreCategoria "
                + " FROM articulos a, proveedores prov, categorias cat "
               + " where (a.id_proveedor=prov.id_proveedor)AND(a.id_categoria=cat.id_categoria) order by id_articulo";
         
         
        try {
            sentencia=miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
          while(registros.next()){
                Articulo a=new Articulo();
                a.setId(registros.getInt("id_articulo"));
                a.setNombre(registros.getString("nombre"));
                a.setDescripcion(registros.getString("descripcion"));
                a.setPvp(registros.getInt("Pvp"));
                a.setStock(registros.getInt("Stock"));
                a.setFoto(registros.getString("foto"));
                a.setNovedad(registros.getShort("novedad"));
                a.setOferta(registros.getShort("oferta"));
                a.setCategoria(new Categoria(registros.getInt("id_categoria"),registros.getString("nombreCategoria")));
                a.setProveedor(new Proveedor(registros.getInt("id_proveedor"),registros.getString("nombreProveedor"),""));
                articulos.add(a);
          }
        
    }catch (SQLException ex){
}finally {Conexion.desconectar();}
       //To change body of generated methods, choose Tools | Templates.
         return articulos;
    
    }
     
     
     
     public Articulo getById(int codigo) {
        Articulo a= new Articulo();
        Connection miConexion=Conexion.conectar();
        Statement sentencia;
        ResultSet registros;
        String sql="SELECT a.*,prov.nombre as nombreProveedor,cat.nombre as nombreCategoria "
                + " FROM articulos a, proveedores prov, categorias cat "
               + " where (a.id_proveedor=prov.id_proveedor) AND (a.id_categoria=cat.id_categoria) "
               + "AND a.id_articulo="+codigo; 
         
        try {
            sentencia=miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
            registros.next();
           
            a.setId(registros.getInt("id_articulo"));
            a.setNombre(registros.getString("nombre"));
            a.setDescripcion(registros.getString("descripcion"));
            a.setPvp(registros.getInt("Pvp"));
            a.setStock(registros.getInt("Stock"));
            a.setFoto(registros.getString("foto"));
            a.setNovedad(registros.getShort("novedad"));
            a.setOferta(registros.getShort("oferta"));
            a.setCategoria(new Categoria(registros.getInt("id_categoria"),registros.getString("nombreCategoria")));
            a.setProveedor(new Proveedor(registros.getInt("id_proveedor"),registros.getString("nombreProveedor"),""));
        
    }catch (SQLException ex){
}finally {Conexion.desconectar();}
       //To change body of generated methods, choose Tools | Templates.
         return a;
    
    }
     
     
     
     
     
     

     
}
