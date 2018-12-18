/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.daos;

import java.util.ArrayList;
import modelo.Requisito;

/**
 *
 * @author LUCIA
 */
public interface IRequisitoDao {
    
     Requisito crearRequisito(Requisito requisito);

     ArrayList<Requisito> listarRequisitos();

     Requisito obtenerRequisitoPorId(int id);

     boolean actualizarRequisito(Requisito requisito);

     boolean eliminarRequisito(int id);
}
