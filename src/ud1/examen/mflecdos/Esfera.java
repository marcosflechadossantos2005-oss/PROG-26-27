package ud1.examen.mflecdos;

import java.util.Scanner;

/** @author Flecha */
public class Esfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor del Radio: ");
        double radio = sc.nextDouble();
        sc.close();

        double area = 4 * Math.PI * Math.pow(radio, 2);
        double volumen = (4 * Math.PI * Math.pow(radio, 3)) / 3;

        System.out.println("El área de la esfera es: " + area);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}
