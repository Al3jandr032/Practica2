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
public class CarreraController {
    
    @RequestMapping(value = "/carrera/create", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView createCarrera()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/carrera/update", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView updateCarrera()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/carrera/delete", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView deleteCarrera()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/carrera/list", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView listCarrera()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/carrera/find", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView findCarrera()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
}
