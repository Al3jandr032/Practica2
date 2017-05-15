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
public class RespuestaController {
    @RequestMapping(value = "/respuesta/create", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView createRespuesta()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/respuesta/update", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView updateRespuesta()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/respuesta/delete", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView deleteRespuesta()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/respuesta/list", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView listRespuesta()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/respuesta/find", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView findRespuesta()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
}
