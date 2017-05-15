
package com.ipn.webclient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Al3x
 */
@Controller
public class CalificacionController {
    @RequestMapping(value = "/calificacion/create", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView createCalificacion()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/calificacion/update", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView updateCalificacion()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/calificacion/delete", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView deleteCalificacion()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/calificacion/list", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView listCalificacion()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/calificacion/find", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView findCalificacion()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
}
