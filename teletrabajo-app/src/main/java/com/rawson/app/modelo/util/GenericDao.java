package com.rawson.app.modelo.util;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.management.InstanceNotFoundException;

import org.hibernate.Session;

public class GenericDao<T, ID extends Serializable> implements IGenericDao<T, ID> {

    private Class<T> persistentClass;


    @SuppressWarnings("unchecked")
    public GenericDao() {
        final Type genericSuperclass = getClass().getGenericSuperclass();
        final ParameterizedType parameterizedType = ((ParameterizedType) genericSuperclass);
        persistentClass = (Class<T>) parameterizedType.getActualTypeArguments()[0];
    }


    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    @Override
    public T buscarById(Session s,ID id) throws InstanceNotFoundException {
        T entity = (T) s.get(getPersistentClass(), id);
        if (entity == null) {
            throw new InstanceNotFoundException(persistentClass.getName().toString());
        }
        return entity;
    }

    @Override
    public boolean existe(Session s,ID id) {
        T entity = (T) s.get(getPersistentClass(), id);
        if (entity == null) {
            return false;
        }
        return true;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> buscarTodos(Session s) {
        List<T> objects = new ArrayList<T>();
        List<T> resultList = s.createCriteria(this.persistentClass).list();
        objects = resultList;
        return objects;
    }

    @Override
    public T guardar(Session s,T entity) {
        s.saveOrUpdate(entity);
        return entity;
    }

    @Override
    public void eliminar(Session s,T entity) {
        s.delete(entity);
    }
}
