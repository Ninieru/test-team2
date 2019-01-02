/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.InstanceNotFoundException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.entidades.Informe;
import modelo.entidades.Proyecto;
import modelo.entidades.Requisito;
import modelo.entidades.Tarea;
import modelo.servicios.EntidadesService;
import modelo.servicios.IEntidadesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 *
 * @author LUCIA
 */
public class InicioServlet extends HttpServlet {

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
        String id = (String) request.getParameter("idProyecto");
        Set<Tarea> conjuntoAlertas = new HashSet();
        Set<Informe> conjuntoInformes = new HashSet();
        try {
            Proyecto proyecto = servicio.obtenerProyectoId(Integer.valueOf(id));

        } catch (InstanceNotFoundException ex) {
            Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<Requisito> listaRequisitos = servicio.listarRequisitos();
        for (int i = 0; i < listaRequisitos.size(); i++) {
            Requisito requisito = listaRequisitos.get(i);
            Set<Tarea> tareas = requisito.getTareas();

            for (Tarea t : tareas) {
                conjuntoAlertas.addAll(t.getAlertas());
                conjuntoInformes.addAll(t.getInformes());
            }
        }

        request.getSession().setAttribute("listaRequisitos", listaRequisitos);
        request.getSession().setAttribute("conjuntoAlerta", conjuntoAlertas);
        request.getSession().setAttribute("conjuntoInformes", conjuntoInformes);
        request.getSession().setAttribute("idProyecto", id);
        response.sendRedirect("DetalleProyecto.jsp");

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
       ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EntidadesService servicio = ctx.getBean(EntidadesService.class);
//        IEntidadesService servicio = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext()).getBean(EntidadesService.class);
        List<Proyecto> lista = servicio.listarProyectos();
        request.getSession().setAttribute("lista", lista);
        response.sendRedirect("indexProyectos.jsp");
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
