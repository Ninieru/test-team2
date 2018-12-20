/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.alerta;

import excepciones.InstanceException;
import modelo.Alerta;

/**
 *
 * @author LUCIA
 */
public interface IAlertaService {
    
    public void insertarAlerta(Alerta alerta) throws InstanceException;
}
