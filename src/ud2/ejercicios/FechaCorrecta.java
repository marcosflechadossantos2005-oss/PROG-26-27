package ud2.ejercicios;

import java.util.Scanner;

/** @author Flecha */
public class FechaCorrecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una fecha (dd/mm/aa): ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();
        sc.close();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia >= 1 && dia <= 31) {
                    System.out.println("La fecha: " + dia + "/" + mes + "/" + ano + " es correcta.");
                }
            }
            case 2 -> {
                if (dia >= 1 && dia <= 28) {
                    System.out.println("La fecha: " + dia + "/" + mes + "/" + ano + " es correcta.");
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia >= 1 && dia <= 30) {
                    System.out.println("La fecha: " + dia + "/" + mes + "/" + ano + " es correcta.");
                }
            }
            default ->  System.out.println("Fecha no válida.");
        }
    }
}
