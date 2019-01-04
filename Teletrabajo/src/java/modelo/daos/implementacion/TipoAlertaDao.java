package modelo.daos.implementacion;


import modelo.daos.interfaces.ITipoAlertaDao;
import modelo.entidades.Tipoalerta;
import org.springframework.stereotype.Repository;



/**
 *
 * @author LUCIA
 */

@Repository
public class TipoAlertaDao extends GenericDao <Tipoalerta,Integer> implements ITipoAlertaDao{
    
}
