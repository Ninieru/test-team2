/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servicios;

import java.util.List;
import javax.management.InstanceNotFoundException;
import modelo.entidades.Alerta;
import modelo.entidades.Prioridad;
import modelo.entidades.Proyecto;
import modelo.entidades.Requisito;
import modelo.entidades.Tipoalerta;
import modelo.entidades.Usuario;
import modelo.excepciones.InstanceException;

/**
 *
 * @author LUCIA
 */
public interface IEntidadesService {

    void guardarTipoAlerta(Tipoalerta tipo);

    void actualizarTipoAlerta(Tipoalerta tipo);

    Tipoalerta encontrarPorId(int id) throws InstanceNotFoundException;

    List<Tipoalerta> listarTiposAlertas();

    void guardarAlerta(Alerta alerta);

    void actualizarAlerta(Alerta alerta);

    List<Alerta> listarAlertas();

    List<Proyecto> listarProyectos();

    Proyecto obtenerProyectoId(int id) throws InstanceNotFoundException;

    void guardarRequisito(Requisito requisito);

    List<Requisito> listarRequisitos();

    List<Prioridad> listarPrioridades();

    Prioridad obtenerPrioridadNombre(String nombre) throws InstanceException;

    Usuario obtenerUsuarioId(int id) throws InstanceNotFoundException;
}
