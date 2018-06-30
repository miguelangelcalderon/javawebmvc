/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pojos.Provincia;
/**
 *
 * @author Practicas
 */
public class ProvinciaDAO implements IProvinciaDAO {

    @Override
    public ArrayList<Provincia> getAll() {
        ArrayList<Provincia> provincias=new ArrayList<Provincia>();
        Connection miConexion=Conexion.conectar();
        String sql="select * from provincias order by nombre;";
        Statement sentencia;
        ResultSet registros;
        try {
            sentencia = miConexion.createStatement();
            registros=sentencia.executeQuery(sql);
            while(registros.next())
            {
                provincias.add(new Provincia(registros.getInt("cod_provincia"),registros.getString("nombre")));
            }
        } catch (SQLException ex) {
        } finally {
            Conexion.desconectar();
        }
         return provincias;
    }

    @Override
    public Provincia getById(int id) {
        //To change body of generated methods, choose Tools | Templates.
        return null;
    }
    
}
