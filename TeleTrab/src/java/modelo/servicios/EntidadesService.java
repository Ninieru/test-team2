/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.servicios;

import java.util.List;
import javax.management.InstanceNotFoundException;
import modelo.daos.tipoAlertaDao.TipoAlertaDao;
import modelo.entidades.Tipoalerta;
import modelo.daos.alerta.DaoAlerta;
import modelo.daos.proyecto.ProyectoDao;
import modelo.daos.requisitos.DaoRequisito;
import modelo.entidades.Alerta;
import modelo.entidades.Proyecto;
import modelo.entidades.Requisito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author LUCIA
 */
@Transactional
@Service
public class EntidadesService {
    @Autowired
    private TipoAlertaDao daoTipoAlerta;
    @Autowired
    private DaoAlerta daoAlerta;
    
    @Autowired
    private ProyectoDao daoProyecto;
    
    @Autowired
    private DaoRequisito daoRequisito;
    
    public void guardarTipoAlerta(Tipoalerta tipo){
        daoTipoAlerta.save(tipo);
    }
    
    public void actualizarTipoAlerta(Tipoalerta tipo){
        daoTipoAlerta.update(tipo);
    }
    
    public Tipoalerta encontrarPorId(int id) throws InstanceNotFoundException{
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
    
    public Proyecto obtenerPorId(int id) throws InstanceNotFoundException{
        return daoProyecto.findbyId(id);
    }
    
    public List<Requisito> listarRequisitos(){
        return daoRequisito.findAll();
    }

}
