/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package modelo.daos.implementacion;


import modelo.daos.GenericDao;
import modelo.daos.interfaces.IProyectoDao;
import modelo.entidades.Proyecto;
import org.springframework.stereotype.Repository;

/**

 @author Arlen
 */

@Repository
public class ProyectoDao extends GenericDao <Proyecto,Integer> implements IProyectoDao
{
   
}
