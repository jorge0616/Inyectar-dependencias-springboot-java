package com.inyeccion.factura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.inyeccion.factura.model.service.MiServicio;

@Controller
public class IndexController {
    
    //Sirve para inyectar un objeto registrado en contenedor de Spring
    @Autowired
    private MiServicio miServicio;

    @GetMapping({"/index","/",""})
    public String index(Model model) {
        model.addAttribute("objeto", miServicio.operacion());
        return "index";
    }

}
