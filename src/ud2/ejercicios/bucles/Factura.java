package ud2.ejercicios.bucles;

import java.util.Scanner;

/** @author Flecha */
public class Factura {
    public static void main(String[] args) {
        final double IVA = 0.21;
        final double DESCUENTO = 0.05;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad de uds a comprar: ");
        int uds = sc.nextInt();
        System.out.print("Introduce el precio unitario del producto: ");
        double precioUnidad = sc.nextDouble();
        sc.close();

        double importeSinIVA = uds * precioUnidad;
        double importeDelIVA = importeSinIVA * IVA;
        double importeConIVA = importeSinIVA + importeDelIVA;
        double importeTotal = 0;

        if (importeConIVA > 100) {
            importeTotal = importeConIVA - (importeConIVA * DESCUENTO);
            System.out.println("El importe total a pagar es: " + importeTotal);
        } else {
            importeTotal = importeConIVA;
            System.out.println("El importe total a pagar es: " + importeTotal);
        }

    }
}
