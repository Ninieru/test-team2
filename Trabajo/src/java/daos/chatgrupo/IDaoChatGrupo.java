/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.chatgrupo;

import daos.IGenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Chatgrupo;
import org.hibernate.Session;

/**
 *
 * @author hmia
 */
public interface IDaoChatGrupo extends IGenericDao<Chatgrupo, Integer> {

    public List<Chatgrupo> getByParameter(String parameter, String value, Session session) throws InstanceException;

}
