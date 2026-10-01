package ud1.examen.mflecdos;

import java.util.Scanner;

/** @author Flecha */
public class NotaUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota de la prueba Teórica: ");
        double notaTeoria = sc.nextDouble();
        System.out.print("Introduce la nota de la prueba Práctica: ");
        double notaPractica = sc.nextDouble();
        System.out.print("Introduce la nota del Trabajo en Clase: ");
        double trabajoClase = sc.nextDouble();
        sc.close();

        boolean estaAprobada = (notaPractica >= 5 && notaTeoria >= 5) ? true : false;

        double notaMaxima = (estaAprobada == true)
                ? (trabajoClase > -1) ? (notaTeoria * 0.4) + (notaPractica * 0.6) + (trabajoClase * 0.2) / (1.2)
                        : (notaTeoria * 0.4) + (notaPractica * 0.6)
                : 4;

        System.out.println("La nota de la UD es: " + notaMaxima);
    }
}
