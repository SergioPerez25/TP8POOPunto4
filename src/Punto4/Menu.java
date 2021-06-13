package Punto4;

import java.util.Scanner;

/**
 *
 * @author SERGIO
 */
public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) { 
        int opcion=0;
        while (opcion!= 3) {
            System.out.println("+=========================+");
            System.out.println("+=====  MENU GITHUB  =====+");
            System.out.println("+=========================+");
            System.out.println("+  1) Saludar             +");
            System.out.println("+  2) Tateti              +");
            System.out.println("+  3) Salir del Programa  +");
            System.out.println("+  Ingrese opcion         +");
            System.out.println("+=========================+");
            opcion=scanner.nextInt();
            switch ( opcion) {
                case 1:
                    System.out.println("Hola mundo con GitHub");
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Saliendo del Programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } 
    }  
}
