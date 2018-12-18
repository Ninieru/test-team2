/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.daos;

import java.util.ArrayList;
import modelo.Chatgrupo;
import modelo.Mensaje;

/**
 *
 * @author LUCIA
 */
public interface IChatGrupoDao {
    
     Mensaje crearChatGrupo(Chatgrupo chatGrupo);

     ArrayList<Chatgrupo> listarChatGrupo ();

     Chatgrupo obtenerChatGrupoPorId(int id);

     boolean actualizarChatGrupo(Chatgrupo chatGrupo);

     boolean eliminarChatGrupo(int id);
    
}
