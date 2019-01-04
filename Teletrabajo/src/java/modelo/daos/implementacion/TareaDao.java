package modelo.daos.implementacion;


import modelo.daos.interfaces.ITareaDao;
import modelo.entidades.Tarea;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Fran
 */

@Repository
public class TareaDao extends GenericDao <Tarea ,Integer> implements ITareaDao{

    
}
