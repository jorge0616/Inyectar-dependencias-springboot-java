package com.inyeccion.factura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.inyeccion.factura.model.service.IServicio;

@Controller
public class IndexController {

    // Sirve para inyectar un objeto registrado en contenedor de Spring
    // Se puede inyectar mediante contructor o metodo set
    @Autowired
    // @Qualifier se usa para llamar al metodo por defecto de la clase y tiene mayor peso que la notación @Primary
    private IServicio iServicio;

    @GetMapping({ "/index", "/", "" })
    public String index(Model model) {
        model.addAttribute("objeto", iServicio.operacion());
        return "index";
    }

    public void setiServicio(IServicio iServicio) {
        this.iServicio = iServicio;
    }

}
