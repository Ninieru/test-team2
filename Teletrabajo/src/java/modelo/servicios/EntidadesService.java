/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servicios;

import java.util.ArrayList;
import java.util.List;
import javax.management.InstanceNotFoundException;
import modelo.daos.implementacion.AlertaDao;
import modelo.daos.implementacion.PrioridadDao;
import modelo.daos.implementacion.ProyectoDao;
import modelo.daos.implementacion.RequisitoDao;
import modelo.daos.implementacion.TipoAlertaDao;
import modelo.daos.implementacion.UsuarioDao;
import modelo.entidades.Tipoalerta;
import modelo.entidades.Alerta;
import modelo.entidades.Prioridad;
import modelo.entidades.Proyecto;
import modelo.entidades.Requisito;
import modelo.entidades.Usuario;
import modelo.excepciones.InstanceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author LUCIA
 */
@Transactional
@Service
public class EntidadesService{
    @Autowired
    private TipoAlertaDao daoTipoAlerta;
    @Autowired
    private AlertaDao daoAlerta;
    
    @Autowired
    private ProyectoDao daoProyecto;
    
    @Autowired
    private RequisitoDao daoRequisito;
    
    @Autowired
    private PrioridadDao daoPrioridad;
    
    @Autowired
    private UsuarioDao daoUsuario;
    
    public void guardarTipoAlerta(Tipoalerta tipo){
        daoTipoAlerta.save(tipo);
    }
    
    public void actualizarTipoAlerta(Tipoalerta tipo){
        daoTipoAlerta.update(tipo);
    }
    
    public Tipoalerta encontrarTipoAlertaPorId(int id) throws InstanceNotFoundException{
        return daoTipoAlerta.findbyId(id);
    }
    public List<Tipoalerta> listarTiposAlertas() {
        return daoTipoAlerta.findAll();
    }
    
    public void guardarAlerta(Alerta alerta ){
        daoAlerta.save(alerta);
    }
    
    public void actualizarAlerta(Alerta alerta){
        daoAlerta.update(alerta);
    }
    
    public List<Alerta> listarAlertas(){
        return daoAlerta.findAll();
    }
    
    public List<Proyecto> listarProyectos(){
        return daoProyecto.findAll();
    }
    
    public List<Proyecto> listarProyectosPorUsuario(int idUsuario){
        return daoProyecto.getProyectosPorUsuario(idUsuario);
    }
    
    public Proyecto obtenerPorId(int id) throws InstanceNotFoundException{
        return daoProyecto.findbyId(id);
    }
    
    public List<Requisito> listarTodosRequisitos(){
        return daoRequisito.findAll();
    }
    
    public List<Requisito> listarTodosRequisitosPorIdProyecto(int idProyecto){
        List<Requisito> requisitos = new ArrayList<>();
        List<Requisito> todosRequisitos = daoRequisito.findAll();
        for (Requisito req : todosRequisitos) {
            if(req.getProyecto().getIdProyecto()==idProyecto){
                requisitos.add(req);
            }
        }
        return requisitos;
    }
    
    /**Requisitos =  Requisito con esIncidencia() en false**/
    public List<Requisito> listarRequisitosPorIdProyecto(int idProyecto){
        List<Requisito> requisitos = new ArrayList<>();
        List<Requisito> todosRequisitos = daoRequisito.findAll();
        for (Requisito req : todosRequisitos) {
            if(req.getProyecto().getIdProyecto()==idProyecto){
                if (!req.isEsIncidencia())
                requisitos.add(req);
            }
        }
        return requisitos;
    }
    
    /**Incidencias = Requisitos con esIncidencia() en true**/
    public List<Requisito> listarIncidenciasPorIdProyecto(int idProyecto){
        List<Requisito> incidencias = new ArrayList<>();
        List<Requisito> todosRequisitos = daoRequisito.findAll();
        for (Requisito req : todosRequisitos) {
            if(req.getProyecto().getIdProyecto()==idProyecto){
                if (req.isEsIncidencia())
                incidencias.add(req);
            }
        }
        return incidencias;
    }
    
    public Prioridad obtenerPrioridadNombre(String nombre) throws InstanceException{
        return daoPrioridad.busquedaPorNombre(nombre);
        
    }
    
        public Usuario obtenerUsuarioId(int id) throws InstanceNotFoundException{
        return daoUsuario.findbyId(id);
    }

        public Proyecto obtenerProyectoId(int id) throws InstanceNotFoundException{
        return daoProyecto.findbyId(id);
    }
        
        public List<Prioridad> listarPrioridades(){
        return daoPrioridad.findAll();
    }


        public void guardarRequisito(Requisito requisito){
        daoRequisito.save(requisito);
    }

       public Usuario obtenerUsuarioLogin(String login) throws InstanceException{
           return daoUsuario.busquedaPorLogin(login);
       }

         public Usuario logearse(String login, String pass) {
        return daoUsuario.usuarioLogin(login, pass);
    }
         
         public Usuario logearseMail(String mail, String pass) {
        return daoUsuario.usuarioMail(mail, pass);
    }
         
          public boolean esSuperAdmin(int id) {
        ArrayList<Proyecto> prs = (ArrayList) daoProyecto.getProyectosPorUsuario(id);
        for (int i = 0; i < prs.size(); i++) {
            if (prs.get(i).getNombre().equals("proyecto0")) {
                return true;
            }
        }
        return false;
    }
}
