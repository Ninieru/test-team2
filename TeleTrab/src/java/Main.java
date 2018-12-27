
import java.util.List;
import java.util.Set;
import javax.management.InstanceNotFoundException;
import modelo.HibernateUtil;
import modelo.daos.tipoAlertaDao.ITipoAlertaDao;
import modelo.daos.tipoAlertaDao.TipoAlertaDao;
import modelo.entidades.Alerta;
import modelo.entidades.Proyecto;
import modelo.entidades.Requisito;
import modelo.entidades.Tipoalerta;
import modelo.servicios.EntidadesService;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
// *
 * @author LUCIA
 */
public class Main {
    
    public static void main(String args[]) throws InstanceNotFoundException{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EntidadesService servicio  =ctx.getBean(EntidadesService.class);
        
        Tipoalerta tipo = new Tipoalerta();
        tipo.setTipoAlerta("pruebaInserccion");
        Tipoalerta alerta =servicio.encontrarPorId(1);
        System.out.println("busqueda:"+alerta.getTipoAlerta());
        alerta.setTipoAlerta("Prueba actualizacion");
//        servicio.actualizarTipoAlerta(tipo);
        List<Tipoalerta> lista =servicio.listarTiposAlertas();
        List<Alerta> listaAlertas = servicio.listarAlertas();
        for(Tipoalerta a: lista)
            System.out.println("nombre: "+a.getTipoAlerta());
        
        List<Requisito> listaP = servicio.listarRequisitos();
        for(Requisito p: listaP){
            Set conjunto =p.getTareas();
            System.out.println("conjunto: "+conjunto.size());
        }
        
        



    }
    
}
