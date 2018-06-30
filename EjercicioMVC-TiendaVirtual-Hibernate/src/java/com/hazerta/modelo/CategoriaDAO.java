/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.modelo;

import com.hazerta.pojos.Categorias;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Alumno
 */
public class CategoriaDAO {
       public ArrayList<Categorias> getAll() {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        String consulta="from Categorias";
        Query queryHibernate=sesion.createQuery(consulta);
        List<Categorias> categorias=queryHibernate.list();
        sesion.close();
        return  (ArrayList<Categorias>) categorias;
    }
       
    public Categorias getById(int id){
        
        
       SessionFactory sf=HibernateUtil.getSessionFactory();
       Session sesion=sf.openSession();
       Categorias c=(Categorias)sesion.get(Categorias.class,id);
       return c;
    }
        

}
