/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.prioridad;

import daos.IGenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Prioridad;
import org.hibernate.Session;

/**
 *
 * @author hmia
 */
public interface IDaoPrioridad extends IGenericDao<Prioridad, Integer>{
    
    List<Prioridad> getByParameter(String parameter, String value, Session session) throws InstanceException;
}

