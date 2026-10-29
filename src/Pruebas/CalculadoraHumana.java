package Pruebas;

import java.util.Random;
import java.util.Scanner;

/** @author Flecha */
public class CalculadoraHumana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int numAleatorio = 0;
        int resultado = 0;

        mostrarInstrucciones();

        resultado = pedirResultado(sc, resultado);
        numAleatorio = generarAleatorio(numAleatorio, rnd);
    }

    static void mostrarInstrucciones() {
        System.out.println("===========================================================");
        System.out.println("||    Escribe el resultado de la operación planteada.    ||");
        System.out.println("||                  En caso de acertar,                  ||");
        System.out.println("||   se planteará otra con el resultado de la anterior   ||");
        System.out.println("===========================================================");
    }

    static int generarAleatorio(int numAleatorio, Random rnd) {
        numAleatorio = rnd.nextInt(0, 200);
        return numAleatorio;
    }

    static void generarOperacion(Random rnd) {
        int operacion = 0;
        operacion = rnd.nextInt(1, 5);
        switch (operacion) {
            case 1:
                // suma
                break;
            case 2:
                // resta
                break;
            case 3:
                // multiplicacion
                break;
            case 4:
                // division
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
