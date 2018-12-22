/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.singletons;

import daos.Usuario.DaoUsuario;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LUCIA
 */
public class UsuarioSingleton {

    private final static String CLASS_NAME_PARAMETER = DaoUsuario.class.getName();
    private static DaoUsuario dao = null;


    private UsuarioSingleton() {

    }

    @SuppressWarnings("rawtypes")
    private static DaoUsuario getInstance() {
        try {
 
            String daoClassName = CLASS_NAME_PARAMETER;
            Class daoClass = Class.forName(daoClassName);
            return new DaoUsuario();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
    
     public synchronized static DaoUsuario getDao() {

        if (dao == null) {
            dao = getInstance();
        }
        return dao;
    }
}
