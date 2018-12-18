/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import excepciones.InstanceException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.InstanceNotFoundException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Proyecto;
import org.hibernate.Session;
import org.hibernate.Transaction;
import servicios.proyecto.ProyectoService;

/**
 *
 * @author LUCIA
 */
@WebServlet(name = "Inicio", urlPatterns = {"/Inicio"})
public class Inicio extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    Transaction t = session.beginTransaction();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, InstanceNotFoundException, InstanceException {
        ProyectoService ser = new ProyectoService(session,t);
        Proyecto proy = ser.obtenerPorId(1);
        
        request.setAttribute("proyecto",proy );
        request.getRequestDispatcher("indexInicio.jsp").forward(request, response);
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Inicio</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Inicio at " + request.getContextPath() + "</h1>");
//            ProyectoService servicio = new ProyectoService(session,t);
//            Proyecto proyecto;
//            try {
//                proyecto = servicio.obtenerPorId(1);
//                out.println("<h2>"+"^PROYECTO "+proyecto.getIdProyecto()+"<h2>");
//                out.println("<p>"+"^PROYECTO "+proyecto.getIdProyecto()+"<p>");
//            } catch (InstanceNotFoundException ex) {
//                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (InstanceException ex) {
//                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
//            }
//           
//           
//            out.println("</body>");
//            out.println("</html>");
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
        try {
            processRequest(request, response);
        } catch (InstanceNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstanceException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            ProyectoService ser = new ProyectoService(session,t);
        List<Proyecto> proy = ser.obtenerProyectos();
            request.getSession().setAttribute("proyecto",proy);
            //request.getSession().setAttribute("proyectoName", proy.getFfp());
      
            processRequest(request, response);
        } catch (InstanceNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstanceException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
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
