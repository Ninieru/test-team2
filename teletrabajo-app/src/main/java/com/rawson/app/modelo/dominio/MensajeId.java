package com.rawson.app.modelo.dominio;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * MensajeId generated by hbm2java
 */
public class MensajeId  implements java.io.Serializable {


     private int idMensaje;
     private String contenido;
     private Date fecha;

    public MensajeId() {
    }

    public MensajeId(int idMensaje, String contenido, Date fecha) {
       this.idMensaje = idMensaje;
       this.contenido = contenido;
       this.fecha = fecha;
    }
   
    public int getIdMensaje() {
        return this.idMensaje;
    }
    
    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }
    public String getContenido() {
        return this.contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MensajeId) ) return false;
		 MensajeId castOther = ( MensajeId ) other; 
         
		 return (this.getIdMensaje()==castOther.getIdMensaje())
 && ( (this.getContenido()==castOther.getContenido()) || ( this.getContenido()!=null && castOther.getContenido()!=null && this.getContenido().equals(castOther.getContenido()) ) )
 && ( (this.getFecha()==castOther.getFecha()) || ( this.getFecha()!=null && castOther.getFecha()!=null && this.getFecha().equals(castOther.getFecha()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdMensaje();
         result = 37 * result + ( getContenido() == null ? 0 : this.getContenido().hashCode() );
         result = 37 * result + ( getFecha() == null ? 0 : this.getFecha().hashCode() );
         return result;
   }   


}


