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
            System.out.println("+  1) Saludar (Pérez)     +");
            System.out.println("+  2) Sumar (S.Mamaní)    +"); //agregado por Selene Mamaní
            System.out.println("+  3) Salir del Programa  +");
            System.out.println("+  Ingrese opcion         +");
            System.out.println("+=========================+");
            opcion=scanner.nextInt();
            switch ( opcion) {
                case 1:
                    System.out.println("Hola mundo con GitHub");
                    break;
                case 2:
                    int num1=0 ,num2=0, resultado=0;
                    System.out.println("Ingrese primer numero");
                    num1=scanner.nextInt();
                     System.out.println("Ingrese segundo numero");
                    num2=scanner.nextInt();
                    resultado= num1 + num2;
                    System.out.println("El resultado es: "+resultado);
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
