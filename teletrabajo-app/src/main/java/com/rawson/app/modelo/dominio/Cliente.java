package com.rawson.app.modelo.dominio;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idCliente;
     private String nombre;
     private String cif;
     private Set usuarios = new HashSet(0);
     private Set proyectos = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }
    public Cliente(String nombre, String cif, Set usuarios, Set proyectos) {
       this.nombre = nombre;
       this.cif = cif;
       this.usuarios = usuarios;
       this.proyectos = proyectos;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCif() {
        return this.cif;
    }
    
    public void setCif(String cif) {
        this.cif = cif;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }
    public Set getProyectos() {
        return this.proyectos;
    }
    
    public void setProyectos(Set proyectos) {
        this.proyectos = proyectos;
    }




}


