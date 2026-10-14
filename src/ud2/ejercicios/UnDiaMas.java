package ud2.ejercicios;

import java.util.Scanner;

/** @author Flecha */
public class UnDiaMas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una fecha (dd/mm/aa): ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();
        sc.close();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia + 1 == 32) {
                    mes++;
                    dia = 1;
                    if (mes == 13) {
                        ano++;
                        mes = 1;
                    }
                } else {
                    dia++;
                }
                System.out.println("La fecha un día después sería: " + dia + "/" + mes + "/" + ano);
            }
            case 2 -> {
                if (dia + 1 == 29) {
                    mes++;
                    dia = 1;
                    if (mes == 13) {
                        ano++;
                        mes = 1;
                    }
                } else {
                    dia++;
                }
                System.out.println("La fecha un día después sería: " + dia + "/" + mes + "/" + ano);
            }
            case 4, 6, 9, 11 -> {
                if (dia + 1 == 31) {
                    mes++;
                    dia = 1;
                    if (mes == 13) {
                        ano++;
                        mes = 1;
                    }
                } else {
                    dia++;
                }
                System.out.println("La fecha un día después sería: " + dia + "/" + mes + "/" + ano);
            }
            default ->  System.out.println("Fecha no válida.");
        }
    }
}
