/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.Usuario;

import daos.GenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author LUCIA
 */
public class DaoUsuario extends GenericDao <Usuario,Integer> implements IDaoUsuario{
  
//    protected Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//    protected Transaction t = session.beginTransaction();
   
    public DaoUsuario(Session s,Transaction t){
        super(s,t);
    }
    
    public boolean getByParameter(String parameter, String value) throws InstanceException{
    List<Usuario> result = (List<Usuario>) session.createCriteria(Usuario.class).add(Restrictions.like(parameter,value)).list();
    if(result.size()!=1){
        return false;
    }
    t.commit();
    return true;
    }
}
