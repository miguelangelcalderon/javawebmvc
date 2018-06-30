/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.modelo;

import com.hazerta.pojos.Articulos;
import com.hazerta.pojos.Categorias;
import com.hazerta.pojos.Proveedores;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Alumno
 */
public class ArticuloDAO {
     public boolean insert(Articulos a) {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        Transaction t=sesion.beginTransaction();
        boolean error=true;
        try {
                sesion.save(a);
                t.commit();
            }catch(Exception e)
            {
                error=false;
                t.rollback();
            }finally{
            sesion.close();
            }
         return error;
            
      }
     
     public ArrayList<Articulos> getAll() {
         
         
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        String consulta="from Articulos";
        Query queryHibernate=sesion.createQuery(consulta);
        List<Articulos> articulos=queryHibernate.list();
        sesion.close();
        return  (ArrayList<Articulos>) articulos;
    
    }
     
     public ArrayList<Object[]> getAllAlgunosCampos() {
         
         
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        String consulta="SELECT a.idArticulo,a.nombre,a.pvp  FROM Articulos a";
        Query queryHibernate=sesion.createQuery(consulta);
        List<Object[]> articulos=queryHibernate.list();
        sesion.close();
        return  (ArrayList<Object[]>) articulos;
    
    }
     
     
     
     public ArrayList<Articulos> getAll(int categoria,int limite) {
        
        
        /*
        String sql="SELECT a.*,prov.nombre as nombreProveedor,cat.nombre as nombreCategoria "
                + " FROM articulos a, proveedores prov, categorias cat "
               + " where (a.id_proveedor=prov.id_proveedor)AND(a.id_categoria=cat.id_categoria) order by id_articulo";
         */
         
        return null;
    }
     
     
     public Articulos getById(int codigo) {
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        Articulos a=(Articulos)sesion.get(Articulos.class,codigo);
        return a;
    
    }
     
     
      public ArrayList<Articulos> getThree(int id) {
        
        //String sql="SELECT id_articulo, nombre, Pvp, foto FROM articulos where (articulos.id_categoria="+id+") limit 3";
        //Este metodo es el .getAll. Hay que reescribirlo a .getThree.
        
        SessionFactory sf=NewHibernateUtil.getSessionFactory();   
        Session sesion=sf.openSession();                       
        String consulta="from Articulos where categorias.idCategoria=:cat";
        Query queryHibernate=sesion.createQuery(consulta);     
        queryHibernate.setInteger("cat", id);
        queryHibernate.setMaxResults(3);
        List<Articulos> articulos=queryHibernate.list();  
        return (ArrayList)articulos;      
                 
    }
     
     
     

     
}
