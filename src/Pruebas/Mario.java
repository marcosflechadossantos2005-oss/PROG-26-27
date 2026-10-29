package Pruebas;

import java.util.Scanner;

/** @author Flecha */
public class Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int saltosArriba = 0;
        int saltosAbajo = -1;
        int salto = 0;

        System.out.print("Indica altura: ");
        int altura = sc.nextInt();

        do {
            if (altura == -1) {
                saltosAbajo = 0;
                saltosArriba = 0;
            } else {
                System.out.print("Siguiente salto: ");
                salto = sc.nextInt();
                if (altura > salto) {
                    saltosAbajo++;
                } else if (altura < salto) {
                    saltosArriba++;
                }
                altura = salto;
            }
        } while (altura != -1);
        
        sc.close();

        System.out.println("Hizo " + saltosArriba + " arriba.");
        System.out.println("Hizo " + saltosAbajo + " abajo.");
    }
}
