package ud1;

import java.util.Scanner;

/** @author Flecha */

public class CelsiusAFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        sc.close();

        double farenheit = celsius * (9 / 5) + 32;

        System.out.println(celsius + " Celsius son " + farenheit + "farenheit.");
    }
}
