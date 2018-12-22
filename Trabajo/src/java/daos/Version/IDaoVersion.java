/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.Version;

import daos.IGenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Version;
import org.hibernate.Session;

/**
 *
 * @author PC03
 */
public interface IDaoVersion extends IGenericDao<Version,Integer>{
    public List<Version> getByParameter(String parameter, String value, Session session) throws InstanceException;
    
}
