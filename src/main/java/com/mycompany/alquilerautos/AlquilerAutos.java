package com.mycompany.alquilerautos;

import java.util.Scanner;

public class AlquilerAutos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcionMenu;
        
        System.out.println("Bienvenido Al Programa De Alquiler De Autos");
        
        do{
            ImpresionMenu.printOpciones();
            opcionMenu = scanner.nextInt();        
        }while (opcionMenu != 0);
        
    }
}
