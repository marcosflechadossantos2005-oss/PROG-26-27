package ud1;

import java.util.Scanner;

/** @author Flecha */

public class FarenheitACelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce temperatura en grados Celsius: ");
        double farenheit = sc.nextDouble();

        sc.close();

        double celsius = (5 / 9) * (farenheit - 32);

        System.out.println(farenheit + " Farenheit son " + celsius + "Celsius.");
    }
}
