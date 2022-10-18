package com.valkcastellani.con.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Valk Castellani
 * @version 1.0
 */
@Controller
public class CardapioController {
    
    @GetMapping("/{siglaCardapio}")
    public ModelAndView cardapio(String siglaCardapio) {
        ModelAndView mv = new ModelAndView();
        return mv;
    }
}
