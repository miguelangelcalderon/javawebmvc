/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.modelo;

import com.hazerta.pojos.Clientes;
import com.hazerta.pojos.Usuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Practicas
 */
public class LoginDAO {
    
    /*
    public String login(String user,String pass){
        String nif="";
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        String consulta="from Usuarios  WHERE login=:loginUser";
        Query q=sesion.createQuery(consulta);  
        q.setString("loginUser",user);
        Usuarios u=(Usuarios)q.uniqueResult();
        if (u.getPassword().equals(pass))
        {
            nif=u.getClientes().getNif();
        }
        return nif;
    }
    */
    public Usuarios login(String user){
        
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        String consulta="from Usuarios  WHERE login=:loginUser";
        Query q=sesion.createQuery(consulta);  
        q.setString("loginUser",user);
        Usuarios u=(Usuarios)q.uniqueResult();
        return u;
    }
    
    
    
}
