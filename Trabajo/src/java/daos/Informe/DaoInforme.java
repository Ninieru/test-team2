/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package daos.Informe;

import daos.GenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Informe;
import org.hibernate.Session;

import org.hibernate.criterion.Restrictions;
/**

 @author Fernando
 */

public class DaoInforme extends GenericDao <Informe,Integer> implements IDaoInforme{
    @Override
    public List<Informe> getByParameter(String parameter,String value,Session session) throws InstanceException
    {
       return (List<Informe>) session.createCriteria(Informe.class).add(Restrictions.like(parameter,value)).list();
    }
   
}

 


    
