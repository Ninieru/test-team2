/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.io.Serializable;
import java.util.List;
import javax.management.InstanceNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LUCIA
 */
public interface IGenericDao<E, PK extends Serializable> {

    public void save(E entity, Session session);

    public void update(E entity, Session session);

    public E findbyId(PK id, Session session) throws InstanceNotFoundException;

    public boolean exist(PK id,Session session);

    public List<E> findAll(Session session);


    public void remove(E entity, Session session);
}
