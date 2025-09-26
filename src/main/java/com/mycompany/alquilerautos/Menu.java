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
    
}
