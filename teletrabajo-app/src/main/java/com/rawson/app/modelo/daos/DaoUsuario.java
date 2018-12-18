/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rawson.app.modelo.daos;

import com.rawson.app.modelo.dominio.Usuario;
import com.rawson.app.modelo.util.GenericDao;
import javax.management.InstanceNotFoundException;
import org.hibernate.Session;

/**
 *
 * @author hmia
 */
public class DaoUsuario extends GenericDao<Usuario, Integer> implements IDaoUsuario {

    @Override
    public Usuario buscarPorDni(Session s, String dni) throws InstanceNotFoundException {
        String hql = String.format("Select u FROM Usuario u where UPPER(u.dni) LIKE UPPER(:dni)");
        Usuario usuario
                = (Usuario) s.createQuery(hql).setParameter("dni", dni).uniqueResult();

        if (usuario == null) {
            throw new InstanceNotFoundException(dni);
        }
        return usuario;
    }

    @Override
    public Usuario buscarPorEmail(Session s, String email) throws InstanceNotFoundException {
        String hql = String.format("Select u FROM Usuario u where UPPER(u.email) LIKE UPPER(:email)");
        Usuario usuario
                = (Usuario) s.createQuery(hql).setParameter("email", email).uniqueResult();

        if (usuario == null) {
            throw new InstanceNotFoundException(email);
        }
        return usuario;
    }

    @Override
    public Usuario buscarPorLogin(Session s, String login) throws InstanceNotFoundException {
        String hql = String.format("Select u FROM Usuario u where UPPER(u.login) LIKE UPPER(:login)");
        Usuario usuario
                = (Usuario) s.createQuery(hql).setParameter("login", login).uniqueResult();

        if (usuario == null) {
            throw new InstanceNotFoundException(login);
        }
        return usuario;
    }
}
