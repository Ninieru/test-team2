package modelo.daos.chatGrupo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.List;
import modelo.daos.IGenericDao;
import modelo.entidades.Chatgrupo;
import modelo.excepciones.InstanceException;
import org.hibernate.Session;

/**
 *
 * @author hmia
 */
public interface IDaoChatGrupo extends IGenericDao<Chatgrupo, Integer> {

    public List<Chatgrupo> getByParameter(String parameter, String value, Session session) throws InstanceException;

}
