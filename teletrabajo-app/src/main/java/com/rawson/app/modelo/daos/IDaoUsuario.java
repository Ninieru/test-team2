/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rawson.app.modelo.daos;

import com.rawson.app.modelo.dominio.Usuario;
import com.rawson.app.modelo.util.IGenericDao;
import javax.management.InstanceNotFoundException;
import org.hibernate.Session;

/**
 *
 * @author hmia
 */
public interface IDaoUsuario extends IGenericDao<Usuario, Integer> {

    Usuario buscarPorDni(Session s, String dni) throws InstanceNotFoundException;

    Usuario buscarPorEmail(Session s, String email) throws InstanceNotFoundException;

    Usuario buscarPorLogin(Session s, String login) throws InstanceNotFoundException;
}
