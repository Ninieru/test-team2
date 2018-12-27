package modelo.daos.tipoAlertaDao;

import modelo.daos.GenericDao;
import modelo.entidades.Tipoalerta;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LUCIA
 */

@Repository
public class TipoAlertaDao extends GenericDao <Tipoalerta,Integer> implements ITipoAlertaDao{
    
}
