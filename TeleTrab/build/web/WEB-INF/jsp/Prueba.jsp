<%-- 
    Document   : Prueba
    Created on : 26-dic-2018, 11:51:22
    Author     : LUCIA
--%>

<%@page import="java.util.Date"%>
<%@page import="modelo.entidades.Proyecto"%>
<%@page import="modelo.entidades.Tipoalerta"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 
             <% List<Proyecto> listProyectos = (List<Proyecto>) session.getAttribute("lista");
                
                for(int i=0;i<listProyectos.size();i++){
                    Proyecto proyecto = listProyectos.get(i);
                    int id =proyecto.getIdProyecto();
                    Date ffp =proyecto.getFfp();
                    Date ffr=proyecto.getFfr();
                    Date fip=proyecto.getFip();
                    Date fir=proyecto.getFir();
                   String nombre= proyecto.getNombre();

                %>
                
                <%=nombre%>
                <%}%>
    </body>
</html>
