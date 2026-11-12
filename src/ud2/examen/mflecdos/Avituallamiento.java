package ud2.examen.mflecdos;

import java.util.Scanner;

/** @author mflecdos */
public class Avituallamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca las alturas de los puntos: ");
        int alturaInicial = sc.nextInt();

        int siguienteAltura = 0;
        int kilometrosLlanos = 0;
        int longitudRecta = 0;
        int avituallamiento = 0;
        int kilometro = 0;

        while (alturaInicial >= 0) {
            siguienteAltura = sc.nextInt();
            if (alturaInicial == siguienteAltura) {
                longitudRecta++;
                if (longitudRecta == 1) {
                    avituallamiento = kilometro;
                }
            } else {
                kilometrosLlanos = longitudRecta;
            }
            kilometro++;
            alturaInicial = siguienteAltura;
        }
        sc.close();

        System.out.println("Avituallamiento: " + avituallamiento);
        System.out.println("Número de kilómetros llanos: " + kilometrosLlanos);
    }
}
