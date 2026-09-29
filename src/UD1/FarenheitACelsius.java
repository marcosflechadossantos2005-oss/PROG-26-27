package ud1;

import java.util.Scanner;

/** @author Flecha */

public class FarenheitACelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce temperatura en grados Farenheit: ");
        double farenheit = sc.nextDouble();

        sc.close();

        double celsius = (5.0 / 9) * (farenheit - 32);

        System.out.println(farenheit + " Farenheit son " + String.format("%.1f", celsius) + " Celsius.");
    }
}
