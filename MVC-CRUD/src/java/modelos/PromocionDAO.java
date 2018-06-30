/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import pojos.Promocion;
import pojos.Provincia;


/**
 *
 * @author Practicas
 */
public class PromocionDAO implements IpromocionesDAO {
    
    /**
     * Deveuel un listado de Arryas de objetos de tipo Promocion
     * @return ArrayList<Promocion>
     */
    /*public ArrayList<Promocion> listar(){
        
         ArrayList<Promocion> promociones=new ArrayList<Promocion>();
         Connection miConexion=Conexion.conectar();
         //Statement sentencia;
         //ResultSet registros;
         String sql="select p.nombre as nombrePromocion,prov.nombre as nombreProvincia\n" +
                       "from promociones p,provincias prov\n" +
                       "WHERE p.cod_provincia=prov.cod_provincia\n" +
                       "order by 1;";
        Statement sentencia;
        ResultSet registros;
        try {
            sentencia = miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
            while(registros.next())
            {
               promociones.add(new Promocion(registros.getString(1),registros.getString(2)));
            }
        } catch (SQLException ex) {
  
        }
        
    return promociones;
    
} */

    @Override
    public ArrayList<Promocion> getAll() {
        
        ArrayList<Promocion> promociones=new ArrayList<Promocion>();
        Connection miConexion=Conexion.conectar();
        String sql="select p.*,prov.nombre as nombreProvincia " +
                   " from promociones p,provincias prov " +
                   " where p.cod_provincia=prov.cod_provincia;";
        Statement sentencia;
        ResultSet registros;
        try {
            sentencia = miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
            while(registros.next())
            {
                Promocion p=new Promocion();
                p.setId(registros.getInt("cod_promocion"));
                p.setNombre(registros.getString("nombre"));
                p.setDescripcion(registros.getString("descripcion"));
                p.setDireccion(registros.getString("Direccion"));
                p.setLocalidad(registros.getString("localidad"));
                p.setFoto(registros.getString("foto"));
                
                Provincia pro=new Provincia(registros.getInt("cod_provincia"),registros.getString("nombreProvincia"));
                p.setProvincia(pro);
                promociones.add(p);
            }
        } catch (SQLException ex) {
        } finally {
            Conexion.desconectar();
        }
       
        return promociones;
    }

    @Override
    public Promocion getById(int id) {
        Connection miConexion=Conexion.conectar();
        String sql="select * from promociones where cod_promocion="+id;
        Statement sentencia;
        ResultSet registros;
        Promocion p=new Promocion();
        try {
            sentencia = miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
            registros.next();
            p.setId(registros.getInt("cod_promocion"));
            p.setNombre(registros.getString("nombre"));
            p.setDescripcion(registros.getString("descripcion"));
            p.setDireccion(registros.getString("Direccion"));
            p.setFoto(registros.getString("foto"));
            p.setLocalidad(registros.getString("localidad"));
            
            Provincia pro=new Provincia(registros.getInt("cod_provincia"),"");
            p.setProvincia(pro); 
        
        } catch (SQLException ex) {
        } finally {
            Conexion.desconectar();
        }
        return p;
    }

    @Override
    public boolean insert(Promocion p) {
        boolean respuesta=true;
        Connection miConexion=Conexion.conectar();
        /*    String sql="INSERT INTO promociones  VALUES ("+p.getId()
                    +",'"+p.getNombre()
                    +"','"+p.getDescripcion()
                    +"','"+p.getFoto()
                    +"','"+p.getDireccion()
                    +"','"+p.getLocalidad()
                    +"',"+p.getProvincia().getId()+");";
        */            
        // Vesion con sentencias preparadas
        String sql2="INSERT INTO promociones"
                + " (nombre,descripcion,foto,Direccion,localidad,cod_provincia)"
                + "  VALUES (?,?,?,?,?,?)";
        
        try {
           
            Statement sentencia;
            
            PreparedStatement sp=miConexion.prepareStatement(sql2);
            sp.setString(1,p.getNombre());
            sp.setString(2,p.getDescripcion());
            sp.setString(3,p.getFoto());
            sp.setString(4,p.getDireccion());
            sp.setString(5,p.getLocalidad());
            sp.setInt(6,p.getProvincia().getId());
            sp.executeUpdate();
            //sentencia = miConexion.createStatement();
            //sentencia.executeUpdate(sql);
         
        } catch (SQLException ex) {
            respuesta=false;
        } finally {
            Conexion.desconectar();
        }
        return respuesta;
    }

    @Override
    public boolean update(Promocion p) {
       
          boolean respuesta=true;
        Connection miConexion=Conexion.conectar();
         
        String sql2="UPDATE promociones SET nombre=?,descripcion=?,foto=?,Direccion=?,localidad=?,cod_provincia=? "
                + "WHERE cod_promocion=?";
        
        try {
           
            Statement sentencia;
            
            PreparedStatement sp=miConexion.prepareStatement(sql2);
            
            sp.setString(1,p.getNombre());
            sp.setString(2,p.getDescripcion());
            sp.setString(3,p.getFoto());
            sp.setString(4,p.getDireccion());
            sp.setString(5,p.getLocalidad());
            sp.setInt(6,p.getProvincia().getId());
            sp.setInt(7,p.getId());
            
            sp.executeUpdate();
            //sentencia = miConexion.createStatement();
            //sentencia.executeUpdate(sql);
         
        } catch (SQLException ex) {
            respuesta=false;
        } finally {
            Conexion.desconectar();
        }
        return respuesta;
        
        
        
    }

    @Override
    public boolean delete(int id) {
        boolean respuesta=true;
        Connection miConexion=Conexion.conectar();
        Statement sentencia;
        ResultSet registros;
        boolean puedoEliminar=true;
        String sql1="SELECT * FROM edificios where cod_promocion="+id;
        try {
            sentencia = miConexion.createStatement();
            registros=sentencia.executeQuery(sql1);
            if (registros.next())
            {
                puedoEliminar=false;
                respuesta=false;
            }
          } catch (SQLException ex) {
              respuesta=false;
          } 
            if (puedoEliminar) {
                String sql2="DELETE from PROMOCIONES WHERE cod_promocion="+id;
                try{
                     sentencia = miConexion.createStatement();
                     sentencia.executeUpdate(sql2);

                }catch(SQLException ex) {
                    respuesta=false;
                } finally {
                Conexion.desconectar();
            }
        }
        return respuesta;
    }
            
    
}
