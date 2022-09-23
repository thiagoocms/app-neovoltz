package com.neovoltz.neovoltz.controllers.routers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @GetMapping("/home")
    public ModelAndView index2( Model model){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home/index_2");
       
        return mv;
    }

    
    

    
}