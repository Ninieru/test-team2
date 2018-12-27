package modelo.daos.chatGrupo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import modelo.daos.GenericDao;
import modelo.entidades.Chatgrupo;
import modelo.excepciones.InstanceException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hmia
 */
public class DaoChatGrupo extends GenericDao<Chatgrupo, Integer> implements IDaoChatGrupo {

    @Override
    public List<Chatgrupo> getByParameter(String parameter, String value, Session session) throws InstanceException {
        return (List<Chatgrupo>) session.createCriteria(Chatgrupo.class).add(Restrictions.like(parameter, value)).list();
    }
}
