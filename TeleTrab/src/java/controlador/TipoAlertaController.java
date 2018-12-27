/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.entidades.Tipoalerta;
import modelo.servicios.EntidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author LUCIA
 */
@Controller
public class TipoAlertaController {

    @Autowired
    EntidadesService servicios;

    @RequestMapping(value = "/Prueba", method = RequestMethod.GET)
    public ModelAndView getPrueba() {

        ModelAndView mv = new ModelAndView();
        List<Tipoalerta> lista = servicios.listarTiposAlertas();
        mv.addObject("lista", lista);
        mv.setViewName("prueba");
        return mv;
    }

    @RequestMapping(value = "/Prueba", method = RequestMethod.POST)
    public ModelAndView postPrueba() {

        ModelAndView mv = new ModelAndView();
        List<Tipoalerta> lista = servicios.listarTiposAlertas();
        mv.addObject("lista", lista);
        mv.setViewName("prueba");
        return mv;
    }
}
