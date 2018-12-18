package com.rawson.app.modelo.dominio;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tipoalerta generated by hbm2java
 */
public class Tipoalerta  implements java.io.Serializable {


     private Integer idTipoAlerta;
     private String tipoAlerta;
     private Set alertas = new HashSet(0);

    public Tipoalerta() {
    }

	
    public Tipoalerta(String tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }
    public Tipoalerta(String tipoAlerta, Set alertas) {
       this.tipoAlerta = tipoAlerta;
       this.alertas = alertas;
    }
   
    public Integer getIdTipoAlerta() {
        return this.idTipoAlerta;
    }
    
    public void setIdTipoAlerta(Integer idTipoAlerta) {
        this.idTipoAlerta = idTipoAlerta;
    }
    public String getTipoAlerta() {
        return this.tipoAlerta;
    }
    
    public void setTipoAlerta(String tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }
    public Set getAlertas() {
        return this.alertas;
    }
    
    public void setAlertas(Set alertas) {
        this.alertas = alertas;
    }




}

