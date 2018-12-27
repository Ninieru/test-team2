package modelo.daos.tarea;


import java.util.List;
import modelo.daos.GenericDao;
import modelo.entidades.Tarea;
import modelo.excepciones.InstanceException;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Fran
 */

@Repository
public class DaoTarea extends GenericDao <Tarea ,Integer> implements IDaoTarea{

    
}
