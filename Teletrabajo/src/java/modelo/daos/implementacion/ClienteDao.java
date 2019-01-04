package modelo.daos.implementacion;

/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */


import modelo.daos.interfaces.IClienteDao;
import modelo.entidades.Cliente;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Arlen
 */
@Repository
public class ClienteDao extends GenericDao<Cliente, Integer> implements IClienteDao {

}
