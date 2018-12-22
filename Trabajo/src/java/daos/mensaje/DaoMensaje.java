/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.mensaje;

import daos.GenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Mensaje;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hmia
 */
public class DaoMensaje extends GenericDao<Mensaje, Integer> implements IDaoMensaje {

    @Override
    public List<Mensaje> getByParameter(String parameter, String value, Session session) throws InstanceException {
        return (List<Mensaje>) session.createCriteria(Mensaje.class).add(Restrictions.like(parameter, value)).list();
    }
}
