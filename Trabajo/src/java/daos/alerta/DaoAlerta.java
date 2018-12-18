/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.alerta;

import daos.GenericDao;
import daos.Usuario.IDaoUsuario;
import excepciones.InstanceException;
import java.util.List;
import modelo.Alerta;
import modelo.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author LUCIA
 */
public class DaoAlerta extends GenericDao<Alerta, Integer> implements IDaoAlerta {

    public DaoAlerta(Session s, Transaction t) {
        super(s, t);
    }

    public List<Alerta> getByParameter(String parameter, String value) throws InstanceException {
        return (List<Alerta>) session.createCriteria(Usuario.class).add(Restrictions.like(parameter, value)).list();
      
    }
}
