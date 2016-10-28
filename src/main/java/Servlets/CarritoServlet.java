/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Entidades.ArticuloBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno
 */
@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {
    
    Hashtable carritoHT;
    int udArt1 = 0;
    int udArt2 = 0;
    int udArt3 = 0;
    int udArt4 = 0;
    int udArt5 = 0;
    
    
    @Override
    public void init(){
        carritoHT = new Hashtable();
        ArticuloBean art1 = new ArticuloBean("Camisa", "25");
        ArticuloBean art2 = new ArticuloBean("Pantalon", "20");
        ArticuloBean art3 = new ArticuloBean("Jersey", "30");
        ArticuloBean art4 = new ArticuloBean("Zapatos", "45");
        ArticuloBean art5 = new ArticuloBean("Chaqueta", "60");
        
        /*carritoHT.put("articulo1", art1);
        carritoHT.put("articulo2", art2);
        carritoHT.put("articulo3", art3);
        carritoHT.put("articulo4", art4);
        carritoHT.put("articulo5", art5);*/
    }

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            ArticuloBean articulo = new ArticuloBean("nom", "pre");
            articulo.setNombre(request.getParameter("nombre"));
            boolean existe = false;
            
            Enumeration e = carritoHT.keys();
            while(e.hasMoreElements()){
                String clave = (String) e.nextElement();
                ArticuloBean valor = (ArticuloBean) carritoHT.get(clave);
                if(articulo.getNombre().equals(valor.getNombre())){
                    existe = true;
                    switch(valor.getNombre()){
                       case "Camisa":
                           udArt1++;
                           break;
                        case "Pantalon":
                           udArt2++;
                           break;
                        case "Jersey":
                           udArt3++;
                           break;
                        case "Zapatos":
                           udArt4++;
                           break;
                        case "Chaqueta":
                           udArt5++;
                   }
                }
                if(!existe){
                   carritoHT.put(clave, valor);
                   switch(valor.getNombre()){
                       case "Camisa":
                           udArt1++;
                           break;
                        case "Pantalon":
                           udArt2++;
                           break;
                        case "Jersey":
                           udArt3++;
                           break;
                        case "Zapatos":
                           udArt4++;
                           break;
                        case "Chaqueta":
                           udArt5++;
                   }
                }
            }
            
            RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/FinalizarCompra.java");
            rd.forward(request, response);
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
