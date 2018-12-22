/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.singletons;

import daos.Usuario.DaoUsuario;
import daos.cliente.ClienteDao;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LUCIA
 */
public class ClienteSingleton {
    
     private final static String CLASS_NAME_PARAMETER = ClienteDao.class.getName();
    private static ClienteDao dao = null;


    private ClienteSingleton() {

    }

    @SuppressWarnings("rawtypes")
    private static ClienteDao getInstance() {
        try {
 
            String daoClassName = CLASS_NAME_PARAMETER;
            Class daoClass = Class.forName(daoClassName);
            return new ClienteDao();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
    
     public synchronized static ClienteDao getDao() {

        if (dao == null) {
            dao = getInstance();
        }
        return dao;
    }
}
