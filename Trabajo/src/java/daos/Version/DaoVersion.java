
package daos.Version;

import daos.GenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Version;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author PC03
 */
public class DaoVersion extends GenericDao <Version,Integer> implements IDaoVersion{
    public List<Version> getByParameter(String parameter, String value, Session session) throws InstanceException{
    return (List<Version>) session.createCriteria(Version.class).add(Restrictions.like(parameter,value)).list();
    }
    
}
