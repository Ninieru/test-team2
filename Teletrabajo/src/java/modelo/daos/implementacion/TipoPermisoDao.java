package modelo.daos.implementacion;

/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */

import modelo.daos.interfaces.ITipoPermisoDao;
import modelo.entidades.Tipopermiso;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Arlen
 */
@Repository
public class TipoPermisoDao extends GenericDao<Tipopermiso, Integer> implements ITipoPermisoDao {

}
