/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import controlador.HibernateUtil;
import excepciones.InstanceException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.management.InstanceNotFoundException;
import javax.persistence.Entity;
import modelo.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author LUCIA
 */
public class GenericDao<E, PK extends Serializable> implements IGenericDao<E, PK> {

    private Class<E> entityClass;
    protected Session session =null;
    protected Transaction t=null;

    public GenericDao(Session s, Transaction t) {
        entityClass = (Class<E>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        this.session=s;
        this.t=t;


    }
    
    

    @Override
    public E save(E entity) {

        try{
        int id = (int) session.save(entity);
        t.commit();
        return entity;
        }catch(HibernateException e){
            throw new HibernateException(e);
        }
        
    }

    @Override
    public void update(Object entity) {
        try{
             session.update(entity);
        t.commit();
        }catch(HibernateException e){
            throw new HibernateException(e);
        }
        
       

    }

    @Override
    public boolean exist(Serializable id) {
        return session.createCriteria(entityClass).add(Restrictions.idEq(id)).setProjection(Projections.id()).uniqueResult() != null;
    }

    @Override
    public List findAll() {
        try{
            return session.createCriteria(this.entityClass).list();
        }catch(HibernateException e){
            throw new HibernateException(e);
        }
        
    }


    @Override
    public void remove(E entity) {
        session.delete(entity);
        t.commit();

    }

    @Override
    public E findbyId(PK id) throws InstanceNotFoundException {
        
        E  entidad= (E) session.get(entityClass, id);
        if(entidad==null){
            throw new InstanceNotFoundException();
        }
        return entidad;

    }

}
