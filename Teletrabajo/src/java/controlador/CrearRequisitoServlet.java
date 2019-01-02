/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.entidades.Prioridad;
import modelo.servicios.EntidadesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author LUCIA
 */
@WebServlet(name = "CrearRequisitoServlet", urlPatterns = {"/CrearRequisitoServlet"})
public class CrearRequisitoServlet extends HttpServlet {

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
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EntidadesService servicio = ctx.getBean(EntidadesService.class);
        
        String idProyecto = (String) request.getSession().getAttribute("idProyecto");
        System.out.println("entro en aki: "+idProyecto);
        List<Prioridad> listaPrioridades = servicio.listarPrioridades();
        request.getSession().setAttribute("listaPrioridades", listaPrioridades);
      //  request.
                
        String descripcion = (String) request.getSession().getAttribute("des");
        Enumeration t =request.getParameterNames();
        while(t.hasMoreElements()){
            System.out.println(t.nextElement());
        }
//        String prioridad = (String) request.getSession().getAttribute("exampleSelect1");
        System.out.println("------->descripcion2: "+descripcion+" "+request.getParameter("des"));
//        System.out.println("------->prioridad2: "+prioridad);
        response.setContentType("text/html;charset=UTF-8");
        response.sendRedirect("CrearRequisito.jsp");
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

                
        String descripcion = (String) request.getSession().getAttribute("descripcion");
        String prioridad = (String) request.getSession().getAttribute("prioridad");
        System.out.println("------->descripcion: "+descripcion);
        System.out.println("------->prioridad: "+prioridad);
        response.setContentType("text/html;charset=UTF-8");
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
