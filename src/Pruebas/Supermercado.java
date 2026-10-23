package Pruebas;

import java.util.Scanner;

/** @author Flecha */
public class Supermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        nombrePrograma();

        System.out.println("Añade productos de forma contínua");
        System.out.println("Para finalizar introduce precio negativo");
        System.out.println("==============================================\n");
        System.out.print("Comenzar compra (s/n): ");
        String comenzarCompra = sc.next();
        comenzarCompra.toLowerCase();

        int cantidad = 0;
        double precioUnidad = 0;
        double importe = 0;
        int numProducto = 1;

        pedirProductos(sc, comenzarCompra, cantidad, precioUnidad, importe, numProducto);

        menuMetodoPago(sc);

    }

    static void nombrePrograma() {
        System.out.println("===========================");
        System.out.println("||                       ||");
        System.out.println("||       Mercadona       ||");
        System.out.println("||   Caja Autoservicio   ||");
        System.out.println("||                       ||");
        System.out.println("===========================\n");
    }

    static double pedirProductos(Scanner sc, String comenzarCompra, int cantidad, double precioUnidad, double importe,
            int numProducto) {
        while (comenzarCompra.equals("s")) {
            System.out.println("----- " + numProducto + " -----");
            System.out.print("Cantidad producto: ");
            cantidad = sc.nextInt();
            System.out.print("Precio x unidad (€): ");
            precioUnidad = sc.nextDouble();
            System.out.println("=============================\n");

            importe += cantidad * precioUnidad;

            System.out.print("Añadir producto (s/n): ");
            comenzarCompra.toLowerCase();
            numProducto++;
        }
        return importe;
    }

    static void menuMetodoPago(Scanner sc) {
        System.out.println("Elija método de pago: ");
        System.out.println("1.- Efectivo.");
        System.out.println("2.- Tarjeta.");
        int metodoPago = sc.nextInt();
    }

    static double metodoPago(int metodoPago, Scanner sc, double importe) {
        double cambio = 0;
        switch (metodoPago) {
            case 1:
                System.out.print("Introduzca la cantidad aportada: ");
                double pagoCliente = sc.nextDouble();

                if (metodoPago < importe) {
                    System.out.println("Cantidad insuficiente, agregue más: ");
                    pagoCliente += sc.nextDouble();
                } else if (metodoPago == importe) {
                    System.out.println("Gracias por su compra, que tenga un buen día.");
                } else if (pagoCliente > importe) {
                    cambio = pagoCliente - importe;
                }
                break;
            case 2:
                System.out.println("Pago realizado con exito.");
                System.out.println("Gracias por su compra, que tenga un buen día.");
                break;
            default:
                break;
        }
        return cambio;
    }

    static void devolverCambio(double cambio) {
        int indice = 0;
        if (cambio >= 100) {
            indice = 1;
        }
    }
}
