package daos.singletons;

/**
 *
 * @author Fran
 */
import daos.Tarea.DaoTarea;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class TareaSingleton {
    
    private final static String CLASS_NAME_PARAMETER = DaoTarea.class.getName();
    private static DaoTarea dao = null;


    private TareaSingleton() {

    }

    @SuppressWarnings("rawtypes")
    private static DaoTarea getInstance() {
        try {
 
            String daoClassName = CLASS_NAME_PARAMETER;
            Class daoClass = Class.forName(daoClassName);
            return new DaoTarea();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
    
     public synchronized static DaoTarea getDao() {

        if (dao == null) {
            dao = getInstance();
        }
        return dao;
    }
}
