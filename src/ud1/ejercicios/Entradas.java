package ud1.ejercicios;

import java.util.Scanner;

/** @author Flecha */

public class Entradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrada Infantil: 15,80€");
        System.out.print("Introduzca cantidad: ");
        int cantidadInfantil = sc.nextInt();
        double precioInfantil = 15.80;

        System.out.println("Entrada Adulto: 20€");
        System.out.print("Introduzca cantidad: ");
        int cantidadAdulto = sc.nextInt();
        double precioAdulto = 20;

        sc.close();

        double importe = (cantidadInfantil * precioInfantil) + (cantidadAdulto * precioAdulto);
        double descuento = 0.05;
        boolean hayDescuento = (importe >= 100);
        double importeDescuento = importe * 0.05;

        System.out.println(hayDescuento == true ? "Descuento: " + (descuento * 100) + "%" : "");
        System.out.println(hayDescuento == true ? "Importe descontado: " + importeDescuento + "€" : "");
        System.out.println(hayDescuento == true ? "Importe TOTAL: " + String.format("%.2f",importe - importeDescuento) + "€" : "Importe TOTAL: " + importe);

    }
}
