/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rawson.app.util.excepciones;

/**
 *
 * @author hmia
 */
class InstanceNotFoundException extends InstanceException {

    private static final long serialVersionUID = -5517845719446393579L;
    private Object key;
    private String className;

    public InstanceNotFoundException(Object key, String className) {
        super("Instance not found", key, className);
        this.key = key;
        this.className = className;
    }

    public Object getKey() {
        return key;
    }

    public String getClassName() {
        return className;
    }
}
