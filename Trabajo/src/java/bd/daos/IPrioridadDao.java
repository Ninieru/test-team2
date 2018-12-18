/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.daos;

import java.util.List;
import modelo.Prioridad;

/**
 *
 * @author LUCIA
 */
public interface IPrioridadDao {

    Prioridad guardarPrioridad(Prioridad prioridad);

    List<Prioridad> listarPrioridades();

    Prioridad obtenerPrioridadPorId(int id);

    boolean actualizarPrioridad(Prioridad prioridad);

    boolean eliminarPrioridad(Prioridad prioridad);
}
