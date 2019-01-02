package modelo.daos.implementacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modelo.daos.GenericDao;
import modelo.daos.interfaces.IRequisitoDao;
import modelo.entidades.Requisito;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hmia
 */
@Repository
public class RequisitoDao extends GenericDao<Requisito, Integer> implements IRequisitoDao {

}
