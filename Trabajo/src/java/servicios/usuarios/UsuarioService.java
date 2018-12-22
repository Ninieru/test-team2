package servicios.usuarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import controlador.HibernateUtil;
import daos.Usuario.DaoUsuario;
import daos.singletons.UsuarioSingleton;

import excepciones.InstanceException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.InstanceNotFoundException;
import modelo.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import servicios.usuarios.IUsuarioService;

/**
 *
 * @author LUCIA
 */
public class UsuarioService implements IUsuarioService{

    private DaoUsuario dao = UsuarioSingleton.getDao();
    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    private Transaction t = session.beginTransaction();


    public void insertarUsuario(Usuario u) throws InstanceException{

        boolean dni = dao.getByParameter("dni", u.getDni(),session).size()==1;
        boolean email = dao.getByParameter("email", u.getEmail(),session).size()==1;
        boolean login = dao.getByParameter("login", u.getLogin(),session).size()==1;
        if (dni || email || login) {
            throw new InstanceException();
        }
         dao.save(u,session);
         t.commit();

    }

    public void actualizar(Usuario u) throws InstanceException {

        try {
            dao.update(u, session);
        } catch (HibernateException e) {
            throw new InstanceException();
        }
    }

    public Usuario obtenerPorId(int id) throws InstanceNotFoundException {

        return dao.findbyId(id, session);
    }

    public List<Usuario> getUsuarios() throws InstanceException {

        try {
            return dao.findAll(session);
        } catch (HibernateException e) {
            throw new InstanceException();
        }
    }
}
