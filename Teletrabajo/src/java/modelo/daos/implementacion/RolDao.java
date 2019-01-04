/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */

import modelo.daos.implementacion.GenericDao;
import modelo.daos.interfaces.IRolDao;
import modelo.entidades.Rol;
import org.springframework.stereotype.Repository;

/**

 @author Arlen
 */
@Repository
public class RolDao extends GenericDao <Rol,Integer> implements IRolDao
{   
    
}
