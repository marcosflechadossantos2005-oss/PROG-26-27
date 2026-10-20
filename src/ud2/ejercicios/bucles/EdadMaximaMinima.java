package ud2.ejercicios.bucles;

import java.util.Scanner;

/** @author Flecha */
public class EdadMaximaMinima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las edades: (-1 para terminar)");
        int edad = sc.nextInt();

        int edadMax = edad;
        int edadMin = edad;
        while (edad != -1) {
            edadMax = Math.max(edadMax, edad);
            edadMin = Math.min(edadMin, edad);
            edad = sc.nextInt();
        }
        sc.close();

        System.out.println("La edad Máxima es: " + edadMax + " y la edad Mínima es: " + edadMin);
    }
}
