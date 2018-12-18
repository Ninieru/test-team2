package com.rawson.app;

import com.rawson.app.modelo.dominio.Usuario;
import com.rawson.app.modelo.servicios.UsuarioServicio;
import com.rawson.app.util.excepciones.DuplicateInstanceException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
         try {
            UsuarioServicio uService = new UsuarioServicio();
            Usuario u = new Usuario("heidy", "Y0284979K", "hola", "hmiacatracha_1@gmail.com", "hmiacatracha");
            uService.crearUsuario(u);
            System.out.println("usuario creado");
        } catch (DuplicateInstanceException ex) {
            System.out.println("usuario error =>" + ex.getMessage());
        }
        //Usuario u = new Usuario("heidy", "10294877K", "HOLA", "hmiacatracha@gmail.com", "hmiacatracha");
    }    
}
