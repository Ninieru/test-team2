package com.rawson.app.modelo.util;

//import modelo.util.excepciones.InstanceNotFoundException;
import java.io.Serializable;
import java.util.List;
import javax.management.InstanceNotFoundException;
import org.hibernate.Session;

public interface IGenericDao<T, ID extends Serializable> {

    T buscarById(Session s, ID id) throws InstanceNotFoundException;

    List<T> buscarTodos(Session s);

    T guardar(Session s, T entity);

    void eliminar(Session s, T entity);

    boolean existe(Session s, ID id);

}
