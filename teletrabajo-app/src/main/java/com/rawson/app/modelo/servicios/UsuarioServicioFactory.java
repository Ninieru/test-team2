/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rawson.app.modelo.servicios;

/**
 *
 * @author hmia
 */
public class UsuarioServicioFactory {

    private final static String CLASS_NAME_PARAMETER = com.rawson.app.modelo.servicios.UsuarioServicio.class.getName();
    private static UsuarioServicio service = null;

    private UsuarioServicioFactory() {
    }

    @SuppressWarnings("rawtypes")
    private static UsuarioServicio getInstance() {
        try {
            String serviceClassName = CLASS_NAME_PARAMETER;
            System.out.println("ServicioClass =>" + serviceClassName);
            Class serviceClass = Class.forName(serviceClassName);
            return (UsuarioServicio) serviceClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public synchronized static UsuarioServicio getService() {
        if (service == null) {
            service = getInstance();
        }
        return service;

    }

}
