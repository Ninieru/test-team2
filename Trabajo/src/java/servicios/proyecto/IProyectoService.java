/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package serviciosInterfaces;

import excepciones.DuplicateInstance;
import excepciones.InstanceException;
import java.util.ArrayList;
import modelo.Archivo;
import modelo.Proyecto;
import modelo.Requisito;

/**

 @author Arlen
 */
public interface IProyectoService
{
    public ArrayList<Proyecto> listarProyectos()throws InstanceException;
    public Proyecto obtenerProyectoPorID(int id)throws InstanceException;
    public Proyecto insertarProyecto(Proyecto p)throws InstanceException, DuplicateInstance;
    public void actualizarProyecto(Proyecto p)throws InstanceException,DuplicateInstance;
    public void eliminarProyectoCliente(int id)throws InstanceException;
    public void asignarRequisito(Requisito r)throws InstanceException;
    public void desasignarRequisito(Requisito r)throws InstanceException;
    public void asignarArchivo(Archivo arch)throws InstanceException;
public void desasignarArchivo(Archivo arch)throws InstanceException; 
    
    
    
    
}
