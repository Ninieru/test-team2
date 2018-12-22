/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.alerta;

import controlador.HibernateUtil;
import daos.Usuario.DaoUsuario;
import daos.alerta.DaoAlerta;
import daos.singletons.AlertaSingleton;
import daos.singletons.UsuarioSingleton;
import excepciones.InstanceException;
import modelo.Alerta;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LUCIA
 */
public class AlertaService {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    private Transaction t = session.beginTransaction();
    private DaoAlerta dao = AlertaSingleton.getDao();

    public void insertarAlerta(Alerta alerta) throws InstanceException {
        try {
             dao.save(alerta,session);
        } catch (HibernateException e) {
            throw new InstanceException();
        }
    }
}
