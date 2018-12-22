/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.alerta;

import daos.IGenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Alerta;
import modelo.Usuario;
import org.hibernate.Session;

/**
 *
 * @author LUCIA
 */
public interface IDaoAlerta extends IGenericDao<Alerta,Integer>{
    public List<Alerta> getByParameter(String parameter, String value, Session session) throws InstanceException;
    
}
