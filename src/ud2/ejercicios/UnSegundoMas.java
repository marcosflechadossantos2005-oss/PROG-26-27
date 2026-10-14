package ud2.ejercicios;

import java.util.Scanner;

/** @author Flecha */
public class UnSegundoMas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una hora (hh:mm:ss): ");
        int hora = sc.nextInt();
        int min = sc.nextInt();
        int seg = sc.nextInt();
        sc.close();

        if (++seg == 60) {
            seg = 0;
            min++;

            if (min == 60) {
                min = 0;
                hora++;

                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        System.out.printf("Hora incrementada: %02d:%02d:%02d: \n", hora, min, seg);
    }
}
