package com.mycompany.alquilerautos;

import java.util.ArrayList;

public class AlquilerAutos {
    
    public static ArrayList<Cliente> listadoClientes = new ArrayList<>();
    
    public static void main(String[] args) {     
        Menu.printBienvenida();
        
        do{
            Menu.printOpciones();
            switch(Menu.opcionMenu){
                case 0:
                    Menu.printOpcion0();
                    break;
                case 1:
                    Menu.printOpcion1();
                    int noCliente = listadoClientes.size() + 1;
                    int id = Menu.pedirIdCliente();
                    String nombre = Menu.pedirNombreCliente();
                    String correo = Menu.pedirCorreoCliente();
                    Cliente nuevoCliente = new Cliente(noCliente, id, nombre, correo);
                    listadoClientes.add(nuevoCliente);
                    break;
                case 2:
                    Menu.printOpcion2();
                    break;
                case 3:
                    Menu.printOpcion3();
                    break;
                default:
                    Menu.printOpcionInvalida();
                    break;
            }
        }while (Menu.opcionMenu != 0);        
    }
    
}
