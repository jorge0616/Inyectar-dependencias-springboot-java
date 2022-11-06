package com.inyeccion.factura.model.service;

import org.springframework.stereotype.Component;

//Esta notación se refiere a que con una sola instancia se puede inyectar en otros componentes
//@Service

//Hace lo mismo que la notación "@Service"
@Component
public class MiServicio {
    
    public String operacion() {
        return "ejecutando algun proceso";
    }

}
