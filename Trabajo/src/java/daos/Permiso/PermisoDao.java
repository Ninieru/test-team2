/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Permiso;
import daoInterfaces.IPermisoDao;
import excepciones.InstanceException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**

 @author Arlen
 */
public class PermisoDao extends GenericDao<Permiso,Integer> implements IPermisoDao
{
    @Override
    public List<Permiso> getByParameter(String parameter,String value,Session session) throws InstanceException
    {
        return (List<Permiso>) session.createCriteria(Permiso.class).add(Restrictions.like(parameter,value)).list();
    }
   


}
