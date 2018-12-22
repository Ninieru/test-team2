package servicios.archivo;

import controlador.HibernateUtil;
import daos.Archivo.DaoArchivo;
import daos.singletons.ArchivoSingleton;
import excepciones.InstanceException;
import java.util.List;
import javax.management.InstanceNotFoundException;
import modelo.Archivo;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**

 @author Rodrigo
 */
public class ArchivoService implements IArchivoService
{

    private DaoArchivo dao = ArchivoSingleton.getDao();
    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    private Transaction tx = null;

    public void insertarArchivo(Archivo a) throws InstanceException
    {
        boolean nombre = dao.getByParameter("nombre",a.getNombre(),session).size() == 1;
        boolean proyecto = dao.getByParameter("proyecto",a.getProyecto().toString(),session).size() == 1;
        if(nombre || proyecto)
            throw new InstanceException();
        dao.save(a,session);
        tx.commit();
    }

    public void actualizar(Archivo t) throws InstanceException
    {
        tx = session.beginTransaction();
        try
        {
            dao.update(t,session);
            tx.commit();
        }
        catch(HibernateException e)
        {
            tx.rollback();
            throw new InstanceException();
        }
    }

    public Archivo obtenerPorId(int id) throws InstanceNotFoundException
    {
        return dao.findbyId(id,session);
    }

    public List<Archivo> getArchivos() throws InstanceException
    {
        try
        {
            return dao.findAll(session);
        }
        catch(HibernateException e)
        {
            throw new InstanceException();
        }
    }

}
