/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package daos.Informe;

/**

 @author Fernando
 */

import daos.IGenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Informe;
import org.hibernate.Session;



/**
 *
 * @author LUCIA
 */
public interface IDaoInforme extends IGenericDao<Informe,Integer>{
    public List<Informe> getByParameter(String parameter, String value, Session session) throws InstanceException;
    
}