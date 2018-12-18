/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import daos.GenericDao;
import daos.Usuario.DaoUsuario;

import daos.singletons.UsuarioSingleton;
import excepciones.DuplicateInstance;
import excepciones.InstanceException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.InstanceNotFoundException;
import modelo.Alerta;
import modelo.Cliente;
import modelo.Proyecto;
import modelo.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import servicios.cliente.ClienteService;
import servicios.proyecto.ProyectoService;

/**
 *
 * @author LUCIA
 */
public class Main {

    public static void main(String args[]) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        try {

            //        HibernateUtil.getSessionFactory();
            Usuario u = new Usuario();

            u.setDni(
                    "88888888Y");
            u.setEmail(
                    "cccc@gmail.com");
            u.setLogin(
                    "logi");
            u.setNombre(
                    "passwddd");
            u.setPassword(
                    "11001111");
            ClienteService servicioC = new ClienteService(session, t);
            Cliente cliente = new Cliente();

            cliente.setCif(
                    "C77777777");
            cliente.setNombre(
                    "ClienteTercero");

            Proyecto p = new Proyecto();
            Cliente clienteDos = new ClienteService(session, t).getByCIF("A99999999");

            p.setCliente(clienteDos);// como cliente
            Date d1 = new Date(2018, 12, 10);
            Timestamp t1 = new Timestamp(d1.getTime());
            Date d2 = new Date(2018, 12, 28);
            Timestamp t2 = new Timestamp(d2.getTime());
            Date d3 = new Date(2018, 05, 01);
            Timestamp t3 = new Timestamp(d3.getTime());
            Date d4 = new Date(2018, 01, 24);
            Timestamp t4 = new Timestamp(d4.getTime());

            p.setEstado(
                    true);
            p.setFfp(new Date());

            p.setFfr(new Date());

            p.setFip(new Date());

            p.setFir(new Date());


            p.setNombre(
                    "PROYECTO2");
            ProyectoService ser = new ProyectoService(session, t);
               ser.insertarProyecto(p);
//            Proyecto pp = new ProyectoService(session,t).obtenerPorId(1);
//            System.out.println("proyecto; "+ pp.getNombre());
//            ser.insertarProyecto(p);
        } catch (InstanceException ex) {
            Logger.getLogger(Main.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }
}
