package servicios.tarea;

/**
 *
 * @author Fran
 */
import controlador.HibernateUtil;
import daos.Tarea.DaoTarea;
import daos.singletons.TareaSingleton;
import excepciones.InstanceException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.InstanceNotFoundException;
import modelo.Tarea;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import servicios.usuarios.IUsuarioService;

public class TareaService {

    private DaoTarea dao = TareaSingleton.getDao();
    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    private Transaction tx = null;

    public void insertarTarea(Tarea t) throws InstanceException {
        tx = session.beginTransaction();
        // boolean id = dao.getByParameter("idTarea","" +t.getIdTarea(),session).size()==1;
        boolean idRequisito = dao.getByParameter("idRequisito", "" + t.getRequisito().getIdRequisito(), session).size() == 1;

        if (!idRequisito) {
            throw new InstanceException();
        } else {
            dao.save(t, session);
            tx.commit();
        }

    }

    public void actualizar(Tarea t) throws InstanceException {
        tx = session.beginTransaction();
        try {
            dao.update(t, session);
            tx.commit();
        } catch (HibernateException e) {
            tx.rollback();
            throw new InstanceException();
        }
    }

    public Tarea obtenerPorId(int id) throws InstanceNotFoundException {

        return dao.findbyId(id, session);
    }

    public List<Tarea> getTareas() throws InstanceException {

        try {
            return dao.findAll(session);
        } catch (HibernateException e) {
            throw new InstanceException();
        }
    }
}
