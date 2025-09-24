package com.mycompany.alquilerautos;
      
import java.time.LocalDate;

public class Factura {
    
    int noFactura;
    Cliente cliente;
    Auto auto;
    LocalDate fechaRetiro;
    LocalDate fechaDevolucion;
    
    public Factura(int noFactura, Cliente cliente, Auto auto, LocalDate fechaRetiro, LocalDate fechaDevolucion){
        this.noFactura = noFactura;
        this.cliente = cliente;
        this.auto = auto;
        this.fechaRetiro = fechaRetiro;
        this.fechaDevolucion = fechaDevolucion;    
    }
    
}
