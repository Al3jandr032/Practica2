/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.webclient;

import com.ipn.webclient.form.FormBuilder;
import com.ipn.webclient.form.FormInput;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Al3x
 */
@Controller
public class AlumnoController {
    private FormBuilder builder;
    private ArrayList<FormInput> lst;
    
    @RequestMapping(value = "/alumno/create", method = RequestMethod.GET)
    public ModelAndView createAlumno()
    {
        lst = new ArrayList<>();
        builder = new FormBuilder("Crear Usuario");
        ModelAndView model = new ModelAndView("create");
        model.addObject("title", "Create User");
        model.addObject("form", builder.toString());

        return model;
    }
    
    @RequestMapping(value = "/alumno/update", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView updateAlumno()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/alumno/delete", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView deleteAlumno()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/alumno/list", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView listAlumno()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
    
    @RequestMapping(value = "/alumno/find", method = RequestMethod.GET)
    //@ResponseBody
    public ModelAndView findAlumno()
    {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
}
