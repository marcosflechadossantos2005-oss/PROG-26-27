package ud1;

import java.util.Scanner;

/** @author Flecha */

public class EcuacionGrado2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Inserta valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Inserta valor de c: ");
        double c = sc.nextDouble();

        sc.close();

        double discriminante = Math.pow(b, 2) - (4 * a * c);

        System.out.println((discriminante >= 0) ? "La ecuación tiene soluciones reales."
                : "La ecuación no tiene soluciones reales.");

        System.out.println((discriminante >= 0) ? "la solucion 1 es " + (-b + Math.sqrt(discriminante)) / (2 * a) : "");
        System.out.println((discriminante >= 0) ? "la solucion 2 es " + (-b - Math.sqrt(discriminante)) / (2 * a) : "");
    }

}