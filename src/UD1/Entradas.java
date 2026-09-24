package ud1;

import java.util.Scanner;

/** @author Flecha */

public class Entradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica tipo de entrada: ");
        String tipoEntrada = sc.next();
        System.out.println("");

        double precio = 0;
        double importeTotal = 0;

        boolean seguirComprando = true;

        while (seguirComprando == true) {

            if (tipoEntrada.equals("infantil")) {
                precio = 15.80;
                System.out.println("Tipo: Infantil");
                System.out.println("Precio 15,80€");
                System.out.println("=========================");
                System.out.print("Introduzca la cantidad: ");
                int cantidad = sc.nextInt();
                System.out.println("");
                importeTotal += (cantidad * precio);

            } else if (tipoEntrada.equals("adulto")) {
                precio = 20;
                System.out.println("Tipo: Adulto");
                System.out.println("Precio 20€");
                System.out.println("=========================");
                System.out.print("Introduzca la cantidad: ");
                int cantidad = sc.nextInt();
                System.out.println("");
                importeTotal += (cantidad * precio);

            } else {
                System.out.println("Tipo no válido");
            }

            System.out.print("Quiere comprar más entradas s/n: ");
            String comprarMas = sc.next();
            System.out.println("");

            if (comprarMas.equals("s")) {
                seguirComprando = true;
            } else if (comprarMas.equals("n")) {
                seguirComprando = false;
                break;
            } else {
                System.out.println("Opción no válida");
                break;
            }

            System.out.print("Indica tipo de entrada: ");
            tipoEntrada = sc.next();
            System.out.println("");

        }

        if (importeTotal >= 100) {
            double importeConDescuento = importeTotal - (importeTotal * 0.05);
            System.out.printf("El importe total es de: %.2f€ %n", importeTotal);
            System.out.println("Descuento aplicado del: 5%");
            System.out.println("===============================================");
            System.out.printf("Importe final con descuento: %.2f€ %n", importeConDescuento);
        } else {
            System.out.printf("El importe final es de: %.2f€ %n", importeTotal);
        }

        sc.close();
    }
}
