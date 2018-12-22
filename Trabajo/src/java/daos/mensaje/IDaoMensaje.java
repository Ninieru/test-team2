/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.mensaje;

import daos.IGenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Mensaje;
import org.hibernate.Session;

/**
 *
 * @author hmia
 */
public interface IDaoMensaje extends IGenericDao<Mensaje, Integer>{
    
    List<Mensaje> getByParameter(String parameter, String value, Session session) throws InstanceException;
}

