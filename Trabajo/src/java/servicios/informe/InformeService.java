/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package servicios.informe;

/**

 @author Fernando
 */

import controlador.HibernateUtil;
import daos.Informe.DaoInforme;
import daos.singletons.InformeSingleton;
import excepciones.InstanceException;
import java.util.List;
import javax.management.InstanceNotFoundException;
import modelo.Informe;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LUCIA
 */
public class InformeService implements IInformeService{

    private DaoInforme dao = InformeSingleton.getDao();
    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    private Transaction t = session.beginTransaction();
    
    @Override
    public  Informe insertarInforme(Informe u) throws InstanceException
    {
        boolean usuario = dao.getByParameter("usuario", u.getUsuario().toString(),session).size()==1;
        boolean rutaInforme = dao.getByParameter("rutaInforme", u.getRutaInforme(),session).size()==1;
        boolean fecha = dao.getByParameter("fecha", u.getFecha().toString(),session).size()==1;
        if (usuario || rutaInforme || fecha) {
            throw new InstanceException();
        }
         dao.save(u,session);
         t.commit();  
        
         return u;
    }
    @Override
    public void actualizar(Informe u) throws InstanceException
    {
 try {
            dao.update(u, session);
        } catch (HibernateException e) {
            throw new InstanceException();
        }    }
    @Override
    public Informe obtenerPorId(int id) throws InstanceNotFoundException
    {
        return dao.findbyId(id, session);    
    }
    @Override
    public List<Informe> getUsuarios() throws InstanceException
    {
                try {
            return dao.findAll(session);
        } catch (HibernateException e) {
            throw new InstanceException();
        }
    }
}
    

