package daos.Tarea;
import daos.GenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Tarea;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author Fran
 */
public class DaoTarea extends GenericDao <Tarea ,Integer> implements IDaoTarea{

    @Override
    public List<Tarea> getByParameter(String parameter, String value, Session session) throws InstanceException {
    return (List<Tarea>) session.createCriteria(Tarea.class).add(Restrictions.like(parameter,value)).list();    
    }
    
}
