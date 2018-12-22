/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.archivo;

import daos.IGenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Archivo;
import org.hibernate.Session;

/**
 *
 * @author hmia
 */
public interface IDaoArchivo extends IGenericDao<Archivo,Integer>{
    List<Archivo> getByParameter(String parameter, String value, Session session) throws InstanceException;
    
}
