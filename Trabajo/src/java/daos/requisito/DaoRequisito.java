/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.requisito;

import daos.GenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Requisito;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hmia
 */
public class DaoRequisito extends GenericDao<Requisito, Integer> implements IDaoRequisito {

    @Override
    public List<Requisito> getByParameter(String parameter, String value, Session session) throws InstanceException {
        return (List<Requisito>) session.createCriteria(Requisito.class).add(Restrictions.like(parameter, value)).list();
    }
}
