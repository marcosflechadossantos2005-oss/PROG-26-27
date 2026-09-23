package ud1;

import java.util.Scanner;

/**@author Flecha */

public class SegundosAHoras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de segundos: ");
        int segundos = sc.nextInt();
        sc.close();

        int minutos = segundos / 60;
        segundos = segundos % 60;
        int horas = minutos / 60;
        minutos = minutos % 60;

        System.out.println("Convertido a h:m:s es: " + horas + "h " + minutos + "m " + segundos + "s");

    }
}
