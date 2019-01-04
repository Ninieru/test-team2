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
    
    public void guardarTipoAlerta(Tipoalerta tipo);
    public void actualizarTipoAlerta(Tipoalerta tipo);
    public Tipoalerta encontrarTipoAlertaPorId(int id) throws InstanceNotFoundException;
    public List<Tipoalerta> listarTiposAlertas();
    public void guardarAlerta(Alerta alerta );
    public void actualizarAlerta(Alerta alerta);
    public List<Alerta> listarAlertas();
    public List<Proyecto> listarProyectos();
    public List<Proyecto> listarProyectosPorUsuario(int idUsuario);
    public Proyecto obtenerPorId(int id) throws InstanceNotFoundException;
    public List<Requisito> listarTodosRequisitos();
    public List<Requisito> listarTodosRequisitosPorIdProyecto(int idProyecto);
    public List<Requisito> listarRequisitosPorIdProyecto(int idProyecto);
    public List<Requisito> listarIncidenciasPorIdProyecto(int idProyecto);
    public Prioridad obtenerPrioridadNombre(String nombre) throws InstanceException;
    public Usuario obtenerUsuarioId(int id) throws InstanceNotFoundException;
    public Proyecto obtenerProyectoId(int id) throws InstanceNotFoundException;
    public List<Prioridad> listarPrioridades();
    public void guardarRequisito(Requisito requisito);
    public Usuario obtenerUsuarioLogin(String login) throws InstanceException;
    public Usuario logearse(String login, String pass);
    public Usuario logearseMail(String mail, String pass);
    public boolean esSuperAdmin(int id);
    
    
    
    
    
}
