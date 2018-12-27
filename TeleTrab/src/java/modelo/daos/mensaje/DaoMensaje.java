package modelo.daos.mensaje;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import modelo.daos.GenericDao;
import modelo.entidades.Mensaje;
import modelo.excepciones.InstanceException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hmia
 */
public class DaoMensaje extends GenericDao<Mensaje, Integer> implements IDaoMensaje {

    public List<Mensaje> getByParameter(String parameter, String value, Session session) throws InstanceException {
        return (List<Mensaje>) session.createCriteria(Mensaje.class).add(Restrictions.like(parameter, value)).list();
    }
}
