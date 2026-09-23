package ud1;

import java.util.Scanner;

/** @author Flecha */

public class DistanciaEntreTresPuntos {
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
        
        System.out.print("Introduzca el valor de y2: ");
        double z1 = sc.nextDouble();

        System.out.print("Introduzca el valor de y2: ");
        double z2 = sc.nextDouble();

        sc.close();

        double distanciaXY = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        double distanciaXZ = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((z2 - z1), 2)));

        System.out.println(distanciaXY > distanciaXZ ? "Z está más cerca de X" : "Y está más cerca de X");

    }
}
