/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.alerta;

import daos.GenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Alerta;
import modelo.Usuario;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author LUCIA
 */
public class DaoAlerta extends GenericDao<Alerta, Integer> implements IDaoAlerta {

    public List<Alerta> getByParameter(String parameter, String value, Session session) throws InstanceException {
        return (List<Alerta>) session.createCriteria(Usuario.class).add(Restrictions.like(parameter, value)).list();
      
    }
}
