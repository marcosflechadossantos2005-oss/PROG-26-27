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
        System.out.println("");
        comenzarCompra.toLowerCase();

        int cantidad = 0;
        double precioUnidad = 0;
        double importe = 0;
        int numProducto = 1;
        double cambio = 0;

        importe = pedirProductos(sc, comenzarCompra, cantidad, precioUnidad, importe, numProducto);
        

        menuMetodoPago(sc);
        cambio = metodoPago(numProducto, sc, importe, cambio);

        devolverCambio(cambio);
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
            comenzarCompra = sc.next();
            System.out.println("");
            comenzarCompra.toLowerCase();
            numProducto++;
        }
        return importe;
    }

    static int menuMetodoPago(Scanner sc) {
        System.out.println("Elija método de pago: ");
        System.out.println("1.- Efectivo.");
        System.out.println("2.- Tarjeta.");
        int metodoPago = sc.nextInt();
        return metodoPago;
    }

    static double metodoPago(int metodoPago, Scanner sc, double importe, double cambio) {
        switch (metodoPago) {
            case 1:
                System.out.println("El importe a pagar es de: " + importe);
                System.out.print("Introduzca cantidad de pago: ");
                double pagoCliente = sc.nextDouble();

                if (pagoCliente < importe) {
                    System.out.println("Cantidad insuficiente.");
                    System.out.print("Introduzca cantidad de pago: ");
                    pagoCliente = sc.nextDouble();
                } else if (pagoCliente == importe) {
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

    static void devolverCambio(double cambio, double importe) {
        long centimos = (int) (cambio * 100);
        long unidades;

        System.out.println("El cambio a devolver es de: " + (importe - cambio));

        if (centimos >= 10000) {
            unidades = centimos / 10000;
            centimos %= 10000;
            System.out.println(unidades + " billetes de 100€");
        }

        if (centimos >= 5000) {
            unidades = centimos / 5000;
            centimos %= 5000;
            System.out.println(unidades + " billetes de 50€");
        }

        if (centimos >= 2000) {
            unidades = centimos / 2000;
            centimos %= 2000;
            System.out.println(unidades + " billetes de 20€");
        }

        if (centimos >= 500) {
            unidades = centimos / 500;
            centimos %= 500;
            System.out.println(unidades + " billetes de 5€");
        }

        if (centimos >= 200) {
            unidades = centimos / 200;
            centimos %= 200;
            System.out.println(unidades + " monedas de 2€");
        }

        if (centimos >= 100) {
            unidades = centimos / 100;
            centimos %= 100;
            System.out.println(unidades + " monedas de 1€");
        }

        if (centimos >= 50) {
            unidades = centimos / 50;
            centimos %= 50;
            System.out.println(unidades + " monedas de 50 céntimos");
        }

        if (centimos >= 20) {
            unidades = centimos / 20;
            centimos %= 20;
            System.out.println(unidades + " monedas de 20 céntimos");
        }

        if (centimos >= 10) {
            unidades = centimos / 10;
            centimos %= 10;
            System.out.println(unidades + " monedas de 10 céntimos");
        }

        if (centimos >= 5) {
            unidades = centimos / 5;
            centimos %= 5;
            System.out.println(unidades + " monedas de 5 céntimos");
        }

        if (centimos >= 2) {
            unidades = centimos / 2;
            centimos %= 2;
            System.out.println(unidades + " monedas de 2 céntimos");
        }

        if (centimos >= 1) {
            unidades = centimos / 1;
            centimos %= 1;
            System.out.println(unidades + " monedas de 1 céntimos");
        }
    }
}
