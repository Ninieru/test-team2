/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.daos;

import java.util.ArrayList;
import modelo.Alerta;

/**
 *
 * @author LUCIA
 */
public interface IAlertaDao {

     Alerta crearAlerta(Alerta alerta);

     ArrayList<Alerta> listarAlertas();

     Alerta obtenerAlertaPorId(int id);

     boolean actualizarAlerta(Alerta alerta);

     boolean eliminarAlerta(int id);

}
