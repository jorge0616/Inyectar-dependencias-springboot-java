package com.inyeccion.factura.model.service;


import org.springframework.stereotype.Component;

//Esta notación se refiere a que con una sola instancia se puede inyectar en otros componentes
//@Service

//Hace lo mismo que la notación "@Service"
@Component("miServicioC")
//@Primary //permite seleccinar la implemntacion que se va a inyectar por defecto
public class MiServicioComplejo implements IServicio {

    //Esta notación indica que el metodo es implemtacion del padre osea "IServicio"
    @Override
    public String operacion() {
        return "ejecutando algun proceso complejo";
    }

}
    
