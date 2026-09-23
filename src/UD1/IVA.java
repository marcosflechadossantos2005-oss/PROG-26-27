package ud1;

import java.util.Scanner;

/**@author Flecha */

public class IVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base imponible: ");
        double base = sc.nextDouble();

        System.out.print("Introduce el porcentage del IVA a aplicar: ");
        double iva = sc.nextDouble();
        System.out.println("");

        sc.close();

        double importeIva = (base * (iva / 100));
        double importeTotal = base + importeIva;

        System.out.print("Base imponible: " + base + "€");
        System.out.println("");
        System.out.printf("Importe de IVA: %.2f€ %n", importeIva);
        System.out.println("==================================");
        System.out.printf("Cantidad total a pagar: %.2f€ %n", importeTotal);

    }
}
