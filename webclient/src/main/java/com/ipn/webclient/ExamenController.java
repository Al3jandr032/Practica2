/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class ExamenController {
    @RequestMapping(value = "/examen/create", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView createExamen()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/examen/update", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView updateExamen()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/examen/delete", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView deleteExamen()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/examen/list", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView listExamen()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/examen/find", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView findExamen()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
}
