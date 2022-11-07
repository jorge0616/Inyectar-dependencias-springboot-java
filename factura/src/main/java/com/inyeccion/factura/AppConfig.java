package com.inyeccion.factura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.inyeccion.factura.model.domain.ItemFactura;
import com.inyeccion.factura.model.domain.Producto;
import com.inyeccion.factura.model.service.IServicio;
import com.inyeccion.factura.model.service.MiServicioAppConfig;

@Configuration
public class AppConfig {
    
    @Bean("miServicioAppConfig")
    public IServicio iServicio(){
        return new MiServicioAppConfig();
    }

    @Bean("itemsFactura")
    
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Xiaomi 9t",200);
        Producto producto2 = new Producto("Iphone 11",1000);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);
    
        return Arrays.asList(linea1, linea2);

    }

    @Bean("itemsFacturaOficina")
    @Primary
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Monitor LG",500);
        Producto producto2 = new Producto("Macbook Apple",3000);
        Producto producto3 = new Producto("Impresora EPSON",800);
        Producto producto4 = new Producto("iPad Pro Apple",1000);

        ItemFactura linea1 = new ItemFactura(producto1, 5);
        ItemFactura linea2 = new ItemFactura(producto2, 4);
        ItemFactura linea3 = new ItemFactura(producto3, 8);
        ItemFactura linea4 = new ItemFactura(producto4, 10);
    
        return Arrays.asList(linea1, linea2, linea3, linea4);

    }

}
