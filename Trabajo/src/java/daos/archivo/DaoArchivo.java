/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.archivo;

import daos.GenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Archivo;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hmia
 */
public class DaoArchivo extends GenericDao<Archivo, Integer> implements IDaoArchivo {

    @Override
    public List<Archivo> getByParameter(String parameter, String value, Session session) throws InstanceException {
        return (List<Archivo>) session.createCriteria(Archivo.class).add(Restrictions.like(parameter, value)).list();
    }
}
