package ud2.ejercicios;

import java.util.Scanner;

/** @author Flecha */
public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número (introduce 0 para parar): ");
        int num = sc.nextInt();

        while (num != 0) {

            if (num % 2 == 0) {
                System.out.println("El número es PAR.");
            } else {
                System.out.println("El número es IMPAR.");
            }

            if (num > 0) {
                System.out.println("El número es POSITIVO.");
            } else {
                System.out.println("El número es NEGATIVO.");
            }

            System.out.println("El cuadrado del número " + num + " es: " + Math.pow(num, 2));
            System.out.println("");

            System.out.print("Introduce un número (introduce 0 para parar): ");
            num = sc.nextInt();
        }
        sc.close();
    }
}
