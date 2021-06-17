package Punto4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SERGIO
 */
public class Menu {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("+====================================+");
            System.out.println("+==========  MENU GITHUB  ===========+");
            System.out.println("+====================================+");
            System.out.println("+  1) Saludar (Pérez)                +");
            System.out.println("+  2) Sumar (S.Mamaní)               +"); //agregado por Selene Mamaní
            System.out.println("+  3) Factorial(N.Mamaní)            +"); //agregado por Noeli Mamani
            System.out.println("+  4) Obtener Cuadrante (Cardozo)    +"); //agregado por Cardozo Franco
            System.out.println("+  5) Calcular el porcentaje (Torrez)+"); //agregado por Torrez Miguel 
            System.out.println("+  6) Salir del Programa             +");
            System.out.println("+  Ingrese opcion                    +");
            System.out.println("+====================================+");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Hola mundo con GitHub");
                    break;
                case 2:
                    int num1 = 0,
                     num2 = 0,
                     resultado = 0;
                    System.out.println("Ingrese primer numero");
                    num1 = scanner.nextInt();
                    System.out.println("Ingrese segundo numero");
                    num2 = scanner.nextInt();
                    resultado = num1 + num2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 3:
                    int n;
                    System.out.println("Ingrese un Numero");
                    n = scanner.nextInt();
                    int i = 1;
                    for (int x = 1; x <= n; x++) {
                        i *= x;
                    }
                    System.out.println("El factorial del numero " + n + " es " + i);
                    break;
                case 4:
                    System.out.println("Ingrese Cordenadas");
                    System.out.print("Valor de x: ");
                    double x = scanner.nextDouble();
                    System.out.print("Valor de y: ");
                    double y = scanner.nextDouble();
                    if (x > 0 && y > 0) {  
                        System.out.println("El punto (" + x + "," + y + ") esta en el primer cuadrante");
                    } else if (x < 0 && y > 0) {   
                        System.out.println("El punto (" + x + "," + y + ") esta en el segundo cuadrante");
                    } else if (x < 0 && y < 0) {
                        System.out.println("El punto (" + x + "," + y + ") esta en el tercer cuadrante");
                    } else if (x > 0 && y < 0) {
                        System.out.println("El punto (" + x + "," + y + ") esta en el cuarto cuadrante");
                    } else {
                        System.out.println("El punto (" + x + "," + y + ") esta en el origen o en uno de los ejes.");
                    }
                    break;
                case 5: //(Torrez Miguel)
                    int total, score;
                    float porcentage;
                    Scanner entrada = new Scanner(System.in);
                    
                    System.out.println("Ingresa el puntaje total, o máximo: ");
                    total = entrada.nextInt();

                    System.out.println("Ingresa el puntaje obtenido: ");
                    score = entrada.nextInt();

                    porcentage = (score * 100 / total);

                    System.out.println("El porcentaje es = " + porcentage + " %");
                    break;
                case 6:
                    System.out.println("Saliendo del Programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }
}
