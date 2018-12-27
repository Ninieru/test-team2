/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package modelo.daos.proyecto;


import java.util.List;
import modelo.daos.GenericDao;
import modelo.entidades.Proyecto;
import modelo.excepciones.InstanceException;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**

 @author Arlen
 */

@Repository
public class ProyectoDao extends GenericDao <Proyecto,Integer> implements IProyectoDao
{

    public List<Proyecto> getByParameter(String parameter,String value) throws InstanceException
    {
       return (List<Proyecto>) getSession().createCriteria(Proyecto.class).add(Restrictions.like(parameter,value)).list();
    }
    

    
}
