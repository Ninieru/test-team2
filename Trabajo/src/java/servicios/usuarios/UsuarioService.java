package servicios.usuarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import controlador.HibernateUtil;
import daos.Usuario.DaoUsuario;
import daos.singletons.UsuarioSingleton;
import excepciones.DuplicateInstance;
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

    protected Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    protected Transaction t = session.beginTransaction();
    private DaoUsuario dao = UsuarioSingleton.getDao(session, t);


    public Usuario insertarUsuario(Usuario u) throws DuplicateInstance, InstanceException {

        boolean dni = dao.getByParameter("dni", u.getDni());
        boolean email = dao.getByParameter("email", u.getEmail());
        boolean login = dao.getByParameter("login", u.getLogin());
        if (dni || email || login) {
            throw new InstanceException();
        }
        return dao.save(u);

    }

    public void actualizar(Usuario u) throws InstanceException {

        try {
            dao.update(u);
        } catch (HibernateException e) {
            throw new InstanceException();
        }
    }

    public Usuario obtenerPorId(int id) throws InstanceNotFoundException {

        return dao.findbyId(id);
    }

    public List<Usuario> getUsuarios() throws InstanceException {

        try {
            return dao.findAll();
        } catch (HibernateException e) {
            throw new InstanceException();
        }
    }
}
