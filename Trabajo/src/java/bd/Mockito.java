/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.util.ArrayList;
import java.util.Date;
import modelo.Alerta;
import modelo.Chatgrupo;
import modelo.Mensaje;
import modelo.Prioridad;
import modelo.Requisito;


/**
 *
 * @author LUCIA
 */
public class Mockito {
    public static ArrayList<Alerta> alertaList = new ArrayList();
    public static ArrayList<Chatgrupo> chatGrupoList = new ArrayList();
    public static ArrayList<Mensaje> mensajeList = new ArrayList();
    public static ArrayList<Prioridad> prioridadList = new ArrayList();
    public static ArrayList<Requisito> requisitoList = new ArrayList();
    
    public static void crearAlerta(){
    
        Alerta alerta1 = new Alerta(null,null,"descripcion1",new Date());
        alerta1.setIdAlerta(1);
        Alerta alerta2 = new Alerta(null,null,"descripcion2",new Date());
        alerta2.setIdAlerta(2);
        Alerta alerta3 = new Alerta(null,null,"descripcion3",new Date());
        alerta3.setIdAlerta(3);
        Alerta alerta4 = new Alerta(null,null,"descripcion4",new Date());
        alerta4.setIdAlerta(4);
        Alerta alerta5 = new Alerta(null,null,"descripcion5",new Date());
        alerta5.setIdAlerta(5);
        Alerta alerta6 = new Alerta(null,null,"descripcion6",new Date());
        alerta6.setIdAlerta(6);
        alertaList.add(alerta1);
        alertaList.add(alerta2);
        alertaList.add(alerta3);
        alertaList.add(alerta4);
        alertaList.add(alerta5);
        alertaList.add(alerta6);
    }
    public static void crearChatGrupo(){
        Chatgrupo chat1 = new Chatgrupo("chat1");
        chat1.setIdChatGrupo(1);
        Chatgrupo chat2 = new Chatgrupo("chat2");
        chat2.setIdChatGrupo(2);
        Chatgrupo chat3 = new Chatgrupo("chat3");
        chat3.setIdChatGrupo(3);
        Chatgrupo chat4 = new Chatgrupo("chat4");
        chat4.setIdChatGrupo(4);
        Chatgrupo chat5 = new Chatgrupo("chat5");
        chat5.setIdChatGrupo(5);
        Chatgrupo chat6 = new Chatgrupo("chat6");
        chat6.setIdChatGrupo(6);
        chatGrupoList.add(chat1);
        chatGrupoList.add(chat2);
        chatGrupoList.add(chat3);
        chatGrupoList.add(chat4);
        chatGrupoList.add(chat5);
        chatGrupoList.add(chat6);
    }
    public static void crearMensaje(){
    Mensaje mensaje1 = new Mensaje(null,null,null);
    mensajeList.add(mensaje1);
    }

    public static void crearPrioridadLista(){
        Prioridad prioridad1 = new Prioridad("prioridad1");
        prioridad1.setIdPrioridad(1);
        Prioridad prioridad2 = new Prioridad("prioridad2");
        prioridad2.setIdPrioridad(2);
        Prioridad prioridad3 = new Prioridad("prioridad3");
        prioridad3.setIdPrioridad(3);
        Prioridad prioridad4 = new Prioridad("prioridad4");
        prioridad4.setIdPrioridad(4);
        prioridadList.add(prioridad1);
        prioridadList.add(prioridad2);
        prioridadList.add(prioridad3);
        prioridadList.add(prioridad4);
    }
    public static void crearRequisito(){
        Requisito requisito1 = new Requisito(null,null,null, new Date(),true,true);
        requisito1.setIdRequisito(1);
        Requisito requisito2 = new Requisito(null,null,null, new Date(),true,false);
        requisito2.setIdRequisito(2);
        Requisito requisito3 = new Requisito(null,null,null, new Date(),false,false);
        requisito3.setIdRequisito(3);
        Requisito requisito4 = new Requisito(null,null,null, new Date(),true,true);
        requisito4.setIdRequisito(4);
        Requisito requisito5 = new Requisito(null,null,null, new Date(),true,true);
        requisito5.setIdRequisito(5);
        requisitoList.add(requisito1);
        requisitoList.add(requisito2);
        requisitoList.add(requisito3);
        requisitoList.add(requisito4);
        requisitoList.add(requisito5);
    }
    
    
}
