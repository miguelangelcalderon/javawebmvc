/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.modelo;


import com.hazerta.pojos.Proveedores;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Alumno
 */
public class ProveedorDAO {
    



        public ArrayList<Proveedores> getAll() {
            SessionFactory sf=HibernateUtil.getSessionFactory();
            Session sesion=sf.openSession();
            String consulta="from Proveedores";
            Query queryHibernate=sesion.createQuery(consulta);
            List<Proveedores> proveedores=queryHibernate.list();
            sesion.close();
            return  (ArrayList<Proveedores>) proveedores;
        }

         
         
     
}
