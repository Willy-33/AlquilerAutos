package com.mycompany.alquilerautos;
      
import java.time.LocalDate;

public class Factura {
    
    private int noFactura;
    private Cliente cliente;
    private Auto auto;
    private LocalDate fechaRetiro;
    private LocalDate fechaDevolucion;
    
    public Factura(int noFactura, Cliente cliente, Auto auto, LocalDate fechaRetiro, LocalDate fechaDevolucion){
        this.noFactura = noFactura;
        this.cliente = cliente;
        this.auto = auto;
        this.fechaRetiro = fechaRetiro;
        this.fechaDevolucion = fechaDevolucion;    
    }

    public int getNoFactura() {
        return noFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Auto getAuto() {
        return auto;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }   
             
}
