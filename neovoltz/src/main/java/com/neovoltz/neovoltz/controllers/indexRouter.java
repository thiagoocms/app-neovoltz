package com.neovoltz.neovoltz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * indexRouter
 */
@Controller
public class indexRouter {
    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index");
        return mv;
    }

    @GetMapping("/login")
    public ModelAndView index2(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/login");
        return mv;
    }

    
}