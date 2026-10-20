package ud2.ejercicios.bucles;

import java.util.Scanner;

/** @author Flecha */
public class EntradasConcierto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double DESCUENTO = 0.25;
        double precioEntrada = 200;
        double dineroRecaudado = 0;

        System.out.print("Introduce el aforo máximo del local: ");
        int maxAforo = sc.nextInt();
        System.out.print("Introduce el número de entradas vendidas: ");
        int entradasVendidas = sc.nextInt();
        sc.close();

        if (entradasVendidas > (maxAforo * 0.5)) {
            dineroRecaudado = entradasVendidas * precioEntrada;
            System.out.println("Se han recaudado: " + String.format("%.2f", dineroRecaudado) + "€");
        } else if (entradasVendidas <= (maxAforo * 0.5) && entradasVendidas > (maxAforo * 0.2)) {
            precioEntrada = precioEntrada - (precioEntrada * DESCUENTO);
            dineroRecaudado = precioEntrada * entradasVendidas;
            System.out.println("Se han recaudado: " + String.format("%.2f", dineroRecaudado) + "€");
        } else if (entradasVendidas <= (maxAforo * 0.2)) {
            System.out.println("Ventas insuficientes, se cancela el concierto.");
        }
    }
}
