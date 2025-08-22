/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.ConexionBD;
import Entidad.Asigntura;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Garcia
 */
@Controller
public class ControladorAsignatura {
    //CREACION DE INSTANCIAS
    ConexionBD con = new ConexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.conectar());
    ModelAndView mav = new ModelAndView(); // importar SERVLET
    
    //CREACION DE METODO PARA OBTENER LA VISTA DEL FRONT
    @RequestMapping(value = "AltaAsignatura.htm", method = RequestMethod.GET)
    
    public ModelAndView vistaAgregar(){
        mav.addObject(new Asigntura());
        mav.setViewName("AltaAsignatura");
        return mav;
    }
    //Metodo para la accion de agregar
    @RequestMapping(value = "AltaAsignatura.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Asigntura a){
        String sql = "insert into asignatura values(?,?,?,?)";
        this.jdbcTemplate.update(sql, a.getClave(),a.getNombre(),a.getCreditos(),a.getHoras());
        return new ModelAndView("redirect:/AltaAsignatura.htm");
    }
    
}
