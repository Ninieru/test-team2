/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */



import java.util.List;
import modelo.daos.IGenericDao;
import modelo.entidades.Proyecto;
import modelo.excepciones.InstanceException;

import org.hibernate.Session;

/**

 @author LUCIA
 */
public interface IProyectoDao extends IGenericDao<Proyecto,Integer>
{
    public List<Proyecto> getByParameter(String parameter, String value) throws InstanceException;
    
}
