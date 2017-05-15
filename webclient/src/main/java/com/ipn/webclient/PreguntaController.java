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
public class PreguntaController {
    @RequestMapping(value = "/pregunta/create", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView createPregunta()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/pregunta/update", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView updatePregunta()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/pregunta/delete", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView deletePregunta()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/pregunta/list", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView listPregunta()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/pregunta/find", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView findPregunta()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
}
