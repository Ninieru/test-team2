/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.singletons;

import daos.alerta.DaoAlerta;
import daos.proyecto.ProyectoDao;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LUCIA
 */
public class ProyectoSingleton {
    private final static String CLASS_NAME_PARAMETER = ProyectoDao.class.getName();
    private static ProyectoDao dao = null;


    private ProyectoSingleton() {

    }

    @SuppressWarnings("rawtypes")
    private static ProyectoDao getInstance() {
        try {
 
            String daoClassName = CLASS_NAME_PARAMETER;
            Class daoClass = Class.forName(daoClassName);
            return new ProyectoDao();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
    
     public synchronized static ProyectoDao getDao() {

        if (dao == null) {
            dao = getInstance();
        }
        return dao;
    }
}
