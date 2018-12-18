/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rawson.app.modelo.servicios;

import com.rawson.app.modelo.dominio.Usuario;
import com.rawson.app.util.excepciones.DuplicateInstanceException;


/**
 *
 * @author hmia
 */
public interface IUsuarioServicio {
    
    Usuario crearUsuario(Usuario u) throws DuplicateInstanceException;
}
