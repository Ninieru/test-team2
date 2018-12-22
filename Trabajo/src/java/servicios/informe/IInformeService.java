/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package servicios.informe;

import excepciones.InstanceException;
import java.util.List;
import javax.management.InstanceNotFoundException;
import modelo.Informe;
/**

 @author Fernando
 */
public interface IInformeService {
    public Informe insertarInforme(Informe u) throws InstanceException;
    public void actualizar(Informe u) throws InstanceException;
    public Informe obtenerPorId(int id) throws InstanceNotFoundException;
    public List<Informe> getUsuarios() throws InstanceException;
}
