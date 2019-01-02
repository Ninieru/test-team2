<%-- 
    Document   : CrearRequisito
    Created on : 28-dic-2018, 10:24:06
    Author     : LUCIA
--%>

<%@page import="modelo.entidades.Prioridad"%>
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

        <!-- Font Awesome JS -->
        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">

    </head>
    <link rel="shortcut icon" href="img/favicon.ico">

    <body>
        <form action="PruebaServlet" method="post">
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
                            <i class="fas fa-align-justify"></i>
                        </button>
                        <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <i class="fas fa-align-justify"></i>
                        </button>


                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="nav navbar-nav ml-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="proyecto.html">Proyectos</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="chat.html">Chat</a>
                                </li>

                                <li class="nav-item dropdown">
                                    <a class="nav-link " data-toggle="dropdown" href="#" role="button" >Idioma</a>
                                    <div class="dropdown-menu">
                                        <a class="dropdown-item" href="#"></a>
                                        <a class="dropdown-item" href="#">InglÃ©s</a>
                                        <a class="dropdown-item" href="#">FrancÃ©s</a>

                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="perfil.html">Perfil</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>

                <!-- CREA REQUISITO -->


                <div class="form-group">
                    <p class="crear">Nuevo Requisito</p>
                </div>

                <!-- formulario-->
                <form>

                    <div class="form-group">
                        <label for="exampleInputFile">AÃ±ade un archivo</label>
                        <input type="file" class="form-control-file" id="InputFile" aria-describedby="fileHelp" name="file">
                        <small id="fileHelp" class="form-text text-muted">Puedes aÃ±adir un archivo con la descripciÃ³n.</small>
                    </div>
                    <%
                        List<Prioridad> listaPrioridades = (List<Prioridad>) session.getAttribute("listaPrioridades");
                    %>
                    <div class="form-group">
                        <label for="exampleSelect1">Prioridad</label>
                        <select class="form-control" id="exampleSelect1" name="prioridad">
                            <option value="vacio"></option>
                            <%for (int i = 0; i < listaPrioridades.size(); i++) {
                                    Prioridad p = listaPrioridades.get(i);
                                    String nombre = p.getNombre();
                            %>
                            <option value=<%=nombre%>><%=nombre%></option>
                            <%}%>
                        </select>
                        <input type="checkbox" name="incidencia">INCIDENCIA</input>
                    </div>
                        <%
                        
                       
                        %>
                </form>

        <!--
        <div class="form-group row">
        <label for="example-date-input" class="col-2 col-form-label">Fecha</label>
        <div class="col-10">
          <input class="form-control" type="date" value="aaaa-mm-dd" id="date-input">
        </div>
      </div>
        -->




        <!--
        <fieldset class="form-group">
          <label for="selecciona">Selecciona</label>
          <div class="form-check">
            <label class="form-check-label">
              <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios1" value="option1" checked>
              OpciÃ³n 1
            </label>
          </div>
          <div class="form-check">
          <label class="form-check-label">
              <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios2" value="option2">
              OpciÃ³n 2
            </label>
          </div>
          <div class="form-check disabled">
          <label class="form-check-label">
              <input type="radio" class="form-check-input" name="optionsRadios" id="optionsRadios3" value="option3" disabled>
              OpciÃ³n marcada, el usuario no puede seleccionarla
            </label>
          </div>
        </fieldset>
      
      
        <div class="form-check">
          <label class="form-check-label">
            <input type="checkbox" class="form-check-input">
            Comprueba algo
          </label>
        </div>
        
      </form>
      
        -->


        <!--botones formulario envÃ­o-->
        <div class="row">
            <div class="col-4">

            </div>
            <div class="col form-group row col-6">

                <button type="submit" class="btn btn-secondary aÃ±adir">Añadir</button>

            </div>
            <div class="col-2">
                <a href="proyecto.html"><button type="button" class="btn btn-light">Volver</button></a>

            </div>
        </div>



        <!-- jQuery CDN - Slim version (=without AJAX) -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <!-- Popper.JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <!-- Bootstrap JS -->
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>

        <script src="js/js.js"></script>

</form>
    </body>
</html>
