package com.mycompany.alquilerautos;

public class Auto {
    
    private int noAuto;
    private String placa;
    private String modelo;
    private String tipo;
    private boolean estado = true;
    
    public Auto(int noAuto, String placa){       
        this.placa = placa;
        this.noAuto = noAuto;
    }

    public int getNoAuto() {
        return noAuto;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getEstado() {
        return estado;
    }   
        
}
