package Pruebas;

import java.util.Random;
import java.util.Scanner;

/** @author Flecha */
public class CalculadoraHumana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        final int RESULTADO_MAXIMO = 200;
        int numAleatorio = 0;
        int resultadoUsuario = 0;
        int operando1 = 0;
        int operando2 = 0;
        int resultado = 0;

        mostrarInstrucciones();

        numAleatorio = generarAleatorio(numAleatorio, rnd);
        operando1 = generarAleatorio(numAleatorio, rnd);
        operando2 = generarAleatorio(numAleatorio, rnd);

        generarOperacion(rnd, operando1, operando2);
        resultadoUsuario = pedirResultado(sc, resultadoUsuario);
    }

    static void mostrarInstrucciones() {
        System.out.println("===========================================================");
        System.out.println("||    Escribe el resultado de la operación planteada.    ||");
        System.out.println("||                  En caso de acertar,                  ||");
        System.out.println("||   se planteará otra con el resultado de la anterior   ||");
        System.out.println("||             El juego termina al acertar 7             ||");
        System.out.println("===========================================================");
    }

    static int generarAleatorio(int numAleatorio, Random rnd) {
        numAleatorio = rnd.nextInt(1, 200);
        return numAleatorio;
    }

    static void generarOperacion(Random rnd, int operando1, int operando2) {
        int operador = rnd.nextInt(1, 5);
        switch (operador) {
            case 1:
                if (operando1 + operando2 < 200 && operando1 + operando2 > 0) {
                    System.out.println(operando1 + " + " + operando2);
                }
                break;
            case 2:
                if (operando1 - operando2 < 200 && operando1 - operando2 > 0) {
                    System.out.println(operando1 + " - " + operando2);
                }
                break;
            case 3:
                if (operando1 * operando2 < 200 && operando1 * operando2 > 0) {
                    System.out.println(operando1 + " * " + operando2);
                }
                break;
            case 4:
                if (operando1 / operando2 < 200 && operando1 / operando2 > 0) {
                    System.out.println(operando1 + " / " + operando2);
                }
                break;
            default:
                break;
        }
    }

    static int pedirResultado(Scanner sc, int resultado) {
        System.out.print("Introduce el resultado: ");
        resultado = sc.nextInt();
        return resultado;
    }
}
