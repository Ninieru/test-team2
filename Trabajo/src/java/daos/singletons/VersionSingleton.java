/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.singletons;

import daos.Version.DaoVersion;

/**
 *
 * @author PC03
 */
public class VersionSingleton {
    private final static String CLASS_NAME_PARAMETER = DaoVersion.class.getName();
    private static DaoVersion dao = null;


    private VersionSingleton() {

    }

    @SuppressWarnings("rawtypes")
    private static DaoVersion getInstance() {
        try {
 
            String daoClassName = CLASS_NAME_PARAMETER;
            Class daoClass = Class.forName(daoClassName);
            return new DaoVersion();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
    
     public synchronized static DaoVersion getDao() {

        if (dao == null) {
            dao = getInstance();
        }
        return dao;
    }
}
