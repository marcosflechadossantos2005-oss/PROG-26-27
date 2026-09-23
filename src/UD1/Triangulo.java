package ud1;

import java.util.Scanner;

/** @author Flecha */

public class Triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        double b = sc.nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        double h = sc.nextDouble();
        sc.close();

        double area = (b * h) / 2;

        System.out.printf("El área del triángulo es: %.2f %n", area);
    }
}
