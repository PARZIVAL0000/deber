/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ModeloDAO.AlumnosDAO;
import javax.servlet.RequestDispatcher;
import java.util.List;
import java.util.ArrayList;
import Modelo.Alumnos;

/**
 *
 * @author denni
 */
@WebServlet(name = "AlumnosControllers", urlPatterns = {"/AlumnosControllers"})
public class AlumnosControllers extends HttpServlet {

   

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AlumnosDAO ad = new AlumnosDAO();
        
        //Para mostrar informacion en la parte visual.
        RequestDispatcher dispatcher = null;
        
        //verificar por la solicitud del usuario
        String accion = request.getParameter("accion");
        
        if(accion == null){
            dispatcher = request.getRequestDispatcher("alumno/listar.jsp");
            /*dentro de este punto generaremos una informacion para que pueda ser renderizado dentro de nuestro html...*/
            List<Alumnos> alumnosListado = ad.listarEstudiantes();
            request.setAttribute("listado", alumnosListado);
            
        }else if(accion.equals("listar")){
            dispatcher = request.getRequestDispatcher("alumno/listar.jsp");
        }
        
        dispatcher.forward(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
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
