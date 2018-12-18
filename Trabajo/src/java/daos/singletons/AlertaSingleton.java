/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.singletons;

import daos.Usuario.DaoUsuario;
import daos.alerta.DaoAlerta;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LUCIA
 */
public class AlertaSingleton {
    
    private final static String CLASS_NAME_PARAMETER = DaoAlerta.class.getName();
    private static DaoAlerta dao = null;


    private AlertaSingleton() {

    }

    @SuppressWarnings("rawtypes")
    private static DaoAlerta getInstance(Session s, Transaction t) {
        try {
 
            String daoClassName = CLASS_NAME_PARAMETER;
            Class daoClass = Class.forName(daoClassName);
            return new DaoAlerta(s,t);
        } catch (Exception e) {
            System.out.println("exception: "+t.toString());
            throw new RuntimeException(e.getMessage());
        }

    }
    
     public synchronized static DaoAlerta getDao(Session s, Transaction t) {

        if (dao == null) {
            System.out.println("dao nulo");
            dao = getInstance(s,t);
        }
        return dao;
    }
}
