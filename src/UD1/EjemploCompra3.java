package UD1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**@author Flecha */

public class EjemploCompra3 {
    public static void main(String[] args) {

        final double IVA = 0.21;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad de objetos: ");
        double cantidadProducto = sc.nextDouble();
        System.out.print("Introduce el precio por unidad: ");
        double precioProducto = sc.nextDouble();

        double importeTotal = precioProducto * cantidadProducto;
        double importeIva = importeTotal * IVA;
        double importeConIva = importeTotal + importeIva;

        sc.close();

        System.out.println("Compra realizada el: " + LocalDate.now() + " a las " + LocalTime.now());
        System.out.printf("Importe total (sin IVA): %.2f euros. %n", importeTotal);
        System.out.println("IVA: " + IVA * 100 + "%");
        System.out.printf("Importe del IVA: %.2f euros. %n", importeIva);
        System.out.printf("Importe total a pagar (con IVA): %.2f euros. %n", importeConIva);   

    }
}
