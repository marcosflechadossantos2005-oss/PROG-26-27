package ud1.examen.mflecdos;

import java.util.Scanner;

/** @author Flecha */
public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor del lado 1: ");
        double ladoUno = sc.nextDouble();
        System.out.print("Introduce el valor del lado 2: ");
        double ladoDos = sc.nextDouble();
        System.out.print("Introduce el valor del lado 3: ");
        double ladoTres = sc.nextDouble();
        sc.close();

        String tipo = (ladoUno == ladoDos && ladoUno == ladoTres) ? "equilátero"
                : (ladoUno != ladoDos && ladoUno != ladoTres && ladoDos != ladoTres) ? "escaleno"
                        : (ladoUno == ladoDos || ladoUno == ladoTres || ladoDos == ladoTres) ? "isósceles"
                                : "desconocido";

        System.out.println("Es un triángulo " + tipo);
    }
}
