package daos.Tarea;
import daos.IGenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Tarea;
import org.hibernate.Session;
/**
 *
 * @author Fran
 */
public interface IDaoTarea extends IGenericDao<Tarea, Integer>{
     public List<Tarea> getByParameter(String parameter, String value, Session session) throws InstanceException;
}
