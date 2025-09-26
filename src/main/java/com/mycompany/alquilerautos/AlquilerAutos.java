package com.mycompany.alquilerautos;

public class AlquilerAutos {

    public static void main(String[] args) {     
        Menu.printBienvenida();
        
        do{
            Menu.printOpciones();
            switch(Menu.opcionMenu){
                case 0:
                    Menu.printOpcion0();
                    break;
                default:
                    Menu.printOpcionInvalida();
                    break;
            }
        }while (Menu.opcionMenu != 0);        
    }
    
}
