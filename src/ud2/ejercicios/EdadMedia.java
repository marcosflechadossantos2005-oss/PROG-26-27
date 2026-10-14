package ud2.ejercicios;

import java.util.Scanner;

/** @author FLecha */
public class EdadMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las edadades del alumnado (-1 para terminar): ");

        int sumaEdades = 0;
        int edad = sc.nextInt();

        while (edad != -1) {
            sumaEdades = sumaEdades + edad;
            edad = sc.nextInt();
        }
        sc.close();

        System.out.println("La suma de las edades es: " + sumaEdades);
    }
}
