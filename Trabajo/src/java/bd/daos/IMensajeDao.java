/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.daos;

import java.util.ArrayList;
import modelo.Mensaje;

/**
 *
 * @author LUCIA
 */
public interface IMensajeDao {
    
    Mensaje crearMensaje(Mensaje mensaje);

     ArrayList<Mensaje > listarMensajes ();

     Mensaje  obtenerMensajePorId(int id);

     boolean  actualizarMensaje(Mensaje mensaje );

     boolean eliminarMensaje(int id);
    
}
