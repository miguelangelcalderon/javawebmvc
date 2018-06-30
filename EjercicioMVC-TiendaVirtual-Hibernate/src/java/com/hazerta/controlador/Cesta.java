/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.controlador;

import com.hazerta.modelo.ArticuloDAO;
import com.hazerta.pojos.Articulos;
import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Practicas
 */
public class Cesta extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
          // ACCION A REAOZAR SPBRE EL CARRITO
        String accion=request.getParameter("accion");
        HttpSession sesion=request.getSession();
        Hashtable<Integer,Articulos> carrito;
        if (sesion.getAttribute("cesta")==null)
        {
           sesion.setAttribute("cesta", new Hashtable<Integer,Articulos>());
        }
        if (sesion.getAttribute("total")==null)
        {
            sesion.setAttribute("total",0);
        }    
        
       
        
        carrito=(Hashtable<Integer,Articulos>)sesion.getAttribute("cesta");
        
        Integer cod=0;
        Integer cantidad=0;
        Articulos a=new Articulos();
        ArticuloDAO aDAO=new ArticuloDAO();
        
        if (request.getParameter("id")!=null)
        {
            cod=Integer.parseInt(request.getParameter("id"));
        }
        
        
         switch(accion) {
           
           case "add":
                         if (carrito.containsKey(cod)) {
                             a=carrito.get(cod);
                             cantidad=a.getCantidadCarrito();
                             cantidad++;
                             a.setCantidadCarrito(cantidad);
                             
                         } else {
                             a=aDAO.getById(cod);
                             a.setCantidadCarrito(1);
                         }
                         
                        
                         carrito.put(cod,a);
                         //pendiente de comprobar que no este ya..
                         sesion.setAttribute("cesta", carrito);
                         sesion.setAttribute("total",carrito.size());
                         request.getRequestDispatcher("cesta.jsp").forward(request, response);
           
                         break;
                         
           case "addOne":
                        //cantidad=carrito.get(cod).getCantidadCarrito();
                        //cantidad++;
                        //carrito.get(cod).setCantidadCarrito(cantidad);
                        //carrito.put(cod, carrito.get(cod));
                        a=carrito.get(cod);
                        cantidad=a.getCantidadCarrito();
                        cantidad++;
                        a.setCantidadCarrito(cantidad);
                        carrito.put(cod, a);
                        sesion.setAttribute("cesta", carrito);
                        sesion.setAttribute("total",carrito.size());
                        request.getRequestDispatcher("cesta.jsp").forward(request, response);
                        break;
           
           case "removeOne":
                       a=carrito.get(cod);
                       cantidad=a.getCantidadCarrito();
                       cantidad--;
                       if (cantidad==0) {
                           carrito.remove(cod);
                         
                       } else {
                           a.setCantidadCarrito(cantidad);
                           carrito.put(cod, a);
                       }
                       if (carrito.size()>0)
                       {sesion.setAttribute("cesta", carrito);
                        sesion.setAttribute("total",carrito.size());
                       }
                       else 
                       {sesion.setAttribute("cesta", null);
                        sesion.setAttribute("total",null);
                       }    
                       request.getRequestDispatcher("cesta.jsp").forward(request, response);
                       break;
           
           case "destroy":
                         sesion.setAttribute("cesta",null);    
                         sesion.setAttribute("total",null);
                         request.getRequestDispatcher("cesta.jsp").forward(request, response);
                         break;
           
           
           case "removeItem":
                        carrito.remove(cod);
                        sesion.setAttribute("cesta", carrito);
                        sesion.setAttribute("total",carrito.size());
                        if (carrito.size()==0)
                        {
                         sesion.setAttribute("cesta",null);    
                         sesion.setAttribute("total",null);
                        }
                        request.getRequestDispatcher("cesta.jsp").forward(request, response);
                        break;
                         
          default:    
                    System.out.println("Accion no reconocida");
       }
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
