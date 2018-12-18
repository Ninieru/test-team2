/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rawson.app.modelo.servicios;

import com.rawson.app.modelo.daos.DaoUsuario;
import com.rawson.app.modelo.daos.DaoUsuarioFactory;
import com.rawson.app.modelo.dominio.Usuario;
import com.rawson.app.util.HibernateUtil;
import com.rawson.app.util.excepciones.DuplicateInstanceException;
import javax.management.InstanceNotFoundException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hmia
 */
public class UsuarioServicio implements IUsuarioServicio {

    private DaoUsuario usuarioDao = null;
    private Session session = null;

    public UsuarioServicio() {
        usuarioDao = DaoUsuarioFactory.getDao();
        session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    @Override
    public Usuario crearUsuario(Usuario u) throws DuplicateInstanceException {
        Transaction tx = session.beginTransaction();
        try {
            try {
                usuarioDao.buscarPorDni(session, u.getDni());
                throw new DuplicateInstanceException(u.getDni(), Usuario.class.getName());
            } catch (InstanceNotFoundException ex) {
            }

            try {
                usuarioDao.buscarPorEmail(session, u.getEmail());
                throw new DuplicateInstanceException(u.getEmail(), Usuario.class.getName());
            } catch (InstanceNotFoundException ex) {
            }

            try {
                usuarioDao.buscarPorLogin(session, u.getLogin());
                throw new DuplicateInstanceException(u.getLogin(), Usuario.class.getName());
            } catch (InstanceNotFoundException ex) {
            }

            usuarioDao.guardar(session, u);
            tx.commit();
        } catch (HibernateException he) {
            System.out.println("exception: " + he.getMessage());
            tx.rollback();
            throw new RuntimeException(he);
        }
        return u;
    }

    public boolean login(String login, String password) {
        return true;
    }
}
