/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.proyecto;

import daos.GenericDao;
import modelo.Proyecto;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LUCIA
 */
public class ProyectoDao extends GenericDao <Proyecto,Integer> implements IProyectoDao{
    
    public ProyectoDao(Session s, Transaction t) {
        super(s, t);
    }
    
}
