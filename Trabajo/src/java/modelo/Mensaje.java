package modelo;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1



/**
 * Mensaje generated by hbm2java
 */
public class Mensaje  implements java.io.Serializable {


     private MensajeId id;
     private Chatgrupo chatgrupo;
     private Usuario usuario;

    public Mensaje() {
    }

    public Mensaje(MensajeId id, Chatgrupo chatgrupo, Usuario usuario) {
       this.id = id;
       this.chatgrupo = chatgrupo;
       this.usuario = usuario;
    }
   
    public MensajeId getId() {
        return this.id;
    }
    
    public void setId(MensajeId id) {
        this.id = id;
    }
    public Chatgrupo getChatgrupo() {
        return this.chatgrupo;
    }
    
    public void setChatgrupo(Chatgrupo chatgrupo) {
        this.chatgrupo = chatgrupo;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }




}

