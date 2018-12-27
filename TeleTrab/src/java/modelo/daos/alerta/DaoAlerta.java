package modelo.daos.alerta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.List;
import modelo.daos.GenericDao;
import modelo.daos.alerta.IDaoAlerta;
import modelo.entidades.Alerta;
import modelo.entidades.Usuario;
import modelo.excepciones.InstanceException;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LUCIA
 */
@Repository
public class DaoAlerta extends GenericDao<Alerta, Integer> implements IDaoAlerta {


  
}
