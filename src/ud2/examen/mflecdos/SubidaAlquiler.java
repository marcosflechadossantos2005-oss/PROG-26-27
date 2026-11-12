package ud2.examen.mflecdos;

import java.util.InputMismatchException;
import java.util.Scanner;

/** @author mflecdos */
public class SubidaAlquiler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double alquiler = 0;
        double precioMaximoReferencia = 0;
        double subidaAlquiler = 0;
        final double PORCENTAJESUBIDA = 0.02;
        boolean iniciar = false;

        iniciar = comprobarDatosEntrada(sc, subidaAlquiler, precioMaximoReferencia);

        if (iniciar == true) {
            subidaAlquiler = subidaAlquiler(alquiler, precioMaximoReferencia, subidaAlquiler, sc, PORCENTAJESUBIDA);

            if (subidaAlquiler == 0) {
                System.out.println("El alquiler no puede subir");
            } else {
                System.out.print("El alquiler subirá: " + String.format("%.2f", subidaAlquiler) + "€");
                double nuevaRenta = alquiler + subidaAlquiler;
                System.out.println("La nueva renta mensual es de: " + String.format("%.2f", nuevaRenta) + "€");
            }
        }
    }

    static double subidaAlquiler(double alquiler, double precioMaximoReferencia, double subidaAlquiler, Scanner sc,
            final double PORCENTAJESUBIDA) {

        if (precioMaximoReferencia < 0 || alquiler < 0) {
            return 0;
        }

        if (alquiler > precioMaximoReferencia) {
            return 0;
        } else {
            subidaAlquiler = alquiler * PORCENTAJESUBIDA;
            alquiler = alquiler + subidaAlquiler;
            if (alquiler > precioMaximoReferencia) {
                return 0;
            }
        }
        return subidaAlquiler;
    }

    static boolean comprobarDatosEntrada(Scanner sc, double alquiler, double precioMaximoReferencia) {
        boolean datosValidos = true;
        try {
            System.out.print("Introduzca su renta actual: ");
            alquiler = sc.nextDouble();
            System.out.print("Introduzca el precio de referencia: ");
            precioMaximoReferencia = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Tipo de dato no válido.");
            System.out.println("Introduzca solo números.");
            datosValidos = false;
        }
        return datosValidos;
    }
}
