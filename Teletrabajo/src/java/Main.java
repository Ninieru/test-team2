
import java.util.List;
import javax.management.InstanceNotFoundException;
import modelo.entidades.Prioridad;
import modelo.entidades.Tipoalerta;
import modelo.entidades.Usuario;
import modelo.excepciones.InstanceException;
import modelo.servicios.EntidadesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUCIA
 */
public class Main {
    
    public static void main(String args[]) throws InstanceNotFoundException, InstanceException{
    
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EntidadesService servicio = ctx.getBean(EntidadesService.class);
       Tipoalerta a = servicio.encontrarPorId(1);
       Prioridad p = servicio.obtenerPrioridadNombre("lala");
       Usuario usu = servicio.obtenerUsuarioId(1);
        System.out.println(usu.getDni());
    }
}
