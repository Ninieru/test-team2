<%-- 
    Document   : Prueba
    Created on : 26-dic-2018, 11:51:22
    Author     : LUCIA
--%>

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
    <% List<Tipoalerta> listTipoAlerta = (List<Tipoalerta>) session.getAttribute("lista");
                
                for(int i=0;i<listTipoAlerta.size();i++){
                    Tipoalerta talerta = listTipoAlerta.get(i);
                    String nombre = talerta.getTipoAlerta();
                    int id = talerta.getIdTipoAlerta();

                %>
                
                <%=nombre%>
                <%}%>
    </body>
</html>
