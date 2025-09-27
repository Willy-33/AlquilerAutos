package com.mycompany.alquilerautos;

import java.util.Scanner;

public class Menu {
    
    static Scanner scanner = new Scanner(System.in);
    
    static int opcionMenu;
    
    public static void printBienvenida(){
        System.out.println("\n===============================================");
        System.out.println("Bienvenido Al Programa De Alquiler De Autos");
        System.out.println("===============================================\n");
    }
    
    public static void printOpciones(){       
        System.out.println("\n===============================================");
        System.out.println("Seleccione la opcion que desee");
        System.out.println("0) Salir Del Programa");
        System.out.println("1) Registrar Usuario");
        System.out.println("2) Ver Listado De Usuarios");
        System.out.println("3) Ver Datos De Los Usuarios");
        System.out.println("===============================================");
        System.out.print("=> ");
        opcionMenu = scanner.nextInt();
        System.out.println("===============================================\n");
    }
    
    public static void printOpcionInvalida(){
        System.out.println("\n===============================================");
        System.out.println("Elegiste Una Opcion No Valida");
        System.out.println("Por Favor Intentelo Nuevamente");
        System.out.println("===============================================\n");
    }
    
    public static void printOpcion0(){
        System.out.println("\n===============================================");
        System.out.println("Seleccionaste La Opcion 0, Salir Del Programa");
        System.out.println("===============================================");
        System.out.println("Gracias Por Usar El Programa");
        System.out.println("===============================================\n");
    }
    
    public static void printOpcion1(){
        System.out.println("\n===============================================");
        System.out.println("Seleccionaste La Opcion 1, Registrar Usuario");
        System.out.println("===============================================");
    }
    
    public static int pedirIdCliente(){
        System.out.println("Inserte El ID Del Cliente");
        System.out.print("=> ");
        int idCliente = scanner.nextInt();
        scanner.nextLine();
        return idCliente;
    }
    
    public static String pedirNombreCliente(){
        System.out.println("Inserte El Nombre Del Cliente");
        System.out.print("=> ");
        String nombreCliente = scanner.nextLine();
        return nombreCliente;
    }
    
    public static String pedirCorreoCliente(){
        System.out.println("Inserte El Correo Del Cliente");
        System.out.print("=> ");
        String correoCliente = scanner.nextLine();
        System.out.println("===============================================\n");
        return correoCliente;
    }
    
    public static void printOpcion2(){
        System.out.println("\n===============================================");
        System.out.println("Seleccionaste La Opcion 2, Ver Listado Usuarios");
        System.out.println("===============================================");
        for (Cliente cliente : AlquilerAutos.listadoClientes) {
            int noCliente = cliente.getNoCliente();
            String nombre = cliente.getNombre();
            System.out.println(noCliente + ") " + nombre);
        }        
        System.out.println("===============================================\n");
    }
    
    public static void printOpcion3(){
        System.out.println("\n===============================================");
        System.out.println("Seleccionaste La Opcion 3, Ver Datos Usuarios");
        System.out.println("===============================================");
        for (Cliente cliente : AlquilerAutos.listadoClientes) {
            int noCliente = cliente.getNoCliente();
            int id = cliente.getId();
            String nombre = cliente.getNombre();
            String correo = cliente.getCorreo();
            System.out.println("\nNo: " + noCliente);
            System.out.println("Id: " + id);
            System.out.println("Nombre: " + nombre);
            System.out.println("Correo: " + correo + "\n");
        }        
        System.out.println("===============================================\n");
    }
    
}
