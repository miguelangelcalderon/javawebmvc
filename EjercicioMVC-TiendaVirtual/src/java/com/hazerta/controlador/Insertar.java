/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hazerta.controlador;

import com.hazerta.modelo.ArticuloDAO;
import com.hazerta.modelo.CategoriaDAO;
import com.hazerta.modelo.ProveedorDAO;
import com.hazerta.pojos.Articulo;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class Insertar extends HttpServlet {

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
        
        ArticuloDAO aDAO = new ArticuloDAO();
        CategoriaDAO cDAO=new CategoriaDAO();
        ProveedorDAO pDAO=new ProveedorDAO();
        
        Articulo a = new Articulo();

        a.setNombre(request.getParameter("nombre"));
        a.setDescripcion(request.getParameter("descripcion"));
        a.setPvp(Integer.parseInt(request.getParameter("pvp")));
        a.setStock(Integer.parseInt(request.getParameter("stock")));
        a.setFoto(request.getParameter("foto"));
        // a.getId_categoria().setId(Integer.parseInt(request.getParameter("id_categoria")));
       // a.setId_categoria(Integer.parseInt(request.getParameter("categoria")));
       // a.setId_proveedor(Integer.parseInt(request.getParameter("proveedor")));
        String nombreCategoria=cDAO.getById(Integer.parseInt(request.getParameter("categoria")));
        String nombreProveedor=pDAO.getById(Integer.parseInt(request.getParameter("proveedor")));
        a.getCategoria().setId_categoria(Integer.parseInt(request.getParameter("categoria")));
        a.getCategoria().setNombre(nombreCategoria);
        a.getProveedor().setId_proveedor(Integer.parseInt(request.getParameter("proveedor")));
        a.getProveedor().setNombre(nombreProveedor);
       
       
        a.setNovedad(Short.parseShort(request.getParameter("novedad")));
        a.setOferta(Short.parseShort(request.getParameter("oferta")));
        
        aDAO.insert(a);
        request.setAttribute("articulo", a);
        request.getRequestDispatcher("detalle-articulo.jsp").forward(request, response);
        
        
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
