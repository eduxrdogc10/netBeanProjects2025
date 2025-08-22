/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.ConexionBD;
import Entidad.Alumno;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



/**
 *
 * @author Garcia
 */
@Controller
public class ControladorAlumno {
    //CREACION DE INSTANCIAS
    ConexionBD con = new ConexionBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.conectar());
    ModelAndView mav = new ModelAndView(); // importar SERVLET
        // Configuración para convertir String -> Date automáticamente
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // mismo formato que <input type="date">
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
    
    //CREACION DE METODO PARA OBTENER LA VISTA DEL FRONT
    @RequestMapping(value = "AltaAlumno.htm", method = RequestMethod.GET)
    
    public ModelAndView vistaAgregar(){
        mav.addObject(new Alumno());
        mav.setViewName("AltaAlumno");
        return mav;
    }
    //Metodo para la accion de agregar
    @RequestMapping(value = "AltaAlumno.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Alumno a){
        System.out.println(a.toString()); // nuevo agregado
        String sql = "insert into alumno values(?,?,?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql, a.getCuenta(),a.getNombre(),a.getPaterno(),a.getMaterno(),
                a.getFechaNac(),a.getCorreo(),a.getCelular(),a.getCodigo());
        return new ModelAndView("redirect:/AltaAlumno.htm");
     
    }
    
}

    

