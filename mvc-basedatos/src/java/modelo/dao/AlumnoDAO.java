
package modelo.dao;

import excepciones.DataBaseException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


import modelo.util.DbConexion;
import modelo.vo.Alumno;

/**
 * Esta clase se utiliza para realizar un CRUD
 * de la tabla alumnos
 * @author Miguel Angel Calderon
 * @version 0.0.1
 */
@WebService(serviceName = "AlumnoDAO")
public class AlumnoDAO {
    
        private Connection conexion=null;
        private Statement sentencia=null;
        private ResultSet registros=null;
        /**
        * Metodo que devuelve una lista con todos los alumnos
        * @return ArrayList Lista de alumnos de tipo Array
        * @see controlador.controlador llama a este metodo
        * @throws excepciones.DataBaseHelper
        */
        
        public ArrayList<Alumno> listar() throws DataBaseException {
            ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
            
            try {
                DbConexion db=new DbConexion();
                conexion=db.conectar();
                String consulta="SELECT * FROM alumnos;";
                sentencia=conexion.createStatement();
                registros=sentencia.executeQuery(consulta);
                while (registros.next())
                {
                    Alumno a=new Alumno();
                    a.setIdAlumno(registros.getInt("pk_alumno"));
                    a.setNombreAlumno(registros.getString("nombre"));
                    a.setApellidosAlumno(registros.getString("apellidos"));
                    a.setEmailAlumno(registros.getString("email"));
                    a.setEliminado(registros.getBoolean("eliminado"));
                    alumnos.add(a);
                    a=null;
                }
                conexion.close();
                sentencia.close();
                registros.close();
            }catch(SQLException e)
            {
               System.out.println("Error en la cosulta SQL "+e.getMessage());
               throw new DataBaseException("Error en la consulta", e);
            }
            
            return alumnos;
        }    

        /**
        * Metodo que devuelve un objeto de tipo Alumno
        * @return Alumno el objeto de tipo alumno
        * @param  cod_alumno el codigo delalumno    
        */
        
        public Alumno ver(int cod_alumno) throws DataBaseException
        {
           Alumno a=new Alumno();
            try {
                DbConexion db=new DbConexion();
                conexion=db.conectar();
                String consulta="SELECT * FROM alumnos WHERE pk_alumno="+cod_alumno;
                sentencia=conexion.createStatement();
                registros=sentencia.executeQuery(consulta);
                registros.next();
                a.setIdAlumno(registros.getInt("pk_alumno"));
                a.setNombreAlumno(registros.getString("nombre"));
                a.setApellidosAlumno(registros.getString("apellidos"));
                a.setEmailAlumno(registros.getString("email"));
                a.setEliminado(registros.getBoolean("eliminado"));
                conexion.close();
                sentencia.close();
                registros.close();
             }catch(SQLException e)
            {
               System.out.println("Error "+e.getMessage());
                throw new DataBaseException("Error en la consulta", e);
            }
            return a;
        }        
        
        // Preparando un metodo para un webservice
        @WebMethod(operationName = "verWS")
        public String verWS(@WebParam(name = "id") int cod_alumno) throws DataBaseException
        {
            String respuesta="";
            try {
                DbConexion db=new DbConexion();
                conexion=db.conectar();
                String consulta="SELECT * FROM alumnos WHERE pk_alumno="+cod_alumno;
                sentencia=conexion.createStatement();
                registros=sentencia.executeQuery(consulta);
                registros.next();
                respuesta="El nombre y apellido del alumno es:"
                        +registros.getString("nombre")
                        +" "+registros.getString("apellidos");
                conexion.close();
                sentencia.close();
                registros.close();
             }catch(SQLException e)
            {
               System.out.println("Error "+e.getMessage());
                throw new DataBaseException("Error en la consulta", e);
            }
            return respuesta;
        }
        
        
}
