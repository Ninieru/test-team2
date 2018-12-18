/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.cliente;

import daos.GenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Cliente;
import modelo.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author LUCIA
 */
public class ClienteDao extends GenericDao<Cliente, Integer> implements IClienteDao {

    public ClienteDao(Session s, Transaction t) {
        super(s, t);
    }

    public List<Cliente> getByParameter(String parameter, String value) throws InstanceException {
        List<Cliente> result = (List<Cliente>) session.createCriteria(Cliente.class).add(Restrictions.like(parameter, value)).list();

        return result;
    }
}
