package ud1;

import java.util.Scanner;

/**@author Flecha */

public class HorasASegundos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de Horas, Minutos y Segundos: ");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();

        sc.close();

        int segundosTotales = (horas * 3600) + (minutos * 60) + segundos;

        System.out.println("Los segundos totales son: " + segundosTotales);
    }
}
