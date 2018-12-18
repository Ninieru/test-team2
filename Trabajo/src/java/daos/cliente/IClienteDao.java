/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.cliente;

import excepciones.InstanceException;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author LUCIA
 */
public interface IClienteDao {
    
    public List<Cliente> getByParameter(String parameter, String value) throws InstanceException;
}
