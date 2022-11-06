package com.inyeccion.factura.model.service;

import org.springframework.stereotype.Component;

//Esta notación se refiere a que con una sola instancia se puede inyectar en otros componentes
//@Service

//Hace lo mismo que la notación "@Service"
@Component
public class MiServicio implements IServicio {

    //Esta notación indica que el metodo es implemtacion del padre osea "IServicio"
    @Override
    public String operacion() {
        return "ejecutando algun proceso";
    }

}
    
