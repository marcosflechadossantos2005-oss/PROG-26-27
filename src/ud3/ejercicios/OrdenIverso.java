package ud3.ejercicios;

import java.util.Arrays;
import java.util.Random;

/** @author Flecha */
public class OrdenIverso {
    public static void main(String[] args) {
        final int LONGITUD = 10;
        final int MAXRANDOM = 100;
        int[] numeros = new int[LONGITUD];
        Random rnd = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(MAXRANDOM) + 1;
        }

        System.out.println(Arrays.toString(numeros));

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i] + " ");
        }

        System.out.println("\nFin del programa");
    }
}
