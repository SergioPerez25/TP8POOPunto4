package Punto4;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author SERGIO
 */
public class Menu {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 8) {
            System.out.println("+======================================+");
            System.out.println("+===========  MENU GITHUB  ============+");
            System.out.println("+======================================+");
            System.out.println("+  1) Saludar (Pérez)                  +"); //agregado por Sergio Pérez
            System.out.println("+  2) Sumar (S.Mamaní)                 +"); //agregado por Selene Mamaní
            System.out.println("+  3) Factorial(N.Mamaní)              +"); //agregado por Noeli Mamani
            System.out.println("+  4) Obtener Cuadrante (Cardozo)      +"); //agregado por Cardozo Franco
            System.out.println("+  5) Calcular el porcentaje (Torrez)  +"); //agregado por Torrez Miguel 
            System.out.println("+  6) ORDENAR NUMERO (Farfan)          +");  //agregado por Farfan Yamil
            System.out.println("+  7) Edad (Galan)                     +");  //agregado por Galan Matias 
            System.out.println("+  8) Salir del Programa               +");
            System.out.println("+  Ingrese opcion                      +");
            System.out.println("+======================================+");
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
                    int total,
                     score;
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
                    ordenar();
                    break;
                case 7: //Galan matias
                    edad();
                    break;
                case 8:
                    System.out.println("Saliendo del Programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }
    }

    public static void ordenar() {
        System.out.println("Ingresar valor de A:");
        float a = scanner.nextFloat();
        System.out.println("Ingresar valor de B:");
        float b = scanner.nextFloat();
        System.out.println("Ingresar valor de C:");
        float c = scanner.nextFloat();
        float mayor;
        float menor;
        float medio;
        if (a > b & a > c) {
            mayor = a;
        } else if (b > a & b > c) {
            mayor = b;
        } else {
            mayor = c;
        }
        if (a < b & a < c) {
            menor = a;
        } else if (b < a & b < c) {
            menor = b;
        } else {
            menor = c;
        }
        medio = (a + b + c) - (mayor + menor);
        System.out.println("Valor Mayor: " + mayor);
        System.out.println("Valor Medio: " + medio);
        System.out.println("Valor Menor: " + menor);
    }

    //Galan Matias
    public static int fecha_nac(int dia, int mes, int anio) {
        Calendar inicio = Calendar.getInstance();
        inicio.set(anio, mes - 1, dia);
        Calendar actual = Calendar.getInstance();
        int diferencia = actual.get(Calendar.YEAR) - inicio.get(Calendar.YEAR);
        if (inicio.get(Calendar.DAY_OF_YEAR) > actual.get(Calendar.DAY_OF_YEAR)) {
            diferencia--;
        }
        return diferencia;
    }

    public static void edad() {
        System.out.println("Ingrese Fecha de Nacimiento");
        System.out.print("Digite el Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Digite el Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Digite el Año: ");
        int anio = scanner.nextInt();
        System.out.println("Fecha de Naciemieto: " + dia + "/" + mes + "/" + anio);
        System.out.println("Edad: " + fecha_nac(dia, mes, anio) + " años");
    }
    //-----------------------------------

}
