/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.version;

import controlador.HibernateUtil;
import daos.Version.DaoVersion;
import daos.singletons.VersionSingleton;
import excepciones.InstanceException;
import java.util.List;
import javax.management.InstanceNotFoundException;
import modelo.Version;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PC03
 */
public class VersionService implements IVersionService {

    private DaoVersion dao = VersionSingleton.getDao();
    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    private Transaction t = session.beginTransaction();

    public void insertarVersion(Version v) throws InstanceException {
       try{
        dao.save(v, session);
        t.commit();}
       catch(HibernateException e){
           t.rollback();
           throw new InstanceException();
       }

    }

    public void actualizar(Version v) throws InstanceException {

        try {
            dao.update(v, session);
        } catch (HibernateException e) {
            throw new InstanceException();
        }
    }

    public Version obtenerPorId(int id) throws InstanceNotFoundException {

        return dao.findbyId(id, session);
    }

    public List<Version> getVersiones() throws InstanceException {

        try {
            return dao.findAll(session);
        } catch (HibernateException e) {
            throw new InstanceException();
        }
    }
}
