<%-- 
    Document   : DetalleProyecto
    Created on : 27-dic-2018, 11:51:47
    Author     : LUCIA
--%>

<%@page import="modelo.entidades.Informe"%>
<%@page import="modelo.entidades.Alerta"%>
<%@page import="java.util.Set"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="modelo.entidades.Requisito"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>Rawson BPO</title>
    

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/styleacordeon.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
  

    </head>
    <link rel="shortcut icon" href="img/favicon.ico">
    <body>
          <div class="wrapper">
        <!-- Sidebar  -->
        <nav id="sidebar">
               <div class="sidebar-header">
                    <img src="img/LOGO-RAWSONBPO-9.png" height="70"  alt=""/>
                   
                </div>

                
                <ul class="list-unstyled components">

                   <li>
                       <a href="crea_requisito.html">
                            <i class="glyphicon glyphicon-briefcase"></i>
                            Crear Requisito
                        </a>
                       
                    </li>
                    
                     <li >
                        <a href="crea_incidencia.html">
                            <i class="glyphicon glyphicon-duplicate"></i>
                            Crear Incidencia
                        </a>
                    </li>
                    
                    <li>
                        <a href="repositorio.html">
                            <i class="glyphicon glyphicon-cloud"></i>
                           Repositorio
                        </a>
                    </li>
                  
                     <li >
                        <a href="crea_alerta.html">
                            <i class="glyphicon glyphicon-flag"></i>
                            Crear Alerta
                        </a>
                    </li>

                    
                </ul>


                <!--<ul class="list-unstyled CTAs">
                   
                  <li><a 
                           href="#" class="article"><i class="glyphicon glyphicon-earphone"></i>Llamar a Chicho</a></li>
              </ul>-->
            </nav>


        <!-- Page Content  -->
        <div id="content">

            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">

                    <button type="button" id="sidebarCollapse" class="btn btn-info">
                        <i class="glyphicon glyphicon-list"></i>
                    </button>
                    <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-align-justify"></i>
                    </button>
             

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="nav navbar-nav ml-auto">
                             <li class="nav-item active">
                                <a class="nav-link" href="proyecto.html">Proyectos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="chat.html">Chat</a>
                            </li>
                           
                             <li class="nav-item dropdown">
                                <a class="nav-link " data-toggle="dropdown" href="#" role="button" >Idioma</a>
                                    <div class="dropdown-menu">
                                        <a class="dropdown-item" href="#"></a>
                                        <a class="dropdown-item" href="#">Inglés</a>
                                        <a class="dropdown-item" href="#">Francés</a>
      
                                    </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="perfil.html">Perfil</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>


<!-- ACORDEON -->

           <!-- <div class="container"> 
            <div class="col-md-12">
                <center>-->
                    <div class="row">
    <div class="col-5">
     
    </div>
    <div class="col form-group row col-5">
                    <p class="proy">PROYECTO 1</p>
                </div>
                <div class="col-2">
     
    </div>
            </div>
                    
                    <div class="col-md-12">

                        <div class="panel-group" id="accordion9" role="tablist" aria-multiselectable="true">

                            <div class="panel panel-default">
                                <div class="panel-heading" role="tab" id="headingOne9">
                                    <h4 class="panel-title text-left">
                                        <a class="" role="button" data-toggle="collapse" data-parent="#accordion9" href="#collapseOne9" aria-expanded="true" aria-controls="collapseOne9">
                                            Requisitos
                                        </a>
                                    </h4>
                                    
                                        
                                    </div>

                                
                                <div id="collapseOne9" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne9">
                                  <!--  <div class="panel-body"> -->
                                        <!-- TABLA REQUISITOS -->
    
    <div class="table-responsive-sm">
    <table class="table table-hover">

      <thead class="bg-light">
        <tr>
          <th>Id</th> <!--no mbre e id-->
          <th>Estado</th>
          <th>Fecha</th>
          <th>Ver Descripción</th>
        </tr>
      </thead>
      <% List<Requisito> listaRequisitos =(List<Requisito>)session.getAttribute("listaRequisitos");
        for(int i=0;i<listaRequisitos.size();i++){
            Requisito requisito = listaRequisitos.get(i);
            int id = requisito.getIdRequisito();
            Date fecha = requisito.getFecha();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String fechaS =format.format(fecha);

            boolean finalizado = requisito.isFinalizado();
            String estado =(finalizado?"FINALIZADO":"EN CURSO");
            String ruta = requisito.getRuta();
            
        
      
      %>
      <tbody>
        <tr>
          <th><%=id%></th>
          <td><%=estado%></td>
          <td><%=fechaS%></td>
          <td><link href=<%=ruta%>/>VER</td>

            
        </tr>
        
      </tbody>
      <%}%>
    </table>
  </div>

                                    </div>
                                </div>
                            <!-- </div> -->


                                <div class="panel panel-default">
                                <div class="panel-heading" role="tab" id="headingThree9">
                                    <h4 class="panel-title">
                                        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion9" href="#collapseThree9" aria-expanded="false" aria-controls="collapseThree9">
                                            Alertas
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseThree9" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree9">
                                    
                                        <!-- TABLA ALERTAS -->
    
    <div class="table-responsive-sm">
    <table class="table table-hover">

      <thead class="bg-light">
        <tr>
          <th>Descripción</th> <!--no mbre e id-->
          <th>Tarea</th>
          <th>Tipo de Alerta</th>
          <th>Fecha</th>
        </tr>
      </thead>
      <%
          Set<Alerta> conjuntoAlerta =(Set<Alerta>)session.getAttribute("conjuntoAlerta");
          for(Alerta a: conjuntoAlerta){
              String descripcion =a.getDescripcion();
              String tarea =a.getTarea().getDescripcion();
              String tipo=a.getTipoalerta().getTipoAlerta();
              Date fecha =a.getFecha();
          
      %>
      <tbody>
        <tr>
          <th><%=descripcion%></th>
          <td><%=tarea%></td>
          <td><%=tipo%></td>
          <td><%=fecha%></td>
        </tr>
        
      </tbody>
      <%}%>
    </table>
  </div>

</div>
</div>
                          


                            <div class="panel panel-default">
                                <div class="panel-heading" role="tab" id="headingTwo9">
                                    <h4 class="panel-title">
                                        <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion9" href="#collapseTwo9" aria-expanded="false" aria-controls="collapseTwo9">
                                            Informes
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseTwo9" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo9">
                                    <!-- TABLA INFORMES -->
    
    <div class="table-responsive-sm">
    <table class="table table-hover">

      <thead class="bg-light">
        <tr>
          <th>Id</th> <!--no mbre e id-->
          <th>Fecha</th>
          <th>Descarga</th>
        </tr>
      </thead>
      
      <%
          Set<Informe> conjuntoInformes =(Set<Informe>)session.getAttribute("conjuntoInformes");
          for(Informe i: conjuntoInformes){
                int id = i.getIdInforme();
                Date fecha = i.getFecha();
                String ruta = i.getRutaInforme();
              
          
      %>
      <tbody>
        <tr>
          <th><%=id%></th>
          <td><%=fecha%></td>
          <td>
            <a href="<%=ruta%>">
            <i class="fas fa-download"></i>
            </a>
          </td>
        </tr>


      </tbody>
      <%}%>
    </table>
  </div>

                                    </div>
                                </div>
                            </div>
                                </div>
                            </div>
                            
               
                        </div>
                    </div>
                  <!--</center>
            </div>
      </div>-->
                <div class="line"></div>
        </div>
    </div>
</div>

    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>

    <script src="js/js.js"></script>
    </body>
</html>
