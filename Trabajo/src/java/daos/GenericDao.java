/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.management.InstanceNotFoundException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author LUCIA
 */
public class GenericDao<E, PK extends Serializable> implements IGenericDao<E, PK> {

    private Class<E> entityClass;

    public GenericDao() {
        entityClass = (Class<E>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];

    }
    
    

    @Override
    public void save(E entity, Session session) {

        try{
         session.save(entity);
  
        }catch(HibernateException e){
            throw new HibernateException(e);
        }
        
    }

    @Override
    public void update(Object entity, Session session) {
        try{
             session.update(entity);
 
        }catch(HibernateException e){
            throw new HibernateException(e);
        }
        
       

    }

    @Override
    public boolean exist(Serializable id, Session session) {
        return session.createCriteria(entityClass).add(Restrictions.idEq(id)).setProjection(Projections.id()).uniqueResult() != null;
    }

    @Override
    public List findAll(Session session) {
        try{
            return session.createCriteria(this.entityClass).list();
        }catch(HibernateException e){
            throw new HibernateException(e);
        }
        
    }


    @Override
    public void remove(E entity, Session session) {
        session.delete(entity);
        

    }

    @Override
    public E findbyId(PK id, Session session) throws InstanceNotFoundException {
        
        E  entidad= (E) session.get(entityClass, id);
        if(entidad==null){
            throw new InstanceNotFoundException();
        }
        return entidad;

    }

}
