package modelo.daos.implementacion;

/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */

import modelo.daos.GenericDao;
import modelo.daos.interfaces.IUsuarioDao;
import modelo.entidades.Usuario;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Arlen
 */

@Repository
public class UsuarioDao extends GenericDao<Usuario, Integer> implements IUsuarioDao {

}
