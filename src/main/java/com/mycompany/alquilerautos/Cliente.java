package com.mycompany.alquilerautos;

public class Cliente {
    
    private int noCliente;
    private int id;
    private String nombre;
    private String correo;
    
    public Cliente(int noCliente, int id, String nombre, String correo){
        this.noCliente = noCliente;
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }
    
    public int getNoCliente(){
        return noCliente;         
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCorreo(){
        return correo;
    }   
    
}
