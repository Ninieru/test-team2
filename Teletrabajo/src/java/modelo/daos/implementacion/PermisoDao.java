package modelo.daos.implementacion;


import modelo.daos.implementacion.GenericDao;
import modelo.daos.interfaces.IPermisoDao;
import modelo.entidades.Permiso;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Arlen
 */
@Repository
public class PermisoDao extends GenericDao<Permiso, Integer> implements IPermisoDao {

}
