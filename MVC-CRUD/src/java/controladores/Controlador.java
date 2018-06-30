/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.PromocionDAO;
import pojos.Promocion;
import java.util.ArrayList;
import pojos.Provincia;

/**
 *
 * @author Practicas
 */
public class Controlador extends HttpServlet {

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
       
       String accion=request.getParameter("accion");
       PromocionDAO pDAO=new PromocionDAO();
       String mensajeOK="";
       String mensajeKO="";
       switch(accion) {
           
           case "listar":
                         ArrayList<Promocion> promociones=pDAO.getAll();
                         request.setAttribute("datos", promociones);
                         request.getRequestDispatcher("listado.jsp").forward(request, response);
                         break;
           case "actualizar":
                         Integer cod_promocion=Integer.parseInt(request.getParameter("codigo"));
                         Promocion p=this.leerDatos(request);
                         p.setId(cod_promocion);
                         if (pDAO.update(p)) {
                             mensajeOK="Promocion con nombre "+p.getNombre()+" actualizada";
                         } else {
                             mensajeKO="Error al actualizar la promocion";
                         }
                         request.setAttribute("mensajeOK",mensajeOK);
                         request.setAttribute("mensajeKO",mensajeKO);
                         request.getRequestDispatcher("Controlador?accion=listar").forward(request, response);
                         break;
            case "editar":
                        Integer cod_promo=Integer.parseInt(request.getParameter("id"));
                        Promocion pro=pDAO.getById(cod_promo);
                        request.setAttribute("datos", pro);
                        request.getRequestDispatcher("editar.jsp").forward(request, response);
                        break;
               
           case "insertar":
                         Promocion np=this.leerDatos(request);
                         pDAO.insert(np);
                         if (pDAO.insert(np)) {
                             mensajeOK="Promocion con nombre "+np.getNombre()+" insertada";
                         } else {
                             mensajeKO="Error al insertar la promocion";
                         }
                         request.setAttribute("mensajeOK",mensajeOK);
                         request.setAttribute("mensajeKO",mensajeKO);
                         request.getRequestDispatcher("Controlador?accion=listar").forward(request, response);
                         break;
           case "eliminar":
                         Integer cod=Integer.parseInt(request.getParameter("id"));
                         if (pDAO.delete(cod)) {
                             mensajeOK="La promocion ha sido eliminada";
                         } else {
                             mensajeKO="Error la eliminar la promocion";
                         }
                         request.setAttribute("mensajeOK",mensajeOK);
                         request.setAttribute("mensajeKO",mensajeKO);
                   
                         request.getRequestDispatcher("Controlador?accion=listar").forward(request, response);
                         break;
                         
           default:    
           
           
           
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

    
  private Promocion leerDatos(HttpServletRequest request){
      
                        
    Promocion p=new Promocion();

    p.setNombre(request.getParameter("nombre"));
    p.setDescripcion(request.getParameter("descripcion"));
    p.setDireccion(request.getParameter("direccion"));
    p.setFoto(request.getParameter("foto"));
    p.setLocalidad(request.getParameter("localidad"));
    p.getProvincia().setId(Integer.parseInt(request.getParameter("provincia")));

      
      return p;
  }
    
    
}
