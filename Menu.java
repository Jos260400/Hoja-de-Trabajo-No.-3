
package com.company;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        int opcion;
        Scanner S = new Scanner(System.in);
        do{
            System.out.println("Menú de Sorts");
            System.out.println("1. Merge");
            System.out.println("2. Quick");
            System.out.println("3. Insertion");
            System.out.println("4. Radix");
            System.out.println("5. Gnome");
            System.out.println("6. Salir");
            System.out.println("Elije una de las opciones: ");
            opcion = S.nextInt();
        }while(opcion>6);
        switch(opcion){
            case 1:
                System.out.println("Merge");
                break;
            case 2:
                System.out.println("Quick");
                break;
            case 3:
                System.out.println("Insertion");
                break;
            case 4:
                System.out.println("Radix");
                break;
            case 5:
                System.out.println("Gnome");
                break;
            case 6:
                System.out.println("Usted ha salido del programa");
                break;
        }
    }
}
