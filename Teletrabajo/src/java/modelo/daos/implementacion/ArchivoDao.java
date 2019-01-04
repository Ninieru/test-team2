package modelo.daos.implementacion;




import modelo.daos.interfaces.IArchivoDao;
import modelo.entidades.Archivo;
import org.springframework.stereotype.Repository;

/**

 @author Fran
 */
@Repository
public class ArchivoDao extends GenericDao<Archivo,Integer> implements IArchivoDao
{


}
