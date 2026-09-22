package UD1;

import java.util.Scanner;

/** @author Flecha */

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el valor de x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Introduzca el valor de x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Introduzca el valor de y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Introduzca el valor de y2: ");
        double y2 = sc.nextDouble();
        
        sc.close();

        double distancia = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

        System.out.print("La distancia entre los dos puntos es: " + distancia);

    }
}
