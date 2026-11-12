package ud3.ejercicios;

import java.util.Arrays;
import java.util.Random;

/** @author Flecha */
public class Maximo {
    public static void main(String[] args) {
        final int LONGITUD = 10;
        final int MAXRANDOM = 100;
        int[] numeros = new int[LONGITUD];
        Random rnd = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(MAXRANDOM) + 1;
        }

        System.out.println(Arrays.toString(numeros));

        //calcular el máximo
        /*int maximo = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }

        System.out.println("Máximo: " + maximo);*/

        //calcular el máximo y su posición
        int maximo = -1;
        int posicionMaximo = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0 || numeros[i] > maximo) {
                maximo = numeros[i];
                posicionMaximo = i;
            }
        }

        System.out.println("Máximo: " + maximo + " en la posición " + posicionMaximo);
    }
}
