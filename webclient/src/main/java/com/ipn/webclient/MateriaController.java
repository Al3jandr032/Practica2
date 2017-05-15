
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
public class MateriaController {
    
    @RequestMapping(value = "/materia/create", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView createMateria()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/materia/update", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView updateMateria()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/materia/delete", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView deleteMateria()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/materia/list", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView listMateria()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/materia/find", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView findMateria()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
}
