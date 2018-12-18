package com.rawson.app.modelo.dominio;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Permiso generated by hbm2java
 */
public class Permiso implements java.io.Serializable {

    private Integer idPermiso;
    private Tipopermiso tipopermiso;
    private String objeto;
    private Set rols = new HashSet(0);

    public Permiso() {
    }

    public Permiso(String objeto) {
        this.objeto = objeto;
    }

    public Permiso(Tipopermiso tipopermiso, String objeto, Set rols) {
        this.tipopermiso = tipopermiso;
        this.objeto = objeto;
        this.rols = rols;
    }

    public Integer getIdPermiso() {
        return this.idPermiso;
    }

    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }

    public Tipopermiso getTipopermiso() {
        return this.tipopermiso;
    }

    public void setTipopermiso(Tipopermiso tipopermiso) {
        this.tipopermiso = tipopermiso;
    }

    public String getObjeto() {
        return this.objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public Set getRols() {
        return this.rols;
    }

    public void setRols(Set rols) {
        this.rols = rols;
    }

}
