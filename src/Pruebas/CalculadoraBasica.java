package Pruebas;

import java.util.Scanner;

/**@author Flecha */

public class CalculadoraBasica {
    public static void main(String[] args) {

        System.out.println("Clalculadora básica");

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca dos números para operar: ");
        System.out.println("");
        System.out.print("Primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Segundo número: ");
        double num2 = sc.nextDouble();
        double resutado = 0;

        System.out.print("Indique operación: (s, r, d, m): ");
        String operacion = sc.next();

        sc.close();
        
        switch (operacion) {
            case "s":
                resutado = (num1 + num2);
                System.out.println(num1 + " + " + num2 + " = " + resutado);
                break;

            case "r":
                resutado = (num1 - num2);
                System.out.println(num1 + " - " + num2 + " = " + resutado);
                break;

            case "d":
                resutado = (num1 / num2);
                System.out.println(num1 + " / " + num2 + " = " + resutado);
                break;

            case "m":
                resutado = (num1 * num2);
                System.out.println(num1 + " * " + num2 + " = " + resutado);
                break;

            default:
                break;
        }

    }
}
