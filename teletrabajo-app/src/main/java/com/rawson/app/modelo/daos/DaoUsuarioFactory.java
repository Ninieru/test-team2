/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rawson.app.modelo.daos;

/**
 *
 * @author hmia
 */
public class DaoUsuarioFactory {

    private final static String CLASS_NAME_PARAMETER = com.rawson.app.modelo.daos.DaoUsuario.class.getName();
    private static DaoUsuario dao = null;

    private DaoUsuarioFactory() {

    }

    @SuppressWarnings("rawtypes")
    private static DaoUsuario getInstance() {
        try {
            String daoClassName = CLASS_NAME_PARAMETER;
            Class daoClass = Class.forName(daoClassName);
            return (DaoUsuario) daoClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized static DaoUsuario getDao() {
        if (dao == null) {
            dao = getInstance();
        }
        return dao;
    }

}
