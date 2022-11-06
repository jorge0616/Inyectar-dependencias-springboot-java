package com.inyeccion.factura;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.inyeccion.factura.model.service.IServicio;
import com.inyeccion.factura.model.service.MiServicioAppConfig;

@Configuration
public class AppConfig {
    
    @Bean("miServicioAppConfig")
    public IServicio iServicio(){
        return new MiServicioAppConfig();
    }

}
