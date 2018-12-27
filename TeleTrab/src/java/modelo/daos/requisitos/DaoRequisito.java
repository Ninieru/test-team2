package modelo.daos.requisitos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import modelo.daos.GenericDao;
import modelo.entidades.Requisito;
import modelo.excepciones.InstanceException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hmia
 */
@Repository
public class DaoRequisito extends GenericDao<Requisito, Integer> implements IDaoRequisito {

}
